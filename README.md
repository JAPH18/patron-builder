# Patron de construction : Builder

Devoir n°1 – Patrons de construction (INF461).

| Package | Contenu |
|---|---|
| `exemple.model` | Exemple du cours (p.61-68) : fabrication des pizzas Reine et Piquante |
| `exemple.model.modifie` | Exemple modifié : ajout d'une 3e pizza **Végétarienne** (`MonteurPizzaVegetarienne`) |


## Exécution

```bash
mvn compile
java -cp target/classes exemple.model.Client
java -cp target/classes exemple.model.modifie.Client
```
