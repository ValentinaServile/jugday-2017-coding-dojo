
# User Stories

## Calcolare l'impronta di CO2 per un viaggio aereo

 * Come utente fornendo una distanza in chilometri voglio ricevere la produzione di CO2 corrispondente ad un viaggio aereo in chilogrammi.
 Prendendo i valori riportati nella nota in fondo si avrà:
     - per 100 Km un valore di CO2 pari a 1262.6294 Kg
     - per 200 Km un valore di CO2 pari a 2525.2588 Kg

 * Come utente per indicare distanze ampie voglio poter fornire la distanza utilizzando l'abbreviazione K per le migliaia, ad esempio:

    calcolaImprontaCo2 10K

    -> restituisce la quantità di CO2 prodotta da un viaggio aereo di 10 mila chilometri

 * Come utente vorrei poter indicare l'unità di misura in cui è espressa la distanza, ad esempio:

    calcolaImprontaCo2 600 miglia

    -> restituisce la quantità di CO2 prodotta da un viaggio aereo di 600 miglia.

    Se non viene indicata nessuna unità di misura la distanza è in chilometri.
    In caso si utilizzino le miglia, la quantità di CO2 deve essere calcolata secondo il sistema imperiale e non quello
    internazionale.

 * Come utente se indico una distanza superiore a 5000 chilometri, il coefficiente utilizzato per calcolare la produzione
   di CO2, dovrà variare a 0.144 kg per passeggero per miglia.

 * Come utente se indico una distanza superiore a 6000 chilometri il numero di passeggeri da contare sull'aereo passa da
   80 a 150.

# Note

Consumo di CO2 per passeggero per miglio: 0.254 kg (1 miglio è pari a 1.60934 Km)

Il numero medio di passeggeri di un volo aereo è 80.

