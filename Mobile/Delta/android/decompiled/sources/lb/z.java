package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzs;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = true;
        long jY = 50;
        float fS = 0.0f;
        long jY2 = Long.MAX_VALUE;
        int iW = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 2) {
                jY = o9.a.y(parcel, iU);
            } else if (iN == 3) {
                fS = o9.a.s(parcel, iU);
            } else if (iN == 4) {
                jY2 = o9.a.y(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzs(zO, jY, fS, jY2, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i10) {
        return new zzs[i10];
    }
}
