package p324o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p121f7.C5444e;
import p121f7.C5451h0;
import p121f7.C5452i;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6645c;
import p189i7.C6646d;
import p189i7.C6659q;
import p266l7.C8006e;
import p288m7.C8454b;
import p431s7.C11186b;
import p431s7.C11196l;
import p444t7.C11552c;
import p504w1.C12283g;

/* JADX INFO: renamed from: o7.c */
/* JADX INFO: loaded from: classes3.dex */
public class C9710c extends AbstractC9709b {

    /* JADX INFO: renamed from: E */
    public AbstractC6643a<Float, Float> f35277E;

    /* JADX INFO: renamed from: F */
    public final List<AbstractC9709b> f35278F;

    /* JADX INFO: renamed from: G */
    public final RectF f35279G;

    /* JADX INFO: renamed from: H */
    public final RectF f35280H;

    /* JADX INFO: renamed from: I */
    public final RectF f35281I;

    /* JADX INFO: renamed from: J */
    public final C11196l f35282J;

    /* JADX INFO: renamed from: K */
    public final C11196l.a f35283K;

    /* JADX INFO: renamed from: L */
    public float f35284L;

    /* JADX INFO: renamed from: M */
    public boolean f35285M;

    /* JADX INFO: renamed from: N */
    public C6645c f35286N;

    /* JADX INFO: renamed from: o7.c$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35287a;

        static {
            int[] iArr = new int[C9712e.b.values().length];
            f35287a = iArr;
            try {
                iArr[C9712e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35287a[C9712e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9710c(C5451h0 c5451h0, C9712e c9712e, List<C9712e> list, C5452i c5452i) {
        int i10;
        AbstractC9709b abstractC9709b;
        super(c5451h0, c9712e);
        this.f35278F = new ArrayList();
        this.f35279G = new RectF();
        this.f35280H = new RectF();
        this.f35281I = new RectF();
        this.f35282J = new C11196l();
        this.f35283K = new C11196l.a();
        this.f35285M = true;
        C8454b c8454bM38393v = c9712e.m38393v();
        if (c8454bM38393v != null) {
            C6646d c6646dMo34233a = c8454bM38393v.mo34233a();
            this.f35277E = c6646dMo34233a;
            m38353j(c6646dMo34233a);
            this.f35277E.m28661a(this);
        } else {
            this.f35277E = null;
        }
        C12283g c12283g = new C12283g(c5452i.m25045k().size());
        int size = list.size() - 1;
        AbstractC9709b abstractC9709b2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C9712e c9712e2 = list.get(size);
            AbstractC9709b abstractC9709bM38337v = AbstractC9709b.m38337v(this, c9712e2, c5451h0, c5452i);
            if (abstractC9709bM38337v != null) {
                c12283g.m45604i(abstractC9709bM38337v.m38338A().m38376e(), abstractC9709bM38337v);
                if (abstractC9709b2 != null) {
                    abstractC9709b2.m38347J(abstractC9709bM38337v);
                    abstractC9709b2 = null;
                } else {
                    this.f35278F.add(0, abstractC9709bM38337v);
                    int i11 = a.f35287a[c9712e2.m38380i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        abstractC9709b2 = abstractC9709bM38337v;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < c12283g.m45607n(); i10++) {
            AbstractC9709b abstractC9709b3 = (AbstractC9709b) c12283g.m45601e(c12283g.m45603h(i10));
            if (abstractC9709b3 != null && (abstractC9709b = (AbstractC9709b) c12283g.m45601e(abstractC9709b3.m38338A().m38382k())) != null) {
                abstractC9709b3.m38349L(abstractC9709b);
            }
        }
        if (m38368z() != null) {
            this.f35286N = new C6645c(this, this, m38368z());
        }
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: I */
    public void mo38346I(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        for (int i11 = 0; i11 < this.f35278F.size(); i11++) {
            this.f35278F.get(i11).mo27580h(c8006e, i10, list, c8006e2);
        }
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: K */
    public void mo38348K(boolean z10) {
        super.mo38348K(z10);
        Iterator<AbstractC9709b> it = this.f35278F.iterator();
        while (it.hasNext()) {
            it.next().mo38348K(z10);
        }
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: M */
    public void mo38350M(float f10) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("CompositionLayer#setProgress");
        }
        this.f35284L = f10;
        super.mo38350M(f10);
        if (this.f35277E != null) {
            f10 = ((this.f35277E.mo28668h().floatValue() * this.f35265q.m38374c().m25043i()) - this.f35265q.m38374c().m25050p()) / (this.f35264p.m24966J().m25039e() + 0.01f);
        }
        if (this.f35277E == null) {
            f10 -= this.f35265q.m38390s();
        }
        if (this.f35265q.m38394w() != 0.0f && !"__container".equals(this.f35265q.m38381j())) {
            f10 /= this.f35265q.m38394w();
        }
        for (int size = this.f35278F.size() - 1; size >= 0; size--) {
            this.f35278F.get(size).mo38350M(f10);
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("CompositionLayer#setProgress");
        }
    }

    /* JADX INFO: renamed from: P */
    public float m38369P() {
        return this.f35284L;
    }

    /* JADX INFO: renamed from: Q */
    public void m38370Q(boolean z10) {
        this.f35285M = z10;
    }

    @Override // p324o7.AbstractC9709b, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        C6645c c6645c;
        C6645c c6645c2;
        C6645c c6645c3;
        C6645c c6645c4;
        C6645c c6645c5;
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21149E) {
            if (c11552c == null) {
                AbstractC6643a<Float, Float> abstractC6643a = this.f35277E;
                if (abstractC6643a != null) {
                    abstractC6643a.m28675o(null);
                    return;
                }
                return;
            }
            C6659q c6659q = new C6659q(c11552c);
            this.f35277E = c6659q;
            c6659q.m28661a(this);
            m38353j(this.f35277E);
            return;
        }
        if (t8 == InterfaceC5465o0.f21165e && (c6645c5 = this.f35286N) != null) {
            c6645c5.m28687c(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21151G && (c6645c4 = this.f35286N) != null) {
            c6645c4.m28690f(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21152H && (c6645c3 = this.f35286N) != null) {
            c6645c3.m28688d(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21153I && (c6645c2 = this.f35286N) != null) {
            c6645c2.m28689e(c11552c);
        } else {
            if (t8 != InterfaceC5465o0.f21154J || (c6645c = this.f35286N) == null) {
                return;
            }
            c6645c.m28691g(c11552c);
        }
    }

    @Override // p324o7.AbstractC9709b, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        super.mo27578e(rectF, matrix, z10);
        for (int size = this.f35278F.size() - 1; size >= 0; size--) {
            this.f35279G.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f35278F.get(size).mo27578e(this.f35279G, this.f35263o, true);
            rectF.union(this.f35279G);
        }
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: u */
    public void mo38364u(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        Canvas canvasM42204j;
        if (C5444e.m24929h()) {
            C5444e.m24923b("CompositionLayer#draw");
        }
        boolean z10 = false;
        boolean z11 = (c11186b == null && this.f35286N == null) ? false : true;
        if ((this.f35264p.m25003f0() && this.f35278F.size() > 1 && i10 != 255) || (z11 && this.f35264p.m25004g0())) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        C6645c c6645c = this.f35286N;
        if (c6645c != null) {
            c11186b = c6645c.m28686b(matrix, i11);
        }
        if (this.f35285M || !"__container".equals(this.f35265q.m38381j())) {
            this.f35280H.set(0.0f, 0.0f, this.f35265q.m38384m(), this.f35265q.m38383l());
            matrix.mapRect(this.f35280H);
        } else {
            this.f35280H.setEmpty();
            Iterator<AbstractC9709b> it = this.f35278F.iterator();
            while (it.hasNext()) {
                it.next().mo27578e(this.f35281I, matrix, true);
                this.f35280H.union(this.f35281I);
            }
        }
        if (z10) {
            this.f35283K.m42210f();
            C11196l.a aVar = this.f35283K;
            aVar.f39515a = i10;
            if (c11186b != null) {
                c11186b.m42137b(aVar);
                c11186b = null;
            }
            canvasM42204j = this.f35282J.m42204j(canvas, this.f35280H, this.f35283K);
        } else {
            canvasM42204j = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.f35280H)) {
            for (int size = this.f35278F.size() - 1; size >= 0; size--) {
                this.f35278F.get(size).mo27581i(canvasM42204j, matrix, i11, c11186b);
            }
        }
        if (z10) {
            this.f35282J.m42199e();
        }
        canvas.restore();
        if (C5444e.m24929h()) {
            C5444e.m24924c("CompositionLayer#draw");
        }
    }
}
