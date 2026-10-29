package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p539x8.C12771e;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C12771e();

    /* JADX INFO: renamed from: f */
    public final String f7212f;

    /* JADX INFO: renamed from: g */
    public final int f7213g;

    public zzc(String str, int i10) {
        this.f7212f = str;
        this.f7213g = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, this.f7212f, false);
        C9718b.m38470n(parcel, 2, this.f7213g);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zza() {
        return this.f7213g;
    }

    public final String zzb() {
        return this.f7212f;
    }
}
