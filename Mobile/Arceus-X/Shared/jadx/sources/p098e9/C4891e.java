package p098e9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import p325o9.C9717a;

/* JADX INFO: renamed from: e9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4891e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
        boolean zM38441o = false;
        byte[] bArrM38429c = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                bArrM38429c = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n == 2) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new StoreBytesData(bArrM38429c, zM38441o, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StoreBytesData[i10];
    }
}
