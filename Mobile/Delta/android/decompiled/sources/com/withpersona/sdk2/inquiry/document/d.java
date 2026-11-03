package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import gt.l;
import hq.z;
import hr.h0;
import hr.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xt.n;
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0019\u001a\u00020\u0013*\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/d;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lyq/f;", "Lyn/a;", "binding", "<init>", "(Lyn/a;)V", "rendering", "Lym/y;", "viewEnvironment", "", "k", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;Lym/y;)V", "Ltq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;Ltq/a;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ltq/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "b", "Lyn/a;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements k<DocumentWorkflow.c.LoadingAnimation>, yq.f<DocumentWorkflow.c.LoadingAnimation> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yn.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/d$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<DocumentWorkflow.c.LoadingAnimation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<DocumentWorkflow.c.LoadingAnimation> f10258a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0176a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, yn.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0176a f10259a = new C0176a();

            public C0176a() {
                super(3, yn.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);
            }

            public final yn.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return yn.a.c(p8, viewGroup, z10);
            }

            @Override // xt.n
            public /* bridge */ /* synthetic */ yn.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<yn.a, d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f10260a = new b();

            public b() {
                super(1, d.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final d invoke(yn.a p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new d(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull DocumentWorkflow.c.LoadingAnimation initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f10258a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public fu.c<? super DocumentWorkflow.c.LoadingAnimation> getType() {
            return this.f10258a.getType();
        }

        public Companion() {
            k.Companion companion = k.INSTANCE;
            this.f10258a = new x(d0.b(DocumentWorkflow.c.LoadingAnimation.class), C0176a.f10259a, b.f10260a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10261a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10261a = iArr;
        }
    }

    public d(@NotNull yn.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = z.f(context, tp.a.f32489n, null, false, 6, null);
        if (numF != null) {
            binding.f36906f.setAnimation(numF.intValue());
            binding.f36906f.x();
        } else {
            ThemeableLottieAnimationView themeableLottieAnimationView = binding.f36906f;
            int color = Color.parseColor("#4600EB");
            Context context2 = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView.F(color, g(this, context2, i.a.f20026z, null, false, 6, null));
        }
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        uq.g.d(constraintLayoutB, false, false, false, false, 15, null);
    }

    public static /* synthetic */ int g(d dVar, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return dVar.f(context, i10, typedValue, z10);
    }

    public static final Unit i(DocumentWorkflow.c.LoadingAnimation aVar) {
        aVar.d().invoke();
        return Unit.f22938a;
    }

    public static final Unit j(DocumentWorkflow.c.LoadingAnimation aVar) {
        aVar.e().invoke();
        return Unit.f22938a;
    }

    public final void e(StepStyles.DocumentStepStyle styles, tq.a systemUiController, PendingPageTextPosition textPosition) {
        float f10;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f36907g.getId(), this.binding.f36903c.getId(), this.binding.b.getId()} : new int[]{this.binding.b.getId(), this.binding.f36907g.getId(), this.binding.f36903c.getId()};
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this.binding.f36904d);
        int i10 = b.f10261a[pendingPageAlignmentValue.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 0.5f;
        } else {
            if (i10 != 3) {
                throw new l();
            }
            f10 = 1.0f;
        }
        cVar.q(0, 3, 0, 4, iArr, null, 2);
        cVar.F(m.K(iArr), f10);
        cVar.c(this.binding.f36904d);
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = jr.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f36907g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f36903c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            this.binding.f36906f.F(Color.parseColor("#4600EB"), fillColorValue.intValue());
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            int iIntValue2 = strokeColorValue.intValue();
            this.binding.f36906f.F(Color.parseColor("#180052"), iIntValue2);
            this.binding.f36906f.F(Color.parseColor("#190052"), iIntValue2);
        }
        ConstraintLayout contentContainer = this.binding.f36904d;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        p.b(contentContainer, styles, false, false, 6, null);
    }

    public final int f(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    @Override // yq.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final DocumentWorkflow.c.LoadingAnimation rendering, @Nullable tq.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        yn.a aVar = this.binding;
        NavigationState navigationStateC = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: xn.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.d.i(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: xn.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.d.j(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f36905e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleH = rendering.getStyles();
        Rect rectH = documentStepStyleH != null ? cr.h.h(documentStepStyleH) : null;
        StepStyles.DocumentStepStyle documentStepStyleH2 = rendering.getStyles();
        gr.c.e(navigationStateC, function0, function1, null, navigationBar, constraintLayoutB, rectH, null, documentStepStyleH2 != null ? documentStepStyleH2.getNavBarTitleStyleValue() : null, 136, null);
        String strI = rendering.getTitle();
        if (strI == null || StringsKt.p0(strI)) {
            aVar.f36907g.setVisibility(8);
        } else {
            aVar.f36907g.setVisibility(0);
            aVar.f36907g.setText(rendering.getTitle());
            TextView title = aVar.f36907g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            uq.z.f(title);
        }
        String strG = rendering.getPrompt();
        if (strG == null || strG.length() == 0) {
            aVar.f36903c.setVisibility(8);
        } else {
            aVar.f36903c.setText(rendering.getPrompt());
        }
        NextStep.Document.AssetConfig.PendingPage pendingPageA = rendering.getAssetConfig();
        RemoteImage loadingPictograph = pendingPageA != null ? pendingPageA.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = aVar.b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = jr.c.e(loadingPictograph, animationContainer, true);
            aVar.f36906f.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyleH3 = rendering.getStyles();
        if (documentStepStyleH3 != null) {
            e(documentStepStyleH3, systemUiController, rendering.getPendingPageTextVerticalPosition());
        }
    }

    @Override // ym.k
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull DocumentWorkflow.c.LoadingAnimation rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        a(rendering, tq.c.a(viewEnvironment));
    }
}
