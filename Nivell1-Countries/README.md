# IT-Academy-S1.03-Java Collections-Nivel1

### Exercisi 3: Countries

Donat el fitxer countries.txt que conté països i capitals. El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.

### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell1-Countries

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:  

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 3
Es crea un hashmap a on s'afegeixen totes les lineas del fitxer countries.txt (country com a key i capital com a valor).
S'utilitza Random per obtenir 10 countries.
Després es va interant sobre la llista de countries per preguntar a l'usuari per la seva capital, es compara amb la capital obtinguda del hashMap i es suma scores si es necessari.
Finalment, s'afegeix una nova linea "Nom: score" al document scores.txt. (I es crea si encara no existeix el fitxer de text).

