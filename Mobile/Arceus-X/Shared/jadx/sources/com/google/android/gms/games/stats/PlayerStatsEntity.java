package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import p305n9.C8947k;
import qa.C10485a;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class PlayerStatsEntity extends zzg implements PlayerStats {

    @NonNull
    public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new C10485a();

    /* JADX INFO: renamed from: f */
    public final float f7971f;

    /* JADX INFO: renamed from: g */
    public final float f7972g;

    /* JADX INFO: renamed from: h */
    public final int f7973h;

    /* JADX INFO: renamed from: i */
    public final int f7974i;

    /* JADX INFO: renamed from: j */
    public final int f7975j;

    /* JADX INFO: renamed from: k */
    public final float f7976k;

    /* JADX INFO: renamed from: l */
    public final float f7977l;

    /* JADX INFO: renamed from: m */
    public final Bundle f7978m;

    /* JADX INFO: renamed from: n */
    public final float f7979n;

    /* JADX INFO: renamed from: o */
    public final float f7980o;

    /* JADX INFO: renamed from: p */
    public final float f7981p;

    public PlayerStatsEntity(float f10, float f11, int i10, int i11, int i12, float f12, float f13, Bundle bundle, float f14, float f15, float f16) {
        this.f7971f = f10;
        this.f7972g = f11;
        this.f7973h = i10;
        this.f7974i = i11;
        this.f7975j = i12;
        this.f7976k = f12;
        this.f7977l = f13;
        this.f7978m = bundle;
        this.f7979n = f14;
        this.f7980o = f15;
        this.f7981p = f16;
    }

    /* JADX INFO: renamed from: w3 */
    public static int m9519w3(PlayerStats playerStats) {
        return C8947k.m36027c(Float.valueOf(playerStats.mo9517t3()), Float.valueOf(playerStats.mo9509F()), Integer.valueOf(playerStats.mo9518v1()), Integer.valueOf(playerStats.mo9512O0()), Integer.valueOf(playerStats.mo9513S1()), Float.valueOf(playerStats.mo9510J0()), Float.valueOf(playerStats.mo9514X()), Float.valueOf(playerStats.mo9511L0()), Float.valueOf(playerStats.mo9516e3()), Float.valueOf(playerStats.mo9515c2()));
    }

    /* JADX INFO: renamed from: x3 */
    public static boolean m9520x3(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return C8947k.m36026b(Float.valueOf(playerStats2.mo9517t3()), Float.valueOf(playerStats.mo9517t3())) && C8947k.m36026b(Float.valueOf(playerStats2.mo9509F()), Float.valueOf(playerStats.mo9509F())) && C8947k.m36026b(Integer.valueOf(playerStats2.mo9518v1()), Integer.valueOf(playerStats.mo9518v1())) && C8947k.m36026b(Integer.valueOf(playerStats2.mo9512O0()), Integer.valueOf(playerStats.mo9512O0())) && C8947k.m36026b(Integer.valueOf(playerStats2.mo9513S1()), Integer.valueOf(playerStats.mo9513S1())) && C8947k.m36026b(Float.valueOf(playerStats2.mo9510J0()), Float.valueOf(playerStats.mo9510J0())) && C8947k.m36026b(Float.valueOf(playerStats2.mo9514X()), Float.valueOf(playerStats.mo9514X())) && C8947k.m36026b(Float.valueOf(playerStats2.mo9511L0()), Float.valueOf(playerStats.mo9511L0())) && C8947k.m36026b(Float.valueOf(playerStats2.mo9516e3()), Float.valueOf(playerStats.mo9516e3())) && C8947k.m36026b(Float.valueOf(playerStats2.mo9515c2()), Float.valueOf(playerStats.mo9515c2()));
    }

    /* JADX INFO: renamed from: y3 */
    public static String m9521y3(PlayerStats playerStats) {
        return C8947k.m36028d(playerStats).m36029a("AverageSessionLength", Float.valueOf(playerStats.mo9517t3())).m36029a("ChurnProbability", Float.valueOf(playerStats.mo9509F())).m36029a("DaysSinceLastPlayed", Integer.valueOf(playerStats.mo9518v1())).m36029a("NumberOfPurchases", Integer.valueOf(playerStats.mo9512O0())).m36029a("NumberOfSessions", Integer.valueOf(playerStats.mo9513S1())).m36029a("SessionPercentile", Float.valueOf(playerStats.mo9510J0())).m36029a("SpendPercentile", Float.valueOf(playerStats.mo9514X())).m36029a("SpendProbability", Float.valueOf(playerStats.mo9511L0())).m36029a("HighSpenderProbability", Float.valueOf(playerStats.mo9516e3())).m36029a("TotalSpendNext28Days", Float.valueOf(playerStats.mo9515c2())).toString();
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: F */
    public final float mo9509F() {
        return this.f7972g;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: J0 */
    public final float mo9510J0() {
        return this.f7976k;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: L0 */
    public final float mo9511L0() {
        return this.f7979n;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: O0 */
    public final int mo9512O0() {
        return this.f7974i;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: S1 */
    public final int mo9513S1() {
        return this.f7975j;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: X */
    public final float mo9514X() {
        return this.f7977l;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: c2 */
    public final float mo9515c2() {
        return this.f7981p;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: e3 */
    public final float mo9516e3() {
        return this.f7980o;
    }

    public final boolean equals(Object obj) {
        return m9520x3(this, obj);
    }

    public final int hashCode() {
        return m9519w3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: t3 */
    public final float mo9517t3() {
        return this.f7971f;
    }

    @NonNull
    public final String toString() {
        return m9521y3(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* JADX INFO: renamed from: v1 */
    public final int mo9518v1() {
        return this.f7973h;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public final Bundle m9522v3() {
        return this.f7978m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        C10485a.m40294a(this, parcel, i10);
    }
}
