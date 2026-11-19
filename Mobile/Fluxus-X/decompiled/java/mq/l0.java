package mq;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lmq/l0;", "Lnn/k;", "Lmq/q5$d$b;", "Loq/e;", "binding", "<init>", "(Loq/e;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "h", "(Lmq/q5$d$b;Lnn/z;)V", "Ljr/a;", "systemUiController", "g", "(Lmq/q5$d$b;Ljr/a;)V", "Lmq/z0;", "selfieType", BuildConfig.FLAVOR, "Lxn/a;", "orderedPoses", "Lkotlin/Pair;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "(Lmq/z0;Ljava/util/List;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ljr/a;)V", "b", "Loq/e;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentInstructionAssetView", "d", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements nn.k<q5.d.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oq.e binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentInstructionAssetView;

    /* JADX INFO: renamed from: mq.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lmq/l0$a;", "Lnn/b0;", "Lmq/q5$d$b;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lmq/q5$d$b;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<q5.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.b0<q5.d.b> f23670a;

        /* JADX INFO: renamed from: mq.l0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0463a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, oq.e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0463a f23671a = new C0463a();

            public C0463a() {
                super(3, oq.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            public final oq.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return oq.e.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ oq.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: mq.l0$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<oq.e, l0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f23672a = new b();

            public b() {
                super(1, l0.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final l0 invoke(oq.e p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new l0(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull q5.d.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f23670a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super q5.d.b> getType() {
            return this.f23670a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f23670a = new nn.y(p001kotlin.jvm.internal.d0.b(q5.d.b.class), C0463a.f23671a, b.f23672a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$showRendering$1$5", f = "SelfieInstructionsRunner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23673t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ oq.e f23674u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f23675v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q5.d.b f23676w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f23677x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.e eVar, int i10, q5.d.b bVar, String str, eu.b<? super b> bVar2) {
            super(2, bVar2);
            this.f23674u = eVar;
            this.f23675v = i10;
            this.f23676w = bVar;
            this.f23677x = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f23674u, this.f23675v, this.f23676w, this.f23677x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f23673t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            InputStream inputStreamOpenRawResource = this.f23674u.f28376f.getContext().getResources().openRawResource(this.f23675v);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strH = lu.n.h(bufferedReader);
                lu.c.a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyleN = this.f23676w.getStyles();
                this.f23674u.f28376f.z(yr.g.g(strH, selfieStepStyleN != null ? selfieStepStyleN.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), this.f23677x);
                return Unit.f21506a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }
    }

    public l0(@NotNull oq.e binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
    }

    public static final void i(q5.d.b bVar, View view) {
        bVar.h().invoke();
    }

    public static final Unit j(q5.d.b bVar) {
        bVar.f().invoke();
        return Unit.f21506a;
    }

    public static final Unit k(q5.d.b bVar) {
        bVar.g().invoke();
        return Unit.f21506a;
    }

    public final void e(StepStyles.SelfieStepStyle styles, jr.a systemUiController) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.f28383m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f28383m.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.f28383m;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            yr.h0.l(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f28382l;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f28382l.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.f28382l;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartBody, "textviewSelfieStartBody");
            yr.h0.l(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.f28381k;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.f28381k.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.f28381k;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieDisclosure, "textviewSelfieDisclosure");
            yr.h0.l(textviewSelfieDisclosure, disclaimerStyleValue, null, 2, null);
        }
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
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f28377g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton startButton = this.binding.f28379i;
            Intrinsics.checkNotNullExpressionValue(startButton, "startButton");
            yr.e.h(startButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f28380j.setGuidelineBegin((int) xq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f28374d.setGuidelineEnd((int) xq.j.a(dp2.doubleValue()));
    }

    public final Pair<Integer, String> f(z0 selfieType, List<? extends xn.a> orderedPoses) {
        if (Intrinsics.c(selfieType, z0.a.f24351a) || orderedPoses.size() == 1) {
            return zt.s.a(Integer.valueOf(z.b), "pi2_head_turning_center");
        }
        return CollectionsKt.f0(orderedPoses, 1) == xn.a.Right ? zt.s.a(Integer.valueOf(z.f24346c), "pi2_head_turning_reversed") : zt.s.a(Integer.valueOf(z.f24345a), "pi2_head_turning");
    }

    public final void g(@NotNull final q5.d.b rendering, @Nullable jr.a systemUiController) {
        androidx.p000lifecycle.s sVarC;
        androidx.p000lifecycle.m mVarA;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        oq.e eVar = this.binding;
        Context context = eVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = xq.z.f(context, jq.a.f20844t, null, false, 6, null);
        if (numF != null) {
            this.binding.f28375e.setImageResource(numF.intValue());
            this.binding.f28375e.setVisibility(0);
        }
        if (rendering.getErrorMessage() != null) {
            ScrollView root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            xq.g0.b(root, rendering.getErrorMessage(), rendering.i(), null, 4, 3000, 8, null);
        }
        TextView textviewSelfieStartTitle = eVar.f28383m;
        Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
        kr.u.b(textviewSelfieStartTitle, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        eVar.f28382l.setText(rendering.getPrompt());
        lt.e.b(eVar.f28381k.getContext()).c(eVar.f28381k, rendering.getDisclosure());
        eVar.f28379i.setText(rendering.getStart());
        eVar.f28379i.setOnClickListener(new View.OnClickListener() { // from class: mq.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.i(rendering, view);
            }
        });
        ir.a aVarE = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: mq.j0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: mq.k0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = eVar.f28377g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ScrollView root2 = eVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        StepStyles.SelfieStepStyle selfieStepStyleN = rendering.getStyles();
        Rect rectH = selfieStepStyleN != null ? sr.h.h(selfieStepStyleN) : null;
        String strD = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle selfieStepStyleN2 = rendering.getStyles();
        xr.c.e(aVarE, function0, function1, null, navigationBar, root2, rectH, strD, selfieStepStyleN2 != null ? selfieStepStyleN2.getNavBarTitleStyleValue() : null, 8, null);
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer numF2 = xq.z.f(context2, jq.a.f20839o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage remoteImageC = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = eVar.f28378h;
                Intrinsics.checkNotNullExpressionValue(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = as.c.f(remoteImageC, nestedUiContainer, false, 2, null);
                eVar.f28376f.setVisibility(8);
            }
        } else if (numF2 != null) {
            eVar.f28376f.setAnimation(numF2.intValue());
            eVar.f28376f.x();
        } else {
            z0 z0VarL = rendering.getSelfieType();
            List<PoseInfo> listJ = rendering.j();
            ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listJ, 10));
            Iterator<T> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((PoseInfo) it.next()).getPose());
            }
            Pair<Integer, String> pairF = f(z0VarL, arrayList);
            int iIntValue = pairF.a().intValue();
            String strB = pairF.b();
            Context context3 = eVar.f28376f.getContext();
            if (context3 != null && (sVarC = xq.g.c(context3)) != null && (mVarA = androidx.p000lifecycle.t.a(sVarC)) != null) {
                av.k.d(mVarA, null, null, new b(eVar, iIntValue, rendering, strB, null), 3, null);
            }
            l(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            e(rendering.getStyles(), systemUiController);
        }
    }

    @Override // nn.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull q5.d.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        g(rendering, jr.c.a(viewEnvironment));
    }

    public final void l(StepStyles.SelfieStepStyle styles) {
        if (styles == null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f28376f;
            int color = Color.parseColor("#022050");
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeableLottieAnimationView.F(color, xq.z.d(context, jc.b.f20298m, null, false, 6, null));
            ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.f28376f;
            int color2 = Color.parseColor("#AA85FF");
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView2.F(color2, xq.z.d(context2, jc.b.f20299n, null, false, 6, null));
            Context context3 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iD = xq.z.d(context3, jc.b.f20299n, null, false, 6, null);
            Context context4 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.binding.f28376f.F(Color.parseColor("#DBCCFF"), androidx.core.graphics.c.c(iD, xq.z.d(context4, jc.b.f20300o, null, false, 6, null), 0.66f));
        }
    }
}
