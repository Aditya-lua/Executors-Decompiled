package p412rh;

import androidx.fragment.app.ComponentCallbacksC0929c;
import com.roblox.client.feature.FeatureState;
import p151gk.C6124q;
import p335ok.C9756b;
import p335ok.C9757c;
import p335ok.C9758d;
import p517wh.C12433f;
import p517wh.SurfaceHolderCallbackC12423a;
import vi.C12217h;

/* JADX INFO: renamed from: rh.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10880a {

    /* JADX INFO: renamed from: a */
    public final String f38642a = "rbx.appshell";

    /* JADX INFO: renamed from: b */
    public InterfaceC10883d f38643b;

    /* JADX INFO: renamed from: c */
    public int f38644c;

    public C10880a(InterfaceC10883d interfaceC10883d, int i10) {
        this.f38643b = interfaceC10883d;
        this.f38644c = i10;
    }

    /* JADX INFO: renamed from: a */
    public C9757c m41425a(String str) {
        return new C9758d(str);
    }

    /* JADX INFO: renamed from: b */
    public C9756b m41426b(long j10) {
        return new C9756b("AppShellNotifications", Long.toString(j10), "StartConversationWithId", "Chat");
    }

    /* JADX INFO: renamed from: c */
    public C9756b m41427c(long j10) {
        return new C9756b("AppShellNotifications", Long.toString(j10), "StartConversationWithUserId", "Chat");
    }

    /* JADX INFO: renamed from: d */
    public SurfaceHolderCallbackC12423a m41428d() {
        ComponentCallbacksC0929c componentCallbacksC0929cMo14791r = this.f38643b.mo14791r(m41429e());
        if (componentCallbacksC0929cMo14791r instanceof SurfaceHolderCallbackC12423a) {
            return (SurfaceHolderCallbackC12423a) componentCallbacksC0929cMo14791r;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m41429e() {
        return C10880a.class.getName();
    }

    /* JADX INFO: renamed from: f */
    public boolean m41430f() {
        C12433f.m46540j().m46561r();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m41431g(FeatureState featureState) {
        SurfaceHolderCallbackC12423a surfaceHolderCallbackC12423aM41428d = m41428d();
        if (surfaceHolderCallbackC12423aM41428d == null) {
            C6124q.m27063h("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            surfaceHolderCallbackC12423aM41428d = new SurfaceHolderCallbackC12423a();
        }
        C6124q.m27057b("rbx.appshell", "onShow: ... state = " + featureState.getName() + ", IsLoggedIn = " + C12217h.m45288e().m45295f());
        if (C12217h.m45288e().m45295f()) {
            m41433i(featureState);
        }
        this.f38643b.mo14742F(this.f38644c, surfaceHolderCallbackC12423aM41428d, m41429e());
    }

    /* JADX INFO: renamed from: h */
    public void m41432h(C9757c c9757c) {
        C12433f.m46540j().m46541A(c9757c);
    }

    /* JADX INFO: renamed from: i */
    public void m41433i(FeatureState featureState) {
        if (!featureState.getName().equals("CHAT_TAG")) {
            if (featureState.getName().equals("AVATAR_EDITOR_TAG")) {
                C6124q.m27063h("rbx.appshell", "sendAppEvents() start avatar");
                m41432h(m41425a("AvatarEditor"));
                return;
            } else if (featureState.getName().equals("HOME_TAG")) {
                C6124q.m27063h("rbx.appshell", "sendAppEvents() start home");
                m41432h(m41425a("Home"));
                return;
            } else {
                if (featureState.getName().equals("GAMES_TAG")) {
                    C6124q.m27063h("rbx.appshell", "sendAppEvents() start games");
                    m41432h(m41425a("Games"));
                    return;
                }
                return;
            }
        }
        C6124q.m27063h("rbx.appshell", "sendAppEvents() start chat");
        m41432h(m41425a("Chat"));
        long jM15119f = featureState.m15119f("USER_ID_EXTRA", -1L);
        long jM15119f2 = featureState.m15119f("CHAT_CONVERSATION_ID", -1L);
        if (jM15119f != -1) {
            C6124q.m27063h("rbx.appshell", "sendAppEvents() userId:" + jM15119f);
            m41434j(m41427c(jM15119f));
            return;
        }
        if (jM15119f2 != -1) {
            C6124q.m27063h("rbx.appshell", "sendAppEvents() conversationId:" + jM15119f2);
            m41434j(m41426b(jM15119f2));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m41434j(C9756b c9756b) {
        C12433f.m46540j().m46543C(c9756b);
    }
}
