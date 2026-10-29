package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1882c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        boolean zM38441o = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(zM38441o, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i10];
    }
}
