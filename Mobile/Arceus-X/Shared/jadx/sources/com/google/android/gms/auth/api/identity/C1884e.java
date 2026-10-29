package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1884e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new BeginSignInRequest.PasswordRequestOptions(zM38441o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.PasswordRequestOptions[i10];
    }
}
