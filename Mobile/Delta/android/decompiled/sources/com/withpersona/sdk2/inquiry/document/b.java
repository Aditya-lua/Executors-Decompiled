package com.withpersona.sdk2.inquiry.document;

import an.ViewEnvironment;
import an.a0;
import an.x;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.ComponentView;
import ar.UiStepBottomSheet;
import ar.s;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.List;
import java.util.Map;
import jr.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R5\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b$\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b9\u0010:R&\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000;8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b \u0010>¨\u0006B"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/b;", "Lan/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "onBack", "onCancel", "Lar/p;", "bottomSheet", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "Lnq/b;", "binding", "rendering", "", "Lar/a;", "componentNameToComponentView", "h", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/document/b;Ljava/util/Map;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "g", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Ljava/util/List;", "getComponentNamesToActions", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "d", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "e", "getOnCancel", "f", "Lar/p;", "()Lar/p;", "Ljava/lang/String;", "getNavBarTitle", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lan/a0;", "i", "Lan/a0;", "()Lan/a0;", "getViewFactory$annotations", "()V", "viewFactory", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements an.b<b>, DocumentWorkflow.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<String, Function1<UiComponent, Unit>>> componentNamesToActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NavigationState navigationState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onBack;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UiStepBottomSheet bottomSheet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String navBarTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.DocumentStepStyle styles;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0<b> viewFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, nq.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10166a = new a();

        public a() {
            super(3, nq.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        public final nq.b d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return nq.b.c(p8, viewGroup, z10);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ nq.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0172b implements Function1<nq.b, an.k<b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UiComponentScreen f10167a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f10169d;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.b$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<RenderingT> implements an.k {
            public final /* synthetic */ UiComponentScreen b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ nq.b f10170c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n f10171d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ar.g f10172e;

            public a(UiComponentScreen uiComponentScreen, nq.b bVar, n nVar, ar.g gVar) {
                this.b = uiComponentScreen;
                this.f10170c = bVar;
                this.f10171d = nVar;
                this.f10172e = gVar;
            }

            @Override // an.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numI = this.b.i();
                if (numI != null) {
                    nq.b bVar = this.f10170c;
                    int iIntValue = numI.intValue();
                    bVar.getRoot().setBackgroundColor(iIntValue);
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    vq.c.b(viewEnvironment, context, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.b;
                Context context2 = this.f10170c.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawableA = uiComponentScreen.a(context2);
                if (drawableA != null) {
                    nq.b bVar2 = this.f10170c;
                    bVar2.getRoot().setBackground(drawableA);
                    bVar2.f26638d.setBackgroundColor(0);
                }
                n nVar = this.f10171d;
                nq.b bVar3 = this.f10170c;
                Intrinsics.checkNotNull(bVar3);
                nVar.invoke(bVar3, rendering, this.f10172e.getViewBindings().a());
            }
        }

        public C0172b(UiComponentScreen uiComponentScreen, Function2 function2, boolean z10, n nVar) {
            this.f10167a = uiComponentScreen;
            this.b = function2;
            this.f10168c = z10;
            this.f10169d = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final an.k<b> invoke(nq.b binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(this.f10167a, binding, this.f10169d, s.f3757a.l(binding, this.f10167a, this.b, this.f10168c));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends k implements n<nq.b, b, Map<String, ? extends ComponentView>, Unit> {
        public c(Object obj) {
            super(3, obj, b.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        public final void d(nq.b p8, b p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((b) this.receiver).h(p8, p10, p11);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ Unit invoke(nq.b bVar, b bVar2, Map<String, ? extends ComponentView> map) {
            d(bVar, bVar2, map);
            return Unit.f22483a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable UiStepBottomSheet uiStepBottomSheet, @Nullable String str, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
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
        s sVar = s.f3757a;
        Function2 function2 = new Function2() { // from class: zn.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.document.b.l((nq.b) obj, (Map) obj2);
            }
        };
        c cVar = new c(this);
        an.k.Companion companion = an.k.INSTANCE;
        this.viewFactory = new x(d0.b(b.class), a.f10166a, new C0172b(uiScreen, function2, true, cVar));
    }

    public static final void i(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final Unit j(b bVar) {
        bVar.onBack.invoke();
        return Unit.f22483a;
    }

    public static final Unit k(b bVar) {
        bVar.onCancel.invoke();
        return Unit.f22483a;
    }

    public static final Unit l(nq.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22483a;
    }

    @Override // an.b
    @NotNull
    public a0<b> a() {
        return this.viewFactory;
    }

    @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c
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

    public final void h(@NotNull nq.b binding, @NotNull final b rendering, @NotNull Map<String, ComponentView> componentNameToComponentView) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(componentNameToComponentView, "componentNameToComponentView");
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNamesToActions) {
            String strC = pair.c();
            final Function1<UiComponent, Unit> function1D = pair.d();
            final ComponentView componentView = componentNameToComponentView.get(strC);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: zn.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.withpersona.sdk2.inquiry.document.b.i(function1D, componentView, view);
                    }
                });
            }
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: zn.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.b.j(this.f37734a);
            }
        };
        Function0 function1 = new Function0() { // from class: zn.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.document.b.k(this.f37738a);
            }
        };
        Pi2NavigationBar navigationBar = binding.f26639e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyle = rendering.styles;
        Rect rectH = documentStepStyle != null ? er.h.h(documentStepStyle) : null;
        String str = rendering.navBarTitle;
        StepStyles.DocumentStepStyle documentStepStyle2 = rendering.styles;
        ir.c.e(navigationState, function0, function1, null, navigationBar, root, rectH, str, documentStepStyle2 != null ? documentStepStyle2.getNavBarTitleStyleValue() : null, 8, null);
        FrameLayout contentContainer = binding.b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        p.b(contentContainer, rendering.styles, false, false, 6, null);
    }

    public /* synthetic */ b(UiComponentScreen uiComponentScreen, List list, NavigationState navigationState, Function0 function0, Function0 function1, UiStepBottomSheet uiStepBottomSheet, String str, StepStyles.DocumentStepStyle documentStepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, navigationState, function0, function1, (i10 & 32) != 0 ? null : uiStepBottomSheet, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? null : documentStepStyle);
    }
}
