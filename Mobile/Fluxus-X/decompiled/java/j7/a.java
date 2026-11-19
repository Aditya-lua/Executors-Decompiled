package j7;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<K> f20088c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u7.c<A> f20090e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f20087a = new ArrayList(1);
    public boolean b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20089d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f20091f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20092g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f20093h = -1.0f;

    public interface b {
        void a();
    }

    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // j7.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // j7.a.d
        public u7.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // j7.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // j7.a.d
        public float d() {
            return 0.0f;
        }

        @Override // j7.a.d
        public float e() {
            return 1.0f;
        }

        @Override // j7.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        boolean a(float f10);

        u7.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends u7.a<T>> f20094a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u7.a<T> f20095c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f20096d = -1.0f;

        @NonNull
        public u7.a<T> b = f(0.0f);

        public e(List<? extends u7.a<T>> list) {
            this.f20094a = list;
        }

        @Override // j7.a.d
        public boolean a(float f10) {
            u7.a<T> aVar = this.f20095c;
            u7.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.f20096d == f10) {
                return true;
            }
            this.f20095c = aVar2;
            this.f20096d = f10;
            return false;
        }

        @Override // j7.a.d
        @NonNull
        public u7.a<T> b() {
            return this.b;
        }

        @Override // j7.a.d
        public boolean c(float f10) {
            if (this.b.a(f10)) {
                return !this.b.i();
            }
            this.b = f(f10);
            return true;
        }

        @Override // j7.a.d
        public float d() {
            return this.f20094a.get(0).f();
        }

        @Override // j7.a.d
        public float e() {
            List<? extends u7.a<T>> list = this.f20094a;
            return list.get(list.size() - 1).c();
        }

        public final u7.a<T> f(float f10) {
            List<? extends u7.a<T>> list = this.f20094a;
            u7.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f20094a.size() - 2; size >= 1; size--) {
                u7.a<T> aVar2 = this.f20094a.get(size);
                if (this.b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f20094a.get(0);
        }

        @Override // j7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final u7.a<T> f20097a;
        public float b = -1.0f;

        public f(List<? extends u7.a<T>> list) {
            this.f20097a = list.get(0);
        }

        @Override // j7.a.d
        public boolean a(float f10) {
            if (this.b == f10) {
                return true;
            }
            this.b = f10;
            return false;
        }

        @Override // j7.a.d
        public u7.a<T> b() {
            return this.f20097a;
        }

        @Override // j7.a.d
        public boolean c(float f10) {
            return !this.f20097a.i();
        }

        @Override // j7.a.d
        public float d() {
            return this.f20097a.f();
        }

        @Override // j7.a.d
        public float e() {
            return this.f20097a.c();
        }

        @Override // j7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends u7.a<K>> list) {
        this.f20088c = q(list);
    }

    public static <T> d<T> q(List<? extends u7.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f20087a.add(bVar);
    }

    public u7.a<K> b() {
        if (g7.e.h()) {
            g7.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        u7.a<K> aVarB = this.f20088c.b();
        if (g7.e.h()) {
            g7.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarB;
    }

    @SuppressLint({"Range"})
    public float c() {
        if (this.f20093h == -1.0f) {
            this.f20093h = this.f20088c.e();
        }
        return this.f20093h;
    }

    public float d() {
        Interpolator interpolator;
        u7.a<K> aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f33238d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        u7.a<K> aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f20089d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f20089d;
    }

    @SuppressLint({"Range"})
    public final float g() {
        if (this.f20092g == -1.0f) {
            this.f20092g = this.f20088c.d();
        }
        return this.f20092g;
    }

    public A h() {
        float fE = e();
        if (this.f20090e == null && this.f20088c.a(fE) && !p()) {
            return this.f20091f;
        }
        u7.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f33239e;
        A aI = (interpolator == null || aVarB.f33240f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f33240f.getInterpolation(fE));
        this.f20091f = aI;
        return aI;
    }

    public abstract A i(u7.a<K> aVar, float f10);

    public A j(u7.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f20090e != null;
    }

    public void l() {
        if (g7.e.h()) {
            g7.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f20087a.size(); i10++) {
            this.f20087a.get(i10).a();
        }
        if (g7.e.h()) {
            g7.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.b = true;
    }

    public void n(float f10) {
        if (g7.e.h()) {
            g7.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f20088c.isEmpty()) {
            if (g7.e.h()) {
                g7.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f20089d) {
            if (g7.e.h()) {
                g7.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f20089d = f10;
            if (this.f20088c.c(f10)) {
                l();
            }
            if (g7.e.h()) {
                g7.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(u7.c<A> cVar) {
        u7.c<A> cVar2 = this.f20090e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20090e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public boolean p() {
        return false;
    }
}
