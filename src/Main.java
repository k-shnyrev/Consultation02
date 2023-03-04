import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
  public static void main(String[] args) throws IOException {
    // сверху вниз - от общей идеи к конкретной реализации - требует опыта, но на собеседовании
    // будет очень большим плюсом -- как раз покажет наличие опыта
    // сразу пишете main, как будто у вас уже есть все нужные методы
    // когда пишете, тогда и выясняете, а какие методы вам понадобятся
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    Map<String, String> cities = readCities(bufferedReader);

    // продолжит читать из того же bufferedReader
    List<String> request = readRequest(bufferedReader);
    bufferedReader.close();

    // для базы городов cities и запроса request напечатает ответ
    printResponse(cities, request);
  }

  public static void printResponse(Map<String, String> cities, List<String> request) {
    // TODO найти и напечатать ответ
  }

  // прочитает запрос - города, для которых надо найти страны
  public static List<String> readRequest(BufferedReader bufferedReader) {
    // здесь нельзя создавать BufferedReader - при создании он читает файл "с начала",
    // а мне может потребоваться продолжать читать уже открытый файл
    // значит, он должен прийти "снаружи", как аргумент вызова
    List<String> request = new ArrayList<>();
    // TODO чтение входных данных
    return request;
  }

  // прочитает входные данные - базу городов
  public static Map<String, String> readCities(BufferedReader bufferedReader) {
    // здесь нельзя создавать BufferedReader - при создании он читает файл "с начала",
    // а мне может потребоваться продолжать читать уже открытый файл
    // значит, он должен прийти "снаружи", как аргумент вызова
    Map<String, String> cities = new HashMap<>();
    // TODO чтение входных данных
    return cities;
  }
}
