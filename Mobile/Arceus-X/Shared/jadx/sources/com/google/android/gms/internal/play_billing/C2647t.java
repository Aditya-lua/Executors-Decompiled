package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2647t {

    /* JADX INFO: renamed from: a */
    public final String f9384a;

    /* JADX INFO: renamed from: b */
    public final C2636s f9385b;

    /* JADX INFO: renamed from: c */
    public C2636s f9386c;

    public /* synthetic */ C2647t(String str, C2658u c2658u) {
        C2636s c2636s = new C2636s();
        this.f9385b = c2636s;
        this.f9386c = c2636s;
        str.getClass();
        this.f9384a = str;
    }

    /* JADX INFO: renamed from: a */
    public final C2647t m11733a(Object obj) {
        C2636s c2636s = new C2636s();
        this.f9386c.f9218b = c2636s;
        this.f9386c = c2636s;
        c2636s.f9217a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f9384a);
        sb2.append('{');
        C2636s c2636s = this.f9385b.f9218b;
        String str = "";
        while (c2636s != null) {
            Object obj = c2636s.f9217a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c2636s = c2636s.f9218b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
