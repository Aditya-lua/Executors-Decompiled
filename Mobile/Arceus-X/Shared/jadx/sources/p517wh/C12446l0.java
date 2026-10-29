package p517wh;

import android.os.Bundle;
import th.C11659h;

/* JADX INFO: renamed from: wh.l0 */
/* JADX INFO: loaded from: classes2.dex */
public class C12446l0 {

    /* JADX INFO: renamed from: a */
    public int f44526a;

    /* JADX INFO: renamed from: b */
    public long f44527b;

    /* JADX INFO: renamed from: c */
    public long f44528c;

    /* JADX INFO: renamed from: d */
    public String f44529d;

    /* JADX INFO: renamed from: e */
    public String f44530e;

    /* JADX INFO: renamed from: f */
    public String f44531f;

    /* JADX INFO: renamed from: g */
    public long f44532g;

    /* JADX INFO: renamed from: h */
    public String f44533h;

    /* JADX INFO: renamed from: i */
    public String f44534i;

    /* JADX INFO: renamed from: j */
    public String f44535j;

    /* JADX INFO: renamed from: k */
    public String f44536k;

    /* JADX INFO: renamed from: l */
    public String f44537l;

    /* JADX INFO: renamed from: m */
    public String f44538m;

    /* JADX INFO: renamed from: n */
    public String f44539n;

    /* JADX INFO: renamed from: o */
    public String f44540o;

    /* JADX INFO: renamed from: p */
    public String f44541p;

    /* JADX INFO: renamed from: q */
    public long f44542q;

    /* JADX INFO: renamed from: r */
    public String f44543r;

    public C12446l0(Bundle bundle) {
        this.f44526a = 0;
        this.f44527b = 0L;
        this.f44528c = 0L;
        this.f44529d = "";
        this.f44530e = "";
        this.f44531f = "";
        this.f44532g = 0L;
        this.f44533h = "";
        this.f44534i = "";
        this.f44535j = "";
        this.f44536k = "";
        this.f44537l = "";
        this.f44538m = "";
        this.f44539n = "";
        this.f44540o = "";
        this.f44541p = "";
        this.f44542q = 0L;
        this.f44543r = "";
        this.f44528c = bundle.getLong("roblox_placeId", 0L);
        this.f44529d = bundle.getString("roblox_accessCode");
        this.f44530e = bundle.getString("roblox_linkCode");
        this.f44531f = bundle.getString("roblox_gameId");
        this.f44527b = bundle.getLong("roblox_userId", 0L);
        this.f44532g = bundle.getLong("roblox_conversationId", 0L);
        this.f44533h = bundle.getString("roblox_reservedServerAccessCode");
        this.f44534i = bundle.getString("roblox_callId");
        this.f44526a = bundle.getInt("roblox_joinRequestType", -1);
        this.f44535j = bundle.getString("roblox_referralPage");
        this.f44536k = bundle.getString("roblox_launchData");
        this.f44539n = bundle.getString("roblox_joinAttemptId");
        this.f44540o = bundle.getString("roblox_joinAttemptOrigin");
        this.f44541p = bundle.getString("roblox_isoContext");
        if (C11659h.m43403a().mo43566X2()) {
            this.f44542q = bundle.getLong("roblox_referredByPlayerId", 0L);
        }
        this.f44537l = bundle.getString("roblox_gameJoinContext");
        this.f44538m = bundle.getString("roblox_event_id");
        this.f44543r = bundle.getString("game_id_to_exclude");
    }
}
