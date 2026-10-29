package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzs;
import p325o9.C9717a;

/* JADX INFO: renamed from: lb.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8123z implements Parcelable.Creator<zzs> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = true;
        long jM38451y = 50;
        float fM38445s = 0.0f;
        long jM38451y2 = Long.MAX_VALUE;
        int iM38449w = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 2) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 3) {
                fM38445s = C9717a.m38445s(parcel, iM38447u);
            } else if (iM38440n == 4) {
                jM38451y2 = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzs(zM38441o, jM38451y, fM38445s, jM38451y2, iM38449w);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i10) {
        return new zzs[i10];
    }
}
