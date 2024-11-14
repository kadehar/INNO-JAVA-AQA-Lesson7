package com.github.kadehar.inno.lesson7;

import com.github.kadehar.inno.lesson7.service.PlayerService;
import com.github.kadehar.inno.lesson7.service.PlayerServiceJSON;

public class TestClassJSON {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerServiceJSON();
        // 1. Создаём новых пользователей и выводим всех на экран
        System.out.println("1. [JSON] Create new players and print them");
        int firstPlayerId = playerService.createPlayer("number_ONE!!");
        int secondPlayerId = playerService.createPlayer("bigB0$$");
        int thirdPlayerId = playerService.createPlayer("Gummy_Be@r");
        playerService.getPlayers().forEach(System.out::println);
        System.out.println();
        // 2. Ищем конкретного пользователя в списке по его id
        System.out.println("2. [JSON] Find player by id and print");
        System.out.println(playerService.getPlayerById(firstPlayerId));
        System.out.println(playerService.getPlayerById(secondPlayerId));
        System.out.println(playerService.getPlayerById(thirdPlayerId));
        System.out.println();
        // 3. Добавляем каждому пользователю очков и выводим список на экран
        System.out.println("3. [JSON] Add points to each player and print players");
        playerService.addPoints(firstPlayerId, 300);
        playerService.addPoints(secondPlayerId, 40);
        playerService.addPoints(thirdPlayerId, 756);
        playerService.getPlayers().forEach(System.out::println);
        System.out.println();
        // 4. Удаляем пользователя с id = 2 и выводим остальных на экран
        System.out.println("4. [JSON] Delete player with id = 2 and print other players");
        playerService.deletePlayer(secondPlayerId);
        playerService.getPlayers().forEach(System.out::println);
    }
}
