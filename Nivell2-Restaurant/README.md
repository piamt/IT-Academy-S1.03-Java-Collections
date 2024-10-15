# IT-Academy-S1.03-Collections-Nivel2

### Exercici: Restaurant

#### Exercici 1:

Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.

#### Exercici 2:

Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes de la classe Restaurant estiguin ordenats per nom i per puntuació en ordre descendent.

### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell2-Restaurant

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercici 1
Per poder evitar duplicats, és necessari implementar equals i hasCode.

### Notes Exercici 2
Per poder ordenar els elements, és necessari implementar compareTo. He ordenat per nom alfabèticament i, en cas de tenir el mateix nom, de major a menor score.
