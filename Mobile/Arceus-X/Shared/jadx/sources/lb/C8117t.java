package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import p325o9.C9717a;

/* JADX INFO: renamed from: lb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8117t implements Parcelable.Creator<LocationRequest> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 102;
        long jM38451y = 3600000;
        long jM38451y2 = 600000;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        long jM38451y3 = Long.MAX_VALUE;
        int iM38449w2 = Integer.MAX_VALUE;
        float fM38445s = 0.0f;
        long jM38451y4 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 3:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 4:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    jM38451y3 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 6:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 7:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 8:
                    jM38451y4 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 9:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new LocationRequest(iM38449w, jM38451y, jM38451y2, zM38441o, jM38451y3, iM38449w2, fM38445s, jM38451y4, zM38441o2);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
