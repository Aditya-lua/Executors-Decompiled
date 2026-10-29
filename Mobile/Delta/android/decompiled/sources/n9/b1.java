package n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Bundle bundleB = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iW = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN == 2) {
                featureArr = (Feature[]) o9.a.k(parcel, iU, Feature.CREATOR);
            } else if (iN == 3) {
                iW = o9.a.w(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) o9.a.g(parcel, iU, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new zzj(bundleB, featureArr, iW, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
