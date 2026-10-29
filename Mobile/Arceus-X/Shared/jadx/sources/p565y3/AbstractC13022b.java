package p565y3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.C0625o0;
import java.util.ArrayList;
import p565y3.AbstractC13022b;

/* JADX INFO: renamed from: y3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13022b<T extends AbstractC13022b<T>> implements C13021a.b {

    /* JADX INFO: renamed from: m */
    public static final s f46106m = new g("translationX");

    /* JADX INFO: renamed from: n */
    public static final s f46107n = new h("translationY");

    /* JADX INFO: renamed from: o */
    public static final s f46108o = new i("translationZ");

    /* JADX INFO: renamed from: p */
    public static final s f46109p = new j("scaleX");

    /* JADX INFO: renamed from: q */
    public static final s f46110q = new k("scaleY");

    /* JADX INFO: renamed from: r */
    public static final s f46111r = new l("rotation");

    /* JADX INFO: renamed from: s */
    public static final s f46112s = new m("rotationX");

    /* JADX INFO: renamed from: t */
    public static final s f46113t = new n("rotationY");

    /* JADX INFO: renamed from: u */
    public static final s f46114u = new o("x");

    /* JADX INFO: renamed from: v */
    public static final s f46115v = new a("y");

    /* JADX INFO: renamed from: w */
    public static final s f46116w = new b("z");

    /* JADX INFO: renamed from: x */
    public static final s f46117x = new c("alpha");

    /* JADX INFO: renamed from: y */
    public static final s f46118y = new d("scrollX");

    /* JADX INFO: renamed from: z */
    public static final s f46119z = new e("scrollY");

    /* JADX INFO: renamed from: a */
    public float f46120a;

    /* JADX INFO: renamed from: b */
    public float f46121b;

    /* JADX INFO: renamed from: c */
    public boolean f46122c;

    /* JADX INFO: renamed from: d */
    public final Object f46123d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13023c f46124e;

    /* JADX INFO: renamed from: f */
    public boolean f46125f;

    /* JADX INFO: renamed from: g */
    public float f46126g;

    /* JADX INFO: renamed from: h */
    public float f46127h;

    /* JADX INFO: renamed from: i */
    public long f46128i;

    /* JADX INFO: renamed from: j */
    public float f46129j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<q> f46130k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<r> f46131l;

    /* JADX INFO: renamed from: y3.b$a */
    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getY();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$b */
    public static class b extends s {
        public b(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return C0625o0.m3000L(view);
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            C0625o0.m2995I0(view, f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$c */
    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getAlpha();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$d */
    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getScrollX();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$e */
    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getScrollY();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$f */
    public class f extends AbstractC13023c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C13024d f46132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C13024d c13024d) {
            super(str);
            this.f46132b = c13024d;
        }

        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: a */
        public float mo22571a(Object obj) {
            return this.f46132b.m48518a();
        }

        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: b */
        public void mo22572b(Object obj, float f10) {
            this.f46132b.m48519b(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$g */
    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getTranslationX();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$h */
    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getTranslationY();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$i */
    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return C0625o0.m2994I(view);
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            C0625o0.m2991G0(view, f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$j */
    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getScaleX();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$k */
    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getScaleY();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$l */
    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getRotation();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$m */
    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getRotationX();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$n */
    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getRotationY();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$o */
    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)F */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo22571a(View view) {
            return view.getX();
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;F)V */
        @Override // p565y3.AbstractC13023c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22572b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$p */
    public static class p {

        /* JADX INFO: renamed from: a */
        public float f46134a;

        /* JADX INFO: renamed from: b */
        public float f46135b;
    }

    /* JADX INFO: renamed from: y3.b$q */
    public interface q {
        /* JADX INFO: renamed from: a */
        void mo38300a(AbstractC13022b abstractC13022b, boolean z10, float f10, float f11);
    }

    /* JADX INFO: renamed from: y3.b$r */
    public interface r {
        /* JADX INFO: renamed from: e */
        void mo38291e(AbstractC13022b abstractC13022b, float f10, float f11);
    }

    /* JADX INFO: renamed from: y3.b$s */
    public static abstract class s extends AbstractC13023c<View> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:1) call: y3.b.s.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public s(String str) {
            super(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC13022b(C13024d c13024d) {
        this.f46120a = 0.0f;
        this.f46121b = Float.MAX_VALUE;
        this.f46122c = false;
        this.f46125f = false;
        this.f46126g = Float.MAX_VALUE;
        this.f46127h = -Float.MAX_VALUE;
        this.f46128i = 0L;
        this.f46130k = new ArrayList<>();
        this.f46131l = new ArrayList<>();
        this.f46123d = null;
        this.f46124e = new f("FloatValueHolder", c13024d);
        this.f46129j = 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m48473h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // p565y3.C13021a.b
    /* JADX INFO: renamed from: a */
    public boolean mo48471a(long j10) {
        long j11 = this.f46128i;
        if (j11 == 0) {
            this.f46128i = j10;
            m48483l(this.f46121b);
            return false;
        }
        this.f46128i = j10;
        boolean zMo48489r = mo48489r(j10 - j11);
        float fMin = Math.min(this.f46121b, this.f46126g);
        this.f46121b = fMin;
        float fMax = Math.max(fMin, this.f46127h);
        this.f46121b = fMax;
        m48483l(fMax);
        if (zMo48489r) {
            m48476d(false);
        }
        return zMo48489r;
    }

    /* JADX INFO: renamed from: b */
    public T m48474b(q qVar) {
        if (!this.f46130k.contains(qVar)) {
            this.f46130k.add(qVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public T m48475c(r rVar) {
        if (m48479g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f46131l.contains(rVar)) {
            this.f46131l.add(rVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m48476d(boolean z10) {
        this.f46125f = false;
        C13021a.m48463d().m48469g(this);
        this.f46128i = 0L;
        this.f46122c = false;
        for (int i10 = 0; i10 < this.f46130k.size(); i10++) {
            if (this.f46130k.get(i10) != null) {
                this.f46130k.get(i10).mo38300a(this, z10, this.f46121b, this.f46120a);
            }
        }
        m48473h(this.f46130k);
    }

    /* JADX INFO: renamed from: e */
    public final float m48477e() {
        return this.f46124e.mo22571a(this.f46123d);
    }

    /* JADX INFO: renamed from: f */
    public float m48478f() {
        return this.f46129j * 0.75f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m48479g() {
        return this.f46125f;
    }

    /* JADX INFO: renamed from: i */
    public T m48480i(float f10) {
        this.f46126g = f10;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public T m48481j(float f10) {
        this.f46127h = f10;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public T m48482k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f46129j = f10;
        mo48486o(f10 * 0.75f);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m48483l(float f10) {
        this.f46124e.mo22572b(this.f46123d, f10);
        for (int i10 = 0; i10 < this.f46131l.size(); i10++) {
            if (this.f46131l.get(i10) != null) {
                this.f46131l.get(i10).mo38291e(this, this.f46121b, this.f46120a);
            }
        }
        m48473h(this.f46131l);
    }

    /* JADX INFO: renamed from: m */
    public T m48484m(float f10) {
        this.f46121b = f10;
        this.f46122c = true;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public T m48485n(float f10) {
        this.f46120a = f10;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo48486o(float f10);

    /* JADX INFO: renamed from: p */
    public void mo48487p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f46125f) {
            return;
        }
        m48488q();
    }

    /* JADX INFO: renamed from: q */
    public final void m48488q() {
        if (this.f46125f) {
            return;
        }
        this.f46125f = true;
        if (!this.f46122c) {
            this.f46121b = m48477e();
        }
        float f10 = this.f46121b;
        if (f10 > this.f46126g || f10 < this.f46127h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C13021a.m48463d().m48464a(this, 0L);
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo48489r(long j10);

    public <K> AbstractC13022b(K k10, AbstractC13023c<K> abstractC13023c) {
        this.f46120a = 0.0f;
        this.f46121b = Float.MAX_VALUE;
        this.f46122c = false;
        this.f46125f = false;
        this.f46126g = Float.MAX_VALUE;
        this.f46127h = -Float.MAX_VALUE;
        this.f46128i = 0L;
        this.f46130k = new ArrayList<>();
        this.f46131l = new ArrayList<>();
        this.f46123d = k10;
        this.f46124e = abstractC13023c;
        if (abstractC13023c != f46111r && abstractC13023c != f46112s && abstractC13023c != f46113t) {
            if (abstractC13023c == f46117x) {
                this.f46129j = 0.00390625f;
                return;
            } else if (abstractC13023c != f46109p && abstractC13023c != f46110q) {
                this.f46129j = 1.0f;
                return;
            } else {
                this.f46129j = 0.00390625f;
                return;
            }
        }
        this.f46129j = 0.1f;
    }
}
