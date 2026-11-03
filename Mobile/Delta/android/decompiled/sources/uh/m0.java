package uh;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33016a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f33017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f33025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f33026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f33027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f33028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f33031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f33032r;

    public m0(Bundle bundle) {
        this.f33016a = 0;
        this.b = 0L;
        this.f33017c = 0L;
        this.f33018d = "";
        this.f33019e = "";
        this.f33020f = "";
        this.f33021g = 0L;
        this.f33022h = "";
        this.f33023i = "";
        this.f33024j = "";
        this.f33025k = "";
        this.f33026l = "";
        this.f33027m = "";
        this.f33028n = "";
        this.f33029o = "";
        this.f33030p = "";
        this.f33031q = 0L;
        this.f33032r = "";
        this.f33017c = bundle.getLong("roblox_placeId", 0L);
        this.f33018d = bundle.getString("roblox_accessCode");
        this.f33019e = bundle.getString("roblox_linkCode");
        this.f33020f = bundle.getString("roblox_gameId");
        this.b = bundle.getLong("roblox_userId", 0L);
        this.f33021g = bundle.getLong("roblox_conversationId", 0L);
        this.f33022h = bundle.getString("roblox_reservedServerAccessCode");
        this.f33023i = bundle.getString("roblox_callId");
        this.f33016a = bundle.getInt("roblox_joinRequestType", -1);
        this.f33024j = bundle.getString("roblox_referralPage");
        this.f33025k = bundle.getString("roblox_launchData");
        this.f33028n = bundle.getString("roblox_joinAttemptId");
        this.f33029o = bundle.getString("roblox_joinAttemptOrigin");
        this.f33030p = bundle.getString("roblox_isoContext");
        if (rh.h.a().c3()) {
            this.f33031q = bundle.getLong("roblox_referredByPlayerId", 0L);
        }
        this.f33026l = bundle.getString("roblox_gameJoinContext");
        this.f33027m = bundle.getString("roblox_event_id");
        this.f33032r = bundle.getString("game_id_to_exclude");
    }
}
