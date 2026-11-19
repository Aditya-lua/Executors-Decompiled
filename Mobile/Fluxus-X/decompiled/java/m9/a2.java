package m9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends f4.q implements j {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final WeakHashMap f22972g0 = new WeakHashMap();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final z1 f22973f0 = new z1();

    public static a2 b2(f4.v vVar) {
        a2 a2Var;
        f4.k0 k0VarL1 = vVar.l1();
        WeakHashMap weakHashMap = f22972g0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(vVar);
        if (weakReference != null && (a2Var = (a2) weakReference.get()) != null) {
            return a2Var;
        }
        try {
            a2 a2Var2 = (a2) k0VarL1.n0("SLifecycleFragmentImpl");
            if (a2Var2 == null || a2Var2.v0()) {
                a2Var2 = new a2();
                k0VarL1.r().d(a2Var2, "SLifecycleFragmentImpl").h();
            }
            weakHashMap.put(vVar, new WeakReference(a2Var2));
            return a2Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // f4.q
    public final void A0(int i10, int i11, Intent intent) {
        super.A0(i10, i11, intent);
        this.f22973f0.f(i10, i11, intent);
    }

    @Override // f4.q
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        this.f22973f0.c(bundle);
    }

    @Override // f4.q
    public final void K0() {
        super.K0();
        this.f22973f0.i();
    }

    @Override // f4.q
    public final void a1() {
        super.a1();
        this.f22973f0.e();
    }

    @Override // f4.q
    public final void b1(Bundle bundle) {
        super.b1(bundle);
        this.f22973f0.g(bundle);
    }

    @Override // f4.q
    public final void c1() {
        super.c1();
        this.f22973f0.d();
    }

    @Override // m9.j
    public final <T extends i> T d(String str, Class<T> cls) {
        return (T) this.f22973f0.a(str, cls);
    }

    @Override // f4.q
    public final void d1() {
        super.d1();
        this.f22973f0.h();
    }

    @Override // m9.j
    public final void f(String str, @NonNull i iVar) {
        this.f22973f0.b(str, iVar);
    }

    @Override // m9.j
    public final Activity g() {
        return p();
    }

    @Override // f4.q
    public final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.l(str, fileDescriptor, printWriter, strArr);
        this.f22973f0.j(str, fileDescriptor, printWriter, strArr);
    }
}
