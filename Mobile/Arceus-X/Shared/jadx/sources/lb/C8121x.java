package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzbj;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: lb.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8121x implements Parcelable.Creator<LocationSettingsRequest> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ArrayList arrayListM38438l = null;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, LocationRequest.CREATOR);
            } else if (iM38440n == 2) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 3) {
                zM38441o2 = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zzbjVar = (zzbj) C9717a.m38433g(parcel, iM38447u, zzbj.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new LocationSettingsRequest(arrayListM38438l, zM38441o, zM38441o2, zzbjVar);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}
