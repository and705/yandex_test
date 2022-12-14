# yandex_test
Пробный контест

### A. Камни и украшения [тестовая задача]  
Ограничение времени	1 секунда  
Ограничение памяти	64Mb  
Ввод	стандартный ввод или input.txt  
Вывод	стандартный вывод или output.txt  
Даны две строки строчных латинских символов: строка J и строка S. Символы, входящие в строку J, — «драгоценности», входящие в строку S — «камни».  
Нужно определить, какое количество символов из S одновременно являются «драгоценностями». Проще говоря, нужно проверить, какое количество символов  
из S входит в J.  
  
##### Формат ввода  
На двух первых строках входного файла содержатся две строки строчных латинских символов: строка J и строка S. Длина каждой не превосходит 100 символов.  
##### Формат вывода  
Выходной файл должен содержать единственное число — количество камней, являющихся драгоценностями.  
##### Пример  
Ввод  	
ab  
aabbccd  
Вывод  
4  
  
### B. Последовательно идущие единицы  
Ограничение времени	1 секунда  
Ограничение памяти	64Mb  
Ввод	стандартный ввод или input.txt  
Вывод	стандартный вывод или output.txt  
Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.  

Желательно получить решение, работающее за линейное время и при этом проходящее по входному массиву только один раз.  

##### Формат ввода  
Первая строка входного файла содержит одно число n, n ≤ 10000. Каждая из следующих n строк содержит ровно одно число — очередной элемент массива.  

##### Формат вывода  
Выходной файл должен содержать единственное число — длину самой длинной последовательности единиц во входном массиве.  

##### Пример  
Ввод	  
5  
1  
0  
1  
0  
1  
Вывод  
1  
  
### C. Удаление дубликатов  

Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить из него все повторения.  

Желательно получить решение, которое не считывает входной файл целиком в память, т.е., использует лишь константный объем памяти в процессе работы.  

##### Input format  
Первая строка входного файла содержит единственное число n, n ≤ 1000000.  

На следующих n строк расположены числа — элементы массива, по одному на строку. Числа отсортированы по неубыванию.  

##### Output format  
Выходной файл должен содержать следующие в порядке возрастания уникальные элементы входного массива.  

##### Sample 1  
Input 	
5  
2  
4  
8  
8  
8  
Output   
2  
4  
8  
##### Sample 2  
Input   	
5  
2  
2  
2  
8  
8  
Output  
2  
8  

### D. Генерация скобочных последовательностей  
Ограничение времени	1 секунда  
Ограничение памяти	20Mb  
Ввод	стандартный ввод или input.txt  
Вывод	стандартный вывод или output.txt  
Дано целое число n. Требуется вывести все правильные скобочные последовательности длины 2 ⋅ n, упорядоченные лексикографически  
(см. https://ru.wikipedia.org/wiki/Лексикографический_порядок).  

В задаче используются только круглые скобки.  

Желательно получить решение, которое работает за время, пропорциональное общему количеству правильных скобочных последовательностей  
в ответе, и при этом использует объём памяти, пропорциональный n.  

##### Формат ввода  
Единственная строка входного файла содержит целое число n, 0 ≤ n ≤ 11  

##### Формат вывода  
Выходной файл содержит сгенерированные правильные скобочные последовательности, упорядоченные лексикографически.  

##### Пример 1  
Ввод  
2  
Вывод  
(())  
()()  
##### Пример 2
Ввод  
3  
Вывод  
((()))  
(()())  
(())()  
()(())  
()()()  
  
### E. Анаграммы  
Ограничение времени	1 секунда  
Ограничение памяти	20Mb  
Ввод	стандартный ввод или input.txt  
Вывод	стандартный вывод или output.txt  
Даны две строки, состоящие из строчных латинских букв. Требуется определить, являются ли эти строки анаграммами, т. е. отличаются ли они только  
порядком следования символов.  

### Формат ввода  
Входной файл содержит две строки строчных латинских символов, каждая не длиннее 100 000 символов. Строки разделяются символом перевода строки.  

### Формат вывода  
Выходной файл должен содержать единицу, если строки являются анаграммами, и ноль в противном случае.  

### Пример 1  
Ввод  
qiu
iuq
Вывод
1  
### Пример 2  
Ввод  
zprl  
zprc  
Вывод  
0  

