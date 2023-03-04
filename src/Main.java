import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  // уже готовый репозиторий - зачем и как
  // инструкция в теории к уроку 34
  // GitHub с файлами -- для удобства, готовые файлы оттуда можно скачать на компьютер
  // и продолжить "с этого места"

  // задачи с шахматами - один шаг на соседнюю клетку меняет координату на +/- 1
  // List<List<Integer>> для хранения клеток доски

  // подходы к решению задач +++
  // снизу вверх - от частного решения к общему с постепенным усложнением
  //  был в уроке 34 в последовательности коммитов

  // сверху вниз - от общей идеи к конкретной реализации - требует опыта, но на собеседовании
  // будет очень большим плюсом -- как раз покажет наличие опыта
  // Map
  // Map - remove, removeAll, clear

  // Условие
  // Дан список стран и городов каждой страны. Затем даны названия городов.
  // Для каждого города укажите, в какой стране он находится.

  // Пример входных данных:
  // 2
  // Russia Moscow Petersburg Novgorod
  // Germany Berlin Munich Hamburg
  // 3
  // Moscow
  // Munich
  // Novgorod

  // Пример выходных данных
  // Russia
  // Germany
  // Russia

  // Два варианта Map:
  // Map<String, List<String>> - страна: список городов
  // Map<String, String> - город: страна
  public static void main(String[] args) {
    // будет метод readCities() для чтения входных данных
    Map<String, String> cities = readCities();

    // прочитает запрос - города, для которых надо найти страны
    List<String> request = readRequest();

    // для базы городов cities и запроса request напечатает ответ
    printResponse(cities, request);
  }

  public static void printResponse(Map<String, String> cities, List<String> request) {
    // TODO найти и напечатать ответ
  }

  public static List<String> readRequest() {
    List<String> request = new ArrayList<>();
    // TODO чтение входных данных
    return request;
  }

  public static Map<String, String> readCities() {
    Map<String, String> cities = new HashMap<>();
    // TODO чтение входных данных
    return cities;
  }
}
