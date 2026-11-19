package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import na.a;
import na.c;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardEntity implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6300a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f6301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6304f;

    public static int a(a aVar) {
        return q.c(aVar.X2(), aVar.m(), aVar.h(), Integer.valueOf(aVar.x0()), aVar.e2());
    }

    public static boolean b(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return q.b(aVar2.X2(), aVar.X2()) && q.b(aVar2.m(), aVar.m()) && q.b(aVar2.h(), aVar.h()) && q.b(Integer.valueOf(aVar2.x0()), Integer.valueOf(aVar.x0())) && q.b(aVar2.e2(), aVar.e2());
    }

    public static String f(a aVar) {
        return q.d(aVar).a("LeaderboardId", aVar.X2()).a("DisplayName", aVar.m()).a("IconImageUri", aVar.h()).a("IconImageUrl", aVar.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(aVar.x0())).a("Variants", aVar.e2()).toString();
    }

    @Override // na.a
    @NonNull
    public final String X2() {
        return this.f6300a;
    }

    @Override // na.a
    @NonNull
    public final ArrayList<c> e2() {
        return new ArrayList<>(this.f6303e);
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    @Override // na.a
    @NonNull
    public String getIconImageUrl() {
        return this.f6304f;
    }

    @Override // na.a
    @NonNull
    public final Uri h() {
        return this.f6301c;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // na.a
    @NonNull
    public final String m() {
        return this.b;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // na.a
    public final int x0() {
        return this.f6302d;
    }
}
