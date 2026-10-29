package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p271lf.C8133e;
import p305n9.C8947k;
import p325o9.C9718b;
import va.C12151u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C8133e();

    /* JADX INFO: renamed from: f */
    public final boolean f11177f;

    /* JADX INFO: renamed from: g */
    public final int f11178g;

    /* JADX INFO: renamed from: h */
    public final String f11179h;

    /* JADX INFO: renamed from: i */
    public final Bundle f11180i;

    /* JADX INFO: renamed from: j */
    public final Bundle f11181j;

    public zzj(boolean z10, int i10, String str, Bundle bundle, Bundle bundle2) {
        this.f11177f = z10;
        this.f11178g = i10;
        this.f11179h = str;
        this.f11180i = bundle == null ? new Bundle() : bundle;
        this.f11181j = bundle2;
        ClassLoader classLoader = zzj.class.getClassLoader();
        C12151u.m44978a(classLoader);
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
        return C8947k.m36026b(Boolean.valueOf(this.f11177f), Boolean.valueOf(zzjVar.f11177f)) && C8947k.m36026b(Integer.valueOf(this.f11178g), Integer.valueOf(zzjVar.f11178g)) && C8947k.m36026b(this.f11179h, zzjVar.f11179h) && Thing.m14388z3(this.f11180i, zzjVar.f11180i) && Thing.m14388z3(this.f11181j, zzjVar.f11181j);
    }

    public final int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f11177f), Integer.valueOf(this.f11178g), this.f11179h, Integer.valueOf(Thing.m14386x3(this.f11180i)), Integer.valueOf(Thing.m14386x3(this.f11181j)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("worksOffline: ");
        sb2.append(this.f11177f);
        sb2.append(", score: ");
        sb2.append(this.f11178g);
        if (!this.f11179h.isEmpty()) {
            sb2.append(", accountEmail: ");
            sb2.append(this.f11179h);
        }
        Bundle bundle = this.f11180i;
        if (bundle != null && !bundle.isEmpty()) {
            sb2.append(", Properties { ");
            Thing.m14387y3(this.f11180i, sb2);
            sb2.append("}");
        }
        if (!this.f11181j.isEmpty()) {
            sb2.append(", embeddingProperties { ");
            Thing.m14387y3(this.f11181j, sb2);
            sb2.append("}");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, this.f11177f);
        C9718b.m38470n(parcel, 2, this.f11178g);
        C9718b.m38478v(parcel, 3, this.f11179h, false);
        C9718b.m38462f(parcel, 4, this.f11180i, false);
        C9718b.m38462f(parcel, 5, this.f11181j, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
