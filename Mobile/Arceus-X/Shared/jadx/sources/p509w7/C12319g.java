package p509w7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: w7.g */
/* JADX INFO: loaded from: classes.dex */
public class C12319g {

    /* JADX INFO: renamed from: g */
    public static boolean f43746g = true;

    /* JADX INFO: renamed from: a */
    public f0 f43747a = null;

    /* JADX INFO: renamed from: b */
    public String f43748b = "";

    /* JADX INFO: renamed from: c */
    public String f43749c = "";

    /* JADX INFO: renamed from: d */
    public float f43750d = 96.0f;

    /* JADX INFO: renamed from: e */
    public C12314b.r f43751e = new C12314b.r();

    /* JADX INFO: renamed from: f */
    public Map<String, l0> f43752f = new HashMap();

    /* JADX INFO: renamed from: w7.g$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43753a;

        static {
            int[] iArr = new int[d1.values().length];
            f43753a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43753a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43753a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43753a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43753a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43753a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43753a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43753a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43753a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: w7.g$a0 */
    public static class a0 extends z {
        @Override // p509w7.C12319g.z, p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "polygon";
        }
    }

    /* JADX INFO: renamed from: w7.g$a1 */
    public static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: o */
        public List<p> f43754o;

        /* JADX INFO: renamed from: p */
        public List<p> f43755p;

        /* JADX INFO: renamed from: q */
        public List<p> f43756q;

        /* JADX INFO: renamed from: r */
        public List<p> f43757r;
    }

    /* JADX INFO: renamed from: w7.g$b0 */
    public static class b0 extends l {

        /* JADX INFO: renamed from: o */
        public p f43762o;

        /* JADX INFO: renamed from: p */
        public p f43763p;

        /* JADX INFO: renamed from: q */
        public p f43764q;

        /* JADX INFO: renamed from: r */
        public p f43765r;

        /* JADX INFO: renamed from: s */
        public p f43766s;

        /* JADX INFO: renamed from: t */
        public p f43767t;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "rect";
        }
    }

    /* JADX INFO: renamed from: w7.g$b1 */
    public interface b1 {
    }

    /* JADX INFO: renamed from: w7.g$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public p f43768a;

        /* JADX INFO: renamed from: b */
        public p f43769b;

        /* JADX INFO: renamed from: c */
        public p f43770c;

        /* JADX INFO: renamed from: d */
        public p f43771d;

        public c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f43768a = pVar;
            this.f43769b = pVar2;
            this.f43770c = pVar3;
            this.f43771d = pVar4;
        }
    }

    /* JADX INFO: renamed from: w7.g$c0 */
    public static class c0 extends l0 implements j0 {
        @Override // p509w7.C12319g.j0
        /* JADX INFO: renamed from: a */
        public void mo45868a(n0 n0Var) {
        }

        @Override // p509w7.C12319g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "solidColor";
        }
    }

    /* JADX INFO: renamed from: w7.g$c1 */
    public static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c */
        public String f43772c;

        /* JADX INFO: renamed from: d */
        public b1 f43773d;

        public c1(String str) {
            this.f43772c = str;
        }

        @Override // p509w7.C12319g.x0
        /* JADX INFO: renamed from: e */
        public b1 mo45869e() {
            return this.f43773d;
        }

        public String toString() {
            return "TextChild: '" + this.f43772c + "'";
        }
    }

    /* JADX INFO: renamed from: w7.g$d */
    public static class d extends l {

        /* JADX INFO: renamed from: o */
        public p f43774o;

        /* JADX INFO: renamed from: p */
        public p f43775p;

        /* JADX INFO: renamed from: q */
        public p f43776q;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "circle";
        }
    }

    /* JADX INFO: renamed from: w7.g$d0 */
    public static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h */
        public Float f43777h;

        @Override // p509w7.C12319g.j0
        /* JADX INFO: renamed from: a */
        public void mo45868a(n0 n0Var) {
        }

        @Override // p509w7.C12319g.j0
        public List<n0> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "stop";
        }
    }

    /* JADX INFO: renamed from: w7.g$d1 */
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

    /* JADX INFO: renamed from: w7.g$e */
    public static class e extends m implements t {

        /* JADX INFO: renamed from: p */
        public Boolean f43788p;

        @Override // p509w7.C12319g.m, p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "clipPath";
        }
    }

    /* JADX INFO: renamed from: w7.g$e0 */
    public static class e0 implements Cloneable {

        /* JADX INFO: renamed from: A */
        public Boolean f43789A;

        /* JADX INFO: renamed from: B */
        public Boolean f43790B;

        /* JADX INFO: renamed from: C */
        public o0 f43791C;

        /* JADX INFO: renamed from: D */
        public Float f43792D;

        /* JADX INFO: renamed from: E */
        public String f43793E;

        /* JADX INFO: renamed from: F */
        public a f43794F;

        /* JADX INFO: renamed from: G */
        public String f43795G;

        /* JADX INFO: renamed from: H */
        public o0 f43796H;

        /* JADX INFO: renamed from: I */
        public Float f43797I;

        /* JADX INFO: renamed from: J */
        public o0 f43798J;

        /* JADX INFO: renamed from: K */
        public Float f43799K;

        /* JADX INFO: renamed from: L */
        public i f43800L;

        /* JADX INFO: renamed from: M */
        public e f43801M;

        /* JADX INFO: renamed from: a */
        public long f43802a = 0;

        /* JADX INFO: renamed from: b */
        public o0 f43803b;

        /* JADX INFO: renamed from: c */
        public a f43804c;

        /* JADX INFO: renamed from: d */
        public Float f43805d;

        /* JADX INFO: renamed from: e */
        public o0 f43806e;

        /* JADX INFO: renamed from: f */
        public Float f43807f;

        /* JADX INFO: renamed from: g */
        public p f43808g;

        /* JADX INFO: renamed from: h */
        public c f43809h;

        /* JADX INFO: renamed from: i */
        public d f43810i;

        /* JADX INFO: renamed from: j */
        public Float f43811j;

        /* JADX INFO: renamed from: k */
        public p[] f43812k;

        /* JADX INFO: renamed from: l */
        public p f43813l;

        /* JADX INFO: renamed from: m */
        public Float f43814m;

        /* JADX INFO: renamed from: n */
        public f f43815n;

        /* JADX INFO: renamed from: o */
        public List<String> f43816o;

        /* JADX INFO: renamed from: p */
        public p f43817p;

        /* JADX INFO: renamed from: q */
        public Integer f43818q;

        /* JADX INFO: renamed from: r */
        public b f43819r;

        /* JADX INFO: renamed from: s */
        public g f43820s;

        /* JADX INFO: renamed from: t */
        public h f43821t;

        /* JADX INFO: renamed from: u */
        public f f43822u;

        /* JADX INFO: renamed from: v */
        public Boolean f43823v;

        /* JADX INFO: renamed from: w */
        public c f43824w;

        /* JADX INFO: renamed from: x */
        public String f43825x;

        /* JADX INFO: renamed from: y */
        public String f43826y;

        /* JADX INFO: renamed from: z */
        public String f43827z;

        /* JADX INFO: renamed from: w7.g$e0$a */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* JADX INFO: renamed from: w7.g$e0$b */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* JADX INFO: renamed from: w7.g$e0$c */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* JADX INFO: renamed from: w7.g$e0$d */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* JADX INFO: renamed from: w7.g$e0$e */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* JADX INFO: renamed from: w7.g$e0$f */
        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: w7.g$e0$g */
        public enum g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* JADX INFO: renamed from: w7.g$e0$h */
        public enum h {
            LTR,
            RTL
        }

        /* JADX INFO: renamed from: w7.g$e0$i */
        public enum i {
            None,
            NonScalingStroke
        }

        /* JADX INFO: renamed from: a */
        public static e0 m45870a() {
            e0 e0Var = new e0();
            e0Var.f43802a = -1L;
            f fVar = f.f43868b;
            e0Var.f43803b = fVar;
            a aVar = a.NonZero;
            e0Var.f43804c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f43805d = fValueOf;
            e0Var.f43806e = null;
            e0Var.f43807f = fValueOf;
            e0Var.f43808g = new p(1.0f);
            e0Var.f43809h = c.Butt;
            e0Var.f43810i = d.Miter;
            e0Var.f43811j = Float.valueOf(4.0f);
            e0Var.f43812k = null;
            e0Var.f43813l = new p(0.0f);
            e0Var.f43814m = fValueOf;
            e0Var.f43815n = fVar;
            e0Var.f43816o = null;
            e0Var.f43817p = new p(12.0f, d1.pt);
            e0Var.f43818q = 400;
            e0Var.f43819r = b.Normal;
            e0Var.f43820s = g.None;
            e0Var.f43821t = h.LTR;
            e0Var.f43822u = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f43823v = bool;
            e0Var.f43824w = null;
            e0Var.f43825x = null;
            e0Var.f43826y = null;
            e0Var.f43827z = null;
            e0Var.f43789A = bool;
            e0Var.f43790B = bool;
            e0Var.f43791C = fVar;
            e0Var.f43792D = fValueOf;
            e0Var.f43793E = null;
            e0Var.f43794F = aVar;
            e0Var.f43795G = null;
            e0Var.f43796H = null;
            e0Var.f43797I = fValueOf;
            e0Var.f43798J = null;
            e0Var.f43799K = fValueOf;
            e0Var.f43800L = i.None;
            e0Var.f43801M = e.auto;
            return e0Var;
        }

        /* JADX INFO: renamed from: b */
        public void m45871b(boolean z10) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f43789A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f43823v = bool;
            this.f43824w = null;
            this.f43793E = null;
            this.f43814m = fValueOf;
            this.f43791C = f.f43868b;
            this.f43792D = fValueOf;
            this.f43795G = null;
            this.f43796H = null;
            this.f43797I = fValueOf;
            this.f43798J = null;
            this.f43799K = fValueOf;
            this.f43800L = i.None;
        }

        public Object clone() {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f43812k;
            if (pVarArr != null) {
                e0Var.f43812k = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    /* JADX INFO: renamed from: w7.g$e1 */
    public static class e1 extends m {

        /* JADX INFO: renamed from: p */
        public String f43863p;

        /* JADX INFO: renamed from: q */
        public p f43864q;

        /* JADX INFO: renamed from: r */
        public p f43865r;

        /* JADX INFO: renamed from: s */
        public p f43866s;

        /* JADX INFO: renamed from: t */
        public p f43867t;

        @Override // p509w7.C12319g.m, p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: w7.g$f */
    public static class f extends o0 {

        /* JADX INFO: renamed from: b */
        public static final f f43868b = new f(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: c */
        public static final f f43869c = new f(0);

        /* JADX INFO: renamed from: a */
        public int f43870a;

        public f(int i10) {
            this.f43870a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f43870a));
        }
    }

    /* JADX INFO: renamed from: w7.g$f0 */
    public static class f0 extends r0 {

        /* JADX INFO: renamed from: q */
        public p f43871q;

        /* JADX INFO: renamed from: r */
        public p f43872r;

        /* JADX INFO: renamed from: s */
        public p f43873s;

        /* JADX INFO: renamed from: t */
        public p f43874t;

        /* JADX INFO: renamed from: u */
        public String f43875u;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "svg";
        }
    }

    /* JADX INFO: renamed from: w7.g$f1 */
    public static class f1 extends r0 implements t {
        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: w7.g$g */
    public static class g extends o0 {

        /* JADX INFO: renamed from: a */
        public static g f43876a = new g();

        /* JADX INFO: renamed from: a */
        public static g m45872a() {
            return f43876a;
        }
    }

    /* JADX INFO: renamed from: w7.g$g0 */
    public interface g0 {
        /* JADX INFO: renamed from: b */
        Set<String> mo45873b();

        /* JADX INFO: renamed from: c */
        String mo45874c();

        /* JADX INFO: renamed from: d */
        void mo45875d(Set<String> set);

        /* JADX INFO: renamed from: f */
        void mo45876f(Set<String> set);

        /* JADX INFO: renamed from: g */
        Set<String> mo45877g();

        /* JADX INFO: renamed from: h */
        void mo45878h(Set<String> set);

        /* JADX INFO: renamed from: i */
        void mo45879i(Set<String> set);

        /* JADX INFO: renamed from: j */
        void mo45880j(String str);

        /* JADX INFO: renamed from: l */
        Set<String> mo45881l();

        /* JADX INFO: renamed from: m */
        Set<String> mo45882m();
    }

    /* JADX INFO: renamed from: w7.g$h */
    public static class h extends m implements t {
        @Override // p509w7.C12319g.m, p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: w7.g$h0 */
    public static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i */
        public List<n0> f43877i = new ArrayList();

        /* JADX INFO: renamed from: j */
        public Set<String> f43878j = null;

        /* JADX INFO: renamed from: k */
        public String f43879k = null;

        /* JADX INFO: renamed from: l */
        public Set<String> f43880l = null;

        /* JADX INFO: renamed from: m */
        public Set<String> f43881m = null;

        /* JADX INFO: renamed from: n */
        public Set<String> f43882n = null;

        @Override // p509w7.C12319g.j0
        /* JADX INFO: renamed from: a */
        public void mo45868a(n0 n0Var) {
            this.f43877i.add(n0Var);
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: b */
        public Set<String> mo45873b() {
            return null;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: c */
        public String mo45874c() {
            return this.f43879k;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: d */
        public void mo45875d(Set<String> set) {
            this.f43882n = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: f */
        public void mo45876f(Set<String> set) {
            this.f43878j = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: g */
        public Set<String> mo45877g() {
            return this.f43878j;
        }

        @Override // p509w7.C12319g.j0
        public List<n0> getChildren() {
            return this.f43877i;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: h */
        public void mo45878h(Set<String> set) {
            this.f43880l = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: i */
        public void mo45879i(Set<String> set) {
            this.f43881m = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: j */
        public void mo45880j(String str) {
            this.f43879k = str;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: l */
        public Set<String> mo45881l() {
            return this.f43881m;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: m */
        public Set<String> mo45882m() {
            return this.f43882n;
        }
    }

    /* JADX INFO: renamed from: w7.g$i */
    public static class i extends l {

        /* JADX INFO: renamed from: o */
        public p f43883o;

        /* JADX INFO: renamed from: p */
        public p f43884p;

        /* JADX INFO: renamed from: q */
        public p f43885q;

        /* JADX INFO: renamed from: r */
        public p f43886r;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: w7.g$i0 */
    public static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i */
        public Set<String> f43887i = null;

        /* JADX INFO: renamed from: j */
        public String f43888j = null;

        /* JADX INFO: renamed from: k */
        public Set<String> f43889k = null;

        /* JADX INFO: renamed from: l */
        public Set<String> f43890l = null;

        /* JADX INFO: renamed from: m */
        public Set<String> f43891m = null;

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: b */
        public Set<String> mo45873b() {
            return this.f43889k;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: c */
        public String mo45874c() {
            return this.f43888j;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: d */
        public void mo45875d(Set<String> set) {
            this.f43891m = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: f */
        public void mo45876f(Set<String> set) {
            this.f43887i = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: g */
        public Set<String> mo45877g() {
            return this.f43887i;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: h */
        public void mo45878h(Set<String> set) {
            this.f43889k = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: i */
        public void mo45879i(Set<String> set) {
            this.f43890l = set;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: j */
        public void mo45880j(String str) {
            this.f43888j = str;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: l */
        public Set<String> mo45881l() {
            return this.f43890l;
        }

        @Override // p509w7.C12319g.g0
        /* JADX INFO: renamed from: m */
        public Set<String> mo45882m() {
            return this.f43891m;
        }
    }

    /* JADX INFO: renamed from: w7.g$j */
    public static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h */
        public List<n0> f43892h = new ArrayList();

        /* JADX INFO: renamed from: i */
        public Boolean f43893i;

        /* JADX INFO: renamed from: j */
        public Matrix f43894j;

        /* JADX INFO: renamed from: k */
        public k f43895k;

        /* JADX INFO: renamed from: l */
        public String f43896l;

        @Override // p509w7.C12319g.j0
        /* JADX INFO: renamed from: a */
        public void mo45868a(n0 n0Var) throws C12322j {
            if (n0Var instanceof d0) {
                this.f43892h.add(n0Var);
                return;
            }
            throw new C12322j("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // p509w7.C12319g.j0
        public List<n0> getChildren() {
            return this.f43892h;
        }
    }

    /* JADX INFO: renamed from: w7.g$j0 */
    public interface j0 {
        /* JADX INFO: renamed from: a */
        void mo45868a(n0 n0Var);

        List<n0> getChildren();
    }

    /* JADX INFO: renamed from: w7.g$k */
    public enum k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: renamed from: w7.g$k0 */
    public static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h */
        public b f43901h = null;
    }

    /* JADX INFO: renamed from: w7.g$l */
    public static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n */
        public Matrix f43902n;

        @Override // p509w7.C12319g.n
        /* JADX INFO: renamed from: k */
        public void mo45883k(Matrix matrix) {
            this.f43902n = matrix;
        }
    }

    /* JADX INFO: renamed from: w7.g$l0 */
    public static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c */
        public String f43903c = null;

        /* JADX INFO: renamed from: d */
        public Boolean f43904d = null;

        /* JADX INFO: renamed from: e */
        public e0 f43905e = null;

        /* JADX INFO: renamed from: f */
        public e0 f43906f = null;

        /* JADX INFO: renamed from: g */
        public List<String> f43907g = null;

        public String toString() {
            return mo45862n();
        }
    }

    /* JADX INFO: renamed from: w7.g$m */
    public static class m extends h0 implements n {

        /* JADX INFO: renamed from: o */
        public Matrix f43908o;

        @Override // p509w7.C12319g.n
        /* JADX INFO: renamed from: k */
        public void mo45883k(Matrix matrix) {
            this.f43908o = matrix;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: w7.g$m0 */
    public static class m0 extends j {

        /* JADX INFO: renamed from: m */
        public p f43909m;

        /* JADX INFO: renamed from: n */
        public p f43910n;

        /* JADX INFO: renamed from: o */
        public p f43911o;

        /* JADX INFO: renamed from: p */
        public p f43912p;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "linearGradient";
        }
    }

    /* JADX INFO: renamed from: w7.g$n */
    public interface n {
        /* JADX INFO: renamed from: k */
        void mo45883k(Matrix matrix);
    }

    /* JADX INFO: renamed from: w7.g$n0 */
    public static class n0 {

        /* JADX INFO: renamed from: a */
        public C12319g f43913a;

        /* JADX INFO: renamed from: b */
        public j0 f43914b;

        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "";
        }
    }

    /* JADX INFO: renamed from: w7.g$o */
    public static class o extends p0 implements n {

        /* JADX INFO: renamed from: p */
        public String f43915p;

        /* JADX INFO: renamed from: q */
        public p f43916q;

        /* JADX INFO: renamed from: r */
        public p f43917r;

        /* JADX INFO: renamed from: s */
        public p f43918s;

        /* JADX INFO: renamed from: t */
        public p f43919t;

        /* JADX INFO: renamed from: u */
        public Matrix f43920u;

        @Override // p509w7.C12319g.n
        /* JADX INFO: renamed from: k */
        public void mo45883k(Matrix matrix) {
            this.f43920u = matrix;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: w7.g$o0 */
    public static abstract class o0 implements Cloneable {
    }

    /* JADX INFO: renamed from: w7.g$p0 */
    public static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: o */
        public C12317e f43923o = null;
    }

    /* JADX INFO: renamed from: w7.g$q */
    public static class q extends l {

        /* JADX INFO: renamed from: o */
        public p f43924o;

        /* JADX INFO: renamed from: p */
        public p f43925p;

        /* JADX INFO: renamed from: q */
        public p f43926q;

        /* JADX INFO: renamed from: r */
        public p f43927r;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: w7.g$q0 */
    public static class q0 extends j {

        /* JADX INFO: renamed from: m */
        public p f43928m;

        /* JADX INFO: renamed from: n */
        public p f43929n;

        /* JADX INFO: renamed from: o */
        public p f43930o;

        /* JADX INFO: renamed from: p */
        public p f43931p;

        /* JADX INFO: renamed from: q */
        public p f43932q;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "radialGradient";
        }
    }

    /* JADX INFO: renamed from: w7.g$r */
    public static class r extends r0 implements t {

        /* JADX INFO: renamed from: q */
        public boolean f43933q;

        /* JADX INFO: renamed from: r */
        public p f43934r;

        /* JADX INFO: renamed from: s */
        public p f43935s;

        /* JADX INFO: renamed from: t */
        public p f43936t;

        /* JADX INFO: renamed from: u */
        public p f43937u;

        /* JADX INFO: renamed from: v */
        public Float f43938v;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: w7.g$r0 */
    public static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p */
        public b f43939p;
    }

    /* JADX INFO: renamed from: w7.g$s */
    public static class s extends h0 implements t {

        /* JADX INFO: renamed from: o */
        public Boolean f43940o;

        /* JADX INFO: renamed from: p */
        public Boolean f43941p;

        /* JADX INFO: renamed from: q */
        public p f43942q;

        /* JADX INFO: renamed from: r */
        public p f43943r;

        /* JADX INFO: renamed from: s */
        public p f43944s;

        /* JADX INFO: renamed from: t */
        public p f43945t;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: w7.g$s0 */
    public static class s0 extends m {
        @Override // p509w7.C12319g.m, p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "switch";
        }
    }

    /* JADX INFO: renamed from: w7.g$t */
    public interface t {
    }

    /* JADX INFO: renamed from: w7.g$t0 */
    public static class t0 extends r0 implements t {
        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "symbol";
        }
    }

    /* JADX INFO: renamed from: w7.g$u */
    public static class u extends o0 {

        /* JADX INFO: renamed from: a */
        public String f43946a;

        /* JADX INFO: renamed from: b */
        public o0 f43947b;

        public u(String str, o0 o0Var) {
            this.f43946a = str;
            this.f43947b = o0Var;
        }

        public String toString() {
            return this.f43946a + " " + this.f43947b;
        }
    }

    /* JADX INFO: renamed from: w7.g$u0 */
    public static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o */
        public String f43948o;

        /* JADX INFO: renamed from: p */
        public b1 f43949p;

        @Override // p509w7.C12319g.x0
        /* JADX INFO: renamed from: e */
        public b1 mo45869e() {
            return this.f43949p;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "tref";
        }

        /* JADX INFO: renamed from: o */
        public void m45892o(b1 b1Var) {
            this.f43949p = b1Var;
        }
    }

    /* JADX INFO: renamed from: w7.g$v */
    public static class v extends l {

        /* JADX INFO: renamed from: o */
        public w f43950o;

        /* JADX INFO: renamed from: p */
        public Float f43951p;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: w7.g$v0 */
    public static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s */
        public b1 f43952s;

        @Override // p509w7.C12319g.x0
        /* JADX INFO: renamed from: e */
        public b1 mo45869e() {
            return this.f43952s;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "tspan";
        }

        /* JADX INFO: renamed from: o */
        public void m45893o(b1 b1Var) {
            this.f43952s = b1Var;
        }
    }

    /* JADX INFO: renamed from: w7.g$w */
    public static class w implements x {

        /* JADX INFO: renamed from: b */
        public int f43954b = 0;

        /* JADX INFO: renamed from: d */
        public int f43956d = 0;

        /* JADX INFO: renamed from: a */
        public byte[] f43953a = new byte[8];

        /* JADX INFO: renamed from: c */
        public float[] f43955c = new float[16];

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: a */
        public void mo45894a(float f10, float f11, float f12, float f13) {
            m45899f((byte) 3);
            m45900g(4);
            float[] fArr = this.f43955c;
            int i10 = this.f43956d;
            int i11 = i10 + 1;
            this.f43956d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f43956d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f43956d = i13;
            fArr[i12] = f12;
            this.f43956d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: b */
        public void mo45895b(float f10, float f11) {
            m45899f((byte) 0);
            m45900g(2);
            float[] fArr = this.f43955c;
            int i10 = this.f43956d;
            int i11 = i10 + 1;
            this.f43956d = i11;
            fArr[i10] = f10;
            this.f43956d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: c */
        public void mo45896c(float f10, float f11, float f12, float f13, float f14, float f15) {
            m45899f((byte) 2);
            m45900g(6);
            float[] fArr = this.f43955c;
            int i10 = this.f43956d;
            int i11 = i10 + 1;
            this.f43956d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f43956d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f43956d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f43956d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f43956d = i15;
            fArr[i14] = f14;
            this.f43956d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // p509w7.C12319g.x
        public void close() {
            m45899f((byte) 8);
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: d */
        public void mo45897d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            m45899f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            m45900g(5);
            float[] fArr = this.f43955c;
            int i10 = this.f43956d;
            int i11 = i10 + 1;
            this.f43956d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f43956d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f43956d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f43956d = i14;
            fArr[i13] = f13;
            this.f43956d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: e */
        public void mo45898e(float f10, float f11) {
            m45899f((byte) 1);
            m45900g(2);
            float[] fArr = this.f43955c;
            int i10 = this.f43956d;
            int i11 = i10 + 1;
            this.f43956d = i11;
            fArr[i10] = f10;
            this.f43956d = i10 + 2;
            fArr[i11] = f11;
        }

        /* JADX INFO: renamed from: f */
        public final void m45899f(byte b) {
            int i10 = this.f43954b;
            byte[] bArr = this.f43953a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f43953a = bArr2;
            }
            byte[] bArr3 = this.f43953a;
            int i11 = this.f43954b;
            this.f43954b = i11 + 1;
            bArr3[i11] = b;
        }

        /* JADX INFO: renamed from: g */
        public final void m45900g(int i10) {
            float[] fArr = this.f43955c;
            if (fArr.length < this.f43956d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f43955c = fArr2;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m45901h(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f43954b; i11++) {
                byte b = this.f43953a[i11];
                if (b == 0) {
                    float[] fArr = this.f43955c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.mo45895b(f10, fArr[i12]);
                } else if (b == 1) {
                    float[] fArr2 = this.f43955c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.mo45898e(f11, fArr2[i13]);
                } else if (b == 2) {
                    float[] fArr3 = this.f43955c;
                    xVar.mo45896c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.f43955c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.mo45894a(f12, f13, f14, fArr4[i14]);
                } else if (b != 8) {
                    boolean z10 = (b & 2) != 0;
                    boolean z11 = (b & 1) != 0;
                    float[] fArr5 = this.f43955c;
                    xVar.mo45897d(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    xVar.close();
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public boolean m45902i() {
            return this.f43954b == 0;
        }
    }

    /* JADX INFO: renamed from: w7.g$w0 */
    public static class w0 extends a1 implements b1, n {

        /* JADX INFO: renamed from: s */
        public Matrix f43957s;

        @Override // p509w7.C12319g.n
        /* JADX INFO: renamed from: k */
        public void mo45883k(Matrix matrix) {
            this.f43957s = matrix;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return Text.type;
        }
    }

    /* JADX INFO: renamed from: w7.g$x */
    public interface x {
        /* JADX INFO: renamed from: a */
        void mo45894a(float f10, float f11, float f12, float f13);

        /* JADX INFO: renamed from: b */
        void mo45895b(float f10, float f11);

        /* JADX INFO: renamed from: c */
        void mo45896c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        /* JADX INFO: renamed from: d */
        void mo45897d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        /* JADX INFO: renamed from: e */
        void mo45898e(float f10, float f11);
    }

    /* JADX INFO: renamed from: w7.g$x0 */
    public interface x0 {
        /* JADX INFO: renamed from: e */
        b1 mo45869e();
    }

    /* JADX INFO: renamed from: w7.g$y */
    public static class y extends r0 implements t {

        /* JADX INFO: renamed from: q */
        public Boolean f43958q;

        /* JADX INFO: renamed from: r */
        public Boolean f43959r;

        /* JADX INFO: renamed from: s */
        public Matrix f43960s;

        /* JADX INFO: renamed from: t */
        public p f43961t;

        /* JADX INFO: renamed from: u */
        public p f43962u;

        /* JADX INFO: renamed from: v */
        public p f43963v;

        /* JADX INFO: renamed from: w */
        public p f43964w;

        /* JADX INFO: renamed from: x */
        public String f43965x;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: w7.g$y0 */
    public static abstract class y0 extends h0 {
        @Override // p509w7.C12319g.h0, p509w7.C12319g.j0
        /* JADX INFO: renamed from: a */
        public void mo45868a(n0 n0Var) throws C12322j {
            if (n0Var instanceof x0) {
                this.f43877i.add(n0Var);
                return;
            }
            throw new C12322j("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    /* JADX INFO: renamed from: w7.g$z */
    public static class z extends l {

        /* JADX INFO: renamed from: o */
        public float[] f43966o;

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "polyline";
        }
    }

    /* JADX INFO: renamed from: w7.g$z0 */
    public static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o */
        public String f43967o;

        /* JADX INFO: renamed from: p */
        public p f43968p;

        /* JADX INFO: renamed from: q */
        public b1 f43969q;

        @Override // p509w7.C12319g.x0
        /* JADX INFO: renamed from: e */
        public b1 mo45869e() {
            return this.f43969q;
        }

        @Override // p509w7.C12319g.n0
        /* JADX INFO: renamed from: n */
        public String mo45862n() {
            return "textPath";
        }

        /* JADX INFO: renamed from: o */
        public void m45903o(b1 b1Var) {
            this.f43969q = b1Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C12321i m45840k() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static C12319g m45841l(InputStream inputStream) {
        return new C12323k().m46128z(inputStream, f43746g);
    }

    /* JADX INFO: renamed from: a */
    public void m45842a(C12314b.r rVar) {
        this.f43751e.m45810b(rVar);
    }

    /* JADX INFO: renamed from: b */
    public void m45843b() {
        this.f43751e.m45813e(C12314b.u.RenderOptions);
    }

    /* JADX INFO: renamed from: c */
    public final String m45844c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* JADX INFO: renamed from: d */
    public List<C12314b.p> m45845d() {
        return this.f43751e.m45811c();
    }

    /* JADX INFO: renamed from: e */
    public final b m45846e(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fM45885b;
        d1 d1Var5;
        f0 f0Var = this.f43747a;
        p pVar = f0Var.f43873s;
        p pVar2 = f0Var.f43874t;
        if (pVar == null || pVar.m45891j() || (d1Var = pVar.f43922b) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM45885b2 = pVar.m45885b(f10);
        if (pVar2 == null) {
            b bVar = this.f43747a.f43939p;
            fM45885b = bVar != null ? (bVar.f43761d * fM45885b2) / bVar.f43760c : fM45885b2;
        } else {
            if (pVar2.m45891j() || (d1Var5 = pVar2.f43922b) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM45885b = pVar2.m45885b(f10);
        }
        return new b(0.0f, 0.0f, fM45885b2, fM45885b);
    }

    /* JADX INFO: renamed from: f */
    public float m45847f() {
        if (this.f43747a != null) {
            return m45846e(this.f43750d).f43761d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX INFO: renamed from: g */
    public RectF m45848g() {
        f0 f0Var = this.f43747a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f43939p;
        if (bVar == null) {
            return null;
        }
        return bVar.m45866d();
    }

    /* JADX INFO: renamed from: h */
    public float m45849h() {
        if (this.f43747a != null) {
            return m45846e(this.f43750d).f43760c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX INFO: renamed from: i */
    public l0 m45850i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f43747a.f43903c)) {
            return this.f43747a;
        }
        if (this.f43752f.containsKey(str)) {
            return this.f43752f.get(str);
        }
        l0 l0VarM45851j = m45851j(this.f43747a, str);
        this.f43752f.put(str, l0VarM45851j);
        return l0VarM45851j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: w7.g$j0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final l0 m45851j(j0 j0Var, String str) {
        l0 l0VarM45851j;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f43903c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f43903c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (l0VarM45851j = m45851j((j0) obj, str)) != null) {
                    return l0VarM45851j;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public f0 m45852m() {
        return this.f43747a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m45853n() {
        return !this.f43751e.m45812d();
    }

    /* JADX INFO: renamed from: o */
    public void m45854o(Canvas canvas, C12318f c12318f) {
        if (c12318f == null) {
            c12318f = new C12318f();
        }
        if (!c12318f.m45838g()) {
            c12318f.m45839h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C12320h(canvas, this.f43750d).m45932G0(this, c12318f);
    }

    /* JADX INFO: renamed from: p */
    public n0 m45855p(String str) {
        if (str == null) {
            return null;
        }
        String strM45844c = m45844c(str);
        if (strM45844c.length() <= 1 || !strM45844c.startsWith("#")) {
            return null;
        }
        return m45850i(strM45844c.substring(1));
    }

    /* JADX INFO: renamed from: q */
    public void m45856q(String str) {
        this.f43749c = str;
    }

    /* JADX INFO: renamed from: r */
    public void m45857r(String str) {
        f0 f0Var = this.f43747a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f43874t = C12323k.m46047o0(str);
    }

    /* JADX INFO: renamed from: s */
    public void m45858s(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f43747a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f43939p = new b(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: t */
    public void m45859t(String str) {
        f0 f0Var = this.f43747a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f43873s = C12323k.m46047o0(str);
    }

    /* JADX INFO: renamed from: u */
    public void m45860u(f0 f0Var) {
        this.f43747a = f0Var;
    }

    /* JADX INFO: renamed from: v */
    public void m45861v(String str) {
        this.f43748b = str;
    }

    /* JADX INFO: renamed from: w7.g$p */
    public static class p implements Cloneable {

        /* JADX INFO: renamed from: a */
        public float f43921a;

        /* JADX INFO: renamed from: b */
        public d1 f43922b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public p(float f10, d1 d1Var) {
            this.f43921a = f10;
            this.f43922b = d1Var;
        }

        /* JADX INFO: renamed from: a */
        public float m45884a() {
            return this.f43921a;
        }

        /* JADX INFO: renamed from: b */
        public float m45885b(float f10) {
            int i10 = a.f43753a[this.f43922b.ordinal()];
            if (i10 == 1) {
                return this.f43921a;
            }
            switch (i10) {
                case 4:
                    return this.f43921a * f10;
                case 5:
                    return (this.f43921a * f10) / 2.54f;
                case 6:
                    return (this.f43921a * f10) / 25.4f;
                case 7:
                    return (this.f43921a * f10) / 72.0f;
                case 8:
                    return (this.f43921a * f10) / 6.0f;
                default:
                    return this.f43921a;
            }
        }

        /* JADX INFO: renamed from: c */
        public float m45886c(C12320h c12320h) {
            if (this.f43922b != d1.percent) {
                return m45888f(c12320h);
            }
            b bVarM45955S = c12320h.m45955S();
            if (bVarM45955S == null) {
                return this.f43921a;
            }
            float f10 = bVarM45955S.f43760c;
            float f11 = bVarM45955S.f43761d;
            if (f10 == f11) {
                return (this.f43921a * f10) / 100.0f;
            }
            return (this.f43921a * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        /* JADX INFO: renamed from: e */
        public float m45887e(C12320h c12320h, float f10) {
            return this.f43922b == d1.percent ? (this.f43921a * f10) / 100.0f : m45888f(c12320h);
        }

        /* JADX INFO: renamed from: f */
        public float m45888f(C12320h c12320h) {
            switch (a.f43753a[this.f43922b.ordinal()]) {
                case 1:
                    return this.f43921a;
                case 2:
                    return this.f43921a * c12320h.m45951Q();
                case 3:
                    return this.f43921a * c12320h.m45953R();
                case 4:
                    return this.f43921a * c12320h.m45957T();
                case 5:
                    return (this.f43921a * c12320h.m45957T()) / 2.54f;
                case 6:
                    return (this.f43921a * c12320h.m45957T()) / 25.4f;
                case 7:
                    return (this.f43921a * c12320h.m45957T()) / 72.0f;
                case 8:
                    return (this.f43921a * c12320h.m45957T()) / 6.0f;
                case 9:
                    b bVarM45955S = c12320h.m45955S();
                    return bVarM45955S == null ? this.f43921a : (this.f43921a * bVarM45955S.f43760c) / 100.0f;
                default:
                    return this.f43921a;
            }
        }

        /* JADX INFO: renamed from: h */
        public float m45889h(C12320h c12320h) {
            if (this.f43922b != d1.percent) {
                return m45888f(c12320h);
            }
            b bVarM45955S = c12320h.m45955S();
            return bVarM45955S == null ? this.f43921a : (this.f43921a * bVarM45955S.f43761d) / 100.0f;
        }

        /* JADX INFO: renamed from: i */
        public boolean m45890i() {
            return this.f43921a < 0.0f;
        }

        /* JADX INFO: renamed from: j */
        public boolean m45891j() {
            return this.f43921a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f43921a) + this.f43922b;
        }

        public p(float f10) {
            this.f43921a = f10;
            this.f43922b = d1.px;
        }
    }

    /* JADX INFO: renamed from: w7.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f43758a;

        /* JADX INFO: renamed from: b */
        public float f43759b;

        /* JADX INFO: renamed from: c */
        public float f43760c;

        /* JADX INFO: renamed from: d */
        public float f43761d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(float f10, float f11, float f12, float f13) {
            this.f43758a = f10;
            this.f43759b = f11;
            this.f43760c = f12;
            this.f43761d = f13;
        }

        /* JADX INFO: renamed from: a */
        public static b m45863a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        /* JADX INFO: renamed from: b */
        public float m45864b() {
            return this.f43758a + this.f43760c;
        }

        /* JADX INFO: renamed from: c */
        public float m45865c() {
            return this.f43759b + this.f43761d;
        }

        /* JADX INFO: renamed from: d */
        public RectF m45866d() {
            return new RectF(this.f43758a, this.f43759b, m45864b(), m45865c());
        }

        /* JADX INFO: renamed from: e */
        public void m45867e(b bVar) {
            float f10 = bVar.f43758a;
            if (f10 < this.f43758a) {
                this.f43758a = f10;
            }
            float f11 = bVar.f43759b;
            if (f11 < this.f43759b) {
                this.f43759b = f11;
            }
            if (bVar.m45864b() > m45864b()) {
                this.f43760c = bVar.m45864b() - this.f43758a;
            }
            if (bVar.m45865c() > m45865c()) {
                this.f43761d = bVar.m45865c() - this.f43759b;
            }
        }

        public String toString() {
            return "[" + this.f43758a + " " + this.f43759b + " " + this.f43760c + " " + this.f43761d + "]";
        }

        public b(b bVar) {
            this.f43758a = bVar.f43758a;
            this.f43759b = bVar.f43759b;
            this.f43760c = bVar.f43760c;
            this.f43761d = bVar.f43761d;
        }
    }
}
