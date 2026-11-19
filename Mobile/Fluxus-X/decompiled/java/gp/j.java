package gp;

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
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import kr.a0;
import kr.u;
import nn.ViewEnvironment;
import nn.b0;
import nn.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import vo.y3;
import xq.v;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lgp/j;", "Lnn/k;", "Lvo/y3$d;", "Lap/a;", "binding", "<init>", "(Lap/a;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "g", "(Lvo/y3$d;Lnn/z;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "Landroid/widget/Button;", "continueButton", "Landroidx/constraintlayout/widget/ConstraintLayout;", "contentContainer", "Landroid/widget/LinearLayout;", Footer.type, "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/Button;Lnn/z;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;)V", "b", "Lap/a;", "c", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements nn.k<y3.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ap.a binding;

    /* JADX INFO: renamed from: gp.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgp/j$a;", "Lnn/b0;", "Lvo/y3$d;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lvo/y3$d;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<y3.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0<y3.d> f17876a;

        /* JADX INFO: renamed from: gp.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0328a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, ap.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0328a f17877a = new C0328a();

            public C0328a() {
                super(3, ap.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", 0);
            }

            public final ap.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return ap.a.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ ap.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: gp.j$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<ap.a, j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f17878a = new b();

            public b() {
                super(1, j.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final j invoke(ap.a p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new j(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull y3.d initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f17876a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super y3.d> getType() {
            return this.f17876a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f17876a = new y(d0.b(y3.d.class), C0328a.f17877a, b.f17878a);
        }
    }

    public j(@NotNull ap.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        kr.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
    }

    public static final Unit h(y3.d dVar) {
        dVar.f().invoke();
        return Unit.f21506a;
    }

    public static final Unit i(y3.d dVar) {
        dVar.g().invoke();
        return Unit.f21506a;
    }

    public static final Unit j(ap.a aVar, LocalImageComponentStyle localImageComponentStyle) {
        ThemeableLottieAnimationView illustration = aVar.f3166e;
        Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
        yr.g.e(illustration, localImageComponentStyle, new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f21506a;
    }

    public static final void k(y3.d dVar, View view) {
        dVar.h().invoke();
    }

    public final void f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, Button continueButton, ViewEnvironment viewEnvironment, ConstraintLayout contentContainer, LinearLayout footer) {
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
            jr.c.b(viewEnvironment, context, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = styles.getTitleStyle();
        if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            h0.l(title, base4, null, 2, null);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = styles.getButtonPrimaryStyle();
        if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            yr.e.h(continueButton, base2, false, false, false, 14, null);
        }
        yr.p.b(contentContainer, styles, false, false, 6, null);
    }

    @Override // nn.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final y3.d rendering, @NotNull ViewEnvironment viewEnvironment) {
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final ap.a aVar = this.binding;
        ir.a navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: gp.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.h(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: gp.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.i(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f3168g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        final LocalImageComponentStyle base = null;
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null && (imageLocalStyle = styles3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
            base = illustration.getBase();
        }
        aVar.f3166e.setAnimation(v.f37063l);
        if (base != null) {
            CoordinatorLayout coordinatorLayoutB2 = aVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
            a0.b(coordinatorLayoutB2, new Function0() { // from class: gp.h
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.j(aVar, base);
                }
            });
        }
        TextView title = aVar.f3169h;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        u.b(title, rendering.getTitleText());
        aVar.f3164c.setText(rendering.getContinueButtonText());
        aVar.f3164c.setOnClickListener(new View.OnClickListener() { // from class: gp.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.k(rendering, view);
            }
        });
        StepStyles.GovernmentIdStepStyle styles4 = rendering.getStyles();
        if (styles4 != null) {
            CoordinatorLayout coordinatorLayoutB3 = aVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = aVar.f3168g;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = aVar.f3169h;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            Button continueButton = aVar.f3164c;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            ConstraintLayout innerContent = aVar.f3167f;
            Intrinsics.checkNotNullExpressionValue(innerContent, "innerContent");
            LinearLayout footer = aVar.f3165d;
            Intrinsics.checkNotNullExpressionValue(footer, "footer");
            f(styles4, coordinatorLayoutB3, navigationBar2, title2, continueButton, viewEnvironment, innerContent, footer);
        }
    }
}
