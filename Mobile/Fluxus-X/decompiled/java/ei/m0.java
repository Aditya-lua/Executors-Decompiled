package ei;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13754a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f13765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f13767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f13768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f13769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f13770r;

    public m0(Bundle bundle) {
        this.f13754a = 0;
        this.b = 0L;
        this.f13755c = 0L;
        this.f13756d = BuildConfig.FLAVOR;
        this.f13757e = BuildConfig.FLAVOR;
        this.f13758f = BuildConfig.FLAVOR;
        this.f13759g = 0L;
        this.f13760h = BuildConfig.FLAVOR;
        this.f13761i = BuildConfig.FLAVOR;
        this.f13762j = BuildConfig.FLAVOR;
        this.f13763k = BuildConfig.FLAVOR;
        this.f13764l = BuildConfig.FLAVOR;
        this.f13765m = BuildConfig.FLAVOR;
        this.f13766n = BuildConfig.FLAVOR;
        this.f13767o = BuildConfig.FLAVOR;
        this.f13768p = BuildConfig.FLAVOR;
        this.f13769q = 0L;
        this.f13770r = BuildConfig.FLAVOR;
        this.f13755c = bundle.getLong("roblox_placeId", 0L);
        this.f13756d = bundle.getString("roblox_accessCode");
        this.f13757e = bundle.getString("roblox_linkCode");
        this.f13758f = bundle.getString("roblox_gameId");
        this.b = bundle.getLong("roblox_userId", 0L);
        this.f13759g = bundle.getLong("roblox_conversationId", 0L);
        this.f13760h = bundle.getString("roblox_reservedServerAccessCode");
        this.f13761i = bundle.getString("roblox_callId");
        this.f13754a = bundle.getInt("roblox_joinRequestType", -1);
        this.f13762j = bundle.getString("roblox_referralPage");
        this.f13763k = bundle.getString("roblox_launchData");
        this.f13766n = bundle.getString("roblox_joinAttemptId");
        this.f13767o = bundle.getString("roblox_joinAttemptOrigin");
        this.f13768p = bundle.getString("roblox_isoContext");
        if (bi.h.a().e3()) {
            this.f13769q = bundle.getLong("roblox_referredByPlayerId", 0L);
        }
        this.f13764l = bundle.getString("roblox_gameJoinContext");
        this.f13765m = bundle.getString("roblox_event_id");
        this.f13770r = bundle.getString("game_id_to_exclude");
    }
}
