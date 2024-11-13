package com.github.kadehar.inno.lesson7;

import com.github.kadehar.inno.lesson7.service.PlayerService;
import com.github.kadehar.inno.lesson7.service.PlayerServiceJSON;
import com.github.kadehar.inno.lesson7.service.PlayerServiceXML;

public class TestClass {
    public static void main(String[] args) {
        testJSONFormat();
        System.out.println();
        textXMLFormat();
    }

    private static void testJSONFormat() {
        PlayerService playerService = new PlayerServiceJSON();
        // 1. Создаём новых пользователей и выводим всех на экран
        int firstPlayerId = playerService.createPlayer("number_ONE!!");
        int secondPlayerId = playerService.createPlayer("bigB0$$");
        int thirdPlayerId = playerService.createPlayer("Gummy_Be@r");
        playerService.getPlayers().forEach(System.out::println);
        System.out.println();
        // 2. Ищем конкретного пользователя в списке по его id
        System.out.println(playerService.getPlayerById(firstPlayerId));
        System.out.println(playerService.getPlayerById(secondPlayerId));
        System.out.println(playerService.getPlayerById(thirdPlayerId));
        System.out.println();
        // 3. Добавляем каждому пользователю очков и выводим список на экран
        playerService.addPoints(firstPlayerId, 300);
        playerService.addPoints(secondPlayerId, 40);
        playerService.addPoints(thirdPlayerId, 756);
        playerService.getPlayers().forEach(System.out::println);
        System.out.println();
        // 4. Удаляем пользователя с id = 2 и выводим остальных на экран
        playerService.deletePlayer(secondPlayerId);
        playerService.getPlayers().forEach(System.out::println);
    }

    private static void textXMLFormat() {
        PlayerService playerService = new PlayerServiceXML();
        // 1. Создаём новых пользователей и выводим всех на экран
        int firstPlayerId = playerService.createPlayer("number_ONE!!");
        int secondPlayerId = playerService.createPlayer("bigB0$$");
        int thirdPlayerId = playerService.createPlayer("Gummy_Be@r");
        playerService.getPlayers().forEach(System.out::println);
        System.out.println();
        // 2. Ищем конкретного пользователя в списке по его id
        System.out.println(playerService.getPlayerById(firstPlayerId));
        System.out.println(playerService.getPlayerById(secondPlayerId));
        System.out.println(playerService.getPlayerById(thirdPlayerId));
        System.out.println();
        // 3. Добавляем каждому пользователю очков и выводим список на экран
        playerService.addPoints(firstPlayerId, 300);
        playerService.addPoints(secondPlayerId, 40);
        playerService.addPoints(thirdPlayerId, 756);
        playerService.getPlayers().forEach(System.out::println);
        System.out.println();
        // 4. Удаляем пользователя с id = 2 и выводим остальных на экран
        playerService.deletePlayer(secondPlayerId);
        playerService.getPlayers().forEach(System.out::println);
    }
}
