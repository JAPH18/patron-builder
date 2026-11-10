# Patron de construction : Builder

Devoir n°1 – Patrons de construction (INF461).

| Package | Contenu |
|---|---|
| `builder.cours` | Exemple du cours (p.61-68) : fabrication des pizzas Reine et Piquante |
| `builder.modifie` | Exemple modifié : ajout d'une 3e pizza **Végétarienne** (`MonteurPizzaVegetarienne`) |

Les diagrammes de classe (PlantUML + PNG) sont dans [`diagrammes/`](diagrammes/).

## Exécution

```bash
mvn compile
java -cp target/classes builder.cours.Client
java -cp target/classes builder.modifie.Client
```
