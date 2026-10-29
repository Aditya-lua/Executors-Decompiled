package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1152g;
import ar.C1164s;
import ar.ComponentView;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import er.C5199h;
import ir.C6966c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R5\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0\f0\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0012\u00109R&\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b%\u0010=¨\u0006A"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "Lan/b;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "componentNameToAction", "", "isLoading", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lnq/b;", "binding", "rendering", "", "Lar/a;", "componentNameToComponentView", "m", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "getUiScreen", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "d", "getOnCancel", "e", "Ljava/util/List;", "getComponentNameToAction", "()Ljava/util/List;", "f", "Z", "()Z", "Lan/a0;", "g", "Lan/a0;", "()Lan/a0;", "getViewFactory$annotations", "()V", "viewFactory", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class IntegrationView implements InterfaceC0365b<IntegrationView>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntegrationView> CREATOR = new C3603a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NavigationState navigationState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onBack;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<String, Function1<UiComponent, Unit>>> componentNameToAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean isLoading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0364a0<IntegrationView> viewFactory;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationView$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3603a implements Parcelable.Creator<IntegrationView> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
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

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IntegrationView[] newArray(int i10) {
            return new IntegrationView[i10];
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationView$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3604b extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9546b> {

        /* JADX INFO: renamed from: a */
        public static final C3604b f14313a = new C3604b();

        public C3604b() {
            super(3, C9546b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C9546b m17957d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C9546b.m37676c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C9546b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m17957d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationView$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3605c implements Function1<C9546b, InterfaceC0382k<IntegrationView>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UiComponentScreen f14314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f14315b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f14316c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC14057n f14317d;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationView$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<RenderingT> implements InterfaceC0382k {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ UiComponentScreen f14318b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C9546b f14319c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC14057n f14320d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C1152g f14321e;

            public a(UiComponentScreen uiComponentScreen, C9546b c9546b, InterfaceC14057n interfaceC14057n, C1152g c1152g) {
                this.f14318b = uiComponentScreen;
                this.f14319c = c9546b;
                this.f14320d = interfaceC14057n;
                this.f14321e = c1152g;
            }

            @Override // p016an.InterfaceC0382k
            /* JADX INFO: renamed from: a */
            public final void mo1442a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numM20526i = this.f14318b.m20526i();
                if (numM20526i != null) {
                    C9546b c9546b = this.f14319c;
                    int iIntValue = numM20526i.intValue();
                    c9546b.getRoot().setBackgroundColor(iIntValue);
                    Context context = c9546b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    C12249c.m45393b(viewEnvironment, context, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.f14318b;
                Context context2 = this.f14319c.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawableM20524a = uiComponentScreen.m20524a(context2);
                if (drawableM20524a != null) {
                    C9546b c9546b2 = this.f14319c;
                    c9546b2.getRoot().setBackground(drawableM20524a);
                    c9546b2.f34504d.setBackgroundColor(0);
                }
                InterfaceC14057n interfaceC14057n = this.f14320d;
                C9546b c9546b3 = this.f14319c;
                Intrinsics.checkNotNull(c9546b3);
                interfaceC14057n.invoke(c9546b3, rendering, this.f14321e.getViewBindings().m6497a());
            }
        }

        public C3605c(UiComponentScreen uiComponentScreen, Function2 function2, boolean z10, InterfaceC14057n interfaceC14057n) {
            this.f14314a = uiComponentScreen;
            this.f14315b = function2;
            this.f14316c = z10;
            this.f14317d = interfaceC14057n;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0382k<IntegrationView> invoke(C9546b binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(this.f14314a, binding, this.f14317d, C1164s.f4917a.m6530l(binding, this.f14314a, this.f14315b, this.f14316c));
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationView$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3606d extends C7744k implements InterfaceC14057n<C9546b, IntegrationView, Map<String, ? extends ComponentView>, Unit> {
        public C3606d(Object obj) {
            super(3, obj, IntegrationView.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m17959d(C9546b p8, IntegrationView p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((IntegrationView) this.receiver).m17954m(p8, p10, p11);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(C9546b c9546b, IntegrationView integrationView, Map<String, ? extends ComponentView> map) {
            m17959d(c9546b, integrationView, map);
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, kotlin.Unit>>> */
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
        C1164s c1164s = C1164s.f4917a;
        Function2 function2 = new Function2() { // from class: xo.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntegrationView.m17953q((C9546b) obj, (Map) obj2);
            }
        };
        C3606d c3606d = new C3606d(this);
        InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
        this.viewFactory = new C0395x(C7731d0.m32002b(IntegrationView.class), C3604b.f14313a, new C3605c(uiScreen, function2, true, c3606d));
    }

    /* JADX INFO: renamed from: n */
    public static final void m17950n(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.m6490c());
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m17951o(IntegrationView integrationView) {
        integrationView.onBack.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m17952p(IntegrationView integrationView) {
        integrationView.onCancel.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Unit m17953q(C9546b binding, Map map) {
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
    public InterfaceC0364a0<IntegrationView> mo1380a() {
        return this.viewFactory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m17954m(C9546b binding, final IntegrationView rendering, Map<String, ComponentView> componentNameToComponentView) {
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNameToAction) {
            String strM31673c = pair.m31673c();
            final Function1<UiComponent, Unit> function1M31674d = pair.m31674d();
            final ComponentView componentView = componentNameToComponentView.get(strM31673c);
            if (componentView != null) {
                componentView.m6491d().setOnClickListener(new View.OnClickListener() { // from class: xo.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IntegrationView.m17950n(function1M31674d, componentView, view);
                    }
                });
                if (componentView.m6490c() instanceof ActionButtonComponent) {
                    View viewM6491d = componentView.m6491d();
                    Intrinsics.m31981d(viewM6491d, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
                    ((ButtonWithLoadingIndicator) viewM6491d).setIsLoading(rendering.isLoading);
                }
            }
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: xo.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationView.m17951o(this.f45732a);
            }
        };
        Function0 function1 = new Function0() { // from class: xo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationView.m17952p(this.f45733a);
            }
        };
        Pi2NavigationBar navigationBar = binding.f34505e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.UiStepStyle styles = rendering.uiScreen.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, root, styles != null ? C5199h.m24132h(styles) : null, null, null, 392, null);
        FrameLayout contentContainer = binding.f34502b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        C7312p.m30410b(contentContainer, rendering.uiScreen.getStyles(), false, false, 6, null);
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
