package p162h7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p266l7.C8006e;
import p303n7.C8906l;
import p303n7.C8914t;
import p324o7.AbstractC9709b;
import p431s7.C11194j;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.o */
/* JADX INFO: loaded from: classes3.dex */
public class C6308o implements AbstractC6643a.b, InterfaceC6304k, InterfaceC6306m {

    /* JADX INFO: renamed from: c */
    public final String f23989c;

    /* JADX INFO: renamed from: d */
    public final boolean f23990d;

    /* JADX INFO: renamed from: e */
    public final C5451h0 f23991e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6643a<?, PointF> f23992f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6643a<?, PointF> f23993g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6643a<?, Float> f23994h;

    /* JADX INFO: renamed from: k */
    public boolean f23997k;

    /* JADX INFO: renamed from: a */
    public final Path f23987a = new Path();

    /* JADX INFO: renamed from: b */
    public final RectF f23988b = new RectF();

    /* JADX INFO: renamed from: i */
    public final C6295b f23995i = new C6295b();

    /* JADX INFO: renamed from: j */
    public AbstractC6643a<Float, Float> f23996j = null;

    public C6308o(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8906l c8906l) {
        this.f23989c = c8906l.m35898c();
        this.f23990d = c8906l.m35901f();
        this.f23991e = c5451h0;
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a = c8906l.m35899d().mo34233a();
        this.f23992f = abstractC6643aMo34233a;
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a2 = c8906l.m35900e().mo34233a();
        this.f23993g = abstractC6643aMo34233a2;
        C6646d c6646dMo34233a = c8906l.m35897b().mo34233a();
        this.f23994h = c6646dMo34233a;
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        abstractC9709b.m38353j(abstractC6643aMo34233a2);
        abstractC9709b.m38353j(c6646dMo34233a);
        abstractC6643aMo34233a.m28661a(this);
        abstractC6643aMo34233a2.m28661a(this);
        c6646dMo34233a.m28661a(this);
    }

    /* JADX INFO: renamed from: f */
    private void m27608f() {
        this.f23997k = false;
        this.f23991e.invalidateSelf();
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        m27608f();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC6296c interfaceC6296c = list.get(i10);
            if (interfaceC6296c instanceof C6314u) {
                C6314u c6314u = (C6314u) interfaceC6296c;
                if (c6314u.m27620k() == C8914t.a.SIMULTANEOUSLY) {
                    this.f23995i.m27585a(c6314u);
                    c6314u.m27616c(this);
                } else if (interfaceC6296c instanceof C6310q) {
                    this.f23996j = ((C6310q) interfaceC6296c).m27613h();
                }
            } else if (interfaceC6296c instanceof C6310q) {
                this.f23996j = ((C6310q) interfaceC6296c).m27613h();
            }
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (t8 == InterfaceC5465o0.f21172l) {
            this.f23993g.m28675o(c11552c);
        } else if (t8 == InterfaceC5465o0.f21174n) {
            this.f23992f.m28675o(c11552c);
        } else if (t8 == InterfaceC5465o0.f21173m) {
            this.f23994h.m28675o(c11552c);
        }
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23989c;
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        AbstractC6643a<Float, Float> abstractC6643a;
        if (this.f23997k) {
            return this.f23987a;
        }
        this.f23987a.reset();
        if (this.f23990d) {
            this.f23997k = true;
            return this.f23987a;
        }
        PointF pointFMo28668h = this.f23993g.mo28668h();
        float f10 = pointFMo28668h.x / 2.0f;
        float f11 = pointFMo28668h.y / 2.0f;
        AbstractC6643a<?, Float> abstractC6643a2 = this.f23994h;
        float fM28693r = abstractC6643a2 == null ? 0.0f : ((C6646d) abstractC6643a2).m28693r();
        if (fM28693r == 0.0f && (abstractC6643a = this.f23996j) != null) {
            fM28693r = Math.min(abstractC6643a.mo28668h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fM28693r > fMin) {
            fM28693r = fMin;
        }
        PointF pointFMo28668h2 = this.f23992f.mo28668h();
        this.f23987a.moveTo(pointFMo28668h2.x + f10, (pointFMo28668h2.y - f11) + fM28693r);
        this.f23987a.lineTo(pointFMo28668h2.x + f10, (pointFMo28668h2.y + f11) - fM28693r);
        if (fM28693r > 0.0f) {
            RectF rectF = this.f23988b;
            float f12 = pointFMo28668h2.x;
            float f13 = fM28693r * 2.0f;
            float f14 = pointFMo28668h2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f23987a.arcTo(this.f23988b, 0.0f, 90.0f, false);
        }
        this.f23987a.lineTo((pointFMo28668h2.x - f10) + fM28693r, pointFMo28668h2.y + f11);
        if (fM28693r > 0.0f) {
            RectF rectF2 = this.f23988b;
            float f15 = pointFMo28668h2.x;
            float f16 = pointFMo28668h2.y;
            float f17 = fM28693r * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f23987a.arcTo(this.f23988b, 90.0f, 90.0f, false);
        }
        this.f23987a.lineTo(pointFMo28668h2.x - f10, (pointFMo28668h2.y - f11) + fM28693r);
        if (fM28693r > 0.0f) {
            RectF rectF3 = this.f23988b;
            float f18 = pointFMo28668h2.x;
            float f19 = pointFMo28668h2.y;
            float f20 = fM28693r * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f23987a.arcTo(this.f23988b, 180.0f, 90.0f, false);
        }
        this.f23987a.lineTo((pointFMo28668h2.x + f10) - fM28693r, pointFMo28668h2.y - f11);
        if (fM28693r > 0.0f) {
            RectF rectF4 = this.f23988b;
            float f21 = pointFMo28668h2.x;
            float f22 = fM28693r * 2.0f;
            float f23 = pointFMo28668h2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f23987a.arcTo(this.f23988b, 270.0f, 90.0f, false);
        }
        this.f23987a.close();
        this.f23995i.m27586b(this.f23987a);
        this.f23997k = true;
        return this.f23987a;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }
}
