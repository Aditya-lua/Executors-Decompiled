package ca;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrC = null;
        ArrayList arrayListL = null;
        Double dR = null;
        ArrayList arrayListL2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numX = null;
        TokenBinding tokenBinding = null;
        String strH = null;
        AuthenticationExtensions authenticationExtensions = null;
        String strH2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) o9.a.g(parcel, iU, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) o9.a.g(parcel, iU, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrC = o9.a.c(parcel, iU);
                    break;
                case 5:
                    arrayListL = o9.a.l(parcel, iU, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dR = o9.a.r(parcel, iU);
                    break;
                case 7:
                    arrayListL2 = o9.a.l(parcel, iU, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) o9.a.g(parcel, iU, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    numX = o9.a.x(parcel, iU);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) o9.a.g(parcel, iU, TokenBinding.CREATOR);
                    break;
                case 11:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) o9.a.g(parcel, iU, AuthenticationExtensions.CREATOR);
                    break;
                case 13:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) o9.a.g(parcel, iU, ResultReceiver.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrC, arrayListL, dR, arrayListL2, authenticatorSelectionCriteria, numX, tokenBinding, strH, authenticationExtensions, strH2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialCreationOptions[i10];
    }
}
