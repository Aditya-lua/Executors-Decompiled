package p603zf;

import bg.AbstractC1437d;
import sb.C11264k;

/* JADX INFO: renamed from: zf.l */
/* JADX INFO: loaded from: classes2.dex */
public class C13805l implements InterfaceC13808o {

    /* JADX INFO: renamed from: a */
    public final C11264k<String> f48424a;

    public C13805l(C11264k<String> c11264k) {
        this.f48424a = c11264k;
    }

    @Override // p603zf.InterfaceC13808o
    /* JADX INFO: renamed from: a */
    public boolean mo50277a(Exception exc) {
        return false;
    }

    @Override // p603zf.InterfaceC13808o
    /* JADX INFO: renamed from: b */
    public boolean mo50278b(AbstractC1437d abstractC1437d) {
        if (!abstractC1437d.m7428l() && !abstractC1437d.m7427k() && !abstractC1437d.m7425i()) {
            return false;
        }
        this.f48424a.m42330e(abstractC1437d.mo7396d());
        return true;
    }
}
