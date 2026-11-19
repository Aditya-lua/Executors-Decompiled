package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public static final v b = new v(new w());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable.Creator f22018a;

    public v(Parcelable.Creator creator) {
        this.f22018a = creator;
    }

    public static v a() {
        return b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return w.a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return c.A3();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
