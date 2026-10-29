package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import ja.a;
import ja.b;
import m9.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends d implements zza {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f6174d;

    public zzc(DataHolder dataHolder, int i10, b bVar) {
        super(dataHolder, i10);
        this.f6174d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return MostRecentGameInfoEntity.v3(this, obj);
    }

    public final int hashCode() {
        return MostRecentGameInfoEntity.a(this);
    }

    public final String toString() {
        return MostRecentGameInfoEntity.w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a.a(new MostRecentGameInfoEntity(this), parcel, i10);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zza() {
        return j(this.f6174d.f21230t);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzb() {
        return j(this.f6174d.f21231u);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzc() {
        return i(this.f6174d.f21232v);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzd() {
        return n(this.f6174d.f21233w);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zze() {
        return n(this.f6174d.f21234x);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzf() {
        return n(this.f6174d.f21235y);
    }
}
