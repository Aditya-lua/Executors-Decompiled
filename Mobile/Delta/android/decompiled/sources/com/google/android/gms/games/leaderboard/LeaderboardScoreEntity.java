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
    public final long f6207a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f6212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f6213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PlayerEntity f6214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6217l;

    public static int a(b bVar) {
        return k.c(Long.valueOf(bVar.l2()), bVar.x1(), Long.valueOf(bVar.k2()), bVar.i1(), Long.valueOf(bVar.h2()), bVar.O2(), bVar.W2(), bVar.c3(), bVar.L());
    }

    public static boolean b(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return k.b(Long.valueOf(bVar2.l2()), Long.valueOf(bVar.l2())) && k.b(bVar2.x1(), bVar.x1()) && k.b(Long.valueOf(bVar2.k2()), Long.valueOf(bVar.k2())) && k.b(bVar2.i1(), bVar.i1()) && k.b(Long.valueOf(bVar2.h2()), Long.valueOf(bVar.h2())) && k.b(bVar2.O2(), bVar.O2()) && k.b(bVar2.W2(), bVar.W2()) && k.b(bVar2.c3(), bVar.c3()) && k.b(bVar2.L(), bVar.L()) && k.b(bVar2.b0(), bVar.b0());
    }

    public static String f(b bVar) {
        return k.d(bVar).a("Rank", Long.valueOf(bVar.l2())).a("DisplayRank", bVar.x1()).a("Score", Long.valueOf(bVar.k2())).a("DisplayScore", bVar.i1()).a("Timestamp", Long.valueOf(bVar.h2())).a("DisplayName", bVar.O2()).a("IconImageUri", bVar.W2()).a("IconImageUrl", bVar.getScoreHolderIconImageUrl()).a("HiResImageUri", bVar.c3()).a("HiResImageUrl", bVar.getScoreHolderHiResImageUrl()).a("Player", bVar.L() == null ? null : bVar.L()).a("ScoreTag", bVar.b0()).toString();
    }

    @Override // ma.b
    @NonNull
    public final Player L() {
        return this.f6214i;
    }

    @Override // ma.b
    @NonNull
    public final String O2() {
        PlayerEntity playerEntity = this.f6214i;
        return playerEntity == null ? this.f6211f : playerEntity.l();
    }

    @Override // ma.b
    @NonNull
    public final Uri W2() {
        PlayerEntity playerEntity = this.f6214i;
        return playerEntity == null ? this.f6212g : playerEntity.h();
    }

    @Override // ma.b
    @NonNull
    public final String b0() {
        return this.f6215j;
    }

    @Override // ma.b
    @NonNull
    public final Uri c3() {
        PlayerEntity playerEntity = this.f6214i;
        return playerEntity == null ? this.f6213h : playerEntity.B();
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // ma.b
    @NonNull
    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.f6214i;
        return playerEntity == null ? this.f6217l : playerEntity.getHiResImageUrl();
    }

    @Override // ma.b
    @NonNull
    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.f6214i;
        return playerEntity == null ? this.f6216k : playerEntity.getIconImageUrl();
    }

    @Override // ma.b
    public final long h2() {
        return this.f6210e;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.b
    @NonNull
    public final String i1() {
        return this.f6208c;
    }

    @Override // ma.b
    public final long k2() {
        return this.f6209d;
    }

    @Override // ma.b
    public final long l2() {
        return this.f6207a;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.b
    @NonNull
    public final String x1() {
        return this.b;
    }
}
