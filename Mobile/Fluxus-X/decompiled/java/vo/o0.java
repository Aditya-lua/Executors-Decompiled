package vo;

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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lvo/o0;", "Lnn/k;", "Lvo/y3$k;", "Lap/m;", "binding", "<init>", "(Lap/m;)V", "Landroid/content/Context;", BuildConfig.FLAVOR, "attrColor", "Landroid/util/TypedValue;", "typedValue", BuildConfig.FLAVOR, "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "h", "(Lvo/y3$k;Lnn/z;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lnn/z;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "b", "Lap/m;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 implements nn.k<y3.k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ap.m binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    /* JADX INFO: renamed from: vo.o0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lvo/o0$a;", "Lnn/b0;", "Lvo/y3$k;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lvo/y3$k;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<y3.k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.b0<y3.k> f34924a;

        /* JADX INFO: renamed from: vo.o0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0717a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, ap.m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0717a f34925a = new C0717a();

            public C0717a() {
                super(3, ap.m.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;", 0);
            }

            public final ap.m d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return ap.m.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ ap.m invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: vo.o0$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<ap.m, o0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34926a = new b();

            public b() {
                super(1, o0.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final o0 invoke(ap.m p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new o0(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull y3.k initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f34924a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super y3.k> getType() {
            return this.f34924a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f34924a = new nn.y(p001kotlin.jvm.internal.d0.b(y3.k.class), C0717a.f34925a, b.f34926a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34927a;

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
            f34927a = iArr;
        }
    }

    public o0(@NotNull final ap.m binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = xq.z.f(context, jq.a.f20838n, null, false, 6, null);
        if (numF != null) {
            binding.f3288f.setAnimation(numF.intValue());
            binding.f3288f.x();
        } else {
            binding.f3288f.l(new m7.e("scanner", "**"), g7.o0.f17499a, new u7.e() { // from class: vo.n0
                @Override // u7.e
                public final Object a(u7.b bVar) {
                    return o0.c(this.f34854a, binding, bVar);
                }
            });
        }
        ConstraintLayout constraintLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        kr.g.d(constraintLayoutB, false, false, false, false, 15, null);
    }

    public static Integer c(o0 o0Var, ap.m mVar, u7.b bVar) {
        Context context = mVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(g(o0Var, context, i.a.f18753z, null, false, 6, null));
    }

    private final int f(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    public static /* synthetic */ int g(o0 o0Var, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return o0Var.f(context, i10, typedValue, z10);
    }

    public static final Unit i(y3.k kVar) {
        kVar.g().invoke();
        return Unit.f21506a;
    }

    public static final Unit j(y3.k kVar) {
        kVar.h().invoke();
        return Unit.f21506a;
    }

    public final void e(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) {
        float f10;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f3289g.getId(), this.binding.f3285c.getId(), this.binding.b.getId()} : new int[]{this.binding.b.getId(), this.binding.f3289g.getId(), this.binding.f3285c.getId()};
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this.binding.f3286d);
        int i10 = b.f34927a[pendingPageAlignmentValue.ordinal()];
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
        cVar.c(this.binding.f3286d);
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            jr.c.b(viewEnvironment, context, iIntValue);
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = as.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f3289g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            yr.h0.l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f3285c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            yr.h0.l(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue2 = fillColorValue.intValue();
            this.binding.f3288f.F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f3288f.F(Color.parseColor("#4600EB"), iIntValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.f3288f.F(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int iIntValue3 = backgroundColorValue2.intValue();
            this.binding.f3288f.F(Color.parseColor("#FFFFFF"), iIntValue3);
            this.binding.f3288f.F(Color.parseColor("#F1EBFF"), iIntValue3);
        }
    }

    @Override // nn.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final y3.k rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        ap.m mVar = this.binding;
        ir.a navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: vo.l0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o0.i(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: vo.m0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o0.j(rendering);
            }
        };
        Pi2NavigationBar navigationBar = mVar.f3287e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = mVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, constraintLayoutB, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        if (StringsKt.p0(rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String())) {
            mVar.f3289g.setVisibility(8);
        } else {
            mVar.f3289g.setVisibility(0);
            mVar.f3289g.setText(rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
            TextView title = mVar.f3289g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            kr.a0.f(title);
        }
        if (rendering.getDescription().length() == 0) {
            mVar.f3285c.setVisibility(8);
        } else {
            mVar.f3285c.setText(rendering.getDescription());
        }
        NextStep.GovernmentId.AssetConfig.PendingPage assetConfig = rendering.getAssetConfig();
        RemoteImage loadingPictograph = assetConfig != null ? assetConfig.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = as.c.e(loadingPictograph, animationContainer, true);
            mVar.f3288f.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            e(styles3, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
