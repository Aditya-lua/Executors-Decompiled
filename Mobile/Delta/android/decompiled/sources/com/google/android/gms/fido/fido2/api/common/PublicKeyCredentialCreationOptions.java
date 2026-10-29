package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.NonNull;
import ca.j;
import com.appsflyer.sdk_base.referrer.Payload;
import eb.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n9.k;
import n9.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialRpEntity f5971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialUserEntity f5972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final byte[] f5973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final List f5974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f5975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f5976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f5977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f5978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TokenBinding f5979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AttestationConveyancePreference f5980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AuthenticationExtensions f5981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ResultReceiver f5983r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PublicKeyCredentialRpEntity f5984a;
        public PublicKeyCredentialUserEntity b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f5985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f5986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Double f5987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f5988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public AuthenticatorSelectionCriteria f5989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f5990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public TokenBinding f5991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public AttestationConveyancePreference f5992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public AuthenticationExtensions f5993k;

        @NonNull
        public PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f5984a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
            byte[] bArr = this.f5985c;
            List list = this.f5986d;
            Double d10 = this.f5987e;
            List list2 = this.f5988f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f5989g;
            Integer num = this.f5990h;
            TokenBinding tokenBinding = this.f5991i;
            AttestationConveyancePreference attestationConveyancePreference = this.f5992j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d10, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f5993k, null, null);
        }

        @NonNull
        public a b(AttestationConveyancePreference attestationConveyancePreference) {
            this.f5992j = attestationConveyancePreference;
            return this;
        }

        @NonNull
        public a c(AuthenticationExtensions authenticationExtensions) {
            this.f5993k = authenticationExtensions;
            return this;
        }

        @NonNull
        public a d(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f5989g = authenticatorSelectionCriteria;
            return this;
        }

        @NonNull
        public a e(@NonNull byte[] bArr) {
            this.f5985c = (byte[]) m.l(bArr);
            return this;
        }

        @NonNull
        public a f(List<PublicKeyCredentialDescriptor> list) {
            this.f5988f = list;
            return this;
        }

        @NonNull
        public a g(@NonNull List<PublicKeyCredentialParameters> list) {
            this.f5986d = (List) m.l(list);
            return this;
        }

        @NonNull
        public a h(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f5984a = (PublicKeyCredentialRpEntity) m.l(publicKeyCredentialRpEntity);
            return this;
        }

        @NonNull
        public a i(Double d10) {
            this.f5987e = d10;
            return this;
        }

        @NonNull
        public a j(@NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.b = (PublicKeyCredentialUserEntity) m.l(publicKeyCredentialUserEntity);
            return this;
        }
    }

    public PublicKeyCredentialCreationOptions(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull byte[] bArr, @NonNull List list, Double d10, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.f5983r = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsH3 = H3(new JSONObject(str2));
                this.f5971f = publicKeyCredentialCreationOptionsH3.f5971f;
                this.f5972g = publicKeyCredentialCreationOptionsH3.f5972g;
                this.f5973h = publicKeyCredentialCreationOptionsH3.f5973h;
                this.f5974i = publicKeyCredentialCreationOptionsH3.f5974i;
                this.f5975j = publicKeyCredentialCreationOptionsH3.f5975j;
                this.f5976k = publicKeyCredentialCreationOptionsH3.f5976k;
                this.f5977l = publicKeyCredentialCreationOptionsH3.f5977l;
                this.f5978m = publicKeyCredentialCreationOptionsH3.f5978m;
                this.f5979n = publicKeyCredentialCreationOptionsH3.f5979n;
                this.f5980o = publicKeyCredentialCreationOptionsH3.f5980o;
                this.f5981p = publicKeyCredentialCreationOptionsH3.f5981p;
                this.f5982q = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f5971f = (PublicKeyCredentialRpEntity) m.l(publicKeyCredentialRpEntity);
        this.f5972g = (PublicKeyCredentialUserEntity) m.l(publicKeyCredentialUserEntity);
        this.f5973h = (byte[]) m.l(bArr);
        this.f5974i = (List) m.l(list);
        this.f5975j = d10;
        this.f5976k = list2;
        this.f5977l = authenticatorSelectionCriteria;
        this.f5978m = num;
        this.f5979n = tokenBinding;
        if (str != null) {
            try {
                this.f5980o = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f5980o = null;
        }
        this.f5981p = authenticationExtensions;
        this.f5982q = null;
    }

    @NonNull
    public static PublicKeyCredentialCreationOptions H3(@NonNull JSONObject jSONObject) throws JSONException {
        m0 m0VarC;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        aVar.h(new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        aVar.j(new PublicKeyCredentialUserEntity(u9.c.a(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        aVar.e(u9.c.a(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                m0VarC = m0.d(new PublicKeyCredentialParameters(jSONObject4.getString(Payload.TYPE), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                m0VarC = m0.c();
            }
            if (m0VarC.b()) {
                arrayList.add(m0VarC.a());
            }
        }
        aVar.g(arrayList);
        if (jSONObject.has("timeout")) {
            aVar.i(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(PublicKeyCredentialDescriptor.y3(jSONArray2.getJSONObject(i11)));
            }
            aVar.f(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            aVar.d(new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            aVar.c(AuthenticationExtensions.x3(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.b(AttestationConveyancePreference.a(jSONObject.getString("attestation")));
            } catch (AttestationConveyancePreference.a e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                aVar.b(AttestationConveyancePreference.NONE);
            }
        }
        return aVar.a();
    }

    public String A3() {
        return this.f5982q;
    }

    @NonNull
    public List<PublicKeyCredentialParameters> B3() {
        return this.f5974i;
    }

    public Integer C3() {
        return this.f5978m;
    }

    @NonNull
    public PublicKeyCredentialRpEntity D3() {
        return this.f5971f;
    }

    public Double E3() {
        return this.f5975j;
    }

    public TokenBinding F3() {
        return this.f5979n;
    }

    @NonNull
    public PublicKeyCredentialUserEntity G3() {
        return this.f5972g;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return k.b(this.f5971f, publicKeyCredentialCreationOptions.f5971f) && k.b(this.f5972g, publicKeyCredentialCreationOptions.f5972g) && Arrays.equals(this.f5973h, publicKeyCredentialCreationOptions.f5973h) && k.b(this.f5975j, publicKeyCredentialCreationOptions.f5975j) && this.f5974i.containsAll(publicKeyCredentialCreationOptions.f5974i) && publicKeyCredentialCreationOptions.f5974i.containsAll(this.f5974i) && (((list = this.f5976k) == null && publicKeyCredentialCreationOptions.f5976k == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f5976k) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f5976k.containsAll(this.f5976k))) && k.b(this.f5977l, publicKeyCredentialCreationOptions.f5977l) && k.b(this.f5978m, publicKeyCredentialCreationOptions.f5978m) && k.b(this.f5979n, publicKeyCredentialCreationOptions.f5979n) && k.b(this.f5980o, publicKeyCredentialCreationOptions.f5980o) && k.b(this.f5981p, publicKeyCredentialCreationOptions.f5981p) && k.b(this.f5982q, publicKeyCredentialCreationOptions.f5982q);
    }

    public int hashCode() {
        return k.c(this.f5971f, this.f5972g, Integer.valueOf(Arrays.hashCode(this.f5973h)), this.f5974i, this.f5975j, this.f5976k, this.f5977l, this.f5978m, this.f5979n, this.f5980o, this.f5981p, this.f5982q);
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.f5981p;
        AttestationConveyancePreference attestationConveyancePreference = this.f5980o;
        TokenBinding tokenBinding = this.f5979n;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f5977l;
        List list = this.f5976k;
        List list2 = this.f5974i;
        byte[] bArr = this.f5973h;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f5972g;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.f5971f) + ", \n user=" + String.valueOf(publicKeyCredentialUserEntity) + ", \n challenge=" + u9.c.b(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.f5975j + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.f5978m + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + "}";
    }

    public String v3() {
        AttestationConveyancePreference attestationConveyancePreference = this.f5980o;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public AuthenticationExtensions w3() {
        return this.f5981p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 2, D3(), i10, false);
        o9.b.t(parcel, 3, G3(), i10, false);
        o9.b.g(parcel, 4, y3(), false);
        o9.b.z(parcel, 5, B3(), false);
        o9.b.j(parcel, 6, E3(), false);
        o9.b.z(parcel, 7, z3(), false);
        o9.b.t(parcel, 8, x3(), i10, false);
        o9.b.q(parcel, 9, C3(), false);
        o9.b.t(parcel, 10, F3(), i10, false);
        o9.b.v(parcel, 11, v3(), false);
        o9.b.t(parcel, 12, w3(), i10, false);
        o9.b.v(parcel, 13, A3(), false);
        o9.b.t(parcel, 14, this.f5983r, i10, false);
        o9.b.b(parcel, iA);
    }

    public AuthenticatorSelectionCriteria x3() {
        return this.f5977l;
    }

    @NonNull
    public byte[] y3() {
        return this.f5973h;
    }

    public List<PublicKeyCredentialDescriptor> z3() {
        return this.f5976k;
    }

    public PublicKeyCredentialCreationOptions(@NonNull String str) {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsH3 = H3(new JSONObject(str));
            this.f5971f = publicKeyCredentialCreationOptionsH3.f5971f;
            this.f5972g = publicKeyCredentialCreationOptionsH3.f5972g;
            this.f5973h = publicKeyCredentialCreationOptionsH3.f5973h;
            this.f5974i = publicKeyCredentialCreationOptionsH3.f5974i;
            this.f5975j = publicKeyCredentialCreationOptionsH3.f5975j;
            this.f5976k = publicKeyCredentialCreationOptionsH3.f5976k;
            this.f5977l = publicKeyCredentialCreationOptionsH3.f5977l;
            this.f5978m = publicKeyCredentialCreationOptionsH3.f5978m;
            this.f5979n = publicKeyCredentialCreationOptionsH3.f5979n;
            this.f5980o = publicKeyCredentialCreationOptionsH3.f5980o;
            this.f5981p = publicKeyCredentialCreationOptionsH3.f5981p;
            this.f5982q = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
