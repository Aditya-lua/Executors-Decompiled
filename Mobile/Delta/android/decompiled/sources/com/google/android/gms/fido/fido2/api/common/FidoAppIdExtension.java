package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.i0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f5960f;

    public FidoAppIdExtension(@NonNull String str) {
        this.f5960f = (String) m.l(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f5960f.equals(((FidoAppIdExtension) obj).f5960f);
        }
        return false;
    }

    public int hashCode() {
        return k.c(this.f5960f);
    }

    @NonNull
    public final String toString() {
        return "FidoAppIdExtension{appid='" + this.f5960f + "'}";
    }

    @NonNull
    public String v3() {
        return this.f5960f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, v3(), false);
        o9.b.b(parcel, iA);
    }
}
