package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import fb.d;
import fb.e;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends zzg {
    public static final Parcelable.Creator<zzaf> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f6335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f6336g;

    public zzaf(Bundle bundle, IBinder iBinder) {
        this.f6335f = bundle;
        this.f6336g = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f6335f;
        int iA = b.a(parcel);
        b.f(parcel, 1, bundle, false);
        b.m(parcel, 2, this.f6336g, false);
        b.b(parcel, iA);
    }

    public zzaf(d dVar) {
        this.f6335f = dVar.a();
        this.f6336g = dVar.f16517a;
    }
}
