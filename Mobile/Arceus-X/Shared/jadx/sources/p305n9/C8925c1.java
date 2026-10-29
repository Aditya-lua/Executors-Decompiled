package p305n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p325o9.C9717a;

/* JADX INFO: renamed from: n9.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8925c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrM38431e = null;
        int[] iArrM38431e2 = null;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C9717a.m38433g(parcel, iM38447u, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 3:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 4:
                    iArrM38431e = C9717a.m38431e(parcel, iM38447u);
                    break;
                case 5:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    iArrM38431e2 = C9717a.m38431e(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM38441o, zM38441o2, iArrM38431e, iM38449w, iArrM38431e2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
