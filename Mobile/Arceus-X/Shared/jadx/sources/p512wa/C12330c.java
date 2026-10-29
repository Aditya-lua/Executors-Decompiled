package p512wa;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: wa.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12330c {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f44187a = C12330c.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m46186a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m46187b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.os.IInterface */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m46188c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
