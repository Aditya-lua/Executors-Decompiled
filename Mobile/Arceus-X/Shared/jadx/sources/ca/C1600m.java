package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1600m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Integer numM38450x = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                numM38450x = C9717a.m38450x(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PublicKeyCredentialParameters(strM38434h, numM38450x.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialParameters[i10];
    }
}
