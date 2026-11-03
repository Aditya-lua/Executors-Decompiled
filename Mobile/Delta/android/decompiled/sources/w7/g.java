package w7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f34011g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f34012a = null;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34013c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34014d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w7.b.r f34015e = new w7.b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, l0> f34016f = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34017a;

        static {
            int[] iArr = new int[d1.values().length];
            f34017a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34017a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34017a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34017a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34017a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34017a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34017a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34017a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34017a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends z {
        @Override // w7.g.z, w7.g.n0
        public String n() {
            return "polygon";
        }
    }

    public static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<p> f34018o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<p> f34019p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<p> f34020q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<p> f34021r;
    }

    public static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f34025o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34026p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34027q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34028r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f34029s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34030t;

        @Override // w7.g.n0
        public String n() {
            return "rect";
        }
    }

    public interface b1 {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f34031a;
        public p b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f34032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f34033d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f34031a = pVar;
            this.b = pVar2;
            this.f34032c = pVar3;
            this.f34033d = pVar4;
        }
    }

    public static class c0 extends l0 implements j0 {
        @Override // w7.g.j0
        public void a(n0 n0Var) {
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // w7.g.n0
        public String n() {
            return "solidColor";
        }
    }

    public static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b1 f34035d;

        public c1(String str) {
            this.f34034c = str;
        }

        @Override // w7.g.x0
        public b1 e() {
            return this.f34035d;
        }

        public String toString() {
            return "TextChild: '" + this.f34034c + "'";
        }
    }

    public static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f34036o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34038q;

        @Override // w7.g.n0
        public String n() {
            return "circle";
        }
    }

    public static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f34039h;

        @Override // w7.g.j0
        public void a(n0 n0Var) {
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // w7.g.n0
        public String n() {
            return "stop";
        }
    }

    public enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class e extends m implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f34049p;

        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "clipPath";
        }
    }

    public static class e0 implements Cloneable {
        public Boolean A;
        public Boolean B;
        public o0 C;
        public Float D;
        public String E;
        public a F;
        public String G;
        public o0 H;
        public Float I;
        public o0 J;
        public Float K;
        public i L;
        public e M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f34050a = 0;
        public o0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f34051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f34052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o0 f34053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f34054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f34055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f34056h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f34057i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Float f34058j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public p[] f34059k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p f34060l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Float f34061m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public f f34062n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<String> f34063o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34064p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Integer f34065q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public b f34066r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public EnumC0630g f34067s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public h f34068t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public f f34069u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Boolean f34070v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public c f34071w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f34072x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f34073y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f34074z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: w7.g$e0$g, reason: collision with other inner class name */
        public enum EnumC0630g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        public static e0 a() {
            e0 e0Var = new e0();
            e0Var.f34050a = -1L;
            f fVar = f.b;
            e0Var.b = fVar;
            a aVar = a.NonZero;
            e0Var.f34051c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f34052d = fValueOf;
            e0Var.f34053e = null;
            e0Var.f34054f = fValueOf;
            e0Var.f34055g = new p(1.0f);
            e0Var.f34056h = c.Butt;
            e0Var.f34057i = d.Miter;
            e0Var.f34058j = Float.valueOf(4.0f);
            e0Var.f34059k = null;
            e0Var.f34060l = new p(0.0f);
            e0Var.f34061m = fValueOf;
            e0Var.f34062n = fVar;
            e0Var.f34063o = null;
            e0Var.f34064p = new p(12.0f, d1.pt);
            e0Var.f34065q = 400;
            e0Var.f34066r = b.Normal;
            e0Var.f34067s = EnumC0630g.None;
            e0Var.f34068t = h.LTR;
            e0Var.f34069u = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f34070v = bool;
            e0Var.f34071w = null;
            e0Var.f34072x = null;
            e0Var.f34073y = null;
            e0Var.f34074z = null;
            e0Var.A = bool;
            e0Var.B = bool;
            e0Var.C = fVar;
            e0Var.D = fValueOf;
            e0Var.E = null;
            e0Var.F = aVar;
            e0Var.G = null;
            e0Var.H = null;
            e0Var.I = fValueOf;
            e0Var.J = null;
            e0Var.K = fValueOf;
            e0Var.L = i.None;
            e0Var.M = e.auto;
            return e0Var;
        }

        public void b(boolean z10) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f34070v = bool;
            this.f34071w = null;
            this.E = null;
            this.f34061m = fValueOf;
            this.C = f.b;
            this.D = fValueOf;
            this.G = null;
            this.H = null;
            this.I = fValueOf;
            this.J = null;
            this.K = fValueOf;
            this.L = i.None;
        }

        public Object clone() {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f34059k;
            if (pVarArr != null) {
                e0Var.f34059k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    public static class e1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f34101p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34102q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34103r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f34104s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34105t;

        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "use";
        }
    }

    public static class f extends o0 {
        public static final f b = new f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f34106c = new f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34107a;

        public f(int i10) {
            this.f34107a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f34107a));
        }
    }

    public static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34108q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34109r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f34110s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34111t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f34112u;

        @Override // w7.g.n0
        public String n() {
            return "svg";
        }
    }

    public static class f1 extends r0 implements t {
        @Override // w7.g.n0
        public String n() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: w7.g$g, reason: collision with other inner class name */
    public static class C0631g extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static C0631g f34113a = new C0631g();

        public static C0631g a() {
            return f34113a;
        }
    }

    public interface g0 {
        Set<String> b();

        String c();

        void d(Set<String> set);

        void f(Set<String> set);

        Set<String> g();

        void h(Set<String> set);

        void i(Set<String> set);

        void j(String str);

        Set<String> l();

        Set<String> m();
    }

    public static class h extends m implements t {
        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "defs";
        }
    }

    public static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<n0> f34114i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f34115j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f34116k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f34117l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f34118m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f34119n = null;

        @Override // w7.g.j0
        public void a(n0 n0Var) {
            this.f34114i.add(n0Var);
        }

        @Override // w7.g.g0
        public Set<String> b() {
            return null;
        }

        @Override // w7.g.g0
        public String c() {
            return this.f34116k;
        }

        @Override // w7.g.g0
        public void d(Set<String> set) {
            this.f34119n = set;
        }

        @Override // w7.g.g0
        public void f(Set<String> set) {
            this.f34115j = set;
        }

        @Override // w7.g.g0
        public Set<String> g() {
            return this.f34115j;
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return this.f34114i;
        }

        @Override // w7.g.g0
        public void h(Set<String> set) {
            this.f34117l = set;
        }

        @Override // w7.g.g0
        public void i(Set<String> set) {
            this.f34118m = set;
        }

        @Override // w7.g.g0
        public void j(String str) {
            this.f34116k = str;
        }

        @Override // w7.g.g0
        public Set<String> l() {
            return this.f34118m;
        }

        @Override // w7.g.g0
        public Set<String> m() {
            return this.f34119n;
        }
    }

    public static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f34120o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34121p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34122q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34123r;

        @Override // w7.g.n0
        public String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f34124i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f34125j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f34126k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f34127l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f34128m = null;

        @Override // w7.g.g0
        public Set<String> b() {
            return this.f34126k;
        }

        @Override // w7.g.g0
        public String c() {
            return this.f34125j;
        }

        @Override // w7.g.g0
        public void d(Set<String> set) {
            this.f34128m = set;
        }

        @Override // w7.g.g0
        public void f(Set<String> set) {
            this.f34124i = set;
        }

        @Override // w7.g.g0
        public Set<String> g() {
            return this.f34124i;
        }

        @Override // w7.g.g0
        public void h(Set<String> set) {
            this.f34126k = set;
        }

        @Override // w7.g.g0
        public void i(Set<String> set) {
            this.f34127l = set;
        }

        @Override // w7.g.g0
        public void j(String str) {
            this.f34125j = str;
        }

        @Override // w7.g.g0
        public Set<String> l() {
            return this.f34127l;
        }

        @Override // w7.g.g0
        public Set<String> m() {
            return this.f34128m;
        }
    }

    public static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<n0> f34129h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f34130i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f34131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public k f34132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f34133l;

        @Override // w7.g.j0
        public void a(n0 n0Var) throws w7.j {
            if (n0Var instanceof d0) {
                this.f34129h.add(n0Var);
                return;
            }
            throw new w7.j("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return this.f34129h;
        }
    }

    public interface j0 {
        void a(n0 n0Var);

        List<n0> getChildren();
    }

    public enum k {
        pad,
        reflect,
        repeat
    }

    public static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f34137h = null;
    }

    public static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f34138n;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f34138n = matrix;
        }
    }

    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34139c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f34140d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e0 f34141e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e0 f34142f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f34143g = null;

        public String toString() {
            return n();
        }
    }

    public static class m extends h0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f34144o;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f34144o = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return "group";
        }
    }

    public static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f34145m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f34146n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f34147o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34148p;

        @Override // w7.g.n0
        public String n() {
            return "linearGradient";
        }
    }

    public interface n {
        void k(Matrix matrix);
    }

    public static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f34149a;
        public j0 b;

        public String n() {
            return "";
        }
    }

    public static class o extends p0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f34150p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34151q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34152r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f34153s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34154t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f34155u;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f34155u = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return "image";
        }
    }

    public static abstract class o0 implements Cloneable {
    }

    public static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w7.e f34157o = null;
    }

    public static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f34158o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34159p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34160q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34161r;

        @Override // w7.g.n0
        public String n() {
            return "line";
        }
    }

    public static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f34162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f34163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f34164o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34165p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34166q;

        @Override // w7.g.n0
        public String n() {
            return "radialGradient";
        }
    }

    public static class r extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f34167q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34168r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f34169s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34170t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f34171u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f34172v;

        @Override // w7.g.n0
        public String n() {
            return "marker";
        }
    }

    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f34173p;
    }

    public static class s extends h0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f34174o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f34175p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f34176q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f34177r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f34178s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34179t;

        @Override // w7.g.n0
        public String n() {
            return "mask";
        }
    }

    public static class s0 extends m {
        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "switch";
        }
    }

    public interface t {
    }

    public static class t0 extends r0 implements t {
        @Override // w7.g.n0
        public String n() {
            return "symbol";
        }
    }

    public static class u extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34180a;
        public o0 b;

        public u(String str, o0 o0Var) {
            this.f34180a = str;
            this.b = o0Var;
        }

        public String toString() {
            return this.f34180a + " " + this.b;
        }
    }

    public static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f34181o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b1 f34182p;

        @Override // w7.g.x0
        public b1 e() {
            return this.f34182p;
        }

        @Override // w7.g.n0
        public String n() {
            return "tref";
        }

        public void o(b1 b1Var) {
            this.f34182p = b1Var;
        }
    }

    public static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f34183o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Float f34184p;

        @Override // w7.g.n0
        public String n() {
            return "path";
        }
    }

    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public b1 f34185s;

        @Override // w7.g.x0
        public b1 e() {
            return this.f34185s;
        }

        @Override // w7.g.n0
        public String n() {
            return "tspan";
        }

        public void o(b1 b1Var) {
            this.f34185s = b1Var;
        }
    }

    public static class w implements x {
        public int b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34188d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f34186a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f34187c = new float[16];

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f34187c;
            int i10 = this.f34188d;
            int i11 = i10 + 1;
            this.f34188d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f34188d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f34188d = i13;
            fArr[i12] = f12;
            this.f34188d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f34187c;
            int i10 = this.f34188d;
            int i11 = i10 + 1;
            this.f34188d = i11;
            fArr[i10] = f10;
            this.f34188d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f34187c;
            int i10 = this.f34188d;
            int i11 = i10 + 1;
            this.f34188d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f34188d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f34188d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f34188d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f34188d = i15;
            fArr[i14] = f14;
            this.f34188d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // w7.g.x
        public void close() {
            f((byte) 8);
        }

        @Override // w7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f34187c;
            int i10 = this.f34188d;
            int i11 = i10 + 1;
            this.f34188d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f34188d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f34188d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f34188d = i14;
            fArr[i13] = f13;
            this.f34188d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f34187c;
            int i10 = this.f34188d;
            int i11 = i10 + 1;
            this.f34188d = i11;
            fArr[i10] = f10;
            this.f34188d = i10 + 2;
            fArr[i11] = f11;
        }

        public final void f(byte b) {
            int i10 = this.b;
            byte[] bArr = this.f34186a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f34186a = bArr2;
            }
            byte[] bArr3 = this.f34186a;
            int i11 = this.b;
            this.b = i11 + 1;
            bArr3[i11] = b;
        }

        public final void g(int i10) {
            float[] fArr = this.f34187c;
            if (fArr.length < this.f34188d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f34187c = fArr2;
            }
        }

        public void h(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.b; i11++) {
                byte b = this.f34186a[i11];
                if (b == 0) {
                    float[] fArr = this.f34187c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.b(f10, fArr[i12]);
                } else if (b == 1) {
                    float[] fArr2 = this.f34187c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.e(f11, fArr2[i13]);
                } else if (b == 2) {
                    float[] fArr3 = this.f34187c;
                    xVar.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.f34187c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.a(f12, f13, f14, fArr4[i14]);
                } else if (b != 8) {
                    boolean z10 = (b & 2) != 0;
                    boolean z11 = (b & 1) != 0;
                    float[] fArr5 = this.f34187c;
                    xVar.d(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    xVar.close();
                }
            }
        }

        public boolean i() {
            return this.b == 0;
        }
    }

    public static class w0 extends a1 implements b1, n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f34189s;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f34189s = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return Text.type;
        }
    }

    public interface x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void e(float f10, float f11);
    }

    public interface x0 {
        b1 e();
    }

    public static class y extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f34190q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f34191r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f34192s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f34193t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f34194u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p f34195v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p f34196w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f34197x;

        @Override // w7.g.n0
        public String n() {
            return "pattern";
        }
    }

    public static abstract class y0 extends h0 {
        @Override // w7.g.h0, w7.g.j0
        public void a(n0 n0Var) throws w7.j {
            if (n0Var instanceof x0) {
                this.f34114i.add(n0Var);
                return;
            }
            throw new w7.j("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    public static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f34198o;

        @Override // w7.g.n0
        public String n() {
            return "polyline";
        }
    }

    public static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f34199o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f34200p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public b1 f34201q;

        @Override // w7.g.x0
        public b1 e() {
            return this.f34201q;
        }

        @Override // w7.g.n0
        public String n() {
            return "textPath";
        }

        public void o(b1 b1Var) {
            this.f34201q = b1Var;
        }
    }

    public static w7.i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new w7.k().z(inputStream, f34011g);
    }

    public void a(w7.b.r rVar) {
        this.f34015e.b(rVar);
    }

    public void b() {
        this.f34015e.e(w7.b.u.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    public List<w7.b.p> d() {
        return this.f34015e.c();
    }

    public final b e(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fB;
        d1 d1Var5;
        f0 f0Var = this.f34012a;
        p pVar = f0Var.f34110s;
        p pVar2 = f0Var.f34111t;
        if (pVar == null || pVar.j() || (d1Var = pVar.b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = pVar.b(f10);
        if (pVar2 == null) {
            b bVar = this.f34012a.f34173p;
            fB = bVar != null ? (bVar.f34024d * fB2) / bVar.f34023c : fB2;
        } else {
            if (pVar2.j() || (d1Var5 = pVar2.b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = pVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float f() {
        if (this.f34012a != null) {
            return e(this.f34014d).f34024d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        f0 f0Var = this.f34012a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f34173p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f34012a != null) {
            return e(this.f34014d).f34023c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public l0 i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f34012a.f34139c)) {
            return this.f34012a;
        }
        if (this.f34016f.containsKey(str)) {
            return this.f34016f.get(str);
        }
        l0 l0VarJ = j(this.f34012a, str);
        this.f34016f.put(str, l0VarJ);
        return l0VarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l0 j(j0 j0Var, String str) {
        l0 l0VarJ;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f34139c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f34139c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (l0VarJ = j((j0) obj, str)) != null) {
                    return l0VarJ;
                }
            }
        }
        return null;
    }

    public f0 m() {
        return this.f34012a;
    }

    public boolean n() {
        return !this.f34015e.d();
    }

    public void o(Canvas canvas, w7.f fVar) {
        if (fVar == null) {
            fVar = new w7.f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new w7.h(canvas, this.f34014d).G0(this, fVar);
    }

    public n0 p(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return i(strC.substring(1));
    }

    public void q(String str) {
        this.f34013c = str;
    }

    public void r(String str) {
        f0 f0Var = this.f34012a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f34111t = w7.k.o0(str);
    }

    public void s(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f34012a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f34173p = new b(f10, f11, f12, f13);
    }

    public void t(String str) {
        f0 f0Var = this.f34012a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f34110s = w7.k.o0(str);
    }

    public void u(f0 f0Var) {
        this.f34012a = f0Var;
    }

    public void v(String str) {
        this.b = str;
    }

    public static class p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f34156a;
        public d1 b;

        public p(float f10, d1 d1Var) {
            this.f34156a = f10;
            this.b = d1Var;
        }

        public float a() {
            return this.f34156a;
        }

        public float b(float f10) {
            int i10 = a.f34017a[this.b.ordinal()];
            if (i10 == 1) {
                return this.f34156a;
            }
            switch (i10) {
                case 4:
                    return this.f34156a * f10;
                case 5:
                    return (this.f34156a * f10) / 2.54f;
                case 6:
                    return (this.f34156a * f10) / 25.4f;
                case 7:
                    return (this.f34156a * f10) / 72.0f;
                case 8:
                    return (this.f34156a * f10) / 6.0f;
                default:
                    return this.f34156a;
            }
        }

        public float c(w7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b bVarS = hVar.S();
            if (bVarS == null) {
                return this.f34156a;
            }
            float f10 = bVarS.f34023c;
            float f11 = bVarS.f34024d;
            if (f10 == f11) {
                return (this.f34156a * f10) / 100.0f;
            }
            return (this.f34156a * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        public float e(w7.h hVar, float f10) {
            return this.b == d1.percent ? (this.f34156a * f10) / 100.0f : f(hVar);
        }

        public float f(w7.h hVar) {
            switch (a.f34017a[this.b.ordinal()]) {
                case 1:
                    return this.f34156a;
                case 2:
                    return this.f34156a * hVar.Q();
                case 3:
                    return this.f34156a * hVar.R();
                case 4:
                    return this.f34156a * hVar.T();
                case 5:
                    return (this.f34156a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f34156a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f34156a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f34156a * hVar.T()) / 6.0f;
                case 9:
                    b bVarS = hVar.S();
                    return bVarS == null ? this.f34156a : (this.f34156a * bVarS.f34023c) / 100.0f;
                default:
                    return this.f34156a;
            }
        }

        public float h(w7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b bVarS = hVar.S();
            return bVarS == null ? this.f34156a : (this.f34156a * bVarS.f34024d) / 100.0f;
        }

        public boolean i() {
            return this.f34156a < 0.0f;
        }

        public boolean j() {
            return this.f34156a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f34156a) + this.b;
        }

        public p(float f10) {
            this.f34156a = f10;
            this.b = d1.px;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f34022a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f34024d;

        public b(float f10, float f11, float f12, float f13) {
            this.f34022a = f10;
            this.b = f11;
            this.f34023c = f12;
            this.f34024d = f13;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f34022a + this.f34023c;
        }

        public float c() {
            return this.b + this.f34024d;
        }

        public RectF d() {
            return new RectF(this.f34022a, this.b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f34022a;
            if (f10 < this.f34022a) {
                this.f34022a = f10;
            }
            float f11 = bVar.b;
            if (f11 < this.b) {
                this.b = f11;
            }
            if (bVar.b() > b()) {
                this.f34023c = bVar.b() - this.f34022a;
            }
            if (bVar.c() > c()) {
                this.f34024d = bVar.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.f34022a + " " + this.b + " " + this.f34023c + " " + this.f34024d + "]";
        }

        public b(b bVar) {
            this.f34022a = bVar.f34022a;
            this.b = bVar.b;
            this.f34023c = bVar.f34023c;
            this.f34024d = bVar.f34024d;
        }
    }
}
