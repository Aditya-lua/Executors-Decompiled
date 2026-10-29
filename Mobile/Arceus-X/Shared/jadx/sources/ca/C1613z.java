package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzf;
import p100eb.AbstractC4970m3;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1613z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        byte[] bArrM38429c = null;
        byte[] bArrM38429c2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                bArrM38429c = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                bArrM38429c2 = C9717a.m38429c(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzf(bArrM38429c == null ? null : AbstractC4970m3.m23673m(bArrM38429c, 0, bArrM38429c.length), bArrM38429c2 != null ? AbstractC4970m3.m23673m(bArrM38429c2, 0, bArrM38429c2.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
