package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2691x {
    /* JADX INFO: renamed from: a */
    public static int m11815a(int i10, int i11, String str) {
        String strM11166b;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strM11166b = C2439a0.m11166b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strM11166b = C2439a0.m11166b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strM11166b);
    }

    /* JADX INFO: renamed from: b */
    public static int m11816b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m11820f(i10, i11, "index"));
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static Object m11817c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m11818d(int i10, int i11, int i12) {
        String strM11820f;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM11820f = m11820f(i10, i12, "start index");
            } else {
                strM11820f = (i11 < 0 || i11 > i12) ? m11820f(i11, i12, "end index") : C2439a0.m11166b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM11820f);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11819e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m11820f(int i10, int i11, String str) {
        if (i10 < 0) {
            return C2439a0.m11166b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C2439a0.m11166b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
