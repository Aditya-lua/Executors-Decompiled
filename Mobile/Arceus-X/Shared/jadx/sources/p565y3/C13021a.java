package p565y3;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p504w1.C12286j;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: loaded from: classes.dex */
public class C13021a {

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<C13021a> f46094g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public c f46098d;

    /* JADX INFO: renamed from: a */
    public final C12286j<b, Long> f46095a = new C12286j<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f46096b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final a f46097c = new a();

    /* JADX INFO: renamed from: e */
    public long f46099e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f46100f = false;

    /* JADX INFO: renamed from: y3.a$a */
    public class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m48470a() {
            C13021a.this.f46099e = SystemClock.uptimeMillis();
            C13021a c13021a = C13021a.this;
            c13021a.m48466c(c13021a.f46099e);
            if (C13021a.this.f46096b.size() > 0) {
                C13021a.this.m48467e().mo48472a();
            }
        }
    }

    /* JADX INFO: renamed from: y3.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo48471a(long j10);
    }

    /* JADX INFO: renamed from: y3.a$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final a f46102a;

        public c(a aVar) {
            this.f46102a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo48472a();
    }

    /* JADX INFO: renamed from: y3.a$d */
    public static class d extends c {

        /* JADX INFO: renamed from: b */
        public final Choreographer f46103b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f46104c;

        /* JADX INFO: renamed from: y3.a$d$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f46102a.m48470a();
            }
        }

        public d(a aVar) {
            super(aVar);
            this.f46103b = Choreographer.getInstance();
            this.f46104c = new a();
        }

        @Override // p565y3.C13021a.c
        /* JADX INFO: renamed from: a */
        public void mo48472a() {
            this.f46103b.postFrameCallback(this.f46104c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C13021a m48463d() {
        ThreadLocal<C13021a> threadLocal = f46094g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C13021a());
        }
        return threadLocal.get();
    }

    /* JADX INFO: renamed from: a */
    public void m48464a(b bVar, long j10) {
        if (this.f46096b.size() == 0) {
            m48467e().mo48472a();
        }
        if (!this.f46096b.contains(bVar)) {
            this.f46096b.add(bVar);
        }
        if (j10 > 0) {
            this.f46095a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48465b() {
        if (this.f46100f) {
            for (int size = this.f46096b.size() - 1; size >= 0; size--) {
                if (this.f46096b.get(size) == null) {
                    this.f46096b.remove(size);
                }
            }
            this.f46100f = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m48466c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f46096b.size(); i10++) {
            b bVar = this.f46096b.get(i10);
            if (bVar != null && m48468f(bVar, jUptimeMillis)) {
                bVar.mo48471a(j10);
            }
        }
        m48465b();
    }

    /* JADX INFO: renamed from: e */
    public c m48467e() {
        if (this.f46098d == null) {
            this.f46098d = new d(this.f46097c);
        }
        return this.f46098d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m48468f(b bVar, long j10) {
        Long l10 = this.f46095a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f46095a.remove(bVar);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m48469g(b bVar) {
        this.f46095a.remove(bVar);
        int iIndexOf = this.f46096b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f46096b.set(iIndexOf, null);
            this.f46100f = true;
        }
    }
}
