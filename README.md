# devqa-io-test

Ссылка на сайт - https://devqa.io/selenium-css-selectors/

testTitle - тест на проверку заголовка на сайте

## Структура

+ BaseConfig - интерфейс с общими параметрами для любого типа запуска
+ RunTypeConfig - интерфейс с параметром удаленного запуска, тянет значения из конфиг файлов local.properties и
  remote.properties
+ TestBase - класс, в котором настраивается весь проект. По параметру runType задается будет ли тест запущен локально ("
  local") или удаленно ("remote")