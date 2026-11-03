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
    public final b f6172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PlayerLevelInfo f6173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.games.internal.player.zzc f6174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzq f6175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzc f6176h;

    public PlayerRef(@NonNull DataHolder dataHolder, int i10, @NonNull String str) {
        super(dataHolder, i10);
        b bVar = new b(null);
        this.f6172d = bVar;
        this.f6174f = new com.google.android.gms.games.internal.player.zzc(dataHolder, i10, bVar);
        this.f6175g = new zzq(dataHolder, i10, bVar);
        this.f6176h = new zzc(dataHolder, i10, bVar);
        if (m(bVar.f21794k) || i(bVar.f21794k) == -1) {
            this.f6173e = null;
            return;
        }
        int iG = g(bVar.f21795l);
        int iG2 = g(bVar.f21798o);
        PlayerLevel playerLevel = new PlayerLevel(iG, i(bVar.f21796m), i(bVar.f21797n));
        this.f6173e = new PlayerLevelInfo(i(bVar.f21794k), i(bVar.f21800q), playerLevel, iG != iG2 ? new PlayerLevel(iG2, i(bVar.f21797n), i(bVar.f21799p)) : playerLevel);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri A() {
        return n(this.f6172d.f21789f);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri G1() {
        return n(this.f6172d.C);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo Y0() {
        zzq zzqVar = this.f6175g;
        if (zzqVar.X() == -1 && zzqVar.zza() == null && zzqVar.zzb() == null) {
            return null;
        }
        return zzqVar;
    }

    @Override // com.google.android.gms.games.Player
    public final long Z() {
        return i(this.f6172d.f21791h);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean c() {
        String str = this.f6172d.M;
        return k(str) && a(str);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri c0() {
        return n(this.f6172d.E);
    }

    @Override // com.google.android.gms.games.Player
    public final long d() {
        String str = this.f6172d.G;
        if (!k(str) || m(str)) {
            return -1L;
        }
        return i(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo e2() {
        zzc zzcVar = this.f6176h;
        if (zzcVar.zza()) {
            return zzcVar;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImageLandscapeUrl() {
        return j(this.f6172d.D);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImagePortraitUrl() {
        return j(this.f6172d.F);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getHiResImageUrl() {
        return j(this.f6172d.f21790g);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getIconImageUrl() {
        return j(this.f6172d.f21788e);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getTitle() {
        return j(this.f6172d.f21801r);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri h() {
        return n(this.f6172d.f21787d);
    }

    public final int hashCode() {
        return PlayerEntity.y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String l() {
        return j(this.f6172d.f21786c);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String m3() {
        return j(this.f6172d.f21785a);
    }

    @Override // com.google.android.gms.games.Player
    public final long n0() {
        String str = this.f6172d.f21793j;
        if (!k(str) || m(str)) {
            return -1L;
        }
        return i(str);
    }

    @NonNull
    public final String toString() {
        return PlayerEntity.A3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final PlayerLevelInfo v0() {
        return this.f6173e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new PlayerEntity(this).writeToParcel(parcel, i10);
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return p(this.f6172d.b, null);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzb() {
        return j(this.f6172d.A);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return j(this.f6172d.B);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return a(this.f6172d.f21809z);
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return g(this.f6172d.f21792i);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return a(this.f6172d.f21802s);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        if (m(this.f6172d.f21803t)) {
            return null;
        }
        return this.f6174f;
    }
}
