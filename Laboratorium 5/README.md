![PHPUnit](./img/logo.png)
#             PHPUnit 

## Framework do testów jednostkowych dla języka programowania PHP. Jest członkiem rodziny frameworków xUnit wywodzącej się z pakietu SUnit stworzonego przez Kenta Becka. PHPUnit jest rozwijany przez Sebastiana Bergmanna.

### Spis treści
* [Zasada pracy](#zasada-pracy)
* [Organizacja testów](#organizacja-testów)
* [Możliwości](#możliwości)
* [Instalacja](#instalacja)
* [Przykład](#przykład)
* [Żródło](#żródło)

### Zasada pracy
PHPUnit służy do automatycznego testowania oprogramowania napisanego w języku PHP przy pomocy testów jednostkowych. Programiści tworzący aplikację przygotowują zestaw testów jednostkowych sprawdzających, czy poszczególne komponenty aplikacji działają zgodnie z oczekiwaniami. PHPUnit wykonuje po kolei wszystkie testy i po zebraniu wszystkich wyników, przedstawia programiście raport o ilości zaliczonych testów. Dodatkowo, zawiera on szczegółowe informacje o nieprawidłowych wynikach oraz błędach wykonania.

PHPUnit umożliwia szybkie przetestowanie całej aplikacji bądź też wybranej jej części, co ułatwia rozwój oraz zarządzanie nią. Programiści mogą na bieżąco sprawdzać, czy wprowadzane przez nich zmiany nie powodują problemów w zupełnie innym miejscu, które normalnie byłyby trudne do zauważenia.

### Organizacja testów
PHPUnit posiada obiektową budowę. Pojedynczy test reprezentowany jest przez metodę testNazwaTestu() w klasie dziedziczącej po PHPUnit_Framework_TestCase. Klasa ta tworzy tzw. zestaw testów (test suite), wyposażony w dodatkowe metody setUp() i tearDown(), które są wykonywane bezpośrednio przed i po wykonaniu testu. Ich zadaniem jest stworzenie środowiska, w którym będzie wykonywany każdy test z zestawu. Kontrola wyników testów wykonywana jest przez zestaw metod assert(), które porównują uzyskany wynik ze wzorcem.

Zestaw testów może również przyłączać inne zestawy testów, co umożliwia organizowanie testów w hierarchiczną strukturę przypominającą drzewo.

### Możliwości

PHPUnit oferuje programiście następujące możliwości:

* Narzędzia do tworzenia testów jednostkowych i organizowania ich w hierarchiczne zestawy.
* Interfejs linii komend do wykonywania testów
* Dostawcy danych (ang. data providers) – generatory zestawów danych dla testów pozwalające sprawdzić, jak pojedynczy test zachowuje się dla różnych danych wejściowych.
* Wsparcie dla testowania kodu korzystającego z baz danych.
* Możliwość testowania wyjątków.
* Wsparcie dla atrap obiektów (ang. mock objects)
* Generator raportów
* Generator raportów pokrycia kodu (wymaga XDebug)
* Współpraca z narzędziem Selenium RC do testowania interfejsów użytkownika

### Instalacja
 lorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impus
 lorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impus
 ```
$ cd ../lorem
$ npm install
$ npm start
```
 lorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impus
### Przykład

lorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem 
```
$ cd ../lorem
$ npm install
$ npm start
```

impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impuslorem impus


## Żródło
This app is inspired by Rando Kim book „Time of Your Life”
and Android app tutorial by [@eericon](https://www.eericon.github.io/post/timer-android)
