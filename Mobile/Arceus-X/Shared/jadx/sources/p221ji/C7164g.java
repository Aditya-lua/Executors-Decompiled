package p221ji;

import android.text.TextUtils;
import p138fv.C5840c;
import p151gk.C6124q;
import p383qi.C10587f;
import ph.C10252a;
import tk.AbstractC11666a;
import tk.C11667b;

/* JADX INFO: renamed from: ji.g */
/* JADX INFO: loaded from: classes2.dex */
public class C7164g extends C11667b {

    /* JADX INFO: renamed from: ji.g$a */
    public class a implements C11667b.a {
        public a() {
        }

        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            m29965b(abstractC11666a, C5840c.m26204d());
        }

        /* JADX INFO: renamed from: b */
        public void m29965b(AbstractC11666a abstractC11666a, C5840c c5840c) {
            C6124q.m27064i("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + abstractC11666a.m43816f());
            String strOptString = abstractC11666a.m43816f().optString("newRobloxLanguageValue");
            if (TextUtils.isEmpty(strOptString)) {
                abstractC11666a.mo43811a(false, null);
                return;
            }
            C6124q.m27064i("rbx.locale", "newRobloxLocaleValue " + strOptString);
            C10587f c10587fM40605b = C10587f.m40605b(strOptString);
            if (c10587fM40605b != null) {
                c5840c.m26211j(new C10252a(c10587fM40605b));
            }
            abstractC11666a.mo43811a(true, null);
        }
    }

    public C7164g() {
        super("Localization");
        m43823d("languageChangeTrigger", new a());
    }
}
