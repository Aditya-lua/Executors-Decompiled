package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.n;
import qb.b;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements n {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Intent f7468h;

    public zaa() {
        this(2, 0, null);
    }

    @Override // k9.n
    public final Status m() {
        return this.f7467g == 0 ? Status.f5718k : Status.f5722o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7466f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.n(parcel, 2, this.f7467g);
        o9.b.t(parcel, 3, this.f7468h, i10, false);
        o9.b.b(parcel, iA);
    }

    public zaa(int i10, int i11, Intent intent) {
        this.f7466f = i10;
        this.f7467g = i11;
        this.f7468h = intent;
    }
}
