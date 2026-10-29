package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzbo;
import p325o9.C9717a;

/* JADX INFO: renamed from: lb.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8116s implements Parcelable.Creator<LocationAvailability> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 1000;
        int iM38449w2 = 1;
        int iM38449w3 = 1;
        long jM38451y = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w3 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 4) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zzboVarArr = (zzbo[]) C9717a.m38437k(parcel, iM38447u, zzbo.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new LocationAvailability(iM38449w, iM38449w2, iM38449w3, jM38451y, zzboVarArr);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
