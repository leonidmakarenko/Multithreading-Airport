# Multithreading-Airport
multithreading task solution

#Завдання:

# Пасажирів, прибувших на трьох (чотирьох, п’яти) літаках одночасно, розвозять мікроавтобуси. 
 Завантаженість літаків – рівно 100 пасажирів. Мікроавтобуси мають місткість 6, або 7, або 8 пасажирів
 і їдуть до 4 різних міст. Завантаженість мікроавтобусів повинна бути 100%, за винятком мікроавтобусів
 з останніми пасажирами. Пасажири їдуть сім’ями від 1 до 4 осіб. Розділяти сім’ї по мікроавтобусах не можна.
Зробити синхронну багатопотокову систему.
Kласи.
class Family{
String name; // twoLetters “aa”, “ab”, …, “zz” – for example
String travelTo; // 4 cities – “Kalush”, “Kosiv”, “Galych”, “Kolomiya”
int count; // family members count, from 1 to 4 members
}
class Plane{
List<Family> families; // exactly 100 family members
}
class Bus{
int passengersCount; // 6 or 7 or 8
String driveTo; // 4 cities – “Kalush”, “Kosiv”, “Galych”, “Kolomiya”
} 
