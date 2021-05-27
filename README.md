# SI_LAB2_193059


Втора лабораториска вежба по Софтверско Инженерство на Мила Додевска, 193059

![image](https://user-images.githubusercontent.com/79879040/119867505-40156480-bf1e-11eb-8080-34b775fbe37c.png)
Цикломатска комплексност на овој код е 8, според формулите:
C(x)= R, каде бројот на региони е 8
C(x)= E-V+2, Е=32 ребра, V= 26 темиња 
C(x)= P+1, каде бројот на предикатни јазли е 7

Тест случаи според критериумот multiple condition:
Според multiple condition критериумот има 2^n тест случаи каде n е бројот на различни логички изрази. Во кодот на функцијата function има 11 уникатни булови изрази и тоа:
1.	if (hr < 0 || hr > 24) 
TX
FT
FF
2.	if (min < 0 || min > 59)
TX
FT
FF
3.	if (sec >= 0 && sec <= 59)
TT
TF
FX
4.	if (hr == 24 && min == 0 && sec == 0)
TTT
TTF
TFX
FXX
Значи, имаме вкупно 211 комбинации за тест случаеви што треба да ги испитаме.
![image](https://user-images.githubusercontent.com/79879040/119867677-6fc46c80-bf1e-11eb-8428-a5227724db8d.png)

![image](https://user-images.githubusercontent.com/79879040/119867714-79e66b00-bf1e-11eb-964e-5d98936d0808.png)


