package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2008c9 extends AbstractC2175l9 {
    public C2008c9(C2065f9 c2065f9, String str, Boolean bool, boolean z10) {
        super(c2065f9, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2175l9
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo9792a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C2045e8.f8161c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (C2045e8.f8162d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f8399b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + string.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
