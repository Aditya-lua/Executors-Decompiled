package uh;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32995a = 0;
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32996c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32997d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32998e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32999f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33000g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33001h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33002i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33003j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f33004k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f33005l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f33006m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f33007n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33008o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33009p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f33010q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f33011r = "";

    public static Bundle N(Bundle bundle, k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("mPlaceId", k0Var.p());
        bundle.putLong("mUserId", k0Var.u());
        bundle.putLong("mConversationId", k0Var.f());
        bundle.putString("mAccessCode", k0Var.d());
        bundle.putString("mLinkCode", k0Var.o());
        bundle.putString("mGameId", k0Var.h());
        bundle.putInt("mRequestType", k0Var.s());
        bundle.putString("mReferralPage", k0Var.q());
        bundle.putString("mLaunchData", k0Var.n());
        bundle.putString("mJoinAttemptId", k0Var.l());
        bundle.putString("mJoinAttemptOrigin", k0Var.m());
        bundle.putString("mIsoContext", k0Var.k());
        if (rh.h.a().c3()) {
            bundle.putLong("mReferredByPlayerId", k0Var.r());
        }
        if (rh.h.a().F0()) {
            bundle.putString("mReservedServerAccessCode", k0Var.t());
            bundle.putString("mCallId", k0Var.e());
        }
        bundle.putString("mGameJoinContext", k0Var.j());
        bundle.putString("roblox_event_id", k0Var.g());
        if (rh.h.a().D3()) {
            bundle.putString("game_id_to_exclude", k0Var.i());
        }
        return bundle;
    }

    public static Bundle O(k0 k0Var) {
        return N(null, k0Var);
    }

    public static k0 a(Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l12, String str13) {
        int i10;
        k0 k0Var = new k0();
        long jLongValue = l10 != null ? l10.longValue() : -1L;
        long jLongValue2 = l11 != null ? l11.longValue() : -1L;
        long jLongValue3 = l12 != null ? l12.longValue() : -1L;
        if (jLongValue2 != -1) {
            k0Var.M(jLongValue2);
            if (jLongValue != -1) {
                k0Var.H(jLongValue);
            }
            i10 = 1;
        } else if (jLongValue != -1) {
            k0Var.H(jLongValue);
            if (str2 != null) {
                k0Var.G(str2);
            } else {
                if (str != null) {
                    k0Var.v(str);
                } else if (str3 != null) {
                    k0Var.z(str3);
                    i10 = 3;
                } else if (!rh.h.a().F0() || str4 == null) {
                    i10 = 0;
                } else {
                    k0Var.L(str4);
                    i10 = 8;
                }
                if (rh.h.a().F0() && str5 != null) {
                    k0Var.w(str5);
                }
            }
            i10 = 2;
            if (rh.h.a().F0()) {
                k0Var.w(str5);
            }
        } else {
            i10 = -1;
        }
        if (num != null) {
            k0Var.K(num.intValue());
        } else {
            k0Var.K(i10);
        }
        if (str6 != null) {
            k0Var.I(str6);
        }
        if (str7 != null) {
            k0Var.F(str7);
        }
        if (rh.h.a().c3() && jLongValue3 != -1) {
            k0Var.J(jLongValue3);
        }
        if (str8 != null) {
            k0Var.B(str8);
        }
        if (str9 != null) {
            k0Var.y(str9);
        }
        if (str10 != null) {
            k0Var.D(str10);
        }
        if (str11 != null) {
            k0Var.E(str11);
        }
        if (str12 != null) {
            k0Var.C(str12);
        }
        if (rh.h.a().D3() && str13 != null) {
            k0Var.A(str13);
        }
        return k0Var;
    }

    public static k0 b(Long l10, Long l11, String str, String str2, String str3) {
        k0 k0Var = new k0();
        long jLongValue = l10 != null ? l10.longValue() : -1L;
        long jLongValue2 = l11 != null ? l11.longValue() : -1L;
        if (jLongValue != -1 && jLongValue2 != -1) {
            k0Var.x(jLongValue2);
            k0Var.H(jLongValue);
            k0Var.K(6);
        }
        if (str != null) {
            k0Var.I(str);
        }
        if (str2 != null) {
            k0Var.D(str2);
        }
        if (str3 != null) {
            k0Var.E(str3);
        }
        return k0Var;
    }

    public static k0 c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        k0 k0Var = new k0();
        k0Var.H(bundle.getLong("mPlaceId", 0L));
        k0Var.M(bundle.getLong("mUserId", 0L));
        k0Var.x(bundle.getLong("mConversationId", 0L));
        k0Var.v(bundle.getString("mAccessCode", ""));
        k0Var.G(bundle.getString("mLinkCode", ""));
        k0Var.z(bundle.getString("mGameId", ""));
        k0Var.K(bundle.getInt("mRequestType", -1));
        k0Var.I(bundle.getString("mReferralPage", ""));
        k0Var.F(bundle.getString("mLaunchData"));
        k0Var.D(bundle.getString("mJoinAttemptId", ""));
        k0Var.E(bundle.getString("mJoinAttemptOrigin", ""));
        k0Var.C(bundle.getString("mIsoContext", ""));
        k0Var.B(bundle.getString("mGameJoinContext"));
        k0Var.y(bundle.getString("roblox_event_id"));
        if (rh.h.a().c3()) {
            k0Var.J(bundle.getLong("mReferredByPlayerId", 0L));
        }
        if (rh.h.a().F0()) {
            k0Var.L(bundle.getString("mReservedServerAccessCode", ""));
            k0Var.w(bundle.getString("mCallId", ""));
        }
        if (rh.h.a().D3()) {
            k0Var.A(bundle.getString("game_id_to_exclude", ""));
        }
        return k0Var;
    }

    public void A(String str) {
        this.f33011r = str;
    }

    public void B(String str) {
        this.f33005l = str;
    }

    public void C(@NonNull String str) {
        this.f33009p = str;
    }

    public void D(String str) {
        this.f33007n = str;
    }

    public void E(String str) {
        this.f33008o = str;
    }

    public void F(String str) {
        this.f33004k = str;
    }

    public void G(String str) {
        this.f32998e = str;
    }

    public void H(long j10) {
        this.f32995a = j10;
    }

    public void I(String str) {
        this.f33002i = str;
    }

    public void J(long j10) {
        this.f33010q = j10;
    }

    public void K(int i10) {
        this.f33003j = i10;
    }

    public void L(String str) {
        this.f33000g = str;
    }

    public void M(long j10) {
        this.b = j10;
    }

    public String d() {
        return this.f32997d;
    }

    public String e() {
        return this.f33001h;
    }

    public long f() {
        return this.f32996c;
    }

    public String g() {
        return this.f33006m;
    }

    public String h() {
        return this.f32999f;
    }

    public String i() {
        return this.f33011r;
    }

    public String j() {
        return this.f33005l;
    }

    public String k() {
        return this.f33009p;
    }

    public String l() {
        return this.f33007n;
    }

    public String m() {
        return this.f33008o;
    }

    public String n() {
        return this.f33004k;
    }

    public String o() {
        return this.f32998e;
    }

    public long p() {
        return this.f32995a;
    }

    public String q() {
        return this.f33002i;
    }

    public long r() {
        return this.f33010q;
    }

    public int s() {
        return this.f33003j;
    }

    public String t() {
        return this.f33000g;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f32995a + ", userId:" + this.b + ", conversationId:" + this.f32996c + ", accessCode:" + this.f32997d + ", linkCode:" + this.f32998e + ", gameId:" + this.f32999f + ", reservedServerAccessCode:" + this.f33000g + ", callId:" + this.f33001h + ", reqType:" + this.f33003j + ", referralPage:" + this.f33002i + ", launchData:" + this.f33004k + ", gameJoinContext:" + this.f33005l + ", eventId:" + this.f33006m + ", joinAttemptId:" + this.f33007n + ", joinAttemptOrigin:" + this.f33008o + ", mIsoContext:" + this.f33009p + ", referredByPlayerId:" + this.f33010q + ", gameIdToExclude:" + this.f33011r + " }";
    }

    public long u() {
        return this.b;
    }

    public void v(String str) {
        this.f32997d = str;
    }

    public void w(String str) {
        this.f33001h = str;
    }

    public void x(long j10) {
        this.f32996c = j10;
    }

    public void y(String str) {
        this.f33006m = str;
    }

    public void z(String str) {
        this.f32999f = str;
    }
}
