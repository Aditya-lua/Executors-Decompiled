package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.d0;
import eb.j0;
import eb.k0;
import n9.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ErrorCode f5937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5939h;

    public AuthenticatorErrorResponse(int i10, String str, int i11) {
        try {
            this.f5937f = ErrorCode.j(i10);
            this.f5938g = str;
            this.f5939h = i11;
        } catch (ErrorCode.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return k.b(this.f5937f, authenticatorErrorResponse.f5937f) && k.b(this.f5938g, authenticatorErrorResponse.f5938g) && k.b(Integer.valueOf(this.f5939h), Integer.valueOf(authenticatorErrorResponse.f5939h));
    }

    public int hashCode() {
        return k.c(this.f5937f, this.f5938g, Integer.valueOf(this.f5939h));
    }

    @NonNull
    public String toString() {
        j0 j0VarA = k0.a(this);
        j0VarA.a("errorCode", this.f5937f.a());
        String str = this.f5938g;
        if (str != null) {
            j0VarA.b("errorMessage", str);
        }
        return j0VarA.toString();
    }

    @NonNull
    public ErrorCode v3() {
        return this.f5937f;
    }

    public int w3() {
        return this.f5937f.a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 2, w3());
        o9.b.v(parcel, 3, x3(), false);
        o9.b.n(parcel, 4, this.f5939h);
        o9.b.b(parcel, iA);
    }

    public String x3() {
        return this.f5938g;
    }

    @NonNull
    public final JSONObject y3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f5937f.a());
            String str = this.f5938g;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("message", str);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
        }
    }
}
