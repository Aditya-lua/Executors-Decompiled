package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1989b9 extends AbstractC2175l9 {
    public C1989b9(C2065f9 c2065f9, String str, Long l10, boolean z10) {
        super(c2065f9, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2175l9
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo9792a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f8399b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
