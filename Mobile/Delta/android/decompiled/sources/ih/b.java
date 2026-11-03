package ih;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f21133c;
    public c b = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ih.a f21134d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f21135e = new RunnableC0365b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Queue<ih.c> f21132a = new ArrayBlockingQueue(20);

    public class a implements ih.a {
        public a() {
        }

        @Override // ih.a
        public void a() {
            b.this.b = c.IDLE;
            b.this.c();
        }
    }

    /* JADX INFO: renamed from: ih.b$b, reason: collision with other inner class name */
    public class RunnableC0365b implements Runnable {
        public RunnableC0365b() {
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
        this.f21133c = new Handler();
    }

    public void b(ih.c cVar) {
        try {
            this.f21132a.add(cVar);
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
            ih.c cVarPeek = this.f21132a.peek();
            if (cVarPeek == null || !cVarPeek.b()) {
                this.b = cVar2;
                this.f21133c.removeCallbacks(this.f21135e);
                if (this.f21132a.size() > 0) {
                    this.f21133c.postDelayed(this.f21135e, 10000L);
                    return;
                }
                return;
            }
            ih.c cVarPoll = this.f21132a.poll();
            if (cVarPoll != null) {
                cVarPoll.a(this.f21134d);
            } else {
                this.b = cVar2;
            }
        }
    }
}
