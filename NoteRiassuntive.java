/**
* myJavaGuide
*/

Informazioni varie imparate su JAVA in ECLIPSE, mio promemoria personale.

Ci sono alcune cose ostiche, non che siano complicate, ma semplicemente se
te le spiegano sono più chiare, facili e prontamente disponibili.


WindowBuilder
- Ad esempio "WindowBuilder" è un pluging gratuito per ECLIPSE che aggiunge
il supporto alla creazione di pagine grafiche in JAVA. Ovviamente per
arrivare a questo bisogna prima avere qualche altra conoscenza.

Al seguente link si trova un video esplicativo completo

https://www.youtube.com/watch?v=7HChmKwOUzw

Dopo aver creato la GUI con WindowBuilder, nella finestra del codice sorgente,
in basso, si vedono due TABS, "Source" e "Design" e cliccandoli si cambia
prespective per passare da una modalità all'altra.

ECLIPSE
- Anch'esso gratuito, è il punto di appoggio per sviluppare in molti
linguaggi ma probabilmente JAVA è quello più famoso, forse il primo.

JAVA
- Ecco qui il linguaggio di alto livello orientato agli oggetti. La sintassi
ha varie cose in comune al C ma non è per nulla permissivo. Vi sono molti
siti che lo spiegano in dettaglio quindi qui evito.

Per usare JAVA bisogna avere un testo sorgente con estensione.java che
viene compilato e tradotto in "bytecode" ossia linguaggio eseguibile da
JVM (Java Virtual Machine) che rappresenta un ambiente virtuale disponibile
su varie piattaforme come Windows, MAC, LINUX per citare le principali.
Dentro ad ECLIPSE la compilazione avviene in modo trasparente e possiamo
eseguire in debug (passo passo) il programma osservando il contenuto delle
variabili e mettendo dei break point.

JAVADOC
- Una volta imparato a scrivere in JAVA con i suoi concetti, le sue classi,
possiamo introdurre il concetto di JAVADOC ossia documentazione automatizzata.
Si tratta di un plugin già compreso in ECLIPSE che partendo dai commenti
nel testo JAVA produce i files HTML di documentazione con uno stile unificato.
Ovviamente funziona dopo che i commenti sono stati scritti seguendone le regoline.

GRAFICA
- Per la parte grafica bisogna approfondire un pochino per capire quello che
è disponibile evitando di inventare l'acqua calda. E qui scopriamo che di
base esistono le librerie AWT e SWING per la rappresentazione di pulsanti
etichette eccetera. Inoltre abbiamo anche gli eventi associabili. Infine,
non necessariamente connessi alla grafica, ci sono anche timer e task.

DEPLOY
- Rilasciare un programma finito è forse la cosa principale che serve, altrimenti
  cosa si programma a fare. In Ecliplse questo si ottiene in modo semplice
  anche se dietro c'è un mondo di dettagli. Nel README iniziale ci sono le istruzioni.

