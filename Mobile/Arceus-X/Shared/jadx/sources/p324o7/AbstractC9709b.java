package p324o7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.graphics.C0547d;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p121f7.C5444e;
import p121f7.C5451h0;
import p121f7.C5452i;
import p147g7.C6047a;
import p162h7.InterfaceC6296c;
import p162h7.InterfaceC6298e;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p189i7.C6650h;
import p189i7.C6658p;
import p266l7.C8006e;
import p266l7.InterfaceC8007f;
import p303n7.C8895a;
import p303n7.C8903i;
import p303n7.C8909o;
import p303n7.EnumC8902h;
import p373q7.C10458j;
import p431s7.C11186b;
import p431s7.C11189e;
import p431s7.C11197m;
import p444t7.C11552c;

/* JADX INFO: renamed from: o7.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9709b implements InterfaceC6298e, AbstractC6643a.b, InterfaceC8007f {

    /* JADX INFO: renamed from: A */
    public Paint f35245A;

    /* JADX INFO: renamed from: B */
    public float f35246B;

    /* JADX INFO: renamed from: C */
    public BlurMaskFilter f35247C;

    /* JADX INFO: renamed from: D */
    public C6047a f35248D;

    /* JADX INFO: renamed from: a */
    public final Path f35249a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f35250b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f35251c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final Paint f35252d = new C6047a(1);

    /* JADX INFO: renamed from: e */
    public final Paint f35253e;

    /* JADX INFO: renamed from: f */
    public final Paint f35254f;

    /* JADX INFO: renamed from: g */
    public final Paint f35255g;

    /* JADX INFO: renamed from: h */
    public final Paint f35256h;

    /* JADX INFO: renamed from: i */
    public final RectF f35257i;

    /* JADX INFO: renamed from: j */
    public final RectF f35258j;

    /* JADX INFO: renamed from: k */
    public final RectF f35259k;

    /* JADX INFO: renamed from: l */
    public final RectF f35260l;

    /* JADX INFO: renamed from: m */
    public final RectF f35261m;

    /* JADX INFO: renamed from: n */
    public final String f35262n;

    /* JADX INFO: renamed from: o */
    public final Matrix f35263o;

    /* JADX INFO: renamed from: p */
    public final C5451h0 f35264p;

    /* JADX INFO: renamed from: q */
    public final C9712e f35265q;

    /* JADX INFO: renamed from: r */
    public C6650h f35266r;

    /* JADX INFO: renamed from: s */
    public C6646d f35267s;

    /* JADX INFO: renamed from: t */
    public AbstractC9709b f35268t;

    /* JADX INFO: renamed from: u */
    public AbstractC9709b f35269u;

    /* JADX INFO: renamed from: v */
    public List<AbstractC9709b> f35270v;

    /* JADX INFO: renamed from: w */
    public final List<AbstractC6643a<?, ?>> f35271w;

    /* JADX INFO: renamed from: x */
    public final C6658p f35272x;

    /* JADX INFO: renamed from: y */
    public boolean f35273y;

    /* JADX INFO: renamed from: z */
    public boolean f35274z;

    /* JADX INFO: renamed from: o7.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35275a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f35276b;

        static {
            int[] iArr = new int[C8903i.a.values().length];
            f35276b = iArr;
            try {
                iArr[C8903i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35276b[C8903i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35276b[C8903i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35276b[C8903i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C9712e.a.values().length];
            f35275a = iArr2;
            try {
                iArr2[C9712e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35275a[C9712e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35275a[C9712e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35275a[C9712e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35275a[C9712e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35275a[C9712e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35275a[C9712e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public AbstractC9709b(C5451h0 c5451h0, C9712e c9712e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f35253e = new C6047a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f35254f = new C6047a(1, mode2);
        C6047a c6047a = new C6047a(1);
        this.f35255g = c6047a;
        this.f35256h = new C6047a(PorterDuff.Mode.CLEAR);
        this.f35257i = new RectF();
        this.f35258j = new RectF();
        this.f35259k = new RectF();
        this.f35260l = new RectF();
        this.f35261m = new RectF();
        this.f35263o = new Matrix();
        this.f35271w = new ArrayList();
        this.f35273y = true;
        this.f35246B = 0.0f;
        this.f35264p = c5451h0;
        this.f35265q = c9712e;
        this.f35262n = c9712e.m38381j() + "#draw";
        if (c9712e.m38380i() == C9712e.b.INVERT) {
            c6047a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c6047a.setXfermode(new PorterDuffXfermode(mode));
        }
        C6658p c6658pM34243b = c9712e.m38395x().m34243b();
        this.f35272x = c6658pM34243b;
        c6658pM34243b.m28718b(this);
        if (c9712e.m38379h() != null && !c9712e.m38379h().isEmpty()) {
            C6650h c6650h = new C6650h(c9712e.m38379h());
            this.f35266r = c6650h;
            Iterator<AbstractC6643a<C8909o, Path>> it = c6650h.m28699a().iterator();
            while (it.hasNext()) {
                it.next().m28661a(this);
            }
            for (AbstractC6643a<Integer, Integer> abstractC6643a : this.f35266r.m28701c()) {
                m38353j(abstractC6643a);
                abstractC6643a.m28661a(this);
            }
        }
        m38352O();
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC9709b m38337v(C9710c c9710c, C9712e c9712e, C5451h0 c5451h0, C5452i c5452i) {
        switch (a.f35275a[c9712e.m38378g().ordinal()]) {
            case 1:
                return new C9714g(c5451h0, c9712e, c9710c, c5452i);
            case 2:
                return new C9710c(c5451h0, c9712e, c5452i.m25049o(c9712e.m38385n()), c5452i);
            case 3:
                return new C9715h(c5451h0, c9712e);
            case 4:
                return new C9711d(c5451h0, c9712e);
            case 5:
                return new C9713f(c5451h0, c9712e);
            case 6:
                return new C9716i(c5451h0, c9712e);
            default:
                C11189e.m42153c("Unknown layer type " + c9712e.m38378g());
                return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public C9712e m38338A() {
        return this.f35265q;
    }

    /* JADX INFO: renamed from: B */
    public boolean m38339B() {
        C6650h c6650h = this.f35266r;
        return (c6650h == null || c6650h.m28699a().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public boolean m38340C() {
        return this.f35268t != null;
    }

    /* JADX INFO: renamed from: D */
    public final void m38341D(RectF rectF, Matrix matrix) {
        this.f35259k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m38339B()) {
            int size = this.f35266r.m28700b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C8903i c8903i = this.f35266r.m28700b().get(i10);
                Path pathMo28668h = this.f35266r.m28699a().get(i10).mo28668h();
                if (pathMo28668h != null) {
                    this.f35249a.set(pathMo28668h);
                    this.f35249a.transform(matrix);
                    int i11 = a.f35276b[c8903i.m35874a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && c8903i.m35877d()) {
                        return;
                    }
                    this.f35249a.computeBounds(this.f35261m, false);
                    if (i10 == 0) {
                        this.f35259k.set(this.f35261m);
                    } else {
                        RectF rectF2 = this.f35259k;
                        rectF2.set(Math.min(rectF2.left, this.f35261m.left), Math.min(this.f35259k.top, this.f35261m.top), Math.max(this.f35259k.right, this.f35261m.right), Math.max(this.f35259k.bottom, this.f35261m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f35259k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m38342E(RectF rectF, Matrix matrix) {
        if (m38340C() && this.f35265q.m38380i() != C9712e.b.INVERT) {
            this.f35260l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f35268t.mo27578e(this.f35260l, matrix, true);
            if (rectF.intersect(this.f35260l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m38343F() {
        this.f35264p.invalidateSelf();
    }

    /* JADX INFO: renamed from: G */
    public final void m38344G(float f10) {
        this.f35264p.m24966J().m25048n().m25122a(this.f35265q.m38381j(), f10);
    }

    /* JADX INFO: renamed from: H */
    public void m38345H(AbstractC6643a<?, ?> abstractC6643a) {
        this.f35271w.remove(abstractC6643a);
    }

    /* JADX INFO: renamed from: I */
    public void mo38346I(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
    }

    /* JADX INFO: renamed from: J */
    public void m38347J(AbstractC9709b abstractC9709b) {
        this.f35268t = abstractC9709b;
    }

    /* JADX INFO: renamed from: K */
    public void mo38348K(boolean z10) {
        if (z10 && this.f35245A == null) {
            this.f35245A = new C6047a();
        }
        this.f35274z = z10;
    }

    /* JADX INFO: renamed from: L */
    public void m38349L(AbstractC9709b abstractC9709b) {
        this.f35269u = abstractC9709b;
    }

    /* JADX INFO: renamed from: M */
    public void mo38350M(float f10) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("BaseLayer#setProgress");
            C5444e.m24923b("BaseLayer#setProgress.transform");
        }
        this.f35272x.m28726j(f10);
        if (C5444e.m24929h()) {
            C5444e.m24924c("BaseLayer#setProgress.transform");
        }
        if (this.f35266r != null) {
            if (C5444e.m24929h()) {
                C5444e.m24923b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f35266r.m28699a().size(); i10++) {
                this.f35266r.m28699a().get(i10).mo28674n(f10);
            }
            if (C5444e.m24929h()) {
                C5444e.m24924c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f35267s != null) {
            if (C5444e.m24929h()) {
                C5444e.m24923b("BaseLayer#setProgress.inout");
            }
            this.f35267s.mo28674n(f10);
            if (C5444e.m24929h()) {
                C5444e.m24924c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f35268t != null) {
            if (C5444e.m24929h()) {
                C5444e.m24923b("BaseLayer#setProgress.matte");
            }
            this.f35268t.mo38350M(f10);
            if (C5444e.m24929h()) {
                C5444e.m24924c("BaseLayer#setProgress.matte");
            }
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("BaseLayer#setProgress.animations." + this.f35271w.size());
        }
        for (int i11 = 0; i11 < this.f35271w.size(); i11++) {
            this.f35271w.get(i11).mo28674n(f10);
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("BaseLayer#setProgress.animations." + this.f35271w.size());
            C5444e.m24924c("BaseLayer#setProgress");
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m38351N(boolean z10) {
        if (z10 != this.f35273y) {
            this.f35273y = z10;
            m38343F();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m38352O() {
        if (this.f35265q.m38377f().isEmpty()) {
            m38351N(true);
            return;
        }
        C6646d c6646d = new C6646d(this.f35265q.m38377f());
        this.f35267s = c6646d;
        c6646d.m28673m();
        this.f35267s.m28661a(new AbstractC6643a.b() { // from class: o7.a
            @Override // p189i7.AbstractC6643a.b
            /* JADX INFO: renamed from: a */
            public final void mo27575a() {
                AbstractC9709b abstractC9709b = this.f35244a;
                abstractC9709b.m38351N(abstractC9709b.f35267s.m28693r() == 1.0f);
            }
        });
        m38351N(this.f35267s.mo28668h().floatValue() == 1.0f);
        m38353j(this.f35267s);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        m38343F();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        this.f35272x.m28719c(t8, c11552c);
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        this.f35257i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m38362s();
        this.f35263o.set(matrix);
        if (z10) {
            List<AbstractC9709b> list = this.f35270v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f35263o.preConcat(this.f35270v.get(size).f35272x.m28722f());
                }
            } else {
                AbstractC9709b abstractC9709b = this.f35269u;
                if (abstractC9709b != null) {
                    this.f35263o.preConcat(abstractC9709b.f35272x.m28722f());
                }
            }
        }
        this.f35263o.preConcat(this.f35272x.m28722f());
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f35265q.m38381j();
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        AbstractC9709b abstractC9709b = this.f35268t;
        if (abstractC9709b != null) {
            C8006e c8006eM33076a = c8006e2.m33076a(abstractC9709b.getName());
            if (c8006e.m33078c(this.f35268t.getName(), i10)) {
                list.add(c8006eM33076a.m33084i(this.f35268t));
            }
            if (c8006e.m33082g(this.f35268t.getName(), i10) && c8006e.m33083h(getName(), i10)) {
                this.f35268t.mo38346I(c8006e, c8006e.m33080e(this.f35268t.getName(), i10) + i10, list, c8006eM33076a);
            }
        }
        if (c8006e.m33082g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                c8006e2 = c8006e2.m33076a(getName());
                if (c8006e.m33078c(getName(), i10)) {
                    list.add(c8006e2.m33084i(this));
                }
            }
            if (c8006e.m33083h(getName(), i10)) {
                mo38346I(c8006e, i10 + c8006e.m33080e(getName(), i10), list, c8006e2);
            }
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        Paint paint;
        Integer numMo28668h;
        C5444e.m24923b(this.f35262n);
        if (!this.f35273y || this.f35265q.m38396y()) {
            C5444e.m24924c(this.f35262n);
            return;
        }
        m38362s();
        if (C5444e.m24929h()) {
            C5444e.m24923b("Layer#parentMatrix");
        }
        this.f35250b.reset();
        this.f35250b.set(matrix);
        for (int size = this.f35270v.size() - 1; size >= 0; size--) {
            this.f35250b.preConcat(this.f35270v.get(size).f35272x.m28722f());
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("Layer#parentMatrix");
        }
        AbstractC6643a<?, Integer> abstractC6643aM28724h = this.f35272x.m28724h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((abstractC6643aM28724h == null || (numMo28668h = abstractC6643aM28724h.mo28668h()) == null) ? 100 : numMo28668h.intValue())) / 100.0f) * 255.0f);
        if (!m38340C() && !m38339B() && m38365w() == EnumC8902h.NORMAL) {
            this.f35250b.preConcat(this.f35272x.m28722f());
            if (C5444e.m24929h()) {
                C5444e.m24923b("Layer#drawLayer");
            }
            mo38364u(canvas, this.f35250b, iIntValue, c11186b);
            if (C5444e.m24929h()) {
                C5444e.m24924c("Layer#drawLayer");
            }
            m38344G(C5444e.m24924c(this.f35262n));
            return;
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("Layer#computeBounds");
        }
        mo27578e(this.f35257i, this.f35250b, false);
        m38342E(this.f35257i, matrix);
        this.f35250b.preConcat(this.f35272x.m28722f());
        m38341D(this.f35257i, this.f35250b);
        this.f35258j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f35251c);
        if (!this.f35251c.isIdentity()) {
            Matrix matrix2 = this.f35251c;
            matrix2.invert(matrix2);
            this.f35251c.mapRect(this.f35258j);
        }
        if (!this.f35257i.intersect(this.f35258j)) {
            this.f35257i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("Layer#computeBounds");
        }
        if (this.f35257i.width() >= 1.0f && this.f35257i.height() >= 1.0f) {
            if (C5444e.m24929h()) {
                C5444e.m24923b("Layer#saveLayer");
            }
            this.f35252d.setAlpha(255);
            C0547d.m2680b(this.f35252d, m38365w().m35873b());
            C11197m.m42225n(canvas, this.f35257i, this.f35252d);
            if (C5444e.m24929h()) {
                C5444e.m24924c("Layer#saveLayer");
            }
            if (m38365w() != EnumC8902h.MULTIPLY) {
                m38363t(canvas);
            } else {
                if (this.f35248D == null) {
                    C6047a c6047a = new C6047a();
                    this.f35248D = c6047a;
                    c6047a.setColor(-1);
                }
                RectF rectF = this.f35257i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f35248D);
            }
            if (C5444e.m24929h()) {
                C5444e.m24923b("Layer#drawLayer");
            }
            mo38364u(canvas, this.f35250b, iIntValue, c11186b);
            if (C5444e.m24929h()) {
                C5444e.m24924c("Layer#drawLayer");
            }
            if (m38339B()) {
                m38359p(canvas, this.f35250b);
            }
            if (m38340C()) {
                if (C5444e.m24929h()) {
                    C5444e.m24923b("Layer#drawMatte");
                    C5444e.m24923b("Layer#saveLayer");
                }
                C11197m.m42226o(canvas, this.f35257i, this.f35255g, 19);
                if (C5444e.m24929h()) {
                    C5444e.m24924c("Layer#saveLayer");
                }
                m38363t(canvas);
                this.f35268t.mo27581i(canvas, matrix, i10, null);
                if (C5444e.m24929h()) {
                    C5444e.m24923b("Layer#restoreLayer");
                }
                canvas.restore();
                if (C5444e.m24929h()) {
                    C5444e.m24924c("Layer#restoreLayer");
                    C5444e.m24924c("Layer#drawMatte");
                }
            }
            if (C5444e.m24929h()) {
                C5444e.m24923b("Layer#restoreLayer");
            }
            canvas.restore();
            if (C5444e.m24929h()) {
                C5444e.m24924c("Layer#restoreLayer");
            }
        }
        if (this.f35274z && (paint = this.f35245A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f35245A.setColor(-251901);
            this.f35245A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f35257i, this.f35245A);
            this.f35245A.setStyle(Paint.Style.FILL);
            this.f35245A.setColor(1357638635);
            canvas.drawRect(this.f35257i, this.f35245A);
        }
        m38344G(C5444e.m24924c(this.f35262n));
    }

    /* JADX INFO: renamed from: j */
    public void m38353j(AbstractC6643a<?, ?> abstractC6643a) {
        if (abstractC6643a == null) {
            return;
        }
        this.f35271w.add(abstractC6643a);
    }

    /* JADX INFO: renamed from: k */
    public final void m38354k(Canvas canvas, Matrix matrix, AbstractC6643a<C8909o, Path> abstractC6643a, AbstractC6643a<Integer, Integer> abstractC6643a2) {
        this.f35249a.set(abstractC6643a.mo28668h());
        this.f35249a.transform(matrix);
        this.f35252d.setAlpha((int) (abstractC6643a2.mo28668h().intValue() * 2.55f));
        canvas.drawPath(this.f35249a, this.f35252d);
    }

    /* JADX INFO: renamed from: l */
    public final void m38355l(Canvas canvas, Matrix matrix, AbstractC6643a<C8909o, Path> abstractC6643a, AbstractC6643a<Integer, Integer> abstractC6643a2) {
        C11197m.m42225n(canvas, this.f35257i, this.f35253e);
        this.f35249a.set(abstractC6643a.mo28668h());
        this.f35249a.transform(matrix);
        this.f35252d.setAlpha((int) (abstractC6643a2.mo28668h().intValue() * 2.55f));
        canvas.drawPath(this.f35249a, this.f35252d);
        canvas.restore();
    }

    /* JADX INFO: renamed from: m */
    public final void m38356m(Canvas canvas, Matrix matrix, AbstractC6643a<C8909o, Path> abstractC6643a, AbstractC6643a<Integer, Integer> abstractC6643a2) {
        C11197m.m42225n(canvas, this.f35257i, this.f35252d);
        canvas.drawRect(this.f35257i, this.f35252d);
        this.f35249a.set(abstractC6643a.mo28668h());
        this.f35249a.transform(matrix);
        this.f35252d.setAlpha((int) (abstractC6643a2.mo28668h().intValue() * 2.55f));
        canvas.drawPath(this.f35249a, this.f35254f);
        canvas.restore();
    }

    /* JADX INFO: renamed from: n */
    public final void m38357n(Canvas canvas, Matrix matrix, AbstractC6643a<C8909o, Path> abstractC6643a, AbstractC6643a<Integer, Integer> abstractC6643a2) {
        C11197m.m42225n(canvas, this.f35257i, this.f35253e);
        canvas.drawRect(this.f35257i, this.f35252d);
        this.f35254f.setAlpha((int) (abstractC6643a2.mo28668h().intValue() * 2.55f));
        this.f35249a.set(abstractC6643a.mo28668h());
        this.f35249a.transform(matrix);
        canvas.drawPath(this.f35249a, this.f35254f);
        canvas.restore();
    }

    /* JADX INFO: renamed from: o */
    public final void m38358o(Canvas canvas, Matrix matrix, AbstractC6643a<C8909o, Path> abstractC6643a, AbstractC6643a<Integer, Integer> abstractC6643a2) {
        C11197m.m42225n(canvas, this.f35257i, this.f35254f);
        canvas.drawRect(this.f35257i, this.f35252d);
        this.f35254f.setAlpha((int) (abstractC6643a2.mo28668h().intValue() * 2.55f));
        this.f35249a.set(abstractC6643a.mo28668h());
        this.f35249a.transform(matrix);
        canvas.drawPath(this.f35249a, this.f35254f);
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    public final void m38359p(Canvas canvas, Matrix matrix) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("Layer#saveLayer");
        }
        C11197m.m42226o(canvas, this.f35257i, this.f35253e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m38363t(canvas);
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f35266r.m28700b().size(); i10++) {
            C8903i c8903i = this.f35266r.m28700b().get(i10);
            AbstractC6643a<C8909o, Path> abstractC6643a = this.f35266r.m28699a().get(i10);
            AbstractC6643a<Integer, Integer> abstractC6643a2 = this.f35266r.m28701c().get(i10);
            int i11 = a.f35276b[c8903i.m35874a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f35252d.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f35252d.setAlpha(255);
                        canvas.drawRect(this.f35257i, this.f35252d);
                    }
                    if (c8903i.m35877d()) {
                        m38358o(canvas, matrix, abstractC6643a, abstractC6643a2);
                    } else {
                        m38360q(canvas, matrix, abstractC6643a);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (c8903i.m35877d()) {
                            m38356m(canvas, matrix, abstractC6643a, abstractC6643a2);
                        } else {
                            m38354k(canvas, matrix, abstractC6643a, abstractC6643a2);
                        }
                    }
                } else if (c8903i.m35877d()) {
                    m38357n(canvas, matrix, abstractC6643a, abstractC6643a2);
                } else {
                    m38355l(canvas, matrix, abstractC6643a, abstractC6643a2);
                }
            } else if (m38361r()) {
                this.f35252d.setAlpha(255);
                canvas.drawRect(this.f35257i, this.f35252d);
            }
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("Layer#restoreLayer");
        }
        canvas.restore();
        if (C5444e.m24929h()) {
            C5444e.m24924c("Layer#restoreLayer");
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m38360q(Canvas canvas, Matrix matrix, AbstractC6643a<C8909o, Path> abstractC6643a) {
        this.f35249a.set(abstractC6643a.mo28668h());
        this.f35249a.transform(matrix);
        canvas.drawPath(this.f35249a, this.f35254f);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m38361r() {
        if (this.f35266r.m28699a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f35266r.m28700b().size(); i10++) {
            if (this.f35266r.m28700b().get(i10).m35874a() != C8903i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m38362s() {
        if (this.f35270v != null) {
            return;
        }
        if (this.f35269u == null) {
            this.f35270v = Collections.EMPTY_LIST;
            return;
        }
        this.f35270v = new ArrayList();
        for (AbstractC9709b abstractC9709b = this.f35269u; abstractC9709b != null; abstractC9709b = abstractC9709b.f35269u) {
            this.f35270v.add(abstractC9709b);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m38363t(Canvas canvas) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("Layer#clearLayer");
        }
        RectF rectF = this.f35257i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f35256h);
        if (C5444e.m24929h()) {
            C5444e.m24924c("Layer#clearLayer");
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo38364u(Canvas canvas, Matrix matrix, int i10, C11186b c11186b);

    /* JADX INFO: renamed from: w */
    public EnumC8902h m38365w() {
        return this.f35265q.m38372a();
    }

    /* JADX INFO: renamed from: x */
    public C8895a mo38366x() {
        return this.f35265q.m38373b();
    }

    /* JADX INFO: renamed from: y */
    public BlurMaskFilter m38367y(float f10) {
        if (this.f35246B == f10) {
            return this.f35247C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f35247C = blurMaskFilter;
        this.f35246B = f10;
        return blurMaskFilter;
    }

    /* JADX INFO: renamed from: z */
    public C10458j m38368z() {
        return this.f35265q.m38375d();
    }
}
