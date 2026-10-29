package p305n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import p325o9.C9717a;

/* JADX INFO: renamed from: n9.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8922b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Bundle bundleM38428b = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iM38449w = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n == 2) {
                featureArr = (Feature[]) C9717a.m38437k(parcel, iM38447u, Feature.CREATOR);
            } else if (iM38440n == 3) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C9717a.m38433g(parcel, iM38447u, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzj(bundleM38428b, featureArr, iM38449w, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
