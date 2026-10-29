package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1152g;
import ar.C1164s;
import ar.ComponentView;
import ar.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.document.C3439b;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import er.C5199h;
import ir.C6966c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0365b;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p227jr.C7312p;
import p313nq.C9546b;
import p498vq.C12249c;
import p526wq.C12524g;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R5\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b$\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b9\u0010:R&\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000;8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b \u0010>¨\u0006B"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/b;", "Lan/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "onBack", "onCancel", "Lar/p;", "bottomSheet", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "Lnq/b;", "binding", "rendering", "", "Lar/a;", "componentNameToComponentView", "h", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/document/b;Ljava/util/Map;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "g", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Ljava/util/List;", "getComponentNamesToActions", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "d", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "e", "getOnCancel", "f", "Lar/p;", "()Lar/p;", "Ljava/lang/String;", "getNavBarTitle", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lan/a0;", "i", "Lan/a0;", "()Lan/a0;", "getViewFactory$annotations", "()V", "viewFactory", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3439b implements InterfaceC0365b<C3439b>, DocumentWorkflow.InterfaceC3432c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<String, Function1<UiComponent, Unit>>> componentNamesToActions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NavigationState navigationState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onBack;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final UiStepBottomSheet bottomSheet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String navBarTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.DocumentStepStyle styles;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0364a0<C3439b> viewFactory;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9546b> {

        /* JADX INFO: renamed from: a */
        public static final a f13186a = new a();

        public a() {
            super(3, C9546b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C9546b m16576d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C9546b.m37676c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C9546b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m16576d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements Function1<C9546b, InterfaceC0382k<C3439b>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UiComponentScreen f13187a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f13188b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f13189c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC14057n f13190d;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<RenderingT> implements InterfaceC0382k {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ UiComponentScreen f13191b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C9546b f13192c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC14057n f13193d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C1152g f13194e;

            public a(UiComponentScreen uiComponentScreen, C9546b c9546b, InterfaceC14057n interfaceC14057n, C1152g c1152g) {
                this.f13191b = uiComponentScreen;
                this.f13192c = c9546b;
                this.f13193d = interfaceC14057n;
                this.f13194e = c1152g;
            }

            @Override // p016an.InterfaceC0382k
            /* JADX INFO: renamed from: a */
            public final void mo1442a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numM20526i = this.f13191b.m20526i();
                if (numM20526i != null) {
                    C9546b c9546b = this.f13192c;
                    int iIntValue = numM20526i.intValue();
                    c9546b.getRoot().setBackgroundColor(iIntValue);
                    Context context = c9546b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    C12249c.m45393b(viewEnvironment, context, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.f13191b;
                Context context2 = this.f13192c.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawableM20524a = uiComponentScreen.m20524a(context2);
                if (drawableM20524a != null) {
                    C9546b c9546b2 = this.f13192c;
                    c9546b2.getRoot().setBackground(drawableM20524a);
                    c9546b2.f34504d.setBackgroundColor(0);
                }
                InterfaceC14057n interfaceC14057n = this.f13193d;
                C9546b c9546b3 = this.f13192c;
                Intrinsics.checkNotNull(c9546b3);
                interfaceC14057n.invoke(c9546b3, rendering, this.f13194e.getViewBindings().m6497a());
            }
        }

        public b(UiComponentScreen uiComponentScreen, Function2 function2, boolean z10, InterfaceC14057n interfaceC14057n) {
            this.f13187a = uiComponentScreen;
            this.f13188b = function2;
            this.f13189c = z10;
            this.f13190d = interfaceC14057n;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0382k<C3439b> invoke(C9546b binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(this.f13187a, binding, this.f13190d, C1164s.f4917a.m6530l(binding, this.f13187a, this.f13188b, this.f13189c));
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements InterfaceC14057n<C9546b, C3439b, Map<String, ? extends ComponentView>, Unit> {
        public c(Object obj) {
            super(3, obj, C3439b.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m16578d(C9546b p8, C3439b p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((C3439b) this.receiver).m16575h(p8, p10, p11);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(C9546b c9546b, C3439b c3439b, Map<String, ? extends ComponentView> map) {
            m16578d(c9546b, c3439b, map);
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, kotlin.Unit>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3439b(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable UiStepBottomSheet uiStepBottomSheet, @Nullable String str, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.navigationState = navigationState;
        this.onBack = onBack;
        this.onCancel = onCancel;
        this.bottomSheet = uiStepBottomSheet;
        this.navBarTitle = str;
        this.styles = documentStepStyle;
        C1164s c1164s = C1164s.f4917a;
        Function2 function2 = new Function2() { // from class: zn.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3439b.m16573l((C9546b) obj, (Map) obj2);
            }
        };
        c cVar = new c(this);
        InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
        this.viewFactory = new C0395x(C7731d0.m32002b(C3439b.class), a.f13186a, new b(uiScreen, function2, true, cVar));
    }

    /* JADX INFO: renamed from: i */
    public static final void m16570i(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.m6490c());
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16571j(C3439b c3439b) {
        c3439b.onBack.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m16572k(C3439b c3439b) {
        c3439b.onCancel.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m16573l(C9546b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
        return Unit.f29331a;
    }

    @Override // p016an.InterfaceC0365b
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC0364a0<C3439b> mo1380a() {
        return this.viewFactory;
    }

    @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.InterfaceC3432c
    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public UiStepBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final UiComponentScreen getUiScreen() {
        return this.uiScreen;
    }

    /* JADX INFO: renamed from: h */
    public final void m16575h(@NotNull C9546b binding, @NotNull final C3439b rendering, @NotNull Map<String, ComponentView> componentNameToComponentView) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(componentNameToComponentView, "componentNameToComponentView");
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNamesToActions) {
            String strM31673c = pair.m31673c();
            final Function1<UiComponent, Unit> function1M31674d = pair.m31674d();
            final ComponentView componentView = componentNameToComponentView.get(strM31673c);
            if (componentView != null) {
                componentView.m6491d().setOnClickListener(new View.OnClickListener() { // from class: zn.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3439b.m16570i(function1M31674d, componentView, view);
                    }
                });
            }
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: zn.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3439b.m16571j(this.f48572a);
            }
        };
        Function0 function1 = new Function0() { // from class: zn.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3439b.m16572k(this.f48577a);
            }
        };
        Pi2NavigationBar navigationBar = binding.f34505e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyle = rendering.styles;
        Rect rectM24132h = documentStepStyle != null ? C5199h.m24132h(documentStepStyle) : null;
        String str = rendering.navBarTitle;
        StepStyles.DocumentStepStyle documentStepStyle2 = rendering.styles;
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, root, rectM24132h, str, documentStepStyle2 != null ? documentStepStyle2.getNavBarTitleStyleValue() : null, 8, null);
        FrameLayout contentContainer = binding.f34502b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        C7312p.m30410b(contentContainer, rendering.styles, false, false, 6, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
      (r2v0 com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen)
      (r3v0 java.util.List)
      (r4v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
      (r5v0 kotlin.jvm.functions.Function0)
      (r6v0 kotlin.jvm.functions.Function0)
      (wrap ar.p:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null ar.p) : (r7v0 ar.p))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle:?: TERNARY null = ((wrap int:0x000b: ARITH (r10v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle) : (r9v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle))
     A[MD:(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, java.util.List<? extends kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, kotlin.Unit>>>, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, ar.p, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle):void (m)] (LINE:16) call: com.withpersona.sdk2.inquiry.document.b.<init>(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, java.util.List, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, ar.p, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle):void type: THIS */
    public /* synthetic */ C3439b(UiComponentScreen uiComponentScreen, List list, NavigationState navigationState, Function0 function0, Function0 function1, UiStepBottomSheet uiStepBottomSheet, String str, StepStyles.DocumentStepStyle documentStepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, navigationState, function0, function1, (i10 & 32) != 0 ? null : uiStepBottomSheet, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? null : documentStepStyle);
    }
}
