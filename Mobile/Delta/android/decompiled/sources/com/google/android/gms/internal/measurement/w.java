package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends x {
    public w() {
        this.f6892a.add(n0.BITWISE_AND);
        this.f6892a.add(n0.BITWISE_LEFT_SHIFT);
        this.f6892a.add(n0.BITWISE_NOT);
        this.f6892a.add(n0.BITWISE_OR);
        this.f6892a.add(n0.BITWISE_RIGHT_SHIFT);
        this.f6892a.add(n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f6892a.add(n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        switch (v5.e(str).ordinal()) {
            case 4:
                v5.a(n0.BITWISE_AND.name(), 2, list);
                return new j(Double.valueOf(v5.g(u4Var.a((q) list.get(0)).zzd().doubleValue()) & v5.g(u4Var.a((q) list.get(1)).zzd().doubleValue())));
            case 5:
                v5.a(n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(v5.g(u4Var.a((q) list.get(0)).zzd().doubleValue()) << ((int) (v5.h(u4Var.a((q) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                v5.a(n0.BITWISE_NOT.name(), 1, list);
                return new j(Double.valueOf(~v5.g(u4Var.a((q) list.get(0)).zzd().doubleValue())));
            case 7:
                v5.a(n0.BITWISE_OR.name(), 2, list);
                return new j(Double.valueOf(v5.g(u4Var.a((q) list.get(0)).zzd().doubleValue()) | v5.g(u4Var.a((q) list.get(1)).zzd().doubleValue())));
            case 8:
                v5.a(n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(v5.g(u4Var.a((q) list.get(0)).zzd().doubleValue()) >> ((int) (v5.h(u4Var.a((q) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                v5.a(n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(v5.h(u4Var.a((q) list.get(0)).zzd().doubleValue()) >>> ((int) (v5.h(u4Var.a((q) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                v5.a(n0.BITWISE_XOR.name(), 2, list);
                return new j(Double.valueOf(v5.g(u4Var.a((q) list.get(0)).zzd().doubleValue()) ^ v5.g(u4Var.a((q) list.get(1)).zzd().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
