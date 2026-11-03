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
    public Executor f25854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a<D>.RunnableC0455a f25855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0455a f25856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f25859n;

    /* JADX INFO: renamed from: n4.a$a, reason: collision with other inner class name */
    public final class RunnableC0455a extends c<D> implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f25860f;

        public RunnableC0455a() {
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
            this.f25860f = false;
            a.this.A();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.f25858m = -10000L;
    }

    public void A() {
        if (this.f25856k != null || this.f25855j == null) {
            return;
        }
        if (this.f25855j.f25860f) {
            this.f25855j.f25860f = false;
            this.f25859n.removeCallbacks(this.f25855j);
        }
        if (this.f25857l > 0 && SystemClock.uptimeMillis() < this.f25858m + this.f25857l) {
            this.f25855j.f25860f = true;
            this.f25859n.postAtTime(this.f25855j, this.f25858m + this.f25857l);
        } else {
            if (this.f25854i == null) {
                this.f25854i = B();
            }
            this.f25855j.c(this.f25854i);
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
        if (this.f25855j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f25855j);
            printWriter.print(" waiting=");
            printWriter.println(this.f25855j.f25860f);
        }
        if (this.f25856k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f25856k);
            printWriter.print(" waiting=");
            printWriter.println(this.f25856k.f25860f);
        }
        if (this.f25857l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f25857l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f25858m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f25858m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // n4.b
    public boolean l() {
        if (this.f25855j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f25856k != null) {
            if (this.f25855j.f25860f) {
                this.f25855j.f25860f = false;
                this.f25859n.removeCallbacks(this.f25855j);
            }
            this.f25855j = null;
            return false;
        }
        if (this.f25855j.f25860f) {
            this.f25855j.f25860f = false;
            this.f25859n.removeCallbacks(this.f25855j);
            this.f25855j = null;
            return false;
        }
        boolean zA = this.f25855j.a(false);
        if (zA) {
            this.f25856k = this.f25855j;
            x();
        }
        this.f25855j = null;
        return zA;
    }

    @Override // n4.b
    public void n() {
        super.n();
        b();
        this.f25855j = new RunnableC0455a();
        A();
    }

    public void x() {
    }

    public void y(a<D>.RunnableC0455a runnableC0455a, D d10) {
        D(d10);
        if (this.f25856k == runnableC0455a) {
            t();
            this.f25858m = SystemClock.uptimeMillis();
            this.f25856k = null;
            e();
            A();
        }
    }

    public void z(a<D>.RunnableC0455a runnableC0455a, D d10) {
        if (this.f25855j != runnableC0455a) {
            y(runnableC0455a, d10);
            return;
        }
        if (i()) {
            D(d10);
            return;
        }
        c();
        this.f25858m = SystemClock.uptimeMillis();
        this.f25855j = null;
        f(d10);
    }
}
