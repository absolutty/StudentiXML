# StudentiXML
Vytvoril Adam Hajro.

Aplikácia číta súbor kt. obsahuje výpis známok hodnotenia predmetov, kt. má študium zapísané v konkrétnom
akademickom roku a semestri.

Jednotlivé recordy (študenti) sú pri načítavaní uchovávaní v HashMape, čo zaručí takmer instatný prístup k inštancií
daného študenta ak budeme vyhľadávať na základe jeho ID.

Po načítaní sú dané dáta ukladané do .xml súboru (súbor má názov id studenta), kt. je formátovaní podla priloženeho 
XSD schémy.

Pri nesprávnom formátovaní dátumov je zabezpečené vypisovanie chybného výstupu do súboru errors-log.txt