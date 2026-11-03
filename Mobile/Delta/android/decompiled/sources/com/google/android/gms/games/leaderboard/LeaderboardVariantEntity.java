package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import fb.i2;
import ma.c;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardVariantEntity implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6291a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6300k;

    public static int a(c cVar) {
        return k.c(Integer.valueOf(cVar.T2()), Integer.valueOf(cVar.y1()), Boolean.valueOf(cVar.P()), Long.valueOf(cVar.i1()), cVar.I(), Long.valueOf(cVar.M2()), cVar.k1(), Long.valueOf(cVar.z2()), cVar.zza(), cVar.zzc(), cVar.zzb());
    }

    public static boolean b(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return k.b(Integer.valueOf(cVar2.T2()), Integer.valueOf(cVar.T2())) && k.b(Integer.valueOf(cVar2.y1()), Integer.valueOf(cVar.y1())) && k.b(Boolean.valueOf(cVar2.P()), Boolean.valueOf(cVar.P())) && k.b(Long.valueOf(cVar2.i1()), Long.valueOf(cVar.i1())) && k.b(cVar2.I(), cVar.I()) && k.b(Long.valueOf(cVar2.M2()), Long.valueOf(cVar.M2())) && k.b(cVar2.k1(), cVar.k1()) && k.b(Long.valueOf(cVar2.z2()), Long.valueOf(cVar.z2())) && k.b(cVar2.zza(), cVar.zza()) && k.b(cVar2.zzc(), cVar.zzc()) && k.b(cVar2.zzb(), cVar.zzb());
    }

    public static String f(c cVar) {
        String str;
        k.a aVarA = k.d(cVar).a("TimeSpan", i2.a(cVar.T2()));
        int iY1 = cVar.y1();
        if (iY1 == -1) {
            str = "UNKNOWN";
        } else if (iY1 == 0) {
            str = "PUBLIC";
        } else if (iY1 != 1) {
            str = "SOCIAL_1P";
            if (iY1 != 2) {
                if (iY1 == 3) {
                    str = "FRIENDS";
                } else if (iY1 != 4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iY1).length() + 32);
                    sb2.append("Unknown leaderboard collection: ");
                    sb2.append(iY1);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        k.a aVarA2 = aVarA.a("Collection", str);
        boolean zP = cVar.P();
        String strK1 = PayloadNotificationChannel.SOUND_NONE;
        k.a aVarA3 = aVarA2.a("RawPlayerScore", zP ? Long.valueOf(cVar.i1()) : PayloadNotificationChannel.SOUND_NONE).a("DisplayPlayerScore", cVar.P() ? cVar.I() : PayloadNotificationChannel.SOUND_NONE).a("PlayerRank", cVar.P() ? Long.valueOf(cVar.M2()) : PayloadNotificationChannel.SOUND_NONE);
        if (cVar.P()) {
            strK1 = cVar.k1();
        }
        return aVarA3.a("DisplayPlayerRank", strK1).a("NumScores", Long.valueOf(cVar.z2())).a("TopPageNextToken", cVar.zza()).a("WindowPageNextToken", cVar.zzc()).a("WindowPagePrevToken", cVar.zzb()).toString();
    }

    @Override // ma.c
    @NonNull
    public final String I() {
        return this.f6294e;
    }

    @Override // ma.c
    public final long M2() {
        return this.f6295f;
    }

    @Override // ma.c
    public final boolean P() {
        return this.f6292c;
    }

    @Override // ma.c
    public final int T2() {
        return this.f6291a;
    }

    public final boolean equals(Object obj) {
        return b(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // ma.c
    public final long i1() {
        return this.f6293d;
    }

    @Override // ma.c
    @NonNull
    public final String k1() {
        return this.f6296g;
    }

    @NonNull
    public final String toString() {
        return f(this);
    }

    @Override // ma.c
    public final int y1() {
        return this.b;
    }

    @Override // ma.c
    public final long z2() {
        return this.f6297h;
    }

    @Override // ma.c
    @NonNull
    public final String zza() {
        return this.f6298i;
    }

    @Override // ma.c
    @NonNull
    public final String zzb() {
        return this.f6299j;
    }

    @Override // ma.c
    @NonNull
    public final String zzc() {
        return this.f6300k;
    }
}
