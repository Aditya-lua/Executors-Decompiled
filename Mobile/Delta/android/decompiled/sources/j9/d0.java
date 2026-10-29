package j9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzp;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        String strH = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 3:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 4:
                    iBinderV = o9.a.v(parcel, iU);
                    break;
                case 5:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                case 6:
                    zO4 = o9.a.o(parcel, iU);
                    break;
                case 7:
                default:
                    o9.a.C(parcel, iU);
                    break;
                case 8:
                    zO5 = o9.a.o(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzp(strH, zO, zO2, iBinderV, zO3, zO4, zO5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
