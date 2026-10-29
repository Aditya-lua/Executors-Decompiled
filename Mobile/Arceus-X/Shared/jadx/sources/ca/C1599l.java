package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1599l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        byte[] bArrM38429c = null;
        ArrayList arrayListM38438l = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                bArrM38429c = C9717a.m38429c(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                arrayListM38438l = C9717a.m38438l(parcel, iM38447u, Transport.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PublicKeyCredentialDescriptor(strM38434h, bArrM38429c, arrayListM38438l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialDescriptor[i10];
    }
}
