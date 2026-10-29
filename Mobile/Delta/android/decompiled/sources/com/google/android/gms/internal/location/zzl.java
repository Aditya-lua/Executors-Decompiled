package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hb.c;
import hb.d;
import hb.x;
import lb.k;
import lb.l;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzj f6365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f6366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f6367i;

    public zzl(int i10, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.f6364f = i10;
        this.f6365g = zzjVar;
        d cVar = null;
        this.f6366h = iBinder == null ? null : k.s2(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new c(iBinder2);
        }
        this.f6367i = cVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f6364f);
        b.t(parcel, 2, this.f6365g, i10, false);
        l lVar = this.f6366h;
        b.m(parcel, 3, lVar == null ? null : lVar.asBinder(), false);
        d dVar = this.f6367i;
        b.m(parcel, 4, dVar != null ? dVar.asBinder() : null, false);
        b.b(parcel, iA);
    }
}
