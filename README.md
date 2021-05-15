# Implementation Deterministic Finite Automata (DFA) in Java

Case Study : Create a DFA that will accept a sentence with the expression: a, a0, a01 aa, aa0, aa01

Deterministic Finite Automata Formal Expression : 

Q = {q<sub>0</sub>, q<sub>1</sub>, q<sub>2</sub>}<br>
Σ = {a, 0, 1}<br>
δ = Served in the table<br>
S = q<sub>0</sub><br>
F = q<sub>1</sub><br>

Transition Table :
<table border="1">
  <tr>
    <td>δ</td>
    <td>a</td>
    <td>0</td>
    <td>1</td>
  </tr>
  <tr>
    <td>q<sub>0</sub></td>
    <td>q<sub>1</sub></td>
    <td>q<sub>2</sub></td>
    <td>q<sub>2</sub></td>
  </tr>
    <tr>
    <td>q<sub>1</sub></td>
    <td>q<sub>1</sub></td>
    <td>q<sub>1</sub></td>
    <td>q<sub>1</sub></td>
  </tr>
  <tr>
    <td>q<sub>2</sub></td>
    <td>q<sub>2</sub></td>
    <td>q<sub>2</sub></td>
    <td>q<sub>2</sub></td>
  </tr>
</table>

Diagram :

![image](https://user-images.githubusercontent.com/42016968/118355913-ecf5f600-b59c-11eb-8ee2-1dd521121a83.png)
