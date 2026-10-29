package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.e4;
import eb.m3;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new ca.h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e4 f6033j = e4.h(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e4 f6034k = e4.h(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e4 f6035l = e4.h(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e4 f6036m = e4.h(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f6037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3 f6038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f6039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6040i;

    public zzai(m3 m3Var, m3 m3Var2, m3 m3Var3, int i10) {
        this.f6037f = m3Var;
        this.f6038g = m3Var2;
        this.f6039h = m3Var3;
        this.f6040i = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return k.b(this.f6037f, zzaiVar.f6037f) && k.b(this.f6038g, zzaiVar.f6038g) && k.b(this.f6039h, zzaiVar.f6039h) && this.f6040i == zzaiVar.f6040i;
    }

    public final int hashCode() {
        return k.c(this.f6037f, this.f6038g, this.f6039h, Integer.valueOf(this.f6040i));
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + u9.c.b(v3()) + ", saltEnc=" + u9.c.b(x3()) + ", saltAuth=" + u9.c.b(w3()) + ", getPinUvAuthProtocol=" + this.f6040i + "}";
    }

    public final byte[] v3() {
        m3 m3Var = this.f6037f;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    public final byte[] w3() {
        m3 m3Var = this.f6039h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.g(parcel, 1, v3(), false);
        o9.b.g(parcel, 2, x3(), false);
        o9.b.g(parcel, 3, w3(), false);
        o9.b.n(parcel, 4, this.f6040i);
        o9.b.b(parcel, iA);
    }

    public final byte[] x3() {
        m3 m3Var = this.f6038g;
        if (m3Var == null) {
            return null;
        }
        return m3Var.p();
    }
}
