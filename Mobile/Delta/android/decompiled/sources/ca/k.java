package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        byte[] bArrC = null;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
        AuthenticatorErrorResponse authenticatorErrorResponse = null;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    bArrC = o9.a.c(parcel, iU);
                    break;
                case 4:
                    authenticatorAttestationResponse = (AuthenticatorAttestationResponse) o9.a.g(parcel, iU, AuthenticatorAttestationResponse.CREATOR);
                    break;
                case 5:
                    authenticatorAssertionResponse = (AuthenticatorAssertionResponse) o9.a.g(parcel, iU, AuthenticatorAssertionResponse.CREATOR);
                    break;
                case 6:
                    authenticatorErrorResponse = (AuthenticatorErrorResponse) o9.a.g(parcel, iU, AuthenticatorErrorResponse.CREATOR);
                    break;
                case 7:
                    authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) o9.a.g(parcel, iU, AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                case 8:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new PublicKeyCredential(strH, strH2, bArrC, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strH3, strH4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredential[i10];
    }
}
