package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends x {
    public z() {
        this.f6892a.add(n0.EQUALS);
        this.f6892a.add(n0.GREATER_THAN);
        this.f6892a.add(n0.GREATER_THAN_EQUALS);
        this.f6892a.add(n0.IDENTITY_EQUALS);
        this.f6892a.add(n0.IDENTITY_NOT_EQUALS);
        this.f6892a.add(n0.LESS_THAN);
        this.f6892a.add(n0.LESS_THAN_EQUALS);
        this.f6892a.add(n0.NOT_EQUALS);
    }

    public static boolean c(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.zzc());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.zzc());
        }
        if ((qVar instanceof u) && (qVar2 instanceof u)) {
            return qVar.zzc().compareTo(qVar2.zzc()) < 0;
        }
        double dDoubleValue = qVar.zzd().doubleValue();
        double dDoubleValue2 = qVar2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            if (qVar instanceof j) {
                return (Double.isNaN(qVar.zzd().doubleValue()) || Double.isNaN(qVar2.zzd().doubleValue()) || qVar.zzd().doubleValue() != qVar2.zzd().doubleValue()) ? false : true;
            }
            if (qVar instanceof u) {
                return qVar.zzc().equals(qVar2.zzc());
            }
            if (qVar instanceof g) {
                return qVar.zze().equals(qVar2.zze());
            }
            return qVar == qVar2;
        }
        if (((qVar instanceof v) || (qVar instanceof o)) && ((qVar2 instanceof v) || (qVar2 instanceof o))) {
            return true;
        }
        boolean z10 = qVar instanceof j;
        if (z10 && (qVar2 instanceof u)) {
            return d(qVar, new j(qVar2.zzd()));
        }
        boolean z11 = qVar instanceof u;
        if ((!z11 || !(qVar2 instanceof j)) && !(qVar instanceof g)) {
            if (qVar2 instanceof g) {
                return d(qVar, new j(qVar2.zzd()));
            }
            if ((z11 || z10) && (qVar2 instanceof m)) {
                return d(qVar, new u(qVar2.zzc()));
            }
            if ((qVar instanceof m) && ((qVar2 instanceof u) || (qVar2 instanceof j))) {
                return d(new u(qVar.zzc()), qVar2);
            }
            return false;
        }
        return d(new j(qVar.zzd()), qVar2);
    }

    public static boolean e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.zzc());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.zzc());
        }
        return (((qVar instanceof u) && (qVar2 instanceof u)) || !(Double.isNaN(qVar.zzd().doubleValue()) || Double.isNaN(qVar2.zzd().doubleValue()))) && !c(qVar2, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        boolean zD;
        boolean zD2;
        v5.a(v5.e(str).name(), 2, list);
        q qVarA = u4Var.a((q) list.get(0));
        q qVarA2 = u4Var.a((q) list.get(1));
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(qVarA, qVarA2);
            } else if (iOrdinal == 42) {
                zD = c(qVarA, qVarA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(qVarA2, qVarA);
                        break;
                    case 38:
                        zD = e(qVarA2, qVarA);
                        break;
                    case 39:
                        zD = v5.f(qVarA, qVarA2);
                        break;
                    case 40:
                        zD2 = v5.f(qVarA, qVarA2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zD = e(qVarA, qVarA2);
            }
            zD = !zD2;
        } else {
            zD = d(qVarA, qVarA2);
        }
        return zD ? q.Eo : q.Fo;
    }
}
