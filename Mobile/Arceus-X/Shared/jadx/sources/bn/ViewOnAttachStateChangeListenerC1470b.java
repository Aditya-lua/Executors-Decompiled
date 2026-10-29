package bn;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bn.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&¨\u0006-"}, m31665d2 = {"Lbn/b;", "Lbn/d;", "Landroidx/lifecycle/s;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/p;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/lifecycle/l;", "findParentLifecycle", "", "enforceMainThread", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "L", "()V", "a", "()Landroidx/lifecycle/l;", "isAttached", "b", "(Z)V", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "view", "Landroidx/lifecycle/u;", "c", "Landroidx/lifecycle/u;", "localLifecycle", "d", "Z", "hasBeenDestroyed", "e", "Landroidx/lifecycle/l;", "parentLifecycle", "f", "destroyOnDetach", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class ViewOnAttachStateChangeListenerC1470b implements InterfaceC1472d, InterfaceC0980s, View.OnAttachStateChangeListener, InterfaceC0974p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<View, AbstractC0966l> findParentLifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C0984u localLifecycle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean hasBeenDestroyed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public AbstractC0966l parentLifecycle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean destroyOnDetach;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.lifecycle.l> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnAttachStateChangeListenerC1470b(@NotNull Function1<? super View, ? extends AbstractC0966l> findParentLifecycle, boolean z10) {
        C0984u c0984uM4981g;
        Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
        this.findParentLifecycle = findParentLifecycle;
        if (z10) {
            c0984uM4981g = new C0984u(this);
        } else {
            c0984uM4981g = C0984u.m4981g(this);
            Intrinsics.checkNotNullExpressionValue(c0984uM4981g, "createUnsafe(this)");
        }
        this.localLifecycle = c0984uM4981g;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7542c(ViewOnAttachStateChangeListenerC1470b viewOnAttachStateChangeListenerC1470b, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            View view = viewOnAttachStateChangeListenerC1470b.view;
            z10 = view == null ? false : view.isAttachedToWindow();
        }
        viewOnAttachStateChangeListenerC1470b.m7544b(z10);
    }

    @Override // bn.InterfaceC1472d
    /* JADX INFO: renamed from: L */
    public void mo7543L() {
        if (this.destroyOnDetach) {
            return;
        }
        this.destroyOnDetach = true;
        m7542c(this, false, 1, null);
    }

    @Override // androidx.p616lifecycle.InterfaceC0980s
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return this.localLifecycle;
    }

    /* JADX INFO: renamed from: b */
    public final void m7544b(boolean isAttached) {
        AbstractC0966l abstractC0966l = this.parentLifecycle;
        AbstractC0966l.b state = abstractC0966l == null ? null : abstractC0966l.getState();
        AbstractC0966l.b state2 = this.localLifecycle.getState();
        Intrinsics.checkNotNullExpressionValue(state2, "localLifecycle.currentState");
        AbstractC0966l.b bVar = AbstractC0966l.b.DESTROYED;
        if (state2 == bVar || this.hasBeenDestroyed) {
            this.view = null;
            return;
        }
        C0984u c0984u = this.localLifecycle;
        if (this.destroyOnDetach && !isAttached) {
            state = bVar;
        } else if (state == null && state2 != (state = AbstractC0966l.b.INITIALIZED)) {
            throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
        }
        if (state == bVar) {
            this.hasBeenDestroyed = true;
            AbstractC0966l abstractC0966l2 = this.parentLifecycle;
            if (abstractC0966l2 != null) {
                abstractC0966l2.mo4938d(this);
            }
            this.parentLifecycle = null;
            View view = this.view;
            if (view != null) {
                this.view = null;
                view.removeOnAttachStateChangeListener(this);
            }
            AbstractC0966l.b bVar2 = AbstractC0966l.b.INITIALIZED;
            if (state2 == bVar2) {
                bVar = bVar2;
            }
        } else {
            bVar = state;
        }
        c0984u.m4991o(bVar);
    }

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NotNull InterfaceC0980s source, @NotNull AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        m7542c(this, false, 1, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        if (this.localLifecycle.getState() == AbstractC0966l.b.DESTROYED || this.hasBeenDestroyed) {
            return;
        }
        this.view = v5;
        AbstractC0966l abstractC0966l = this.parentLifecycle;
        AbstractC0966l abstractC0966lInvoke = this.findParentLifecycle.invoke(v5);
        this.parentLifecycle = abstractC0966lInvoke;
        if (abstractC0966lInvoke != abstractC0966l) {
            if (abstractC0966l != null) {
                abstractC0966l.mo4938d(this);
            }
            AbstractC0966l abstractC0966l2 = this.parentLifecycle;
            if (abstractC0966l2 != null) {
                abstractC0966l2.mo4935a(this);
            }
        }
        m7544b(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        m7544b(false);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 kotlin.jvm.functions.Function1)
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
     A[MD:(kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.lifecycle.l>, boolean):void (m)] (LINE:4) call: bn.b.<init>(kotlin.jvm.functions.Function1, boolean):void type: THIS */
    public /* synthetic */ ViewOnAttachStateChangeListenerC1470b(Function1 function1, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i10 & 2) != 0 ? true : z10);
    }
}
