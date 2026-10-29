package p221ji;

import p138fv.C5840c;
import p151gk.C6124q;
import ph.C10255d;
import tk.AbstractC11666a;
import tk.C11667b;

/* JADX INFO: renamed from: ji.j */
/* JADX INFO: loaded from: classes2.dex */
public class C7167j extends C11667b {

    /* JADX INFO: renamed from: ji.j$a */
    public class a implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            C6124q.m27064i("RBHybridModuleOverlay", "RBHybridModuleOverlay CloseOverlay.execute() " + abstractC11666a.m43816f());
            C5840c.m26204d().m26211j(new C10255d());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: ji.j$b */
    public class b implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            C6124q.m27064i("RBHybridModuleOverlay", "RBHybridModuleOverlay SetSubmitState.execute() " + abstractC11666a.m43816f());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    public C7167j() {
        super("Overlay");
        m43823d("close", new a());
        m43823d("setSubmitState", new b());
    }
}
