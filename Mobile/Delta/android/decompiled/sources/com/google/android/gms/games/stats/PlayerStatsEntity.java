package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import n9.k;
import qa.a;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class PlayerStatsEntity extends zzg implements PlayerStats {

    @NonNull
    public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f6329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f6330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f6331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f6332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f6334p;

    public PlayerStatsEntity(float f10, float f11, int i10, int i11, int i12, float f12, float f13, Bundle bundle, float f14, float f15, float f16) {
        this.f6324f = f10;
        this.f6325g = f11;
        this.f6326h = i10;
        this.f6327i = i11;
        this.f6328j = i12;
        this.f6329k = f12;
        this.f6330l = f13;
        this.f6331m = bundle;
        this.f6332n = f14;
        this.f6333o = f15;
        this.f6334p = f16;
    }

    public static int w3(PlayerStats playerStats) {
        return k.c(Float.valueOf(playerStats.t3()), Float.valueOf(playerStats.F()), Integer.valueOf(playerStats.t1()), Integer.valueOf(playerStats.K0()), Integer.valueOf(playerStats.S1()), Float.valueOf(playerStats.F0()), Float.valueOf(playerStats.W()), Float.valueOf(playerStats.H0()), Float.valueOf(playerStats.g3()), Float.valueOf(playerStats.d2()));
    }

    public static boolean x3(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return k.b(Float.valueOf(playerStats2.t3()), Float.valueOf(playerStats.t3())) && k.b(Float.valueOf(playerStats2.F()), Float.valueOf(playerStats.F())) && k.b(Integer.valueOf(playerStats2.t1()), Integer.valueOf(playerStats.t1())) && k.b(Integer.valueOf(playerStats2.K0()), Integer.valueOf(playerStats.K0())) && k.b(Integer.valueOf(playerStats2.S1()), Integer.valueOf(playerStats.S1())) && k.b(Float.valueOf(playerStats2.F0()), Float.valueOf(playerStats.F0())) && k.b(Float.valueOf(playerStats2.W()), Float.valueOf(playerStats.W())) && k.b(Float.valueOf(playerStats2.H0()), Float.valueOf(playerStats.H0())) && k.b(Float.valueOf(playerStats2.g3()), Float.valueOf(playerStats.g3())) && k.b(Float.valueOf(playerStats2.d2()), Float.valueOf(playerStats.d2()));
    }

    public static String y3(PlayerStats playerStats) {
        return k.d(playerStats).a("AverageSessionLength", Float.valueOf(playerStats.t3())).a("ChurnProbability", Float.valueOf(playerStats.F())).a("DaysSinceLastPlayed", Integer.valueOf(playerStats.t1())).a("NumberOfPurchases", Integer.valueOf(playerStats.K0())).a("NumberOfSessions", Integer.valueOf(playerStats.S1())).a("SessionPercentile", Float.valueOf(playerStats.F0())).a("SpendPercentile", Float.valueOf(playerStats.W())).a("SpendProbability", Float.valueOf(playerStats.H0())).a("HighSpenderProbability", Float.valueOf(playerStats.g3())).a("TotalSpendNext28Days", Float.valueOf(playerStats.d2())).toString();
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float F() {
        return this.f6325g;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float F0() {
        return this.f6329k;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float H0() {
        return this.f6332n;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int K0() {
        return this.f6327i;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int S1() {
        return this.f6328j;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float W() {
        return this.f6330l;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float d2() {
        return this.f6334p;
    }

    public final boolean equals(Object obj) {
        return x3(this, obj);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float g3() {
        return this.f6333o;
    }

    public final int hashCode() {
        return w3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int t1() {
        return this.f6326h;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float t3() {
        return this.f6324f;
    }

    @NonNull
    public final String toString() {
        return y3(this);
    }

    @NonNull
    public final Bundle v3() {
        return this.f6331m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }
}
