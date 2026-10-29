package p166hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import p325o9.C9717a;

/* JADX INFO: renamed from: hb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6342p implements Parcelable.Creator<zzba> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        List<ClientIdentity> listM38438l = zzba.f8061q;
        LocationRequest locationRequest = null;
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        boolean zM38441o4 = false;
        boolean zM38441o5 = false;
        long jM38451y = Long.MAX_VALUE;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n != 1) {
                switch (iM38440n) {
                    case 5:
                        listM38438l = C9717a.m38438l(parcel, iM38447u, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strM38434h = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 7:
                        zM38441o = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 8:
                        zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 9:
                        zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 10:
                        strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 11:
                        zM38441o4 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 12:
                        zM38441o5 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 13:
                        strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 14:
                        jM38451y = C9717a.m38451y(parcel, iM38447u);
                        break;
                    default:
                        C9717a.m38423C(parcel, iM38447u);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C9717a.m38433g(parcel, iM38447u, LocationRequest.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzba(locationRequest, listM38438l, strM38434h, zM38441o, zM38441o2, zM38441o3, strM38434h2, zM38441o4, zM38441o5, strM38434h3, jM38451y);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i10) {
        return new zzba[i10];
    }
}
