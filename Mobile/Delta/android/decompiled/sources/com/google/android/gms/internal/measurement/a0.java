package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends x {
    public a0() {
        this.f6892a.add(n0.APPLY);
        this.f6892a.add(n0.BLOCK);
        this.f6892a.add(n0.BREAK);
        this.f6892a.add(n0.CASE);
        this.f6892a.add(n0.DEFAULT);
        this.f6892a.add(n0.CONTINUE);
        this.f6892a.add(n0.DEFINE_FUNCTION);
        this.f6892a.add(n0.FN);
        this.f6892a.add(n0.IF);
        this.f6892a.add(n0.QUOTE);
        this.f6892a.add(n0.RETURN);
        this.f6892a.add(n0.SWITCH);
        this.f6892a.add(n0.TERNARY);
    }

    public static q c(u4 u4Var, List list) {
        v5.b(n0.FN.name(), 2, list);
        q qVarA = u4Var.a((q) list.get(0));
        q qVarA2 = u4Var.a((q) list.get(1));
        if (!(qVarA2 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", qVarA2.getClass().getCanonicalName()));
        }
        List listH = ((f) qVarA2).h();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new p(qVarA.zzc(), listH, arrayList, u4Var);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 2) {
            v5.a(n0.APPLY.name(), 3, list);
            q qVarA = u4Var.a((q) list.get(0));
            String strZzc = u4Var.a((q) list.get(1)).zzc();
            q qVarA2 = u4Var.a((q) list.get(2));
            if (!(qVarA2 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", qVarA2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return qVarA.e(strZzc, u4Var, ((f) qVarA2).h());
        }
        if (iOrdinal == 15) {
            v5.a(n0.BREAK.name(), 0, list);
            return q.Bo;
        }
        if (iOrdinal == 25) {
            return c(u4Var, list);
        }
        if (iOrdinal == 41) {
            v5.b(n0.IF.name(), 2, list);
            q qVarA3 = u4Var.a((q) list.get(0));
            q qVarA4 = u4Var.a((q) list.get(1));
            q qVarA5 = list.size() > 2 ? u4Var.a((q) list.get(2)) : null;
            q qVar = q.f6743zo;
            q qVarB = qVarA3.zze().booleanValue() ? u4Var.b((f) qVarA4) : qVarA5 != null ? u4Var.b((f) qVarA5) : qVar;
            return true != (qVarB instanceof h) ? qVar : qVarB;
        }
        if (iOrdinal == 54) {
            return new f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return q.Do;
            }
            v5.a(n0.RETURN.name(), 1, list);
            return new h("return", u4Var.a((q) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                v5.b(n0.DEFINE_FUNCTION.name(), 2, list);
                p pVar = (p) c(u4Var, list);
                if (pVar.i() == null) {
                    u4Var.e("", pVar);
                    return pVar;
                }
                u4Var.e(pVar.i(), pVar);
                return pVar;
            }
            if (iOrdinal == 60) {
                v5.a(n0.SWITCH.name(), 3, list);
                q qVarA6 = u4Var.a((q) list.get(0));
                q qVarA7 = u4Var.a((q) list.get(1));
                q qVarA8 = u4Var.a((q) list.get(2));
                if (!(qVarA7 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(qVarA8 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                f fVar = (f) qVarA7;
                f fVar2 = (f) qVarA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < fVar.k(); i10++) {
                    if (z10 || qVarA6.equals(u4Var.a(fVar.m(i10)))) {
                        q qVarA9 = u4Var.a(fVar2.m(i10));
                        if (qVarA9 instanceof h) {
                            return ((h) qVarA9).c().equals("break") ? q.f6743zo : qVarA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (fVar.k() + 1 == fVar2.k()) {
                    q qVarA10 = u4Var.a(fVar2.m(fVar.k()));
                    if (qVarA10 instanceof h) {
                        String strC = ((h) qVarA10).c();
                        if (strC.equals("return") || strC.equals("continue")) {
                            return qVarA10;
                        }
                    }
                }
                return q.f6743zo;
            }
            if (iOrdinal == 61) {
                v5.a(n0.TERNARY.name(), 3, list);
                return u4Var.a((q) list.get(0)).zze().booleanValue() ? u4Var.a((q) list.get(1)) : u4Var.a((q) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return u4Var.c().b(new f(list));
                case 12:
                    v5.a(n0.BREAK.name(), 0, list);
                    return q.Co;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return q.f6743zo;
        }
        q qVarA11 = u4Var.a((q) list.get(0));
        return qVarA11 instanceof f ? u4Var.b((f) qVarA11) : q.f6743zo;
    }
}
