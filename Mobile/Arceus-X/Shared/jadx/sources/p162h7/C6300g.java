package p162h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5444e;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p147g7.C6047a;
import p189i7.AbstractC6643a;
import p189i7.C6644b;
import p189i7.C6646d;
import p189i7.C6659q;
import p266l7.C8006e;
import p303n7.C8910p;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p431s7.C11194j;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.g */
/* JADX INFO: loaded from: classes3.dex */
public class C6300g implements InterfaceC6298e, AbstractC6643a.b, InterfaceC6304k {

    /* JADX INFO: renamed from: a */
    public final Path f23918a;

    /* JADX INFO: renamed from: b */
    public final Paint f23919b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9709b f23920c;

    /* JADX INFO: renamed from: d */
    public final String f23921d;

    /* JADX INFO: renamed from: e */
    public final boolean f23922e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC6306m> f23923f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6643a<Integer, Integer> f23924g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6643a<Integer, Integer> f23925h;

    /* JADX INFO: renamed from: i */
    public AbstractC6643a<ColorFilter, ColorFilter> f23926i;

    /* JADX INFO: renamed from: j */
    public final C5451h0 f23927j;

    /* JADX INFO: renamed from: k */
    public AbstractC6643a<Float, Float> f23928k;

    /* JADX INFO: renamed from: l */
    public float f23929l;

    public C6300g(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8910p c8910p) {
        Path path = new Path();
        this.f23918a = path;
        this.f23919b = new C6047a(1);
        this.f23923f = new ArrayList();
        this.f23920c = abstractC9709b;
        this.f23921d = c8910p.m35917d();
        this.f23922e = c8910p.m35919f();
        this.f23927j = c5451h0;
        if (abstractC9709b.mo38366x() != null) {
            C6646d c6646dMo34233a = abstractC9709b.mo38366x().m35837a().mo34233a();
            this.f23928k = c6646dMo34233a;
            c6646dMo34233a.m28661a(this);
            abstractC9709b.m38353j(this.f23928k);
        }
        if (c8910p.m35915b() == null || c8910p.m35918e() == null) {
            this.f23924g = null;
            this.f23925h = null;
            return;
        }
        path.setFillType(c8910p.m35916c());
        AbstractC6643a<Integer, Integer> abstractC6643aMo34233a = c8910p.m35915b().mo34233a();
        this.f23924g = abstractC6643aMo34233a;
        abstractC6643aMo34233a.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        AbstractC6643a<Integer, Integer> abstractC6643aMo34233a2 = c8910p.m35918e().mo34233a();
        this.f23925h = abstractC6643aMo34233a2;
        abstractC6643aMo34233a2.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a2);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f23927j.invalidateSelf();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC6296c interfaceC6296c = list2.get(i10);
            if (interfaceC6296c instanceof InterfaceC6306m) {
                this.f23923f.add((InterfaceC6306m) interfaceC6296c);
            }
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (t8 == InterfaceC5465o0.f21161a) {
            this.f23924g.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21164d) {
            this.f23925h.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21155K) {
            AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f23926i;
            if (abstractC6643a != null) {
                this.f23920c.m38345H(abstractC6643a);
            }
            if (c11552c == null) {
                this.f23926i = null;
                return;
            }
            C6659q c6659q = new C6659q(c11552c);
            this.f23926i = c6659q;
            c6659q.m28661a(this);
            this.f23920c.m38353j(this.f23926i);
            return;
        }
        if (t8 == InterfaceC5465o0.f21170j) {
            AbstractC6643a<Float, Float> abstractC6643a2 = this.f23928k;
            if (abstractC6643a2 != null) {
                abstractC6643a2.m28675o(c11552c);
                return;
            }
            C6659q c6659q2 = new C6659q(c11552c);
            this.f23928k = c6659q2;
            c6659q2.m28661a(this);
            this.f23920c.m38353j(this.f23928k);
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        this.f23918a.reset();
        for (int i10 = 0; i10 < this.f23923f.size(); i10++) {
            this.f23918a.addPath(this.f23923f.get(i10).getPath(), matrix);
        }
        this.f23918a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23921d;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        if (this.f23922e) {
            return;
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("FillContent#draw");
        }
        int iM28683r = ((C6644b) this.f23924g).m28683r();
        float fIntValue = this.f23925h.mo28668h().intValue() / 100.0f;
        this.f23919b.setColor((C11194j.m42185c((int) (i10 * fIntValue), 0, 255) << 24) | (iM28683r & ViewCompat.MEASURED_SIZE_MASK));
        AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f23926i;
        if (abstractC6643a != null) {
            this.f23919b.setColorFilter(abstractC6643a.mo28668h());
        }
        AbstractC6643a<Float, Float> abstractC6643a2 = this.f23928k;
        if (abstractC6643a2 != null) {
            float fFloatValue = abstractC6643a2.mo28668h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f23919b.setMaskFilter(null);
            } else if (fFloatValue != this.f23929l) {
                this.f23919b.setMaskFilter(this.f23920c.m38367y(fFloatValue));
            }
            this.f23929l = fFloatValue;
        }
        if (c11186b != null) {
            c11186b.m42138c((int) (fIntValue * 255.0f), this.f23919b);
        } else {
            this.f23919b.clearShadowLayer();
        }
        this.f23918a.reset();
        for (int i11 = 0; i11 < this.f23923f.size(); i11++) {
            this.f23918a.addPath(this.f23923f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f23918a, this.f23919b);
        if (C5444e.m24929h()) {
            C5444e.m24924c("FillContent#draw");
        }
    }
}
