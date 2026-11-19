package z3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.o0;
import java.util.ArrayList;
import z3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> implements z3.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f38941m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f38942n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f38943o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f38944p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f38945q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f38946r = new l("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f38947s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f38948t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f38949u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f38950v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f38951w = new C0783b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f38952x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f38953y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f38954z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f38955a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z3.c f38958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f38960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f38961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f38962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f38963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f38964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f38965l;

    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: z3.b$b, reason: collision with other inner class name */
    public static class C0783b extends s {
        public C0783b(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.L(view);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.I0(view, f10);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends z3.c {
        public final /* synthetic */ z3.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, z3.d dVar) {
            super(str);
            this.b = dVar;
        }

        @Override // z3.c
        public float a(Object obj) {
            return this.b.a();
        }

        @Override // z3.c
        public void b(Object obj, float f10) {
            this.b.b(f10);
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.I(view);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.G0(view, f10);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // z3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // z3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f38967a;
        public float b;
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void m(b bVar, float f10, float f11);
    }

    public static abstract class s extends z3.c<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public b(z3.d dVar) {
        this.f38955a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f38956c = false;
        this.f38959f = false;
        this.f38960g = Float.MAX_VALUE;
        this.f38961h = -Float.MAX_VALUE;
        this.f38962i = 0L;
        this.f38964k = new ArrayList<>();
        this.f38965l = new ArrayList<>();
        this.f38957d = null;
        this.f38958e = new f("FloatValueHolder", dVar);
        this.f38963j = 1.0f;
    }

    public static <T> void h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // z3.a.b
    public boolean a(long j10) {
        long j11 = this.f38962i;
        if (j11 == 0) {
            this.f38962i = j10;
            l(this.b);
            return false;
        }
        this.f38962i = j10;
        boolean zR = r(j10 - j11);
        float fMin = Math.min(this.b, this.f38960g);
        this.b = fMin;
        float fMax = Math.max(fMin, this.f38961h);
        this.b = fMax;
        l(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public T b(q qVar) {
        if (!this.f38964k.contains(qVar)) {
            this.f38964k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f38965l.contains(rVar)) {
            this.f38965l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z10) {
        this.f38959f = false;
        z3.a.d().g(this);
        this.f38962i = 0L;
        this.f38956c = false;
        for (int i10 = 0; i10 < this.f38964k.size(); i10++) {
            if (this.f38964k.get(i10) != null) {
                this.f38964k.get(i10).a(this, z10, this.b, this.f38955a);
            }
        }
        h(this.f38964k);
    }

    public final float e() {
        return this.f38958e.a(this.f38957d);
    }

    public float f() {
        return this.f38963j * 0.75f;
    }

    public boolean g() {
        return this.f38959f;
    }

    public T i(float f10) {
        this.f38960g = f10;
        return this;
    }

    public T j(float f10) {
        this.f38961h = f10;
        return this;
    }

    public T k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f38963j = f10;
        o(f10 * 0.75f);
        return this;
    }

    public void l(float f10) {
        this.f38958e.b(this.f38957d, f10);
        for (int i10 = 0; i10 < this.f38965l.size(); i10++) {
            if (this.f38965l.get(i10) != null) {
                this.f38965l.get(i10).m(this, this.b, this.f38955a);
            }
        }
        h(this.f38965l);
    }

    public T m(float f10) {
        this.b = f10;
        this.f38956c = true;
        return this;
    }

    public T n(float f10) {
        this.f38955a = f10;
        return this;
    }

    public abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f38959f) {
            return;
        }
        q();
    }

    public final void q() {
        if (this.f38959f) {
            return;
        }
        this.f38959f = true;
        if (!this.f38956c) {
            this.b = e();
        }
        float f10 = this.b;
        if (f10 > this.f38960g || f10 < this.f38961h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        z3.a.d().a(this, 0L);
    }

    public abstract boolean r(long j10);

    public <K> b(K k10, z3.c<K> cVar) {
        this.f38955a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f38956c = false;
        this.f38959f = false;
        this.f38960g = Float.MAX_VALUE;
        this.f38961h = -Float.MAX_VALUE;
        this.f38962i = 0L;
        this.f38964k = new ArrayList<>();
        this.f38965l = new ArrayList<>();
        this.f38957d = k10;
        this.f38958e = cVar;
        if (cVar != f38946r && cVar != f38947s && cVar != f38948t) {
            if (cVar == f38952x) {
                this.f38963j = 0.00390625f;
                return;
            } else if (cVar != f38944p && cVar != f38945q) {
                this.f38963j = 1.0f;
                return;
            } else {
                this.f38963j = 0.00390625f;
                return;
            }
        }
        this.f38963j = 0.1f;
    }
}
