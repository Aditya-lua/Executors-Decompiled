package p517wh;

import android.os.Bundle;
import androidx.annotation.NonNull;
import th.C11659h;

/* JADX INFO: renamed from: wh.j0 */
/* JADX INFO: loaded from: classes2.dex */
public class C12442j0 {

    /* JADX INFO: renamed from: a */
    public long f44504a = 0;

    /* JADX INFO: renamed from: b */
    public long f44505b = 0;

    /* JADX INFO: renamed from: c */
    public long f44506c = 0;

    /* JADX INFO: renamed from: d */
    public String f44507d = "";

    /* JADX INFO: renamed from: e */
    public String f44508e = "";

    /* JADX INFO: renamed from: f */
    public String f44509f = "";

    /* JADX INFO: renamed from: g */
    public String f44510g = "";

    /* JADX INFO: renamed from: h */
    public String f44511h = "";

    /* JADX INFO: renamed from: i */
    public String f44512i = "";

    /* JADX INFO: renamed from: j */
    public int f44513j = -1;

    /* JADX INFO: renamed from: k */
    public String f44514k = "";

    /* JADX INFO: renamed from: l */
    public String f44515l = "";

    /* JADX INFO: renamed from: m */
    public String f44516m = "";

    /* JADX INFO: renamed from: n */
    public String f44517n = "";

    /* JADX INFO: renamed from: o */
    public String f44518o = "";

    /* JADX INFO: renamed from: p */
    public String f44519p = "";

    /* JADX INFO: renamed from: q */
    public long f44520q = 0;

    /* JADX INFO: renamed from: r */
    public String f44521r = "";

    /* JADX INFO: renamed from: N */
    public static Bundle m46626N(Bundle bundle, C12442j0 c12442j0) {
        if (c12442j0 == null) {
            return null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("mPlaceId", c12442j0.m46656p());
        bundle.putLong("mUserId", c12442j0.m46661u());
        bundle.putLong("mConversationId", c12442j0.m46646f());
        bundle.putString("mAccessCode", c12442j0.m46644d());
        bundle.putString("mLinkCode", c12442j0.m46655o());
        bundle.putString("mGameId", c12442j0.m46648h());
        bundle.putInt("mRequestType", c12442j0.m46659s());
        bundle.putString("mReferralPage", c12442j0.m46657q());
        bundle.putString("mLaunchData", c12442j0.m46654n());
        bundle.putString("mJoinAttemptId", c12442j0.m46652l());
        bundle.putString("mJoinAttemptOrigin", c12442j0.m46653m());
        bundle.putString("mIsoContext", c12442j0.m46651k());
        if (C11659h.m43403a().mo43566X2()) {
            bundle.putLong("mReferredByPlayerId", c12442j0.m46658r());
        }
        if (C11659h.m43403a().mo43433E0()) {
            bundle.putString("mReservedServerAccessCode", c12442j0.m46660t());
            bundle.putString("mCallId", c12442j0.m46645e());
        }
        bundle.putString("mGameJoinContext", c12442j0.m46650j());
        bundle.putString("roblox_event_id", c12442j0.m46647g());
        if (C11659h.m43403a().mo43754x3()) {
            bundle.putString("game_id_to_exclude", c12442j0.m46649i());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: O */
    public static Bundle m46627O(C12442j0 c12442j0) {
        return m46626N(null, c12442j0);
    }

    /* JADX INFO: renamed from: a */
    public static C12442j0 m46628a(Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l12, String str13) {
        int i10;
        C12442j0 c12442j0 = new C12442j0();
        long jLongValue = l10 != null ? l10.longValue() : -1L;
        long jLongValue2 = l11 != null ? l11.longValue() : -1L;
        long jLongValue3 = l12 != null ? l12.longValue() : -1L;
        if (jLongValue2 != -1) {
            c12442j0.m46643M(jLongValue2);
            if (jLongValue != -1) {
                c12442j0.m46638H(jLongValue);
            }
            i10 = 1;
        } else if (jLongValue != -1) {
            c12442j0.m46638H(jLongValue);
            if (str2 != null) {
                c12442j0.m46637G(str2);
            } else {
                if (str != null) {
                    c12442j0.m46662v(str);
                } else if (str3 != null) {
                    c12442j0.m46666z(str3);
                    i10 = 3;
                } else if (!C11659h.m43403a().mo43433E0() || str4 == null) {
                    i10 = 0;
                } else {
                    c12442j0.m46642L(str4);
                    i10 = 8;
                }
                if (C11659h.m43403a().mo43433E0() && str5 != null) {
                    c12442j0.m46663w(str5);
                }
            }
            i10 = 2;
            if (C11659h.m43403a().mo43433E0()) {
                c12442j0.m46663w(str5);
            }
        } else {
            i10 = -1;
        }
        if (num != null) {
            c12442j0.m46641K(num.intValue());
        } else {
            c12442j0.m46641K(i10);
        }
        if (str6 != null) {
            c12442j0.m46639I(str6);
        }
        if (str7 != null) {
            c12442j0.m46636F(str7);
        }
        if (C11659h.m43403a().mo43566X2() && jLongValue3 != -1) {
            c12442j0.m46640J(jLongValue3);
        }
        if (str8 != null) {
            c12442j0.m46632B(str8);
        }
        if (str9 != null) {
            c12442j0.m46665y(str9);
        }
        if (str10 != null) {
            c12442j0.m46634D(str10);
        }
        if (str11 != null) {
            c12442j0.m46635E(str11);
        }
        if (str12 != null) {
            c12442j0.m46633C(str12);
        }
        if (C11659h.m43403a().mo43754x3() && str13 != null) {
            c12442j0.m46631A(str13);
        }
        return c12442j0;
    }

    /* JADX INFO: renamed from: b */
    public static C12442j0 m46629b(Long l10, Long l11, String str, String str2, String str3) {
        C12442j0 c12442j0 = new C12442j0();
        long jLongValue = l10 != null ? l10.longValue() : -1L;
        long jLongValue2 = l11 != null ? l11.longValue() : -1L;
        if (jLongValue != -1 && jLongValue2 != -1) {
            c12442j0.m46664x(jLongValue2);
            c12442j0.m46638H(jLongValue);
            c12442j0.m46641K(6);
        }
        if (str != null) {
            c12442j0.m46639I(str);
        }
        if (str2 != null) {
            c12442j0.m46634D(str2);
        }
        if (str3 != null) {
            c12442j0.m46635E(str3);
        }
        return c12442j0;
    }

    /* JADX INFO: renamed from: c */
    public static C12442j0 m46630c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C12442j0 c12442j0 = new C12442j0();
        c12442j0.m46638H(bundle.getLong("mPlaceId", 0L));
        c12442j0.m46643M(bundle.getLong("mUserId", 0L));
        c12442j0.m46664x(bundle.getLong("mConversationId", 0L));
        c12442j0.m46662v(bundle.getString("mAccessCode", ""));
        c12442j0.m46637G(bundle.getString("mLinkCode", ""));
        c12442j0.m46666z(bundle.getString("mGameId", ""));
        c12442j0.m46641K(bundle.getInt("mRequestType", -1));
        c12442j0.m46639I(bundle.getString("mReferralPage", ""));
        c12442j0.m46636F(bundle.getString("mLaunchData"));
        c12442j0.m46634D(bundle.getString("mJoinAttemptId", ""));
        c12442j0.m46635E(bundle.getString("mJoinAttemptOrigin", ""));
        c12442j0.m46633C(bundle.getString("mIsoContext", ""));
        c12442j0.m46632B(bundle.getString("mGameJoinContext"));
        c12442j0.m46665y(bundle.getString("roblox_event_id"));
        if (C11659h.m43403a().mo43566X2()) {
            c12442j0.m46640J(bundle.getLong("mReferredByPlayerId", 0L));
        }
        if (C11659h.m43403a().mo43433E0()) {
            c12442j0.m46642L(bundle.getString("mReservedServerAccessCode", ""));
            c12442j0.m46663w(bundle.getString("mCallId", ""));
        }
        if (C11659h.m43403a().mo43754x3()) {
            c12442j0.m46631A(bundle.getString("game_id_to_exclude", ""));
        }
        return c12442j0;
    }

    /* JADX INFO: renamed from: A */
    public void m46631A(String str) {
        this.f44521r = str;
    }

    /* JADX INFO: renamed from: B */
    public void m46632B(String str) {
        this.f44515l = str;
    }

    /* JADX INFO: renamed from: C */
    public void m46633C(@NonNull String str) {
        this.f44519p = str;
    }

    /* JADX INFO: renamed from: D */
    public void m46634D(String str) {
        this.f44517n = str;
    }

    /* JADX INFO: renamed from: E */
    public void m46635E(String str) {
        this.f44518o = str;
    }

    /* JADX INFO: renamed from: F */
    public void m46636F(String str) {
        this.f44514k = str;
    }

    /* JADX INFO: renamed from: G */
    public void m46637G(String str) {
        this.f44508e = str;
    }

    /* JADX INFO: renamed from: H */
    public void m46638H(long j10) {
        this.f44504a = j10;
    }

    /* JADX INFO: renamed from: I */
    public void m46639I(String str) {
        this.f44512i = str;
    }

    /* JADX INFO: renamed from: J */
    public void m46640J(long j10) {
        this.f44520q = j10;
    }

    /* JADX INFO: renamed from: K */
    public void m46641K(int i10) {
        this.f44513j = i10;
    }

    /* JADX INFO: renamed from: L */
    public void m46642L(String str) {
        this.f44510g = str;
    }

    /* JADX INFO: renamed from: M */
    public void m46643M(long j10) {
        this.f44505b = j10;
    }

    /* JADX INFO: renamed from: d */
    public String m46644d() {
        return this.f44507d;
    }

    /* JADX INFO: renamed from: e */
    public String m46645e() {
        return this.f44511h;
    }

    /* JADX INFO: renamed from: f */
    public long m46646f() {
        return this.f44506c;
    }

    /* JADX INFO: renamed from: g */
    public String m46647g() {
        return this.f44516m;
    }

    /* JADX INFO: renamed from: h */
    public String m46648h() {
        return this.f44509f;
    }

    /* JADX INFO: renamed from: i */
    public String m46649i() {
        return this.f44521r;
    }

    /* JADX INFO: renamed from: j */
    public String m46650j() {
        return this.f44515l;
    }

    /* JADX INFO: renamed from: k */
    public String m46651k() {
        return this.f44519p;
    }

    /* JADX INFO: renamed from: l */
    public String m46652l() {
        return this.f44517n;
    }

    /* JADX INFO: renamed from: m */
    public String m46653m() {
        return this.f44518o;
    }

    /* JADX INFO: renamed from: n */
    public String m46654n() {
        return this.f44514k;
    }

    /* JADX INFO: renamed from: o */
    public String m46655o() {
        return this.f44508e;
    }

    /* JADX INFO: renamed from: p */
    public long m46656p() {
        return this.f44504a;
    }

    /* JADX INFO: renamed from: q */
    public String m46657q() {
        return this.f44512i;
    }

    /* JADX INFO: renamed from: r */
    public long m46658r() {
        return this.f44520q;
    }

    /* JADX INFO: renamed from: s */
    public int m46659s() {
        return this.f44513j;
    }

    /* JADX INFO: renamed from: t */
    public String m46660t() {
        return this.f44510g;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f44504a + ", userId:" + this.f44505b + ", conversationId:" + this.f44506c + ", accessCode:" + this.f44507d + ", linkCode:" + this.f44508e + ", gameId:" + this.f44509f + ", reservedServerAccessCode:" + this.f44510g + ", callId:" + this.f44511h + ", reqType:" + this.f44513j + ", referralPage:" + this.f44512i + ", launchData:" + this.f44514k + ", gameJoinContext:" + this.f44515l + ", eventId:" + this.f44516m + ", joinAttemptId:" + this.f44517n + ", joinAttemptOrigin:" + this.f44518o + ", mIsoContext:" + this.f44519p + ", referredByPlayerId:" + this.f44520q + ", gameIdToExclude:" + this.f44521r + " }";
    }

    /* JADX INFO: renamed from: u */
    public long m46661u() {
        return this.f44505b;
    }

    /* JADX INFO: renamed from: v */
    public void m46662v(String str) {
        this.f44507d = str;
    }

    /* JADX INFO: renamed from: w */
    public void m46663w(String str) {
        this.f44511h = str;
    }

    /* JADX INFO: renamed from: x */
    public void m46664x(long j10) {
        this.f44506c = j10;
    }

    /* JADX INFO: renamed from: y */
    public void m46665y(String str) {
        this.f44516m = str;
    }

    /* JADX INFO: renamed from: z */
    public void m46666z(String str) {
        this.f44509f = str;
    }
}
