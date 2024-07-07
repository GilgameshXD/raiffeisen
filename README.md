# Автоматизированное тестирование

## Установка зависимостей

### 1. Для запуска тестов необходимо иметь JDK и Gradle.
Для проверки наличия JDK используйте команду:
```
java -version
```
Установить актуальную версию JDK можно с [официального сайта](https://www.oracle.com/java/technologies/downloads/#java11)

Для проверки наличия Gradle используйте команду:
```
gradle -v
```
Установить актуальную версию Gradle можно с [официального сайта](https://gradle.org/releases/)

### 2. Для запуска так же потребуется актуальная версия браузера Google Chrome

Google Chrome потребуется для работы ChromeDriver в нашем тесте

## Запуск теста

Первым делом мы должны запуллить/скачать тест себе на компьютер. При этом, желательно, что бы директория содержала только латиницу.

### На Windows:

1. Откройте PowerShell:  
Его можно найти через поисковую строку в Windows


2. Используйте команду cd для перехода в директорию с вашим проектом. Выглядеть должно так cd путь/к/тесту. Мой вариант:
```
cd E:\raiffeisen
```


3. Запустите тесты с помощью Gradle. В командной строке выполните команду:
```
./gradlew test --tests "duckduckgo.KeyWordSearchTest"
```
для первого теста и
```
./gradlew test --tests "httpCat.ApiTest"
```
для второго соответственно

### На macOS и Linux:

1. Откройте терминал:

Комбинация для Linux Ctrl+Alt+T.  
Комбинация для mac OS Command-N

2. Используйте команду cd для перехода в директорию с вашим проектом. Выглядеть должно так cd путь/к/тесту. Мой вариант:
```
cd E:\raiffeisen
```

3. Запустите тесты с помощью Gradle. В командной строке выполните команду:
```
./gradlew test --tests "duckduckgo.KeyWordSearchTest"
```
для первого теста и
```
./gradlew test --tests "httpCat.ApiTest"
```

## Запуск теста(альтернативный способ)

Тест можно открыть в помощью IntelliJ IDEA

### Шаг 1: Установите IntelliJ IDEA

1. **Скачайте и установите IntelliJ IDEA:**
    - Перейдите на сайт [JetBrains](https://www.jetbrains.com/idea/download/) и скачайте IntelliJ IDEA Community Edition.
    - Установите IntelliJ IDEA, следуя инструкциям установщика.

### Шаг 2: Клонируйте проект с GitHub

1. **Установите Git:**
    - Перейдите на сайт [Git](https://git-scm.com/) и скачайте установочный файл для вашей операционной системы.
    - Установите Git, следуя инструкциям установщика.

2. **Клонируйте репозиторий:**
    - Откройте терминал (командную строку) на вашем компьютере.
    - Выполните команду, чтобы клонировать репозиторий:
      ```bash
      git clone https://github.com/GilgameshXD/raiffeisen
      ```
    - Это создаст папку с проектом на вашем компьютере.

### Шаг 3: Откройте проект в IntelliJ IDEA

1. **Запустите IntelliJ IDEA.**

2. **Откройте проект:**
    - На начальном экране выберите "Open".
    - Перейдите в директорию, куда вы клонировали репозиторий, и выберите эту папку.
    - Нажмите "OK".

3. **Импортируйте проект:**
    - IntelliJ IDEA автоматически обнаружит, что это проект на Gradle, и предложит его импортировать. Нажмите "Import Gradle Project".
    - Дождитесь, пока IntelliJ IDEA закончит настройку проекта и загрузку всех необходимых зависимостей.

### Шаг 4: Запуск тестов

1. **Откройте панель "Project" слева.**
    - Перейдите в `ssrc/test/java/duckduckgo/KeyWordSearchTest.java` или `src/test/java/httpCat/ApiTest.java`.
    - Дважды щелкните на `KeyWordSearchTest.java` или `ApiTest.java`, чтобы открыть файл с тестами.

2. **Запустите тесты:**
    - В открытом файле `KeyWordSearchTest.java` или `ApiTest.java` найдите иконку зеленого треугольника рядом с объявлением класса или методами тестов.
    - Нажмите на этот зеленый треугольник и выберите "Run `KeyWordSearchTest.java` или `ApiTest.java`.
    - IntelliJ IDEA запустит тесты и покажет результаты в нижней части экрана в панели "Run".