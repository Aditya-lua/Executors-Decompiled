package y3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.o0;
import java.util.ArrayList;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> implements y3.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f35542m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f35543n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f35544o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f35545p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f35546q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f35547r = new l("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f35548s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f35549t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f35550u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f35551v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f35552w = new C0653b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f35553x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f35554y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f35555z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35556a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f35558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y3.c f35559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f35565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f35566l;

    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: y3.b$b, reason: collision with other inner class name */
    public static class C0653b extends s {
        public C0653b(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.L(view);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.I0(view, f10);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends y3.c {
        public final /* synthetic */ y3.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, y3.d dVar) {
            super(str);
            this.b = dVar;
        }

        @Override // y3.c
        public float a(Object obj) {
            return this.b.a();
        }

        @Override // y3.c
        public void b(Object obj, float f10) {
            this.b.b(f10);
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.I(view);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.G0(view, f10);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // y3.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // y3.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f35568a;
        public float b;
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void e(b bVar, float f10, float f11);
    }

    public static abstract class s extends y3.c<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public b(y3.d dVar) {
        this.f35556a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f35557c = false;
        this.f35560f = false;
        this.f35561g = Float.MAX_VALUE;
        this.f35562h = -Float.MAX_VALUE;
        this.f35563i = 0L;
        this.f35565k = new ArrayList<>();
        this.f35566l = new ArrayList<>();
        this.f35558d = null;
        this.f35559e = new f("FloatValueHolder", dVar);
        this.f35564j = 1.0f;
    }

    public static <T> void h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // y3.a.b
    public boolean a(long j10) {
        long j11 = this.f35563i;
        if (j11 == 0) {
            this.f35563i = j10;
            l(this.b);
            return false;
        }
        this.f35563i = j10;
        boolean zR = r(j10 - j11);
        float fMin = Math.min(this.b, this.f35561g);
        this.b = fMin;
        float fMax = Math.max(fMin, this.f35562h);
        this.b = fMax;
        l(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public T b(q qVar) {
        if (!this.f35565k.contains(qVar)) {
            this.f35565k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f35566l.contains(rVar)) {
            this.f35566l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z10) {
        this.f35560f = false;
        y3.a.d().g(this);
        this.f35563i = 0L;
        this.f35557c = false;
        for (int i10 = 0; i10 < this.f35565k.size(); i10++) {
            if (this.f35565k.get(i10) != null) {
                this.f35565k.get(i10).a(this, z10, this.b, this.f35556a);
            }
        }
        h(this.f35565k);
    }

    public final float e() {
        return this.f35559e.a(this.f35558d);
    }

    public float f() {
        return this.f35564j * 0.75f;
    }

    public boolean g() {
        return this.f35560f;
    }

    public T i(float f10) {
        this.f35561g = f10;
        return this;
    }

    public T j(float f10) {
        this.f35562h = f10;
        return this;
    }

    public T k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f35564j = f10;
        o(f10 * 0.75f);
        return this;
    }

    public void l(float f10) {
        this.f35559e.b(this.f35558d, f10);
        for (int i10 = 0; i10 < this.f35566l.size(); i10++) {
            if (this.f35566l.get(i10) != null) {
                this.f35566l.get(i10).e(this, this.b, this.f35556a);
            }
        }
        h(this.f35566l);
    }

    public T m(float f10) {
        this.b = f10;
        this.f35557c = true;
        return this;
    }

    public T n(float f10) {
        this.f35556a = f10;
        return this;
    }

    public abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f35560f) {
            return;
        }
        q();
    }

    public final void q() {
        if (this.f35560f) {
            return;
        }
        this.f35560f = true;
        if (!this.f35557c) {
            this.b = e();
        }
        float f10 = this.b;
        if (f10 > this.f35561g || f10 < this.f35562h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        y3.a.d().a(this, 0L);
    }

    public abstract boolean r(long j10);

    public <K> b(K k10, y3.c<K> cVar) {
        this.f35556a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f35557c = false;
        this.f35560f = false;
        this.f35561g = Float.MAX_VALUE;
        this.f35562h = -Float.MAX_VALUE;
        this.f35563i = 0L;
        this.f35565k = new ArrayList<>();
        this.f35566l = new ArrayList<>();
        this.f35558d = k10;
        this.f35559e = cVar;
        if (cVar != f35547r && cVar != f35548s && cVar != f35549t) {
            if (cVar == f35553x) {
                this.f35564j = 0.00390625f;
                return;
            } else if (cVar != f35545p && cVar != f35546q) {
                this.f35564j = 1.0f;
                return;
            } else {
                this.f35564j = 0.00390625f;
                return;
            }
        }
        this.f35564j = 0.1f;
    }
}
