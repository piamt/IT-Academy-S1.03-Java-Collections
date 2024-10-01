# IT-Academy-S1.03-Java Collections-Nivel1

### Exercisi 1: Months

Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.

Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.

Recorre la llista amb un for i amb un iterador.


### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell1-Months

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:  

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 1
He creat la classe Month amb un enum estatic pels mesos. Aquest s'enmagatzema en un atribut final (constant) perquè no volem que es modifiqui. Afegim iterativament tots els mesos al ArrayList excepte agost, que l'afegim mes tard a l'index 6, provant que els ArrayList mantenen l'ordre.  

Després he creat un HashSet a partir del ArrayList i he provat diferents coses: afegir un objecte nou, afegir un duplicat, afegir un objecte null.

Per últim, he creat un iterator a partir del ArrayList i un altre a partir del HashSet i he llistat les elements.