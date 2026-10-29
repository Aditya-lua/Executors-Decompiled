package p268l9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l9.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC8089x1 extends Fragment implements InterfaceC8045j {

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f30122b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C8095z1 f30123a = new C8095z1();

    /* JADX INFO: renamed from: a */
    public static FragmentC8089x1 m33295a(Activity activity) {
        FragmentC8089x1 fragmentC8089x1;
        WeakHashMap weakHashMap = f30122b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC8089x1 = (FragmentC8089x1) weakReference.get()) != null) {
            return fragmentC8089x1;
        }
        try {
            FragmentC8089x1 fragmentC8089x2 = (FragmentC8089x1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC8089x2 == null || fragmentC8089x2.isRemoving()) {
                fragmentC8089x2 = new FragmentC8089x1();
                activity.getFragmentManager().beginTransaction().add(fragmentC8089x2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC8089x2));
            return fragmentC8089x2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // p268l9.InterfaceC8045j
    /* JADX INFO: renamed from: d */
    public final <T extends C8042i> T mo33112d(String str, Class<T> cls) {
        return (T) this.f30123a.m33304a(str, cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f30123a.m33313j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p268l9.InterfaceC8045j
    /* JADX INFO: renamed from: f */
    public final Activity mo33113f() {
        return getActivity();
    }

    @Override // p268l9.InterfaceC8045j
    /* JADX INFO: renamed from: g */
    public final void mo33114g(String str, @NonNull C8042i c8042i) {
        this.f30123a.m33305b(str, c8042i);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f30123a.m33309f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30123a.m33306c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f30123a.m33312i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f30123a.m33308e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f30123a.m33310g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f30123a.m33307d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f30123a.m33311h();
    }
}
