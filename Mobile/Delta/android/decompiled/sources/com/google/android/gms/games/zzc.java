package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import da.i;
import da.m;
import ja.b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class zzc extends m implements CurrentPlayerInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f6268d;

    public zzc(DataHolder dataHolder, int i10, b bVar) {
        super(dataHolder, i10);
        this.f6268d = bVar;
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int B1() {
        return q(this.f6268d.L, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return zza.v3(this, obj);
    }

    @Override // m9.e
    public final /* synthetic */ CurrentPlayerInfo freeze() {
        return new zza(this);
    }

    public final int hashCode() {
        return zza.a(this);
    }

    public final String toString() {
        return zza.w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.a(new zza(this), parcel, i10);
    }

    public final boolean zza() {
        String str = this.f6268d.L;
        return k(str) && !m(str);
    }
}
