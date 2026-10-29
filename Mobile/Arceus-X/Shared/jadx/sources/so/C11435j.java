package so;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import er.C5199h;
import hu.InterfaceC6567c;
import ir.C6966c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.C9525a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p226jq.C7284v;
import p227jr.C7297e;
import p227jr.C7301g;
import p227jr.C7304h0;
import p227jr.C7312p;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12537t;
import p526wq.C12543z;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: so.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m31665d2 = {"Lso/j;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lno/a;", "binding", "<init>", "(Lno/a;)V", "rendering", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "Landroid/widget/Button;", "continueButton", "Landroidx/constraintlayout/widget/ConstraintLayout;", "contentContainer", "Landroid/widget/LinearLayout;", Footer.type, "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/Button;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;)V", "b", "Lno/a;", "c", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11435j implements InterfaceC0382k<Screen.C3529d> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C9525a binding;

    /* JADX INFO: renamed from: so.j$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lso/j$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3529d> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<Screen.C3529d> f40429a;

        /* JADX INFO: renamed from: so.j$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14247a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9525a> {

            /* JADX INFO: renamed from: a */
            public static final C14247a f40430a = new C14247a();

            public C14247a() {
                super(3, C9525a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C9525a m42836d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C9525a.m37611c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C9525a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m42836d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: so.j$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C9525a, C11435j> {

            /* JADX INFO: renamed from: a */
            public static final b f40431a = new b();

            public b() {
                super(1, C11435j.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C11435j invoke(C9525a p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C11435j(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: so.j.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3529d initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f40429a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3529d> getType() {
            return this.f40429a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f40429a = new C0395x(C7731d0.m32002b(Screen.C3529d.class), C14247a.f40430a, b.f40431a);
        }
    }

    public C11435j(@NotNull C9525a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutM37612b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37612b, "getRoot(...)");
        C12524g.m46873d(coordinatorLayoutM37612b, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m42829h(Screen.C3529d c3529d) {
        c3529d.m17417f().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m42830i(Screen.C3529d c3529d) {
        c3529d.m17418g().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m42831j(C9525a c9525a, LocalImageComponentStyle localImageComponentStyle) {
        ThemeableLottieAnimationView illustration = c9525a.f34313e;
        Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
        C7301g.m30372e(illustration, localImageComponentStyle, new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m42832k(Screen.C3529d c3529d, View view) {
        c3529d.m17419h().invoke();
    }

    /* JADX INFO: renamed from: f */
    public final void m42833f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, Button continueButton, ViewEnvironment viewEnvironment, ConstraintLayout contentContainer, LinearLayout footer) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            root.setBackgroundColor(iIntValue);
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = styles.getTitleStyle();
        if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            C7304h0.m30392l(title, base4, null, 2, null);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = styles.getButtonPrimaryStyle();
        if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            C7297e.m30364h(continueButton, base2, false, false, false, 14, null);
        }
        C7312p.m30410b(contentContainer, styles, false, false, 6, null);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3529d rendering, @NotNull ViewEnvironment viewEnvironment) {
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final C9525a c9525a = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: so.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11435j.m42829h(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: so.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11435j.m42830i(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c9525a.f34315g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutM37612b = c9525a.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37612b, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        final LocalImageComponentStyle base = null;
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutM37612b, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null && (imageLocalStyle = styles3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
            base = illustration.getBase();
        }
        c9525a.f34313e.setAnimation(C7284v.f28110l);
        if (base != null) {
            CoordinatorLayout coordinatorLayoutM37612b2 = c9525a.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37612b2, "getRoot(...)");
            C12543z.m46890b(coordinatorLayoutM37612b2, new Function0() { // from class: so.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11435j.m42831j(c9525a, base);
                }
            });
        }
        TextView title = c9525a.f34316h;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C12537t.m46886b(title, rendering.getTitleText());
        c9525a.f34311c.setText(rendering.getContinueButtonText());
        c9525a.f34311c.setOnClickListener(new View.OnClickListener() { // from class: so.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11435j.m42832k(rendering, view);
            }
        });
        StepStyles.GovernmentIdStepStyle styles4 = rendering.getStyles();
        if (styles4 != null) {
            CoordinatorLayout coordinatorLayoutM37612b3 = c9525a.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37612b3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = c9525a.f34315g;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = c9525a.f34316h;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            Button continueButton = c9525a.f34311c;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            ConstraintLayout innerContent = c9525a.f34314f;
            Intrinsics.checkNotNullExpressionValue(innerContent, "innerContent");
            LinearLayout footer = c9525a.f34312d;
            Intrinsics.checkNotNullExpressionValue(footer, "footer");
            m42833f(styles4, coordinatorLayoutM37612b3, navigationBar2, title2, continueButton, viewEnvironment, innerContent, footer);
        }
    }
}
