package jh;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f21456c;
    public c b = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jh.a f21457d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f21458e = new RunnableC0380b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Queue<jh.c> f21455a = new ArrayBlockingQueue(20);

    public class a implements jh.a {
        public a() {
        }

        @Override // jh.a
        public void a() {
            b.this.b = c.IDLE;
            b.this.c();
        }
    }

    /* JADX INFO: renamed from: jh.b$b, reason: collision with other inner class name */
    public class RunnableC0380b implements Runnable {
        public RunnableC0380b() {
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
        this.f21456c = new Handler();
    }

    public void b(jh.c cVar) {
        try {
            this.f21455a.add(cVar);
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
            jh.c cVarPeek = this.f21455a.peek();
            if (cVarPeek == null || !cVarPeek.b()) {
                this.b = cVar2;
                this.f21456c.removeCallbacks(this.f21458e);
                if (this.f21455a.size() > 0) {
                    this.f21456c.postDelayed(this.f21458e, 10000L);
                    return;
                }
                return;
            }
            jh.c cVarPoll = this.f21455a.poll();
            if (cVarPoll != null) {
                cVarPoll.a(this.f21457d);
            } else {
                this.b = cVar2;
            }
        }
    }
}
