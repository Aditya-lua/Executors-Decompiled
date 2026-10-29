package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2027d9 extends AbstractC2175l9 {
    public C2027d9(C2065f9 c2065f9, String str, Double d10, boolean z10) {
        super(c2065f9, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2175l9
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo9792a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f8399b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 27 + string.length());
        sb2.append("Invalid double value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
