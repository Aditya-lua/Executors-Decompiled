package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ma.InterfaceC8480c;
import p125fb.C5531i2;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardVariantEntity implements InterfaceC8480c {

    /* JADX INFO: renamed from: a */
    public final int f7937a;

    /* JADX INFO: renamed from: b */
    public final int f7938b;

    /* JADX INFO: renamed from: c */
    public final boolean f7939c;

    /* JADX INFO: renamed from: d */
    public final long f7940d;

    /* JADX INFO: renamed from: e */
    public final String f7941e;

    /* JADX INFO: renamed from: f */
    public final long f7942f;

    /* JADX INFO: renamed from: g */
    public final String f7943g;

    /* JADX INFO: renamed from: h */
    public final long f7944h;

    /* JADX INFO: renamed from: i */
    public final String f7945i;

    /* JADX INFO: renamed from: j */
    public final String f7946j;

    /* JADX INFO: renamed from: k */
    public final String f7947k;

    /* JADX INFO: renamed from: a */
    public static int m9477a(InterfaceC8480c interfaceC8480c) {
        return C8947k.m36027c(Integer.valueOf(interfaceC8480c.mo9484U2()), Integer.valueOf(interfaceC8480c.mo9480A1()), Boolean.valueOf(interfaceC8480c.mo9483P()), Long.valueOf(interfaceC8480c.mo9485m1()), interfaceC8480c.mo9481I(), Long.valueOf(interfaceC8480c.mo9482N2()), interfaceC8480c.mo9486o1(), Long.valueOf(interfaceC8480c.mo9487y2()), interfaceC8480c.zza(), interfaceC8480c.zzc(), interfaceC8480c.zzb());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9478b(InterfaceC8480c interfaceC8480c, Object obj) {
        if (!(obj instanceof InterfaceC8480c)) {
            return false;
        }
        if (interfaceC8480c == obj) {
            return true;
        }
        InterfaceC8480c interfaceC8480c2 = (InterfaceC8480c) obj;
        return C8947k.m36026b(Integer.valueOf(interfaceC8480c2.mo9484U2()), Integer.valueOf(interfaceC8480c.mo9484U2())) && C8947k.m36026b(Integer.valueOf(interfaceC8480c2.mo9480A1()), Integer.valueOf(interfaceC8480c.mo9480A1())) && C8947k.m36026b(Boolean.valueOf(interfaceC8480c2.mo9483P()), Boolean.valueOf(interfaceC8480c.mo9483P())) && C8947k.m36026b(Long.valueOf(interfaceC8480c2.mo9485m1()), Long.valueOf(interfaceC8480c.mo9485m1())) && C8947k.m36026b(interfaceC8480c2.mo9481I(), interfaceC8480c.mo9481I()) && C8947k.m36026b(Long.valueOf(interfaceC8480c2.mo9482N2()), Long.valueOf(interfaceC8480c.mo9482N2())) && C8947k.m36026b(interfaceC8480c2.mo9486o1(), interfaceC8480c.mo9486o1()) && C8947k.m36026b(Long.valueOf(interfaceC8480c2.mo9487y2()), Long.valueOf(interfaceC8480c.mo9487y2())) && C8947k.m36026b(interfaceC8480c2.zza(), interfaceC8480c.zza()) && C8947k.m36026b(interfaceC8480c2.zzc(), interfaceC8480c.zzc()) && C8947k.m36026b(interfaceC8480c2.zzb(), interfaceC8480c.zzb());
    }

    /* JADX INFO: renamed from: f */
    public static String m9479f(InterfaceC8480c interfaceC8480c) {
        String str;
        C8947k.a aVarM36029a = C8947k.m36028d(interfaceC8480c).m36029a("TimeSpan", C5531i2.m25198a(interfaceC8480c.mo9484U2()));
        int iMo9480A1 = interfaceC8480c.mo9480A1();
        if (iMo9480A1 == -1) {
            str = "UNKNOWN";
        } else if (iMo9480A1 == 0) {
            str = "PUBLIC";
        } else if (iMo9480A1 != 1) {
            str = "SOCIAL_1P";
            if (iMo9480A1 != 2) {
                if (iMo9480A1 == 3) {
                    str = "FRIENDS";
                } else if (iMo9480A1 != 4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iMo9480A1).length() + 32);
                    sb2.append("Unknown leaderboard collection: ");
                    sb2.append(iMo9480A1);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        return aVarM36029a.m36029a("Collection", str).m36029a("RawPlayerScore", interfaceC8480c.mo9483P() ? Long.valueOf(interfaceC8480c.mo9485m1()) : "none").m36029a("DisplayPlayerScore", interfaceC8480c.mo9483P() ? interfaceC8480c.mo9481I() : "none").m36029a("PlayerRank", interfaceC8480c.mo9483P() ? Long.valueOf(interfaceC8480c.mo9482N2()) : "none").m36029a("DisplayPlayerRank", interfaceC8480c.mo9483P() ? interfaceC8480c.mo9486o1() : "none").m36029a("NumScores", Long.valueOf(interfaceC8480c.mo9487y2())).m36029a("TopPageNextToken", interfaceC8480c.zza()).m36029a("WindowPageNextToken", interfaceC8480c.zzc()).m36029a("WindowPagePrevToken", interfaceC8480c.zzb()).toString();
    }

    @Override // ma.InterfaceC8480c
    /* JADX INFO: renamed from: A1 */
    public final int mo9480A1() {
        return this.f7938b;
    }

    @Override // ma.InterfaceC8480c
    @NonNull
    /* JADX INFO: renamed from: I */
    public final String mo9481I() {
        return this.f7941e;
    }

    @Override // ma.InterfaceC8480c
    /* JADX INFO: renamed from: N2 */
    public final long mo9482N2() {
        return this.f7942f;
    }

    @Override // ma.InterfaceC8480c
    /* JADX INFO: renamed from: P */
    public final boolean mo9483P() {
        return this.f7939c;
    }

    @Override // ma.InterfaceC8480c
    /* JADX INFO: renamed from: U2 */
    public final int mo9484U2() {
        return this.f7937a;
    }

    public final boolean equals(Object obj) {
        return m9478b(this, obj);
    }

    public final int hashCode() {
        return m9477a(this);
    }

    @Override // ma.InterfaceC8480c
    /* JADX INFO: renamed from: m1 */
    public final long mo9485m1() {
        return this.f7940d;
    }

    @Override // ma.InterfaceC8480c
    @NonNull
    /* JADX INFO: renamed from: o1 */
    public final String mo9486o1() {
        return this.f7943g;
    }

    @NonNull
    public final String toString() {
        return m9479f(this);
    }

    @Override // ma.InterfaceC8480c
    /* JADX INFO: renamed from: y2 */
    public final long mo9487y2() {
        return this.f7944h;
    }

    @Override // ma.InterfaceC8480c
    @NonNull
    public final String zza() {
        return this.f7945i;
    }

    @Override // ma.InterfaceC8480c
    @NonNull
    public final String zzb() {
        return this.f7946j;
    }

    @Override // ma.InterfaceC8480c
    @NonNull
    public final String zzc() {
        return this.f7947k;
    }
}
