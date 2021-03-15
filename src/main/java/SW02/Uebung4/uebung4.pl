nachbar(rot, grün).
nachbar(grün, rot).
nachbar(rot, gelb).
nachbar(gelb, rot).
nachbar(gün, gelb).
nachbar(gelb, grün).

colors(LU, NW, OW, SZ, UR, ZG) :-
UR = gelb,
SZ = rot,
nachbar(LU, ZG), nachbar(LU, SZ), nachbar(LU, NW), nachbar(LU, OW),
nachbar(NW, OW), nachbar(NW, UR), nachbar(NW, SZ),
nachbar(UR, SZ),
nachbar(SZ, ZG).
