package p189i7;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5444e;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6643a<K, A> {

    /* JADX INFO: renamed from: c */
    public final d<K> f25625c;

    /* JADX INFO: renamed from: e */
    public C11552c<A> f25627e;

    /* JADX INFO: renamed from: a */
    public final List<b> f25623a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f25624b = false;

    /* JADX INFO: renamed from: d */
    public float f25626d = 0.0f;

    /* JADX INFO: renamed from: f */
    public A f25628f = null;

    /* JADX INFO: renamed from: g */
    public float f25629g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f25630h = -1.0f;

    /* JADX INFO: renamed from: i7.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo27575a();
    }

    /* JADX INFO: renamed from: i7.a$c */
    public static final class c<T> implements d<T> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: a */
        public boolean mo28677a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: b */
        public C11550a<T> mo28678b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: c */
        public boolean mo28679c(float f10) {
            return false;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: d */
        public float mo28680d() {
            return 0.0f;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: e */
        public float mo28681e() {
            return 1.0f;
        }

        @Override // p189i7.AbstractC6643a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: renamed from: i7.a$d */
    public interface d<T> {
        /* JADX INFO: renamed from: a */
        boolean mo28677a(float f10);

        /* JADX INFO: renamed from: b */
        C11550a<T> mo28678b();

        /* JADX INFO: renamed from: c */
        boolean mo28679c(float f10);

        /* JADX INFO: renamed from: d */
        float mo28680d();

        /* JADX INFO: renamed from: e */
        float mo28681e();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: i7.a$e */
    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a */
        public final List<? extends C11550a<T>> f25631a;

        /* JADX INFO: renamed from: c */
        public C11550a<T> f25633c = null;

        /* JADX INFO: renamed from: d */
        public float f25634d = -1.0f;

        /* JADX INFO: renamed from: b */
        @NonNull
        public C11550a<T> f25632b = m28682f(0.0f);

        public e(List<? extends C11550a<T>> list) {
            this.f25631a = list;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: a */
        public boolean mo28677a(float f10) {
            C11550a<T> c11550a = this.f25633c;
            C11550a<T> c11550a2 = this.f25632b;
            if (c11550a == c11550a2 && this.f25634d == f10) {
                return true;
            }
            this.f25633c = c11550a2;
            this.f25634d = f10;
            return false;
        }

        @Override // p189i7.AbstractC6643a.d
        @NonNull
        /* JADX INFO: renamed from: b */
        public C11550a<T> mo28678b() {
            return this.f25632b;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: c */
        public boolean mo28679c(float f10) {
            if (this.f25632b.m43178a(f10)) {
                return !this.f25632b.m43186i();
            }
            this.f25632b = m28682f(f10);
            return true;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: d */
        public float mo28680d() {
            return this.f25631a.get(0).m43183f();
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: e */
        public float mo28681e() {
            List<? extends C11550a<T>> list = this.f25631a;
            return list.get(list.size() - 1).m43180c();
        }

        /* JADX INFO: renamed from: f */
        public final C11550a<T> m28682f(float f10) {
            List<? extends C11550a<T>> list = this.f25631a;
            C11550a<T> c11550a = list.get(list.size() - 1);
            if (f10 >= c11550a.m43183f()) {
                return c11550a;
            }
            for (int size = this.f25631a.size() - 2; size >= 1; size--) {
                C11550a<T> c11550a2 = this.f25631a.get(size);
                if (this.f25632b != c11550a2 && c11550a2.m43178a(f10)) {
                    return c11550a2;
                }
            }
            return this.f25631a.get(0);
        }

        @Override // p189i7.AbstractC6643a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: renamed from: i7.a$f */
    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final C11550a<T> f25635a;

        /* JADX INFO: renamed from: b */
        public float f25636b = -1.0f;

        public f(List<? extends C11550a<T>> list) {
            this.f25635a = list.get(0);
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: a */
        public boolean mo28677a(float f10) {
            if (this.f25636b == f10) {
                return true;
            }
            this.f25636b = f10;
            return false;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: b */
        public C11550a<T> mo28678b() {
            return this.f25635a;
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: c */
        public boolean mo28679c(float f10) {
            return !this.f25635a.m43186i();
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: d */
        public float mo28680d() {
            return this.f25635a.m43183f();
        }

        @Override // p189i7.AbstractC6643a.d
        /* JADX INFO: renamed from: e */
        public float mo28681e() {
            return this.f25635a.m43180c();
        }

        @Override // p189i7.AbstractC6643a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public AbstractC6643a(List<? extends C11550a<K>> list) {
        this.f25625c = m28660q(list);
    }

    /* JADX INFO: renamed from: q */
    public static <T> d<T> m28660q(List<? extends C11550a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    /* JADX INFO: renamed from: a */
    public void m28661a(b bVar) {
        this.f25623a.add(bVar);
    }

    /* JADX INFO: renamed from: b */
    public C11550a<K> m28662b() {
        if (C5444e.m24929h()) {
            C5444e.m24923b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        C11550a<K> c11550aMo28678b = this.f25625c.mo28678b();
        if (C5444e.m24929h()) {
            C5444e.m24924c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return c11550aMo28678b;
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: c */
    public float mo28663c() {
        if (this.f25630h == -1.0f) {
            this.f25630h = this.f25625c.mo28681e();
        }
        return this.f25630h;
    }

    /* JADX INFO: renamed from: d */
    public float m28664d() {
        Interpolator interpolator;
        C11550a<K> c11550aM28662b = m28662b();
        if (c11550aM28662b == null || c11550aM28662b.m43186i() || (interpolator = c11550aM28662b.f40891d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(m28665e());
    }

    /* JADX INFO: renamed from: e */
    public float m28665e() {
        if (this.f25624b) {
            return 0.0f;
        }
        C11550a<K> c11550aM28662b = m28662b();
        if (c11550aM28662b.m43186i()) {
            return 0.0f;
        }
        return (this.f25626d - c11550aM28662b.m43183f()) / (c11550aM28662b.m43180c() - c11550aM28662b.m43183f());
    }

    /* JADX INFO: renamed from: f */
    public float m28666f() {
        return this.f25626d;
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: g */
    public final float m28667g() {
        if (this.f25629g == -1.0f) {
            this.f25629g = this.f25625c.mo28680d();
        }
        return this.f25629g;
    }

    /* JADX INFO: renamed from: h */
    public A mo28668h() {
        float fM28665e = m28665e();
        if (this.f25627e == null && this.f25625c.mo28677a(fM28665e) && !mo28676p()) {
            return this.f25628f;
        }
        C11550a<K> c11550aM28662b = m28662b();
        Interpolator interpolator = c11550aM28662b.f40892e;
        A aMo28669i = (interpolator == null || c11550aM28662b.f40893f == null) ? mo28669i(c11550aM28662b, m28664d()) : mo28670j(c11550aM28662b, fM28665e, interpolator.getInterpolation(fM28665e), c11550aM28662b.f40893f.getInterpolation(fM28665e));
        this.f25628f = aMo28669i;
        return aMo28669i;
    }

    /* JADX INFO: renamed from: i */
    public abstract A mo28669i(C11550a<K> c11550a, float f10);

    /* JADX INFO: renamed from: j */
    public A mo28670j(C11550a<K> c11550a, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: k */
    public boolean m28671k() {
        return this.f25627e != null;
    }

    /* JADX INFO: renamed from: l */
    public void mo28672l() {
        if (C5444e.m24929h()) {
            C5444e.m24923b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f25623a.size(); i10++) {
            this.f25623a.get(i10).mo27575a();
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m28673m() {
        this.f25624b = true;
    }

    /* JADX INFO: renamed from: n */
    public void mo28674n(float f10) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f25625c.isEmpty()) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < m28667g()) {
            f10 = m28667g();
        } else if (f10 > mo28663c()) {
            f10 = mo28663c();
        }
        if (f10 == this.f25626d) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f25626d = f10;
            if (this.f25625c.mo28679c(f10)) {
                mo28672l();
            }
            if (C5444e.m24929h()) {
                C5444e.m24924c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m28675o(C11552c<A> c11552c) {
        C11552c<A> c11552c2 = this.f25627e;
        if (c11552c2 != null) {
            c11552c2.m43196c(null);
        }
        this.f25627e = c11552c;
        if (c11552c != null) {
            c11552c.m43196c(this);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean mo28676p() {
        return false;
    }
}
