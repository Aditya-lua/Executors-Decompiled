package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1584c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        byte[] bArrM38429c = null;
        byte[] bArrM38429c2 = null;
        byte[] bArrM38429c3 = null;
        String[] strArrM38435i = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                bArrM38429c = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n == 3) {
                bArrM38429c2 = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n == 4) {
                bArrM38429c3 = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strArrM38435i = C9717a.m38435i(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new AuthenticatorAttestationResponse(bArrM38429c, bArrM38429c2, bArrM38429c3, strArrM38435i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorAttestationResponse[i10];
    }
}
