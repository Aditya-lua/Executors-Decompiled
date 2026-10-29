package com.withpersona.sdk2.inquiry.governmentid;

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
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.C3554m;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
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
import no.C9537m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p121f7.InterfaceC5465o0;
import p181i.C6589a;
import p226jq.C7288z;
import p227jr.C7304h0;
import p229jt.C7345l;
import p266l7.C8006e;
import p444t7.C11551b;
import p444t7.InterfaceC11554e;
import p497vp.C12238a;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12543z;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/m;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "Lno/m;", "binding", "<init>", "(Lno/m;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "rendering", "Lan/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "b", "Lno/m;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3554m implements InterfaceC0382k<Screen.C3535j> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C9537m binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.m$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/m$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3535j> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<Screen.C3535j> f14113a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.m$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14129a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9537m> {

            /* JADX INFO: renamed from: a */
            public static final C14129a f14114a = new C14129a();

            public C14129a() {
                super(3, C9537m.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C9537m m17593d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C9537m.m37648c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C9537m invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m17593d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.m$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C9537m, C3554m> {

            /* JADX INFO: renamed from: a */
            public static final b f14115a = new b();

            public b() {
                super(1, C3554m.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C3554m invoke(C9537m p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C3554m(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.m.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3535j initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f14113a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3535j> getType() {
            return this.f14113a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f14113a = new C0395x(C7731d0.m32002b(Screen.C3535j.class), C14129a.f14114a, b.f14115a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.m$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14116a;

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
            f14116a = iArr;
        }
    }

    public C3554m(@NotNull final C9537m binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43181n, null, false, 6, null);
        if (numM30330f != null) {
            binding.f34456f.setAnimation(numM30330f.intValue());
            binding.f34456f.m8436x();
        } else {
            binding.f34456f.m8424l(new C8006e("scanner", "**"), InterfaceC5465o0.f21161a, new InterfaceC11554e() { // from class: io.v
                @Override // p444t7.InterfaceC11554e
                /* JADX INFO: renamed from: a */
                public final Object mo25902a(C11551b c11551b) {
                    return C3554m.m17584c(this.f27161a, binding, c11551b);
                }
            });
        }
        ConstraintLayout constraintLayoutM37649b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM37649b, "getRoot(...)");
        C12524g.m46873d(constraintLayoutM37649b, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: c */
    public static Integer m17584c(C3554m c3554m, C9537m c9537m, C11551b c11551b) {
        Context context = c9537m.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(m17587g(c3554m, context, C6589a.f25047z, null, false, 6, null));
    }

    /* JADX INFO: renamed from: f */
    private final int m17586f(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m17587g(C3554m c3554m, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return c3554m.m17586f(context, i10, typedValue, z10);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17588i(Screen.C3535j c3535j) {
        c3535j.m17492g().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m17589j(Screen.C3535j c3535j) {
        c3535j.m17493h().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public final void m17590e(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) {
        float f10;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f34457g.getId(), this.binding.f34453c.getId(), this.binding.f34452b.getId()} : new int[]{this.binding.f34452b.getId(), this.binding.f34457g.getId(), this.binding.f34453c.getId()};
        C0518c c0518c = new C0518c();
        c0518c.m2509f(this.binding.f34454d);
        int i10 = b.f14116a[pendingPageAlignmentValue.ordinal()];
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
        c0518c.m2506c(this.binding.f34454d);
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context, iIntValue);
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            this.binding.getRoot().setBackground(drawableM33622a);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f34457g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f34453c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            C7304h0.m30392l(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue2 = fillColorValue.intValue();
            this.binding.f34456f.m20474F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f34456f.m20474F(Color.parseColor("#4600EB"), iIntValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.f34456f.m20474F(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int iIntValue3 = backgroundColorValue2.intValue();
            this.binding.f34456f.m20474F(Color.parseColor("#FFFFFF"), iIntValue3);
            this.binding.f34456f.m20474F(Color.parseColor("#F1EBFF"), iIntValue3);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3535j rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        C9537m c9537m = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: io.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3554m.m17588i(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: io.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3554m.m17589j(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c9537m.f34455e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutM37649b = c9537m.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM37649b, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, constraintLayoutM37649b, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        if (StringsKt.m32182p0(rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String())) {
            c9537m.f34457g.setVisibility(8);
        } else {
            c9537m.f34457g.setVisibility(0);
            c9537m.f34457g.setText(rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
            TextView title = c9537m.f34457g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C12543z.m46894f(title);
        }
        if (rendering.getDescription().length() == 0) {
            c9537m.f34453c.setVisibility(8);
        } else {
            c9537m.f34453c.setText(rendering.getDescription());
        }
        NextStep.GovernmentId.AssetConfig.PendingPage assetConfig = rendering.getAssetConfig();
        RemoteImage loadingPictograph = assetConfig != null ? assetConfig.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = this.binding.f34452b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = C8243c.m33617e(loadingPictograph, animationContainer, true);
            c9537m.f34456f.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            m17590e(styles3, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
