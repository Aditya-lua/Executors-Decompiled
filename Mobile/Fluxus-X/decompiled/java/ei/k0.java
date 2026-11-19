package ei;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13733a = 0;
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13734c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13735d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13736e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13737f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13738g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13739h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13740i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13741j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13742k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13743l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f13744m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13745n = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f13746o = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f13747p = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f13748q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f13749r = BuildConfig.FLAVOR;

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
        if (bi.h.a().e3()) {
            bundle.putLong("mReferredByPlayerId", k0Var.r());
        }
        if (bi.h.a().J0()) {
            bundle.putString("mReservedServerAccessCode", k0Var.t());
            bundle.putString("mCallId", k0Var.e());
        }
        bundle.putString("mGameJoinContext", k0Var.j());
        bundle.putString("roblox_event_id", k0Var.g());
        if (bi.h.a().H3()) {
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
                } else if (!bi.h.a().J0() || str4 == null) {
                    i10 = 0;
                } else {
                    k0Var.L(str4);
                    i10 = 8;
                }
                if (bi.h.a().J0() && str5 != null) {
                    k0Var.w(str5);
                }
            }
            i10 = 2;
            if (bi.h.a().J0()) {
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
        if (bi.h.a().e3() && jLongValue3 != -1) {
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
        if (bi.h.a().H3() && str13 != null) {
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
        k0Var.v(bundle.getString("mAccessCode", BuildConfig.FLAVOR));
        k0Var.G(bundle.getString("mLinkCode", BuildConfig.FLAVOR));
        k0Var.z(bundle.getString("mGameId", BuildConfig.FLAVOR));
        k0Var.K(bundle.getInt("mRequestType", -1));
        k0Var.I(bundle.getString("mReferralPage", BuildConfig.FLAVOR));
        k0Var.F(bundle.getString("mLaunchData"));
        k0Var.D(bundle.getString("mJoinAttemptId", BuildConfig.FLAVOR));
        k0Var.E(bundle.getString("mJoinAttemptOrigin", BuildConfig.FLAVOR));
        k0Var.C(bundle.getString("mIsoContext", BuildConfig.FLAVOR));
        k0Var.B(bundle.getString("mGameJoinContext"));
        k0Var.y(bundle.getString("roblox_event_id"));
        if (bi.h.a().e3()) {
            k0Var.J(bundle.getLong("mReferredByPlayerId", 0L));
        }
        if (bi.h.a().J0()) {
            k0Var.L(bundle.getString("mReservedServerAccessCode", BuildConfig.FLAVOR));
            k0Var.w(bundle.getString("mCallId", BuildConfig.FLAVOR));
        }
        if (bi.h.a().H3()) {
            k0Var.A(bundle.getString("game_id_to_exclude", BuildConfig.FLAVOR));
        }
        return k0Var;
    }

    public void A(String str) {
        this.f13749r = str;
    }

    public void B(String str) {
        this.f13743l = str;
    }

    public void C(@NonNull String str) {
        this.f13747p = str;
    }

    public void D(String str) {
        this.f13745n = str;
    }

    public void E(String str) {
        this.f13746o = str;
    }

    public void F(String str) {
        this.f13742k = str;
    }

    public void G(String str) {
        this.f13736e = str;
    }

    public void H(long j10) {
        this.f13733a = j10;
    }

    public void I(String str) {
        this.f13740i = str;
    }

    public void J(long j10) {
        this.f13748q = j10;
    }

    public void K(int i10) {
        this.f13741j = i10;
    }

    public void L(String str) {
        this.f13738g = str;
    }

    public void M(long j10) {
        this.b = j10;
    }

    public String d() {
        return this.f13735d;
    }

    public String e() {
        return this.f13739h;
    }

    public long f() {
        return this.f13734c;
    }

    public String g() {
        return this.f13744m;
    }

    public String h() {
        return this.f13737f;
    }

    public String i() {
        return this.f13749r;
    }

    public String j() {
        return this.f13743l;
    }

    public String k() {
        return this.f13747p;
    }

    public String l() {
        return this.f13745n;
    }

    public String m() {
        return this.f13746o;
    }

    public String n() {
        return this.f13742k;
    }

    public String o() {
        return this.f13736e;
    }

    public long p() {
        return this.f13733a;
    }

    public String q() {
        return this.f13740i;
    }

    public long r() {
        return this.f13748q;
    }

    public int s() {
        return this.f13741j;
    }

    public String t() {
        return this.f13738g;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f13733a + ", userId:" + this.b + ", conversationId:" + this.f13734c + ", accessCode:" + this.f13735d + ", linkCode:" + this.f13736e + ", gameId:" + this.f13737f + ", reservedServerAccessCode:" + this.f13738g + ", callId:" + this.f13739h + ", reqType:" + this.f13741j + ", referralPage:" + this.f13740i + ", launchData:" + this.f13742k + ", gameJoinContext:" + this.f13743l + ", eventId:" + this.f13744m + ", joinAttemptId:" + this.f13745n + ", joinAttemptOrigin:" + this.f13746o + ", mIsoContext:" + this.f13747p + ", referredByPlayerId:" + this.f13748q + ", gameIdToExclude:" + this.f13749r + " }";
    }

    public long u() {
        return this.b;
    }

    public void v(String str) {
        this.f13735d = str;
    }

    public void w(String str) {
        this.f13739h = str;
    }

    public void x(long j10) {
        this.f13734c = j10;
    }

    public void y(String str) {
        this.f13744m = str;
    }

    public void z(String str) {
        this.f13737f = str;
    }
}
