package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        Long lZ = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                lZ = o9.a.z(parcel, iU);
            } else if (iN == 4) {
                lZ2 = o9.a.z(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                iW3 = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new ModuleInstallStatusUpdate(iW, iW2, lZ, lZ2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallStatusUpdate[i10];
    }
}
