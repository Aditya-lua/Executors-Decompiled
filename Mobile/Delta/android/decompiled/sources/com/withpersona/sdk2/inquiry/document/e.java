package com.withpersona.sdk2.inquiry.document;

import an.ViewEnvironment;
import an.a0;
import an.k;
import an.x;
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
import jq.g0;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wq.t;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lar/f;", "Lao/c;", "binding", "<init>", "(Lao/c;)V", "rendering", "Lan/y;", "viewEnvironment", "", "m", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;)V", "Lvq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lvq/a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lvq/a;)V", "b", "Lao/c;", "c", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements k<DocumentWorkflow.c.ReviewCaptures>, ar.f<DocumentWorkflow.c.ReviewCaptures> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ao.c binding;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<DocumentWorkflow.c.ReviewCaptures> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<DocumentWorkflow.c.ReviewCaptures> f10182a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0174a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, ao.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0174a f10183a = new C0174a();

            public C0174a() {
                super(3, ao.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            public final ao.c d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return ao.c.c(p8, viewGroup, z10);
            }

            @Override // zt.n
            public /* bridge */ /* synthetic */ ao.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<ao.c, e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f10184a = new b();

            public b() {
                super(1, e.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final e invoke(ao.c p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new e(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // an.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull DocumentWorkflow.c.ReviewCaptures initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f10182a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // an.a0
        @NotNull
        public hu.c<? super DocumentWorkflow.c.ReviewCaptures> getType() {
            return this.f10182a.getType();
        }

        public Companion() {
            k.Companion companion = k.INSTANCE;
            this.f10182a = new x(d0.b(DocumentWorkflow.c.ReviewCaptures.class), C0174a.f10183a, b.f10184a);
        }
    }

    public e(@NotNull ao.c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        wq.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
        binding.f3556g.j(new wq.d((int) jq.j.a(8.0d), false, false, false, 8, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit i(DocumentWorkflow.c.ReviewCaptures c0166c, DocumentFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentFile.Remote) {
            c0166c.m().invoke(it);
        }
        return Unit.f22483a;
    }

    public static final void j(DocumentWorkflow.c.ReviewCaptures c0166c, View view) {
        c0166c.n().invoke();
    }

    public static final Unit k(DocumentWorkflow.c.ReviewCaptures c0166c) {
        c0166c.j().invoke();
        return Unit.f22483a;
    }

    public static final Unit l(DocumentWorkflow.c.ReviewCaptures c0166c) {
        c0166c.k().invoke();
        return Unit.f22483a;
    }

    public final void g(StepStyles.DocumentStepStyle styles, vq.a systemUiController) {
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
            Drawable drawableA = lr.d.a(styles, context2);
            if (drawableA != null) {
                this.binding.getRoot().setBackground(drawableA);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.f3555f.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = this.binding.f3559j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView body = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, textStyleValue, null, 2, null);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView disclaimer = this.binding.f3553d;
            Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
            h0.l(disclaimer, disclaimerStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton submitButton = this.binding.f3558i;
            Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
            jr.e.h(submitButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        if (styles != null && (padding2 = styles.getPadding()) != null && (screen2 = padding2.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f3557h.setGuidelineBegin((int) jq.j.a(dp3.doubleValue()));
        }
        if (styles == null || (padding = styles.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f3554e.setGuidelineEnd((int) jq.j.a(dp2.doubleValue()));
    }

    @Override // ar.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final DocumentWorkflow.c.ReviewCaptures rendering, @Nullable vq.a systemUiController) {
        f fVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        ao.c cVar = this.binding;
        TextView title = cVar.f3559j;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        t.b(title, rendering.getTitle());
        String strP = rendering.getPrompt();
        if (strP != null) {
            us.e.b(this.binding.getRoot().getContext()).c(cVar.b, strP);
        }
        cVar.f3553d.setText(rendering.getDisclaimer());
        if (cVar.f3556g.getAdapter() == null) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fVar = new f(context, rendering.getImageLoader(), rendering.o(), rendering.getStyles());
            cVar.f3556g.setAdapter(fVar);
        } else {
            RecyclerView.h adapter = cVar.f3556g.getAdapter();
            Intrinsics.d(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            fVar = (f) adapter;
        }
        fVar.K(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.e());
        fVar.J(new Function1() { // from class: zn.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.e.i(rendering, (DocumentFile) obj);
            }
        });
        cVar.f3558i.setText(rendering.getSubmitButtonText());
        cVar.f3558i.setEnabled(rendering.getSubmitButtonEnabled());
        cVar.f3558i.setOnClickListener(new View.OnClickListener() { // from class: zn.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.document.e.j(rendering, view);
            }
        });
        NavigationState navigationStateI = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: zn.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.e.k(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: zn.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.e.l(rendering);
            }
        };
        Pi2NavigationBar navigationBar = cVar.f3555f;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleQ = rendering.getStyles();
        Rect rectH = documentStepStyleQ != null ? er.h.h(documentStepStyleQ) : null;
        String strH = rendering.getNavBarTitle();
        StepStyles.DocumentStepStyle documentStepStyleQ2 = rendering.getStyles();
        ir.c.e(navigationStateI, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, strH, documentStepStyleQ2 != null ? documentStepStyleQ2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        g0.a(coordinatorLayoutB2, rendering.getError(), rendering.l(), this.binding.f3558i, 4, BacktraceMetrics.defaultTimeBetweenRetriesMs);
        g(rendering.getStyles(), systemUiController);
    }

    @Override // an.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull DocumentWorkflow.c.ReviewCaptures rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        b(rendering, vq.c.a(viewEnvironment));
    }
}
