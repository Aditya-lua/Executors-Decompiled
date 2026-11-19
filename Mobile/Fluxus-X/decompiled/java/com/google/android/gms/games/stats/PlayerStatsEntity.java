package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ha.p;
import o9.q;
import ra.a;
import ra.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class PlayerStatsEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f6354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f6355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f6356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f6357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f6359p;

    public PlayerStatsEntity(float f10, float f11, int i10, int i11, int i12, float f12, float f13, Bundle bundle, float f14, float f15, float f16) {
        this.f6349f = f10;
        this.f6350g = f11;
        this.f6351h = i10;
        this.f6352i = i11;
        this.f6353j = i12;
        this.f6354k = f12;
        this.f6355l = f13;
        this.f6356m = bundle;
        this.f6357n = f14;
        this.f6358o = f15;
        this.f6359p = f16;
    }

    public static int B3(a aVar) {
        return q.c(Float.valueOf(aVar.y3()), Float.valueOf(aVar.I()), Integer.valueOf(aVar.v1()), Integer.valueOf(aVar.P0()), Integer.valueOf(aVar.W1()), Float.valueOf(aVar.K0()), Float.valueOf(aVar.b0()), Float.valueOf(aVar.M0()), Float.valueOf(aVar.k3()), Float.valueOf(aVar.f2()));
    }

    public static boolean C3(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return q.b(Float.valueOf(aVar2.y3()), Float.valueOf(aVar.y3())) && q.b(Float.valueOf(aVar2.I()), Float.valueOf(aVar.I())) && q.b(Integer.valueOf(aVar2.v1()), Integer.valueOf(aVar.v1())) && q.b(Integer.valueOf(aVar2.P0()), Integer.valueOf(aVar.P0())) && q.b(Integer.valueOf(aVar2.W1()), Integer.valueOf(aVar.W1())) && q.b(Float.valueOf(aVar2.K0()), Float.valueOf(aVar.K0())) && q.b(Float.valueOf(aVar2.b0()), Float.valueOf(aVar.b0())) && q.b(Float.valueOf(aVar2.M0()), Float.valueOf(aVar.M0())) && q.b(Float.valueOf(aVar2.k3()), Float.valueOf(aVar.k3())) && q.b(Float.valueOf(aVar2.f2()), Float.valueOf(aVar.f2()));
    }

    public static String D3(a aVar) {
        return q.d(aVar).a("AverageSessionLength", Float.valueOf(aVar.y3())).a("ChurnProbability", Float.valueOf(aVar.I())).a("DaysSinceLastPlayed", Integer.valueOf(aVar.v1())).a("NumberOfPurchases", Integer.valueOf(aVar.P0())).a("NumberOfSessions", Integer.valueOf(aVar.W1())).a("SessionPercentile", Float.valueOf(aVar.K0())).a("SpendPercentile", Float.valueOf(aVar.b0())).a("SpendProbability", Float.valueOf(aVar.M0())).a("HighSpenderProbability", Float.valueOf(aVar.k3())).a("TotalSpendNext28Days", Float.valueOf(aVar.f2())).toString();
    }

    @NonNull
    public final Bundle A3() {
        return this.f6356m;
    }

    @Override // ra.a
    public final float I() {
        return this.f6350g;
    }

    @Override // ra.a
    public final float K0() {
        return this.f6354k;
    }

    @Override // ra.a
    public final float M0() {
        return this.f6357n;
    }

    @Override // ra.a
    public final int P0() {
        return this.f6352i;
    }

    @Override // ra.a
    public final int W1() {
        return this.f6353j;
    }

    @Override // ra.a
    public final float b0() {
        return this.f6355l;
    }

    public final boolean equals(Object obj) {
        return C3(this, obj);
    }

    @Override // ra.a
    public final float f2() {
        return this.f6359p;
    }

    public final int hashCode() {
        return B3(this);
    }

    @Override // ra.a
    public final float k3() {
        return this.f6358o;
    }

    @NonNull
    public final String toString() {
        return D3(this);
    }

    @Override // ra.a
    public final int v1() {
        return this.f6351h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        b.a(this, parcel, i10);
    }

    @Override // ra.a
    public final float y3() {
        return this.f6349f;
    }
}
