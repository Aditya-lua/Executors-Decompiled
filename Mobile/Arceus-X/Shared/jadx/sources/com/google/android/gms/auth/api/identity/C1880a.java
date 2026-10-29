package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1880a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        int iM38449w = 0;
        boolean zM38441o2 = false;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strM38434h = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) C9717a.m38433g(parcel, iM38447u, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) C9717a.m38433g(parcel, iM38447u, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) C9717a.m38433g(parcel, iM38447u, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) C9717a.m38433g(parcel, iM38447u, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case 8:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strM38434h, zM38441o, iM38449w, passkeysRequestOptions, passkeyJsonRequestOptions, zM38441o2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest[i10];
    }
}
