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
import androidx.core.graphics.C0546c;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0980s;
import aq.C1141e;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.C3956h;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import er.C5199h;
import hu.InterfaceC6567c;
import ir.C6966c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lr.C8243c;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p194ic.C6738b;
import p226jq.C7259g;
import p226jq.C7260g0;
import p226jq.C7265j;
import p226jq.C7288z;
import p227jr.C7297e;
import p227jr.C7301g;
import p227jr.C7304h0;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p477ut.C11969n;
import p497vp.C12238a;
import p498vq.C12247a;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12537t;
import p584yp.C13400t;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import us.AbstractC11939e;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Laq/e;", "binding", "<init>", "(Laq/e;)V", "rendering", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lan/y;)V", "Lvq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lvq/a;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lkn/a;", "orderedPoses", "Lkotlin/Pair;", "", "", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;)V", "b", "Laq/e;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentInstructionAssetView", "d", "a", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3956h implements InterfaceC0382k<SelfieWorkflow.AbstractC3928c.b> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1141e binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View currentInstructionAssetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.b> f16618a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14145a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1141e> {

            /* JADX INFO: renamed from: a */
            public static final C14145a f16619a = new C14145a();

            public C14145a() {
                super(3, C1141e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C1141e m20077d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C1141e.m6474c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C1141e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m20077d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C1141e, C3956h> {

            /* JADX INFO: renamed from: a */
            public static final b f16620a = new b();

            public b() {
                super(1, C3956h.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C3956h invoke(C1141e p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C3956h(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull SelfieWorkflow.AbstractC3928c.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f16618a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super SelfieWorkflow.AbstractC3928c.b> getType() {
            return this.f16618a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f16618a = new C0395x(C7731d0.m32002b(SelfieWorkflow.AbstractC3928c.b.class), C14145a.f16619a, b.f16620a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.h$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$showRendering$1$5", m39664f = "SelfieInstructionsRunner.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16621t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C1141e f16622u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f16623v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.b f16624w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f16625x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1141e c1141e, int i10, SelfieWorkflow.AbstractC3928c.b bVar, String str, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16622u = c1141e;
            this.f16623v = i10;
            this.f16624w = bVar;
            this.f16625x = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f16622u, this.f16623v, this.f16624w, this.f16625x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f16621t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InputStream inputStreamOpenRawResource = this.f16622u.f4730f.getContext().getResources().openRawResource(this.f16623v);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strM44671h = C11969n.m44671h(bufferedReader);
                C11958c.m44629a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyleM19835n = this.f16624w.getStyles();
                this.f16622u.f4730f.m8438z(C7301g.m30374g(strM44671h, selfieStepStyleM19835n != null ? selfieStepStyleM19835n.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), this.f16625x);
                return Unit.f29331a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3956h(@NotNull C1141e binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m20068i(SelfieWorkflow.AbstractC3928c.b bVar, View view) {
        bVar.m19829h().invoke();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m20069j(SelfieWorkflow.AbstractC3928c.b bVar) {
        bVar.m19827f().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m20070k(SelfieWorkflow.AbstractC3928c.b bVar) {
        bVar.m19828g().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public final void m20071e(StepStyles.SelfieStepStyle styles, C12247a systemUiController) {
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
            TextView textView = this.binding.f4737m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f4737m.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.f4737m;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            C7304h0.m30392l(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f4736l;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f4736l.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.f4736l;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartBody, "textviewSelfieStartBody");
            C7304h0.m30392l(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.f4735k;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.f4735k.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.f4735k;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieDisclosure, "textviewSelfieDisclosure");
            C7304h0.m30392l(textviewSelfieDisclosure, disclaimerStyleValue, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.m45389a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            this.binding.getRoot().setBackground(drawableM33622a);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f4731g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton startButton = this.binding.f4733i;
            Intrinsics.checkNotNullExpressionValue(startButton, "startButton");
            C7297e.m30364h(startButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f4734j.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f4728d.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
    }

    /* JADX INFO: renamed from: f */
    public final Pair<Integer, String> m20072f(SelfieType selfieType, List<? extends EnumC7638a> orderedPoses) {
        if (Intrinsics.m31980c(selfieType, SelfieType.CenterOnly.f16125a) || orderedPoses.size() == 1) {
            return C7352s.m30477a(Integer.valueOf(C13400t.f46974b), "pi2_head_turning_center");
        }
        return CollectionsKt.m31708f0(orderedPoses, 1) == EnumC7638a.Right ? C7352s.m30477a(Integer.valueOf(C13400t.f46975c), "pi2_head_turning_reversed") : C7352s.m30477a(Integer.valueOf(C13400t.f46973a), "pi2_head_turning");
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull SelfieWorkflow.AbstractC3928c.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        m20074h(rendering, C12249c.m45392a(viewEnvironment));
    }

    /* JADX INFO: renamed from: h */
    public final void m20074h(@NotNull final SelfieWorkflow.AbstractC3928c.b rendering, @Nullable C12247a systemUiController) {
        InterfaceC0980s interfaceC0980sM30269c;
        AbstractC0968m abstractC0968mM4979a;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        C1141e c1141e = this.binding;
        Context context = c1141e.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43187t, null, false, 6, null);
        if (numM30330f != null) {
            this.binding.f4729e.setImageResource(numM30330f.intValue());
            this.binding.f4729e.setVisibility(0);
        }
        if (rendering.getErrorMessage() != null) {
            ScrollView root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C7260g0.m30278b(root, rendering.getErrorMessage(), rendering.m19830i(), null, 4, 3000, 8, null);
        }
        TextView textviewSelfieStartTitle = c1141e.f4737m;
        Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
        C12537t.m46886b(textviewSelfieStartTitle, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        c1141e.f4736l.setText(rendering.getPrompt());
        AbstractC11939e.m44561b(c1141e.f4735k.getContext()).mo44562c(c1141e.f4735k, rendering.getDisclosure());
        c1141e.f4733i.setText(rendering.getStart());
        c1141e.f4733i.setOnClickListener(new View.OnClickListener() { // from class: yp.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3956h.m20068i(rendering, view);
            }
        });
        NavigationState navigationStateM19826e = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: yp.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3956h.m20069j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: yp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3956h.m20070k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c1141e.f4731g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ScrollView root2 = c1141e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        StepStyles.SelfieStepStyle selfieStepStyleM19835n = rendering.getStyles();
        Rect rectM24132h = selfieStepStyleM19835n != null ? C5199h.m24132h(selfieStepStyleM19835n) : null;
        String strM19825d = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle selfieStepStyleM19835n2 = rendering.getStyles();
        C6966c.m29335e(navigationStateM19826e, function0, function1, null, navigationBar, root2, rectM24132h, strM19825d, selfieStepStyleM19835n2 != null ? selfieStepStyleM19835n2.getNavBarTitleStyleValue() : null, 8, null);
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer numM30330f2 = C7288z.m30330f(context2, C12238a.f43182o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage remoteImageM19824c = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = c1141e.f4732h;
                Intrinsics.checkNotNullExpressionValue(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = C8243c.m33618f(remoteImageM19824c, nestedUiContainer, false, 2, null);
                c1141e.f4730f.setVisibility(8);
            }
        } else if (numM30330f2 != null) {
            c1141e.f4730f.setAnimation(numM30330f2.intValue());
            c1141e.f4730f.m8436x();
        } else {
            SelfieType selfieTypeM19833l = rendering.getSelfieType();
            List<PoseInfo> listM19831j = rendering.m19831j();
            ArrayList arrayList = new ArrayList(C7701q.m31905u(listM19831j, 10));
            Iterator<T> it = listM19831j.iterator();
            while (it.hasNext()) {
                arrayList.add(((PoseInfo) it.next()).getPose());
            }
            Pair<Integer, String> pairM20072f = m20072f(selfieTypeM19833l, arrayList);
            int iIntValue = pairM20072f.m31671a().intValue();
            String strM31672b = pairM20072f.m31672b();
            Context context3 = c1141e.f4730f.getContext();
            if (context3 != null && (interfaceC0980sM30269c = C7259g.m30269c(context3)) != null && (abstractC0968mM4979a = C0982t.m4979a(interfaceC0980sM30269c)) != null) {
                C7882k.m32780d(abstractC0968mM4979a, null, null, new b(c1141e, iIntValue, rendering, strM31672b, null), 3, null);
            }
            m20075l(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            m20071e(rendering.getStyles(), systemUiController);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m20075l(StepStyles.SelfieStepStyle styles) {
        if (styles == null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f4730f;
            int color = Color.parseColor("#022050");
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeableLottieAnimationView.m20474F(color, C7288z.m30328d(context, C6738b.f25906m, null, false, 6, null));
            ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.f4730f;
            int color2 = Color.parseColor("#AA85FF");
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i10 = C6738b.f25907n;
            themeableLottieAnimationView2.m20474F(color2, C7288z.m30328d(context2, i10, null, false, 6, null));
            Context context3 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iM30328d = C7288z.m30328d(context3, i10, null, false, 6, null);
            Context context4 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.binding.f4730f.m20474F(Color.parseColor("#DBCCFF"), C0546c.m2669c(iM30328d, C7288z.m30328d(context4, C6738b.f25908o, null, false, 6, null), 0.66f));
        }
    }
}
