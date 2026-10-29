package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1881b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        ArrayList<String> arrayListM38436j = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    arrayListM38436j = C9717a.m38436j(parcel, iM38447u);
                    break;
                case 7:
                    zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zM38441o, strM38434h, strM38434h2, zM38441o2, strM38434h3, arrayListM38436j, zM38441o3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i10];
    }
}
