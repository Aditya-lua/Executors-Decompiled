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
    public final String f6035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f6036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f6037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f6038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f6039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AuthenticatorErrorResponse f6040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f6041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f6043n;

    public PublicKeyCredential(String str, @NonNull String str2, m3 m3Var, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z10 = false;
        m.b((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && m3Var != null)) {
            z10 = true;
        }
        m.b(z10, "Must provide id and rawId if not an error response.");
        this.f6035f = str;
        this.f6036g = str2;
        this.f6037h = m3Var;
        this.f6038i = authenticatorAttestationResponse;
        this.f6039j = authenticatorAssertionResponse;
        this.f6040k = authenticatorErrorResponse;
        this.f6041l = authenticationExtensionsClientOutputs;
        this.f6042m = str3;
        this.f6043n = null;
    }

    @NonNull
    public static PublicKeyCredential a(@NonNull byte[] bArr) {
        return (PublicKeyCredential) o9.c.a(bArr, CREATOR);
    }

    @NonNull
    public String A3() {
        return this.f6036g;
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
            m3 m3Var = this.f6037h;
            if (m3Var != null && m3Var.p().length > 0) {
                jSONObject.put("rawId", u9.c.b(this.f6037h.p()));
            }
            String str = this.f6042m;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f6036g;
            if (str2 != null && this.f6040k == null) {
                jSONObject.put(Payload.TYPE, str2);
            }
            String str3 = this.f6035f;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = Payload.RESPONSE;
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6039j;
            boolean z10 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectY3 = authenticatorAssertionResponse.A3();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6038i;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectY3 = authenticatorAttestationResponse.z3();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.f6040k;
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
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f6041l;
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
        return n9.k.b(this.f6035f, publicKeyCredential.f6035f) && n9.k.b(this.f6036g, publicKeyCredential.f6036g) && n9.k.b(this.f6037h, publicKeyCredential.f6037h) && n9.k.b(this.f6038i, publicKeyCredential.f6038i) && n9.k.b(this.f6039j, publicKeyCredential.f6039j) && n9.k.b(this.f6040k, publicKeyCredential.f6040k) && n9.k.b(this.f6041l, publicKeyCredential.f6041l) && n9.k.b(this.f6042m, publicKeyCredential.f6042m);
    }

    public int hashCode() {
        return n9.k.c(this.f6035f, this.f6036g, this.f6037h, this.f6039j, this.f6038i, this.f6040k, this.f6041l, this.f6042m);
    }

    @NonNull
    public final String toString() {
        m3 m3Var = this.f6037h;
        byte[] bArrP = m3Var == null ? null : m3Var.p();
        String str = this.f6036g;
        String str2 = this.f6035f;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6038i;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6039j;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f6040k;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f6041l;
        String str3 = this.f6042m;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + u9.c.b(bArrP) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    public String v3() {
        return this.f6042m;
    }

    public AuthenticationExtensionsClientOutputs w3() {
        return this.f6041l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (p4.b()) {
            this.f6043n = C3().toString();
        }
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, x3(), false);
        o9.b.v(parcel, 2, A3(), false);
        o9.b.g(parcel, 3, y3(), false);
        o9.b.t(parcel, 4, this.f6038i, i10, false);
        o9.b.t(parcel, 5, this.f6039j, i10, false);
        o9.b.t(parcel, 6, this.f6040k, i10, false);
        o9.b.t(parcel, 7, w3(), i10, false);
        o9.b.v(parcel, 8, v3(), false);
        o9.b.v(parcel, 9, this.f6043n, false);
        o9.b.b(parcel, iA);
        this.f6043n = null;
    }

    public String x3() {
        return this.f6035f;
    }

    public byte[] y3() {
        m3 m3Var = this.f6037h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    @NonNull
    public AuthenticatorResponse z3() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f6038i;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f6039j;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f6040k;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public PublicKeyCredential(String str, @NonNull String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        this(str, str2, bArr == null ? null : m3.m(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
