package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1610w;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new C1610w();

    /* JADX INFO: renamed from: f */
    public final UvmEntries f7618f;

    /* JADX INFO: renamed from: g */
    public final zzf f7619g;

    /* JADX INFO: renamed from: h */
    public final AuthenticationExtensionsCredPropsOutputs f7620h;

    /* JADX INFO: renamed from: i */
    public final zzh f7621i;

    /* JADX INFO: renamed from: j */
    public final String f7622j;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f7618f = uvmEntries;
        this.f7619g = zzfVar;
        this.f7620h = authenticationExtensionsCredPropsOutputs;
        this.f7621i = zzhVar;
        this.f7622j = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return C8947k.m36026b(this.f7618f, authenticationExtensionsClientOutputs.f7618f) && C8947k.m36026b(this.f7619g, authenticationExtensionsClientOutputs.f7619g) && C8947k.m36026b(this.f7620h, authenticationExtensionsClientOutputs.f7620h) && C8947k.m36026b(this.f7621i, authenticationExtensionsClientOutputs.f7621i) && C8947k.m36026b(this.f7622j, authenticationExtensionsClientOutputs.f7622j);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7618f, this.f7619g, this.f7620h, this.f7621i, this.f7622j);
    }

    @NonNull
    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + m9269x3().toString() + "}";
    }

    /* JADX INFO: renamed from: v3 */
    public AuthenticationExtensionsCredPropsOutputs m9267v3() {
        return this.f7620h;
    }

    /* JADX INFO: renamed from: w3 */
    public UvmEntries m9268w3() {
        return this.f7618f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, m9268w3(), i10, false);
        C9718b.m38476t(parcel, 2, this.f7619g, i10, false);
        C9718b.m38476t(parcel, 3, m9267v3(), i10, false);
        C9718b.m38476t(parcel, 4, this.f7621i, i10, false);
        C9718b.m38478v(parcel, 5, this.f7622j, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @NonNull
    /* JADX INFO: renamed from: x3 */
    public final JSONObject m9269x3() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f7620h;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.m9271w3());
            }
            UvmEntries uvmEntries = this.f7618f;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.m9352w3());
            }
            zzh zzhVar = this.f7621i;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.m9364v3());
            }
            String str = this.f7622j;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }
}
