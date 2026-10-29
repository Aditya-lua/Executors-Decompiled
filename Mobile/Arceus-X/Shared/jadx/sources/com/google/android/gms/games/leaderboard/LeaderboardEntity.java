package com.google.android.gms.games.leaderboard;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import ma.InterfaceC8478a;
import ma.InterfaceC8480c;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardEntity implements InterfaceC8478a {

    /* JADX INFO: renamed from: a */
    public final String f7919a;

    /* JADX INFO: renamed from: b */
    public final String f7920b;

    /* JADX INFO: renamed from: c */
    public final Uri f7921c;

    /* JADX INFO: renamed from: d */
    public final int f7922d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f7923e;

    /* JADX INFO: renamed from: f */
    public final String f7924f;

    /* JADX INFO: renamed from: a */
    public static int m9456a(InterfaceC8478a interfaceC8478a) {
        return C8947k.m36027c(interfaceC8478a.mo9459T2(), interfaceC8478a.mo9462l(), interfaceC8478a.mo9461h(), Integer.valueOf(interfaceC8478a.mo9463y0()), interfaceC8478a.mo9460b2());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9457b(InterfaceC8478a interfaceC8478a, Object obj) {
        if (!(obj instanceof InterfaceC8478a)) {
            return false;
        }
        if (interfaceC8478a == obj) {
            return true;
        }
        InterfaceC8478a interfaceC8478a2 = (InterfaceC8478a) obj;
        return C8947k.m36026b(interfaceC8478a2.mo9459T2(), interfaceC8478a.mo9459T2()) && C8947k.m36026b(interfaceC8478a2.mo9462l(), interfaceC8478a.mo9462l()) && C8947k.m36026b(interfaceC8478a2.mo9461h(), interfaceC8478a.mo9461h()) && C8947k.m36026b(Integer.valueOf(interfaceC8478a2.mo9463y0()), Integer.valueOf(interfaceC8478a.mo9463y0())) && C8947k.m36026b(interfaceC8478a2.mo9460b2(), interfaceC8478a.mo9460b2());
    }

    /* JADX INFO: renamed from: f */
    public static String m9458f(InterfaceC8478a interfaceC8478a) {
        return C8947k.m36028d(interfaceC8478a).m36029a("LeaderboardId", interfaceC8478a.mo9459T2()).m36029a("DisplayName", interfaceC8478a.mo9462l()).m36029a("IconImageUri", interfaceC8478a.mo9461h()).m36029a("IconImageUrl", interfaceC8478a.getIconImageUrl()).m36029a("ScoreOrder", Integer.valueOf(interfaceC8478a.mo9463y0())).m36029a("Variants", interfaceC8478a.mo9460b2()).toString();
    }

    @Override // ma.InterfaceC8478a
    @NonNull
    /* JADX INFO: renamed from: T2 */
    public final String mo9459T2() {
        return this.f7919a;
    }

    @Override // ma.InterfaceC8478a
    @NonNull
    /* JADX INFO: renamed from: b2 */
    public final ArrayList<InterfaceC8480c> mo9460b2() {
        return new ArrayList<>(this.f7923e);
    }

    public final boolean equals(Object obj) {
        return m9457b(this, obj);
    }

    @Override // ma.InterfaceC8478a
    @NonNull
    public String getIconImageUrl() {
        return this.f7924f;
    }

    @Override // ma.InterfaceC8478a
    @NonNull
    /* JADX INFO: renamed from: h */
    public final Uri mo9461h() {
        return this.f7921c;
    }

    public final int hashCode() {
        return m9456a(this);
    }

    @Override // ma.InterfaceC8478a
    @NonNull
    /* JADX INFO: renamed from: l */
    public final String mo9462l() {
        return this.f7920b;
    }

    @NonNull
    public final String toString() {
        return m9458f(this);
    }

    @Override // ma.InterfaceC8478a
    /* JADX INFO: renamed from: y0 */
    public final int mo9463y0() {
        return this.f7922d;
    }
}
