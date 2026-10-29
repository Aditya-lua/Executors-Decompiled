package p162h7;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p266l7.C8006e;
import p303n7.C8896b;
import p303n7.C8914t;
import p324o7.AbstractC9709b;
import p431s7.C11194j;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.f */
/* JADX INFO: loaded from: classes3.dex */
public class C6299f implements InterfaceC6306m, AbstractC6643a.b, InterfaceC6304k {

    /* JADX INFO: renamed from: b */
    public final String f23911b;

    /* JADX INFO: renamed from: c */
    public final C5451h0 f23912c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6643a<?, PointF> f23913d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6643a<?, PointF> f23914e;

    /* JADX INFO: renamed from: f */
    public final C8896b f23915f;

    /* JADX INFO: renamed from: h */
    public boolean f23917h;

    /* JADX INFO: renamed from: a */
    public final Path f23910a = new Path();

    /* JADX INFO: renamed from: g */
    public final C6295b f23916g = new C6295b();

    public C6299f(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8896b c8896b) {
        this.f23911b = c8896b.m35838b();
        this.f23912c = c5451h0;
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a = c8896b.m35840d().mo34233a();
        this.f23913d = abstractC6643aMo34233a;
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a2 = c8896b.m35839c().mo34233a();
        this.f23914e = abstractC6643aMo34233a2;
        this.f23915f = c8896b;
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        abstractC9709b.m38353j(abstractC6643aMo34233a2);
        abstractC6643aMo34233a.m28661a(this);
        abstractC6643aMo34233a2.m28661a(this);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        m27593f();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC6296c interfaceC6296c = list.get(i10);
            if (interfaceC6296c instanceof C6314u) {
                C6314u c6314u = (C6314u) interfaceC6296c;
                if (c6314u.m27620k() == C8914t.a.SIMULTANEOUSLY) {
                    this.f23916g.m27585a(c6314u);
                    c6314u.m27616c(this);
                }
            }
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (t8 == InterfaceC5465o0.f21171k) {
            this.f23913d.m28675o(c11552c);
        } else if (t8 == InterfaceC5465o0.f21174n) {
            this.f23914e.m28675o(c11552c);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m27593f() {
        this.f23917h = false;
        this.f23912c.invalidateSelf();
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23911b;
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        if (this.f23917h) {
            return this.f23910a;
        }
        this.f23910a.reset();
        if (this.f23915f.m35841e()) {
            this.f23917h = true;
            return this.f23910a;
        }
        PointF pointFMo28668h = this.f23913d.mo28668h();
        float f10 = pointFMo28668h.x / 2.0f;
        float f11 = pointFMo28668h.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f23910a.reset();
        if (this.f23915f.m35842f()) {
            float f14 = -f11;
            this.f23910a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f23910a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f23910a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f23910a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f23910a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f23910a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f23910a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f23910a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f23910a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f23910a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFMo28668h2 = this.f23914e.mo28668h();
        this.f23910a.offset(pointFMo28668h2.x, pointFMo28668h2.y);
        this.f23910a.close();
        this.f23916g.m27586b(this.f23910a);
        this.f23917h = true;
        return this.f23910a;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }
}
