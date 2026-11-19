package o4;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class b<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26737a;
    public a<D> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f26738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26739d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26740e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26741f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26742g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26743h = false;

    public interface a<D> {
        void a(@NonNull b<D> bVar, D d10);
    }

    public b(@NonNull Context context) {
        this.f26738c = context.getApplicationContext();
    }

    public void a() {
        this.f26740e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f26743h = false;
    }

    @NonNull
    public String d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        if (d10 == null) {
            sb2.append("null");
        } else {
            Class<?> cls = d10.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void e() {
    }

    public void f(D d10) {
        a<D> aVar = this.b;
        if (aVar != null) {
            aVar.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f26737a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.f26739d || this.f26742g || this.f26743h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f26739d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f26742g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f26743h);
        }
        if (this.f26740e || this.f26741f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f26740e);
            printWriter.print(" mReset=");
            printWriter.println(this.f26741f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f26740e;
    }

    public boolean j() {
        return this.f26739d;
    }

    public void k() {
    }

    public boolean l() {
        throw null;
    }

    public void m() {
        if (this.f26739d) {
            h();
        } else {
            this.f26742g = true;
        }
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
        throw null;
    }

    public void q() {
    }

    public void r(int i10, @NonNull a<D> aVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = aVar;
        this.f26737a = i10;
    }

    public void s() {
        o();
        this.f26741f = true;
        this.f26739d = false;
        this.f26740e = false;
        this.f26742g = false;
        this.f26743h = false;
    }

    public void t() {
        if (this.f26743h) {
            m();
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f26737a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f26739d = true;
        this.f26741f = false;
        this.f26740e = false;
        p();
    }

    public void v() {
        this.f26739d = false;
        q();
    }

    public void w(@NonNull a<D> aVar) {
        a<D> aVar2 = this.b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }
}
