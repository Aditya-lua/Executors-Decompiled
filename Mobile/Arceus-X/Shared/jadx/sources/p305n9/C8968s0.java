package p305n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p325o9.C9717a;

/* JADX INFO: renamed from: n9.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8968s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 3) {
                zM38441o2 = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 4) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w3 = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new RootTelemetryConfiguration(iM38449w, zM38441o, zM38441o2, iM38449w2, iM38449w3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
