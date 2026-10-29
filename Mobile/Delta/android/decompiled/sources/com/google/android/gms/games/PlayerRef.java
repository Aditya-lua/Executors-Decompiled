package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import da.m;
import ja.b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class PlayerRef extends m implements Player {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f6099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PlayerLevelInfo f6100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.games.internal.player.zzc f6101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzq f6102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzc f6103h;

    public PlayerRef(@NonNull DataHolder dataHolder, int i10, @NonNull String str) {
        super(dataHolder, i10);
        b bVar = new b(null);
        this.f6099d = bVar;
        this.f6101f = new com.google.android.gms.games.internal.player.zzc(dataHolder, i10, bVar);
        this.f6102g = new zzq(dataHolder, i10, bVar);
        this.f6103h = new zzc(dataHolder, i10, bVar);
        if (m(bVar.f21221k) || i(bVar.f21221k) == -1) {
            this.f6100e = null;
            return;
        }
        int iG = g(bVar.f21222l);
        int iG2 = g(bVar.f21225o);
        PlayerLevel playerLevel = new PlayerLevel(iG, i(bVar.f21223m), i(bVar.f21224n));
        this.f6100e = new PlayerLevelInfo(i(bVar.f21221k), i(bVar.f21227q), playerLevel, iG != iG2 ? new PlayerLevel(iG2, i(bVar.f21224n), i(bVar.f21226p)) : playerLevel);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri B() {
        return n(this.f6099d.f21216f);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri I1() {
        return n(this.f6099d.C);
    }

    @Override // com.google.android.gms.games.Player
    public final long a0() {
        return i(this.f6099d.f21218h);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean c() {
        String str = this.f6099d.M;
        return k(str) && a(str);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo c1() {
        zzq zzqVar = this.f6102g;
        if (zzqVar.Y() == -1 && zzqVar.zza() == null && zzqVar.zzb() == null) {
            return null;
        }
        return zzqVar;
    }

    @Override // com.google.android.gms.games.Player
    public final long d() {
        String str = this.f6099d.G;
        if (!k(str) || m(str)) {
            return -1L;
        }
        return i(str);
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo d2() {
        zzc zzcVar = this.f6103h;
        if (zzcVar.zza()) {
            return zzcVar;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri e0() {
        return n(this.f6099d.E);
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImageLandscapeUrl() {
        return j(this.f6099d.D);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImagePortraitUrl() {
        return j(this.f6099d.F);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getHiResImageUrl() {
        return j(this.f6099d.f21217g);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getIconImageUrl() {
        return j(this.f6099d.f21215e);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getTitle() {
        return j(this.f6099d.f21228r);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri h() {
        return n(this.f6099d.f21214d);
    }

    public final int hashCode() {
        return PlayerEntity.y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String k3() {
        return j(this.f6099d.f21212a);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String l() {
        return j(this.f6099d.f21213c);
    }

    @Override // com.google.android.gms.games.Player
    public final long r0() {
        String str = this.f6099d.f21220j;
        if (!k(str) || m(str)) {
            return -1L;
        }
        return i(str);
    }

    @NonNull
    public final String toString() {
        return PlayerEntity.A3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new PlayerEntity(this).writeToParcel(parcel, i10);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final PlayerLevelInfo z0() {
        return this.f6100e;
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return p(this.f6099d.b, null);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzb() {
        return j(this.f6099d.A);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return j(this.f6099d.B);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return a(this.f6099d.f21236z);
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return g(this.f6099d.f21219i);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return a(this.f6099d.f21229s);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        if (m(this.f6099d.f21230t)) {
            return null;
        }
        return this.f6101f;
    }
}
