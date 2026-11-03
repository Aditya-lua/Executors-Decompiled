package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.b0;
import eb.j0;
import eb.k0;
import eb.m3;
import eb.u2;
import n9.k;
import n9.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f6001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f6002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f6003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final m3 f6004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3 f6005j;

    public AuthenticatorAssertionResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) m.l(bArr);
        m3 m3Var = m3.b;
        m3 m3VarM = m3.m(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) m.l(bArr2);
        m3 m3VarM2 = m3.m(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) m.l(bArr3);
        m3 m3VarM3 = m3.m(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) m.l(bArr4);
        m3 m3VarM4 = m3.m(bArr9, 0, bArr9.length);
        m3 m3VarM5 = bArr5 == null ? null : m3.m(bArr5, 0, bArr5.length);
        this.f6001f = (m3) m.l(m3VarM);
        this.f6002g = (m3) m.l(m3VarM2);
        this.f6003h = (m3) m.l(m3VarM3);
        this.f6004i = (m3) m.l(m3VarM4);
        this.f6005j = m3VarM5;
    }

    @NonNull
    public final JSONObject A3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u9.c.b(w3()));
            jSONObject.put("authenticatorData", u9.c.b(v3()));
            jSONObject.put("signature", u9.c.b(y3()));
            if (this.f6005j == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", u9.c.b(z3()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return k.b(this.f6001f, authenticatorAssertionResponse.f6001f) && k.b(this.f6002g, authenticatorAssertionResponse.f6002g) && k.b(this.f6003h, authenticatorAssertionResponse.f6003h) && k.b(this.f6004i, authenticatorAssertionResponse.f6004i) && k.b(this.f6005j, authenticatorAssertionResponse.f6005j);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(k.c(this.f6001f)), Integer.valueOf(k.c(this.f6002g)), Integer.valueOf(k.c(this.f6003h)), Integer.valueOf(k.c(this.f6004i)), Integer.valueOf(k.c(this.f6005j)));
    }

    @NonNull
    public String toString() {
        j0 j0VarA = k0.a(this);
        u2 u2VarD = u2.d();
        byte[] bArrX3 = x3();
        j0VarA.b("keyHandle", u2VarD.e(bArrX3, 0, bArrX3.length));
        u2 u2VarD2 = u2.d();
        byte[] bArrW3 = w3();
        j0VarA.b("clientDataJSON", u2VarD2.e(bArrW3, 0, bArrW3.length));
        u2 u2VarD3 = u2.d();
        byte[] bArrV3 = v3();
        j0VarA.b("authenticatorData", u2VarD3.e(bArrV3, 0, bArrV3.length));
        u2 u2VarD4 = u2.d();
        byte[] bArrY3 = y3();
        j0VarA.b("signature", u2VarD4.e(bArrY3, 0, bArrY3.length));
        byte[] bArrZ3 = z3();
        if (bArrZ3 != null) {
            j0VarA.b("userHandle", u2.d().e(bArrZ3, 0, bArrZ3.length));
        }
        return j0VarA.toString();
    }

    @NonNull
    public byte[] v3() {
        return this.f6003h.p();
    }

    @NonNull
    public byte[] w3() {
        return this.f6002g.p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.g(parcel, 2, x3(), false);
        o9.b.g(parcel, 3, w3(), false);
        o9.b.g(parcel, 4, v3(), false);
        o9.b.g(parcel, 5, y3(), false);
        o9.b.g(parcel, 6, z3(), false);
        o9.b.b(parcel, iA);
    }

    @NonNull
    @Deprecated
    public byte[] x3() {
        return this.f6001f.p();
    }

    @NonNull
    public byte[] y3() {
        return this.f6004i.p();
    }

    public byte[] z3() {
        m3 m3Var = this.f6005j;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }
}
