package no;

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
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0019\u001a\u00020\u0013*\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lno/q;", "Lnn/k;", "Lno/u2$d$a;", "Lor/h;", "Loo/a;", "binding", "<init>", "(Loo/a;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "k", "(Lno/u2$d$a;Lnn/z;)V", "Ljr/a;", "systemUiController", "h", "(Lno/u2$d$a;Ljr/a;)V", "Landroid/content/Context;", BuildConfig.FLAVOR, "attrColor", "Landroid/util/TypedValue;", "typedValue", BuildConfig.FLAVOR, "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljr/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "b", "Loo/a;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements nn.k<u2.d.LoadingAnimation>, or.h<u2.d.LoadingAnimation> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oo.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    /* JADX INFO: renamed from: no.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lno/q$a;", "Lnn/b0;", "Lno/u2$d$a;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lno/u2$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<u2.d.LoadingAnimation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.b0<u2.d.LoadingAnimation> f26051a;

        /* JADX INFO: renamed from: no.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0514a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, oo.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0514a f26052a = new C0514a();

            public C0514a() {
                super(3, oo.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);
            }

            public final oo.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return oo.a.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ oo.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: no.q$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<oo.a, q> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26053a = new b();

            public b() {
                super(1, q.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final q invoke(oo.a p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new q(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull u2.d.LoadingAnimation initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f26051a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super u2.d.LoadingAnimation> getType() {
            return this.f26051a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f26051a = new nn.y(p001kotlin.jvm.internal.d0.b(u2.d.LoadingAnimation.class), C0514a.f26052a, b.f26053a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26054a;

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
            f26054a = iArr;
        }
    }

    public q(@NotNull oo.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = xq.z.f(context, jq.a.f20838n, null, false, 6, null);
        if (numF != null) {
            binding.f28298f.setAnimation(numF.intValue());
            binding.f28298f.x();
        } else {
            ThemeableLottieAnimationView themeableLottieAnimationView = binding.f28298f;
            int color = Color.parseColor("#4600EB");
            Context context2 = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView.F(color, g(this, context2, i.a.f18753z, null, false, 6, null));
        }
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        kr.g.d(constraintLayoutB, false, false, false, false, 15, null);
    }

    public static /* synthetic */ int g(q qVar, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return qVar.f(context, i10, typedValue, z10);
    }

    public static final Unit i(u2.d.LoadingAnimation aVar) {
        aVar.d().invoke();
        return Unit.f21506a;
    }

    public static final Unit j(u2.d.LoadingAnimation aVar) {
        aVar.e().invoke();
        return Unit.f21506a;
    }

    public final void e(StepStyles.DocumentStepStyle styles, jr.a systemUiController, PendingPageTextPosition textPosition) {
        float f10;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f28299g.getId(), this.binding.f28295c.getId(), this.binding.b.getId()} : new int[]{this.binding.b.getId(), this.binding.f28299g.getId(), this.binding.f28295c.getId()};
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this.binding.f28296d);
        int i10 = b.f26054a[pendingPageAlignmentValue.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 0.5f;
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            f10 = 1.0f;
        }
        cVar.q(0, 3, 0, 4, iArr, null, 2);
        cVar.F(p001kotlin.collections.m.K(iArr), f10);
        cVar.c(this.binding.f28296d);
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
        Drawable drawableA = as.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f28299g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            yr.h0.l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f28295c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            yr.h0.l(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            this.binding.f28298f.F(Color.parseColor("#4600EB"), fillColorValue.intValue());
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            int iIntValue2 = strokeColorValue.intValue();
            this.binding.f28298f.F(Color.parseColor("#180052"), iIntValue2);
            this.binding.f28298f.F(Color.parseColor("#190052"), iIntValue2);
        }
        ConstraintLayout contentContainer = this.binding.f28296d;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        yr.p.b(contentContainer, styles, false, false, 6, null);
    }

    public final int f(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    @Override // or.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final u2.d.LoadingAnimation rendering, @Nullable jr.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        oo.a aVar = this.binding;
        ir.a aVarC = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: no.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.i(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: no.p
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.j(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f28297e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleH = rendering.getStyles();
        Rect rectH = documentStepStyleH != null ? sr.h.h(documentStepStyleH) : null;
        StepStyles.DocumentStepStyle documentStepStyleH2 = rendering.getStyles();
        xr.c.e(aVarC, function0, function1, null, navigationBar, constraintLayoutB, rectH, null, documentStepStyleH2 != null ? documentStepStyleH2.getNavBarTitleStyleValue() : null, 136, null);
        String strI = rendering.getTitle();
        if (strI == null || StringsKt.p0(strI)) {
            aVar.f28299g.setVisibility(8);
        } else {
            aVar.f28299g.setVisibility(0);
            aVar.f28299g.setText(rendering.getTitle());
            TextView title = aVar.f28299g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            kr.a0.f(title);
        }
        String strG = rendering.getPrompt();
        if (strG == null || strG.length() == 0) {
            aVar.f28295c.setVisibility(8);
        } else {
            aVar.f28295c.setText(rendering.getPrompt());
        }
        NextStep.Document.AssetConfig.PendingPage pendingPageA = rendering.getAssetConfig();
        RemoteImage loadingPictograph = pendingPageA != null ? pendingPageA.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = aVar.b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = as.c.e(loadingPictograph, animationContainer, true);
            aVar.f28298f.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyleH3 = rendering.getStyles();
        if (documentStepStyleH3 != null) {
            e(documentStepStyleH3, systemUiController, rendering.getPendingPageTextVerticalPosition());
        }
    }

    @Override // nn.k
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull u2.d.LoadingAnimation rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        b(rendering, jr.c.a(viewEnvironment));
    }
}
