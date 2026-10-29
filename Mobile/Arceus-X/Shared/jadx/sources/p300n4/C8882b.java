package p300n4;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: n4.b */
/* JADX INFO: loaded from: classes.dex */
public class C8882b<D> {

    /* JADX INFO: renamed from: a */
    public int f32326a;

    /* JADX INFO: renamed from: b */
    public a<D> f32327b;

    /* JADX INFO: renamed from: c */
    public Context f32328c;

    /* JADX INFO: renamed from: d */
    public boolean f32329d = false;

    /* JADX INFO: renamed from: e */
    public boolean f32330e = false;

    /* JADX INFO: renamed from: f */
    public boolean f32331f = true;

    /* JADX INFO: renamed from: g */
    public boolean f32332g = false;

    /* JADX INFO: renamed from: h */
    public boolean f32333h = false;

    /* JADX INFO: renamed from: n4.b$a */
    public interface a<D> {
        /* JADX INFO: renamed from: a */
        void mo34119a(@NonNull C8882b<D> c8882b, D d10);
    }

    public C8882b(@NonNull Context context) {
        this.f32328c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public void m35718a() {
        this.f32330e = true;
        m35727k();
    }

    /* JADX INFO: renamed from: b */
    public boolean m35719b() {
        return mo35710l();
    }

    /* JADX INFO: renamed from: c */
    public void m35720c() {
        this.f32333h = false;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m35721d(D d10) {
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

    /* JADX INFO: renamed from: e */
    public void m35722e() {
    }

    /* JADX INFO: renamed from: f */
    public void m35723f(D d10) {
        a<D> aVar = this.f32327b;
        if (aVar != null) {
            aVar.mo34119a(this, d10);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo35709g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f32326a);
        printWriter.print(" mListener=");
        printWriter.println(this.f32327b);
        if (this.f32329d || this.f32332g || this.f32333h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f32329d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f32332g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f32333h);
        }
        if (this.f32330e || this.f32331f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f32330e);
            printWriter.print(" mReset=");
            printWriter.println(this.f32331f);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m35724h() {
        mo35711n();
    }

    /* JADX INFO: renamed from: i */
    public boolean m35725i() {
        return this.f32330e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m35726j() {
        return this.f32329d;
    }

    /* JADX INFO: renamed from: k */
    public void m35727k() {
    }

    /* JADX INFO: renamed from: l */
    public boolean mo35710l() {
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public void m35728m() {
        if (this.f32329d) {
            m35724h();
        } else {
            this.f32332g = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo35711n() {
    }

    /* JADX INFO: renamed from: o */
    public void m35729o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo22437p() {
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public void m35730q() {
    }

    /* JADX INFO: renamed from: r */
    public void m35731r(int i10, @NonNull a<D> aVar) {
        if (this.f32327b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f32327b = aVar;
        this.f32326a = i10;
    }

    /* JADX INFO: renamed from: s */
    public void m35732s() {
        m35729o();
        this.f32331f = true;
        this.f32329d = false;
        this.f32330e = false;
        this.f32332g = false;
        this.f32333h = false;
    }

    /* JADX INFO: renamed from: t */
    public void m35733t() {
        if (this.f32333h) {
            m35728m();
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
        sb2.append(this.f32326a);
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m35734u() {
        this.f32329d = true;
        this.f32331f = false;
        this.f32330e = false;
        mo22437p();
    }

    /* JADX INFO: renamed from: v */
    public void m35735v() {
        this.f32329d = false;
        m35730q();
    }

    /* JADX INFO: renamed from: w */
    public void m35736w(@NonNull a<D> aVar) {
        a<D> aVar2 = this.f32327b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f32327b = null;
    }
}
