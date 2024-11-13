# Домашнее задание к уроку 6

### Работа с файлами. Пишем в файл, читаем из файла. Парсеры. Работа с XML, JSON.

### Задания

##### 1. Сервис игроков (JSON)

- Создайте класс `Player`. [Скопируйте](https://github.com/EreminD/course-27.12/blob/main/src/main/java/ru/inno/course/basics/fs/hw/Player.java)
- Создайте класс `PlayerServiceJSON`. Класс должен имплементировать методы интерфейса `PlayerService` [ссылка](https://github.com/EreminD/course-27.12/blob/main/src/main/java/ru/inno/course/basics/fs/hw/PlayerService.java)
- Программа должна сохранять свое состояние в файл формата JSON
- Все изменения коллекции сохраняются в файл (файл перезаписывается)
- Создайте класс `TestClass`. В нем метод `psvm` [пример](https://github.com/EreminD/course-27.12/blob/main/src/main/java/ru/inno/course/basics/fs/hw/TestClass.java)
- В методе создайте экземпляр класса `PlayerService service = new PlayerServiceJSON();`
- Протестируйте методы сервиса. Убедитесь, что все изменения сохраняются (или удаляются) в файле

##### 2. СО ЗВЕЗДОЧКОЙ. Сервис игроков (XML)

- Все то же самое, только создайте класс `PlayerServiceXML`.
- "Черный ящик" (логика) вся та же `PlayerService service = new PlayerServiceXML();`
