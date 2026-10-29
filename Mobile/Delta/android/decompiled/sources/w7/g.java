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
    public static boolean f33805g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f33806a = null;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33807c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f33808d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w7.b.r f33809e = new w7.b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, l0> f33810f = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33811a;

        static {
            int[] iArr = new int[d1.values().length];
            f33811a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33811a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33811a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33811a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33811a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33811a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33811a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33811a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33811a[d1.percent.ordinal()] = 9;
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
        public List<p> f33812o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<p> f33813p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<p> f33814q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<p> f33815r;
    }

    public static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f33819o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33820p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33821q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33822r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f33823s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33824t;

        @Override // w7.g.n0
        public String n() {
            return "rect";
        }
    }

    public interface b1 {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f33825a;
        public p b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f33826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f33827d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f33825a = pVar;
            this.b = pVar2;
            this.f33826c = pVar3;
            this.f33827d = pVar4;
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
        public String f33828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b1 f33829d;

        public c1(String str) {
            this.f33828c = str;
        }

        @Override // w7.g.x0
        public b1 e() {
            return this.f33829d;
        }

        public String toString() {
            return "TextChild: '" + this.f33828c + "'";
        }
    }

    public static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f33830o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33831p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33832q;

        @Override // w7.g.n0
        public String n() {
            return "circle";
        }
    }

    public static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f33833h;

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
        public Boolean f33843p;

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
        public long f33844a = 0;
        public o0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f33845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f33846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o0 f33847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f33848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f33849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f33850h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f33851i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Float f33852j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public p[] f33853k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p f33854l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Float f33855m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public f f33856n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<String> f33857o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33858p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Integer f33859q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public b f33860r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public EnumC0620g f33861s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public h f33862t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public f f33863u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Boolean f33864v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public c f33865w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f33866x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f33867y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f33868z;

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
        public enum EnumC0620g {
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
            e0Var.f33844a = -1L;
            f fVar = f.b;
            e0Var.b = fVar;
            a aVar = a.NonZero;
            e0Var.f33845c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f33846d = fValueOf;
            e0Var.f33847e = null;
            e0Var.f33848f = fValueOf;
            e0Var.f33849g = new p(1.0f);
            e0Var.f33850h = c.Butt;
            e0Var.f33851i = d.Miter;
            e0Var.f33852j = Float.valueOf(4.0f);
            e0Var.f33853k = null;
            e0Var.f33854l = new p(0.0f);
            e0Var.f33855m = fValueOf;
            e0Var.f33856n = fVar;
            e0Var.f33857o = null;
            e0Var.f33858p = new p(12.0f, d1.pt);
            e0Var.f33859q = 400;
            e0Var.f33860r = b.Normal;
            e0Var.f33861s = EnumC0620g.None;
            e0Var.f33862t = h.LTR;
            e0Var.f33863u = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f33864v = bool;
            e0Var.f33865w = null;
            e0Var.f33866x = null;
            e0Var.f33867y = null;
            e0Var.f33868z = null;
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
            this.f33864v = bool;
            this.f33865w = null;
            this.E = null;
            this.f33855m = fValueOf;
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
            p[] pVarArr = this.f33853k;
            if (pVarArr != null) {
                e0Var.f33853k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    public static class e1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f33895p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33896q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33897r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f33898s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33899t;

        @Override // w7.g.m, w7.g.n0
        public String n() {
            return "use";
        }
    }

    public static class f extends o0 {
        public static final f b = new f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f33900c = new f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33901a;

        public f(int i10) {
            this.f33901a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f33901a));
        }
    }

    public static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33902q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33903r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f33904s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33905t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f33906u;

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
    public static class C0621g extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static C0621g f33907a = new C0621g();

        public static C0621g a() {
            return f33907a;
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
        public List<n0> f33908i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f33909j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f33910k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f33911l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f33912m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f33913n = null;

        @Override // w7.g.j0
        public void a(n0 n0Var) {
            this.f33908i.add(n0Var);
        }

        @Override // w7.g.g0
        public Set<String> b() {
            return null;
        }

        @Override // w7.g.g0
        public String c() {
            return this.f33910k;
        }

        @Override // w7.g.g0
        public void d(Set<String> set) {
            this.f33913n = set;
        }

        @Override // w7.g.g0
        public void f(Set<String> set) {
            this.f33909j = set;
        }

        @Override // w7.g.g0
        public Set<String> g() {
            return this.f33909j;
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return this.f33908i;
        }

        @Override // w7.g.g0
        public void h(Set<String> set) {
            this.f33911l = set;
        }

        @Override // w7.g.g0
        public void i(Set<String> set) {
            this.f33912m = set;
        }

        @Override // w7.g.g0
        public void j(String str) {
            this.f33910k = str;
        }

        @Override // w7.g.g0
        public Set<String> l() {
            return this.f33912m;
        }

        @Override // w7.g.g0
        public Set<String> m() {
            return this.f33913n;
        }
    }

    public static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f33914o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33915p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33916q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33917r;

        @Override // w7.g.n0
        public String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f33918i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f33919j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f33920k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f33921l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f33922m = null;

        @Override // w7.g.g0
        public Set<String> b() {
            return this.f33920k;
        }

        @Override // w7.g.g0
        public String c() {
            return this.f33919j;
        }

        @Override // w7.g.g0
        public void d(Set<String> set) {
            this.f33922m = set;
        }

        @Override // w7.g.g0
        public void f(Set<String> set) {
            this.f33918i = set;
        }

        @Override // w7.g.g0
        public Set<String> g() {
            return this.f33918i;
        }

        @Override // w7.g.g0
        public void h(Set<String> set) {
            this.f33920k = set;
        }

        @Override // w7.g.g0
        public void i(Set<String> set) {
            this.f33921l = set;
        }

        @Override // w7.g.g0
        public void j(String str) {
            this.f33919j = str;
        }

        @Override // w7.g.g0
        public Set<String> l() {
            return this.f33921l;
        }

        @Override // w7.g.g0
        public Set<String> m() {
            return this.f33922m;
        }
    }

    public static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<n0> f33923h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f33924i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f33925j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public k f33926k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f33927l;

        @Override // w7.g.j0
        public void a(n0 n0Var) throws w7.j {
            if (n0Var instanceof d0) {
                this.f33923h.add(n0Var);
                return;
            }
            throw new w7.j("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // w7.g.j0
        public List<n0> getChildren() {
            return this.f33923h;
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
        public b f33931h = null;
    }

    public static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f33932n;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33932n = matrix;
        }
    }

    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33933c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f33934d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e0 f33935e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e0 f33936f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f33937g = null;

        public String toString() {
            return n();
        }
    }

    public static class m extends h0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f33938o;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33938o = matrix;
        }

        @Override // w7.g.n0
        public String n() {
            return "group";
        }
    }

    public static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f33939m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f33940n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f33941o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33942p;

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
        public g f33943a;
        public j0 b;

        public String n() {
            return "";
        }
    }

    public static class o extends p0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f33944p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33945q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33946r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f33947s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33948t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f33949u;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33949u = matrix;
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
        public w7.e f33951o = null;
    }

    public static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f33952o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33953p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33954q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33955r;

        @Override // w7.g.n0
        public String n() {
            return "line";
        }
    }

    public static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p f33956m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f33957n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f33958o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33959p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33960q;

        @Override // w7.g.n0
        public String n() {
            return "radialGradient";
        }
    }

    public static class r extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f33961q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f33963s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33964t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f33965u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f33966v;

        @Override // w7.g.n0
        public String n() {
            return "marker";
        }
    }

    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f33967p;
    }

    public static class s extends h0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f33968o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f33969p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f33970q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f33971r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f33972s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33973t;

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
        public String f33974a;
        public o0 b;

        public u(String str, o0 o0Var) {
            this.f33974a = str;
            this.b = o0Var;
        }

        public String toString() {
            return this.f33974a + " " + this.b;
        }
    }

    public static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f33975o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b1 f33976p;

        @Override // w7.g.x0
        public b1 e() {
            return this.f33976p;
        }

        @Override // w7.g.n0
        public String n() {
            return "tref";
        }

        public void o(b1 b1Var) {
            this.f33976p = b1Var;
        }
    }

    public static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f33977o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Float f33978p;

        @Override // w7.g.n0
        public String n() {
            return "path";
        }
    }

    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public b1 f33979s;

        @Override // w7.g.x0
        public b1 e() {
            return this.f33979s;
        }

        @Override // w7.g.n0
        public String n() {
            return "tspan";
        }

        public void o(b1 b1Var) {
            this.f33979s = b1Var;
        }
    }

    public static class w implements x {
        public int b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f33982d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f33980a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f33981c = new float[16];

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f33981c;
            int i10 = this.f33982d;
            int i11 = i10 + 1;
            this.f33982d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f33982d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f33982d = i13;
            fArr[i12] = f12;
            this.f33982d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f33981c;
            int i10 = this.f33982d;
            int i11 = i10 + 1;
            this.f33982d = i11;
            fArr[i10] = f10;
            this.f33982d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f33981c;
            int i10 = this.f33982d;
            int i11 = i10 + 1;
            this.f33982d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f33982d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f33982d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f33982d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f33982d = i15;
            fArr[i14] = f14;
            this.f33982d = i10 + 6;
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
            float[] fArr = this.f33981c;
            int i10 = this.f33982d;
            int i11 = i10 + 1;
            this.f33982d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f33982d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f33982d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f33982d = i14;
            fArr[i13] = f13;
            this.f33982d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f33981c;
            int i10 = this.f33982d;
            int i11 = i10 + 1;
            this.f33982d = i11;
            fArr[i10] = f10;
            this.f33982d = i10 + 2;
            fArr[i11] = f11;
        }

        public final void f(byte b) {
            int i10 = this.b;
            byte[] bArr = this.f33980a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f33980a = bArr2;
            }
            byte[] bArr3 = this.f33980a;
            int i11 = this.b;
            this.b = i11 + 1;
            bArr3[i11] = b;
        }

        public final void g(int i10) {
            float[] fArr = this.f33981c;
            if (fArr.length < this.f33982d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f33981c = fArr2;
            }
        }

        public void h(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.b; i11++) {
                byte b = this.f33980a[i11];
                if (b == 0) {
                    float[] fArr = this.f33981c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.b(f10, fArr[i12]);
                } else if (b == 1) {
                    float[] fArr2 = this.f33981c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.e(f11, fArr2[i13]);
                } else if (b == 2) {
                    float[] fArr3 = this.f33981c;
                    xVar.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.f33981c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.a(f12, f13, f14, fArr4[i14]);
                } else if (b != 8) {
                    boolean z10 = (b & 2) != 0;
                    boolean z11 = (b & 1) != 0;
                    float[] fArr5 = this.f33981c;
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
        public Matrix f33983s;

        @Override // w7.g.n
        public void k(Matrix matrix) {
            this.f33983s = matrix;
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
        public Boolean f33984q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f33985r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f33986s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f33987t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f33988u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p f33989v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p f33990w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f33991x;

        @Override // w7.g.n0
        public String n() {
            return "pattern";
        }
    }

    public static abstract class y0 extends h0 {
        @Override // w7.g.h0, w7.g.j0
        public void a(n0 n0Var) throws w7.j {
            if (n0Var instanceof x0) {
                this.f33908i.add(n0Var);
                return;
            }
            throw new w7.j("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    public static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f33992o;

        @Override // w7.g.n0
        public String n() {
            return "polyline";
        }
    }

    public static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f33993o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f33994p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public b1 f33995q;

        @Override // w7.g.x0
        public b1 e() {
            return this.f33995q;
        }

        @Override // w7.g.n0
        public String n() {
            return "textPath";
        }

        public void o(b1 b1Var) {
            this.f33995q = b1Var;
        }
    }

    public static w7.i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new w7.k().z(inputStream, f33805g);
    }

    public void a(w7.b.r rVar) {
        this.f33809e.b(rVar);
    }

    public void b() {
        this.f33809e.e(w7.b.u.RenderOptions);
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
        return this.f33809e.c();
    }

    public final b e(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fB;
        d1 d1Var5;
        f0 f0Var = this.f33806a;
        p pVar = f0Var.f33904s;
        p pVar2 = f0Var.f33905t;
        if (pVar == null || pVar.j() || (d1Var = pVar.b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = pVar.b(f10);
        if (pVar2 == null) {
            b bVar = this.f33806a.f33967p;
            fB = bVar != null ? (bVar.f33818d * fB2) / bVar.f33817c : fB2;
        } else {
            if (pVar2.j() || (d1Var5 = pVar2.b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = pVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float f() {
        if (this.f33806a != null) {
            return e(this.f33808d).f33818d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        f0 f0Var = this.f33806a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f33967p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f33806a != null) {
            return e(this.f33808d).f33817c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public l0 i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f33806a.f33933c)) {
            return this.f33806a;
        }
        if (this.f33810f.containsKey(str)) {
            return this.f33810f.get(str);
        }
        l0 l0VarJ = j(this.f33806a, str);
        this.f33810f.put(str, l0VarJ);
        return l0VarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l0 j(j0 j0Var, String str) {
        l0 l0VarJ;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f33933c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f33933c)) {
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
        return this.f33806a;
    }

    public boolean n() {
        return !this.f33809e.d();
    }

    public void o(Canvas canvas, w7.f fVar) {
        if (fVar == null) {
            fVar = new w7.f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new w7.h(canvas, this.f33808d).G0(this, fVar);
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
        this.f33807c = str;
    }

    public void r(String str) {
        f0 f0Var = this.f33806a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f33905t = w7.k.o0(str);
    }

    public void s(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f33806a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f33967p = new b(f10, f11, f12, f13);
    }

    public void t(String str) {
        f0 f0Var = this.f33806a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f33904s = w7.k.o0(str);
    }

    public void u(f0 f0Var) {
        this.f33806a = f0Var;
    }

    public void v(String str) {
        this.b = str;
    }

    public static class p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f33950a;
        public d1 b;

        public p(float f10, d1 d1Var) {
            this.f33950a = f10;
            this.b = d1Var;
        }

        public float a() {
            return this.f33950a;
        }

        public float b(float f10) {
            int i10 = a.f33811a[this.b.ordinal()];
            if (i10 == 1) {
                return this.f33950a;
            }
            switch (i10) {
                case 4:
                    return this.f33950a * f10;
                case 5:
                    return (this.f33950a * f10) / 2.54f;
                case 6:
                    return (this.f33950a * f10) / 25.4f;
                case 7:
                    return (this.f33950a * f10) / 72.0f;
                case 8:
                    return (this.f33950a * f10) / 6.0f;
                default:
                    return this.f33950a;
            }
        }

        public float c(w7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b bVarS = hVar.S();
            if (bVarS == null) {
                return this.f33950a;
            }
            float f10 = bVarS.f33817c;
            float f11 = bVarS.f33818d;
            if (f10 == f11) {
                return (this.f33950a * f10) / 100.0f;
            }
            return (this.f33950a * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        public float e(w7.h hVar, float f10) {
            return this.b == d1.percent ? (this.f33950a * f10) / 100.0f : f(hVar);
        }

        public float f(w7.h hVar) {
            switch (a.f33811a[this.b.ordinal()]) {
                case 1:
                    return this.f33950a;
                case 2:
                    return this.f33950a * hVar.Q();
                case 3:
                    return this.f33950a * hVar.R();
                case 4:
                    return this.f33950a * hVar.T();
                case 5:
                    return (this.f33950a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f33950a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f33950a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f33950a * hVar.T()) / 6.0f;
                case 9:
                    b bVarS = hVar.S();
                    return bVarS == null ? this.f33950a : (this.f33950a * bVarS.f33817c) / 100.0f;
                default:
                    return this.f33950a;
            }
        }

        public float h(w7.h hVar) {
            if (this.b != d1.percent) {
                return f(hVar);
            }
            b bVarS = hVar.S();
            return bVarS == null ? this.f33950a : (this.f33950a * bVarS.f33818d) / 100.0f;
        }

        public boolean i() {
            return this.f33950a < 0.0f;
        }

        public boolean j() {
            return this.f33950a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f33950a) + this.b;
        }

        public p(float f10) {
            this.f33950a = f10;
            this.b = d1.px;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f33816a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f33817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f33818d;

        public b(float f10, float f11, float f12, float f13) {
            this.f33816a = f10;
            this.b = f11;
            this.f33817c = f12;
            this.f33818d = f13;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f33816a + this.f33817c;
        }

        public float c() {
            return this.b + this.f33818d;
        }

        public RectF d() {
            return new RectF(this.f33816a, this.b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f33816a;
            if (f10 < this.f33816a) {
                this.f33816a = f10;
            }
            float f11 = bVar.b;
            if (f11 < this.b) {
                this.b = f11;
            }
            if (bVar.b() > b()) {
                this.f33817c = bVar.b() - this.f33816a;
            }
            if (bVar.c() > c()) {
                this.f33818d = bVar.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.f33816a + " " + this.b + " " + this.f33817c + " " + this.f33818d + "]";
        }

        public b(b bVar) {
            this.f33816a = bVar.f33816a;
            this.b = bVar.b;
            this.f33817c = bVar.f33817c;
            this.f33818d = bVar.f33818d;
        }
    }
}
