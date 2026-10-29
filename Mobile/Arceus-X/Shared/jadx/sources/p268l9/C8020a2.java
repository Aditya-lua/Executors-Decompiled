package p268l9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p093e4.ActivityC4831q;

/* JADX INFO: renamed from: l9.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8020a2 extends ComponentCallbacksC0929c implements InterfaceC8045j {

    /* JADX INFO: renamed from: g0 */
    public static final WeakHashMap f29971g0 = new WeakHashMap();

    /* JADX INFO: renamed from: f0 */
    public final C8095z1 f29972f0 = new C8095z1();

    /* JADX INFO: renamed from: b2 */
    public static C8020a2 m33111b2(ActivityC4831q activityC4831q) {
        C8020a2 c8020a2;
        FragmentManager fragmentManagerM23360l1 = activityC4831q.m23360l1();
        WeakHashMap weakHashMap = f29971g0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC4831q);
        if (weakReference != null && (c8020a2 = (C8020a2) weakReference.get()) != null) {
            return c8020a2;
        }
        try {
            C8020a2 c8020a3 = (C8020a2) fragmentManagerM23360l1.m4444n0("SLifecycleFragmentImpl");
            if (c8020a3 == null || c8020a3.m4710v0()) {
                c8020a3 = new C8020a2();
                fragmentManagerM23360l1.m4452r().m4777d(c8020a3, "SLifecycleFragmentImpl").mo4509h();
            }
            weakHashMap.put(activityC4831q, new WeakReference(c8020a3));
            return c8020a3;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: A0 */
    public final void mo4584A0(int i10, int i11, Intent intent) {
        super.mo4584A0(i10, i11, intent);
        this.f29972f0.m33309f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public final void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        this.f29972f0.m33306c(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: K0 */
    public final void mo4613K0() {
        super.mo4613K0();
        this.f29972f0.m33312i();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public final void mo4658a1() {
        super.mo4658a1();
        this.f29972f0.m33308e();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: b1 */
    public final void mo4661b1(Bundle bundle) {
        super.mo4661b1(bundle);
        this.f29972f0.m33310g(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public final void mo4663c1() {
        super.mo4663c1();
        this.f29972f0.m33307d();
    }

    @Override // p268l9.InterfaceC8045j
    /* JADX INFO: renamed from: d */
    public final <T extends C8042i> T mo33112d(String str, Class<T> cls) {
        return (T) this.f29972f0.m33304a(str, cls);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public final void mo4665d1() {
        super.mo4665d1();
        this.f29972f0.m33311h();
    }

    @Override // p268l9.InterfaceC8045j
    /* JADX INFO: renamed from: f */
    public final Activity mo33113f() {
        return m4693p();
    }

    @Override // p268l9.InterfaceC8045j
    /* JADX INFO: renamed from: g */
    public final void mo33114g(String str, @NonNull C8042i c8042i) {
        this.f29972f0.m33305b(str, c8042i);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: l */
    public final void mo4682l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4682l(str, fileDescriptor, printWriter, strArr);
        this.f29972f0.m33313j(str, fileDescriptor, printWriter, strArr);
    }
}
