package wh;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34317a = 0;
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34318c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34319d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34320e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34321f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34322g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34323h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34324i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34325j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34326k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f34327l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f34328m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f34329n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34330o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34331p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f34332q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f34333r = "";

    public static Bundle N(Bundle bundle, j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("mPlaceId", j0Var.p());
        bundle.putLong("mUserId", j0Var.u());
        bundle.putLong("mConversationId", j0Var.f());
        bundle.putString("mAccessCode", j0Var.d());
        bundle.putString("mLinkCode", j0Var.o());
        bundle.putString("mGameId", j0Var.h());
        bundle.putInt("mRequestType", j0Var.s());
        bundle.putString("mReferralPage", j0Var.q());
        bundle.putString("mLaunchData", j0Var.n());
        bundle.putString("mJoinAttemptId", j0Var.l());
        bundle.putString("mJoinAttemptOrigin", j0Var.m());
        bundle.putString("mIsoContext", j0Var.k());
        if (th.h.a().R2()) {
            bundle.putLong("mReferredByPlayerId", j0Var.r());
        }
        if (th.h.a().B0()) {
            bundle.putString("mReservedServerAccessCode", j0Var.t());
            bundle.putString("mCallId", j0Var.e());
        }
        bundle.putString("mGameJoinContext", j0Var.j());
        bundle.putString("roblox_event_id", j0Var.g());
        if (th.h.a().r3()) {
            bundle.putString("game_id_to_exclude", j0Var.i());
        }
        return bundle;
    }

    public static Bundle O(j0 j0Var) {
        return N(null, j0Var);
    }

    public static j0 a(Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l12, String str13) {
        int i10;
        j0 j0Var = new j0();
        long jLongValue = l10 != null ? l10.longValue() : -1L;
        long jLongValue2 = l11 != null ? l11.longValue() : -1L;
        long jLongValue3 = l12 != null ? l12.longValue() : -1L;
        if (jLongValue2 != -1) {
            j0Var.M(jLongValue2);
            if (jLongValue != -1) {
                j0Var.H(jLongValue);
            }
            i10 = 1;
        } else if (jLongValue != -1) {
            j0Var.H(jLongValue);
            if (str2 != null) {
                j0Var.G(str2);
            } else {
                if (str != null) {
                    j0Var.v(str);
                } else if (str3 != null) {
                    j0Var.z(str3);
                    i10 = 3;
                } else if (!th.h.a().B0() || str4 == null) {
                    i10 = 0;
                } else {
                    j0Var.L(str4);
                    i10 = 8;
                }
                if (th.h.a().B0() && str5 != null) {
                    j0Var.w(str5);
                }
            }
            i10 = 2;
            if (th.h.a().B0()) {
                j0Var.w(str5);
            }
        } else {
            i10 = -1;
        }
        if (num != null) {
            j0Var.K(num.intValue());
        } else {
            j0Var.K(i10);
        }
        if (str6 != null) {
            j0Var.I(str6);
        }
        if (str7 != null) {
            j0Var.F(str7);
        }
        if (th.h.a().R2() && jLongValue3 != -1) {
            j0Var.J(jLongValue3);
        }
        if (str8 != null) {
            j0Var.B(str8);
        }
        if (str9 != null) {
            j0Var.y(str9);
        }
        if (str10 != null) {
            j0Var.D(str10);
        }
        if (str11 != null) {
            j0Var.E(str11);
        }
        if (str12 != null) {
            j0Var.C(str12);
        }
        if (th.h.a().r3() && str13 != null) {
            j0Var.A(str13);
        }
        return j0Var;
    }

    public static j0 b(Long l10, Long l11, String str, String str2, String str3) {
        j0 j0Var = new j0();
        long jLongValue = l10 != null ? l10.longValue() : -1L;
        long jLongValue2 = l11 != null ? l11.longValue() : -1L;
        if (jLongValue != -1 && jLongValue2 != -1) {
            j0Var.x(jLongValue2);
            j0Var.H(jLongValue);
            j0Var.K(6);
        }
        if (str != null) {
            j0Var.I(str);
        }
        if (str2 != null) {
            j0Var.D(str2);
        }
        if (str3 != null) {
            j0Var.E(str3);
        }
        return j0Var;
    }

    public static j0 c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.H(bundle.getLong("mPlaceId", 0L));
        j0Var.M(bundle.getLong("mUserId", 0L));
        j0Var.x(bundle.getLong("mConversationId", 0L));
        j0Var.v(bundle.getString("mAccessCode", ""));
        j0Var.G(bundle.getString("mLinkCode", ""));
        j0Var.z(bundle.getString("mGameId", ""));
        j0Var.K(bundle.getInt("mRequestType", -1));
        j0Var.I(bundle.getString("mReferralPage", ""));
        j0Var.F(bundle.getString("mLaunchData"));
        j0Var.D(bundle.getString("mJoinAttemptId", ""));
        j0Var.E(bundle.getString("mJoinAttemptOrigin", ""));
        j0Var.C(bundle.getString("mIsoContext", ""));
        j0Var.B(bundle.getString("mGameJoinContext"));
        j0Var.y(bundle.getString("roblox_event_id"));
        if (th.h.a().R2()) {
            j0Var.J(bundle.getLong("mReferredByPlayerId", 0L));
        }
        if (th.h.a().B0()) {
            j0Var.L(bundle.getString("mReservedServerAccessCode", ""));
            j0Var.w(bundle.getString("mCallId", ""));
        }
        if (th.h.a().r3()) {
            j0Var.A(bundle.getString("game_id_to_exclude", ""));
        }
        return j0Var;
    }

    public void A(String str) {
        this.f34333r = str;
    }

    public void B(String str) {
        this.f34327l = str;
    }

    public void C(@NonNull String str) {
        this.f34331p = str;
    }

    public void D(String str) {
        this.f34329n = str;
    }

    public void E(String str) {
        this.f34330o = str;
    }

    public void F(String str) {
        this.f34326k = str;
    }

    public void G(String str) {
        this.f34320e = str;
    }

    public void H(long j10) {
        this.f34317a = j10;
    }

    public void I(String str) {
        this.f34324i = str;
    }

    public void J(long j10) {
        this.f34332q = j10;
    }

    public void K(int i10) {
        this.f34325j = i10;
    }

    public void L(String str) {
        this.f34322g = str;
    }

    public void M(long j10) {
        this.b = j10;
    }

    public String d() {
        return this.f34319d;
    }

    public String e() {
        return this.f34323h;
    }

    public long f() {
        return this.f34318c;
    }

    public String g() {
        return this.f34328m;
    }

    public String h() {
        return this.f34321f;
    }

    public String i() {
        return this.f34333r;
    }

    public String j() {
        return this.f34327l;
    }

    public String k() {
        return this.f34331p;
    }

    public String l() {
        return this.f34329n;
    }

    public String m() {
        return this.f34330o;
    }

    public String n() {
        return this.f34326k;
    }

    public String o() {
        return this.f34320e;
    }

    public long p() {
        return this.f34317a;
    }

    public String q() {
        return this.f34324i;
    }

    public long r() {
        return this.f34332q;
    }

    public int s() {
        return this.f34325j;
    }

    public String t() {
        return this.f34322g;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f34317a + ", userId:" + this.b + ", conversationId:" + this.f34318c + ", accessCode:" + this.f34319d + ", linkCode:" + this.f34320e + ", gameId:" + this.f34321f + ", reservedServerAccessCode:" + this.f34322g + ", callId:" + this.f34323h + ", reqType:" + this.f34325j + ", referralPage:" + this.f34324i + ", launchData:" + this.f34326k + ", gameJoinContext:" + this.f34327l + ", eventId:" + this.f34328m + ", joinAttemptId:" + this.f34329n + ", joinAttemptOrigin:" + this.f34330o + ", mIsoContext:" + this.f34331p + ", referredByPlayerId:" + this.f34332q + ", gameIdToExclude:" + this.f34333r + " }";
    }

    public long u() {
        return this.b;
    }

    public void v(String str) {
        this.f34319d = str;
    }

    public void w(String str) {
        this.f34323h = str;
    }

    public void x(long j10) {
        this.f34318c = j10;
    }

    public void y(String str) {
        this.f34328m = str;
    }

    public void z(String str) {
        this.f34321f = str;
    }
}
