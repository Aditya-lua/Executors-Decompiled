package m4;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.d0;
import androidx.p000lifecycle.e0;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.x0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import w1.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends m4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f24565c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final s f24566a;

    @NonNull
    public final c b;

    public static class a<D> extends d0<D> implements n4.b.a<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f24567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f24568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public final n4.b<D> f24569n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public s f24570o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C0436b<D> f24571p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public n4.b<D> f24572q;

        public a(int i10, Bundle bundle, @NonNull n4.b<D> bVar, n4.b<D> bVar2) {
            this.f24567l = i10;
            this.f24568m = bundle;
            this.f24569n = bVar;
            this.f24572q = bVar2;
            bVar.r(i10, this);
        }

        @Override // n4.b.a
        public void a(@NonNull n4.b<D> bVar, D d10) {
            if (b.f24565c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d10);
                return;
            }
            if (b.f24565c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d10);
        }

        @Override // androidx.p000lifecycle.a0
        public void k() {
            if (b.f24565c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f24569n.u();
        }

        @Override // androidx.p000lifecycle.a0
        public void l() {
            if (b.f24565c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f24569n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p000lifecycle.a0
        public void n(@NonNull e0<? super D> e0Var) {
            super.n(e0Var);
            this.f24570o = null;
            this.f24571p = null;
        }

        @Override // androidx.p000lifecycle.d0, androidx.p000lifecycle.a0
        public void o(D d10) {
            super.o(d10);
            n4.b<D> bVar = this.f24572q;
            if (bVar != null) {
                bVar.s();
                this.f24572q = null;
            }
        }

        public n4.b<D> p(boolean z10) {
            if (b.f24565c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f24569n.b();
            this.f24569n.a();
            C0436b<D> c0436b = this.f24571p;
            if (c0436b != null) {
                n(c0436b);
                if (z10) {
                    c0436b.d();
                }
            }
            this.f24569n.w(this);
            if ((c0436b == null || c0436b.c()) && !z10) {
                return this.f24569n;
            }
            this.f24569n.s();
            return this.f24572q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f24567l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f24568m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f24569n);
            this.f24569n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f24571p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f24571p);
                this.f24571p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @NonNull
        public n4.b<D> r() {
            return this.f24569n;
        }

        public void s() {
            s sVar = this.f24570o;
            C0436b<D> c0436b = this.f24571p;
            if (sVar == null || c0436b == null) {
                return;
            }
            super.n(c0436b);
            i(sVar, c0436b);
        }

        @NonNull
        public n4.b<D> t(@NonNull s sVar, @NonNull m4.a.InterfaceC0435a<D> interfaceC0435a) {
            C0436b<D> c0436b = new C0436b<>(this.f24569n, interfaceC0435a);
            i(sVar, c0436b);
            C0436b<D> c0436b2 = this.f24571p;
            if (c0436b2 != null) {
                n(c0436b2);
            }
            this.f24570o = sVar;
            this.f24571p = c0436b;
            return this.f24569n;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f24567l);
            sb2.append(" : ");
            Class<?> cls = this.f24569n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: m4.b$b, reason: collision with other inner class name */
    public static class C0436b<D> implements e0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final n4.b<D> f24573a;

        @NonNull
        public final m4.a.InterfaceC0435a<D> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24574c = false;

        public C0436b(@NonNull n4.b<D> bVar, @NonNull m4.a.InterfaceC0435a<D> interfaceC0435a) {
            this.f24573a = bVar;
            this.b = interfaceC0435a;
        }

        @Override // androidx.p000lifecycle.e0
        public void a(D d10) {
            if (b.f24565c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f24573a + ": " + this.f24573a.d(d10));
            }
            this.f24574c = true;
            this.b.a(this.f24573a, d10);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f24574c);
        }

        public boolean c() {
            return this.f24574c;
        }

        public void d() {
            if (this.f24574c) {
                if (b.f24565c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f24573a);
                }
                this.b.c(this.f24573a);
            }
        }

        @NonNull
        public String toString() {
            return this.b.toString();
        }
    }

    public static class c extends x0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a1.c f24575d = new a();
        public k<a> b = new k<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24576c = false;

        public static class a implements a1.c {
            @Override // androidx.lifecycle.a1.c
            @NonNull
            public <T extends x0> T c(@NonNull Class<T> cls) {
                return new c();
            }
        }

        @NonNull
        public static c g(b1 b1Var) {
            return (c) new a1(b1Var, f24575d).b(c.class);
        }

        @Override // androidx.p000lifecycle.x0
        public void d() {
            super.d();
            int iJ = this.b.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                this.b.k(i10).p(true);
            }
            this.b.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.b.j(); i10++) {
                    a aVarK = this.b.k(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.h(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarK.toString());
                    aVarK.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void f() {
            this.f24576c = false;
        }

        public <D> a<D> h(int i10) {
            return this.b.e(i10);
        }

        public boolean i() {
            return this.f24576c;
        }

        public void j() {
            int iJ = this.b.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                this.b.k(i10).s();
            }
        }

        public void k(int i10, @NonNull a aVar) {
            this.b.i(i10, aVar);
        }

        public void l() {
            this.f24576c = true;
        }
    }

    public b(@NonNull s sVar, @NonNull b1 b1Var) {
        this.f24566a = sVar;
        this.b = c.g(b1Var);
    }

    @Override // m4.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // m4.a
    @NonNull
    public <D> n4.b<D> c(int i10, Bundle bundle, @NonNull m4.a.InterfaceC0435a<D> interfaceC0435a) {
        if (this.b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarH = this.b.h(i10);
        if (f24565c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i10, bundle, interfaceC0435a, null);
        }
        if (f24565c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.t(this.f24566a, interfaceC0435a);
    }

    @Override // m4.a
    public void d() {
        this.b.j();
    }

    @NonNull
    public final <D> n4.b<D> e(int i10, Bundle bundle, @NonNull m4.a.InterfaceC0435a<D> interfaceC0435a, n4.b<D> bVar) {
        try {
            this.b.l();
            n4.b<D> bVarB = interfaceC0435a.b(i10, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i10, bundle, bVarB, bVar);
            if (f24565c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.b.k(i10, aVar);
            this.b.f();
            return aVar.t(this.f24566a, interfaceC0435a);
        } catch (Throwable th2) {
            this.b.f();
            throw th2;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f24566a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
