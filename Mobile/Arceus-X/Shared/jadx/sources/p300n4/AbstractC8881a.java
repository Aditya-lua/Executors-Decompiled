package p300n4;

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
import p456u2.C11784m;

/* JADX INFO: renamed from: n4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8881a<D> extends C8882b<D> {

    /* JADX INFO: renamed from: i */
    public Executor f32318i;

    /* JADX INFO: renamed from: j */
    public volatile AbstractC8881a<D>.a f32319j;

    /* JADX INFO: renamed from: k */
    public volatile AbstractC8881a<D>.a f32320k;

    /* JADX INFO: renamed from: l */
    public long f32321l;

    /* JADX INFO: renamed from: m */
    public long f32322m;

    /* JADX INFO: renamed from: n */
    public Handler f32323n;

    /* JADX INFO: renamed from: n4.a$a */
    public final class a extends AbstractC8883c<D> implements Runnable {

        /* JADX INFO: renamed from: f */
        public boolean f32324f;

        public a() {
        }

        @Override // p300n4.AbstractC8883c
        /* JADX INFO: renamed from: b */
        public D mo35715b() {
            try {
                return (D) AbstractC8881a.this.m35708E();
            } catch (C11784m e10) {
                if (m35741f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // p300n4.AbstractC8883c
        /* JADX INFO: renamed from: g */
        public void mo35716g(D d10) {
            AbstractC8881a.this.m35713y(this, d10);
        }

        @Override // p300n4.AbstractC8883c
        /* JADX INFO: renamed from: h */
        public void mo35717h(D d10) {
            AbstractC8881a.this.m35714z(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32324f = false;
            AbstractC8881a.this.m35705A();
        }
    }

    public AbstractC8881a(@NonNull Context context) {
        super(context);
        this.f32322m = -10000L;
    }

    /* JADX INFO: renamed from: A */
    public void m35705A() {
        if (this.f32320k != null || this.f32319j == null) {
            return;
        }
        if (this.f32319j.f32324f) {
            this.f32319j.f32324f = false;
            this.f32323n.removeCallbacks(this.f32319j);
        }
        if (this.f32321l > 0 && SystemClock.uptimeMillis() < this.f32322m + this.f32321l) {
            this.f32319j.f32324f = true;
            this.f32323n.postAtTime(this.f32319j, this.f32322m + this.f32321l);
        } else {
            if (this.f32318i == null) {
                this.f32318i = m35706B();
            }
            this.f32319j.m35739c(this.f32318i);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: B */
    public Executor m35706B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    /* JADX INFO: renamed from: C */
    public abstract D mo22436C();

    /* JADX INFO: renamed from: D */
    public void m35707D(D d10) {
    }

    /* JADX INFO: renamed from: E */
    public D m35708E() {
        return mo22436C();
    }

    @Override // p300n4.C8882b
    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo35709g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.mo35709g(str, fileDescriptor, printWriter, strArr);
        if (this.f32319j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f32319j);
            printWriter.print(" waiting=");
            printWriter.println(this.f32319j.f32324f);
        }
        if (this.f32320k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f32320k);
            printWriter.print(" waiting=");
            printWriter.println(this.f32320k.f32324f);
        }
        if (this.f32321l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f32321l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f32322m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f32322m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p300n4.C8882b
    /* JADX INFO: renamed from: l */
    public boolean mo35710l() {
        if (this.f32319j == null) {
            return false;
        }
        if (!m35726j()) {
            m35728m();
        }
        if (this.f32320k != null) {
            if (this.f32319j.f32324f) {
                this.f32319j.f32324f = false;
                this.f32323n.removeCallbacks(this.f32319j);
            }
            this.f32319j = null;
            return false;
        }
        if (this.f32319j.f32324f) {
            this.f32319j.f32324f = false;
            this.f32323n.removeCallbacks(this.f32319j);
            this.f32319j = null;
            return false;
        }
        boolean zM35738a = this.f32319j.m35738a(false);
        if (zM35738a) {
            this.f32320k = this.f32319j;
            m35712x();
        }
        this.f32319j = null;
        return zM35738a;
    }

    @Override // p300n4.C8882b
    /* JADX INFO: renamed from: n */
    public void mo35711n() {
        super.mo35711n();
        m35719b();
        this.f32319j = new a();
        m35705A();
    }

    /* JADX INFO: renamed from: x */
    public void m35712x() {
    }

    /* JADX INFO: renamed from: y */
    public void m35713y(AbstractC8881a<D>.a aVar, D d10) {
        m35707D(d10);
        if (this.f32320k == aVar) {
            m35733t();
            this.f32322m = SystemClock.uptimeMillis();
            this.f32320k = null;
            m35722e();
            m35705A();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m35714z(AbstractC8881a<D>.a aVar, D d10) {
        if (this.f32319j != aVar) {
            m35713y(aVar, d10);
            return;
        }
        if (m35725i()) {
            m35707D(d10);
            return;
        }
        m35720c();
        this.f32322m = SystemClock.uptimeMillis();
        this.f32319j = null;
        m35723f(d10);
    }
}
