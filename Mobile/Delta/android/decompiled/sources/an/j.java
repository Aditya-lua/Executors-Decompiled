package an;

import android.content.Context;
import android.view.View;
import e.m0;
import e.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004*\u0001\u001b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001e"}, d2 = {"Lan/j;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/f;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/ui/BackPressHandler;", "handler", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "b", "()V", "c", "attachedView", "onViewAttachedToWindow", "(Landroid/view/View;)V", "detachedView", "onViewDetachedFromWindow", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "a", "Landroid/view/View;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "an/j$a", "Lan/j$a;", "onBackPressedCallback", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class j implements View.OnAttachStateChangeListener, androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a onBackPressedCallback;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"an/j$a", "Le/m0;", "", "handleOnBackPressed", "()V", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends m0 {
        public a() {
            super(false);
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            j.this.a().invoke();
        }
    }

    public j(@NotNull View view, @NotNull Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.view = view;
        this.handler = handler;
        this.onBackPressedCallback = new a();
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.handler;
    }

    public final void b() {
        androidx.p000lifecycle.l lVarA;
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        r0 r0VarB = e.b(context);
        if (r0VarB == null) {
            return;
        }
        r0VarB.Q().d(r0VarB, this.onBackPressedCallback);
        this.view.addOnAttachStateChangeListener(this);
        if (this.view.isAttachedToWindow()) {
            onViewAttachedToWindow(this.view);
        }
        androidx.p000lifecycle.s sVarA = androidx.p000lifecycle.View.a(this.view);
        if (sVarA == null || (lVarA = sVarA.a()) == null) {
            return;
        }
        lVarA.a(this);
    }

    public final void c() {
        androidx.p000lifecycle.l lVarA;
        this.onBackPressedCallback.remove();
        this.view.removeOnAttachStateChangeListener(this);
        androidx.p000lifecycle.s sVarA = androidx.p000lifecycle.View.a(this.view);
        if (sVarA == null || (lVarA = sVarA.a()) == null) {
            return;
        }
        lVarA.d(this);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View attachedView) {
        Intrinsics.checkNotNullParameter(attachedView, "attachedView");
        if (this.view != attachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.onBackPressedCallback.setEnabled(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View detachedView) {
        Intrinsics.checkNotNullParameter(detachedView, "detachedView");
        if (this.view != detachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.onBackPressedCallback.setEnabled(false);
    }
}
