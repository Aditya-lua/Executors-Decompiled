package l9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends androidx.fragment.app.c implements j {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final WeakHashMap f22987g0 = new WeakHashMap();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final z1 f22988f0 = new z1();

    public static a2 b2(e4.q qVar) {
        a2 a2Var;
        FragmentManager fragmentManagerL1 = qVar.l1();
        WeakHashMap weakHashMap = f22987g0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(qVar);
        if (weakReference != null && (a2Var = (a2) weakReference.get()) != null) {
            return a2Var;
        }
        try {
            a2 a2Var2 = (a2) fragmentManagerL1.n0("SLifecycleFragmentImpl");
            if (a2Var2 == null || a2Var2.v0()) {
                a2Var2 = new a2();
                fragmentManagerL1.r().d(a2Var2, "SLifecycleFragmentImpl").h();
            }
            weakHashMap.put(qVar, new WeakReference(a2Var2));
            return a2Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.c
    public final void A0(int i10, int i11, Intent intent) {
        super.A0(i10, i11, intent);
        this.f22988f0.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.c
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        this.f22988f0.c(bundle);
    }

    @Override // androidx.fragment.app.c
    public final void K0() {
        super.K0();
        this.f22988f0.i();
    }

    @Override // androidx.fragment.app.c
    public final void a1() {
        super.a1();
        this.f22988f0.e();
    }

    @Override // androidx.fragment.app.c
    public final void b1(Bundle bundle) {
        super.b1(bundle);
        this.f22988f0.g(bundle);
    }

    @Override // androidx.fragment.app.c
    public final void c1() {
        super.c1();
        this.f22988f0.d();
    }

    @Override // l9.j
    public final <T extends i> T d(String str, Class<T> cls) {
        return (T) this.f22988f0.a(str, cls);
    }

    @Override // androidx.fragment.app.c
    public final void d1() {
        super.d1();
        this.f22988f0.h();
    }

    @Override // l9.j
    public final Activity f() {
        return p();
    }

    @Override // l9.j
    public final void g(String str, @NonNull i iVar) {
        this.f22988f0.b(str, iVar);
    }

    @Override // androidx.fragment.app.c
    public final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.l(str, fileDescriptor, printWriter, strArr);
        this.f22988f0.j(str, fileDescriptor, printWriter, strArr);
    }
}
