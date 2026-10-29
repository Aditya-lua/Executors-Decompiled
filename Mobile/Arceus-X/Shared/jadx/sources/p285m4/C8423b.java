package p285m4;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.InterfaceC0952e0;
import androidx.p616lifecycle.InterfaceC0980s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p300n4.C8882b;
import p504w1.C12287k;

/* JADX INFO: renamed from: m4.b */
/* JADX INFO: loaded from: classes.dex */
public class C8423b extends AbstractC8422a {

    /* JADX INFO: renamed from: c */
    public static boolean f31027c;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC0980s f31028a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final c f31029b;

    /* JADX INFO: renamed from: m4.b$a */
    public static class a<D> extends C0949d0<D> implements C8882b.a<D> {

        /* JADX INFO: renamed from: l */
        public final int f31030l;

        /* JADX INFO: renamed from: m */
        public final Bundle f31031m;

        /* JADX INFO: renamed from: n */
        @NonNull
        public final C8882b<D> f31032n;

        /* JADX INFO: renamed from: o */
        public InterfaceC0980s f31033o;

        /* JADX INFO: renamed from: p */
        public b<D> f31034p;

        /* JADX INFO: renamed from: q */
        public C8882b<D> f31035q;

        public a(int i10, Bundle bundle, @NonNull C8882b<D> c8882b, C8882b<D> c8882b2) {
            this.f31030l = i10;
            this.f31031m = bundle;
            this.f31032n = c8882b;
            this.f31035q = c8882b2;
            c8882b.m35731r(i10, this);
        }

        @Override // p300n4.C8882b.a
        /* JADX INFO: renamed from: a */
        public void mo34119a(@NonNull C8882b<D> c8882b, D d10) {
            if (C8423b.f31027c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4863o(d10);
                return;
            }
            if (C8423b.f31027c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo4861m(d10);
        }

        @Override // androidx.p616lifecycle.AbstractC0940a0
        /* JADX INFO: renamed from: k */
        public void mo4859k() {
            if (C8423b.f31027c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f31032n.m35734u();
        }

        @Override // androidx.p616lifecycle.AbstractC0940a0
        /* JADX INFO: renamed from: l */
        public void mo4860l() {
            if (C8423b.f31027c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f31032n.m35735v();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.e0<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p616lifecycle.AbstractC0940a0
        /* JADX INFO: renamed from: n */
        public void mo4862n(@NonNull InterfaceC0952e0<? super D> interfaceC0952e0) {
            super.mo4862n(interfaceC0952e0);
            this.f31033o = null;
            this.f31034p = null;
        }

        @Override // androidx.p616lifecycle.C0949d0, androidx.p616lifecycle.AbstractC0940a0
        /* JADX INFO: renamed from: o */
        public void mo4863o(D d10) {
            super.mo4863o(d10);
            C8882b<D> c8882b = this.f31035q;
            if (c8882b != null) {
                c8882b.m35732s();
                this.f31035q = null;
            }
        }

        /* JADX INFO: renamed from: p */
        public C8882b<D> m34120p(boolean z10) {
            if (C8423b.f31027c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f31032n.m35719b();
            this.f31032n.m35718a();
            b<D> bVar = this.f31034p;
            if (bVar != null) {
                mo4862n(bVar);
                if (z10) {
                    bVar.m34127d();
                }
            }
            this.f31032n.m35736w(this);
            if ((bVar == null || bVar.m34126c()) && !z10) {
                return this.f31032n;
            }
            this.f31032n.m35732s();
            return this.f31035q;
        }

        /* JADX INFO: renamed from: q */
        public void m34121q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f31030l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f31031m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f31032n);
            this.f31032n.mo35709g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f31034p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f31034p);
                this.f31034p.m34125b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m34122r().m35721d(mo4854f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m4856h());
        }

        @NonNull
        /* JADX INFO: renamed from: r */
        public C8882b<D> m34122r() {
            return this.f31032n;
        }

        /* JADX INFO: renamed from: s */
        public void m34123s() {
            InterfaceC0980s interfaceC0980s = this.f31033o;
            b<D> bVar = this.f31034p;
            if (interfaceC0980s == null || bVar == null) {
                return;
            }
            super.mo4862n(bVar);
            m4857i(interfaceC0980s, bVar);
        }

        @NonNull
        /* JADX INFO: renamed from: t */
        public C8882b<D> m34124t(@NonNull InterfaceC0980s interfaceC0980s, @NonNull AbstractC8422a.a<D> aVar) {
            b<D> bVar = new b<>(this.f31032n, aVar);
            m4857i(interfaceC0980s, bVar);
            b<D> bVar2 = this.f31034p;
            if (bVar2 != null) {
                mo4862n(bVar2);
            }
            this.f31033o = interfaceC0980s;
            this.f31034p = bVar;
            return this.f31032n;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f31030l);
            sb2.append(" : ");
            Class<?> cls = this.f31032n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: m4.b$b */
    public static class b<D> implements InterfaceC0952e0<D> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final C8882b<D> f31036a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final AbstractC8422a.a<D> f31037b;

        /* JADX INFO: renamed from: c */
        public boolean f31038c = false;

        public b(@NonNull C8882b<D> c8882b, @NonNull AbstractC8422a.a<D> aVar) {
            this.f31036a = c8882b;
            this.f31037b = aVar;
        }

        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: a */
        public void mo4884a(D d10) {
            if (C8423b.f31027c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f31036a + ": " + this.f31036a.m35721d(d10));
            }
            this.f31038c = true;
            this.f31037b.mo22452a(this.f31036a, d10);
        }

        /* JADX INFO: renamed from: b */
        public void m34125b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f31038c);
        }

        /* JADX INFO: renamed from: c */
        public boolean m34126c() {
            return this.f31038c;
        }

        /* JADX INFO: renamed from: d */
        public void m34127d() {
            if (this.f31038c) {
                if (C8423b.f31027c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f31036a);
                }
                this.f31037b.mo22454c(this.f31036a);
            }
        }

        @NonNull
        public String toString() {
            return this.f31037b.toString();
        }
    }

    /* JADX INFO: renamed from: m4.b$c */
    public static class c extends AbstractC0991x0 {

        /* JADX INFO: renamed from: d */
        public static final C0941a1.c f31039d = new a();

        /* JADX INFO: renamed from: b */
        public C12287k<a> f31040b = new C12287k<>();

        /* JADX INFO: renamed from: c */
        public boolean f31041c = false;

        /* JADX INFO: renamed from: m4.b$c$a */
        public static class a implements C0941a1.c {
            @Override // androidx.p616lifecycle.C0941a1.c
            @NonNull
            /* JADX INFO: renamed from: b */
            public <T extends AbstractC0991x0> T mo4847b(@NonNull Class<T> cls) {
                return new c();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public static c m34128g(C0944b1 c0944b1) {
            return (c) new C0941a1(c0944b1, f31039d).m4869b(c.class);
        }

        @Override // androidx.p616lifecycle.AbstractC0991x0
        /* JADX INFO: renamed from: d */
        public void mo5012d() {
            super.mo5012d();
            int iM45637j = this.f31040b.m45637j();
            for (int i10 = 0; i10 < iM45637j; i10++) {
                this.f31040b.m45638k(i10).m34120p(true);
            }
            this.f31040b.m45631b();
        }

        /* JADX INFO: renamed from: e */
        public void m34129e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f31040b.m45637j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f31040b.m45637j(); i10++) {
                    a aVarM45638k = this.f31040b.m45638k(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f31040b.m45635h(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarM45638k.toString());
                    aVarM45638k.m34121q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m34130f() {
            this.f31041c = false;
        }

        /* JADX INFO: renamed from: h */
        public <D> a<D> m34131h(int i10) {
            return this.f31040b.m45633e(i10);
        }

        /* JADX INFO: renamed from: i */
        public boolean m34132i() {
            return this.f31041c;
        }

        /* JADX INFO: renamed from: j */
        public void m34133j() {
            int iM45637j = this.f31040b.m45637j();
            for (int i10 = 0; i10 < iM45637j; i10++) {
                this.f31040b.m45638k(i10).m34123s();
            }
        }

        /* JADX INFO: renamed from: k */
        public void m34134k(int i10, @NonNull a aVar) {
            this.f31040b.m45636i(i10, aVar);
        }

        /* JADX INFO: renamed from: l */
        public void m34135l() {
            this.f31041c = true;
        }
    }

    public C8423b(@NonNull InterfaceC0980s interfaceC0980s, @NonNull C0944b1 c0944b1) {
        this.f31028a = interfaceC0980s;
        this.f31029b = c.m34128g(c0944b1);
    }

    @Override // p285m4.AbstractC8422a
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo34115a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f31029b.m34129e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p285m4.AbstractC8422a
    @NonNull
    /* JADX INFO: renamed from: c */
    public <D> C8882b<D> mo34116c(int i10, Bundle bundle, @NonNull AbstractC8422a.a<D> aVar) {
        if (this.f31029b.m34132i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarM34131h = this.f31029b.m34131h(i10);
        if (f31027c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarM34131h == null) {
            return m34118e(i10, bundle, aVar, null);
        }
        if (f31027c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarM34131h);
        }
        return aVarM34131h.m34124t(this.f31028a, aVar);
    }

    @Override // p285m4.AbstractC8422a
    /* JADX INFO: renamed from: d */
    public void mo34117d() {
        this.f31029b.m34133j();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final <D> C8882b<D> m34118e(int i10, Bundle bundle, @NonNull AbstractC8422a.a<D> aVar, C8882b<D> c8882b) {
        try {
            this.f31029b.m34135l();
            C8882b<D> c8882bMo22453b = aVar.mo22453b(i10, bundle);
            if (c8882bMo22453b == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (c8882bMo22453b.getClass().isMemberClass() && !Modifier.isStatic(c8882bMo22453b.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c8882bMo22453b);
            }
            a aVar2 = new a(i10, bundle, c8882bMo22453b, c8882b);
            if (f31027c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f31029b.m34134k(i10, aVar2);
            this.f31029b.m34130f();
            return aVar2.m34124t(this.f31028a, aVar);
        } catch (Throwable th2) {
            this.f31029b.m34130f();
            throw th2;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f31028a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
