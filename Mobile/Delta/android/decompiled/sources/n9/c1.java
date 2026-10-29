package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrE = null;
        int[] iArrE2 = null;
        boolean zO = false;
        boolean zO2 = false;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) o9.a.g(parcel, iU, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 3:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 4:
                    iArrE = o9.a.e(parcel, iU);
                    break;
                case 5:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 6:
                    iArrE2 = o9.a.e(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zO, zO2, iArrE, iW, iArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
