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
    public final FidoAppIdExtension f5899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzs f5900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UserVerificationMethodExtension f5901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzz f5902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzab f5903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzad f5904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzu f5905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zzag f5906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f5907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzak f5908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzaw f5909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzai f5910q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FidoAppIdExtension f5911a;
        public UserVerificationMethodExtension b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzs f5912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zzz f5913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zzab f5914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zzad f5915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public zzu f5916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public zzag f5917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public GoogleThirdPartyPaymentExtension f5918i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public zzak f5919j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public zzaw f5920k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public zzai f5921l;

        @NonNull
        public AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.f5911a, this.f5912c, this.b, this.f5913d, this.f5914e, this.f5915f, this.f5916g, this.f5917h, this.f5918i, this.f5919j, this.f5920k, this.f5921l);
        }

        @NonNull
        public a b(FidoAppIdExtension fidoAppIdExtension) {
            this.f5911a = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public a c(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f5918i = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public a d(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.b = userVerificationMethodExtension;
            return this;
        }

        public final a e(zzs zzsVar) {
            this.f5912c = zzsVar;
            return this;
        }

        public final a f(zzu zzuVar) {
            this.f5916g = zzuVar;
            return this;
        }

        public final a g(zzz zzzVar) {
            this.f5913d = zzzVar;
            return this;
        }

        public final a h(zzab zzabVar) {
            this.f5914e = zzabVar;
            return this;
        }

        public final a i(zzad zzadVar) {
            this.f5915f = zzadVar;
            return this;
        }

        public final a j(zzag zzagVar) {
            this.f5917h = zzagVar;
            return this;
        }

        public final a k(zzak zzakVar) {
            this.f5919j = zzakVar;
            return this;
        }

        public final a l(zzaw zzawVar) {
            this.f5920k = zzawVar;
            return this;
        }
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.f5899f = fidoAppIdExtension;
        this.f5901h = userVerificationMethodExtension;
        this.f5900g = zzsVar;
        this.f5902i = zzzVar;
        this.f5903j = zzabVar;
        this.f5904k = zzadVar;
        this.f5905l = zzuVar;
        this.f5906m = zzagVar;
        this.f5907n = googleThirdPartyPaymentExtension;
        this.f5908o = zzakVar;
        this.f5909p = zzawVar;
        this.f5910q = zzaiVar;
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
        return k.b(this.f5899f, authenticationExtensions.f5899f) && k.b(this.f5900g, authenticationExtensions.f5900g) && k.b(this.f5901h, authenticationExtensions.f5901h) && k.b(this.f5902i, authenticationExtensions.f5902i) && k.b(this.f5903j, authenticationExtensions.f5903j) && k.b(this.f5904k, authenticationExtensions.f5904k) && k.b(this.f5905l, authenticationExtensions.f5905l) && k.b(this.f5906m, authenticationExtensions.f5906m) && k.b(this.f5907n, authenticationExtensions.f5907n) && k.b(this.f5908o, authenticationExtensions.f5908o) && k.b(this.f5909p, authenticationExtensions.f5909p) && k.b(this.f5910q, authenticationExtensions.f5910q);
    }

    public int hashCode() {
        return k.c(this.f5899f, this.f5900g, this.f5901h, this.f5902i, this.f5903j, this.f5904k, this.f5905l, this.f5906m, this.f5907n, this.f5908o, this.f5909p, this.f5910q);
    }

    @NonNull
    public final String toString() {
        zzaw zzawVar = this.f5909p;
        zzak zzakVar = this.f5908o;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.f5907n;
        zzag zzagVar = this.f5906m;
        zzu zzuVar = this.f5905l;
        zzad zzadVar = this.f5904k;
        zzab zzabVar = this.f5903j;
        zzz zzzVar = this.f5902i;
        UserVerificationMethodExtension userVerificationMethodExtension = this.f5901h;
        zzs zzsVar = this.f5900g;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f5899f) + ", \n cableAuthenticationExtension=" + String.valueOf(zzsVar) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(zzzVar) + ", \n googleSessionIdExtension=" + String.valueOf(zzabVar) + ", \n googleSilentVerificationExtension=" + String.valueOf(zzadVar) + ", \n devicePublicKeyExtension=" + String.valueOf(zzuVar) + ", \n googleTunnelServerIdExtension=" + String.valueOf(zzagVar) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(zzakVar) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(zzawVar) + "}";
    }

    public FidoAppIdExtension v3() {
        return this.f5899f;
    }

    public UserVerificationMethodExtension w3() {
        return this.f5901h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 2, v3(), i10, false);
        o9.b.t(parcel, 3, this.f5900g, i10, false);
        o9.b.t(parcel, 4, w3(), i10, false);
        o9.b.t(parcel, 5, this.f5902i, i10, false);
        o9.b.t(parcel, 6, this.f5903j, i10, false);
        o9.b.t(parcel, 7, this.f5904k, i10, false);
        o9.b.t(parcel, 8, this.f5905l, i10, false);
        o9.b.t(parcel, 9, this.f5906m, i10, false);
        o9.b.t(parcel, 10, this.f5907n, i10, false);
        o9.b.t(parcel, 11, this.f5908o, i10, false);
        o9.b.t(parcel, 12, this.f5909p, i10, false);
        o9.b.t(parcel, 13, this.f5910q, i10, false);
        o9.b.b(parcel, iA);
    }
}
