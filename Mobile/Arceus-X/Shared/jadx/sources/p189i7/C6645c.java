package p189i7;

import android.graphics.Color;
import android.graphics.Matrix;
import p324o7.AbstractC9709b;
import p373q7.C10458j;
import p431s7.C11186b;
import p444t7.C11551b;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.c */
/* JADX INFO: loaded from: classes3.dex */
public class C6645c implements AbstractC6643a.b {

    /* JADX INFO: renamed from: a */
    public final AbstractC9709b f25637a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6643a.b f25638b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6643a<Integer, Integer> f25639c;

    /* JADX INFO: renamed from: d */
    public final C6646d f25640d;

    /* JADX INFO: renamed from: e */
    public final C6646d f25641e;

    /* JADX INFO: renamed from: f */
    public final C6646d f25642f;

    /* JADX INFO: renamed from: g */
    public final C6646d f25643g;

    /* JADX INFO: renamed from: h */
    public Matrix f25644h;

    /* JADX INFO: renamed from: i7.c$a */
    public class a extends C11552c<Float> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C11552c f25645d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C6645c f25646e;

        public a(C6645c c6645c, C11552c c11552c) {
            this.f25645d = c11552c;
            this.f25646e = c6645c;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lt7/b;)Ljava/lang/Object; */
        @Override // p444t7.C11552c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float mo8441a(C11551b<Float> c11551b) {
            Float f10 = (Float) this.f25645d.mo8441a(c11551b);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public C6645c(AbstractC6643a.b bVar, AbstractC9709b abstractC9709b, C10458j c10458j) {
        this.f25638b = bVar;
        this.f25637a = abstractC9709b;
        AbstractC6643a<Integer, Integer> abstractC6643aMo34233a = c10458j.m40229a().mo34233a();
        this.f25639c = abstractC6643aMo34233a;
        abstractC6643aMo34233a.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        C6646d c6646dMo34233a = c10458j.m40232d().mo34233a();
        this.f25640d = c6646dMo34233a;
        c6646dMo34233a.m28661a(this);
        abstractC9709b.m38353j(c6646dMo34233a);
        C6646d c6646dMo34233a2 = c10458j.m40230b().mo34233a();
        this.f25641e = c6646dMo34233a2;
        c6646dMo34233a2.m28661a(this);
        abstractC9709b.m38353j(c6646dMo34233a2);
        C6646d c6646dMo34233a3 = c10458j.m40231c().mo34233a();
        this.f25642f = c6646dMo34233a3;
        c6646dMo34233a3.m28661a(this);
        abstractC9709b.m38353j(c6646dMo34233a3);
        C6646d c6646dMo34233a4 = c10458j.m40233e().mo34233a();
        this.f25643g = c6646dMo34233a4;
        c6646dMo34233a4.m28661a(this);
        abstractC9709b.m38353j(c6646dMo34233a4);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f25638b.mo27575a();
    }

    /* JADX INFO: renamed from: b */
    public C11186b m28686b(Matrix matrix, int i10) {
        float fM28693r = this.f25641e.m28693r() * 0.017453292f;
        float fFloatValue = this.f25642f.mo28668h().floatValue();
        double d10 = fM28693r;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f25643g.mo28668h().floatValue();
        int iIntValue = this.f25639c.mo28668h().intValue();
        C11186b c11186b = new C11186b(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f25640d.mo28668h().floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        c11186b.m42146k(matrix);
        if (this.f25644h == null) {
            this.f25644h = new Matrix();
        }
        this.f25637a.f35272x.m28722f().invert(this.f25644h);
        c11186b.m42146k(this.f25644h);
        return c11186b;
    }

    /* JADX INFO: renamed from: c */
    public void m28687c(C11552c<Integer> c11552c) {
        this.f25639c.m28675o(c11552c);
    }

    /* JADX INFO: renamed from: d */
    public void m28688d(C11552c<Float> c11552c) {
        this.f25641e.m28675o(c11552c);
    }

    /* JADX INFO: renamed from: e */
    public void m28689e(C11552c<Float> c11552c) {
        this.f25642f.m28675o(c11552c);
    }

    /* JADX INFO: renamed from: f */
    public void m28690f(C11552c<Float> c11552c) {
        if (c11552c == null) {
            this.f25640d.m28675o(null);
        } else {
            this.f25640d.m28675o(new a(this, c11552c));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m28691g(C11552c<Float> c11552c) {
        this.f25643g.m28675o(c11552c);
    }
}
