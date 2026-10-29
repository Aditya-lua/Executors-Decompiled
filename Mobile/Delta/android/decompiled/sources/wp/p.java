package wp;

import an.ViewEnvironment;
import an.a0;
import an.x;
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
import jq.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lwp/p;", "Lan/k;", "Lwp/i;", "Lxp/b;", "binding", "<init>", "(Lxp/b;)V", "rendering", "Lan/y;", "viewEnvironment", "", "l", "(Lwp/i;Lan/y;)V", "Landroid/content/Context;", "context", "h", "(Lwp/i;Landroid/content/Context;)V", "b", "Lxp/b;", "Landroid/app/Dialog;", "c", "Landroid/app/Dialog;", "optionsDialog", "d", "a", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements an.k<SandboxScreen<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final xp.b binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* JADX INFO: renamed from: wp.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lwp/p$a;", "Lan/a0;", "Lwp/i;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lwp/i;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<SandboxScreen<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<SandboxScreen<?>> f34498a;

        /* JADX INFO: renamed from: wp.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0634a extends kotlin.jvm.internal.k implements zt.n<LayoutInflater, ViewGroup, Boolean, xp.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0634a f34499a = new C0634a();

            public C0634a() {
                super(3, xp.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);
            }

            public final xp.b d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return xp.b.c(p8, viewGroup, z10);
            }

            @Override // zt.n
            public /* bridge */ /* synthetic */ xp.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: wp.p$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<xp.b, p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34500a = new b();

            public b() {
                super(1, p.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final p invoke(xp.b p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new p(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // an.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SandboxScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f34498a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // an.a0
        @NotNull
        public hu.c<? super SandboxScreen<?>> getType() {
            return this.f34498a.getType();
        }

        public Companion() {
            an.k.Companion companion = an.k.INSTANCE;
            this.f34498a = new x(d0.b(SandboxScreen.class), C0634a.f34499a, b.f34500a);
        }
    }

    public p(@NotNull xp.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public static final void i(Dialog dialog, View view) {
        dialog.dismiss();
    }

    public static final void j(SandboxScreen sandboxScreen, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        sandboxScreen.d().invoke(Boolean.valueOf(z10));
    }

    public static final void k(p pVar, DialogInterface dialogInterface) {
        pVar.optionsDialog = null;
    }

    public static final void m(SandboxScreen sandboxScreen, xp.b bVar, View view) {
        sandboxScreen.c().invoke();
        Toast.makeText(bVar.f35281c.getRootView().getContext(), "Setting the debug flag to: " + c.INSTANCE.a(sandboxScreen.a().invoke()), 0).show();
    }

    public static final boolean n(p pVar, SandboxScreen sandboxScreen, Context context, View view) {
        Intrinsics.checkNotNull(context);
        pVar.h(sandboxScreen, context);
        return true;
    }

    public static final Unit o(p pVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = pVar.binding.f35281c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = (int) (((double) insetsIgnoringVisibility.bottom) + jq.j.c(16.0d));
        floatingActionButton.setLayoutParams(fVar);
        return Unit.f22483a;
    }

    public final void h(final SandboxScreen<?> rendering, Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, hc.j.f18933d);
        xp.a aVarC = xp.a.c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        dialog.setContentView(aVarC.getRoot());
        aVarC.f35279c.setTitle("Sandbox options");
        aVarC.f35279c.setNavigationIcon(s.f21652u);
        aVarC.f35279c.setNavigationOnClickListener(new View.OnClickListener() { // from class: wp.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.i(dialog, view);
            }
        });
        aVarC.b.setChecked(rendering.getSimulateGovIdNfc());
        aVarC.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wp.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                p.j(rendering, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wp.o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                p.k(this.f34495a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }

    @Override // an.k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final SandboxScreen<?> rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final xp.b bVar = this.binding;
        final Context context = bVar.getRoot().getContext();
        bVar.f35281c.setOnClickListener(new View.OnClickListener() { // from class: wp.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.m(rendering, bVar, view);
            }
        });
        bVar.f35281c.setOnLongClickListener(new View.OnLongClickListener() { // from class: wp.k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return p.n(this.f34490a, rendering, context, view);
            }
        });
        FloatingActionButton floatingActionButton = bVar.f35281c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        wq.g.g(floatingActionButton, new Function1() { // from class: wp.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.o(this.f34492a, (WindowInsetsCompat) obj);
            }
        });
        bVar.b.c(rendering.b(), viewEnvironment);
    }
}
