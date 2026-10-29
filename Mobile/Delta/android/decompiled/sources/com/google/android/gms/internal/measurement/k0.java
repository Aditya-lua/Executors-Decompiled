package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends x {
    public k0() {
        this.f6892a.add(n0.ADD);
        this.f6892a.add(n0.DIVIDE);
        this.f6892a.add(n0.MODULUS);
        this.f6892a.add(n0.MULTIPLY);
        this.f6892a.add(n0.NEGATE);
        this.f6892a.add(n0.POST_DECREMENT);
        this.f6892a.add(n0.POST_INCREMENT);
        this.f6892a.add(n0.PRE_DECREMENT);
        this.f6892a.add(n0.PRE_INCREMENT);
        this.f6892a.add(n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 0) {
            v5.a(n0.ADD.name(), 2, list);
            q qVarA = u4Var.a((q) list.get(0));
            q qVarA2 = u4Var.a((q) list.get(1));
            if (!(qVarA instanceof m) && !(qVarA instanceof u) && !(qVarA2 instanceof m) && !(qVarA2 instanceof u)) {
                return new j(Double.valueOf(qVarA.zzd().doubleValue() + qVarA2.zzd().doubleValue()));
            }
            return new u(String.valueOf(qVarA.zzc()).concat(String.valueOf(qVarA2.zzc())));
        }
        if (iOrdinal == 21) {
            v5.a(n0.DIVIDE.name(), 2, list);
            return new j(Double.valueOf(u4Var.a((q) list.get(0)).zzd().doubleValue() / u4Var.a((q) list.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            v5.a(n0.SUBTRACT.name(), 2, list);
            return new j(Double.valueOf(u4Var.a((q) list.get(0)).zzd().doubleValue() + new j(Double.valueOf(-u4Var.a((q) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            v5.a(str, 2, list);
            q qVarA3 = u4Var.a((q) list.get(0));
            u4Var.a((q) list.get(1));
            return qVarA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            v5.a(str, 1, list);
            return u4Var.a((q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                v5.a(n0.MODULUS.name(), 2, list);
                return new j(Double.valueOf(u4Var.a((q) list.get(0)).zzd().doubleValue() % u4Var.a((q) list.get(1)).zzd().doubleValue()));
            case 45:
                v5.a(n0.MULTIPLY.name(), 2, list);
                return new j(Double.valueOf(u4Var.a((q) list.get(0)).zzd().doubleValue() * u4Var.a((q) list.get(1)).zzd().doubleValue()));
            case 46:
                v5.a(n0.NEGATE.name(), 1, list);
                return new j(Double.valueOf(-u4Var.a((q) list.get(0)).zzd().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
