package no;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lno/v;", "Lnn/k;", "Lno/u2$d$c;", "Lor/h;", "Loo/c;", "binding", "<init>", "(Loo/c;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "m", "(Lno/u2$d$c;Lnn/z;)V", "Ljr/a;", "systemUiController", "h", "(Lno/u2$d$c;Ljr/a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljr/a;)V", "b", "Loo/c;", "c", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements nn.k<u2.d.ReviewCaptures>, or.h<u2.d.ReviewCaptures> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oo.c binding;

    /* JADX INFO: renamed from: no.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lno/v$a;", "Lnn/b0;", "Lno/u2$d$c;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lno/u2$d$c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<u2.d.ReviewCaptures> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.b0<u2.d.ReviewCaptures> f26210a;

        /* JADX INFO: renamed from: no.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0520a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, oo.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0520a f26211a = new C0520a();

            public C0520a() {
                super(3, oo.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            public final oo.c d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return oo.c.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ oo.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: no.v$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<oo.c, v> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26212a = new b();

            public b() {
                super(1, v.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final v invoke(oo.c p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new v(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull u2.d.ReviewCaptures initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f26210a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super u2.d.ReviewCaptures> getType() {
            return this.f26210a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f26210a = new nn.y(p001kotlin.jvm.internal.d0.b(u2.d.ReviewCaptures.class), C0520a.f26211a, b.f26212a);
        }
    }

    public v(@NotNull oo.c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        kr.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
        binding.f28307g.j(new kr.d((int) xq.j.a(8.0d), false, false, false, 8, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit i(u2.d.ReviewCaptures cVar, e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof e.Remote) {
            cVar.m().invoke(it);
        }
        return Unit.f21506a;
    }

    public static final void j(u2.d.ReviewCaptures cVar, View view) {
        cVar.n().invoke();
    }

    public static final Unit k(u2.d.ReviewCaptures cVar) {
        cVar.j().invoke();
        return Unit.f21506a;
    }

    public static final Unit l(u2.d.ReviewCaptures cVar) {
        cVar.k().invoke();
        return Unit.f21506a;
    }

    public final void g(StepStyles.DocumentStepStyle styles, jr.a systemUiController) {
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyle padding2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        if (styles != null && (backgroundColorValue = styles.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, iIntValue);
            }
        }
        if (styles != null) {
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = as.d.a(styles, context2);
            if (drawableA != null) {
                this.binding.getRoot().setBackground(drawableA);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.f28306f.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = this.binding.f28310j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            yr.h0.l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView body = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            yr.h0.l(body, textStyleValue, null, 2, null);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView disclaimer = this.binding.f28304d;
            Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
            yr.h0.l(disclaimer, disclaimerStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton submitButton = this.binding.f28309i;
            Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
            yr.e.h(submitButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        if (styles != null && (padding2 = styles.getPadding()) != null && (screen2 = padding2.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f28308h.setGuidelineBegin((int) xq.j.a(dp3.doubleValue()));
        }
        if (styles == null || (padding = styles.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f28305e.setGuidelineEnd((int) xq.j.a(dp2.doubleValue()));
    }

    @Override // or.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final u2.d.ReviewCaptures rendering, @Nullable jr.a systemUiController) {
        z zVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        oo.c cVar = this.binding;
        TextView title = cVar.f28310j;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        kr.u.b(title, rendering.getTitle());
        String strP = rendering.getPrompt();
        if (strP != null) {
            lt.e.b(this.binding.getRoot().getContext()).c(cVar.b, strP);
        }
        cVar.f28304d.setText(rendering.getDisclaimer());
        if (cVar.f28307g.getAdapter() == null) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            zVar = new z(context, rendering.getImageLoader(), rendering.o(), rendering.getStyles());
            cVar.f28307g.setAdapter(zVar);
        } else {
            RecyclerView.h adapter = cVar.f28307g.getAdapter();
            Intrinsics.d(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            zVar = (z) adapter;
        }
        zVar.K(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.e());
        zVar.J(new Function1() { // from class: no.r
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.i(rendering, (e) obj);
            }
        });
        cVar.f28309i.setText(rendering.getSubmitButtonText());
        cVar.f28309i.setEnabled(rendering.getSubmitButtonEnabled());
        cVar.f28309i.setOnClickListener(new View.OnClickListener() { // from class: no.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.j(rendering, view);
            }
        });
        ir.a aVarI = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: no.t
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.k(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: no.u
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.l(rendering);
            }
        };
        Pi2NavigationBar navigationBar = cVar.f28306f;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleQ = rendering.getStyles();
        Rect rectH = documentStepStyleQ != null ? sr.h.h(documentStepStyleQ) : null;
        String strH = rendering.getNavBarTitle();
        StepStyles.DocumentStepStyle documentStepStyleQ2 = rendering.getStyles();
        xr.c.e(aVarI, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, strH, documentStepStyleQ2 != null ? documentStepStyleQ2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        xq.g0.a(coordinatorLayoutB2, rendering.getError(), rendering.l(), this.binding.f28309i, 4, BacktraceMetrics.defaultTimeBetweenRetriesMs);
        g(rendering.getStyles(), systemUiController);
    }

    @Override // nn.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull u2.d.ReviewCaptures rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        b(rendering, jr.c.a(viewEnvironment));
    }
}
