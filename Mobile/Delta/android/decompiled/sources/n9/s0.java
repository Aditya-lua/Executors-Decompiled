package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 3) {
                zO2 = o9.a.o(parcel, iU);
            } else if (iN == 4) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                iW3 = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new RootTelemetryConfiguration(iW, zO, zO2, iW2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
