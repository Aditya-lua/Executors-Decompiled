package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p213j9.C7092d0;
import p325o9.C9718b;
import p571y9.BinderC13134b;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C7092d0();

    /* JADX INFO: renamed from: f */
    public final String f7526f;

    /* JADX INFO: renamed from: g */
    public final boolean f7527g;

    /* JADX INFO: renamed from: h */
    public final boolean f7528h;

    /* JADX INFO: renamed from: i */
    public final Context f7529i;

    /* JADX INFO: renamed from: j */
    public final boolean f7530j;

    /* JADX INFO: renamed from: k */
    public final boolean f7531k;

    /* JADX INFO: renamed from: l */
    public final boolean f7532l;

    public zzp(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f7526f = str;
        this.f7527g = z10;
        this.f7528h = z11;
        this.f7529i = (Context) BinderC13134b.m48742t2(InterfaceC13133a.a.m48741s2(iBinder));
        this.f7530j = z12;
        this.f7531k = z13;
        this.f7532l = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, y9.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7526f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38459c(parcel, 2, this.f7527g);
        C9718b.m38459c(parcel, 3, this.f7528h);
        C9718b.m38469m(parcel, 4, BinderC13134b.m48743u2(this.f7529i), false);
        C9718b.m38459c(parcel, 5, this.f7530j);
        C9718b.m38459c(parcel, 6, this.f7531k);
        C9718b.m38459c(parcel, 8, this.f7532l);
        C9718b.m38458b(parcel, iM38457a);
    }
}
