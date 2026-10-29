package rh;

import com.roblox.client.feature.FeatureState;
import gk.p;
import vi.h;
import wh.f;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29863a = "rbx.appshell";
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29864c;

    public a(d dVar, int i10) {
        this.b = dVar;
        this.f29864c = i10;
    }

    public ok.c a(String str) {
        return new ok.d(str);
    }

    public ok.b b(long j10) {
        return new ok.b("AppShellNotifications", Long.toString(j10), "StartConversationWithId", "Chat");
    }

    public ok.b c(long j10) {
        return new ok.b("AppShellNotifications", Long.toString(j10), "StartConversationWithUserId", "Chat");
    }

    public wh.a d() {
        androidx.fragment.app.c cVarR = this.b.r(e());
        if (cVarR instanceof wh.a) {
            return (wh.a) cVarR;
        }
        return null;
    }

    public final String e() {
        return a.class.getName();
    }

    public boolean f() {
        f.j().r();
        return true;
    }

    public void g(FeatureState featureState) {
        wh.a aVarD = d();
        if (aVarD == null) {
            p.h("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            aVarD = new wh.a();
        }
        p.b("rbx.appshell", "onShow: ... state = " + featureState.getName() + ", IsLoggedIn = " + h.e().f());
        if (h.e().f()) {
            i(featureState);
        }
        this.b.F(this.f29864c, aVarD, e());
    }

    public void h(ok.c cVar) {
        f.j().A(cVar);
    }

    public void i(FeatureState featureState) {
        if (!featureState.getName().equals("CHAT_TAG")) {
            if (featureState.getName().equals("AVATAR_EDITOR_TAG")) {
                p.h("rbx.appshell", "sendAppEvents() start avatar");
                h(a("AvatarEditor"));
                return;
            } else if (featureState.getName().equals("HOME_TAG")) {
                p.h("rbx.appshell", "sendAppEvents() start home");
                h(a("Home"));
                return;
            } else {
                if (featureState.getName().equals("GAMES_TAG")) {
                    p.h("rbx.appshell", "sendAppEvents() start games");
                    h(a("Games"));
                    return;
                }
                return;
            }
        }
        p.h("rbx.appshell", "sendAppEvents() start chat");
        h(a("Chat"));
        long jF = featureState.f("USER_ID_EXTRA", -1L);
        long jF2 = featureState.f("CHAT_CONVERSATION_ID", -1L);
        if (jF != -1) {
            p.h("rbx.appshell", "sendAppEvents() userId:" + jF);
            j(c(jF));
            return;
        }
        if (jF2 != -1) {
            p.h("rbx.appshell", "sendAppEvents() conversationId:" + jF2);
            j(b(jF2));
        }
    }

    public void j(ok.b bVar) {
        f.j().C(bVar);
    }
}
