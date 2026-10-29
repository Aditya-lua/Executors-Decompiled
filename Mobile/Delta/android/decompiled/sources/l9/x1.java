package l9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends Fragment implements j {
    public static final WeakHashMap b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f23104a = new z1();

    public static x1 a(Activity activity) {
        x1 x1Var;
        WeakHashMap weakHashMap = b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (x1Var = (x1) weakReference.get()) != null) {
            return x1Var;
        }
        try {
            x1 x1Var2 = (x1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (x1Var2 == null || x1Var2.isRemoving()) {
                x1Var2 = new x1();
                activity.getFragmentManager().beginTransaction().add(x1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(x1Var2));
            return x1Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // l9.j
    public final <T extends i> T d(String str, Class<T> cls) {
        return (T) this.f23104a.a(str, cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f23104a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // l9.j
    public final Activity f() {
        return getActivity();
    }

    @Override // l9.j
    public final void g(String str, @NonNull i iVar) {
        this.f23104a.b(str, iVar);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f23104a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23104a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f23104a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f23104a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f23104a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f23104a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f23104a.h();
    }
}
