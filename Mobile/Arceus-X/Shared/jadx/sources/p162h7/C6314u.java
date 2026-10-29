package p162h7;

import java.util.ArrayList;
import java.util.List;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p303n7.C8914t;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: h7.u */
/* JADX INFO: loaded from: classes3.dex */
public class C6314u implements InterfaceC6296c, AbstractC6643a.b {

    /* JADX INFO: renamed from: a */
    public final String f24024a;

    /* JADX INFO: renamed from: b */
    public final boolean f24025b;

    /* JADX INFO: renamed from: c */
    public final List<AbstractC6643a.b> f24026c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final C8914t.a f24027d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6643a<?, Float> f24028e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6643a<?, Float> f24029f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6643a<?, Float> f24030g;

    public C6314u(AbstractC9709b abstractC9709b, C8914t c8914t) {
        this.f24024a = c8914t.m35941c();
        this.f24025b = c8914t.m35945g();
        this.f24027d = c8914t.m35944f();
        C6646d c6646dMo34233a = c8914t.m35943e().mo34233a();
        this.f24028e = c6646dMo34233a;
        C6646d c6646dMo34233a2 = c8914t.m35940b().mo34233a();
        this.f24029f = c6646dMo34233a2;
        C6646d c6646dMo34233a3 = c8914t.m35942d().mo34233a();
        this.f24030g = c6646dMo34233a3;
        abstractC9709b.m38353j(c6646dMo34233a);
        abstractC9709b.m38353j(c6646dMo34233a2);
        abstractC9709b.m38353j(c6646dMo34233a3);
        c6646dMo34233a.m28661a(this);
        c6646dMo34233a2.m28661a(this);
        c6646dMo34233a3.m28661a(this);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        for (int i10 = 0; i10 < this.f24026c.size(); i10++) {
            this.f24026c.get(i10).mo27575a();
        }
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
    }

    /* JADX INFO: renamed from: c */
    public void m27616c(AbstractC6643a.b bVar) {
        this.f24026c.add(bVar);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC6643a<?, Float> m27617f() {
        return this.f24029f;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC6643a<?, Float> m27618h() {
        return this.f24030g;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC6643a<?, Float> m27619j() {
        return this.f24028e;
    }

    /* JADX INFO: renamed from: k */
    public C8914t.a m27620k() {
        return this.f24027d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m27621l() {
        return this.f24025b;
    }
}
