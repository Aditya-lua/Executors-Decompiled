package va;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;
import p325o9.C9717a;

/* JADX INFO: renamed from: va.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12122f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        Bundle bundleM38428b = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h3 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 4) {
                strM38434h4 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 6) {
                strM38434h5 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 7) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzk(strM38434h, strM38434h2, strM38434h3, strM38434h4, strM38434h5, bundleM38428b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
