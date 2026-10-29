package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x {
    public j0() {
        this.f6892a.add(n0.FOR_IN);
        this.f6892a.add(n0.FOR_IN_CONST);
        this.f6892a.add(n0.FOR_IN_LET);
        this.f6892a.add(n0.FOR_LET);
        this.f6892a.add(n0.FOR_OF);
        this.f6892a.add(n0.FOR_OF_CONST);
        this.f6892a.add(n0.FOR_OF_LET);
        this.f6892a.add(n0.WHILE);
    }

    public static q c(h0 h0Var, q qVar, q qVar2) {
        return e(h0Var, qVar.zzf(), qVar2);
    }

    public static q d(h0 h0Var, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return e(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static q e(h0 h0Var, Iterator it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q qVarB = h0Var.a((q) it.next()).b((f) qVar);
                if (qVarB instanceof h) {
                    h hVar = (h) qVarB;
                    if ("break".equals(hVar.c())) {
                        return q.f6743zo;
                    }
                    if ("return".equals(hVar.c())) {
                        return hVar;
                    }
                }
            }
        }
        return q.f6743zo;
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 65) {
            v5.a(n0.WHILE.name(), 4, list);
            q qVar = (q) list.get(0);
            q qVar2 = (q) list.get(1);
            q qVar3 = (q) list.get(2);
            q qVarA = u4Var.a((q) list.get(3));
            if (u4Var.a(qVar3).zze().booleanValue()) {
                q qVarB = u4Var.b((f) qVarA);
                if (qVarB instanceof h) {
                    h hVar = (h) qVarB;
                    if ("break".equals(hVar.c())) {
                        return q.f6743zo;
                    }
                    if ("return".equals(hVar.c())) {
                        return hVar;
                    }
                }
            }
            while (u4Var.a(qVar).zze().booleanValue()) {
                q qVarB2 = u4Var.b((f) qVarA);
                if (qVarB2 instanceof h) {
                    h hVar2 = (h) qVarB2;
                    if ("break".equals(hVar2.c())) {
                        return q.f6743zo;
                    }
                    if ("return".equals(hVar2.c())) {
                        return hVar2;
                    }
                }
                u4Var.a(qVar2);
            }
            return q.f6743zo;
        }
        switch (iOrdinal) {
            case 26:
                v5.a(n0.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new i0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 27:
                v5.a(n0.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new f0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 28:
                v5.a(n0.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new g0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 29:
                v5.a(n0.FOR_LET.name(), 4, list);
                q qVarA2 = u4Var.a((q) list.get(0));
                if (!(qVarA2 instanceof f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                f fVar = (f) qVarA2;
                q qVar4 = (q) list.get(1);
                q qVar5 = (q) list.get(2);
                q qVarA3 = u4Var.a((q) list.get(3));
                u4 u4VarC = u4Var.c();
                for (int i10 = 0; i10 < fVar.k(); i10++) {
                    String strZzc = fVar.m(i10).zzc();
                    u4VarC.e(strZzc, u4Var.h(strZzc));
                }
                while (u4Var.a(qVar4).zze().booleanValue()) {
                    q qVarB3 = u4Var.b((f) qVarA3);
                    if (qVarB3 instanceof h) {
                        h hVar3 = (h) qVarB3;
                        if ("break".equals(hVar3.c())) {
                            return q.f6743zo;
                        }
                        if ("return".equals(hVar3.c())) {
                            return hVar3;
                        }
                    }
                    u4 u4VarC2 = u4Var.c();
                    for (int i11 = 0; i11 < fVar.k(); i11++) {
                        String strZzc2 = fVar.m(i11).zzc();
                        u4VarC2.e(strZzc2, u4VarC.h(strZzc2));
                    }
                    u4VarC2.a(qVar5);
                    u4VarC = u4VarC2;
                }
                return q.f6743zo;
            case 30:
                v5.a(n0.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new i0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 31:
                v5.a(n0.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new f0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 32:
                v5.a(n0.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new g0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
