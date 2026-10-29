package p162h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6644b;
import p189i7.C6659q;
import p303n7.C8913s;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.t */
/* JADX INFO: loaded from: classes3.dex */
public class C6313t extends AbstractC6294a {

    /* JADX INFO: renamed from: q */
    public final AbstractC9709b f24019q;

    /* JADX INFO: renamed from: r */
    public final String f24020r;

    /* JADX INFO: renamed from: s */
    public final boolean f24021s;

    /* JADX INFO: renamed from: t */
    public final AbstractC6643a<Integer, Integer> f24022t;

    /* JADX INFO: renamed from: u */
    public AbstractC6643a<ColorFilter, ColorFilter> f24023u;

    public C6313t(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8913s c8913s) {
        super(c5451h0, abstractC9709b, c8913s.m35926b().m35937b(), c8913s.m35929e().m35939b(), c8913s.m35931g(), c8913s.m35933i(), c8913s.m35934j(), c8913s.m35930f(), c8913s.m35928d());
        this.f24019q = abstractC9709b;
        this.f24020r = c8913s.m35932h();
        this.f24021s = c8913s.m35935k();
        AbstractC6643a<Integer, Integer> abstractC6643aMo34233a = c8913s.m35927c().mo34233a();
        this.f24022t = abstractC6643aMo34233a;
        abstractC6643aMo34233a.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a);
    }

    @Override // p162h7.AbstractC6294a, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21162b) {
            this.f24022t.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21155K) {
            AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f24023u;
            if (abstractC6643a != null) {
                this.f24019q.m38345H(abstractC6643a);
            }
            if (c11552c == null) {
                this.f24023u = null;
                return;
            }
            C6659q c6659q = new C6659q(c11552c);
            this.f24023u = c6659q;
            c6659q.m28661a(this);
            this.f24019q.m38353j(this.f24022t);
        }
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f24020r;
    }

    @Override // p162h7.AbstractC6294a, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        if (this.f24021s) {
            return;
        }
        this.f23887i.setColor(((C6644b) this.f24022t).m28683r());
        AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f24023u;
        if (abstractC6643a != null) {
            this.f23887i.setColorFilter(abstractC6643a.mo28668h());
        }
        super.mo27581i(canvas, matrix, i10, c11186b);
    }
}
