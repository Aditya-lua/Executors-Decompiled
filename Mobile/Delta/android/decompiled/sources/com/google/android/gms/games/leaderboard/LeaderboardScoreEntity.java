package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import ma.b;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardScoreEntity implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6280a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f6285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f6286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PlayerEntity f6287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6290l;

    public static int a(b bVar) {
        return k.c(Long.valueOf(bVar.l2()), bVar.v1(), Long.valueOf(bVar.k2()), bVar.f1(), Long.valueOf(bVar.h2()), bVar.N2(), bVar.V2(), bVar.e3(), bVar.L());
    }

    public static boolean b(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return k.b(Long.valueOf(bVar2.l2()), Long.valueOf(bVar.l2())) && k.b(bVar2.v1(), bVar.v1()) && k.b(Long.valueOf(bVar2.k2()), Long.valueOf(bVar.k2())) && k.b(bVar2.f1(), bVar.f1()) && k.b(Long.valueOf(bVar2.h2()), Long.valueOf(bVar.h2())) && k.b(bVar2.N2(), bVar.N2()) && k.b(bVar2.V2(), bVar.V2()) && k.b(bVar2.e3(), bVar.e3()) && k.b(bVar2.L(), bVar.L()) && k.b(bVar2.a0(), bVar.a0());
    }

    public static String f(b bVar) {
        return k.d(bVar).a("Rank", Long.valueOf(bVar.l2())).a("DisplayRank", bVar.v1()).a("Score", Long.valueOf(bVar.k2())).a("DisplayScore", bVar.f1()).a("Timestamp", Long.valueOf(bVar.h2())).a("DisplayName", bVar.N2()).a("IconImageUri", bVar.V2()).a("IconImageUrl", bVar.getScoreHolderIconImageUrl()).a("HiResImageUri", bVar.e3()).a("HiResImageUrl", bVar.getScoreHolderHiResImageUrl()).a("Player", bVar.L() == null ? null : bVar.L()).a("ScoreTag", bVar.a0()).toString();
    }

    @Override // ma.b
    @NonNull
    public final Player L() {
        return this.f6287i;
    }

    @Override // ma.b
    @NonNull
    public final String N2() {
        PlayerEntity playerEntity = this.f6287i;
        return playerEntity == null ? this.f6284f : playerEntity.l();
    }

    @Override // ma.b
    @NonNull
    public final Uri V2() {
        PlayerEntity playerEntity = this.f6287i;
        return playerEntity == null ? this.f6285g : playerEntity.h();
    }

    @Override // ma.b
    @NonNull
    public final String a0() {
        return this.f6288j;
    }

    @Override // ma.b
    @NonNull
    public final Uri e3() {
        PlayerEntity playerEntity = this.f6287i;
        return playerEntity == null ? this.f6286h : playerEntity.A();
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // ma.b
    @NonNull
    public final String f1() {
        return this.f6281c;
    }

    @Override // ma.b
    @NonNull
    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.f6287i;
        return playerEntity == null ? this.f6290l : playerEntity.getHiResImageUrl();
    }

    @Override // ma.b
    @NonNull
    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.f6287i;
        return playerEntity == null ? this.f6289k : playerEntity.getIconImageUrl();
    }

    @Override // ma.b
    public final long h2() {
        return this.f6283e;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.b
    public final long k2() {
        return this.f6282d;
    }

    @Override // ma.b
    public final long l2() {
        return this.f6280a;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.b
    @NonNull
    public final String v1() {
        return this.b;
    }
}
