package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends x {
    public a0() {
        this.f6916a.add(n0.APPLY);
        this.f6916a.add(n0.BLOCK);
        this.f6916a.add(n0.BREAK);
        this.f6916a.add(n0.CASE);
        this.f6916a.add(n0.DEFAULT);
        this.f6916a.add(n0.CONTINUE);
        this.f6916a.add(n0.DEFINE_FUNCTION);
        this.f6916a.add(n0.FN);
        this.f6916a.add(n0.IF);
        this.f6916a.add(n0.QUOTE);
        this.f6916a.add(n0.RETURN);
        this.f6916a.add(n0.SWITCH);
        this.f6916a.add(n0.TERNARY);
    }

    public static q c(y4 y4Var, List list) {
        z5.b(n0.FN.name(), 2, list);
        q qVarA = y4Var.a((q) list.get(0));
        q qVarA2 = y4Var.a((q) list.get(1));
        if (!(qVarA2 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", qVarA2.getClass().getCanonicalName()));
        }
        List listH = ((f) qVarA2).h();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new p(qVarA.zzc(), listH, arrayList, y4Var);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, y4 y4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = z5.e(str).ordinal();
        if (iOrdinal == 2) {
            z5.a(n0.APPLY.name(), 3, list);
            q qVarA = y4Var.a((q) list.get(0));
            String strZzc = y4Var.a((q) list.get(1)).zzc();
            q qVarA2 = y4Var.a((q) list.get(2));
            if (!(qVarA2 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", qVarA2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return qVarA.e(strZzc, y4Var, ((f) qVarA2).h());
        }
        if (iOrdinal == 15) {
            z5.a(n0.BREAK.name(), 0, list);
            return q.Eo;
        }
        if (iOrdinal == 25) {
            return c(y4Var, list);
        }
        if (iOrdinal == 41) {
            z5.b(n0.IF.name(), 2, list);
            q qVarA3 = y4Var.a((q) list.get(0));
            q qVarA4 = y4Var.a((q) list.get(1));
            q qVarA5 = list.size() > 2 ? y4Var.a((q) list.get(2)) : null;
            q qVar = q.Co;
            q qVarB = qVarA3.zze().booleanValue() ? y4Var.b((f) qVarA4) : qVarA5 != null ? y4Var.b((f) qVarA5) : qVar;
            return true != (qVarB instanceof h) ? qVar : qVarB;
        }
        if (iOrdinal == 54) {
            return new f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return q.Go;
            }
            z5.a(n0.RETURN.name(), 1, list);
            return new h("return", y4Var.a((q) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                z5.b(n0.DEFINE_FUNCTION.name(), 2, list);
                p pVar = (p) c(y4Var, list);
                if (pVar.i() == null) {
                    y4Var.e(BuildConfig.FLAVOR, pVar);
                    return pVar;
                }
                y4Var.e(pVar.i(), pVar);
                return pVar;
            }
            if (iOrdinal == 60) {
                z5.a(n0.SWITCH.name(), 3, list);
                q qVarA6 = y4Var.a((q) list.get(0));
                q qVarA7 = y4Var.a((q) list.get(1));
                q qVarA8 = y4Var.a((q) list.get(2));
                if (!(qVarA7 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(qVarA8 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                f fVar = (f) qVarA7;
                f fVar2 = (f) qVarA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < fVar.j(); i10++) {
                    if (z10 || qVarA6.equals(y4Var.a(fVar.m(i10)))) {
                        q qVarA9 = y4Var.a(fVar2.m(i10));
                        if (qVarA9 instanceof h) {
                            return ((h) qVarA9).c().equals("break") ? q.Co : qVarA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (fVar.j() + 1 == fVar2.j()) {
                    q qVarA10 = y4Var.a(fVar2.m(fVar.j()));
                    if (qVarA10 instanceof h) {
                        String strC = ((h) qVarA10).c();
                        if (strC.equals("return") || strC.equals("continue")) {
                            return qVarA10;
                        }
                    }
                }
                return q.Co;
            }
            if (iOrdinal == 61) {
                z5.a(n0.TERNARY.name(), 3, list);
                return y4Var.a((q) list.get(0)).zze().booleanValue() ? y4Var.a((q) list.get(1)) : y4Var.a((q) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return y4Var.c().b(new f(list));
                case 12:
                    z5.a(n0.BREAK.name(), 0, list);
                    return q.Fo;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return q.Co;
        }
        q qVarA11 = y4Var.a((q) list.get(0));
        return qVarA11 instanceof f ? y4Var.b((f) qVarA11) : q.Co;
    }
}
