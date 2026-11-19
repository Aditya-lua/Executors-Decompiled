package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.PlayerEntity;
import ea.k;
import na.b;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardScoreEntity implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6305a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f6310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f6311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PlayerEntity f6312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6315l;

    public static int a(b bVar) {
        return q.c(Long.valueOf(bVar.p2()), bVar.x1(), Long.valueOf(bVar.n2()), bVar.h1(), Long.valueOf(bVar.j2()), bVar.S2(), bVar.a3(), bVar.i3(), bVar.N());
    }

    public static boolean b(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return q.b(Long.valueOf(bVar2.p2()), Long.valueOf(bVar.p2())) && q.b(bVar2.x1(), bVar.x1()) && q.b(Long.valueOf(bVar2.n2()), Long.valueOf(bVar.n2())) && q.b(bVar2.h1(), bVar.h1()) && q.b(Long.valueOf(bVar2.j2()), Long.valueOf(bVar.j2())) && q.b(bVar2.S2(), bVar.S2()) && q.b(bVar2.a3(), bVar.a3()) && q.b(bVar2.i3(), bVar.i3()) && q.b(bVar2.N(), bVar.N()) && q.b(bVar2.f0(), bVar.f0());
    }

    public static String f(b bVar) {
        return q.d(bVar).a("Rank", Long.valueOf(bVar.p2())).a("DisplayRank", bVar.x1()).a("Score", Long.valueOf(bVar.n2())).a("DisplayScore", bVar.h1()).a("Timestamp", Long.valueOf(bVar.j2())).a("DisplayName", bVar.S2()).a("IconImageUri", bVar.a3()).a("IconImageUrl", bVar.getScoreHolderIconImageUrl()).a("HiResImageUri", bVar.i3()).a("HiResImageUrl", bVar.getScoreHolderHiResImageUrl()).a("Player", bVar.N() == null ? null : bVar.N()).a("ScoreTag", bVar.f0()).toString();
    }

    @Override // na.b
    @NonNull
    public final k N() {
        return this.f6312i;
    }

    @Override // na.b
    @NonNull
    public final String S2() {
        PlayerEntity playerEntity = this.f6312i;
        return playerEntity == null ? this.f6309f : playerEntity.m();
    }

    @Override // na.b
    @NonNull
    public final Uri a3() {
        PlayerEntity playerEntity = this.f6312i;
        return playerEntity == null ? this.f6310g : playerEntity.h();
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // na.b
    @NonNull
    public final String f0() {
        return this.f6313j;
    }

    @Override // na.b
    @NonNull
    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.f6312i;
        return playerEntity == null ? this.f6315l : playerEntity.getHiResImageUrl();
    }

    @Override // na.b
    @NonNull
    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.f6312i;
        return playerEntity == null ? this.f6314k : playerEntity.getIconImageUrl();
    }

    @Override // na.b
    @NonNull
    public final String h1() {
        return this.f6306c;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // na.b
    @NonNull
    public final Uri i3() {
        PlayerEntity playerEntity = this.f6312i;
        return playerEntity == null ? this.f6311h : playerEntity.E();
    }

    @Override // na.b
    public final long j2() {
        return this.f6308e;
    }

    @Override // na.b
    public final long n2() {
        return this.f6307d;
    }

    @Override // na.b
    public final long p2() {
        return this.f6305a;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // na.b
    @NonNull
    public final String x1() {
        return this.b;
    }
}
