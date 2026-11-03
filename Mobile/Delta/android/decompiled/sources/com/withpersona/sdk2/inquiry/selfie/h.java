package com.withpersona.sdk2.inquiry.selfie;

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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import gt.s;
import hq.g0;
import hq.z;
import hr.h0;
import iu.p0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wp.t;
import ym.ViewEnvironment;
import ym.a0;
import ym.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lyp/e;", "binding", "<init>", "(Lyp/e;)V", "rendering", "Lym/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lym/y;)V", "Ltq/a;", "systemUiController", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Ltq/a;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lin/a;", "orderedPoses", "Lkotlin/Pair;", "", "", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ltq/a;)V", "b", "Lyp/e;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentInstructionAssetView", "d", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements ym.k<SelfieWorkflow.c.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yp.e binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentInstructionAssetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<SelfieWorkflow.c.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<SelfieWorkflow.c.b> f13041a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0246a extends kotlin.jvm.internal.k implements xt.n<LayoutInflater, ViewGroup, Boolean, yp.e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0246a f13042a = new C0246a();

            public C0246a() {
                super(3, yp.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            public final yp.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return yp.e.c(p8, viewGroup, z10);
            }

            @Override // xt.n
            public /* bridge */ /* synthetic */ yp.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<yp.e, h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f13043a = new b();

            public b() {
                super(1, h.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final h invoke(yp.e p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new h(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SelfieWorkflow.c.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f13041a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public fu.c<? super SelfieWorkflow.c.b> getType() {
            return this.f13041a.getType();
        }

        public Companion() {
            ym.k.Companion companion = ym.k.INSTANCE;
            this.f13041a = new x(d0.b(SelfieWorkflow.c.b.class), C0246a.f13042a, b.f13043a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$showRendering$1$5", f = "SelfieInstructionsRunner.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13044t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ yp.e f13045u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f13046v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.b f13047w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13048x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yp.e eVar, int i10, SelfieWorkflow.c.b bVar, String str, lt.b<? super b> bVar2) {
            super(2, bVar2);
            this.f13045u = eVar;
            this.f13046v = i10;
            this.f13047w = bVar;
            this.f13048x = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f13045u, this.f13046v, this.f13047w, this.f13048x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f13044t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            InputStream inputStreamOpenRawResource = this.f13045u.f36984f.getContext().getResources().openRawResource(this.f13046v);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strH = st.n.h(bufferedReader);
                st.c.a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyleN = this.f13047w.getStyles();
                this.f13045u.f36984f.z(hr.g.g(strH, selfieStepStyleN != null ? selfieStepStyleN.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), this.f13048x);
                return Unit.f22938a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    st.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }
    }

    public h(@NotNull yp.e binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
    }

    public static final void i(SelfieWorkflow.c.b bVar, View view) {
        bVar.h().invoke();
    }

    public static final Unit j(SelfieWorkflow.c.b bVar) {
        bVar.f().invoke();
        return Unit.f22938a;
    }

    public static final Unit k(SelfieWorkflow.c.b bVar) {
        bVar.g().invoke();
        return Unit.f22938a;
    }

    public final void e(StepStyles.SelfieStepStyle styles, tq.a systemUiController) {
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
            TextView textView = this.binding.f36991m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f36991m.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.f36991m;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            h0.l(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f36990l;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f36990l.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.f36990l;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartBody, "textviewSelfieStartBody");
            h0.l(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.f36989k;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.f36989k.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.f36989k;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieDisclosure, "textviewSelfieDisclosure");
            h0.l(textviewSelfieDisclosure, disclaimerStyleValue, null, 2, null);
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
        Drawable drawableA = jr.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f36985g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton startButton = this.binding.f36987i;
            Intrinsics.checkNotNullExpressionValue(startButton, "startButton");
            hr.e.h(startButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f36988j.setGuidelineBegin((int) hq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f36982d.setGuidelineEnd((int) hq.j.a(dp2.doubleValue()));
    }

    public final Pair<Integer, String> f(SelfieType selfieType, List<? extends in.a> orderedPoses) {
        if (Intrinsics.c(selfieType, SelfieType.CenterOnly.f12643a) || orderedPoses.size() == 1) {
            return s.a(Integer.valueOf(t.b), "pi2_head_turning_center");
        }
        return CollectionsKt.f0(orderedPoses, 1) == in.a.Right ? s.a(Integer.valueOf(t.f34892c), "pi2_head_turning_reversed") : s.a(Integer.valueOf(t.f34891a), "pi2_head_turning");
    }

    public final void g(@NotNull final SelfieWorkflow.c.b rendering, @Nullable tq.a systemUiController) {
        androidx.p000lifecycle.s sVarC;
        androidx.p000lifecycle.m mVarA;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        yp.e eVar = this.binding;
        Context context = eVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = z.f(context, tp.a.f32495t, null, false, 6, null);
        if (numF != null) {
            this.binding.f36983e.setImageResource(numF.intValue());
            this.binding.f36983e.setVisibility(0);
        }
        if (rendering.getErrorMessage() != null) {
            ScrollView root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            g0.b(root, rendering.getErrorMessage(), rendering.i(), null, 4, 3000, 8, null);
        }
        TextView textviewSelfieStartTitle = eVar.f36991m;
        Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
        uq.t.b(textviewSelfieStartTitle, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        eVar.f36990l.setText(rendering.getPrompt());
        ss.e.b(eVar.f36989k.getContext()).c(eVar.f36989k, rendering.getDisclosure());
        eVar.f36987i.setText(rendering.getStart());
        eVar.f36987i.setOnClickListener(new View.OnClickListener() { // from class: wp.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.h.i(rendering, view);
            }
        });
        NavigationState navigationStateE = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: wp.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.h.j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: wp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.h.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = eVar.f36985g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ScrollView root2 = eVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        StepStyles.SelfieStepStyle selfieStepStyleN = rendering.getStyles();
        Rect rectH = selfieStepStyleN != null ? cr.h.h(selfieStepStyleN) : null;
        String strD = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle selfieStepStyleN2 = rendering.getStyles();
        gr.c.e(navigationStateE, function0, function1, null, navigationBar, root2, rectH, strD, selfieStepStyleN2 != null ? selfieStepStyleN2.getNavBarTitleStyleValue() : null, 8, null);
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer numF2 = z.f(context2, tp.a.f32490o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage remoteImageC = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = eVar.f36986h;
                Intrinsics.checkNotNullExpressionValue(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = jr.c.f(remoteImageC, nestedUiContainer, false, 2, null);
                eVar.f36984f.setVisibility(8);
            }
        } else if (numF2 != null) {
            eVar.f36984f.setAnimation(numF2.intValue());
            eVar.f36984f.x();
        } else {
            SelfieType selfieTypeL = rendering.getSelfieType();
            List<PoseInfo> listJ = rendering.j();
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listJ, 10));
            Iterator<T> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((PoseInfo) it.next()).getPose());
            }
            Pair<Integer, String> pairF = f(selfieTypeL, arrayList);
            int iIntValue = pairF.a().intValue();
            String strB = pairF.b();
            Context context3 = eVar.f36984f.getContext();
            if (context3 != null && (sVarC = hq.g.c(context3)) != null && (mVarA = androidx.p000lifecycle.t.a(sVarC)) != null) {
                iu.k.d(mVarA, null, null, new b(eVar, iIntValue, rendering, strB, null), 3, null);
            }
            l(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            e(rendering.getStyles(), systemUiController);
        }
    }

    @Override // ym.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull SelfieWorkflow.c.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        g(rendering, tq.c.a(viewEnvironment));
    }

    public final void l(StepStyles.SelfieStepStyle styles) {
        if (styles == null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f36984f;
            int color = Color.parseColor("#022050");
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeableLottieAnimationView.F(color, z.d(context, ic.b.f20610m, null, false, 6, null));
            ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.f36984f;
            int color2 = Color.parseColor("#AA85FF");
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i10 = ic.b.f20611n;
            themeableLottieAnimationView2.F(color2, z.d(context2, i10, null, false, 6, null));
            Context context3 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iD = z.d(context3, i10, null, false, 6, null);
            Context context4 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.binding.f36984f.F(Color.parseColor("#DBCCFF"), androidx.core.graphics.c.c(iD, z.d(context4, ic.b.f20612o, null, false, 6, null), 0.66f));
        }
    }
}
