male(mike).
male(jack).
male(fred).
male(tom).
male(joe).
male(jim).

female(mary).
female(liz).
female(mia).
female(tina).
female(ann).
female(sue).

parent(mary, mia).
parent(mary, fred).
parent(mary, tina). % all childern of mary
parent(mike, mia).
parent(mike, fred).
parent(mike, tina). % all children of mike
parent(liz, tom).
parent(liz, joe). % allchildern of liz
parent(jack, tom).
parent(jack, joe). % all childern of jack
parent(mia, ann). % all childern of mia
parent(tina, sue).
parent(tina, jim). % all childern of tina
parent(tom, sue).
parent(tom, jim).

mother(X, Y) :- parent(X, Y), female(X).

grandmother(X, Y) :- female(X), parent(X, Z), parent(Z, Y).

offspring(X, Y) :- parent(Y, X).
offspring(X, Y) :- parent(Y, Z), offspring(X, Z).

% a.) Suchbaum für grandmother(liz, X).
% b.) Suchbaum für offspring(ann, mary).


