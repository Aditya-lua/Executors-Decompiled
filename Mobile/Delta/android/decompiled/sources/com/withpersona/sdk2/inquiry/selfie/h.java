package com.withpersona.sdk2.inquiry.selfie;

import an.ViewEnvironment;
import an.a0;
import an.x;
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
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq.g0;
import jq.z;
import jr.h0;
import jt.s;
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
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yp.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Laq/e;", "binding", "<init>", "(Laq/e;)V", "rendering", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lan/y;)V", "Lvq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lvq/a;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lkn/a;", "orderedPoses", "Lkotlin/Pair;", "", "", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;)V", "b", "Laq/e;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentInstructionAssetView", "d", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements an.k<SelfieWorkflow.c.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final aq.e binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentInstructionAssetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<SelfieWorkflow.c.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<SelfieWorkflow.c.b> f12960a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0243a extends kotlin.jvm.internal.k implements zt.n<LayoutInflater, ViewGroup, Boolean, aq.e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0243a f12961a = new C0243a();

            public C0243a() {
                super(3, aq.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            public final aq.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return aq.e.c(p8, viewGroup, z10);
            }

            @Override // zt.n
            public /* bridge */ /* synthetic */ aq.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<aq.e, h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f12962a = new b();

            public b() {
                super(1, h.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final h invoke(aq.e p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new h(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // an.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SelfieWorkflow.c.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f12960a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // an.a0
        @NotNull
        public hu.c<? super SelfieWorkflow.c.b> getType() {
            return this.f12960a.getType();
        }

        public Companion() {
            an.k.Companion companion = an.k.INSTANCE;
            this.f12960a = new x(d0.b(SelfieWorkflow.c.b.class), C0243a.f12961a, b.f12962a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$showRendering$1$5", f = "SelfieInstructionsRunner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12963t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ aq.e f12964u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f12965v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.b f12966w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f12967x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(aq.e eVar, int i10, SelfieWorkflow.c.b bVar, String str, nt.b<? super b> bVar2) {
            super(2, bVar2);
            this.f12964u = eVar;
            this.f12965v = i10;
            this.f12966w = bVar;
            this.f12967x = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f12964u, this.f12965v, this.f12966w, this.f12967x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f12963t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            InputStream inputStreamOpenRawResource = this.f12964u.f3625f.getContext().getResources().openRawResource(this.f12965v);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strH = ut.n.h(bufferedReader);
                ut.c.a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyleN = this.f12966w.getStyles();
                this.f12964u.f3625f.z(jr.g.g(strH, selfieStepStyleN != null ? selfieStepStyleN.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), this.f12967x);
                return Unit.f22483a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ut.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public h(@NotNull aq.e binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
    }

    public static final void i(SelfieWorkflow.c.b bVar, View view) {
        bVar.h().invoke();
    }

    public static final Unit j(SelfieWorkflow.c.b bVar) {
        bVar.f().invoke();
        return Unit.f22483a;
    }

    public static final Unit k(SelfieWorkflow.c.b bVar) {
        bVar.g().invoke();
        return Unit.f22483a;
    }

    public final void e(StepStyles.SelfieStepStyle styles, vq.a systemUiController) {
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
            TextView textView = this.binding.f3632m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f3632m.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.f3632m;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            h0.l(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f3631l;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f3631l.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.f3631l;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartBody, "textviewSelfieStartBody");
            h0.l(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.f3630k;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.f3630k.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.f3630k;
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
        Drawable drawableA = lr.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f3626g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton startButton = this.binding.f3628i;
            Intrinsics.checkNotNullExpressionValue(startButton, "startButton");
            jr.e.h(startButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f3629j.setGuidelineBegin((int) jq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f3623d.setGuidelineEnd((int) jq.j.a(dp2.doubleValue()));
    }

    public final Pair<Integer, String> f(SelfieType selfieType, List<? extends kn.a> orderedPoses) {
        if (Intrinsics.c(selfieType, SelfieType.CenterOnly.f12562a) || orderedPoses.size() == 1) {
            return s.a(Integer.valueOf(t.b), "pi2_head_turning_center");
        }
        return CollectionsKt.f0(orderedPoses, 1) == kn.a.Right ? s.a(Integer.valueOf(t.f36263c), "pi2_head_turning_reversed") : s.a(Integer.valueOf(t.f36262a), "pi2_head_turning");
    }

    @Override // an.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull SelfieWorkflow.c.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        h(rendering, vq.c.a(viewEnvironment));
    }

    public final void h(@NotNull final SelfieWorkflow.c.b rendering, @Nullable vq.a systemUiController) {
        androidx.p000lifecycle.s sVarC;
        androidx.p000lifecycle.m mVarA;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        aq.e eVar = this.binding;
        Context context = eVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = z.f(context, vp.a.f33359t, null, false, 6, null);
        if (numF != null) {
            this.binding.f3624e.setImageResource(numF.intValue());
            this.binding.f3624e.setVisibility(0);
        }
        if (rendering.getErrorMessage() != null) {
            ScrollView root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            g0.b(root, rendering.getErrorMessage(), rendering.i(), null, 4, 3000, 8, null);
        }
        TextView textviewSelfieStartTitle = eVar.f3632m;
        Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
        wq.t.b(textviewSelfieStartTitle, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        eVar.f3631l.setText(rendering.getPrompt());
        us.e.b(eVar.f3630k.getContext()).c(eVar.f3630k, rendering.getDisclosure());
        eVar.f3628i.setText(rendering.getStart());
        eVar.f3628i.setOnClickListener(new View.OnClickListener() { // from class: yp.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.h.i(rendering, view);
            }
        });
        NavigationState navigationStateE = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: yp.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.h.j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: yp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.h.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = eVar.f3626g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ScrollView root2 = eVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        StepStyles.SelfieStepStyle selfieStepStyleN = rendering.getStyles();
        Rect rectH = selfieStepStyleN != null ? er.h.h(selfieStepStyleN) : null;
        String strD = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle selfieStepStyleN2 = rendering.getStyles();
        ir.c.e(navigationStateE, function0, function1, null, navigationBar, root2, rectH, strD, selfieStepStyleN2 != null ? selfieStepStyleN2.getNavBarTitleStyleValue() : null, 8, null);
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer numF2 = z.f(context2, vp.a.f33354o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage remoteImageC = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = eVar.f3627h;
                Intrinsics.checkNotNullExpressionValue(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = lr.c.f(remoteImageC, nestedUiContainer, false, 2, null);
                eVar.f3625f.setVisibility(8);
            }
        } else if (numF2 != null) {
            eVar.f3625f.setAnimation(numF2.intValue());
            eVar.f3625f.x();
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
            Context context3 = eVar.f3625f.getContext();
            if (context3 != null && (sVarC = jq.g.c(context3)) != null && (mVarA = androidx.p000lifecycle.t.a(sVarC)) != null) {
                ku.k.d(mVarA, null, null, new b(eVar, iIntValue, rendering, strB, null), 3, null);
            }
            l(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            e(rendering.getStyles(), systemUiController);
        }
    }

    public final void l(StepStyles.SelfieStepStyle styles) {
        if (styles == null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f3625f;
            int color = Color.parseColor("#022050");
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeableLottieAnimationView.F(color, z.d(context, hc.b.f18788m, null, false, 6, null));
            ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.f3625f;
            int color2 = Color.parseColor("#AA85FF");
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i10 = hc.b.f18789n;
            themeableLottieAnimationView2.F(color2, z.d(context2, i10, null, false, 6, null));
            Context context3 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iD = z.d(context3, i10, null, false, 6, null);
            Context context4 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.binding.f3625f.F(Color.parseColor("#DBCCFF"), androidx.core.graphics.c.c(iD, z.d(context4, hc.b.f18790o, null, false, 6, null), 0.66f));
        }
    }
}
