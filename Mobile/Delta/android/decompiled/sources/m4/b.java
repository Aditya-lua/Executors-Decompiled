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
    public static boolean f23915c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final s f23916a;

    @NonNull
    public final c b;

    public static class a<D> extends d0<D> implements n4.b.a<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f23917l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f23918m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public final n4.b<D> f23919n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public s f23920o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C0422b<D> f23921p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public n4.b<D> f23922q;

        public a(int i10, Bundle bundle, @NonNull n4.b<D> bVar, n4.b<D> bVar2) {
            this.f23917l = i10;
            this.f23918m = bundle;
            this.f23919n = bVar;
            this.f23922q = bVar2;
            bVar.r(i10, this);
        }

        @Override // n4.b.a
        public void a(@NonNull n4.b<D> bVar, D d10) {
            if (b.f23915c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d10);
                return;
            }
            if (b.f23915c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d10);
        }

        @Override // androidx.p000lifecycle.a0
        public void k() {
            if (b.f23915c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f23919n.u();
        }

        @Override // androidx.p000lifecycle.a0
        public void l() {
            if (b.f23915c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f23919n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p000lifecycle.a0
        public void n(@NonNull e0<? super D> e0Var) {
            super.n(e0Var);
            this.f23920o = null;
            this.f23921p = null;
        }

        @Override // androidx.p000lifecycle.d0, androidx.p000lifecycle.a0
        public void o(D d10) {
            super.o(d10);
            n4.b<D> bVar = this.f23922q;
            if (bVar != null) {
                bVar.s();
                this.f23922q = null;
            }
        }

        public n4.b<D> p(boolean z10) {
            if (b.f23915c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f23919n.b();
            this.f23919n.a();
            C0422b<D> c0422b = this.f23921p;
            if (c0422b != null) {
                n(c0422b);
                if (z10) {
                    c0422b.d();
                }
            }
            this.f23919n.w(this);
            if ((c0422b == null || c0422b.c()) && !z10) {
                return this.f23919n;
            }
            this.f23919n.s();
            return this.f23922q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f23917l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f23918m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f23919n);
            this.f23919n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f23921p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f23921p);
                this.f23921p.b(str + "  ", printWriter);
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
            return this.f23919n;
        }

        public void s() {
            s sVar = this.f23920o;
            C0422b<D> c0422b = this.f23921p;
            if (sVar == null || c0422b == null) {
                return;
            }
            super.n(c0422b);
            i(sVar, c0422b);
        }

        @NonNull
        public n4.b<D> t(@NonNull s sVar, @NonNull m4.a.InterfaceC0421a<D> interfaceC0421a) {
            C0422b<D> c0422b = new C0422b<>(this.f23919n, interfaceC0421a);
            i(sVar, c0422b);
            C0422b<D> c0422b2 = this.f23921p;
            if (c0422b2 != null) {
                n(c0422b2);
            }
            this.f23920o = sVar;
            this.f23921p = c0422b;
            return this.f23919n;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f23917l);
            sb2.append(" : ");
            Class<?> cls = this.f23919n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: m4.b$b, reason: collision with other inner class name */
    public static class C0422b<D> implements e0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final n4.b<D> f23923a;

        @NonNull
        public final m4.a.InterfaceC0421a<D> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23924c = false;

        public C0422b(@NonNull n4.b<D> bVar, @NonNull m4.a.InterfaceC0421a<D> interfaceC0421a) {
            this.f23923a = bVar;
            this.b = interfaceC0421a;
        }

        @Override // androidx.p000lifecycle.e0
        public void a(D d10) {
            if (b.f23915c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f23923a + ": " + this.f23923a.d(d10));
            }
            this.f23924c = true;
            this.b.a(this.f23923a, d10);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f23924c);
        }

        public boolean c() {
            return this.f23924c;
        }

        public void d() {
            if (this.f23924c) {
                if (b.f23915c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f23923a);
                }
                this.b.c(this.f23923a);
            }
        }

        @NonNull
        public String toString() {
            return this.b.toString();
        }
    }

    public static class c extends x0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a1.c f23925d = new a();
        public k<a> b = new k<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23926c = false;

        public static class a implements a1.c {
            @Override // androidx.lifecycle.a1.c
            @NonNull
            public <T extends x0> T b(@NonNull Class<T> cls) {
                return new c();
            }
        }

        @NonNull
        public static c g(b1 b1Var) {
            return (c) new a1(b1Var, f23925d).b(c.class);
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
            this.f23926c = false;
        }

        public <D> a<D> h(int i10) {
            return this.b.e(i10);
        }

        public boolean i() {
            return this.f23926c;
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
            this.f23926c = true;
        }
    }

    public b(@NonNull s sVar, @NonNull b1 b1Var) {
        this.f23916a = sVar;
        this.b = c.g(b1Var);
    }

    @Override // m4.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // m4.a
    @NonNull
    public <D> n4.b<D> c(int i10, Bundle bundle, @NonNull m4.a.InterfaceC0421a<D> interfaceC0421a) {
        if (this.b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarH = this.b.h(i10);
        if (f23915c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i10, bundle, interfaceC0421a, null);
        }
        if (f23915c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.t(this.f23916a, interfaceC0421a);
    }

    @Override // m4.a
    public void d() {
        this.b.j();
    }

    @NonNull
    public final <D> n4.b<D> e(int i10, Bundle bundle, @NonNull m4.a.InterfaceC0421a<D> interfaceC0421a, n4.b<D> bVar) {
        try {
            this.b.l();
            n4.b<D> bVarB = interfaceC0421a.b(i10, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i10, bundle, bVarB, bVar);
            if (f23915c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.b.k(i10, aVar);
            this.b.f();
            return aVar.t(this.f23916a, interfaceC0421a);
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
        Class<?> cls = this.f23916a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
