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
    public final PublicKeyCredentialRpEntity f6044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialUserEntity f6045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final byte[] f6046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final List f6047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f6048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f6049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f6050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f6051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TokenBinding f6052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AttestationConveyancePreference f6053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AuthenticationExtensions f6054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ResultReceiver f6056r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PublicKeyCredentialRpEntity f6057a;
        public PublicKeyCredentialUserEntity b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f6058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f6059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Double f6060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f6061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public AuthenticatorSelectionCriteria f6062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f6063h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public TokenBinding f6064i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public AttestationConveyancePreference f6065j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public AuthenticationExtensions f6066k;

        @NonNull
        public PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f6057a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
            byte[] bArr = this.f6058c;
            List list = this.f6059d;
            Double d10 = this.f6060e;
            List list2 = this.f6061f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f6062g;
            Integer num = this.f6063h;
            TokenBinding tokenBinding = this.f6064i;
            AttestationConveyancePreference attestationConveyancePreference = this.f6065j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d10, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f6066k, null, null);
        }

        @NonNull
        public a b(AttestationConveyancePreference attestationConveyancePreference) {
            this.f6065j = attestationConveyancePreference;
            return this;
        }

        @NonNull
        public a c(AuthenticationExtensions authenticationExtensions) {
            this.f6066k = authenticationExtensions;
            return this;
        }

        @NonNull
        public a d(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f6062g = authenticatorSelectionCriteria;
            return this;
        }

        @NonNull
        public a e(@NonNull byte[] bArr) {
            this.f6058c = (byte[]) m.l(bArr);
            return this;
        }

        @NonNull
        public a f(List<PublicKeyCredentialDescriptor> list) {
            this.f6061f = list;
            return this;
        }

        @NonNull
        public a g(@NonNull List<PublicKeyCredentialParameters> list) {
            this.f6059d = (List) m.l(list);
            return this;
        }

        @NonNull
        public a h(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f6057a = (PublicKeyCredentialRpEntity) m.l(publicKeyCredentialRpEntity);
            return this;
        }

        @NonNull
        public a i(Double d10) {
            this.f6060e = d10;
            return this;
        }

        @NonNull
        public a j(@NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.b = (PublicKeyCredentialUserEntity) m.l(publicKeyCredentialUserEntity);
            return this;
        }
    }

    public PublicKeyCredentialCreationOptions(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull byte[] bArr, @NonNull List list, Double d10, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.f6056r = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsH3 = H3(new JSONObject(str2));
                this.f6044f = publicKeyCredentialCreationOptionsH3.f6044f;
                this.f6045g = publicKeyCredentialCreationOptionsH3.f6045g;
                this.f6046h = publicKeyCredentialCreationOptionsH3.f6046h;
                this.f6047i = publicKeyCredentialCreationOptionsH3.f6047i;
                this.f6048j = publicKeyCredentialCreationOptionsH3.f6048j;
                this.f6049k = publicKeyCredentialCreationOptionsH3.f6049k;
                this.f6050l = publicKeyCredentialCreationOptionsH3.f6050l;
                this.f6051m = publicKeyCredentialCreationOptionsH3.f6051m;
                this.f6052n = publicKeyCredentialCreationOptionsH3.f6052n;
                this.f6053o = publicKeyCredentialCreationOptionsH3.f6053o;
                this.f6054p = publicKeyCredentialCreationOptionsH3.f6054p;
                this.f6055q = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f6044f = (PublicKeyCredentialRpEntity) m.l(publicKeyCredentialRpEntity);
        this.f6045g = (PublicKeyCredentialUserEntity) m.l(publicKeyCredentialUserEntity);
        this.f6046h = (byte[]) m.l(bArr);
        this.f6047i = (List) m.l(list);
        this.f6048j = d10;
        this.f6049k = list2;
        this.f6050l = authenticatorSelectionCriteria;
        this.f6051m = num;
        this.f6052n = tokenBinding;
        if (str != null) {
            try {
                this.f6053o = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f6053o = null;
        }
        this.f6054p = authenticationExtensions;
        this.f6055q = null;
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
        return this.f6055q;
    }

    @NonNull
    public List<PublicKeyCredentialParameters> B3() {
        return this.f6047i;
    }

    public Integer C3() {
        return this.f6051m;
    }

    @NonNull
    public PublicKeyCredentialRpEntity D3() {
        return this.f6044f;
    }

    public Double E3() {
        return this.f6048j;
    }

    public TokenBinding F3() {
        return this.f6052n;
    }

    @NonNull
    public PublicKeyCredentialUserEntity G3() {
        return this.f6045g;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return k.b(this.f6044f, publicKeyCredentialCreationOptions.f6044f) && k.b(this.f6045g, publicKeyCredentialCreationOptions.f6045g) && Arrays.equals(this.f6046h, publicKeyCredentialCreationOptions.f6046h) && k.b(this.f6048j, publicKeyCredentialCreationOptions.f6048j) && this.f6047i.containsAll(publicKeyCredentialCreationOptions.f6047i) && publicKeyCredentialCreationOptions.f6047i.containsAll(this.f6047i) && (((list = this.f6049k) == null && publicKeyCredentialCreationOptions.f6049k == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f6049k) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f6049k.containsAll(this.f6049k))) && k.b(this.f6050l, publicKeyCredentialCreationOptions.f6050l) && k.b(this.f6051m, publicKeyCredentialCreationOptions.f6051m) && k.b(this.f6052n, publicKeyCredentialCreationOptions.f6052n) && k.b(this.f6053o, publicKeyCredentialCreationOptions.f6053o) && k.b(this.f6054p, publicKeyCredentialCreationOptions.f6054p) && k.b(this.f6055q, publicKeyCredentialCreationOptions.f6055q);
    }

    public int hashCode() {
        return k.c(this.f6044f, this.f6045g, Integer.valueOf(Arrays.hashCode(this.f6046h)), this.f6047i, this.f6048j, this.f6049k, this.f6050l, this.f6051m, this.f6052n, this.f6053o, this.f6054p, this.f6055q);
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.f6054p;
        AttestationConveyancePreference attestationConveyancePreference = this.f6053o;
        TokenBinding tokenBinding = this.f6052n;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f6050l;
        List list = this.f6049k;
        List list2 = this.f6047i;
        byte[] bArr = this.f6046h;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f6045g;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.f6044f) + ", \n user=" + String.valueOf(publicKeyCredentialUserEntity) + ", \n challenge=" + u9.c.b(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.f6048j + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.f6051m + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + "}";
    }

    public String v3() {
        AttestationConveyancePreference attestationConveyancePreference = this.f6053o;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public AuthenticationExtensions w3() {
        return this.f6054p;
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
        o9.b.t(parcel, 14, this.f6056r, i10, false);
        o9.b.b(parcel, iA);
    }

    public AuthenticatorSelectionCriteria x3() {
        return this.f6050l;
    }

    @NonNull
    public byte[] y3() {
        return this.f6046h;
    }

    public List<PublicKeyCredentialDescriptor> z3() {
        return this.f6049k;
    }

    public PublicKeyCredentialCreationOptions(@NonNull String str) {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsH3 = H3(new JSONObject(str));
            this.f6044f = publicKeyCredentialCreationOptionsH3.f6044f;
            this.f6045g = publicKeyCredentialCreationOptionsH3.f6045g;
            this.f6046h = publicKeyCredentialCreationOptionsH3.f6046h;
            this.f6047i = publicKeyCredentialCreationOptionsH3.f6047i;
            this.f6048j = publicKeyCredentialCreationOptionsH3.f6048j;
            this.f6049k = publicKeyCredentialCreationOptionsH3.f6049k;
            this.f6050l = publicKeyCredentialCreationOptionsH3.f6050l;
            this.f6051m = publicKeyCredentialCreationOptionsH3.f6051m;
            this.f6052n = publicKeyCredentialCreationOptionsH3.f6052n;
            this.f6053o = publicKeyCredentialCreationOptionsH3.f6053o;
            this.f6054p = publicKeyCredentialCreationOptionsH3.f6054p;
            this.f6055q = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
