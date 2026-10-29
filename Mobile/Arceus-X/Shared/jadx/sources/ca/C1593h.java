package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;
import p100eb.AbstractC4970m3;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1593h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        byte[] bArrM38429c = null;
        byte[] bArrM38429c2 = null;
        byte[] bArrM38429c3 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                bArrM38429c = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n == 2) {
                bArrM38429c2 = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n == 3) {
                bArrM38429c3 = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzai(bArrM38429c == null ? null : AbstractC4970m3.m23673m(bArrM38429c, 0, bArrM38429c.length), bArrM38429c2 == null ? null : AbstractC4970m3.m23673m(bArrM38429c2, 0, bArrM38429c2.length), bArrM38429c3 != null ? AbstractC4970m3.m23673m(bArrM38429c3, 0, bArrM38429c3.length) : null, iM38449w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzai[i10];
    }
}
