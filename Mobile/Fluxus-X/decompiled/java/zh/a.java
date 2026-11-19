package zh;

import dj.h;
import ei.f;
import f4.q;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39316a = "rbx.appshell";
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39317c;

    public a(e eVar, int i10) {
        this.b = eVar;
        this.f39317c = i10;
    }

    public wk.c a(String str) {
        return new wk.d(str);
    }

    public wk.b b(long j10) {
        return new wk.b("AppShellNotifications", Long.toString(j10), "StartConversationWithId", "Chat");
    }

    public wk.b c(long j10) {
        return new wk.b("AppShellNotifications", Long.toString(j10), "StartConversationWithUserId", "Chat");
    }

    public ei.a d() {
        q qVarR = this.b.r(e());
        if (qVarR instanceof ei.a) {
            return (ei.a) qVarR;
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

    public void g(c cVar) {
        ei.a aVarD = d();
        if (aVarD == null) {
            ok.q.h("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            aVarD = new ei.a();
        }
        ok.q.b("rbx.appshell", "onShow: ... state = " + cVar.getName() + ", IsLoggedIn = " + h.e().f());
        if (h.e().f()) {
            i(cVar);
        }
        this.b.v(this.f39317c, aVarD, e());
    }

    public void h(wk.c cVar) {
        f.j().A(cVar);
    }

    public void i(c cVar) {
        if (!cVar.getName().equals("CHAT_TAG")) {
            if (cVar.getName().equals("AVATAR_EDITOR_TAG")) {
                ok.q.h("rbx.appshell", "sendAppEvents() start avatar");
                h(a("AvatarEditor"));
                return;
            } else if (cVar.getName().equals("HOME_TAG")) {
                ok.q.h("rbx.appshell", "sendAppEvents() start home");
                h(a("Home"));
                return;
            } else {
                if (cVar.getName().equals("GAMES_TAG")) {
                    ok.q.h("rbx.appshell", "sendAppEvents() start games");
                    h(a("Games"));
                    return;
                }
                return;
            }
        }
        ok.q.h("rbx.appshell", "sendAppEvents() start chat");
        h(a("Chat"));
        long jF = cVar.f("USER_ID_EXTRA", -1L);
        long jF2 = cVar.f("CHAT_CONVERSATION_ID", -1L);
        if (jF != -1) {
            ok.q.h("rbx.appshell", "sendAppEvents() userId:" + jF);
            j(c(jF));
            return;
        }
        if (jF2 != -1) {
            ok.q.h("rbx.appshell", "sendAppEvents() conversationId:" + jF2);
            j(b(jF2));
        }
    }

    public void j(wk.b bVar) {
        f.j().C(bVar);
    }
}
