package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import p214ja.C7122a;
import p214ja.C7123b;
import p290m9.AbstractC8473d;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractC8473d implements zza {

    /* JADX INFO: renamed from: d */
    public final C7123b f7890d;

    public zzc(DataHolder dataHolder, int i10, C7123b c7123b) {
        super(dataHolder, i10);
        this.f7890d = c7123b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return MostRecentGameInfoEntity.m9441v3(this, obj);
    }

    public final int hashCode() {
        return MostRecentGameInfoEntity.m9440a(this);
    }

    public final String toString() {
        return MostRecentGameInfoEntity.m9442w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C7122a.m29916a(new MostRecentGameInfoEntity(this), parcel, i10);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zza() {
        return m34261j(this.f7890d.f27774t);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzb() {
        return m34261j(this.f7890d.f27775u);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzc() {
        return m34260i(this.f7890d.f27776v);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzd() {
        return m34264n(this.f7890d.f27777w);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zze() {
        return m34264n(this.f7890d.f27778x);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzf() {
        return m34264n(this.f7890d.f27779y);
    }
}
