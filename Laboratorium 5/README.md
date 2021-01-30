![PHPUnit](./img/logo.png)
# PHPUnit 

## Framework do testów jednostkowych dla języka programowania PHP. Jest członkiem rodziny frameworków xUnit wywodzącej się z pakietu SUnit stworzonego przez Kenta Becka. PHPUnit jest rozwijany przez Sebastiana Bergmanna.

### Spis treści
* [Zasada pracy](#zasada-pracy)
* [Organizacja testów](#organizacja-testów)
* [Możliwości](#możliwości)
* [Instalacja](#instalacja)
* [Przykład](#przykład)
* [Żródło](#żródła)

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
Instalacja PHPUnit poprzez Composer jest bardzo prosta
```
composer require --dev phpunit/phpunit ^8
```
Globalna instalacja dla systemów Windows wygląda następująco:

* Stworz folder dla plików PHP np: “C:\bin”
* Dodaj ścieżke ;C:bin w twoich zmiennych środowiskowych(PATH)
* Sciągnij PHAR i zapisz go w swoim nowo utworzonym folderze C:\bin\phpunit.phar
* Otwórz terminal i wpisz następujące komendy:
```
C:\Users\username cd C:\bin
C:\bin> echo @php "%~dp0phpunit.phar" %* > phpunit.cmd
C:\bin> exit
```
* Możesz sprawdzić czy instalacja przebiegła pomyślnie po wpisaniu do konsoli:
```
C:\Users\username phpunit --version
```

### Przykład

Przykład dostępny w katalogu [przyklad](https://github.com/wszwszwsz/TAU/tree/main/Laboratorium%205/przyklad) 


## Żródła
[wikipedia](https://pl.wikipedia.org/wiki/PHPUnit)
[instalacja](https://www.w3resource.com/php/PHPUnit/installation-of-php-unit.php)

### Created by Wojtek.
![avatar](./img/avatar.png)
