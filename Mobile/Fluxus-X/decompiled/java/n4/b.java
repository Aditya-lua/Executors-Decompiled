package n4;

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
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import w1.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends n4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25331c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final s f25332a;

    @NonNull
    public final c b;

    public static class a<D> extends d0<D> implements o4.b.a<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f25333l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f25334m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public final o4.b<D> f25335n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public s f25336o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C0491b<D> f25337p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o4.b<D> f25338q;

        public a(int i10, Bundle bundle, @NonNull o4.b<D> bVar, o4.b<D> bVar2) {
            this.f25333l = i10;
            this.f25334m = bundle;
            this.f25335n = bVar;
            this.f25338q = bVar2;
            bVar.r(i10, this);
        }

        @Override // o4.b.a
        public void a(@NonNull o4.b<D> bVar, D d10) {
            if (b.f25331c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(d10);
                return;
            }
            if (b.f25331c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d10);
        }

        @Override // androidx.p000lifecycle.a0
        public void k() {
            if (b.f25331c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f25335n.u();
        }

        @Override // androidx.p000lifecycle.a0
        public void l() {
            if (b.f25331c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f25335n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p000lifecycle.a0
        public void n(@NonNull e0<? super D> e0Var) {
            super.n(e0Var);
            this.f25336o = null;
            this.f25337p = null;
        }

        @Override // androidx.p000lifecycle.d0, androidx.p000lifecycle.a0
        public void o(D d10) {
            super.o(d10);
            o4.b<D> bVar = this.f25338q;
            if (bVar != null) {
                bVar.s();
                this.f25338q = null;
            }
        }

        public o4.b<D> p(boolean z10) {
            if (b.f25331c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f25335n.b();
            this.f25335n.a();
            C0491b<D> c0491b = this.f25337p;
            if (c0491b != null) {
                n(c0491b);
                if (z10) {
                    c0491b.d();
                }
            }
            this.f25335n.w(this);
            if ((c0491b == null || c0491b.c()) && !z10) {
                return this.f25335n;
            }
            this.f25335n.s();
            return this.f25338q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f25333l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f25334m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f25335n);
            this.f25335n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f25337p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f25337p);
                this.f25337p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @NonNull
        public o4.b<D> r() {
            return this.f25335n;
        }

        public void s() {
            s sVar = this.f25336o;
            C0491b<D> c0491b = this.f25337p;
            if (sVar == null || c0491b == null) {
                return;
            }
            super.n(c0491b);
            i(sVar, c0491b);
        }

        @NonNull
        public o4.b<D> t(@NonNull s sVar, @NonNull n4.a.InterfaceC0490a<D> interfaceC0490a) {
            C0491b<D> c0491b = new C0491b<>(this.f25335n, interfaceC0490a);
            i(sVar, c0491b);
            C0491b<D> c0491b2 = this.f25337p;
            if (c0491b2 != null) {
                n(c0491b2);
            }
            this.f25336o = sVar;
            this.f25337p = c0491b;
            return this.f25335n;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f25333l);
            sb2.append(" : ");
            Class<?> cls = this.f25335n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: n4.b$b, reason: collision with other inner class name */
    public static class C0491b<D> implements e0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final o4.b<D> f25339a;

        @NonNull
        public final n4.a.InterfaceC0490a<D> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f25340c = false;

        public C0491b(@NonNull o4.b<D> bVar, @NonNull n4.a.InterfaceC0490a<D> interfaceC0490a) {
            this.f25339a = bVar;
            this.b = interfaceC0490a;
        }

        @Override // androidx.p000lifecycle.e0
        public void a(D d10) {
            if (b.f25331c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f25339a + ": " + this.f25339a.d(d10));
            }
            this.f25340c = true;
            this.b.a(this.f25339a, d10);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f25340c);
        }

        public boolean c() {
            return this.f25340c;
        }

        public void d() {
            if (this.f25340c) {
                if (b.f25331c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f25339a);
                }
                this.b.c(this.f25339a);
            }
        }

        @NonNull
        public String toString() {
            return this.b.toString();
        }
    }

    public static class c extends x0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a1.c f25341d = new a();
        public k<a> b = new k<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f25342c = false;

        public static class a implements a1.c {
            @Override // androidx.lifecycle.a1.c
            @NonNull
            public <T extends x0> T a(@NonNull Class<T> cls) {
                return new c();
            }
        }

        @NonNull
        public static c g(b1 b1Var) {
            return (c) new a1(b1Var, f25341d).a(c.class);
        }

        @Override // androidx.p000lifecycle.x0
        public void d() {
            super.d();
            int iL = this.b.l();
            for (int i10 = 0; i10 < iL; i10++) {
                this.b.o(i10).p(true);
            }
            this.b.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.b.l(); i10++) {
                    a aVarO = this.b.o(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.i(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarO.toString());
                    aVarO.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void f() {
            this.f25342c = false;
        }

        public <D> a<D> h(int i10) {
            return this.b.e(i10);
        }

        public boolean i() {
            return this.f25342c;
        }

        public void j() {
            int iL = this.b.l();
            for (int i10 = 0; i10 < iL; i10++) {
                this.b.o(i10).s();
            }
        }

        public void k(int i10, @NonNull a aVar) {
            this.b.k(i10, aVar);
        }

        public void l() {
            this.f25342c = true;
        }
    }

    public b(@NonNull s sVar, @NonNull b1 b1Var) {
        this.f25332a = sVar;
        this.b = c.g(b1Var);
    }

    @Override // n4.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // n4.a
    @NonNull
    public <D> o4.b<D> c(int i10, Bundle bundle, @NonNull n4.a.InterfaceC0490a<D> interfaceC0490a) {
        if (this.b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarH = this.b.h(i10);
        if (f25331c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i10, bundle, interfaceC0490a, null);
        }
        if (f25331c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.t(this.f25332a, interfaceC0490a);
    }

    @Override // n4.a
    public void d() {
        this.b.j();
    }

    @NonNull
    public final <D> o4.b<D> e(int i10, Bundle bundle, @NonNull n4.a.InterfaceC0490a<D> interfaceC0490a, o4.b<D> bVar) {
        try {
            this.b.l();
            o4.b<D> bVarB = interfaceC0490a.b(i10, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i10, bundle, bVarB, bVar);
            if (f25331c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.b.k(i10, aVar);
            this.b.f();
            return aVar.t(this.f25332a, interfaceC0490a);
        } catch (Throwable th2) {
            this.b.f();
            throw th2;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_ITF);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f25332a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
