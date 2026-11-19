package gb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            if (p9.b.n(iU) != 1) {
                p9.b.C(parcel, iU);
            } else {
                intent = (Intent) p9.b.g(parcel, iU, Intent.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new k2(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k2[i10];
    }
}
