package z3;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import w1.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f38931g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f38934d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<b, Long> f38932a = new j<>();
    public final ArrayList<b> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0781a f38933c = new C0781a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38935e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38936f = false;

    /* JADX INFO: renamed from: z3.a$a, reason: collision with other inner class name */
    public class C0781a {
        public C0781a() {
        }

        public void a() {
            a.this.f38935e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f38935e);
            if (a.this.b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    public interface b {
        boolean a(long j10);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0781a f38938a;

        public c(C0781a c0781a) {
            this.f38938a = c0781a;
        }

        public abstract void a();
    }

    public static class d extends c {
        public final Choreographer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f38939c;

        /* JADX INFO: renamed from: z3.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0782a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0782a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f38938a.a();
            }
        }

        public d(C0781a c0781a) {
            super(c0781a);
            this.b = Choreographer.getInstance();
            this.f38939c = new ChoreographerFrameCallbackC0782a();
        }

        @Override // z3.a.c
        public void a() {
            this.b.postFrameCallback(this.f38939c);
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f38931g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j10) {
        if (this.b.size() == 0) {
            e().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j10 > 0) {
            this.f38932a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f38936f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f38936f = false;
        }
    }

    public void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            b bVar = this.b.get(i10);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    public c e() {
        if (this.f38934d == null) {
            this.f38934d = new d(this.f38933c);
        }
        return this.f38934d;
    }

    public final boolean f(b bVar, long j10) {
        Long l10 = this.f38932a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f38932a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.f38932a.remove(bVar);
        int iIndexOf = this.b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.b.set(iIndexOf, null);
            this.f38936f = true;
        }
    }
}
