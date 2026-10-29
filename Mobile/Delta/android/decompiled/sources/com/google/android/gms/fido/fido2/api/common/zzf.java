package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f6044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3 f6045g;

    public zzf(m3 m3Var, m3 m3Var2) {
        this.f6044f = m3Var;
        this.f6045g = m3Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return k.b(this.f6044f, zzfVar.f6044f) && k.b(this.f6045g, zzfVar.f6045g);
    }

    public final int hashCode() {
        return k.c(this.f6044f, this.f6045g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        m3 m3Var = this.f6044f;
        int iA = o9.b.a(parcel);
        o9.b.g(parcel, 1, m3Var == null ? null : m3Var.p(), false);
        m3 m3Var2 = this.f6045g;
        o9.b.g(parcel, 2, m3Var2 != null ? m3Var2.p() : null, false);
        o9.b.b(parcel, iA);
    }
}
