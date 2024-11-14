package com.github.kadehar.inno.lesson7.service;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.kadehar.inno.lesson7.player.Player;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class PlayerServiceXML extends BasePlayerService {

    private static final Path XML_FILE_PATH = Path.of("src/main/resources/players.xml");
    private static final XmlMapper MAPPER = XmlMapper.builder()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .build();

    @Override
    List<Player> readFromFile() {
        try {
            JavaType type = MAPPER.getTypeFactory().constructCollectionType(List.class, Player.class);
            return MAPPER.readValue(XML_FILE_PATH.toFile(), type);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    void saveToFile() {
        try {
            MAPPER.writeValue(XML_FILE_PATH.toFile(), players);
        } catch (IOException e) {
            System.out.println("Cannot write data to XML file");
        }
    }
}
