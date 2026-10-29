package com.withpersona.sdk2.inquiry.integration;

import an.ViewEnvironment;
import an.a0;
import an.x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.ComponentView;
import ar.g;
import ar.s;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import er.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jr.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R5\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0\f0\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0012\u00109R&\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b%\u0010=¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "Lan/b;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "componentNameToAction", "", "isLoading", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lnq/b;", "binding", "rendering", "", "Lar/a;", "componentNameToComponentView", "m", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "getUiScreen", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "d", "getOnCancel", "e", "Ljava/util/List;", "getComponentNameToAction", "()Ljava/util/List;", "f", "Z", "()Z", "Lan/a0;", "g", "Lan/a0;", "()Lan/a0;", "getViewFactory$annotations", "()V", "viewFactory", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntegrationView implements an.b<IntegrationView>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntegrationView> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NavigationState navigationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onBack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<String, Function1<UiComponent, Unit>>> componentNameToAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isLoading;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0<IntegrationView> viewFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntegrationView> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IntegrationView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UiComponentScreen uiComponentScreen = (UiComponentScreen) parcel.readParcelable(IntegrationView.class.getClassLoader());
            NavigationState navigationState = (NavigationState) parcel.readParcelable(IntegrationView.class.getClassLoader());
            Function0 function0 = (Function0) parcel.readSerializable();
            Function0 function1 = (Function0) parcel.readSerializable();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readSerializable());
            }
            return new IntegrationView(uiComponentScreen, navigationState, function0, function1, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IntegrationView[] newArray(int i10) {
            return new IntegrationView[i10];
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements n<LayoutInflater, ViewGroup, Boolean, nq.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11099a = new b();

        public b() {
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Function1<nq.b, an.k<IntegrationView>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UiComponentScreen f11100a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f11101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f11102d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<RenderingT> implements an.k {
            public final /* synthetic */ UiComponentScreen b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ nq.b f11103c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n f11104d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f11105e;

            public a(UiComponentScreen uiComponentScreen, nq.b bVar, n nVar, g gVar) {
                this.b = uiComponentScreen;
                this.f11103c = bVar;
                this.f11104d = nVar;
                this.f11105e = gVar;
            }

            @Override // an.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numI = this.b.i();
                if (numI != null) {
                    nq.b bVar = this.f11103c;
                    int iIntValue = numI.intValue();
                    bVar.getRoot().setBackgroundColor(iIntValue);
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    vq.c.b(viewEnvironment, context, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.b;
                Context context2 = this.f11103c.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawableA = uiComponentScreen.a(context2);
                if (drawableA != null) {
                    nq.b bVar2 = this.f11103c;
                    bVar2.getRoot().setBackground(drawableA);
                    bVar2.f26638d.setBackgroundColor(0);
                }
                n nVar = this.f11104d;
                nq.b bVar3 = this.f11103c;
                Intrinsics.checkNotNull(bVar3);
                nVar.invoke(bVar3, rendering, this.f11105e.getViewBindings().a());
            }
        }

        public c(UiComponentScreen uiComponentScreen, Function2 function2, boolean z10, n nVar) {
            this.f11100a = uiComponentScreen;
            this.b = function2;
            this.f11101c = z10;
            this.f11102d = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final an.k<IntegrationView> invoke(nq.b binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(this.f11100a, binding, this.f11102d, s.f3757a.l(binding, this.f11100a, this.b, this.f11101c));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d extends k implements n<nq.b, IntegrationView, Map<String, ? extends ComponentView>, Unit> {
        public d(Object obj) {
            super(3, obj, IntegrationView.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V", 0);
        }

        public final void d(nq.b p8, IntegrationView p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((IntegrationView) this.receiver).m(p8, p10, p11);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ Unit invoke(nq.b bVar, IntegrationView integrationView, Map<String, ? extends ComponentView> map) {
            d(bVar, integrationView, map);
            return Unit.f22483a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntegrationView(@NotNull UiComponentScreen uiScreen, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNameToAction, boolean z10) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(componentNameToAction, "componentNameToAction");
        this.uiScreen = uiScreen;
        this.navigationState = navigationState;
        this.onBack = onBack;
        this.onCancel = onCancel;
        this.componentNameToAction = componentNameToAction;
        this.isLoading = z10;
        s sVar = s.f3757a;
        Function2 function2 = new Function2() { // from class: xo.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntegrationView.q((nq.b) obj, (Map) obj2);
            }
        };
        d dVar = new d(this);
        an.k.Companion companion = an.k.INSTANCE;
        this.viewFactory = new x(d0.b(IntegrationView.class), b.f11099a, new c(uiScreen, function2, true, dVar));
    }

    public static final void n(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final Unit o(IntegrationView integrationView) {
        integrationView.onBack.invoke();
        return Unit.f22483a;
    }

    public static final Unit p(IntegrationView integrationView) {
        integrationView.onCancel.invoke();
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(nq.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22483a;
    }

    @Override // an.b
    @NotNull
    public a0<IntegrationView> a() {
        return this.viewFactory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void m(nq.b binding, final IntegrationView rendering, Map<String, ComponentView> componentNameToComponentView) {
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNameToAction) {
            String strC = pair.c();
            final Function1<UiComponent, Unit> function1D = pair.d();
            final ComponentView componentView = componentNameToComponentView.get(strC);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: xo.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IntegrationView.n(function1D, componentView, view);
                    }
                });
                if (componentView.c() instanceof ActionButtonComponent) {
                    View viewD = componentView.d();
                    Intrinsics.d(viewD, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
                    ((ButtonWithLoadingIndicator) viewD).setIsLoading(rendering.isLoading);
                }
            }
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: xo.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationView.o(this.f35269a);
            }
        };
        Function0 function1 = new Function0() { // from class: xo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationView.p(this.f35270a);
            }
        };
        Pi2NavigationBar navigationBar = binding.f26639e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.UiStepStyle styles = rendering.uiScreen.getStyles();
        ir.c.e(navigationState, function0, function1, null, navigationBar, root, styles != null ? h.h(styles) : null, null, null, 392, null);
        FrameLayout contentContainer = binding.b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        p.b(contentContainer, rendering.uiScreen.getStyles(), false, false, 6, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.uiScreen, flags);
        dest.writeParcelable(this.navigationState, flags);
        dest.writeSerializable((Serializable) this.onBack);
        dest.writeSerializable((Serializable) this.onCancel);
        List<Pair<String, Function1<UiComponent, Unit>>> list = this.componentNameToAction;
        dest.writeInt(list.size());
        Iterator<Pair<String, Function1<UiComponent, Unit>>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeInt(this.isLoading ? 1 : 0);
    }
}
