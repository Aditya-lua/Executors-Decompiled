package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import ma.a;
import ma.c;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardEntity implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6275a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f6276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6279f;

    public static int a(a aVar) {
        return k.c(aVar.S2(), aVar.l(), aVar.h(), Integer.valueOf(aVar.u0()), aVar.c2());
    }

    public static boolean b(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return k.b(aVar2.S2(), aVar.S2()) && k.b(aVar2.l(), aVar.l()) && k.b(aVar2.h(), aVar.h()) && k.b(Integer.valueOf(aVar2.u0()), Integer.valueOf(aVar.u0())) && k.b(aVar2.c2(), aVar.c2());
    }

    public static String f(a aVar) {
        return k.d(aVar).a("LeaderboardId", aVar.S2()).a("DisplayName", aVar.l()).a("IconImageUri", aVar.h()).a("IconImageUrl", aVar.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(aVar.u0())).a("Variants", aVar.c2()).toString();
    }

    @Override // ma.a
    @NonNull
    public final String S2() {
        return this.f6275a;
    }

    @Override // ma.a
    @NonNull
    public final ArrayList<c> c2() {
        return new ArrayList<>(this.f6278e);
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // ma.a
    @NonNull
    public String getIconImageUrl() {
        return this.f6279f;
    }

    @Override // ma.a
    @NonNull
    public final Uri h() {
        return this.f6276c;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.a
    @NonNull
    public final String l() {
        return this.b;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.a
    public final int u0() {
        return this.f6277d;
    }
}
