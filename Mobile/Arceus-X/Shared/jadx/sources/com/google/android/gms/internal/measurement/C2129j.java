package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2129j implements InterfaceC2255q {

    /* JADX INFO: renamed from: a */
    public final Double f8328a;

    public C2129j(Double d10) {
        if (d10 == null) {
            this.f8328a = Double.valueOf(Double.NaN);
        } else {
            this.f8328a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return new C2129j(this.f8328a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        if ("toString".equals(str)) {
            return new C2327u(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2129j) {
            return this.f8328a.equals(((C2129j) obj).f8328a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8328a.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        Double d10 = this.f8328a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalM10279a = C2112i.m10279a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalM10279a.scale() > 0 ? bigDecimalM10279a.precision() : bigDecimalM10279a.scale()) - 1);
        String str = decimalFormat.format(bigDecimalM10279a);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalM10279a.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        return this.f8328a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        Double d10 = this.f8328a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return null;
    }
}
