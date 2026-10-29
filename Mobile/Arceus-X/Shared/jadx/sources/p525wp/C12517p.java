package p525wp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p194ic.C6746j;
import p226jq.C7265j;
import p226jq.C7281s;
import p526wq.C12524g;
import p555xp.C12886a;
import p555xp.C12887b;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: wp.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m31665d2 = {"Lwp/p;", "Lan/k;", "Lwp/i;", "Lxp/b;", "binding", "<init>", "(Lxp/b;)V", "rendering", "Lan/y;", "viewEnvironment", "", "l", "(Lwp/i;Lan/y;)V", "Landroid/content/Context;", "context", "h", "(Lwp/i;Landroid/content/Context;)V", "b", "Lxp/b;", "Landroid/app/Dialog;", "c", "Landroid/app/Dialog;", "optionsDialog", "d", "a", "sandbox_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12517p implements InterfaceC0382k<SandboxScreen<?>> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12887b binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* JADX INFO: renamed from: wp.p$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lwp/p$a;", "Lan/a0;", "Lwp/i;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lwp/i;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "sandbox_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<SandboxScreen<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<SandboxScreen<?>> f44726a;

        /* JADX INFO: renamed from: wp.p$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14279a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C12887b> {

            /* JADX INFO: renamed from: a */
            public static final C14279a f44727a = new C14279a();

            public C14279a() {
                super(3, C12887b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C12887b m46863d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C12887b.m47913c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C12887b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m46863d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: wp.p$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C12887b, C12517p> {

            /* JADX INFO: renamed from: a */
            public static final b f44728a = new b();

            public b() {
                super(1, C12517p.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C12517p invoke(C12887b p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C12517p(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: wp.p.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull SandboxScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f44726a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super SandboxScreen<?>> getType() {
            return this.f44726a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f44726a = new C0395x(C7731d0.m32002b(SandboxScreen.class), C14279a.f44727a, b.f44728a);
        }
    }

    public C12517p(@NotNull C12887b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    /* JADX INFO: renamed from: i */
    public static final void m46854i(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public static final void m46855j(SandboxScreen sandboxScreen, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        sandboxScreen.m46846d().invoke(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: k */
    public static final void m46856k(C12517p c12517p, DialogInterface dialogInterface) {
        c12517p.optionsDialog = null;
    }

    /* JADX INFO: renamed from: m */
    public static final void m46857m(SandboxScreen sandboxScreen, C12887b c12887b, View view) {
        sandboxScreen.m46845c().invoke();
        Toast.makeText(c12887b.f45750c.getRootView().getContext(), "Setting the debug flag to: " + C12504c.INSTANCE.m46827a(sandboxScreen.m46843a().invoke()), 0).show();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m46858n(C12517p c12517p, SandboxScreen sandboxScreen, Context context, View view) {
        Intrinsics.checkNotNull(context);
        c12517p.m46860h(sandboxScreen, context);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m46859o(C12517p c12517p, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = c12517p.binding.f45750c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.C0527f c0527f = (CoordinatorLayout.C0527f) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin = (int) (((double) insetsIgnoringVisibility.bottom) + C7265j.m30287c(16.0d));
        floatingActionButton.setLayoutParams(c0527f);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public final void m46860h(final SandboxScreen<?> rendering, Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, C6746j.f26112d);
        C12886a c12886aM47909c = C12886a.m47909c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(c12886aM47909c, "inflate(...)");
        dialog.setContentView(c12886aM47909c.getRoot());
        c12886aM47909c.f45747c.setTitle("Sandbox options");
        c12886aM47909c.f45747c.setNavigationIcon(C7281s.f28060u);
        c12886aM47909c.f45747c.setNavigationOnClickListener(new View.OnClickListener() { // from class: wp.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12517p.m46854i(dialog, view);
            }
        });
        c12886aM47909c.f45746b.setChecked(rendering.getSimulateGovIdNfc());
        c12886aM47909c.f45746b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wp.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                C12517p.m46855j(rendering, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wp.o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C12517p.m46856k(this.f44722a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final SandboxScreen<?> rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final C12887b c12887b = this.binding;
        final Context context = c12887b.getRoot().getContext();
        c12887b.f45750c.setOnClickListener(new View.OnClickListener() { // from class: wp.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12517p.m46857m(rendering, c12887b, view);
            }
        });
        c12887b.f45750c.setOnLongClickListener(new View.OnLongClickListener() { // from class: wp.k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C12517p.m46858n(this.f44716a, rendering, context, view);
            }
        });
        FloatingActionButton floatingActionButton = c12887b.f45750c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        C12524g.m46876g(floatingActionButton, new Function1() { // from class: wp.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12517p.m46859o(this.f44719a, (WindowInsetsCompat) obj);
            }
        });
        c12887b.f45749b.m16104c(rendering.m46844b(), viewEnvironment);
    }
}
