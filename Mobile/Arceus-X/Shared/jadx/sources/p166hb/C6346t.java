package p166hb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: hb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6346t {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f24084a = C6346t.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static void m27650a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Parcelable> T m27651b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: c */
    public static void m27652c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
