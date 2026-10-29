package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kf.e;
import n9.k;
import o9.b;
import va.u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f8693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f8694j;

    public zzj(boolean z10, int i10, String str, Bundle bundle, Bundle bundle2) {
        this.f8690f = z10;
        this.f8691g = i10;
        this.f8692h = str;
        this.f8693i = bundle == null ? new Bundle() : bundle;
        this.f8694j = bundle2;
        ClassLoader classLoader = zzj.class.getClassLoader();
        u.a(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return k.b(Boolean.valueOf(this.f8690f), Boolean.valueOf(zzjVar.f8690f)) && k.b(Integer.valueOf(this.f8691g), Integer.valueOf(zzjVar.f8691g)) && k.b(this.f8692h, zzjVar.f8692h) && Thing.z3(this.f8693i, zzjVar.f8693i) && Thing.z3(this.f8694j, zzjVar.f8694j);
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f8690f), Integer.valueOf(this.f8691g), this.f8692h, Integer.valueOf(Thing.x3(this.f8693i)), Integer.valueOf(Thing.x3(this.f8694j)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("worksOffline: ");
        sb2.append(this.f8690f);
        sb2.append(", score: ");
        sb2.append(this.f8691g);
        if (!this.f8692h.isEmpty()) {
            sb2.append(", accountEmail: ");
            sb2.append(this.f8692h);
        }
        Bundle bundle = this.f8693i;
        if (bundle != null && !bundle.isEmpty()) {
            sb2.append(", Properties { ");
            Thing.y3(this.f8693i, sb2);
            sb2.append("}");
        }
        if (!this.f8694j.isEmpty()) {
            sb2.append(", embeddingProperties { ");
            Thing.y3(this.f8694j, sb2);
            sb2.append("}");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.c(parcel, 1, this.f8690f);
        b.n(parcel, 2, this.f8691g);
        b.v(parcel, 3, this.f8692h, false);
        b.f(parcel, 4, this.f8693i, false);
        b.f(parcel, 5, this.f8694j, false);
        b.b(parcel, iA);
    }
}
