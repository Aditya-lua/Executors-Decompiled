package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b!\u0010\u0014R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R!\u00105\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b4\u0010\u0014\u001a\u0004\b2\u00103R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Le/w;", "Landroid/app/Dialog;", "Landroidx/lifecycle/s;", "Le/r0;", "Lo4/d;", "Ld5/i;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "h", "Landroidx/lifecycle/u;", "a", "Landroidx/lifecycle/u;", "_lifecycleRegistry", "Ld5/h;", "b", "Ld5/h;", "savedStateRegistryController", "Lo4/a;", "c", "Ljt/h;", "g", "()Lo4/a;", "onBackPressedInput", "Le/p0;", "d", "Q", "()Le/p0;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "Ld5/f;", "A", "()Ld5/f;", "savedStateRegistry", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "Lo4/c;", "f", "()Lo4/c;", "navigationEventDispatcher", "e", "()Landroidx/lifecycle/u;", "lifecycleRegistry", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class w extends Dialog implements androidx.p000lifecycle.s, r0, o4.d, d5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.p000lifecycle.u _lifecycleRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d5.h savedStateRegistryController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h onBackPressedInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h onBackPressedDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = d5.h.INSTANCE.b(this);
        this.onBackPressedInput = jt.i.b(new Function0() { // from class: e.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.k(this.f14953a);
            }
        });
        this.onBackPressedDispatcher = jt.i.b(new Function0() { // from class: e.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.i(this.f14954a);
            }
        });
    }

    private final o4.a g() {
        return (o4.a) this.onBackPressedInput.getValue();
    }

    public static final p0 i(final w wVar) {
        return new p0(new Runnable() { // from class: e.v
            @Override // java.lang.Runnable
            public final void run() {
                w.j(this.f14959a);
            }
        });
    }

    public static final void j(w wVar) {
        super.onBackPressed();
    }

    public static final o4.a k(w wVar) {
        o4.a aVar = new o4.a();
        wVar.f().c(aVar);
        return aVar;
    }

    @Override // d5.i
    @NotNull
    public d5.f A() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // e.r0
    @NotNull
    public final p0 Q() {
        return (p0) this.onBackPressedDispatcher.getValue();
    }

    @Override // androidx.p000lifecycle.s
    @NotNull
    public androidx.p000lifecycle.l a() {
        return e();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        h();
        super.addContentView(view, params);
    }

    public final androidx.p000lifecycle.u e() {
        androidx.p000lifecycle.u uVar = this._lifecycleRegistry;
        if (uVar != null) {
            return uVar;
        }
        androidx.p000lifecycle.u uVar2 = new androidx.p000lifecycle.u(this);
        this._lifecycleRegistry = uVar2;
        return uVar2;
    }

    @NotNull
    public o4.c f() {
        return Q().getEventDispatcher();
    }

    public void h() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        androidx.p000lifecycle.View.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        w0.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        d5.m.b(decorView3, this);
        Window window4 = getWindow();
        Intrinsics.checkNotNull(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        o4.r.a(decorView4, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        g().m();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            p0 p0VarQ = Q();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            p0VarQ.j(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        e().j(androidx.lifecycle.l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        e().j(androidx.lifecycle.l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        e().j(androidx.lifecycle.l.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        h();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        h();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        h();
        super.setContentView(view, params);
    }
}
