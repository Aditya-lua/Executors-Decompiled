package p012ab;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ab.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0108e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f376a = 0;

    static {
        C0108e.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m310a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m311b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m312c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m313d(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
