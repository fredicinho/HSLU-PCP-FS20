female(mary). female(liz). female(mia). female(tina). female(ann). female(sue).% all females
male(mike). male(jack). male(fred). male(tom). male(joe). male(jim). % all males
parent(mary, mia). parent(mary, fred). parent(mary, tina). % all childern of mary
parent(mike, mia). parent(mike, fred). parent(mike, tina). % all children of mike
parent(liz, tom). parent(liz, joe). % allchildern of liz
parent(jack, tom). parent(jack, joe). % all childern of jack
parent(mia, ann). % all childern of mia
parent(tina, sue). parent(tina, jim). % all childern of tina
parent(tom, sue). parent(tom, jim). % all childern of tom


% a.) Mutter/Vater: Wenn Person ein Elternteil und Weiblich/Mänlich ist
mother(X, Y) :- parent(X, Y), female(X).
father(X, Y) :- parent(X, Y), male(X).

% Alle Kinder von einem Elternteil: parent("Elternteil", X).


% b.) Geschwister: Wenn beide gleichen Elternteil haben
sibling(X, Y) :- parent(Z, X), parent(Z, Y).

% c.) Grossmutter: Muss weiblich sein, und parent rekursiv anwenden!
grandmother(X, Y) :- female(X), parent(X, Z), parent(Z, Y).

% d.) Offspring: ist umgekehrtes parent, wenn nicht, muss rekursiv gearbeitet werden.
offspring(X, Y) :- parent(Y, X).
offspring(X, Y) :- parent(Y, Z), offspring(X, Z).