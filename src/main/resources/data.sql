
INSERT INTO slownik(grupa, podgrupa, rodz, typ, opis, nr_odpadu)
SELECT GR, PODGR, RODZ, TYP, OPIS, NR_ODPADU
FROM CSVREAD('classpath:Slownik.csv');

Insert into dostawcy(nr_klienta, miejscowosc, ulica, nazwa_skrocona)
select NR_KLIENTA,MIEJSCOWOSC,ULICA,NAZWA_SKROCONA
from csvread('classpath:Dostawcy.csv');

Insert into magazynp(nr_karty,data_d,masa,jedn,firma,nr_magazynu,nr_odpadu, nr_klienta)
select NRKARTY,DATAD,MASA,JEDN,FIRMA,NR_MAG,NR_ODPADU,NR_KLIENTA
from csvread('classpath:Magazynp.csv');

Insert into magazynw(nr_karty,data_w,masa,jedn,firma,nr_klienta,nr_magazynu)
select NRKARTY,DATAW,MASA,JEDN,FIRMA,NR_KLIENTA,NR_MAGW
from csvread('classpath:Magazynw.csv');
