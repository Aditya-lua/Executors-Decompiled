package p162h7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p266l7.C8006e;
import p303n7.C8905k;
import p303n7.C8914t;
import p324o7.AbstractC9709b;
import p431s7.C11194j;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.n */
/* JADX INFO: loaded from: classes3.dex */
public class C6307n implements InterfaceC6306m, AbstractC6643a.b, InterfaceC6304k {

    /* JADX INFO: renamed from: e */
    public final String f23972e;

    /* JADX INFO: renamed from: f */
    public final C5451h0 f23973f;

    /* JADX INFO: renamed from: g */
    public final C8905k.a f23974g;

    /* JADX INFO: renamed from: h */
    public final boolean f23975h;

    /* JADX INFO: renamed from: i */
    public final boolean f23976i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6643a<?, Float> f23977j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6643a<?, PointF> f23978k;

    /* JADX INFO: renamed from: l */
    public final AbstractC6643a<?, Float> f23979l;

    /* JADX INFO: renamed from: m */
    public final AbstractC6643a<?, Float> f23980m;

    /* JADX INFO: renamed from: n */
    public final AbstractC6643a<?, Float> f23981n;

    /* JADX INFO: renamed from: o */
    public final AbstractC6643a<?, Float> f23982o;

    /* JADX INFO: renamed from: p */
    public final AbstractC6643a<?, Float> f23983p;

    /* JADX INFO: renamed from: r */
    public boolean f23985r;

    /* JADX INFO: renamed from: a */
    public final Path f23968a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f23969b = new Path();

    /* JADX INFO: renamed from: c */
    public final PathMeasure f23970c = new PathMeasure();

    /* JADX INFO: renamed from: d */
    public final float[] f23971d = new float[2];

    /* JADX INFO: renamed from: q */
    public final C6295b f23984q = new C6295b();

    /* JADX INFO: renamed from: h7.n$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23986a;

        static {
            int[] iArr = new int[C8905k.a.values().length];
            f23986a = iArr;
            try {
                iArr[C8905k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23986a[C8905k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C6307n(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8905k c8905k) {
        this.f23973f = c5451h0;
        this.f23972e = c8905k.m35886d();
        C8905k.a aVarM35892j = c8905k.m35892j();
        this.f23974g = aVarM35892j;
        this.f23975h = c8905k.m35893k();
        this.f23976i = c8905k.m35894l();
        C6646d c6646dMo34233a = c8905k.m35889g().mo34233a();
        this.f23977j = c6646dMo34233a;
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a = c8905k.m35890h().mo34233a();
        this.f23978k = abstractC6643aMo34233a;
        C6646d c6646dMo34233a2 = c8905k.m35891i().mo34233a();
        this.f23979l = c6646dMo34233a2;
        C6646d c6646dMo34233a3 = c8905k.m35887e().mo34233a();
        this.f23981n = c6646dMo34233a3;
        C6646d c6646dMo34233a4 = c8905k.m35888f().mo34233a();
        this.f23983p = c6646dMo34233a4;
        C8905k.a aVar = C8905k.a.STAR;
        if (aVarM35892j == aVar) {
            this.f23980m = c8905k.m35884b().mo34233a();
            this.f23982o = c8905k.m35885c().mo34233a();
        } else {
            this.f23980m = null;
            this.f23982o = null;
        }
        abstractC9709b.m38353j(c6646dMo34233a);
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        abstractC9709b.m38353j(c6646dMo34233a2);
        abstractC9709b.m38353j(c6646dMo34233a3);
        abstractC9709b.m38353j(c6646dMo34233a4);
        if (aVarM35892j == aVar) {
            abstractC9709b.m38353j(this.f23980m);
            abstractC9709b.m38353j(this.f23982o);
        }
        c6646dMo34233a.m28661a(this);
        abstractC6643aMo34233a.m28661a(this);
        c6646dMo34233a2.m28661a(this);
        c6646dMo34233a3.m28661a(this);
        c6646dMo34233a4.m28661a(this);
        if (aVarM35892j == aVar) {
            this.f23980m.m28661a(this);
            this.f23982o.m28661a(this);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m27605k() {
        this.f23985r = false;
        this.f23973f.invalidateSelf();
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        m27605k();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC6296c interfaceC6296c = list.get(i10);
            if (interfaceC6296c instanceof C6314u) {
                C6314u c6314u = (C6314u) interfaceC6296c;
                if (c6314u.m27620k() == C8914t.a.SIMULTANEOUSLY) {
                    this.f23984q.m27585a(c6314u);
                    c6314u.m27616c(this);
                }
            }
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        AbstractC6643a<?, Float> abstractC6643a;
        AbstractC6643a<?, Float> abstractC6643a2;
        if (t8 == InterfaceC5465o0.f21183w) {
            this.f23977j.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21184x) {
            this.f23979l.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21174n) {
            this.f23978k.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21185y && (abstractC6643a2 = this.f23980m) != null) {
            abstractC6643a2.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21186z) {
            this.f23981n.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21145A && (abstractC6643a = this.f23982o) != null) {
            abstractC6643a.m28675o(c11552c);
        } else if (t8 == InterfaceC5465o0.f21146B) {
            this.f23983p.m28675o(c11552c);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m27606f() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(this.f23977j.mo28668h().floatValue());
        AbstractC6643a<?, Float> abstractC6643a = this.f23979l;
        double radians = Math.toRadians((abstractC6643a == null ? 0.0d : abstractC6643a.mo28668h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f23983p.mo28668h().floatValue() / 100.0f;
        float fFloatValue2 = this.f23981n.mo28668h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f23968a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointFMo28668h = this.f23978k.mo28668h();
                this.f23968a.offset(pointFMo28668h.x, pointFMo28668h.y);
                this.f23968a.close();
                return;
            }
            float fCos2 = (float) (d12 * Math.cos(d14));
            float fSin2 = (float) (Math.sin(d14) * d12);
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                f10 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f13 = fFloatValue2 * f10 * 0.25f;
                float f14 = f13 * fCos3;
                float f15 = f13 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan3)) * f13;
                float fSin4 = f13 * ((float) Math.sin(dAtan3));
                if (d15 == d10 - 1.0d) {
                    this.f23969b.reset();
                    this.f23969b.moveTo(fCos, fSin);
                    float f16 = fCos - f14;
                    float f17 = fSin - f15;
                    float f18 = fCos2 + fCos4;
                    float f19 = fSin2 + fSin4;
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f23969b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f23970c.setPath(this.f23969b, false);
                    PathMeasure pathMeasure = this.f23970c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f23971d, null);
                    Path path = this.f23968a;
                    float[] fArr = this.f23971d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f23968a.cubicTo(fCos - f14, fSin - f15, f11 + fCos4, f12 + fSin4, f11, f12);
                }
                fCos = f11;
                fSin = f12;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d10 = dCeil;
                f10 = fFloatValue;
                if (d15 != d10 - 1.0d) {
                    this.f23968a.lineTo(fCos, fSin);
                }
                i10++;
                dCeil = d10;
                fFloatValue = f10;
            }
            d14 += d13;
            i10++;
            dCeil = d10;
            fFloatValue = f10;
        }
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23972e;
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        if (this.f23985r) {
            return this.f23968a;
        }
        this.f23968a.reset();
        if (this.f23975h) {
            this.f23985r = true;
            return this.f23968a;
        }
        int i10 = a.f23986a[this.f23974g.ordinal()];
        if (i10 == 1) {
            m27607j();
        } else if (i10 == 2) {
            m27606f();
        }
        this.f23968a.close();
        this.f23984q.m27586b(this.f23968a);
        this.f23985r = true;
        return this.f23968a;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }

    /* JADX INFO: renamed from: j */
    public final void m27607j() {
        float f10;
        float f11;
        float fCos;
        float fSin;
        float f12;
        double d10;
        float f13;
        float f14;
        float f15;
        float fFloatValue = this.f23977j.mo28668h().floatValue();
        AbstractC6643a<?, Float> abstractC6643a = this.f23979l;
        double radians = Math.toRadians((abstractC6643a == null ? 0.0d : abstractC6643a.mo28668h().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f16 = (float) (6.283185307179586d / d11);
        if (this.f23976i) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = fFloatValue - ((int) fFloatValue);
        if (f18 != 0.0f) {
            radians += (double) ((1.0f - f18) * f17);
        }
        float fFloatValue2 = this.f23981n.mo28668h().floatValue();
        float fFloatValue3 = this.f23980m.mo28668h().floatValue();
        AbstractC6643a<?, Float> abstractC6643a2 = this.f23982o;
        float fFloatValue4 = abstractC6643a2 != null ? abstractC6643a2.mo28668h().floatValue() / 100.0f : 0.0f;
        AbstractC6643a<?, Float> abstractC6643a3 = this.f23983p;
        float fFloatValue5 = abstractC6643a3 != null ? abstractC6643a3.mo28668h().floatValue() / 100.0f : 0.0f;
        if (f18 != 0.0f) {
            f13 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
            f11 = 0.0f;
            double d12 = f13;
            f10 = 2.0f;
            float fCos2 = (float) (d12 * Math.cos(radians));
            fSin = (float) (d12 * Math.sin(radians));
            this.f23968a.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f16 * f18) / 2.0f));
            fCos = fCos2;
            f12 = f17;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            double d13 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d13);
            fSin = (float) (d13 * Math.sin(radians));
            this.f23968a.moveTo(fCos, fSin);
            f12 = f17;
            d10 = radians + ((double) f12);
            f13 = 0.0f;
        }
        double dCeil = Math.ceil(d11) * 2.0d;
        int i10 = 0;
        boolean z10 = false;
        double d14 = d10;
        float f19 = fSin;
        float f20 = fCos;
        double d15 = d14;
        while (true) {
            double d16 = i10;
            if (d16 >= dCeil) {
                PointF pointFMo28668h = this.f23978k.mo28668h();
                this.f23968a.offset(pointFMo28668h.x, pointFMo28668h.y);
                this.f23968a.close();
                return;
            }
            float f21 = z10 ? fFloatValue2 : fFloatValue3;
            float f22 = (f13 == f11 || d16 != dCeil - 2.0d) ? f12 : (f16 * f18) / f10;
            double d17 = (f13 == f11 || d16 != dCeil - 1.0d) ? f21 : f13;
            float fCos3 = (float) (d17 * Math.cos(d15));
            float f23 = f16;
            float fSin2 = (float) (d17 * Math.sin(d15));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.f23968a.lineTo(fCos3, fSin2);
                f15 = fCos3;
                f14 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f19, f20) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f24 = f20;
                float f25 = f19;
                f14 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f26 = z10 ? fFloatValue4 : fFloatValue5;
                float f27 = z10 ? fFloatValue5 : fFloatValue4;
                float f28 = (z10 ? fFloatValue3 : fFloatValue2) * f26 * 0.47829f;
                float f29 = fCos4 * f28;
                float f30 = f28 * fSin3;
                float f31 = (z10 ? fFloatValue2 : fFloatValue3) * f27 * 0.47829f;
                float f32 = fCos5 * f31;
                float f33 = f31 * fSin4;
                if (f18 != 0.0f) {
                    if (i10 == 0) {
                        f29 *= f18;
                        f30 *= f18;
                    } else if (d16 == dCeil - 1.0d) {
                        f32 *= f18;
                        f33 *= f18;
                    }
                }
                f15 = fCos3;
                this.f23968a.cubicTo(f24 - f29, f25 - f30, fCos3 + f32, f14 + f33, f15, f14);
            }
            d15 += (double) f22;
            z10 = !z10;
            i10++;
            f12 = f12;
            f20 = f15;
            f19 = f14;
            f16 = f23;
        }
    }
}
