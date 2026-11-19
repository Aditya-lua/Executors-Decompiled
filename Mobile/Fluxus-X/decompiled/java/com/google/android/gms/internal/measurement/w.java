package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends x {
    public w() {
        this.f6916a.add(n0.BITWISE_AND);
        this.f6916a.add(n0.BITWISE_LEFT_SHIFT);
        this.f6916a.add(n0.BITWISE_NOT);
        this.f6916a.add(n0.BITWISE_OR);
        this.f6916a.add(n0.BITWISE_RIGHT_SHIFT);
        this.f6916a.add(n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f6916a.add(n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, y4 y4Var, List list) {
        n0 n0Var = n0.ADD;
        switch (z5.e(str).ordinal()) {
            case 4:
                z5.a(n0.BITWISE_AND.name(), 2, list);
                return new j(Double.valueOf(z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue()) & z5.g(y4Var.a((q) list.get(1)).zzd().doubleValue())));
            case 5:
                z5.a(n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue()) << ((int) (z5.h(y4Var.a((q) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                z5.a(n0.BITWISE_NOT.name(), 1, list);
                return new j(Double.valueOf(~z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue())));
            case 7:
                z5.a(n0.BITWISE_OR.name(), 2, list);
                return new j(Double.valueOf(z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue()) | z5.g(y4Var.a((q) list.get(1)).zzd().doubleValue())));
            case 8:
                z5.a(n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue()) >> ((int) (z5.h(y4Var.a((q) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                z5.a(n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(z5.h(y4Var.a((q) list.get(0)).zzd().doubleValue()) >>> ((int) (z5.h(y4Var.a((q) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                z5.a(n0.BITWISE_XOR.name(), 2, list);
                return new j(Double.valueOf(z5.g(y4Var.a((q) list.get(0)).zzd().doubleValue()) ^ z5.g(y4Var.a((q) list.get(1)).zzd().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
