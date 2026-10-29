package p306nb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzom;
import p325o9.C9717a;

/* JADX INFO: renamed from: nb.ud */
/* JADX INFO: loaded from: classes.dex */
public final class C9324ud implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        byte[] bArrM38429c = null;
        String strM38434h = null;
        Bundle bundleM38428b = null;
        String strM38434h2 = null;
        long jM38451y = 0;
        long jM38451y2 = 0;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 2:
                    bArrM38429c = C9717a.m38429c(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    bundleM38428b = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 5:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzom(jM38451y, bArrM38429c, strM38434h, bundleM38428b, iM38449w, jM38451y2, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzom[i10];
    }
}
