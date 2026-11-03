package com.withpersona.sdk2.inquiry.document;

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
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import hq.g0;
import hr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq.t;
import xt.n;
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lyq/f;", "Lyn/c;", "binding", "<init>", "(Lyn/c;)V", "rendering", "Lym/y;", "viewEnvironment", "", "m", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lym/y;)V", "Ltq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Ltq/a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ltq/a;)V", "b", "Lyn/c;", "c", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements k<DocumentWorkflow.c.ReviewCaptures>, yq.f<DocumentWorkflow.c.ReviewCaptures> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yn.c binding;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<DocumentWorkflow.c.ReviewCaptures> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<DocumentWorkflow.c.ReviewCaptures> f10263a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0177a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, yn.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0177a f10264a = new C0177a();

            public C0177a() {
                super(3, yn.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            public final yn.c d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return yn.c.c(p8, viewGroup, z10);
            }

            @Override // xt.n
            public /* bridge */ /* synthetic */ yn.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<yn.c, e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f10265a = new b();

            public b() {
                super(1, e.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final e invoke(yn.c p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new e(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull DocumentWorkflow.c.ReviewCaptures initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f10263a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public fu.c<? super DocumentWorkflow.c.ReviewCaptures> getType() {
            return this.f10263a.getType();
        }

        public Companion() {
            k.Companion companion = k.INSTANCE;
            this.f10263a = new x(d0.b(DocumentWorkflow.c.ReviewCaptures.class), C0177a.f10264a, b.f10265a);
        }
    }

    public e(@NotNull yn.c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        uq.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
        binding.f36915g.j(new uq.d((int) hq.j.a(8.0d), false, false, false, 8, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit i(DocumentWorkflow.c.ReviewCaptures c0169c, DocumentFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentFile.Remote) {
            c0169c.m().invoke(it);
        }
        return Unit.f22938a;
    }

    public static final void j(DocumentWorkflow.c.ReviewCaptures c0169c, View view) {
        c0169c.n().invoke();
    }

    public static final Unit k(DocumentWorkflow.c.ReviewCaptures c0169c) {
        c0169c.j().invoke();
        return Unit.f22938a;
    }

    public static final Unit l(DocumentWorkflow.c.ReviewCaptures c0169c) {
        c0169c.k().invoke();
        return Unit.f22938a;
    }

    public final void g(StepStyles.DocumentStepStyle styles, tq.a systemUiController) {
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
            Drawable drawableA = jr.d.a(styles, context2);
            if (drawableA != null) {
                this.binding.getRoot().setBackground(drawableA);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.f36914f.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = this.binding.f36918j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView body = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, textStyleValue, null, 2, null);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView disclaimer = this.binding.f36912d;
            Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
            h0.l(disclaimer, disclaimerStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton submitButton = this.binding.f36917i;
            Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
            hr.e.h(submitButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        if (styles != null && (padding2 = styles.getPadding()) != null && (screen2 = padding2.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f36916h.setGuidelineBegin((int) hq.j.a(dp3.doubleValue()));
        }
        if (styles == null || (padding = styles.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f36913e.setGuidelineEnd((int) hq.j.a(dp2.doubleValue()));
    }

    @Override // yq.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final DocumentWorkflow.c.ReviewCaptures rendering, @Nullable tq.a systemUiController) {
        f fVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        yn.c cVar = this.binding;
        TextView title = cVar.f36918j;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        t.b(title, rendering.getTitle());
        String strP = rendering.getPrompt();
        if (strP != null) {
            ss.e.b(this.binding.getRoot().getContext()).c(cVar.b, strP);
        }
        cVar.f36912d.setText(rendering.getDisclaimer());
        if (cVar.f36915g.getAdapter() == null) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fVar = new f(context, rendering.getImageLoader(), rendering.o(), rendering.getStyles());
            cVar.f36915g.setAdapter(fVar);
        } else {
            RecyclerView.h adapter = cVar.f36915g.getAdapter();
            Intrinsics.d(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            fVar = (f) adapter;
        }
        fVar.K(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.e());
        fVar.J(new Function1() { // from class: xn.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.e.i(rendering, (DocumentFile) obj);
            }
        });
        cVar.f36917i.setText(rendering.getSubmitButtonText());
        cVar.f36917i.setEnabled(rendering.getSubmitButtonEnabled());
        cVar.f36917i.setOnClickListener(new View.OnClickListener() { // from class: xn.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.document.e.j(rendering, view);
            }
        });
        NavigationState navigationStateI = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: xn.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.e.k(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: xn.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.e.l(rendering);
            }
        };
        Pi2NavigationBar navigationBar = cVar.f36914f;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleQ = rendering.getStyles();
        Rect rectH = documentStepStyleQ != null ? cr.h.h(documentStepStyleQ) : null;
        String strH = rendering.getNavBarTitle();
        StepStyles.DocumentStepStyle documentStepStyleQ2 = rendering.getStyles();
        gr.c.e(navigationStateI, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, strH, documentStepStyleQ2 != null ? documentStepStyleQ2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        g0.a(coordinatorLayoutB2, rendering.getError(), rendering.l(), this.binding.f36917i, 4, BacktraceMetrics.defaultTimeBetweenRetriesMs);
        g(rendering.getStyles(), systemUiController);
    }

    @Override // ym.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull DocumentWorkflow.c.ReviewCaptures rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        a(rendering, tq.c.a(viewEnvironment));
    }
}
