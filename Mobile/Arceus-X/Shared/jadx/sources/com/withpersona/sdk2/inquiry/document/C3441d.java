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
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao.C1127a;
import ar.InterfaceC1151f;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.document.C3441d;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import er.C5199h;
import hu.InterfaceC6567c;
import ir.C6966c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lr.C8243c;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p181i.C6589a;
import p226jq.C7288z;
import p227jr.C7304h0;
import p227jr.C7312p;
import p229jt.C7345l;
import p497vp.C12238a;
import p498vq.C12247a;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12543z;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0019\u001a\u00020\u0013*\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/d;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lar/f;", "Lao/a;", "binding", "<init>", "(Lao/a;)V", "rendering", "Lan/y;", "viewEnvironment", "", "k", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;Lan/y;)V", "Lvq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;Lvq/a;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lvq/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "b", "Lao/a;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3441d implements InterfaceC0382k<DocumentWorkflow.InterfaceC3432c.LoadingAnimation>, InterfaceC1151f<DocumentWorkflow.InterfaceC3432c.LoadingAnimation> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1127a binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/d$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<DocumentWorkflow.InterfaceC3432c.LoadingAnimation> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<DocumentWorkflow.InterfaceC3432c.LoadingAnimation> f13200a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14113a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1127a> {

            /* JADX INFO: renamed from: a */
            public static final C14113a f13201a = new C14113a();

            public C14113a() {
                super(3, C1127a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C1127a m16591d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C1127a.m6433c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C1127a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m16591d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C1127a, C3441d> {

            /* JADX INFO: renamed from: a */
            public static final b f13202a = new b();

            public b() {
                super(1, C3441d.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C3441d invoke(C1127a p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C3441d(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.d.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull DocumentWorkflow.InterfaceC3432c.LoadingAnimation initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f13200a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super DocumentWorkflow.InterfaceC3432c.LoadingAnimation> getType() {
            return this.f13200a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f13200a = new C0395x(C7731d0.m32002b(DocumentWorkflow.InterfaceC3432c.LoadingAnimation.class), C14113a.f13201a, b.f13202a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.d$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13203a;

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
            f13203a = iArr;
        }
    }

    public C3441d(@NotNull C1127a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43181n, null, false, 6, null);
        if (numM30330f != null) {
            binding.f4634f.setAnimation(numM30330f.intValue());
            binding.f4634f.m8436x();
        } else {
            ThemeableLottieAnimationView themeableLottieAnimationView = binding.f4634f;
            int color = Color.parseColor("#4600EB");
            Context context2 = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView.m20474F(color, m16583g(this, context2, C6589a.f25047z, null, false, 6, null));
        }
        ConstraintLayout constraintLayoutM6434b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM6434b, "getRoot(...)");
        C12524g.m46873d(constraintLayoutM6434b, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m16583g(C3441d c3441d, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return c3441d.m16587f(context, i10, typedValue, z10);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16584i(DocumentWorkflow.InterfaceC3432c.LoadingAnimation aVar) {
        aVar.m16521d().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16585j(DocumentWorkflow.InterfaceC3432c.LoadingAnimation aVar) {
        aVar.m16522e().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public final void m16586e(StepStyles.DocumentStepStyle styles, C12247a systemUiController, PendingPageTextPosition textPosition) {
        float f10;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f4635g.getId(), this.binding.f4631c.getId(), this.binding.f4630b.getId()} : new int[]{this.binding.f4630b.getId(), this.binding.f4635g.getId(), this.binding.f4631c.getId()};
        C0518c c0518c = new C0518c();
        c0518c.m2509f(this.binding.f4632d);
        int i10 = b.f13203a[pendingPageAlignmentValue.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 0.5f;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            f10 = 1.0f;
        }
        c0518c.m2520q(0, 3, 0, 4, iArr, null, 2);
        c0518c.m2503F(C7693m.m31842K(iArr), f10);
        c0518c.m2506c(this.binding.f4632d);
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.m45389a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            this.binding.getRoot().setBackground(drawableM33622a);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f4635g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f4631c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            C7304h0.m30392l(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            this.binding.f4634f.m20474F(Color.parseColor("#4600EB"), fillColorValue.intValue());
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            int iIntValue2 = strokeColorValue.intValue();
            this.binding.f4634f.m20474F(Color.parseColor("#180052"), iIntValue2);
            this.binding.f4634f.m20474F(Color.parseColor("#190052"), iIntValue2);
        }
        ConstraintLayout contentContainer = this.binding.f4632d;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        C7312p.m30410b(contentContainer, styles, false, false, 6, null);
    }

    /* JADX INFO: renamed from: f */
    public final int m16587f(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ir.c.e(com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar, android.view.View, android.graphics.Rect, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, int, java.lang.Object):void */
    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Lvq/a;)V */
    @Override // ar.InterfaceC1151f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo6493b(@NotNull final DocumentWorkflow.InterfaceC3432c.LoadingAnimation rendering, @Nullable C12247a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        C1127a c1127a = this.binding;
        NavigationState navigationStateM16520c = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: zn.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3441d.m16584i(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: zn.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3441d.m16585j(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c1127a.f4633e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutM6434b = c1127a.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM6434b, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleM16525h = rendering.getStyles();
        Rect rectM24132h = documentStepStyleM16525h != null ? C5199h.m24132h(documentStepStyleM16525h) : null;
        StepStyles.DocumentStepStyle documentStepStyleM16525h2 = rendering.getStyles();
        C6966c.m29335e(navigationStateM16520c, function0, function1, null, navigationBar, constraintLayoutM6434b, rectM24132h, null, documentStepStyleM16525h2 != null ? documentStepStyleM16525h2.getNavBarTitleStyleValue() : null, 136, null);
        String strM16526i = rendering.getTitle();
        if (strM16526i == null || StringsKt.m32182p0(strM16526i)) {
            c1127a.f4635g.setVisibility(8);
        } else {
            c1127a.f4635g.setVisibility(0);
            c1127a.f4635g.setText(rendering.getTitle());
            TextView title = c1127a.f4635g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C12543z.m46894f(title);
        }
        String strM16524g = rendering.getPrompt();
        if (strM16524g == null || strM16524g.length() == 0) {
            c1127a.f4631c.setVisibility(8);
        } else {
            c1127a.f4631c.setText(rendering.getPrompt());
        }
        NextStep.Document.AssetConfig.PendingPage pendingPageM16519a = rendering.getAssetConfig();
        RemoteImage loadingPictograph = pendingPageM16519a != null ? pendingPageM16519a.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = c1127a.f4630b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = C8243c.m33617e(loadingPictograph, animationContainer, true);
            c1127a.f4634f.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyleM16525h3 = rendering.getStyles();
        if (documentStepStyleM16525h3 != null) {
            m16586e(documentStepStyleM16525h3, systemUiController, rendering.getPendingPageTextVerticalPosition());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull DocumentWorkflow.InterfaceC3432c.LoadingAnimation rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        mo6493b(rendering, C12249c.m45392a(viewEnvironment));
    }
}
