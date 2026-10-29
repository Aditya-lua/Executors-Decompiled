package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.C1611x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new C1611x();

    /* JADX INFO: renamed from: f */
    public final FidoAppIdExtension f7594f;

    /* JADX INFO: renamed from: g */
    public final zzs f7595g;

    /* JADX INFO: renamed from: h */
    public final UserVerificationMethodExtension f7596h;

    /* JADX INFO: renamed from: i */
    public final zzz f7597i;

    /* JADX INFO: renamed from: j */
    public final zzab f7598j;

    /* JADX INFO: renamed from: k */
    public final zzad f7599k;

    /* JADX INFO: renamed from: l */
    public final zzu f7600l;

    /* JADX INFO: renamed from: m */
    public final zzag f7601m;

    /* JADX INFO: renamed from: n */
    public final GoogleThirdPartyPaymentExtension f7602n;

    /* JADX INFO: renamed from: o */
    public final zzak f7603o;

    /* JADX INFO: renamed from: p */
    public final zzaw f7604p;

    /* JADX INFO: renamed from: q */
    public final zzai f7605q;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions$a */
    public static final class C1922a {

        /* JADX INFO: renamed from: a */
        public FidoAppIdExtension f7606a;

        /* JADX INFO: renamed from: b */
        public UserVerificationMethodExtension f7607b;

        /* JADX INFO: renamed from: c */
        public zzs f7608c;

        /* JADX INFO: renamed from: d */
        public zzz f7609d;

        /* JADX INFO: renamed from: e */
        public zzab f7610e;

        /* JADX INFO: renamed from: f */
        public zzad f7611f;

        /* JADX INFO: renamed from: g */
        public zzu f7612g;

        /* JADX INFO: renamed from: h */
        public zzag f7613h;

        /* JADX INFO: renamed from: i */
        public GoogleThirdPartyPaymentExtension f7614i;

        /* JADX INFO: renamed from: j */
        public zzak f7615j;

        /* JADX INFO: renamed from: k */
        public zzaw f7616k;

        /* JADX INFO: renamed from: l */
        public zzai f7617l;

        @NonNull
        /* JADX INFO: renamed from: a */
        public AuthenticationExtensions m9255a() {
            return new AuthenticationExtensions(this.f7606a, this.f7608c, this.f7607b, this.f7609d, this.f7610e, this.f7611f, this.f7612g, this.f7613h, this.f7614i, this.f7615j, this.f7616k, this.f7617l);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1922a m9256b(FidoAppIdExtension fidoAppIdExtension) {
            this.f7606a = fidoAppIdExtension;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1922a m9257c(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f7614i = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1922a m9258d(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.f7607b = userVerificationMethodExtension;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final C1922a m9259e(zzs zzsVar) {
            this.f7608c = zzsVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final C1922a m9260f(zzu zzuVar) {
            this.f7612g = zzuVar;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final C1922a m9261g(zzz zzzVar) {
            this.f7609d = zzzVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final C1922a m9262h(zzab zzabVar) {
            this.f7610e = zzabVar;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final C1922a m9263i(zzad zzadVar) {
            this.f7611f = zzadVar;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final C1922a m9264j(zzag zzagVar) {
            this.f7613h = zzagVar;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final C1922a m9265k(zzak zzakVar) {
            this.f7615j = zzakVar;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public final C1922a m9266l(zzaw zzawVar) {
            this.f7616k = zzawVar;
            return this;
        }
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.f7594f = fidoAppIdExtension;
        this.f7596h = userVerificationMethodExtension;
        this.f7595g = zzsVar;
        this.f7597i = zzzVar;
        this.f7598j = zzabVar;
        this.f7599k = zzadVar;
        this.f7600l = zzuVar;
        this.f7601m = zzagVar;
        this.f7602n = googleThirdPartyPaymentExtension;
        this.f7603o = zzakVar;
        this.f7604p = zzawVar;
        this.f7605q = zzaiVar;
    }

    @NonNull
    /* JADX INFO: renamed from: x3 */
    public static AuthenticationExtensions m9252x3(@NonNull JSONObject jSONObject) throws JSONException {
        C1922a c1922a = new C1922a();
        if (jSONObject.has("fidoAppIdExtension")) {
            c1922a.m9256b(new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            c1922a.m9256b(new FidoAppIdExtension(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            c1922a.m9265k(zzak.m9359a(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            c1922a.m9265k(zzak.m9359a(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            c1922a.m9259e(new zzs(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            c1922a.m9258d(new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            c1922a.m9261g(new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            c1922a.m9262h(new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            c1922a.m9263i(new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            c1922a.m9260f(new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            c1922a.m9264j(new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            c1922a.m9257c(new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            c1922a.m9266l(new zzaw(jSONObject.getString("txAuthSimple")));
        }
        return c1922a.m9255a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return C8947k.m36026b(this.f7594f, authenticationExtensions.f7594f) && C8947k.m36026b(this.f7595g, authenticationExtensions.f7595g) && C8947k.m36026b(this.f7596h, authenticationExtensions.f7596h) && C8947k.m36026b(this.f7597i, authenticationExtensions.f7597i) && C8947k.m36026b(this.f7598j, authenticationExtensions.f7598j) && C8947k.m36026b(this.f7599k, authenticationExtensions.f7599k) && C8947k.m36026b(this.f7600l, authenticationExtensions.f7600l) && C8947k.m36026b(this.f7601m, authenticationExtensions.f7601m) && C8947k.m36026b(this.f7602n, authenticationExtensions.f7602n) && C8947k.m36026b(this.f7603o, authenticationExtensions.f7603o) && C8947k.m36026b(this.f7604p, authenticationExtensions.f7604p) && C8947k.m36026b(this.f7605q, authenticationExtensions.f7605q);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7594f, this.f7595g, this.f7596h, this.f7597i, this.f7598j, this.f7599k, this.f7600l, this.f7601m, this.f7602n, this.f7603o, this.f7604p, this.f7605q);
    }

    @NonNull
    public final String toString() {
        zzaw zzawVar = this.f7604p;
        zzak zzakVar = this.f7603o;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.f7602n;
        zzag zzagVar = this.f7601m;
        zzu zzuVar = this.f7600l;
        zzad zzadVar = this.f7599k;
        zzab zzabVar = this.f7598j;
        zzz zzzVar = this.f7597i;
        UserVerificationMethodExtension userVerificationMethodExtension = this.f7596h;
        zzs zzsVar = this.f7595g;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f7594f) + ", \n cableAuthenticationExtension=" + String.valueOf(zzsVar) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(zzzVar) + ", \n googleSessionIdExtension=" + String.valueOf(zzabVar) + ", \n googleSilentVerificationExtension=" + String.valueOf(zzadVar) + ", \n devicePublicKeyExtension=" + String.valueOf(zzuVar) + ", \n googleTunnelServerIdExtension=" + String.valueOf(zzagVar) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(zzakVar) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(zzawVar) + "}";
    }

    /* JADX INFO: renamed from: v3 */
    public FidoAppIdExtension m9253v3() {
        return this.f7594f;
    }

    /* JADX INFO: renamed from: w3 */
    public UserVerificationMethodExtension m9254w3() {
        return this.f7596h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 2, m9253v3(), i10, false);
        C9718b.m38476t(parcel, 3, this.f7595g, i10, false);
        C9718b.m38476t(parcel, 4, m9254w3(), i10, false);
        C9718b.m38476t(parcel, 5, this.f7597i, i10, false);
        C9718b.m38476t(parcel, 6, this.f7598j, i10, false);
        C9718b.m38476t(parcel, 7, this.f7599k, i10, false);
        C9718b.m38476t(parcel, 8, this.f7600l, i10, false);
        C9718b.m38476t(parcel, 9, this.f7601m, i10, false);
        C9718b.m38476t(parcel, 10, this.f7602n, i10, false);
        C9718b.m38476t(parcel, 11, this.f7603o, i10, false);
        C9718b.m38476t(parcel, 12, this.f7604p, i10, false);
        C9718b.m38476t(parcel, 13, this.f7605q, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
