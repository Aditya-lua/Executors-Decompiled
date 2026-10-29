package wh;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34337a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f34342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f34347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f34348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f34349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f34352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f34353r;

    public l0(Bundle bundle) {
        this.f34337a = 0;
        this.b = 0L;
        this.f34338c = 0L;
        this.f34339d = "";
        this.f34340e = "";
        this.f34341f = "";
        this.f34342g = 0L;
        this.f34343h = "";
        this.f34344i = "";
        this.f34345j = "";
        this.f34346k = "";
        this.f34347l = "";
        this.f34348m = "";
        this.f34349n = "";
        this.f34350o = "";
        this.f34351p = "";
        this.f34352q = 0L;
        this.f34353r = "";
        this.f34338c = bundle.getLong("roblox_placeId", 0L);
        this.f34339d = bundle.getString("roblox_accessCode");
        this.f34340e = bundle.getString("roblox_linkCode");
        this.f34341f = bundle.getString("roblox_gameId");
        this.b = bundle.getLong("roblox_userId", 0L);
        this.f34342g = bundle.getLong("roblox_conversationId", 0L);
        this.f34343h = bundle.getString("roblox_reservedServerAccessCode");
        this.f34344i = bundle.getString("roblox_callId");
        this.f34337a = bundle.getInt("roblox_joinRequestType", -1);
        this.f34345j = bundle.getString("roblox_referralPage");
        this.f34346k = bundle.getString("roblox_launchData");
        this.f34349n = bundle.getString("roblox_joinAttemptId");
        this.f34350o = bundle.getString("roblox_joinAttemptOrigin");
        this.f34351p = bundle.getString("roblox_isoContext");
        if (th.h.a().R2()) {
            this.f34352q = bundle.getLong("roblox_referredByPlayerId", 0L);
        }
        this.f34347l = bundle.getString("roblox_gameJoinContext");
        this.f34348m = bundle.getString("roblox_event_id");
        this.f34353r = bundle.getString("game_id_to_exclude");
    }
}
