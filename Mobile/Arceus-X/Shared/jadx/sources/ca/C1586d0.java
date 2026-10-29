package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1586d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        String strM38434h = null;
        int iM38449w2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new AuthenticatorErrorResponse(iM38449w, strM38434h, iM38449w2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorErrorResponse[i10];
    }
}
