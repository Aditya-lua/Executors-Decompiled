package lb;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p325o9.C9717a;

/* JADX INFO: renamed from: lb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C8118u implements Parcelable.Creator<LocationResult> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        List<Location> listM38438l = LocationResult.f9457g;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                listM38438l = C9717a.m38438l(parcel, iM38447u, Location.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new LocationResult(listM38438l);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
