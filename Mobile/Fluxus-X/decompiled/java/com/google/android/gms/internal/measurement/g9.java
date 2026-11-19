package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g9 extends p9 {
    public g9(j9 j9Var, String str, Boolean bool, boolean z10) {
        super(j9Var, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (i8.f6546c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (i8.f6547d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.b;
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
