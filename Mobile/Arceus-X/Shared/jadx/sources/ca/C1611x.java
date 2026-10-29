package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1611x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzak zzakVar = null;
        zzaw zzawVar = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) C9717a.m38433g(parcel, iM38447u, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (zzs) C9717a.m38433g(parcel, iM38447u, zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) C9717a.m38433g(parcel, iM38447u, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (zzz) C9717a.m38433g(parcel, iM38447u, zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) C9717a.m38433g(parcel, iM38447u, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) C9717a.m38433g(parcel, iM38447u, zzad.CREATOR);
                    break;
                case 8:
                    zzuVar = (zzu) C9717a.m38433g(parcel, iM38447u, zzu.CREATOR);
                    break;
                case 9:
                    zzagVar = (zzag) C9717a.m38433g(parcel, iM38447u, zzag.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) C9717a.m38433g(parcel, iM38447u, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzakVar = (zzak) C9717a.m38433g(parcel, iM38447u, zzak.CREATOR);
                    break;
                case 12:
                    zzawVar = (zzaw) C9717a.m38433g(parcel, iM38447u, zzaw.CREATOR);
                    break;
                case 13:
                    zzaiVar = (zzai) C9717a.m38433g(parcel, iM38447u, zzai.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensions[i10];
    }
}
