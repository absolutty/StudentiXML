# StudentiXML
Vytvoril Adam Hajro.

Aplikácia číta súbor kt. obsahuje výpis známok hodnotenia predmetov, kt. má študium zapísané v konkrétnom
akademickom roku a semestri.

Jednotlivé recordy (študenti) sú pri načítavaní uchovávaní v HashMape, čo zaručí takmer instatný prístup k inštancií
daného študenta ak budeme vyhľadávať na základe jeho ID.

Po načítaní sú dané dáta ukladané do .xml súboru (súbor má názov id studenta), kt. je formátovaní podla priloženeho 
XSD schémy.

Pri nesprávnom formátovaní dátumov je zabezpečené vypisovanie chybného výstupu do súboru errors-log.txt

```xml
<record>
    <student>
        <id>S1419020048</id>
        <name>Denisa</name>
        <surname>Tyvoľská</surname>
    </student>
    <study>
        <id>S1419020048-5819T01</id>
        <field_code>4276</field_code>
        <field>ošetrovateľstvo</field>
        ...
    </study>
</record>
```