package ua;

import android.os.Parcel;

/* JADX INFO: renamed from: ua.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11833c {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f41593a = C11833c.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static void m44219a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44220b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
