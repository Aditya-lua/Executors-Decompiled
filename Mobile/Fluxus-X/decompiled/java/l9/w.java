package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    public static final c a(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        f fVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                fVar = (f) p9.b.g(parcel, iU, f.CREATOR);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                zO = p9.b.o(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new c(fVar, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
