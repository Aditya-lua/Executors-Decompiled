package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1598k;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.AbstractC4970m3;
import p100eb.C4989p4;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p325o9.C9719c;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new C1598k();

    /* JADX INFO: renamed from: f */
    public final String f7660f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final String f7661g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4970m3 f7662h;

    /* JADX INFO: renamed from: i */
    public final AuthenticatorAttestationResponse f7663i;

    /* JADX INFO: renamed from: j */
    public final AuthenticatorAssertionResponse f7664j;

    /* JADX INFO: renamed from: k */
    public final AuthenticatorErrorResponse f7665k;

    /* JADX INFO: renamed from: l */
    public final AuthenticationExtensionsClientOutputs f7666l;

    /* JADX INFO: renamed from: m */
    public final String f7667m;

    /* JADX INFO: renamed from: n */
    public String f7668n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PublicKeyCredential(String str, @NonNull String str2, AbstractC4970m3 abstractC4970m3, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z10 = false;
        C8953m.m36037b((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && abstractC4970m3 != null)) {
            z10 = true;
        }
        C8953m.m36037b(z10, "Must provide id and rawId if not an error response.");
        this.f7660f = str;
        this.f7661g = str2;
        this.f7662h = abstractC4970m3;
        this.f7663i = authenticatorAttestationResponse;
        this.f7664j = authenticatorAssertionResponse;
        this.f7665k = authenticatorErrorResponse;
        this.f7666l = authenticationExtensionsClientOutputs;
        this.f7667m = str3;
        this.f7668n = null;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static PublicKeyCredential m9301a(@NonNull byte[] bArr) {
        return (PublicKeyCredential) C9719c.m38483a(bArr, CREATOR);
    }

    @NonNull
    /* JADX INFO: renamed from: A3 */
    public String m9302A3() {
        return this.f7661g;
    }

    @NonNull
    /* JADX INFO: renamed from: B3 */
    public String m9303B3() {
        return m9304C3().toString();
    }

    @NonNull
    /* JADX INFO: renamed from: C3 */
    public final JSONObject m9304C3() {
        JSONObject jSONObjectM9286y3;
        try {
            JSONObject jSONObject = new JSONObject();
            AbstractC4970m3 abstractC4970m3 = this.f7662h;
            if (abstractC4970m3 != null && abstractC4970m3.m23675p().length > 0) {
                jSONObject.put("rawId", C11812c.m44172b(this.f7662h.m23675p()));
            }
            String str = this.f7667m;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f7661g;
            if (str2 != null && this.f7665k == null) {
                jSONObject.put(Payload.TYPE, str2);
            }
            String str3 = this.f7660f;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = Payload.RESPONSE;
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f7664j;
            boolean z10 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectM9286y3 = authenticatorAssertionResponse.m9272A3();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f7663i;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectM9286y3 = authenticatorAttestationResponse.m9282z3();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.f7665k;
                    z10 = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObjectM9286y3 = authenticatorErrorResponse.m9286y3();
                        str4 = "error";
                    } else {
                        jSONObjectM9286y3 = null;
                    }
                }
            }
            if (jSONObjectM9286y3 != null) {
                jSONObject.put(str4, jSONObjectM9286y3);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f7666l;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.m9269x3());
                return jSONObject;
            }
            if (z10) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return C8947k.m36026b(this.f7660f, publicKeyCredential.f7660f) && C8947k.m36026b(this.f7661g, publicKeyCredential.f7661g) && C8947k.m36026b(this.f7662h, publicKeyCredential.f7662h) && C8947k.m36026b(this.f7663i, publicKeyCredential.f7663i) && C8947k.m36026b(this.f7664j, publicKeyCredential.f7664j) && C8947k.m36026b(this.f7665k, publicKeyCredential.f7665k) && C8947k.m36026b(this.f7666l, publicKeyCredential.f7666l) && C8947k.m36026b(this.f7667m, publicKeyCredential.f7667m);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7660f, this.f7661g, this.f7662h, this.f7664j, this.f7663i, this.f7665k, this.f7666l, this.f7667m);
    }

    @NonNull
    public final String toString() {
        AbstractC4970m3 abstractC4970m3 = this.f7662h;
        byte[] bArrM23675p = abstractC4970m3 == null ? null : abstractC4970m3.m23675p();
        String str = this.f7661g;
        String str2 = this.f7660f;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f7663i;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f7664j;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f7665k;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f7666l;
        String str3 = this.f7667m;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + C11812c.m44172b(bArrM23675p) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    /* JADX INFO: renamed from: v3 */
    public String m9305v3() {
        return this.f7667m;
    }

    /* JADX INFO: renamed from: w3 */
    public AuthenticationExtensionsClientOutputs m9306w3() {
        return this.f7666l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (C4989p4.m23690b()) {
            this.f7668n = m9304C3().toString();
        }
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, m9307x3(), false);
        C9718b.m38478v(parcel, 2, m9302A3(), false);
        C9718b.m38463g(parcel, 3, m9308y3(), false);
        C9718b.m38476t(parcel, 4, this.f7663i, i10, false);
        C9718b.m38476t(parcel, 5, this.f7664j, i10, false);
        C9718b.m38476t(parcel, 6, this.f7665k, i10, false);
        C9718b.m38476t(parcel, 7, m9306w3(), i10, false);
        C9718b.m38478v(parcel, 8, m9305v3(), false);
        C9718b.m38478v(parcel, 9, this.f7668n, false);
        C9718b.m38458b(parcel, iM38457a);
        this.f7668n = null;
    }

    /* JADX INFO: renamed from: x3 */
    public String m9307x3() {
        return this.f7660f;
    }

    /* JADX INFO: renamed from: y3 */
    public byte[] m9308y3() {
        AbstractC4970m3 abstractC4970m3 = this.f7662h;
        if (abstractC4970m3 == null) {
            return null;
        }
        return abstractC4970m3.m23675p();
    }

    @NonNull
    /* JADX INFO: renamed from: z3 */
    public AuthenticatorResponse m9309z3() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f7663i;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f7664j;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f7665k;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public PublicKeyCredential(String str, @NonNull String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        this(str, str2, bArr == null ? null : AbstractC4970m3.m23673m(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
