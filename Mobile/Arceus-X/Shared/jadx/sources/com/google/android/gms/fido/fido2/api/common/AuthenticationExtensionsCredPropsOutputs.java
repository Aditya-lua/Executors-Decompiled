package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1612y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new C1612y();

    /* JADX INFO: renamed from: f */
    public final boolean f7623f;

    public AuthenticationExtensionsCredPropsOutputs(boolean z10) {
        this.f7623f = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f7623f == ((AuthenticationExtensionsCredPropsOutputs) obj).f7623f;
    }

    public int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7623f));
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m9270v3() {
        return this.f7623f;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public final JSONObject m9271w3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f7623f);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, m9270v3());
        C9718b.m38458b(parcel, iM38457a);
    }
}
