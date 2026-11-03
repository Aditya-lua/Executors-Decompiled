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
    public static final s f36399m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f36400n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f36401o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f36402p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f36403q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f36404r = new l("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f36405s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f36406t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f36407u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f36408v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f36409w = new C0668b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f36410x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f36411y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f36412z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36413a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y3.c f36416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f36420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f36422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f36423l;

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
    public static class C0668b extends s {
        public C0668b(String str) {
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
        public float f36425a;
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
        this.f36413a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f36414c = false;
        this.f36417f = false;
        this.f36418g = Float.MAX_VALUE;
        this.f36419h = -Float.MAX_VALUE;
        this.f36420i = 0L;
        this.f36422k = new ArrayList<>();
        this.f36423l = new ArrayList<>();
        this.f36415d = null;
        this.f36416e = new f("FloatValueHolder", dVar);
        this.f36421j = 1.0f;
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
        long j11 = this.f36420i;
        if (j11 == 0) {
            this.f36420i = j10;
            l(this.b);
            return false;
        }
        this.f36420i = j10;
        boolean zR = r(j10 - j11);
        float fMin = Math.min(this.b, this.f36418g);
        this.b = fMin;
        float fMax = Math.max(fMin, this.f36419h);
        this.b = fMax;
        l(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public T b(q qVar) {
        if (!this.f36422k.contains(qVar)) {
            this.f36422k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f36423l.contains(rVar)) {
            this.f36423l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z10) {
        this.f36417f = false;
        y3.a.d().g(this);
        this.f36420i = 0L;
        this.f36414c = false;
        for (int i10 = 0; i10 < this.f36422k.size(); i10++) {
            if (this.f36422k.get(i10) != null) {
                this.f36422k.get(i10).a(this, z10, this.b, this.f36413a);
            }
        }
        h(this.f36422k);
    }

    public final float e() {
        return this.f36416e.a(this.f36415d);
    }

    public float f() {
        return this.f36421j * 0.75f;
    }

    public boolean g() {
        return this.f36417f;
    }

    public T i(float f10) {
        this.f36418g = f10;
        return this;
    }

    public T j(float f10) {
        this.f36419h = f10;
        return this;
    }

    public T k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f36421j = f10;
        o(f10 * 0.75f);
        return this;
    }

    public void l(float f10) {
        this.f36416e.b(this.f36415d, f10);
        for (int i10 = 0; i10 < this.f36423l.size(); i10++) {
            if (this.f36423l.get(i10) != null) {
                this.f36423l.get(i10).e(this, this.b, this.f36413a);
            }
        }
        h(this.f36423l);
    }

    public T m(float f10) {
        this.b = f10;
        this.f36414c = true;
        return this;
    }

    public T n(float f10) {
        this.f36413a = f10;
        return this;
    }

    public abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f36417f) {
            return;
        }
        q();
    }

    public final void q() {
        if (this.f36417f) {
            return;
        }
        this.f36417f = true;
        if (!this.f36414c) {
            this.b = e();
        }
        float f10 = this.b;
        if (f10 > this.f36418g || f10 < this.f36419h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        y3.a.d().a(this, 0L);
    }

    public abstract boolean r(long j10);

    public <K> b(K k10, y3.c<K> cVar) {
        this.f36413a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.f36414c = false;
        this.f36417f = false;
        this.f36418g = Float.MAX_VALUE;
        this.f36419h = -Float.MAX_VALUE;
        this.f36420i = 0L;
        this.f36422k = new ArrayList<>();
        this.f36423l = new ArrayList<>();
        this.f36415d = k10;
        this.f36416e = cVar;
        if (cVar != f36404r && cVar != f36405s && cVar != f36406t) {
            if (cVar == f36410x) {
                this.f36421j = 0.00390625f;
                return;
            } else if (cVar != f36402p && cVar != f36403q) {
                this.f36421j = 1.0f;
                return;
            } else {
                this.f36421j = 0.00390625f;
                return;
            }
        }
        this.f36421j = 0.1f;
    }
}
