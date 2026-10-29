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
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1597j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrM38429c = null;
        ArrayList arrayListM38438l = null;
        Double dM38444r = null;
        ArrayList arrayListM38438l2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numM38450x = null;
        TokenBinding tokenBinding = null;
        String strM38434h = null;
        AuthenticationExtensions authenticationExtensions = null;
        String strM38434h2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) C9717a.m38433g(parcel, iM38447u, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) C9717a.m38433g(parcel, iM38447u, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrM38429c = C9717a.m38429c(parcel, iM38447u);
                    break;
                case 5:
                    arrayListM38438l = C9717a.m38438l(parcel, iM38447u, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dM38444r = C9717a.m38444r(parcel, iM38447u);
                    break;
                case 7:
                    arrayListM38438l2 = C9717a.m38438l(parcel, iM38447u, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) C9717a.m38433g(parcel, iM38447u, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    numM38450x = C9717a.m38450x(parcel, iM38447u);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) C9717a.m38433g(parcel, iM38447u, TokenBinding.CREATOR);
                    break;
                case 11:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) C9717a.m38433g(parcel, iM38447u, AuthenticationExtensions.CREATOR);
                    break;
                case 13:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) C9717a.m38433g(parcel, iM38447u, ResultReceiver.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrM38429c, arrayListM38438l, dM38444r, arrayListM38438l2, authenticatorSelectionCriteria, numM38450x, tokenBinding, strM38434h, authenticationExtensions, strM38434h2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialCreationOptions[i10];
    }
}
