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
    public final UvmEntries f5922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzf f5923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f5924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzh f5925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f5926j;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f5922f = uvmEntries;
        this.f5923g = zzfVar;
        this.f5924h = authenticationExtensionsCredPropsOutputs;
        this.f5925i = zzhVar;
        this.f5926j = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return k.b(this.f5922f, authenticationExtensionsClientOutputs.f5922f) && k.b(this.f5923g, authenticationExtensionsClientOutputs.f5923g) && k.b(this.f5924h, authenticationExtensionsClientOutputs.f5924h) && k.b(this.f5925i, authenticationExtensionsClientOutputs.f5925i) && k.b(this.f5926j, authenticationExtensionsClientOutputs.f5926j);
    }

    public int hashCode() {
        return k.c(this.f5922f, this.f5923g, this.f5924h, this.f5925i, this.f5926j);
    }

    @NonNull
    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + x3().toString() + "}";
    }

    public AuthenticationExtensionsCredPropsOutputs v3() {
        return this.f5924h;
    }

    public UvmEntries w3() {
        return this.f5922f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, w3(), i10, false);
        o9.b.t(parcel, 2, this.f5923g, i10, false);
        o9.b.t(parcel, 3, v3(), i10, false);
        o9.b.t(parcel, 4, this.f5925i, i10, false);
        o9.b.v(parcel, 5, this.f5926j, false);
        o9.b.b(parcel, iA);
    }

    @NonNull
    public final JSONObject x3() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f5924h;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.w3());
            }
            UvmEntries uvmEntries = this.f5922f;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.w3());
            }
            zzh zzhVar = this.f5925i;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.v3());
            }
            String str = this.f5926j;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }
}
