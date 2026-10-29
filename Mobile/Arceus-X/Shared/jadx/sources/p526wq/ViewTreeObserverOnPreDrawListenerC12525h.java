package p526wq;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wq.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m31665d2 = {"Lwq/h;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "runnable", "<init>", "(Landroid/view/View;Ljava/lang/Runnable;)V", "", "onPreDraw", "()Z", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "a", "()V", "Landroid/view/View;", "b", "Ljava/lang/Runnable;", "Landroid/view/ViewTreeObserver;", "c", "Landroid/view/ViewTreeObserver;", "viewTreeObserver", "d", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ViewTreeObserverOnPreDrawListenerC12525h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Runnable runnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ViewTreeObserver viewTreeObserver;

    /* JADX INFO: renamed from: wq.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lwq/h$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "runnable", "Lwq/h;", "a", "(Landroid/view/View;Ljava/lang/Runnable;)Lwq/h;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: wq.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ViewTreeObserverOnPreDrawListenerC12525h m46880a(@NotNull View view, @NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ViewTreeObserverOnPreDrawListenerC12525h viewTreeObserverOnPreDrawListenerC12525h = new ViewTreeObserverOnPreDrawListenerC12525h(view, runnable, null);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC12525h);
            view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC12525h);
            return viewTreeObserverOnPreDrawListenerC12525h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View), (r2v0 java.lang.Runnable) A[MD:(android.view.View, java.lang.Runnable):void (m)] (LINE:1) call: wq.h.<init>(android.view.View, java.lang.Runnable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC12525h(View view, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, runnable);
    }

    /* JADX INFO: renamed from: a */
    public final void m46879a() {
        if (this.viewTreeObserver.isAlive()) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m46879a();
        this.runnable.run();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        ViewTreeObserver viewTreeObserver = v5.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        this.viewTreeObserver = viewTreeObserver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        m46879a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ViewTreeObserverOnPreDrawListenerC12525h(View view, Runnable runnable) {
        this.view = view;
        this.runnable = runnable;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        this.viewTreeObserver = viewTreeObserver;
    }
}
