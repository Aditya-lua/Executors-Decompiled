package bn;

import android.view.View;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.u;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&¨\u0006-"}, d2 = {"Lbn/b;", "Lbn/d;", "Landroidx/lifecycle/s;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/p;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/lifecycle/l;", "findParentLifecycle", "", "enforceMainThread", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "L", "()V", "a", "()Landroidx/lifecycle/l;", "isAttached", "b", "(Z)V", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "view", "Landroidx/lifecycle/u;", "c", "Landroidx/lifecycle/u;", "localLifecycle", "d", "Z", "hasBeenDestroyed", "e", "Landroidx/lifecycle/l;", "parentLifecycle", "f", "destroyOnDetach", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b implements d, s, View.OnAttachStateChangeListener, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<View, l> findParentLifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u localLifecycle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean hasBeenDestroyed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public l parentLifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean destroyOnDetach;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super View, ? extends l> findParentLifecycle, boolean z10) {
        u uVarG;
        Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
        this.findParentLifecycle = findParentLifecycle;
        if (z10) {
            uVarG = new u(this);
        } else {
            uVarG = u.g(this);
            Intrinsics.checkNotNullExpressionValue(uVarG, "createUnsafe(this)");
        }
        this.localLifecycle = uVarG;
    }

    public static /* synthetic */ void c(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            View view = bVar.view;
            z10 = view == null ? false : view.isAttachedToWindow();
        }
        bVar.b(z10);
    }

    @Override // bn.d
    public void L() {
        if (this.destroyOnDetach) {
            return;
        }
        this.destroyOnDetach = true;
        c(this, false, 1, null);
    }

    @Override // androidx.p000lifecycle.s
    @NotNull
    public l a() {
        return this.localLifecycle;
    }

    public final void b(boolean isAttached) {
        l lVar = this.parentLifecycle;
        l.b state = lVar == null ? null : lVar.getState();
        l.b state2 = this.localLifecycle.getState();
        Intrinsics.checkNotNullExpressionValue(state2, "localLifecycle.currentState");
        l.b bVar = l.b.DESTROYED;
        if (state2 == bVar || this.hasBeenDestroyed) {
            this.view = null;
            return;
        }
        u uVar = this.localLifecycle;
        if (this.destroyOnDetach && !isAttached) {
            state = bVar;
        } else if (state == null && state2 != (state = l.b.INITIALIZED)) {
            throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
        }
        if (state == bVar) {
            this.hasBeenDestroyed = true;
            l lVar2 = this.parentLifecycle;
            if (lVar2 != null) {
                lVar2.d(this);
            }
            this.parentLifecycle = null;
            View view = this.view;
            if (view != null) {
                this.view = null;
                view.removeOnAttachStateChangeListener(this);
            }
            l.b bVar2 = l.b.INITIALIZED;
            if (state2 == bVar2) {
                bVar = bVar2;
            }
        } else {
            bVar = state;
        }
        uVar.o(bVar);
    }

    @Override // androidx.p000lifecycle.p
    public void g(@NotNull s source, @NotNull l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        c(this, false, 1, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        if (this.localLifecycle.getState() == l.b.DESTROYED || this.hasBeenDestroyed) {
            return;
        }
        this.view = v5;
        l lVar = this.parentLifecycle;
        l lVarInvoke = this.findParentLifecycle.invoke(v5);
        this.parentLifecycle = lVarInvoke;
        if (lVarInvoke != lVar) {
            if (lVar != null) {
                lVar.d(this);
            }
            l lVar2 = this.parentLifecycle;
            if (lVar2 != null) {
                lVar2.a(this);
            }
        }
        b(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        b(false);
    }

    public /* synthetic */ b(Function1 function1, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i10 & 2) != 0 ? true : z10);
    }
}
