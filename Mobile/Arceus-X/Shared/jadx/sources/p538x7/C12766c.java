package p538x7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: x7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12766c {
    static {
        C12766c.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m47634a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m47635b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
