package o4;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import u2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f26729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a<D>.RunnableC0536a f26730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0536a f26731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f26732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f26734n;

    /* JADX INFO: renamed from: o4.a$a, reason: collision with other inner class name */
    public final class RunnableC0536a extends c<D> implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26735f;

        public RunnableC0536a() {
        }

        @Override // o4.c
        public D b() {
            try {
                return (D) a.this.E();
            } catch (m e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // o4.c
        public void g(D d10) {
            a.this.y(this, d10);
        }

        @Override // o4.c
        public void h(D d10) {
            a.this.z(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26735f = false;
            a.this.A();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.f26733m = -10000L;
    }

    public void A() {
        if (this.f26731k != null || this.f26730j == null) {
            return;
        }
        if (this.f26730j.f26735f) {
            this.f26730j.f26735f = false;
            this.f26734n.removeCallbacks(this.f26730j);
        }
        if (this.f26732l > 0 && SystemClock.uptimeMillis() < this.f26733m + this.f26732l) {
            this.f26730j.f26735f = true;
            this.f26734n.postAtTime(this.f26730j, this.f26733m + this.f26732l);
        } else {
            if (this.f26729i == null) {
                this.f26729i = B();
            }
            this.f26730j.c(this.f26729i);
        }
    }

    @NonNull
    public Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract D C();

    public void D(D d10) {
    }

    public D E() {
        return C();
    }

    @Override // o4.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f26730j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f26730j);
            printWriter.print(" waiting=");
            printWriter.println(this.f26730j.f26735f);
        }
        if (this.f26731k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f26731k);
            printWriter.print(" waiting=");
            printWriter.println(this.f26731k.f26735f);
        }
        if (this.f26732l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f26732l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f26733m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f26733m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // o4.b
    public boolean l() {
        if (this.f26730j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f26731k != null) {
            if (this.f26730j.f26735f) {
                this.f26730j.f26735f = false;
                this.f26734n.removeCallbacks(this.f26730j);
            }
            this.f26730j = null;
            return false;
        }
        if (this.f26730j.f26735f) {
            this.f26730j.f26735f = false;
            this.f26734n.removeCallbacks(this.f26730j);
            this.f26730j = null;
            return false;
        }
        boolean zA = this.f26730j.a(false);
        if (zA) {
            this.f26731k = this.f26730j;
            x();
        }
        this.f26730j = null;
        return zA;
    }

    @Override // o4.b
    public void n() {
        super.n();
        b();
        this.f26730j = new RunnableC0536a();
        A();
    }

    public void x() {
    }

    public void y(a<D>.RunnableC0536a runnableC0536a, D d10) {
        D(d10);
        if (this.f26731k == runnableC0536a) {
            t();
            this.f26733m = SystemClock.uptimeMillis();
            this.f26731k = null;
            e();
            A();
        }
    }

    public void z(a<D>.RunnableC0536a runnableC0536a, D d10) {
        if (this.f26730j != runnableC0536a) {
            y(runnableC0536a, d10);
            return;
        }
        if (i()) {
            D(d10);
            return;
        }
        c();
        this.f26733m = SystemClock.uptimeMillis();
        this.f26730j = null;
        f(d10);
    }
}
