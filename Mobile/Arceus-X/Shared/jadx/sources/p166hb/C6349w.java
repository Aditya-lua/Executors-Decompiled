package p166hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.location.zzs;
import java.util.List;
import p325o9.C9717a;

/* JADX INFO: renamed from: hb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6349w implements Parcelable.Creator<zzj> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        zzs zzsVar = zzj.f8080j;
        List<ClientIdentity> listM38438l = zzj.f8079i;
        String strM38434h = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                zzsVar = (zzs) C9717a.m38433g(parcel, iM38447u, zzs.CREATOR);
            } else if (iM38440n == 2) {
                listM38438l = C9717a.m38438l(parcel, iM38447u, ClientIdentity.CREATOR);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzj(zzsVar, listM38438l, strM38434h);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
