package lp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nn.ViewEnvironment;
import nn.b0;
import nn.y;
import or.ComponentView;
import or.UiComponentScreen;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import qr.ActionButtonComponent;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R5\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e0\f0\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0012\u00109R&\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b%\u0010=¨\u0006A"}, d2 = {"Llp/m;", "Lnn/b;", "Landroid/os/Parcelable;", "Lor/i;", "uiScreen", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", "componentNameToAction", BuildConfig.FLAVOR, "isLoading", "<init>", "(Lor/i;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lbr/b;", "binding", "rendering", BuildConfig.FLAVOR, "Lor/a;", "componentNameToComponentView", "l", "(Lbr/b;Llp/m;Ljava/util/Map;)V", "a", "Lor/i;", "getUiScreen", "()Lor/i;", "b", "Lir/a;", "getNavigationState", "()Lir/a;", "c", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "d", "getOnCancel", "e", "Ljava/util/List;", "getComponentNameToAction", "()Ljava/util/List;", "f", "Z", "()Z", "Lnn/b0;", "g", "Lnn/b0;", "()Lnn/b0;", "getViewFactory$annotations", "()V", "viewFactory", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements nn.b<m>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ir.a navigationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onBack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onCancel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<String, Function1<x5, Unit>>> componentNameToAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isLoading;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<m> viewFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UiComponentScreen uiComponentScreen = (UiComponentScreen) parcel.readParcelable(m.class.getClassLoader());
            ir.a aVar = (ir.a) parcel.readParcelable(m.class.getClassLoader());
            Function0 function0 = (Function0) parcel.readSerializable();
            Function0 function1 = (Function0) parcel.readSerializable();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readSerializable());
            }
            return new m(uiComponentScreen, aVar, function0, function1, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, br.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22414a = new b();

        public b() {
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
    public static final class c implements Function1<br.b, nn.k<m>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UiComponentScreen f22415a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f22416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pu.n f22417d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<RenderingT> implements nn.k {
            public final /* synthetic */ UiComponentScreen b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ br.b f22418c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ pu.n f22419d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ or.j f22420e;

            public a(UiComponentScreen uiComponentScreen, br.b bVar, pu.n nVar, or.j jVar) {
                this.b = uiComponentScreen;
                this.f22418c = bVar;
                this.f22419d = nVar;
                this.f22420e = jVar;
            }

            @Override // nn.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numI = this.b.i();
                if (numI != null) {
                    br.b bVar = this.f22418c;
                    int iIntValue = numI.intValue();
                    bVar.getRoot().setBackgroundColor(iIntValue);
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    jr.c.b(viewEnvironment, context, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.b;
                Context context2 = this.f22418c.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable drawableA = uiComponentScreen.a(context2);
                if (drawableA != null) {
                    br.b bVar2 = this.f22418c;
                    bVar2.getRoot().setBackground(drawableA);
                    bVar2.f4560d.setBackgroundColor(0);
                }
                pu.n nVar = this.f22419d;
                br.b bVar3 = this.f22418c;
                Intrinsics.checkNotNull(bVar3);
                nVar.invoke(bVar3, rendering, this.f22420e.getViewBindings().a());
            }
        }

        public c(UiComponentScreen uiComponentScreen, Function2 function2, boolean z10, pu.n nVar) {
            this.f22415a = uiComponentScreen;
            this.b = function2;
            this.f22416c = z10;
            this.f22417d = nVar;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nn.k<m> invoke(br.b binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(this.f22415a, binding, this.f22417d, or.v.f28513a.l(binding, this.f22415a, this.b, this.f22416c));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d extends p001kotlin.jvm.internal.k implements pu.n<br.b, m, Map<String, ? extends ComponentView>, Unit> {
        public d(Object obj) {
            super(3, obj, m.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V", 0);
        }

        public final void d(br.b p8, m p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((m) this.receiver).l(p8, p10, p11);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ Unit invoke(br.b bVar, m mVar, Map<String, ? extends ComponentView> map) {
            d(bVar, mVar, map);
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull UiComponentScreen uiScreen, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull List<? extends Pair<String, ? extends Function1<? super x5, Unit>>> componentNameToAction, boolean z10) {
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
        or.v vVar = or.v.f28513a;
        Function2 function2 = new Function2() { // from class: lp.i
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m.q((br.b) obj, (Map) obj2);
            }
        };
        d dVar = new d(this);
        nn.k.Companion companion = nn.k.INSTANCE;
        this.viewFactory = new y(d0.b(m.class), b.f22414a, new c(uiScreen, function2, true, dVar));
    }

    public static final void n(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final Unit o(m mVar) {
        mVar.onBack.invoke();
        return Unit.f21506a;
    }

    public static final Unit p(m mVar) {
        mVar.onCancel.invoke();
        return Unit.f21506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(br.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
        return Unit.f21506a;
    }

    @Override // nn.b
    @NotNull
    public b0<m> a() {
        return this.viewFactory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void l(br.b binding, final m rendering, Map<String, ComponentView> componentNameToComponentView) {
        for (Pair<String, Function1<x5, Unit>> pair : this.componentNameToAction) {
            String strC = pair.c();
            final Function1<x5, Unit> function1D = pair.d();
            final ComponentView componentView = componentNameToComponentView.get(strC);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: lp.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m.n(function1D, componentView, view);
                    }
                });
                if (componentView.c() instanceof ActionButtonComponent) {
                    View viewD = componentView.d();
                    Intrinsics.d(viewD, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
                    ((ButtonWithLoadingIndicator) viewD).setIsLoading(rendering.isLoading);
                }
            }
        }
        ir.a aVar = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: lp.k
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.o(this.f22406a);
            }
        };
        Function0 function1 = new Function0() { // from class: lp.l
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.p(this.f22407a);
            }
        };
        Pi2NavigationBar navigationBar = binding.f4561e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.UiStepStyle styles = rendering.uiScreen.getStyles();
        xr.c.e(aVar, function0, function1, null, navigationBar, root, styles != null ? sr.h.h(styles) : null, null, null, 392, null);
        FrameLayout contentContainer = binding.b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        yr.p.b(contentContainer, rendering.uiScreen.getStyles(), false, false, 6, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.uiScreen, flags);
        dest.writeParcelable(this.navigationState, flags);
        dest.writeSerializable((Serializable) this.onBack);
        dest.writeSerializable((Serializable) this.onCancel);
        List<Pair<String, Function1<x5, Unit>>> list = this.componentNameToAction;
        dest.writeInt(list.size());
        Iterator<Pair<String, Function1<x5, Unit>>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeInt(this.isLoading ? 1 : 0);
    }
}
