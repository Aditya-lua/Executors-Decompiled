package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1586d0;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.C4949j0;
import p100eb.C4955k0;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new C1586d0();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ErrorCode f7633f;

    /* JADX INFO: renamed from: g */
    public final String f7634g;

    /* JADX INFO: renamed from: h */
    public final int f7635h;

    public AuthenticatorErrorResponse(int i10, String str, int i11) {
        try {
            this.f7633f = ErrorCode.m9297j(i10);
            this.f7634g = str;
            this.f7635h = i11;
        } catch (ErrorCode.C1925a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return C8947k.m36026b(this.f7633f, authenticatorErrorResponse.f7633f) && C8947k.m36026b(this.f7634g, authenticatorErrorResponse.f7634g) && C8947k.m36026b(Integer.valueOf(this.f7635h), Integer.valueOf(authenticatorErrorResponse.f7635h));
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7633f, this.f7634g, Integer.valueOf(this.f7635h));
    }

    @NonNull
    public String toString() {
        C4949j0 c4949j0M23650a = C4955k0.m23650a(this);
        c4949j0M23650a.m23643a("errorCode", this.f7633f.m9298a());
        String str = this.f7634g;
        if (str != null) {
            c4949j0M23650a.m23644b("errorMessage", str);
        }
        return c4949j0M23650a.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public ErrorCode m9283v3() {
        return this.f7633f;
    }

    /* JADX INFO: renamed from: w3 */
    public int m9284w3() {
        return this.f7633f.m9298a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 2, m9284w3());
        C9718b.m38478v(parcel, 3, m9285x3(), false);
        C9718b.m38470n(parcel, 4, this.f7635h);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public String m9285x3() {
        return this.f7634g;
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public final JSONObject m9286y3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f7633f.m9298a());
            String str = this.f7634g;
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
