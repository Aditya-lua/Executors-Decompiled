package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerLevel;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                jY = o9.a.y(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                jY2 = o9.a.y(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new PlayerLevel(iW, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerLevel[i10];
    }
}
