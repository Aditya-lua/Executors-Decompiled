package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzbj;
import p325o9.C9717a;

/* JADX INFO: renamed from: lb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C8120w implements Parcelable.Creator<zzbj> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = "";
        String strM38434h2 = "";
        String strM38434h3 = strM38434h2;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h3 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzbj(strM38434h, strM38434h2, strM38434h3);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj[] newArray(int i10) {
        return new zzbj[i10];
    }
}
