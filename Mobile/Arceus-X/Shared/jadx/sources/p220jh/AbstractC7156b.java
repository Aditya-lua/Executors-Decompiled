package p220jh;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: jh.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7156b {

    /* JADX INFO: renamed from: c */
    public Handler f27818c;

    /* JADX INFO: renamed from: b */
    public c f27817b = c.IDLE;

    /* JADX INFO: renamed from: d */
    public InterfaceC7155a f27819d = new a();

    /* JADX INFO: renamed from: e */
    public Runnable f27820e = new b();

    /* JADX INFO: renamed from: a */
    public Queue<InterfaceC7157c> f27816a = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: jh.b$a */
    public class a implements InterfaceC7155a {
        public a() {
        }

        @Override // p220jh.InterfaceC7155a
        /* JADX INFO: renamed from: a */
        public void mo29956a() {
            AbstractC7156b.this.f27817b = c.IDLE;
            AbstractC7156b.this.m29959c();
        }
    }

    /* JADX INFO: renamed from: jh.b$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7156b.this.m29959c();
        }
    }

    /* JADX INFO: renamed from: jh.b$c */
    public enum c {
        IDLE,
        PROCESSING
    }

    public AbstractC7156b() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f27818c = new Handler();
    }

    /* JADX INFO: renamed from: b */
    public void m29958b(InterfaceC7157c interfaceC7157c) {
        try {
            this.f27816a.add(interfaceC7157c);
        } catch (IllegalStateException unused) {
            Log.e("RbxBlockingQueue", "Queue full! Cannot add more reports.");
        }
        m29959c();
    }

    /* JADX INFO: renamed from: c */
    public void m29959c() {
        c cVar = this.f27817b;
        c cVar2 = c.IDLE;
        if (cVar == cVar2) {
            this.f27817b = c.PROCESSING;
            InterfaceC7157c interfaceC7157cPeek = this.f27816a.peek();
            if (interfaceC7157cPeek == null || !interfaceC7157cPeek.mo29962b()) {
                this.f27817b = cVar2;
                this.f27818c.removeCallbacks(this.f27820e);
                if (this.f27816a.size() > 0) {
                    this.f27818c.postDelayed(this.f27820e, 10000L);
                    return;
                }
                return;
            }
            InterfaceC7157c interfaceC7157cPoll = this.f27816a.poll();
            if (interfaceC7157cPoll != null) {
                interfaceC7157cPoll.mo29961a(this.f27819d);
            } else {
                this.f27817b = cVar2;
            }
        }
    }
}
