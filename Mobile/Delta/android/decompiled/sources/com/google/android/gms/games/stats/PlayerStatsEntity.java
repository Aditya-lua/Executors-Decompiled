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
    public final float f6251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f6256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f6257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f6258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f6259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f6261p;

    public PlayerStatsEntity(float f10, float f11, int i10, int i11, int i12, float f12, float f13, Bundle bundle, float f14, float f15, float f16) {
        this.f6251f = f10;
        this.f6252g = f11;
        this.f6253h = i10;
        this.f6254i = i11;
        this.f6255j = i12;
        this.f6256k = f12;
        this.f6257l = f13;
        this.f6258m = bundle;
        this.f6259n = f14;
        this.f6260o = f15;
        this.f6261p = f16;
    }

    public static int w3(PlayerStats playerStats) {
        return k.c(Float.valueOf(playerStats.t3()), Float.valueOf(playerStats.F()), Integer.valueOf(playerStats.v1()), Integer.valueOf(playerStats.O0()), Integer.valueOf(playerStats.S1()), Float.valueOf(playerStats.J0()), Float.valueOf(playerStats.X()), Float.valueOf(playerStats.L0()), Float.valueOf(playerStats.e3()), Float.valueOf(playerStats.c2()));
    }

    public static boolean x3(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return k.b(Float.valueOf(playerStats2.t3()), Float.valueOf(playerStats.t3())) && k.b(Float.valueOf(playerStats2.F()), Float.valueOf(playerStats.F())) && k.b(Integer.valueOf(playerStats2.v1()), Integer.valueOf(playerStats.v1())) && k.b(Integer.valueOf(playerStats2.O0()), Integer.valueOf(playerStats.O0())) && k.b(Integer.valueOf(playerStats2.S1()), Integer.valueOf(playerStats.S1())) && k.b(Float.valueOf(playerStats2.J0()), Float.valueOf(playerStats.J0())) && k.b(Float.valueOf(playerStats2.X()), Float.valueOf(playerStats.X())) && k.b(Float.valueOf(playerStats2.L0()), Float.valueOf(playerStats.L0())) && k.b(Float.valueOf(playerStats2.e3()), Float.valueOf(playerStats.e3())) && k.b(Float.valueOf(playerStats2.c2()), Float.valueOf(playerStats.c2()));
    }

    public static String y3(PlayerStats playerStats) {
        return k.d(playerStats).a("AverageSessionLength", Float.valueOf(playerStats.t3())).a("ChurnProbability", Float.valueOf(playerStats.F())).a("DaysSinceLastPlayed", Integer.valueOf(playerStats.v1())).a("NumberOfPurchases", Integer.valueOf(playerStats.O0())).a("NumberOfSessions", Integer.valueOf(playerStats.S1())).a("SessionPercentile", Float.valueOf(playerStats.J0())).a("SpendPercentile", Float.valueOf(playerStats.X())).a("SpendProbability", Float.valueOf(playerStats.L0())).a("HighSpenderProbability", Float.valueOf(playerStats.e3())).a("TotalSpendNext28Days", Float.valueOf(playerStats.c2())).toString();
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float F() {
        return this.f6252g;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float J0() {
        return this.f6256k;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float L0() {
        return this.f6259n;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int O0() {
        return this.f6254i;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int S1() {
        return this.f6255j;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float X() {
        return this.f6257l;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float c2() {
        return this.f6261p;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float e3() {
        return this.f6260o;
    }

    public final boolean equals(Object obj) {
        return x3(this, obj);
    }

    public final int hashCode() {
        return w3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float t3() {
        return this.f6251f;
    }

    @NonNull
    public final String toString() {
        return y3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int v1() {
        return this.f6253h;
    }

    @NonNull
    public final Bundle v3() {
        return this.f6258m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }
}
