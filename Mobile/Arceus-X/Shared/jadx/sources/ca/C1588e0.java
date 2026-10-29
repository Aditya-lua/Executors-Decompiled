package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1588e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Boolean boolM38442p = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                boolM38442p = C9717a.m38442p(parcel, iM38447u);
            } else if (iM38440n == 4) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h3 = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new AuthenticatorSelectionCriteria(strM38434h, boolM38442p, strM38434h2, strM38434h3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorSelectionCriteria[i10];
    }
}
