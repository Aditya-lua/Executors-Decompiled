package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import fb.i2;
import ma.c;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardVariantEntity implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6218a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6227k;

    public static int a(c cVar) {
        return k.c(Integer.valueOf(cVar.U2()), Integer.valueOf(cVar.A1()), Boolean.valueOf(cVar.P()), Long.valueOf(cVar.l1()), cVar.I(), Long.valueOf(cVar.N2()), cVar.n1(), Long.valueOf(cVar.y2()), cVar.zza(), cVar.zzc(), cVar.zzb());
    }

    public static boolean b(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return k.b(Integer.valueOf(cVar2.U2()), Integer.valueOf(cVar.U2())) && k.b(Integer.valueOf(cVar2.A1()), Integer.valueOf(cVar.A1())) && k.b(Boolean.valueOf(cVar2.P()), Boolean.valueOf(cVar.P())) && k.b(Long.valueOf(cVar2.l1()), Long.valueOf(cVar.l1())) && k.b(cVar2.I(), cVar.I()) && k.b(Long.valueOf(cVar2.N2()), Long.valueOf(cVar.N2())) && k.b(cVar2.n1(), cVar.n1()) && k.b(Long.valueOf(cVar2.y2()), Long.valueOf(cVar.y2())) && k.b(cVar2.zza(), cVar.zza()) && k.b(cVar2.zzc(), cVar.zzc()) && k.b(cVar2.zzb(), cVar.zzb());
    }

    public static String f(c cVar) {
        String str;
        k.a aVarA = k.d(cVar).a("TimeSpan", i2.a(cVar.U2()));
        int iA1 = cVar.A1();
        if (iA1 == -1) {
            str = "UNKNOWN";
        } else if (iA1 == 0) {
            str = "PUBLIC";
        } else if (iA1 != 1) {
            str = "SOCIAL_1P";
            if (iA1 != 2) {
                if (iA1 == 3) {
                    str = "FRIENDS";
                } else if (iA1 != 4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iA1).length() + 32);
                    sb2.append("Unknown leaderboard collection: ");
                    sb2.append(iA1);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        return aVarA.a("Collection", str).a("RawPlayerScore", cVar.P() ? Long.valueOf(cVar.l1()) : "none").a("DisplayPlayerScore", cVar.P() ? cVar.I() : "none").a("PlayerRank", cVar.P() ? Long.valueOf(cVar.N2()) : "none").a("DisplayPlayerRank", cVar.P() ? cVar.n1() : "none").a("NumScores", Long.valueOf(cVar.y2())).a("TopPageNextToken", cVar.zza()).a("WindowPageNextToken", cVar.zzc()).a("WindowPagePrevToken", cVar.zzb()).toString();
    }

    @Override // ma.c
    public final int A1() {
        return this.b;
    }

    @Override // ma.c
    @NonNull
    public final String I() {
        return this.f6221e;
    }

    @Override // ma.c
    public final long N2() {
        return this.f6222f;
    }

    @Override // ma.c
    public final boolean P() {
        return this.f6219c;
    }

    @Override // ma.c
    public final int U2() {
        return this.f6218a;
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.c
    public final long l1() {
        return this.f6220d;
    }

    @Override // ma.c
    @NonNull
    public final String n1() {
        return this.f6223g;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.c
    public final long y2() {
        return this.f6224h;
    }

    @Override // ma.c
    @NonNull
    public final String zza() {
        return this.f6225i;
    }

    @Override // ma.c
    @NonNull
    public final String zzb() {
        return this.f6226j;
    }

    @Override // ma.c
    @NonNull
    public final String zzc() {
        return this.f6227k;
    }
}
