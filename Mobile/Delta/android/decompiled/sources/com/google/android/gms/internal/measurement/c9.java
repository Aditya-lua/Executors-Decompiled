package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class c9 extends l9 {
    public c9(f9 f9Var, String str, Boolean bool, boolean z10) {
        super(f9Var, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.l9
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (e8.f6427c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (e8.f6428d.matcher(str).matches()) {
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
