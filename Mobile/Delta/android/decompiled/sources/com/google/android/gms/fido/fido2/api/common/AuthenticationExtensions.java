package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import n9.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FidoAppIdExtension f5972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzs f5973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UserVerificationMethodExtension f5974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzz f5975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzab f5976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzad f5977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzu f5978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zzag f5979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f5980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzak f5981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzaw f5982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzai f5983q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FidoAppIdExtension f5984a;
        public UserVerificationMethodExtension b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzs f5985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zzz f5986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zzab f5987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zzad f5988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public zzu f5989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public zzag f5990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public GoogleThirdPartyPaymentExtension f5991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public zzak f5992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public zzaw f5993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public zzai f5994l;

        @NonNull
        public AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.f5984a, this.f5985c, this.b, this.f5986d, this.f5987e, this.f5988f, this.f5989g, this.f5990h, this.f5991i, this.f5992j, this.f5993k, this.f5994l);
        }

        @NonNull
        public a b(FidoAppIdExtension fidoAppIdExtension) {
            this.f5984a = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public a c(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f5991i = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public a d(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.b = userVerificationMethodExtension;
            return this;
        }

        public final a e(zzs zzsVar) {
            this.f5985c = zzsVar;
            return this;
        }

        public final a f(zzu zzuVar) {
            this.f5989g = zzuVar;
            return this;
        }

        public final a g(zzz zzzVar) {
            this.f5986d = zzzVar;
            return this;
        }

        public final a h(zzab zzabVar) {
            this.f5987e = zzabVar;
            return this;
        }

        public final a i(zzad zzadVar) {
            this.f5988f = zzadVar;
            return this;
        }

        public final a j(zzag zzagVar) {
            this.f5990h = zzagVar;
            return this;
        }

        public final a k(zzak zzakVar) {
            this.f5992j = zzakVar;
            return this;
        }

        public final a l(zzaw zzawVar) {
            this.f5993k = zzawVar;
            return this;
        }
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.f5972f = fidoAppIdExtension;
        this.f5974h = userVerificationMethodExtension;
        this.f5973g = zzsVar;
        this.f5975i = zzzVar;
        this.f5976j = zzabVar;
        this.f5977k = zzadVar;
        this.f5978l = zzuVar;
        this.f5979m = zzagVar;
        this.f5980n = googleThirdPartyPaymentExtension;
        this.f5981o = zzakVar;
        this.f5982p = zzawVar;
        this.f5983q = zzaiVar;
    }

    @NonNull
    public static AuthenticationExtensions x3(@NonNull JSONObject jSONObject) throws JSONException {
        a aVar = new a();
        if (jSONObject.has("fidoAppIdExtension")) {
            aVar.b(new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            aVar.b(new FidoAppIdExtension(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            aVar.k(zzak.a(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            aVar.k(zzak.a(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            aVar.e(new zzs(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            aVar.d(new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            aVar.g(new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            aVar.h(new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            aVar.i(new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            aVar.f(new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            aVar.j(new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            aVar.c(new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            aVar.l(new zzaw(jSONObject.getString("txAuthSimple")));
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return k.b(this.f5972f, authenticationExtensions.f5972f) && k.b(this.f5973g, authenticationExtensions.f5973g) && k.b(this.f5974h, authenticationExtensions.f5974h) && k.b(this.f5975i, authenticationExtensions.f5975i) && k.b(this.f5976j, authenticationExtensions.f5976j) && k.b(this.f5977k, authenticationExtensions.f5977k) && k.b(this.f5978l, authenticationExtensions.f5978l) && k.b(this.f5979m, authenticationExtensions.f5979m) && k.b(this.f5980n, authenticationExtensions.f5980n) && k.b(this.f5981o, authenticationExtensions.f5981o) && k.b(this.f5982p, authenticationExtensions.f5982p) && k.b(this.f5983q, authenticationExtensions.f5983q);
    }

    public int hashCode() {
        return k.c(this.f5972f, this.f5973g, this.f5974h, this.f5975i, this.f5976j, this.f5977k, this.f5978l, this.f5979m, this.f5980n, this.f5981o, this.f5982p, this.f5983q);
    }

    @NonNull
    public final String toString() {
        zzaw zzawVar = this.f5982p;
        zzak zzakVar = this.f5981o;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.f5980n;
        zzag zzagVar = this.f5979m;
        zzu zzuVar = this.f5978l;
        zzad zzadVar = this.f5977k;
        zzab zzabVar = this.f5976j;
        zzz zzzVar = this.f5975i;
        UserVerificationMethodExtension userVerificationMethodExtension = this.f5974h;
        zzs zzsVar = this.f5973g;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f5972f) + ", \n cableAuthenticationExtension=" + String.valueOf(zzsVar) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(zzzVar) + ", \n googleSessionIdExtension=" + String.valueOf(zzabVar) + ", \n googleSilentVerificationExtension=" + String.valueOf(zzadVar) + ", \n devicePublicKeyExtension=" + String.valueOf(zzuVar) + ", \n googleTunnelServerIdExtension=" + String.valueOf(zzagVar) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(zzakVar) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(zzawVar) + "}";
    }

    public FidoAppIdExtension v3() {
        return this.f5972f;
    }

    public UserVerificationMethodExtension w3() {
        return this.f5974h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 2, v3(), i10, false);
        o9.b.t(parcel, 3, this.f5973g, i10, false);
        o9.b.t(parcel, 4, w3(), i10, false);
        o9.b.t(parcel, 5, this.f5975i, i10, false);
        o9.b.t(parcel, 6, this.f5976j, i10, false);
        o9.b.t(parcel, 7, this.f5977k, i10, false);
        o9.b.t(parcel, 8, this.f5978l, i10, false);
        o9.b.t(parcel, 9, this.f5979m, i10, false);
        o9.b.t(parcel, 10, this.f5980n, i10, false);
        o9.b.t(parcel, 11, this.f5981o, i10, false);
        o9.b.t(parcel, 12, this.f5982p, i10, false);
        o9.b.t(parcel, 13, this.f5983q, i10, false);
        o9.b.b(parcel, iA);
    }
}
