package n4;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class b<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25041a;
    public a<D> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f25042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25043d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25044e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25045f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25046g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25047h = false;

    public interface a<D> {
        void a(@NonNull b<D> bVar, D d10);
    }

    public b(@NonNull Context context) {
        this.f25042c = context.getApplicationContext();
    }

    public void a() {
        this.f25044e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f25047h = false;
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
        printWriter.print(this.f25041a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.f25043d || this.f25046g || this.f25047h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f25043d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f25046g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f25047h);
        }
        if (this.f25044e || this.f25045f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f25044e);
            printWriter.print(" mReset=");
            printWriter.println(this.f25045f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f25044e;
    }

    public boolean j() {
        return this.f25043d;
    }

    public void k() {
    }

    public boolean l() {
        throw null;
    }

    public void m() {
        if (this.f25043d) {
            h();
        } else {
            this.f25046g = true;
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
        this.f25041a = i10;
    }

    public void s() {
        o();
        this.f25045f = true;
        this.f25043d = false;
        this.f25044e = false;
        this.f25046g = false;
        this.f25047h = false;
    }

    public void t() {
        if (this.f25047h) {
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
        sb2.append(this.f25041a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f25043d = true;
        this.f25045f = false;
        this.f25044e = false;
        p();
    }

    public void v() {
        this.f25043d = false;
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
