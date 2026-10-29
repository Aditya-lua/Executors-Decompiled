package j9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        String strH = null;
        IBinder iBinderV = null;
        boolean zO2 = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 2) {
                iBinderV = o9.a.v(parcel, iU);
            } else if (iN == 3) {
                zO = o9.a.o(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                zO2 = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzt(strH, iBinderV, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzt[i10];
    }
}
