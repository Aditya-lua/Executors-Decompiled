package ph;

import com.roblox.client.feature.FeatureState;
import ek.q;
import ti.h;
import uh.f;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28723a = "rbx.appshell";
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28724c;

    public a(d dVar, int i10) {
        this.b = dVar;
        this.f28724c = i10;
    }

    public mk.c a(String str) {
        return new mk.d(str);
    }

    public mk.b b(long j10) {
        return new mk.b("AppShellNotifications", Long.toString(j10), "StartConversationWithId", "Chat");
    }

    public mk.b c(long j10) {
        return new mk.b("AppShellNotifications", Long.toString(j10), "StartConversationWithUserId", "Chat");
    }

    public uh.a d() {
        androidx.fragment.app.c cVarR = this.b.r(e());
        if (cVarR instanceof uh.a) {
            return (uh.a) cVarR;
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
        uh.a aVarD = d();
        if (aVarD == null) {
            q.h("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            aVarD = new uh.a();
        }
        q.b("rbx.appshell", "onShow: ... state = " + featureState.getName() + ", IsLoggedIn = " + h.e().f());
        if (h.e().f()) {
            i(featureState);
        }
        this.b.E(this.f28724c, aVarD, e());
    }

    public void h(mk.c cVar) {
        f.j().A(cVar);
    }

    public void i(FeatureState featureState) {
        if (!featureState.getName().equals("CHAT_TAG")) {
            if (featureState.getName().equals("AVATAR_EDITOR_TAG")) {
                q.h("rbx.appshell", "sendAppEvents() start avatar");
                h(a("AvatarEditor"));
                return;
            } else if (featureState.getName().equals("HOME_TAG")) {
                q.h("rbx.appshell", "sendAppEvents() start home");
                h(a("Home"));
                return;
            } else {
                if (featureState.getName().equals("GAMES_TAG")) {
                    q.h("rbx.appshell", "sendAppEvents() start games");
                    h(a("Games"));
                    return;
                }
                return;
            }
        }
        q.h("rbx.appshell", "sendAppEvents() start chat");
        h(a("Chat"));
        long jF = featureState.f("USER_ID_EXTRA", -1L);
        long jF2 = featureState.f("CHAT_CONVERSATION_ID", -1L);
        if (jF != -1) {
            q.h("rbx.appshell", "sendAppEvents() userId:" + jF);
            j(c(jF));
            return;
        }
        if (jF2 != -1) {
            q.h("rbx.appshell", "sendAppEvents() conversationId:" + jF2);
            j(b(jF2));
        }
    }

    public void j(mk.b bVar) {
        f.j().C(bVar);
    }
}
