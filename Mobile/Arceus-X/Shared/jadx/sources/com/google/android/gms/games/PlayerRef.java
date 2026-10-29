package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import p073da.C4509m;
import p214ja.C7123b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class PlayerRef extends C4509m implements Player {

    /* JADX INFO: renamed from: d */
    public final C7123b f7815d;

    /* JADX INFO: renamed from: e */
    public final PlayerLevelInfo f7816e;

    /* JADX INFO: renamed from: f */
    public final com.google.android.gms.games.internal.player.zzc f7817f;

    /* JADX INFO: renamed from: g */
    public final zzq f7818g;

    /* JADX INFO: renamed from: h */
    public final zzc f7819h;

    public PlayerRef(@NonNull DataHolder dataHolder, int i10, @NonNull String str) {
        super(dataHolder, i10);
        C7123b c7123b = new C7123b(null);
        this.f7815d = c7123b;
        this.f7817f = new com.google.android.gms.games.internal.player.zzc(dataHolder, i10, c7123b);
        this.f7818g = new zzq(dataHolder, i10, c7123b);
        this.f7819h = new zzc(dataHolder, i10, c7123b);
        if (m34263m(c7123b.f27765k) || m34260i(c7123b.f27765k) == -1) {
            this.f7816e = null;
            return;
        }
        int iM34259g = m34259g(c7123b.f27766l);
        int iM34259g2 = m34259g(c7123b.f27769o);
        PlayerLevel playerLevel = new PlayerLevel(iM34259g, m34260i(c7123b.f27767m), m34260i(c7123b.f27768n));
        this.f7816e = new PlayerLevelInfo(m34260i(c7123b.f27765k), m34260i(c7123b.f27771q), playerLevel, iM34259g != iM34259g2 ? new PlayerLevel(iM34259g2, m34260i(c7123b.f27768n), m34260i(c7123b.f27770p)) : playerLevel);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: B */
    public final Uri mo9387B() {
        return m34264n(this.f7815d.f27760f);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: I1 */
    public final Uri mo9388I1() {
        return m34264n(this.f7815d.f27744C);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: a0 */
    public final long mo9389a0() {
        return m34260i(this.f7815d.f27762h);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: c */
    public final boolean mo9390c() {
        String str = this.f7815d.f27754M;
        return m34262k(str) && m34257a(str);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d */
    public final long mo9391d() {
        String str = this.f7815d.f27748G;
        if (!m34262k(str) || m34263m(str)) {
            return -1L;
        }
        return m34260i(str);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d1 */
    public final PlayerRelationshipInfo mo9392d1() {
        zzq zzqVar = this.f7818g;
        if (zzqVar.mo9413Y() == -1 && zzqVar.zza() == null && zzqVar.zzb() == null) {
            return null;
        }
        return zzqVar;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d2 */
    public final CurrentPlayerInfo mo9393d2() {
        zzc zzcVar = this.f7819h;
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
    /* JADX INFO: renamed from: e0 */
    public final Uri mo9394e0() {
        return m34264n(this.f7815d.f27746E);
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.m9405z3(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImageLandscapeUrl() {
        return m34261j(this.f7815d.f27745D);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImagePortraitUrl() {
        return m34261j(this.f7815d.f27747F);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getHiResImageUrl() {
        return m34261j(this.f7815d.f27761g);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getIconImageUrl() {
        return m34261j(this.f7815d.f27759e);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getTitle() {
        return m34261j(this.f7815d.f27772r);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: h */
    public final Uri mo9395h() {
        return m34264n(this.f7815d.f27758d);
    }

    public final int hashCode() {
        return PlayerEntity.m9404y3(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: k3 */
    public final String mo9396k3() {
        return m34261j(this.f7815d.f27755a);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: l */
    public final String mo9397l() {
        return m34261j(this.f7815d.f27757c);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: r0 */
    public final long mo9398r0() {
        String str = this.f7815d.f27764j;
        if (!m34262k(str) || m34263m(str)) {
            return -1L;
        }
        return m34260i(str);
    }

    @NonNull
    public final String toString() {
        return PlayerEntity.m9400A3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new PlayerEntity(this).writeToParcel(parcel, i10);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    /* JADX INFO: renamed from: z0 */
    public final PlayerLevelInfo mo9399z0() {
        return this.f7816e;
    }

    @Override // com.google.android.gms.games.Player
    public final String zza() {
        return m22470p(this.f7815d.f27756b, null);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzb() {
        return m34261j(this.f7815d.f27742A);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return m34261j(this.f7815d.f27743B);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return m34257a(this.f7815d.f27780z);
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return m34259g(this.f7815d.f27763i);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return m34257a(this.f7815d.f27773s);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzh() {
        if (m34263m(this.f7815d.f27774t)) {
            return null;
        }
        return this.f7817f;
    }
}
