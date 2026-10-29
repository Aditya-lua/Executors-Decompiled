package p088e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.C4444h;
import p068d5.C4449m;
import p068d5.InterfaceC4445i;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p321o4.C9633a;
import p321o4.C9635c;
import p321o4.C9650r;
import p321o4.InterfaceC9636d;

/* JADX INFO: renamed from: e.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b!\u0010\u0014R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R!\u00105\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b4\u0010\u0014\u001a\u0004\b2\u00103R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, m31665d2 = {"Le/w;", "Landroid/app/Dialog;", "Landroidx/lifecycle/s;", "Le/r0;", "Lo4/d;", "Ld5/i;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "h", "Landroidx/lifecycle/u;", "a", "Landroidx/lifecycle/u;", "_lifecycleRegistry", "Ld5/h;", "b", "Ld5/h;", "savedStateRegistryController", "Lo4/a;", "c", "Ljt/h;", "g", "()Lo4/a;", "onBackPressedInput", "Le/p0;", "d", "Q", "()Le/p0;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "Ld5/f;", "A", "()Ld5/f;", "savedStateRegistry", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "Lo4/c;", "f", "()Lo4/c;", "navigationEventDispatcher", "e", "()Landroidx/lifecycle/u;", "lifecycleRegistry", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class DialogC4736w extends Dialog implements InterfaceC0980s, InterfaceC4727r0, InterfaceC9636d, InterfaceC4445i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public C0984u _lifecycleRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C4444h savedStateRegistryController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h onBackPressedInput;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h onBackPressedDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4736w(@NotNull Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = C4444h.INSTANCE.m22364b(this);
        this.onBackPressedInput = C7342i.m30456b(new Function0() { // from class: e.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC4736w.m23104k(this.f19258a);
            }
        });
        this.onBackPressedDispatcher = C7342i.m30456b(new Function0() { // from class: e.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC4736w.m23102i(this.f19259a);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    private final C9633a m23101g() {
        return (C9633a) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static final C4723p0 m23102i(final DialogC4736w dialogC4736w) {
        return new C4723p0(new Runnable() { // from class: e.v
            @Override // java.lang.Runnable
            public final void run() {
                DialogC4736w.m23103j(this.f19265a);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m23103j(DialogC4736w dialogC4736w) {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: k */
    public static final C9633a m23104k(DialogC4736w dialogC4736w) {
        C9633a c9633a = new C9633a();
        dialogC4736w.m23106f().m38023c(c9633a);
        return c9633a;
    }

    @Override // p068d5.InterfaceC4445i
    @NotNull
    /* JADX INFO: renamed from: A */
    public C4442f mo4583A() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // p088e.InterfaceC4727r0
    @NotNull
    /* JADX INFO: renamed from: Q */
    public final C4723p0 mo23043Q() {
        return (C4723p0) this.onBackPressedDispatcher.getValue();
    }

    @Override // androidx.p616lifecycle.InterfaceC0980s
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return m23105e();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        m23107h();
        super.addContentView(view, params);
    }

    /* JADX INFO: renamed from: e */
    public final C0984u m23105e() {
        C0984u c0984u = this._lifecycleRegistry;
        if (c0984u != null) {
            return c0984u;
        }
        C0984u c0984u2 = new C0984u(this);
        this._lifecycleRegistry = c0984u2;
        return c0984u2;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public C9635c m23106f() {
        return mo23043Q().getEventDispatcher();
    }

    /* JADX INFO: renamed from: h */
    public void m23107h() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        androidx.p616lifecycle.View.m4902b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        C4737w0.m23109b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        C4449m.m22373b(decorView3, this);
        Window window4 = getWindow();
        Intrinsics.checkNotNull(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        C9650r.m38083a(decorView4, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        m23101g().m38015m();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            C4723p0 c4723p0Mo23043Q = mo23043Q();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c4723p0Mo23043Q.m23082j(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m22360d(savedInstanceState);
        m23105e().m4986j(AbstractC0966l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.savedStateRegistryController.m22361e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m23105e().m4986j(AbstractC0966l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m23105e().m4986j(AbstractC0966l.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        m23107h();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m23107h();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        m23107h();
        super.setContentView(view, params);
    }
}
