package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.k;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import eb.p4;
import n9.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f5963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f5964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f5965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f5966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AuthenticatorErrorResponse f5967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f5968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f5970n;

    public PublicKeyCredential(String str, @NonNull String str2, m3 m3Var, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z10 = false;
        m.b((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && m3Var != null)) {
            z10 = true;
        }
        m.b(z10, "Must provide id and rawId if not an error response.");
        this.f5962f = str;
        this.f5963g = str2;
        this.f5964h = m3Var;
        this.f5965i = authenticatorAttestationResponse;
        this.f5966j = authenticatorAssertionResponse;
        this.f5967k = authenticatorErrorResponse;
        this.f5968l = authenticationExtensionsClientOutputs;
        this.f5969m = str3;
        this.f5970n = null;
    }

    @NonNull
    public static PublicKeyCredential a(@NonNull byte[] bArr) {
        return (PublicKeyCredential) o9.c.a(bArr, CREATOR);
    }

    @NonNull
    public String A3() {
        return this.f5963g;
    }

    @NonNull
    public String B3() {
        return C3().toString();
    }

    @NonNull
    public final JSONObject C3() {
        JSONObject jSONObjectY3;
        try {
            JSONObject jSONObject = new JSONObject();
            m3 m3Var = this.f5964h;
            if (m3Var != null && m3Var.p().length > 0) {
                jSONObject.put("rawId", u9.c.b(this.f5964h.p()));
            }
            String str = this.f5969m;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f5963g;
            if (str2 != null && this.f5967k == null) {
                jSONObject.put(Payload.TYPE, str2);
            }
            String str3 = this.f5962f;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = Payload.RESPONSE;
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f5966j;
            boolean z10 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectY3 = authenticatorAssertionResponse.A3();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f5965i;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectY3 = authenticatorAttestationResponse.z3();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.f5967k;
                    z10 = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObjectY3 = authenticatorErrorResponse.y3();
                        str4 = "error";
                    } else {
                        jSONObjectY3 = null;
                    }
                }
            }
            if (jSONObjectY3 != null) {
                jSONObject.put(str4, jSONObjectY3);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f5968l;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.x3());
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
        return n9.k.b(this.f5962f, publicKeyCredential.f5962f) && n9.k.b(this.f5963g, publicKeyCredential.f5963g) && n9.k.b(this.f5964h, publicKeyCredential.f5964h) && n9.k.b(this.f5965i, publicKeyCredential.f5965i) && n9.k.b(this.f5966j, publicKeyCredential.f5966j) && n9.k.b(this.f5967k, publicKeyCredential.f5967k) && n9.k.b(this.f5968l, publicKeyCredential.f5968l) && n9.k.b(this.f5969m, publicKeyCredential.f5969m);
    }

    public int hashCode() {
        return n9.k.c(this.f5962f, this.f5963g, this.f5964h, this.f5966j, this.f5965i, this.f5967k, this.f5968l, this.f5969m);
    }

    @NonNull
    public final String toString() {
        m3 m3Var = this.f5964h;
        byte[] bArrP = m3Var == null ? null : m3Var.p();
        String str = this.f5963g;
        String str2 = this.f5962f;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f5965i;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f5966j;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f5967k;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f5968l;
        String str3 = this.f5969m;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + u9.c.b(bArrP) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    public String v3() {
        return this.f5969m;
    }

    public AuthenticationExtensionsClientOutputs w3() {
        return this.f5968l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (p4.b()) {
            this.f5970n = C3().toString();
        }
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, x3(), false);
        o9.b.v(parcel, 2, A3(), false);
        o9.b.g(parcel, 3, y3(), false);
        o9.b.t(parcel, 4, this.f5965i, i10, false);
        o9.b.t(parcel, 5, this.f5966j, i10, false);
        o9.b.t(parcel, 6, this.f5967k, i10, false);
        o9.b.t(parcel, 7, w3(), i10, false);
        o9.b.v(parcel, 8, v3(), false);
        o9.b.v(parcel, 9, this.f5970n, false);
        o9.b.b(parcel, iA);
        this.f5970n = null;
    }

    public String x3() {
        return this.f5962f;
    }

    public byte[] y3() {
        m3 m3Var = this.f5964h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    @NonNull
    public AuthenticatorResponse z3() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f5965i;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f5966j;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f5967k;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public PublicKeyCredential(String str, @NonNull String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        this(str, str2, bArr == null ? null : m3.m(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
