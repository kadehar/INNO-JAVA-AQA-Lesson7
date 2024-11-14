package com.github.kadehar.inno.lesson7.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.kadehar.inno.lesson7.player.Player;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class PlayerServiceJSON extends BasePlayerService {

    private static final Path JSON_FILE_PATH = Path.of("src/main/resources/players.json");
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    List<Player> readFromFile() {
        try {
            return MAPPER.readerForListOf(Player.class).readValue(JSON_FILE_PATH.toFile());
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    void saveToFile() {
        try {
            MAPPER.writerWithDefaultPrettyPrinter().writeValue(JSON_FILE_PATH.toFile(), players.getPlayers());
        } catch (IOException e) {
            System.out.println("Cannot write to file");
        }
    }
}
