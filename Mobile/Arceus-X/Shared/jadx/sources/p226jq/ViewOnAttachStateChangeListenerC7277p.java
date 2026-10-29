package p226jq;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p088e.AbstractC4717m0;

/* JADX INFO: renamed from: jq.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Ljq/p;", "Le/m0;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "", "handleOnBackPressed", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lkotlin/Function0;", "X", "Lkotlin/jvm/functions/Function0;", "getHandler", "()Lkotlin/jvm/functions/Function0;", "s", "(Lkotlin/jvm/functions/Function0;)V", "handler", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ViewOnAttachStateChangeListenerC7277p extends AbstractC4717m0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> handler;

    public ViewOnAttachStateChangeListenerC7277p() {
        super(false);
        this.handler = new Function0() { // from class: jq.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewOnAttachStateChangeListenerC7277p.m30319r();
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m30319r() {
        return Unit.f29331a;
    }

    @Override // p088e.AbstractC4717m0
    public void handleOnBackPressed() {
        this.handler.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        setEnabled(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        setEnabled(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m30320s(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.handler = function0;
    }
}
