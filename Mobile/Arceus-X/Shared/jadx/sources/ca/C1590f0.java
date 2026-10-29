package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzq;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1590f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        byte[] bArrM38429c = null;
        byte[] bArrM38429c2 = null;
        byte[] bArrM38429c3 = null;
        long jM38451y = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 2) {
                bArrM38429c = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n == 3) {
                bArrM38429c2 = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                bArrM38429c3 = C9717a.m38429c(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzq(jM38451y, bArrM38429c, bArrM38429c2, bArrM38429c3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
