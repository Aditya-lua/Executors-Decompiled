package kq;

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
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import nn.ViewEnvironment;
import nn.b0;
import nn.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import xq.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkq/p;", "Lnn/k;", "Lkq/i;", "Llq/b;", "binding", "<init>", "(Llq/b;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "l", "(Lkq/i;Lnn/z;)V", "Landroid/content/Context;", "context", "h", "(Lkq/i;Landroid/content/Context;)V", "b", "Llq/b;", "Landroid/app/Dialog;", "c", "Landroid/app/Dialog;", "optionsDialog", "d", "a", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements nn.k<SandboxScreen<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lq.b binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* JADX INFO: renamed from: kq.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkq/p$a;", "Lnn/b0;", "Lkq/i;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lkq/i;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<SandboxScreen<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0<SandboxScreen<?>> f21759a;

        /* JADX INFO: renamed from: kq.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0413a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, lq.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0413a f21760a = new C0413a();

            public C0413a() {
                super(3, lq.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);
            }

            public final lq.b d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return lq.b.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ lq.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: kq.p$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<lq.b, p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f21761a = new b();

            public b() {
                super(1, p.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final p invoke(lq.b p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new p(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SandboxScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f21759a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super SandboxScreen<?>> getType() {
            return this.f21759a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f21759a = new y(d0.b(SandboxScreen.class), C0413a.f21760a, b.f21761a);
        }
    }

    public p(@NotNull lq.b binding) {
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

    public static final void m(SandboxScreen sandboxScreen, lq.b bVar, View view) {
        sandboxScreen.c().invoke();
        Toast.makeText(bVar.f22459c.getRootView().getContext(), "Setting the debug flag to: " + c.INSTANCE.a(sandboxScreen.a().invoke()), 0).show();
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
        FloatingActionButton floatingActionButton = pVar.binding.f22459c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = (int) (((double) insetsIgnoringVisibility.bottom) + xq.j.c(16.0d));
        floatingActionButton.setLayoutParams(fVar);
        return Unit.f21506a;
    }

    public final void h(final SandboxScreen<?> rendering, Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, jc.j.f20443d);
        lq.a aVarC = lq.a.c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        dialog.setContentView(aVarC.getRoot());
        aVarC.f22457c.setTitle("Sandbox options");
        aVarC.f22457c.setNavigationIcon(s.f37019u);
        aVarC.f22457c.setNavigationOnClickListener(new View.OnClickListener() { // from class: kq.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.i(dialog, view);
            }
        });
        aVarC.b.setChecked(rendering.getSimulateGovIdNfc());
        aVarC.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kq.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                p.j(rendering, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: kq.o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                p.k(this.f21756a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }

    @Override // nn.k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final SandboxScreen<?> rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final lq.b bVar = this.binding;
        final Context context = bVar.getRoot().getContext();
        bVar.f22459c.setOnClickListener(new View.OnClickListener() { // from class: kq.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.m(rendering, bVar, view);
            }
        });
        bVar.f22459c.setOnLongClickListener(new View.OnLongClickListener() { // from class: kq.k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return p.n(this.f21751a, rendering, context, view);
            }
        });
        FloatingActionButton floatingActionButton = bVar.f22459c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        kr.g.g(floatingActionButton, new Function1() { // from class: kq.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.o(this.f21753a, (WindowInsetsCompat) obj);
            }
        });
        bVar.b.c(rendering.b(), viewEnvironment);
    }
}
