CREATE TABLE Slownik(grupa varchar(255),
                        podgrupa varchar(255),
                        rodz varchar(255),
                        typ varchar(255),
                        opis varchar(500),
                        nr_odpadu int);

CREATE TABLE Dostawcy(nr_klienta int,
                        miejscowosc varchar(255),
                        ulica varchar(255),
                        nazwa_skrocona varchar(255));

create table Magazynw(nr_karty varchar(255),
                        data_w varchar(255),
                        masa double,
                        jedn varchar(255),
                        firma varchar(255),
                        nr_klienta int,
                        nr_magazynu int);

create table Magazynp(nr_karty varchar(255),
                        data_d varchar(255),
                        masa double,
                        jedn varchar(255),
                        firma varchar(255),
                        nr_magazynu int,
                        nr_odpadu int,
                        nr_klienta int);