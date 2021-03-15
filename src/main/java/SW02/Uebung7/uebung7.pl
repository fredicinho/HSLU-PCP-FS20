mult(_, 0, 0).
mult(0, _, 0).

mult(X, Y, Z) :-
X > 0,
X1 is X - 1,
mult(X1, Y, W),
Z is W + X1.





