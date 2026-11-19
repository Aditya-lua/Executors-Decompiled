package sh;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f31466c;
    public c b = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sh.a f31467d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f31468e = new RunnableC0621b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Queue<sh.c> f31465a = new ArrayBlockingQueue(20);

    public class a implements sh.a {
        public a() {
        }

        @Override // sh.a
        public void a() {
            b.this.b = c.IDLE;
            b.this.c();
        }
    }

    /* JADX INFO: renamed from: sh.b$b, reason: collision with other inner class name */
    public class RunnableC0621b implements Runnable {
        public RunnableC0621b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c();
        }
    }

    public enum c {
        IDLE,
        PROCESSING
    }

    public b() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f31466c = new Handler();
    }

    public void b(sh.c cVar) {
        try {
            this.f31465a.add(cVar);
        } catch (IllegalStateException unused) {
            Log.e("RbxBlockingQueue", "Queue full! Cannot add more reports.");
        }
        c();
    }

    public void c() {
        c cVar = this.b;
        c cVar2 = c.IDLE;
        if (cVar == cVar2) {
            this.b = c.PROCESSING;
            sh.c cVarPeek = this.f31465a.peek();
            if (cVarPeek == null || !cVarPeek.b()) {
                this.b = cVar2;
                this.f31466c.removeCallbacks(this.f31468e);
                if (this.f31465a.size() > 0) {
                    this.f31466c.postDelayed(this.f31468e, 10000L);
                    return;
                }
                return;
            }
            sh.c cVarPoll = this.f31465a.poll();
            if (cVarPoll != null) {
                cVarPoll.a(this.f31467d);
            } else {
                this.b = cVar2;
            }
        }
    }
}
