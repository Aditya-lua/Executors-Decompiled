package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.w;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UvmEntries f5995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzf f5996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f5997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzh f5998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f5999j;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f5995f = uvmEntries;
        this.f5996g = zzfVar;
        this.f5997h = authenticationExtensionsCredPropsOutputs;
        this.f5998i = zzhVar;
        this.f5999j = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return k.b(this.f5995f, authenticationExtensionsClientOutputs.f5995f) && k.b(this.f5996g, authenticationExtensionsClientOutputs.f5996g) && k.b(this.f5997h, authenticationExtensionsClientOutputs.f5997h) && k.b(this.f5998i, authenticationExtensionsClientOutputs.f5998i) && k.b(this.f5999j, authenticationExtensionsClientOutputs.f5999j);
    }

    public int hashCode() {
        return k.c(this.f5995f, this.f5996g, this.f5997h, this.f5998i, this.f5999j);
    }

    @NonNull
    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + x3().toString() + "}";
    }

    public AuthenticationExtensionsCredPropsOutputs v3() {
        return this.f5997h;
    }

    public UvmEntries w3() {
        return this.f5995f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, w3(), i10, false);
        o9.b.t(parcel, 2, this.f5996g, i10, false);
        o9.b.t(parcel, 3, v3(), i10, false);
        o9.b.t(parcel, 4, this.f5998i, i10, false);
        o9.b.v(parcel, 5, this.f5999j, false);
        o9.b.b(parcel, iA);
    }

    @NonNull
    public final JSONObject x3() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f5997h;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.w3());
            }
            UvmEntries uvmEntries = this.f5995f;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.w3());
            }
            zzh zzhVar = this.f5998i;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.v3());
            }
            String str = this.f5999j;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }
}
