package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.NonNull;
import ca.C1597j;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.AbstractC4967m0;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C1597j();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PublicKeyCredentialRpEntity f7669f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final PublicKeyCredentialUserEntity f7670g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final byte[] f7671h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final List f7672i;

    /* JADX INFO: renamed from: j */
    public final Double f7673j;

    /* JADX INFO: renamed from: k */
    public final List f7674k;

    /* JADX INFO: renamed from: l */
    public final AuthenticatorSelectionCriteria f7675l;

    /* JADX INFO: renamed from: m */
    public final Integer f7676m;

    /* JADX INFO: renamed from: n */
    public final TokenBinding f7677n;

    /* JADX INFO: renamed from: o */
    public final AttestationConveyancePreference f7678o;

    /* JADX INFO: renamed from: p */
    public final AuthenticationExtensions f7679p;

    /* JADX INFO: renamed from: q */
    public final String f7680q;

    /* JADX INFO: renamed from: r */
    public ResultReceiver f7681r;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$a */
    public static final class C1926a {

        /* JADX INFO: renamed from: a */
        public PublicKeyCredentialRpEntity f7682a;

        /* JADX INFO: renamed from: b */
        public PublicKeyCredentialUserEntity f7683b;

        /* JADX INFO: renamed from: c */
        public byte[] f7684c;

        /* JADX INFO: renamed from: d */
        public List f7685d;

        /* JADX INFO: renamed from: e */
        public Double f7686e;

        /* JADX INFO: renamed from: f */
        public List f7687f;

        /* JADX INFO: renamed from: g */
        public AuthenticatorSelectionCriteria f7688g;

        /* JADX INFO: renamed from: h */
        public Integer f7689h;

        /* JADX INFO: renamed from: i */
        public TokenBinding f7690i;

        /* JADX INFO: renamed from: j */
        public AttestationConveyancePreference f7691j;

        /* JADX INFO: renamed from: k */
        public AuthenticationExtensions f7692k;

        @NonNull
        /* JADX INFO: renamed from: a */
        public PublicKeyCredentialCreationOptions m9323a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f7682a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f7683b;
            byte[] bArr = this.f7684c;
            List list = this.f7685d;
            Double d10 = this.f7686e;
            List list2 = this.f7687f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f7688g;
            Integer num = this.f7689h;
            TokenBinding tokenBinding = this.f7690i;
            AttestationConveyancePreference attestationConveyancePreference = this.f7691j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d10, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f7692k, null, null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1926a m9324b(AttestationConveyancePreference attestationConveyancePreference) {
            this.f7691j = attestationConveyancePreference;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1926a m9325c(AuthenticationExtensions authenticationExtensions) {
            this.f7692k = authenticationExtensions;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1926a m9326d(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f7688g = authenticatorSelectionCriteria;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C1926a m9327e(@NonNull byte[] bArr) {
            this.f7684c = (byte[]) C8953m.m36047l(bArr);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public C1926a m9328f(List<PublicKeyCredentialDescriptor> list) {
            this.f7687f = list;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public C1926a m9329g(@NonNull List<PublicKeyCredentialParameters> list) {
            this.f7685d = (List) C8953m.m36047l(list);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public C1926a m9330h(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f7682a = (PublicKeyCredentialRpEntity) C8953m.m36047l(publicKeyCredentialRpEntity);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public C1926a m9331i(Double d10) {
            this.f7686e = d10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public C1926a m9332j(@NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.f7683b = (PublicKeyCredentialUserEntity) C8953m.m36047l(publicKeyCredentialUserEntity);
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PublicKeyCredentialCreationOptions(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull byte[] bArr, @NonNull List list, Double d10, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.f7681r = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsM9310H3 = m9310H3(new JSONObject(str2));
                this.f7669f = publicKeyCredentialCreationOptionsM9310H3.f7669f;
                this.f7670g = publicKeyCredentialCreationOptionsM9310H3.f7670g;
                this.f7671h = publicKeyCredentialCreationOptionsM9310H3.f7671h;
                this.f7672i = publicKeyCredentialCreationOptionsM9310H3.f7672i;
                this.f7673j = publicKeyCredentialCreationOptionsM9310H3.f7673j;
                this.f7674k = publicKeyCredentialCreationOptionsM9310H3.f7674k;
                this.f7675l = publicKeyCredentialCreationOptionsM9310H3.f7675l;
                this.f7676m = publicKeyCredentialCreationOptionsM9310H3.f7676m;
                this.f7677n = publicKeyCredentialCreationOptionsM9310H3.f7677n;
                this.f7678o = publicKeyCredentialCreationOptionsM9310H3.f7678o;
                this.f7679p = publicKeyCredentialCreationOptionsM9310H3.f7679p;
                this.f7680q = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f7669f = (PublicKeyCredentialRpEntity) C8953m.m36047l(publicKeyCredentialRpEntity);
        this.f7670g = (PublicKeyCredentialUserEntity) C8953m.m36047l(publicKeyCredentialUserEntity);
        this.f7671h = (byte[]) C8953m.m36047l(bArr);
        this.f7672i = (List) C8953m.m36047l(list);
        this.f7673j = d10;
        this.f7674k = list2;
        this.f7675l = authenticatorSelectionCriteria;
        this.f7676m = num;
        this.f7677n = tokenBinding;
        if (str != null) {
            try {
                this.f7678o = AttestationConveyancePreference.m9251a(str);
            } catch (AttestationConveyancePreference.C1921a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f7678o = null;
        }
        this.f7679p = authenticationExtensions;
        this.f7680q = null;
    }

    @NonNull
    /* JADX INFO: renamed from: H3 */
    public static PublicKeyCredentialCreationOptions m9310H3(@NonNull JSONObject jSONObject) throws JSONException {
        AbstractC4967m0 abstractC4967m0M23660c;
        C1926a c1926a = new C1926a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        c1926a.m9330h(new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        c1926a.m9332j(new PublicKeyCredentialUserEntity(C11812c.m44171a(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        c1926a.m9327e(C11812c.m44171a(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                abstractC4967m0M23660c = AbstractC4967m0.m23661d(new PublicKeyCredentialParameters(jSONObject4.getString(Payload.TYPE), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                abstractC4967m0M23660c = AbstractC4967m0.m23660c();
            }
            if (abstractC4967m0M23660c.mo23663b()) {
                arrayList.add(abstractC4967m0M23660c.mo23662a());
            }
        }
        c1926a.m9329g(arrayList);
        if (jSONObject.has("timeout")) {
            c1926a.m9331i(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(PublicKeyCredentialDescriptor.m9333y3(jSONArray2.getJSONObject(i11)));
            }
            c1926a.m9328f(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            c1926a.m9326d(new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            c1926a.m9325c(AuthenticationExtensions.m9252x3(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                c1926a.m9324b(AttestationConveyancePreference.m9251a(jSONObject.getString("attestation")));
            } catch (AttestationConveyancePreference.C1921a e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                c1926a.m9324b(AttestationConveyancePreference.NONE);
            }
        }
        return c1926a.m9323a();
    }

    /* JADX INFO: renamed from: A3 */
    public String m9311A3() {
        return this.f7680q;
    }

    @NonNull
    /* JADX INFO: renamed from: B3 */
    public List<PublicKeyCredentialParameters> m9312B3() {
        return this.f7672i;
    }

    /* JADX INFO: renamed from: C3 */
    public Integer m9313C3() {
        return this.f7676m;
    }

    @NonNull
    /* JADX INFO: renamed from: D3 */
    public PublicKeyCredentialRpEntity m9314D3() {
        return this.f7669f;
    }

    /* JADX INFO: renamed from: E3 */
    public Double m9315E3() {
        return this.f7673j;
    }

    /* JADX INFO: renamed from: F3 */
    public TokenBinding m9316F3() {
        return this.f7677n;
    }

    @NonNull
    /* JADX INFO: renamed from: G3 */
    public PublicKeyCredentialUserEntity m9317G3() {
        return this.f7670g;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return C8947k.m36026b(this.f7669f, publicKeyCredentialCreationOptions.f7669f) && C8947k.m36026b(this.f7670g, publicKeyCredentialCreationOptions.f7670g) && Arrays.equals(this.f7671h, publicKeyCredentialCreationOptions.f7671h) && C8947k.m36026b(this.f7673j, publicKeyCredentialCreationOptions.f7673j) && this.f7672i.containsAll(publicKeyCredentialCreationOptions.f7672i) && publicKeyCredentialCreationOptions.f7672i.containsAll(this.f7672i) && (((list = this.f7674k) == null && publicKeyCredentialCreationOptions.f7674k == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f7674k) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f7674k.containsAll(this.f7674k))) && C8947k.m36026b(this.f7675l, publicKeyCredentialCreationOptions.f7675l) && C8947k.m36026b(this.f7676m, publicKeyCredentialCreationOptions.f7676m) && C8947k.m36026b(this.f7677n, publicKeyCredentialCreationOptions.f7677n) && C8947k.m36026b(this.f7678o, publicKeyCredentialCreationOptions.f7678o) && C8947k.m36026b(this.f7679p, publicKeyCredentialCreationOptions.f7679p) && C8947k.m36026b(this.f7680q, publicKeyCredentialCreationOptions.f7680q);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7669f, this.f7670g, Integer.valueOf(Arrays.hashCode(this.f7671h)), this.f7672i, this.f7673j, this.f7674k, this.f7675l, this.f7676m, this.f7677n, this.f7678o, this.f7679p, this.f7680q);
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.f7679p;
        AttestationConveyancePreference attestationConveyancePreference = this.f7678o;
        TokenBinding tokenBinding = this.f7677n;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f7675l;
        List list = this.f7674k;
        List list2 = this.f7672i;
        byte[] bArr = this.f7671h;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f7670g;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.f7669f) + ", \n user=" + String.valueOf(publicKeyCredentialUserEntity) + ", \n challenge=" + C11812c.m44172b(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.f7673j + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.f7676m + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + "}";
    }

    /* JADX INFO: renamed from: v3 */
    public String m9318v3() {
        AttestationConveyancePreference attestationConveyancePreference = this.f7678o;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    /* JADX INFO: renamed from: w3 */
    public AuthenticationExtensions m9319w3() {
        return this.f7679p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 2, m9314D3(), i10, false);
        C9718b.m38476t(parcel, 3, m9317G3(), i10, false);
        C9718b.m38463g(parcel, 4, m9321y3(), false);
        C9718b.m38482z(parcel, 5, m9312B3(), false);
        C9718b.m38466j(parcel, 6, m9315E3(), false);
        C9718b.m38482z(parcel, 7, m9322z3(), false);
        C9718b.m38476t(parcel, 8, m9320x3(), i10, false);
        C9718b.m38473q(parcel, 9, m9313C3(), false);
        C9718b.m38476t(parcel, 10, m9316F3(), i10, false);
        C9718b.m38478v(parcel, 11, m9318v3(), false);
        C9718b.m38476t(parcel, 12, m9319w3(), i10, false);
        C9718b.m38478v(parcel, 13, m9311A3(), false);
        C9718b.m38476t(parcel, 14, this.f7681r, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public AuthenticatorSelectionCriteria m9320x3() {
        return this.f7675l;
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public byte[] m9321y3() {
        return this.f7671h;
    }

    /* JADX INFO: renamed from: z3 */
    public List<PublicKeyCredentialDescriptor> m9322z3() {
        return this.f7674k;
    }

    public PublicKeyCredentialCreationOptions(@NonNull String str) {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsM9310H3 = m9310H3(new JSONObject(str));
            this.f7669f = publicKeyCredentialCreationOptionsM9310H3.f7669f;
            this.f7670g = publicKeyCredentialCreationOptionsM9310H3.f7670g;
            this.f7671h = publicKeyCredentialCreationOptionsM9310H3.f7671h;
            this.f7672i = publicKeyCredentialCreationOptionsM9310H3.f7672i;
            this.f7673j = publicKeyCredentialCreationOptionsM9310H3.f7673j;
            this.f7674k = publicKeyCredentialCreationOptionsM9310H3.f7674k;
            this.f7675l = publicKeyCredentialCreationOptionsM9310H3.f7675l;
            this.f7676m = publicKeyCredentialCreationOptionsM9310H3.f7676m;
            this.f7677n = publicKeyCredentialCreationOptionsM9310H3.f7677n;
            this.f7678o = publicKeyCredentialCreationOptionsM9310H3.f7678o;
            this.f7679p = publicKeyCredentialCreationOptionsM9310H3.f7679p;
            this.f7680q = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
