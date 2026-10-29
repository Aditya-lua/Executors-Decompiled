package y3;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import w1.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f35532g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f35535d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<b, Long> f35533a = new j<>();
    public final ArrayList<b> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0651a f35534c = new C0651a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35536e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35537f = false;

    /* JADX INFO: renamed from: y3.a$a, reason: collision with other inner class name */
    public class C0651a {
        public C0651a() {
        }

        public void a() {
            a.this.f35536e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f35536e);
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
        public final C0651a f35539a;

        public c(C0651a c0651a) {
            this.f35539a = c0651a;
        }

        public abstract void a();
    }

    public static class d extends c {
        public final Choreographer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f35540c;

        /* JADX INFO: renamed from: y3.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0652a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0652a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f35539a.a();
            }
        }

        public d(C0651a c0651a) {
            super(c0651a);
            this.b = Choreographer.getInstance();
            this.f35540c = new ChoreographerFrameCallbackC0652a();
        }

        @Override // y3.a.c
        public void a() {
            this.b.postFrameCallback(this.f35540c);
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f35532g;
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
            this.f35533a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f35537f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f35537f = false;
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
        if (this.f35535d == null) {
            this.f35535d = new d(this.f35534c);
        }
        return this.f35535d;
    }

    public final boolean f(b bVar, long j10) {
        Long l10 = this.f35533a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f35533a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.f35533a.remove(bVar);
        int iIndexOf = this.b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.b.set(iIndexOf, null);
            this.f35537f = true;
        }
    }
}
