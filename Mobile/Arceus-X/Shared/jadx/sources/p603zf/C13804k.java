package p603zf;

import bg.AbstractC1437d;
import sb.C11264k;

/* JADX INFO: renamed from: zf.k */
/* JADX INFO: loaded from: classes2.dex */
public class C13804k implements InterfaceC13808o {

    /* JADX INFO: renamed from: a */
    public final C13809p f48422a;

    /* JADX INFO: renamed from: b */
    public final C11264k<AbstractC13806m> f48423b;

    public C13804k(C13809p c13809p, C11264k<AbstractC13806m> c11264k) {
        this.f48422a = c13809p;
        this.f48423b = c11264k;
    }

    @Override // p603zf.InterfaceC13808o
    /* JADX INFO: renamed from: a */
    public boolean mo50277a(Exception exc) {
        this.f48423b.m42329d(exc);
        return true;
    }

    @Override // p603zf.InterfaceC13808o
    /* JADX INFO: renamed from: b */
    public boolean mo50278b(AbstractC1437d abstractC1437d) {
        if (!abstractC1437d.m7427k() || this.f48422a.m50290f(abstractC1437d)) {
            return false;
        }
        this.f48423b.m42328c(AbstractC13806m.m50279a().mo50243b(abstractC1437d.mo7394b()).mo50245d(abstractC1437d.mo7395c()).mo50244c(abstractC1437d.mo7400h()).mo50242a());
        return true;
    }
}
