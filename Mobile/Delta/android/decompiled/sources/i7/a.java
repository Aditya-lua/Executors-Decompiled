package i7;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<K> f20402c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t7.c<A> f20404e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f20401a = new ArrayList(1);
    public boolean b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20403d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f20405f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20406g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f20407h = -1.0f;

    public interface b {
        void a();
    }

    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // i7.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // i7.a.d
        public t7.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // i7.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // i7.a.d
        public float d() {
            return 0.0f;
        }

        @Override // i7.a.d
        public float e() {
            return 1.0f;
        }

        @Override // i7.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        boolean a(float f10);

        t7.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends t7.a<T>> f20408a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t7.a<T> f20409c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f20410d = -1.0f;

        @NonNull
        public t7.a<T> b = f(0.0f);

        public e(List<? extends t7.a<T>> list) {
            this.f20408a = list;
        }

        @Override // i7.a.d
        public boolean a(float f10) {
            t7.a<T> aVar = this.f20409c;
            t7.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.f20410d == f10) {
                return true;
            }
            this.f20409c = aVar2;
            this.f20410d = f10;
            return false;
        }

        @Override // i7.a.d
        @NonNull
        public t7.a<T> b() {
            return this.b;
        }

        @Override // i7.a.d
        public boolean c(float f10) {
            if (this.b.a(f10)) {
                return !this.b.i();
            }
            this.b = f(f10);
            return true;
        }

        @Override // i7.a.d
        public float d() {
            return this.f20408a.get(0).f();
        }

        @Override // i7.a.d
        public float e() {
            List<? extends t7.a<T>> list = this.f20408a;
            return list.get(list.size() - 1).c();
        }

        public final t7.a<T> f(float f10) {
            List<? extends t7.a<T>> list = this.f20408a;
            t7.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f20408a.size() - 2; size >= 1; size--) {
                t7.a<T> aVar2 = this.f20408a.get(size);
                if (this.b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f20408a.get(0);
        }

        @Override // i7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final t7.a<T> f20411a;
        public float b = -1.0f;

        public f(List<? extends t7.a<T>> list) {
            this.f20411a = list.get(0);
        }

        @Override // i7.a.d
        public boolean a(float f10) {
            if (this.b == f10) {
                return true;
            }
            this.b = f10;
            return false;
        }

        @Override // i7.a.d
        public t7.a<T> b() {
            return this.f20411a;
        }

        @Override // i7.a.d
        public boolean c(float f10) {
            return !this.f20411a.i();
        }

        @Override // i7.a.d
        public float d() {
            return this.f20411a.f();
        }

        @Override // i7.a.d
        public float e() {
            return this.f20411a.c();
        }

        @Override // i7.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends t7.a<K>> list) {
        this.f20402c = q(list);
    }

    public static <T> d<T> q(List<? extends t7.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f20401a.add(bVar);
    }

    public t7.a<K> b() {
        if (f7.e.h()) {
            f7.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        t7.a<K> aVarB = this.f20402c.b();
        if (f7.e.h()) {
            f7.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarB;
    }

    @SuppressLint({"Range"})
    public float c() {
        if (this.f20407h == -1.0f) {
            this.f20407h = this.f20402c.e();
        }
        return this.f20407h;
    }

    public float d() {
        Interpolator interpolator;
        t7.a<K> aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f32191d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        t7.a<K> aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f20403d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f20403d;
    }

    @SuppressLint({"Range"})
    public final float g() {
        if (this.f20406g == -1.0f) {
            this.f20406g = this.f20402c.d();
        }
        return this.f20406g;
    }

    public A h() {
        float fE = e();
        if (this.f20404e == null && this.f20402c.a(fE) && !p()) {
            return this.f20405f;
        }
        t7.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f32192e;
        A aI = (interpolator == null || aVarB.f32193f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f32193f.getInterpolation(fE));
        this.f20405f = aI;
        return aI;
    }

    public abstract A i(t7.a<K> aVar, float f10);

    public A j(t7.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f20404e != null;
    }

    public void l() {
        if (f7.e.h()) {
            f7.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f20401a.size(); i10++) {
            this.f20401a.get(i10).a();
        }
        if (f7.e.h()) {
            f7.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.b = true;
    }

    public void n(float f10) {
        if (f7.e.h()) {
            f7.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f20402c.isEmpty()) {
            if (f7.e.h()) {
                f7.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f20403d) {
            if (f7.e.h()) {
                f7.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f20403d = f10;
            if (this.f20402c.c(f10)) {
                l();
            }
            if (f7.e.h()) {
                f7.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(t7.c<A> cVar) {
        t7.c<A> cVar2 = this.f20404e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20404e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public boolean p() {
        return false;
    }
}
