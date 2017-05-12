# CO2CalculatorKata

Lo scopo del Kata è di calcolare la produzione di CO2 corrispondente ad un viaggio aereo.

Esporre una classe chiamata CalcolaImprontaCo2 con un metodo calculate.
Il metodo prenderà in input la distanza da percorrere e restituirà la produzione di CO2.

* Fornendo al metodo una distanza in chilometri voglio ricevere la produzione di CO2 corrispondente ad un viaggio aereo in chilogrammi.
Effettuare il calcolo considerando che il consumo di CO2 per passeggero per miglio: 0.254 kg (1 miglio è pari a 1.60934 Km) e il numero medio di passeggeri di un volo aereo è 80.
  Esempi:

  - per 100 Km un valore di CO2 pari a 1262.6294 Kg
  - per 200 Km un valore di CO2 pari a 2525.2588 Kg

* Per indicare distanze ampie voglio poter fornire la distanza utilizzando l'abbreviazione K per le migliaia, ad esempio passando come input '10K' voglio ricevere la quantità di CO2 consumata per un viaggio di 10,000 km.

* Voglio poter indicare l'unità di misura in cui è espressa la distanza, ad esempio '600 miglia'. Se nessuna unità di misura è indicata l'input viene interpretato come in km.

* Se l'unità di misura è miglia, voglio che la quantità di CO2 prodotta venga restituita secondo il sistema imperiale invece di quello internazionale (pound invece di kilogrammi).

* Se indico una distanza superiore a 5000 kilometri, il coefficiente utilizzato per calcolare la produzione di CO2 dovrà essere di 0.144 kg per passeggero per miglia.

* Se indico una distanza superiore a 6000 kilometri, il numero di passeggeri medio da contare sull'aereo deve passare da 80 a 150.
