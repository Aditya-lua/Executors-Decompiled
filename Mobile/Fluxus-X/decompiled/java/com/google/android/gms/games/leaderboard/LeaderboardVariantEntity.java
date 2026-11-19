package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import gb.m2;
import na.c;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardVariantEntity implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6316a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6325k;

    public static int a(c cVar) {
        return q.c(Integer.valueOf(cVar.Y2()), Integer.valueOf(cVar.B1()), Boolean.valueOf(cVar.T()), Long.valueOf(cVar.l1()), cVar.L(), Long.valueOf(cVar.Q2()), cVar.n1(), Long.valueOf(cVar.A2()), cVar.zza(), cVar.zzc(), cVar.zzb());
    }

    public static boolean b(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return q.b(Integer.valueOf(cVar2.Y2()), Integer.valueOf(cVar.Y2())) && q.b(Integer.valueOf(cVar2.B1()), Integer.valueOf(cVar.B1())) && q.b(Boolean.valueOf(cVar2.T()), Boolean.valueOf(cVar.T())) && q.b(Long.valueOf(cVar2.l1()), Long.valueOf(cVar.l1())) && q.b(cVar2.L(), cVar.L()) && q.b(Long.valueOf(cVar2.Q2()), Long.valueOf(cVar.Q2())) && q.b(cVar2.n1(), cVar.n1()) && q.b(Long.valueOf(cVar2.A2()), Long.valueOf(cVar.A2())) && q.b(cVar2.zza(), cVar.zza()) && q.b(cVar2.zzc(), cVar.zzc()) && q.b(cVar2.zzb(), cVar.zzb());
    }

    public static String f(c cVar) {
        String str;
        q.a aVarA = q.d(cVar).a("TimeSpan", m2.a(cVar.Y2()));
        int iB1 = cVar.B1();
        if (iB1 == -1) {
            str = "UNKNOWN";
        } else if (iB1 == 0) {
            str = "PUBLIC";
        } else if (iB1 != 1) {
            str = "SOCIAL_1P";
            if (iB1 != 2) {
                if (iB1 == 3) {
                    str = "FRIENDS";
                } else if (iB1 != 4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iB1).length() + 32);
                    sb2.append("Unknown leaderboard collection: ");
                    sb2.append(iB1);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        q.a aVarA2 = aVarA.a("Collection", str);
        boolean zT = cVar.T();
        String strN1 = PayloadNotificationChannel.SOUND_NONE;
        q.a aVarA3 = aVarA2.a("RawPlayerScore", zT ? Long.valueOf(cVar.l1()) : PayloadNotificationChannel.SOUND_NONE).a("DisplayPlayerScore", cVar.T() ? cVar.L() : PayloadNotificationChannel.SOUND_NONE).a("PlayerRank", cVar.T() ? Long.valueOf(cVar.Q2()) : PayloadNotificationChannel.SOUND_NONE);
        if (cVar.T()) {
            strN1 = cVar.n1();
        }
        return aVarA3.a("DisplayPlayerRank", strN1).a("NumScores", Long.valueOf(cVar.A2())).a("TopPageNextToken", cVar.zza()).a("WindowPageNextToken", cVar.zzc()).a("WindowPagePrevToken", cVar.zzb()).toString();
    }

    @Override // na.c
    public final long A2() {
        return this.f6322h;
    }

    @Override // na.c
    public final int B1() {
        return this.b;
    }

    @Override // na.c
    @NonNull
    public final String L() {
        return this.f6319e;
    }

    @Override // na.c
    public final long Q2() {
        return this.f6320f;
    }

    @Override // na.c
    public final boolean T() {
        return this.f6317c;
    }

    @Override // na.c
    public final int Y2() {
        return this.f6316a;
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // na.c
    public final long l1() {
        return this.f6318d;
    }

    @Override // na.c
    @NonNull
    public final String n1() {
        return this.f6321g;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // na.c
    @NonNull
    public final String zza() {
        return this.f6323i;
    }

    @Override // na.c
    @NonNull
    public final String zzb() {
        return this.f6324j;
    }

    @Override // na.c
    @NonNull
    public final String zzc() {
        return this.f6325k;
    }
}
