### III. Couverture de code

Soit le résultat suivant d’un test de couverture de code :

![image](https://github.com/user-attachments/assets/ac3c8f7f-4f9f-4641-95c1-1dc7ce771455)

- Comment interpréter ce résultat ?
  - Le test de mult() n'a pas été executer car cov = 0%.
  - Pour le reste c'est bon ils ont été éxécuter car le covering est à 100%.
  - Le test de branche sur div() a bien fait le test de la division par 0.
  - on le voit dans les détail après le seul à tout rater c'est mult.
  -Au total 83% des instructions ont été couvert correct mais il faut une amélioration. 
- Que faut-il faire pour améliorer ce résultat ?
  - On pourrait ajouter un test pour mult() pour passe de 0 à 100%
  - Et on peut vérifier si les exeptions sont testé et et vérifier pour des valeurs qui pourrait causer problèmes comme 0, les flottants long ou négatifs
