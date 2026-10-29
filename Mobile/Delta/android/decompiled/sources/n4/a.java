package n4;

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
    public Executor f25033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a<D>.RunnableC0434a f25034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0434a f25035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f25038n;

    /* JADX INFO: renamed from: n4.a$a, reason: collision with other inner class name */
    public final class RunnableC0434a extends c<D> implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f25039f;

        public RunnableC0434a() {
        }

        @Override // n4.c
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

        @Override // n4.c
        public void g(D d10) {
            a.this.y(this, d10);
        }

        @Override // n4.c
        public void h(D d10) {
            a.this.z(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25039f = false;
            a.this.A();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.f25037m = -10000L;
    }

    public void A() {
        if (this.f25035k != null || this.f25034j == null) {
            return;
        }
        if (this.f25034j.f25039f) {
            this.f25034j.f25039f = false;
            this.f25038n.removeCallbacks(this.f25034j);
        }
        if (this.f25036l > 0 && SystemClock.uptimeMillis() < this.f25037m + this.f25036l) {
            this.f25034j.f25039f = true;
            this.f25038n.postAtTime(this.f25034j, this.f25037m + this.f25036l);
        } else {
            if (this.f25033i == null) {
                this.f25033i = B();
            }
            this.f25034j.c(this.f25033i);
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

    @Override // n4.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f25034j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f25034j);
            printWriter.print(" waiting=");
            printWriter.println(this.f25034j.f25039f);
        }
        if (this.f25035k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f25035k);
            printWriter.print(" waiting=");
            printWriter.println(this.f25035k.f25039f);
        }
        if (this.f25036l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f25036l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f25037m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f25037m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // n4.b
    public boolean l() {
        if (this.f25034j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f25035k != null) {
            if (this.f25034j.f25039f) {
                this.f25034j.f25039f = false;
                this.f25038n.removeCallbacks(this.f25034j);
            }
            this.f25034j = null;
            return false;
        }
        if (this.f25034j.f25039f) {
            this.f25034j.f25039f = false;
            this.f25038n.removeCallbacks(this.f25034j);
            this.f25034j = null;
            return false;
        }
        boolean zA = this.f25034j.a(false);
        if (zA) {
            this.f25035k = this.f25034j;
            x();
        }
        this.f25034j = null;
        return zA;
    }

    @Override // n4.b
    public void n() {
        super.n();
        b();
        this.f25034j = new RunnableC0434a();
        A();
    }

    public void x() {
    }

    public void y(a<D>.RunnableC0434a runnableC0434a, D d10) {
        D(d10);
        if (this.f25035k == runnableC0434a) {
            t();
            this.f25037m = SystemClock.uptimeMillis();
            this.f25035k = null;
            e();
            A();
        }
    }

    public void z(a<D>.RunnableC0434a runnableC0434a, D d10) {
        if (this.f25034j != runnableC0434a) {
            y(runnableC0434a, d10);
            return;
        }
        if (i()) {
            D(d10);
            return;
        }
        c();
        this.f25037m = SystemClock.uptimeMillis();
        this.f25034j = null;
        f(d10);
    }
}
