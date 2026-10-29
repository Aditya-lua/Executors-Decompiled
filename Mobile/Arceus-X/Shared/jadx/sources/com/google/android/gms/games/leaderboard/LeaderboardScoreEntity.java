package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import ma.InterfaceC8479b;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardScoreEntity implements InterfaceC8479b {

    /* JADX INFO: renamed from: a */
    public final long f7925a;

    /* JADX INFO: renamed from: b */
    public final String f7926b;

    /* JADX INFO: renamed from: c */
    public final String f7927c;

    /* JADX INFO: renamed from: d */
    public final long f7928d;

    /* JADX INFO: renamed from: e */
    public final long f7929e;

    /* JADX INFO: renamed from: f */
    public final String f7930f;

    /* JADX INFO: renamed from: g */
    public final Uri f7931g;

    /* JADX INFO: renamed from: h */
    public final Uri f7932h;

    /* JADX INFO: renamed from: i */
    public final PlayerEntity f7933i;

    /* JADX INFO: renamed from: j */
    public final String f7934j;

    /* JADX INFO: renamed from: k */
    public final String f7935k;

    /* JADX INFO: renamed from: l */
    public final String f7936l;

    /* JADX INFO: renamed from: a */
    public static int m9464a(InterfaceC8479b interfaceC8479b) {
        return C8947k.m36027c(Long.valueOf(interfaceC8479b.mo9475l2()), interfaceC8479b.mo9476x1(), Long.valueOf(interfaceC8479b.mo9474k2()), interfaceC8479b.mo9473j1(), Long.valueOf(interfaceC8479b.mo9472h2()), interfaceC8479b.mo9468O2(), interfaceC8479b.mo9469W2(), interfaceC8479b.mo9471c3(), interfaceC8479b.mo9467L());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9465b(InterfaceC8479b interfaceC8479b, Object obj) {
        if (!(obj instanceof InterfaceC8479b)) {
            return false;
        }
        if (interfaceC8479b == obj) {
            return true;
        }
        InterfaceC8479b interfaceC8479b2 = (InterfaceC8479b) obj;
        return C8947k.m36026b(Long.valueOf(interfaceC8479b2.mo9475l2()), Long.valueOf(interfaceC8479b.mo9475l2())) && C8947k.m36026b(interfaceC8479b2.mo9476x1(), interfaceC8479b.mo9476x1()) && C8947k.m36026b(Long.valueOf(interfaceC8479b2.mo9474k2()), Long.valueOf(interfaceC8479b.mo9474k2())) && C8947k.m36026b(interfaceC8479b2.mo9473j1(), interfaceC8479b.mo9473j1()) && C8947k.m36026b(Long.valueOf(interfaceC8479b2.mo9472h2()), Long.valueOf(interfaceC8479b.mo9472h2())) && C8947k.m36026b(interfaceC8479b2.mo9468O2(), interfaceC8479b.mo9468O2()) && C8947k.m36026b(interfaceC8479b2.mo9469W2(), interfaceC8479b.mo9469W2()) && C8947k.m36026b(interfaceC8479b2.mo9471c3(), interfaceC8479b.mo9471c3()) && C8947k.m36026b(interfaceC8479b2.mo9467L(), interfaceC8479b.mo9467L()) && C8947k.m36026b(interfaceC8479b2.mo9470b0(), interfaceC8479b.mo9470b0());
    }

    /* JADX INFO: renamed from: f */
    public static String m9466f(InterfaceC8479b interfaceC8479b) {
        return C8947k.m36028d(interfaceC8479b).m36029a("Rank", Long.valueOf(interfaceC8479b.mo9475l2())).m36029a("DisplayRank", interfaceC8479b.mo9476x1()).m36029a("Score", Long.valueOf(interfaceC8479b.mo9474k2())).m36029a("DisplayScore", interfaceC8479b.mo9473j1()).m36029a("Timestamp", Long.valueOf(interfaceC8479b.mo9472h2())).m36029a("DisplayName", interfaceC8479b.mo9468O2()).m36029a("IconImageUri", interfaceC8479b.mo9469W2()).m36029a("IconImageUrl", interfaceC8479b.getScoreHolderIconImageUrl()).m36029a("HiResImageUri", interfaceC8479b.mo9471c3()).m36029a("HiResImageUrl", interfaceC8479b.getScoreHolderHiResImageUrl()).m36029a("Player", interfaceC8479b.mo9467L() == null ? null : interfaceC8479b.mo9467L()).m36029a("ScoreTag", interfaceC8479b.mo9470b0()).toString();
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: L */
    public final Player mo9467L() {
        return this.f7933i;
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: O2 */
    public final String mo9468O2() {
        PlayerEntity playerEntity = this.f7933i;
        return playerEntity == null ? this.f7930f : playerEntity.mo9397l();
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: W2 */
    public final Uri mo9469W2() {
        PlayerEntity playerEntity = this.f7933i;
        return playerEntity == null ? this.f7931g : playerEntity.mo9395h();
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: b0 */
    public final String mo9470b0() {
        return this.f7934j;
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: c3 */
    public final Uri mo9471c3() {
        PlayerEntity playerEntity = this.f7933i;
        return playerEntity == null ? this.f7932h : playerEntity.mo9387B();
    }

    public final boolean equals(Object obj) {
        return m9465b(this, obj);
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.f7933i;
        return playerEntity == null ? this.f7936l : playerEntity.getHiResImageUrl();
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.f7933i;
        return playerEntity == null ? this.f7935k : playerEntity.getIconImageUrl();
    }

    @Override // ma.InterfaceC8479b
    /* JADX INFO: renamed from: h2 */
    public final long mo9472h2() {
        return this.f7929e;
    }

    public final int hashCode() {
        return m9464a(this);
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: j1 */
    public final String mo9473j1() {
        return this.f7927c;
    }

    @Override // ma.InterfaceC8479b
    /* JADX INFO: renamed from: k2 */
    public final long mo9474k2() {
        return this.f7928d;
    }

    @Override // ma.InterfaceC8479b
    /* JADX INFO: renamed from: l2 */
    public final long mo9475l2() {
        return this.f7925a;
    }

    @NonNull
    public final String toString() {
        return m9466f(this);
    }

    @Override // ma.InterfaceC8479b
    @NonNull
    /* JADX INFO: renamed from: x1 */
    public final String mo9476x1() {
        return this.f7926b;
    }
}
