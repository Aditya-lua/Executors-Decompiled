package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7391a;
    public final s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f7392c;

    public /* synthetic */ t(String str, u uVar) {
        s sVar = new s();
        this.b = sVar;
        this.f7392c = sVar;
        str.getClass();
        this.f7391a = str;
    }

    public final t a(Object obj) {
        s sVar = new s();
        this.f7392c.b = sVar;
        this.f7392c = sVar;
        sVar.f7300a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f7391a);
        sb2.append('{');
        s sVar = this.b.b;
        String str = "";
        while (sVar != null) {
            Object obj = sVar.f7300a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            sVar = sVar.b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
