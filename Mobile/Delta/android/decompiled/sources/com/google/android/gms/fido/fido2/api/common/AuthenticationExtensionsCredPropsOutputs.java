package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5927f;

    public AuthenticationExtensionsCredPropsOutputs(boolean z10) {
        this.f5927f = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f5927f == ((AuthenticationExtensionsCredPropsOutputs) obj).f5927f;
    }

    public int hashCode() {
        return k.c(Boolean.valueOf(this.f5927f));
    }

    public boolean v3() {
        return this.f5927f;
    }

    @NonNull
    public final JSONObject w3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f5927f);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.c(parcel, 1, v3());
        o9.b.b(parcel, iA);
    }
}
