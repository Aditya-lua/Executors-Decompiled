package ie;

import p169he.C6384n;

/* JADX INFO: renamed from: ie.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6770g {
    /* JADX INFO: renamed from: a */
    public static void m28906a(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(strValueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
        sb3.append("null value in entry: ");
        sb3.append(strValueOf2);
        sb3.append("=null");
        throw new NullPointerException(sb3.toString());
    }

    /* JADX INFO: renamed from: b */
    public static int m28907b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m28908c(boolean z10) {
        C6384n.m27935s(z10, "no calls to next() since the last call to remove()");
    }
}
