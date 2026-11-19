package no;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.util.List;
import java.util.Map;
import nn.ViewEnvironment;
import or.ComponentView;
import or.UiComponentScreen;
import or.UiStepBottomSheet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R5\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b$\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b9\u0010:R&\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000;8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b \u0010>¨\u0006B"}, d2 = {"Lno/j;", "Lnn/b;", "Lno/u2$d;", "Lor/i;", "uiScreen", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", BuildConfig.FLAVOR, "componentNamesToActions", "Lir/a;", "navigationState", "Lkotlin/Function0;", "onBack", "onCancel", "Lor/s;", "bottomSheet", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Lor/i;Ljava/util/List;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lor/s;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "Lbr/b;", "binding", "rendering", BuildConfig.FLAVOR, "Lor/a;", "componentNameToComponentView", "h", "(Lbr/b;Lno/j;Ljava/util/Map;)V", "a", "Lor/i;", "g", "()Lor/i;", "b", "Ljava/util/List;", "getComponentNamesToActions", "()Ljava/util/List;", "c", "Lir/a;", "getNavigationState", "()Lir/a;", "d", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "e", "getOnCancel", "f", "Lor/s;", "()Lor/s;", "Ljava/lang/String;", "getNavBarTitle", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lnn/b0;", "i", "Lnn/b0;", "()Lnn/b0;", "getViewFactory$annotations", "()V", "viewFactory", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements nn.b<j>, u2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<String, Function1<x5, Unit>>> componentNamesToActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.a navigationState;

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
    public final nn.b0<j> viewFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, br.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26011a = new a();

        public a() {
            super(3, br.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        public final br.b d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return br.b.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ br.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Function1<br.b, nn.k<j>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UiComponentScreen f26012a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f26013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pu.n f26014d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<RenderingT> implements nn.k {
            public final /* synthetic */ UiComponentScreen b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ br.b f26015c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ pu.n f26016d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ or.j f26017e;

            public a(UiComponentScreen uiComponentScreen, br.b bVar, pu.n nVar, or.j jVar) {
                this.b = uiComponentScreen;
                this.f26015c = bVar;
                this.f26016d = nVar;
                this.f26017e = jVar;
            }

            @Override // nn.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numI = this.b.i();
                if (numI != null) {
                    br.b bVar = this.f26015c;
                    int iIntValue = numI.intValue();
                    bVar.getRoot().setBackgroundColor(iIntValue);
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    jr.c.b(viewEnvironment, context, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.b;
                Context context2 = this.f26015c.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawableA = uiComponentScreen.a(context2);
                if (drawableA != null) {
                    br.b bVar2 = this.f26015c;
                    bVar2.getRoot().setBackground(drawableA);
                    bVar2.f4560d.setBackgroundColor(0);
                }
                pu.n nVar = this.f26016d;
                br.b bVar3 = this.f26015c;
                Intrinsics.checkNotNull(bVar3);
                nVar.invoke(bVar3, rendering, this.f26017e.getViewBindings().a());
            }
        }

        public b(UiComponentScreen uiComponentScreen, Function2 function2, boolean z10, pu.n nVar) {
            this.f26012a = uiComponentScreen;
            this.b = function2;
            this.f26013c = z10;
            this.f26014d = nVar;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nn.k<j> invoke(br.b binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(this.f26012a, binding, this.f26014d, or.v.f28513a.l(binding, this.f26012a, this.b, this.f26013c));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends p001kotlin.jvm.internal.k implements pu.n<br.b, j, Map<String, ? extends ComponentView>, Unit> {
        public c(Object obj) {
            super(3, obj, j.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        public final void d(br.b p8, j p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((j) this.receiver).h(p8, p10, p11);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ Unit invoke(br.b bVar, j jVar, Map<String, ? extends ComponentView> map) {
            d(bVar, jVar, map);
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super x5, Unit>>> componentNamesToActions, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable UiStepBottomSheet uiStepBottomSheet, @Nullable String str, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
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
        or.v vVar = or.v.f28513a;
        Function2 function2 = new Function2() { // from class: no.i
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j.l((br.b) obj, (Map) obj2);
            }
        };
        c cVar = new c(this);
        nn.k.Companion companion = nn.k.INSTANCE;
        this.viewFactory = new nn.y(p001kotlin.jvm.internal.d0.b(j.class), a.f26011a, new b(uiScreen, function2, true, cVar));
    }

    public static final void i(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final Unit j(j jVar) {
        jVar.onBack.invoke();
        return Unit.f21506a;
    }

    public static final Unit k(j jVar) {
        jVar.onCancel.invoke();
        return Unit.f21506a;
    }

    public static final Unit l(br.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
        return Unit.f21506a;
    }

    @Override // nn.b
    @NotNull
    public nn.b0<j> a() {
        return this.viewFactory;
    }

    @Override // no.u2.d
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

    public final void h(@NotNull br.b binding, @NotNull final j rendering, @NotNull Map<String, ComponentView> componentNameToComponentView) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(componentNameToComponentView, "componentNameToComponentView");
        for (Pair<String, Function1<x5, Unit>> pair : this.componentNamesToActions) {
            String strC = pair.c();
            final Function1<x5, Unit> function1D = pair.d();
            final ComponentView componentView = componentNameToComponentView.get(strC);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: no.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j.i(function1D, componentView, view);
                    }
                });
            }
        }
        ir.a aVar = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: no.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.j(this.f25988a);
            }
        };
        Function0 function1 = new Function0() { // from class: no.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.k(this.f25992a);
            }
        };
        Pi2NavigationBar navigationBar = binding.f4561e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyle = rendering.styles;
        Rect rectH = documentStepStyle != null ? sr.h.h(documentStepStyle) : null;
        String str = rendering.navBarTitle;
        StepStyles.DocumentStepStyle documentStepStyle2 = rendering.styles;
        xr.c.e(aVar, function0, function1, null, navigationBar, root, rectH, str, documentStepStyle2 != null ? documentStepStyle2.getNavBarTitleStyleValue() : null, 8, null);
        FrameLayout contentContainer = binding.b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        yr.p.b(contentContainer, rendering.styles, false, false, 6, null);
    }

    public /* synthetic */ j(UiComponentScreen uiComponentScreen, List list, ir.a aVar, Function0 function0, Function0 function1, UiStepBottomSheet uiStepBottomSheet, String str, StepStyles.DocumentStepStyle documentStepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, aVar, function0, function1, (i10 & 32) != 0 ? null : uiStepBottomSheet, (i10 & 64) != 0 ? null : str, (i10 & Barcode.FORMAT_ITF) != 0 ? null : documentStepStyle);
    }
}
