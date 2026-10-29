package p517wh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.roblox.engine.jni.NativeInputInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import sg.C11295a1;

/* JADX INFO: renamed from: wh.p0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lwh/p0;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "f", "(Landroid/app/Activity;)V", "i", "e", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "pendingHandler", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "pendingListener", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "d", "Ljava/lang/ref/WeakReference;", "pendingRootView", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12454p0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12454p0 f44555a = new C12454p0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Handler pendingHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static ViewTreeObserver.OnGlobalLayoutListener pendingListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<View> pendingRootView;

    /* JADX INFO: renamed from: wh.p0$a */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"wh/p0$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference<Activity> f44559a;

        public a(WeakReference<Activity> weakReference) {
            this.f44559a = weakReference;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Activity activity = this.f44559a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                C12454p0.f44555a.m46692e();
            } else if (activity.getResources().getConfiguration().orientation == 2) {
                C12454p0.f44555a.m46692e();
                C6124q.m27063h("GameStreamingOriCtrl", "Rotation to landscape complete, firing resolution ready");
                NativeInputInterface.nativeSignalGameStreamingResolutionReady();
            }
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* JADX INFO: renamed from: f */
    public static final void m46687f(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.runOnUiThread(new Runnable() { // from class: wh.m0
            @Override // java.lang.Runnable
            public final void run() {
                C12454p0.m46688g(activity);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m46688g(Activity activity) {
        f44555a.m46692e();
        if (!C11295a1.m42469p0()) {
            C6124q.m27063h("GameStreamingOriCtrl", "Not a phone, firing resolution ready immediately");
            NativeInputInterface.nativeSignalGameStreamingResolutionReady();
            return;
        }
        if (activity.getResources().getConfiguration().orientation == 2) {
            C6124q.m27063h("GameStreamingOriCtrl", "Already landscape, locking orientation and firing resolution ready");
            activity.setRequestedOrientation(6);
            NativeInputInterface.nativeSignalGameStreamingResolutionReady();
            return;
        }
        C6124q.m27063h("GameStreamingOriCtrl", "Requesting landscape rotation before streaming");
        final WeakReference weakReference = new WeakReference(activity);
        Handler handler = new Handler(Looper.getMainLooper());
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        a aVar = new a(weakReference);
        pendingHandler = handler;
        pendingListener = aVar;
        pendingRootView = new WeakReference<>(decorView);
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        activity.setRequestedOrientation(6);
        handler.postDelayed(new Runnable() { // from class: wh.o0
            @Override // java.lang.Runnable
            public final void run() {
                C12454p0.m46689h(weakReference);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: h */
    public static final void m46689h(WeakReference weakReference) {
        Activity activity = (Activity) weakReference.get();
        f44555a.m46692e();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        C6124q.m27066k("GameStreamingOriCtrl", "Orientation change timed out, firing resolution ready anyway");
        NativeInputInterface.nativeSignalGameStreamingResolutionReady();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* JADX INFO: renamed from: i */
    public static final void m46690i(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.runOnUiThread(new Runnable() { // from class: wh.n0
            @Override // java.lang.Runnable
            public final void run() {
                C12454p0.m46691j(activity);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m46691j(Activity activity) {
        f44555a.m46692e();
        if (C11295a1.m42469p0()) {
            C6124q.m27063h("GameStreamingOriCtrl", "Reverting to default orientation after streaming stopped");
            if (activity instanceof InterfaceC12455q) {
                ((InterfaceC12455q) activity).mo14741E();
            } else {
                activity.setRequestedOrientation(7);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m46692e() {
        View view;
        ViewTreeObserver viewTreeObserver;
        Handler handler = pendingHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        WeakReference<View> weakReference = pendingRootView;
        if (weakReference != null && (view = weakReference.get()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(pendingListener);
        }
        pendingHandler = null;
        pendingListener = null;
        pendingRootView = null;
    }
}
