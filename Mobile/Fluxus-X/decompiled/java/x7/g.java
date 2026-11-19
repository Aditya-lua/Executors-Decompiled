package x7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.github.luben.zstd.BuildConfig;
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
    public static boolean f36295g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f36296a = null;
    public String b = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36297c = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36298d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x7.b.r f36299e = new x7.b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, l0> f36300f = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36301a;

        static {
            int[] iArr = new int[d1.values().length];
            f36301a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36301a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36301a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36301a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36301a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36301a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36301a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36301a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36301a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends z {
        @Override // x7.g.z, x7.g.n0
        public String n() {
            return "polygon";
        }
    }

    public static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<p> f36302o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<p> f36303p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<p> f36304q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<p> f36305r;
    }

    public static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f36309o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36310p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36311q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36312r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f36313s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36314t;

        @Override // x7.g.n0
        public String n() {
            return "rect";
        }
    }

    public interface b1 {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f36315a;
        public p b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f36316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f36317d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f36315a = pVar;
            this.b = pVar2;
            this.f36316c = pVar3;
            this.f36317d = pVar4;
        }
    }

    public static class c0 extends l0 implements j0 {
        @Override // x7.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // x7.g.j0
        public void i(n0 n0Var) {
        }

        @Override // x7.g.n0
        public String n() {
            return "solidColor";
        }
    }

    public static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f36318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b1 f36319d;

        public c1(String str) {
            this.f36318c = str;
        }

        @Override // x7.g.x0
        public b1 d() {
            return this.f36319d;
        }

        public String toString() {
            return "TextChild: '" + this.f36318c + "'";
        }
    }

    public static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f36320o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36321p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36322q;

        @Override // x7.g.n0
        public String n() {
            return "circle";
        }
    }

    public static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f36323h;

        @Override // x7.g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // x7.g.j0
        public void i(n0 n0Var) {
        }

        @Override // x7.g.n0
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
        public Boolean f36333p;

        @Override // x7.g.m, x7.g.n0
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
        public long f36334a = 0;
        public o0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f36335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f36336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o0 f36337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f36338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f36339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f36340h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f36341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Float f36342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public p[] f36343k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p f36344l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Float f36345m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public f f36346n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<String> f36347o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36348p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Integer f36349q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public b f36350r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public EnumC0750g f36351s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public h f36352t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public f f36353u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Boolean f36354v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public c f36355w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f36356x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f36357y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f36358z;

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

        /* JADX INFO: renamed from: x7.g$e0$g, reason: collision with other inner class name */
        public enum EnumC0750g {
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
            e0Var.f36334a = -1L;
            f fVar = f.b;
            e0Var.b = fVar;
            a aVar = a.NonZero;
            e0Var.f36335c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f36336d = fValueOf;
            e0Var.f36337e = null;
            e0Var.f36338f = fValueOf;
            e0Var.f36339g = new p(1.0f);
            e0Var.f36340h = c.Butt;
            e0Var.f36341i = d.Miter;
            e0Var.f36342j = Float.valueOf(4.0f);
            e0Var.f36343k = null;
            e0Var.f36344l = new p(0.0f);
            e0Var.f36345m = fValueOf;
            e0Var.f36346n = fVar;
            e0Var.f36347o = null;
            e0Var.f36348p = new p(12.0f, d1.pt);
            e0Var.f36349q = 400;
            e0Var.f36350r = b.Normal;
            e0Var.f36351s = EnumC0750g.None;
            e0Var.f36352t = h.LTR;
            e0Var.f36353u = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f36354v = bool;
            e0Var.f36355w = null;
            e0Var.f36356x = null;
            e0Var.f36357y = null;
            e0Var.f36358z = null;
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
            this.f36354v = bool;
            this.f36355w = null;
            this.E = null;
            this.f36345m = fValueOf;
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
            p[] pVarArr = this.f36343k;
            if (pVarArr != null) {
                e0Var.f36343k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    public static class e1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f36385p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36386q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36387r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f36388s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36389t;

        @Override // x7.g.m, x7.g.n0
        public String n() {
            return "use";
        }
    }

    public static class f extends o0 {
        public static final f b = new f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f36390c = new f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36391a;

        public f(int i10) {
            this.f36391a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f36391a));
        }
    }

    public static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36392q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36393r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f36394s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36395t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f36396u;

        @Override // x7.g.n0
        public String n() {
            return "svg";
        }
    }

    public static class f1 extends r0 implements t {
        @Override // x7.g.n0
        public String n() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: x7.g$g, reason: collision with other inner class name */
    public static class C0751g extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static C0751g f36397a = new C0751g();

        public static C0751g a() {
            return f36397a;
        }
    }

    public interface g0 {
        Set<String> a();

        String b();

        void c(Set<String> set);

        void e(Set<String> set);

        Set<String> f();

        void g(Set<String> set);

        void h(Set<String> set);

        void j(String str);

        Set<String> l();

        Set<String> m();
    }

    public static class h extends m implements t {
        @Override // x7.g.m, x7.g.n0
        public String n() {
            return "defs";
        }
    }

    public static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<n0> f36398i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f36399j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f36400k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f36401l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f36402m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f36403n = null;

        @Override // x7.g.g0
        public Set<String> a() {
            return null;
        }

        @Override // x7.g.g0
        public String b() {
            return this.f36400k;
        }

        @Override // x7.g.g0
        public void c(Set<String> set) {
            this.f36403n = set;
        }

        @Override // x7.g.g0
        public void e(Set<String> set) {
            this.f36399j = set;
        }

        @Override // x7.g.g0
        public Set<String> f() {
            return this.f36399j;
        }

        @Override // x7.g.g0
        public void g(Set<String> set) {
            this.f36401l = set;
        }

        @Override // x7.g.j0
        public List<n0> getChildren() {
            return this.f36398i;
        }

        @Override // x7.g.g0
        public void h(Set<String> set) {
            this.f36402m = set;
        }

        @Override // x7.g.j0
        public void i(n0 n0Var) {
            this.f36398i.add(n0Var);
        }

        @Override // x7.g.g0
        public void j(String str) {
            this.f36400k = str;
        }

        @Override // x7.g.g0
        public Set<String> l() {
            return this.f36402m;
        }

        @Override // x7.g.g0
        public Set<String> m() {
            return this.f36403n;
        }
    }

    public static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f36404o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36405p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36406q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36407r;

        @Override // x7.g.n0
        public String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f36408i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f36409j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f36410k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f36411l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f36412m = null;

        @Override // x7.g.g0
        public Set<String> a() {
            return this.f36410k;
        }

        @Override // x7.g.g0
        public String b() {
            return this.f36409j;
        }

        @Override // x7.g.g0
        public void c(Set<String> set) {
            this.f36412m = set;
        }

        @Override // x7.g.g0
        public void e(Set<String> set) {
            this.f36408i = set;
        }

        @Override // x7.g.g0
        public Set<String> f() {
            return this.f36408i;
        }

        @Override // x7.g.g0
        public void g(Set<String> set) {
            this.f36410k = set;
        }

        @Override // x7.g.g0
        public void h(Set<String> set) {
            this.f36411l = set;
        }

        @Override // x7.g.g0
        public void j(String str) {
            this.f36409j = str;
        }

        @Override // x7.g.g0
        public Set<String> l() {
            return this.f36411l;
        }

        @Override // x7.g.g0
        public Set<String> m() {
            return this.f36412m;
        }
    }

    public static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<n0> f36413h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f36414i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f36415j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public k f36416k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f36417l;

        @Override // x7.g.j0
        public List<n0> getChildren() {
            return this.f36413h;
        }

        @Override // x7.g.j0
        public void i(n0 n0Var) throws x7.j {
            if (n0Var instanceof d0) {
                this.f36413h.add(n0Var);
                return;
            }
            throw new x7.j("Gradient elements cannot contain " + n0Var + " elements.");
        }
    }

    public interface j0 {
        List<n0> getChildren();

        void i(n0 n0Var);
    }

    public enum k {
        pad,
        reflect,
        repeat
    }

    public static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f36421h = null;
    }

    public static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f36422n;

        @Override // x7.g.n
        public void k(Matrix matrix) {
            this.f36422n = matrix;
        }
    }

    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f36423c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f36424d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e0 f36425e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e0 f36426f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f36427g = null;

        public String toString() {
            return n();
        }
    }

    public static class m extends h0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f36428o;

        @Override // x7.g.n
        public void k(Matrix matrix) {
            this.f36428o = matrix;
        }

        @Override // x7.g.n0
        public String n() {
            return "group";
        }
    }

    public static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f36429m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f36430n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f36431o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36432p;

        @Override // x7.g.n0
        public String n() {
            return "linearGradient";
        }
    }

    public interface n {
        void k(Matrix matrix);
    }

    public static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f36433a;
        public j0 b;

        public String n() {
            return BuildConfig.FLAVOR;
        }
    }

    public static class o extends p0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f36434p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36435q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36436r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f36437s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36438t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f36439u;

        @Override // x7.g.n
        public void k(Matrix matrix) {
            this.f36439u = matrix;
        }

        @Override // x7.g.n0
        public String n() {
            return "image";
        }
    }

    public static abstract class o0 implements Cloneable {
    }

    public static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public x7.e f36441o = null;
    }

    public static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f36442o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36443p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36444q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36445r;

        @Override // x7.g.n0
        public String n() {
            return "line";
        }
    }

    public static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f36446m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f36447n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f36448o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36449p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36450q;

        @Override // x7.g.n0
        public String n() {
            return "radialGradient";
        }
    }

    public static class r extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f36451q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36452r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f36453s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36454t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f36455u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f36456v;

        @Override // x7.g.n0
        public String n() {
            return "marker";
        }
    }

    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f36457p;
    }

    public static class s extends h0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f36458o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f36459p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f36460q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f36461r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f36462s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36463t;

        @Override // x7.g.n0
        public String n() {
            return "mask";
        }
    }

    public static class s0 extends m {
        @Override // x7.g.m, x7.g.n0
        public String n() {
            return "switch";
        }
    }

    public interface t {
    }

    public static class t0 extends r0 implements t {
        @Override // x7.g.n0
        public String n() {
            return "symbol";
        }
    }

    public static class u extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36464a;
        public o0 b;

        public u(String str, o0 o0Var) {
            this.f36464a = str;
            this.b = o0Var;
        }

        public String toString() {
            return this.f36464a + " " + this.b;
        }
    }

    public static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f36465o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b1 f36466p;

        @Override // x7.g.x0
        public b1 d() {
            return this.f36466p;
        }

        @Override // x7.g.n0
        public String n() {
            return "tref";
        }

        public void o(b1 b1Var) {
            this.f36466p = b1Var;
        }
    }

    public static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f36467o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Float f36468p;

        @Override // x7.g.n0
        public String n() {
            return "path";
        }
    }

    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public b1 f36469s;

        @Override // x7.g.x0
        public b1 d() {
            return this.f36469s;
        }

        @Override // x7.g.n0
        public String n() {
            return "tspan";
        }

        public void o(b1 b1Var) {
            this.f36469s = b1Var;
        }
    }

    public static class w implements x {
        public int b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36472d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f36470a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f36471c = new float[16];

        @Override // x7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f36471c;
            int i10 = this.f36472d;
            int i11 = i10 + 1;
            this.f36472d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f36472d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f36472d = i13;
            fArr[i12] = f12;
            this.f36472d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // x7.g.x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f36471c;
            int i10 = this.f36472d;
            int i11 = i10 + 1;
            this.f36472d = i11;
            fArr[i10] = f10;
            this.f36472d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // x7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f36471c;
            int i10 = this.f36472d;
            int i11 = i10 + 1;
            this.f36472d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f36472d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f36472d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f36472d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f36472d = i15;
            fArr[i14] = f14;
            this.f36472d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // x7.g.x
        public void close() {
            f((byte) 8);
        }

        @Override // x7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f36471c;
            int i10 = this.f36472d;
            int i11 = i10 + 1;
            this.f36472d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f36472d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f36472d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f36472d = i14;
            fArr[i13] = f13;
            this.f36472d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // x7.g.x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f36471c;
            int i10 = this.f36472d;
            int i11 = i10 + 1;
            this.f36472d = i11;
            fArr[i10] = f10;
            this.f36472d = i10 + 2;
            fArr[i11] = f11;
        }

        public final void f(byte b) {
            int i10 = this.b;
            byte[] bArr = this.f36470a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f36470a = bArr2;
            }
            byte[] bArr3 = this.f36470a;
            int i11 = this.b;
            this.b = i11 + 1;
            bArr3[i11] = b;
        }

        public final void g(int i10) {
            float[] fArr = this.f36471c;
            if (fArr.length < this.f36472d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f36471c = fArr2;
            }
        }

        public void h(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.b; i11++) {
                byte b = this.f36470a[i11];
                if (b == 0) {
                    float[] fArr = this.f36471c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.b(f10, fArr[i12]);
                } else if (b == 1) {
                    float[] fArr2 = this.f36471c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.e(f11, fArr2[i13]);
                } else if (b == 2) {
                    float[] fArr3 = this.f36471c;
                    xVar.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.f36471c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.a(f12, f13, f14, fArr4[i14]);
                } else if (b != 8) {
                    boolean z10 = (b & 2) != 0;
                    boolean z11 = (b & 1) != 0;
                    float[] fArr5 = this.f36471c;
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
        public Matrix f36473s;

        @Override // x7.g.n
        public void k(Matrix matrix) {
            this.f36473s = matrix;
        }

        @Override // x7.g.n0
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
        b1 d();
    }

    public static class y extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f36474q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f36475r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f36476s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f36477t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f36478u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p f36479v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p f36480w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f36481x;

        @Override // x7.g.n0
        public String n() {
            return "pattern";
        }
    }

    public static abstract class y0 extends h0 {
        @Override // x7.g.h0, x7.g.j0
        public void i(n0 n0Var) throws x7.j {
            if (n0Var instanceof x0) {
                this.f36398i.add(n0Var);
                return;
            }
            throw new x7.j("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    public static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f36482o;

        @Override // x7.g.n0
        public String n() {
            return "polyline";
        }
    }

    public static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f36483o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f36484p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public b1 f36485q;

        @Override // x7.g.x0
        public b1 d() {
            return this.f36485q;
        }

        @Override // x7.g.n0
        public String n() {
            return "textPath";
        }

        public void o(b1 b1Var) {
            this.f36485q = b1Var;
        }
    }

    public static x7.i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new x7.k().z(inputStream, f36295g);
    }

    public void a(x7.b.r rVar) {
        this.f36299e.b(rVar);
    }

    public void b() {
        this.f36299e.e(x7.b.u.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", BuildConfig.FLAVOR).replace("\\A", "\n");
    }

    public List<x7.b.p> d() {
        return this.f36299e.c();
    }

    public final b e(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fB;
        d1 d1Var5;
        f0 f0Var = this.f36296a;
        p pVar = f0Var.f36394s;
        p pVar2 = f0Var.f36395t;
        if (pVar == null || pVar.l() || (d1Var = pVar.b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = pVar.b(f10);
        if (pVar2 == null) {
            b bVar = this.f36296a.f36457p;
            fB = bVar != null ? (bVar.f36308d * fB2) / bVar.f36307c : fB2;
        } else {
            if (pVar2.l() || (d1Var5 = pVar2.b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = pVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float f() {
        if (this.f36296a != null) {
            return e(this.f36298d).f36308d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        f0 f0Var = this.f36296a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f36457p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f36296a != null) {
            return e(this.f36298d).f36307c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public l0 i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f36296a.f36423c)) {
            return this.f36296a;
        }
        if (this.f36300f.containsKey(str)) {
            return this.f36300f.get(str);
        }
        l0 l0VarJ = j(this.f36296a, str);
        this.f36300f.put(str, l0VarJ);
        return l0VarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l0 j(j0 j0Var, String str) {
        l0 l0VarJ;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f36423c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f36423c)) {
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
        return this.f36296a;
    }

    public boolean n() {
        return !this.f36299e.d();
    }

    public void o(Canvas canvas, x7.f fVar) {
        if (fVar == null) {
            fVar = new x7.f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new x7.h(canvas, this.f36298d).G0(this, fVar);
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
        this.f36297c = str;
    }

    public void r(String str) {
        f0 f0Var = this.f36296a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f36395t = x7.k.o0(str);
    }

    public void s(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f36296a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f36457p = new b(f10, f11, f12, f13);
    }

    public void t(String str) {
        f0 f0Var = this.f36296a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f36394s = x7.k.o0(str);
    }

    public void u(f0 f0Var) {
        this.f36296a = f0Var;
    }

    public void v(String str) {
        this.b = str;
    }

    public static class p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f36440a;
        public d1 b;

        public p(float f10, d1 d1Var) {
            this.f36440a = f10;
            this.b = d1Var;
        }

        public float a() {
            return this.f36440a;
        }

        public float b(float f10) {
            int i10 = a.f36301a[this.b.ordinal()];
            if (i10 == 1) {
                return this.f36440a;
            }
            switch (i10) {
                case 4:
                    return this.f36440a * f10;
                case 5:
                    return (this.f36440a * f10) / 2.54f;
                case 6:
                    return (this.f36440a * f10) / 25.4f;
                case 7:
                    return (this.f36440a * f10) / 72.0f;
                case 8:
                    return (this.f36440a * f10) / 6.0f;
                default:
                    return this.f36440a;
            }
        }

        public float c(x7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b bVarS = hVar.S();
            if (bVarS == null) {
                return this.f36440a;
            }
            float f10 = bVarS.f36307c;
            float f11 = bVarS.f36308d;
            if (f10 == f11) {
                return (this.f36440a * f10) / 100.0f;
            }
            return (this.f36440a * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        public float e(x7.h hVar, float f10) {
            return this.b == d1.percent ? (this.f36440a * f10) / 100.0f : f(hVar);
        }

        public float f(x7.h hVar) {
            switch (a.f36301a[this.b.ordinal()]) {
                case 1:
                    return this.f36440a;
                case 2:
                    return this.f36440a * hVar.Q();
                case 3:
                    return this.f36440a * hVar.R();
                case 4:
                    return this.f36440a * hVar.T();
                case 5:
                    return (this.f36440a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f36440a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f36440a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f36440a * hVar.T()) / 6.0f;
                case 9:
                    b bVarS = hVar.S();
                    return bVarS == null ? this.f36440a : (this.f36440a * bVarS.f36307c) / 100.0f;
                default:
                    return this.f36440a;
            }
        }

        public float i(x7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b bVarS = hVar.S();
            return bVarS == null ? this.f36440a : (this.f36440a * bVarS.f36308d) / 100.0f;
        }

        public boolean k() {
            return this.f36440a < 0.0f;
        }

        public boolean l() {
            return this.f36440a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f36440a) + this.b;
        }

        public p(float f10) {
            this.f36440a = f10;
            this.b = d1.px;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f36306a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f36308d;

        public b(float f10, float f11, float f12, float f13) {
            this.f36306a = f10;
            this.b = f11;
            this.f36307c = f12;
            this.f36308d = f13;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f36306a + this.f36307c;
        }

        public float c() {
            return this.b + this.f36308d;
        }

        public RectF d() {
            return new RectF(this.f36306a, this.b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f36306a;
            if (f10 < this.f36306a) {
                this.f36306a = f10;
            }
            float f11 = bVar.b;
            if (f11 < this.b) {
                this.b = f11;
            }
            if (bVar.b() > b()) {
                this.f36307c = bVar.b() - this.f36306a;
            }
            if (bVar.c() > c()) {
                this.f36308d = bVar.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.f36306a + " " + this.b + " " + this.f36307c + " " + this.f36308d + "]";
        }

        public b(b bVar) {
            this.f36306a = bVar.f36306a;
            this.b = bVar.b;
            this.f36307c = bVar.f36307c;
            this.f36308d = bVar.f36308d;
        }
    }
}
