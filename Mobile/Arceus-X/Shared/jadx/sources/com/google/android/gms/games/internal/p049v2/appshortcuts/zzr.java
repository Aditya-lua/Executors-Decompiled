package com.google.android.gms.games.internal.p049v2.appshortcuts;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p243ka.C7529o;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C7529o();

    /* JADX INFO: renamed from: f */
    public final long f7911f;

    /* JADX INFO: renamed from: g */
    public final String f7912g;

    /* JADX INFO: renamed from: h */
    public final int f7913h;

    /* JADX INFO: renamed from: i */
    public final ComponentName f7914i;

    /* JADX INFO: renamed from: j */
    public final String f7915j;

    public zzr(long j10, String str, int i10, ComponentName componentName, String str2) {
        this.f7911f = j10;
        this.f7912g = str;
        this.f7913h = i10;
        this.f7914i = componentName;
        this.f7915j = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, this.f7911f);
        C9718b.m38478v(parcel, 2, this.f7912g, false);
        C9718b.m38470n(parcel, 3, this.f7913h);
        C9718b.m38476t(parcel, 4, this.f7914i, i10, false);
        C9718b.m38478v(parcel, 5, this.f7915j, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zza() {
        return this.f7913h;
    }

    public final String zzb() {
        return this.f7915j;
    }
}
