package gp;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
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
import p001kotlin.text.StringsKt;
import vo.m3;
import vo.y3;
import xq.g0;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lgp/e;", "Lnn/k;", "Lvo/y3$c;", "Lap/d;", "binding", "<init>", "(Lap/d;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "g", "(Lvo/y3$c;Lnn/z;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "body", "Lcom/google/android/material/button/MaterialButton;", "cameraButton", "Landroid/widget/Button;", "uploadButton", "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "idImage", "idImageContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "contentContainer", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lnn/z;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "b", "Lap/d;", "c", "Landroid/view/View;", "currentPictographAssetView", "d", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements nn.k<y3.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ap.d binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentPictographAssetView;

    /* JADX INFO: renamed from: gp.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgp/e$a;", "Lnn/b0;", "Lvo/y3$c;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lvo/y3$c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<y3.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0<y3.c> f17868a;

        /* JADX INFO: renamed from: gp.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0327a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, ap.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0327a f17869a = new C0327a();

            public C0327a() {
                super(3, ap.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;", 0);
            }

            public final ap.d d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return ap.d.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ ap.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: gp.e$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<ap.d, e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f17870a = new b();

            public b() {
                super(1, e.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final e invoke(ap.d p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new e(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull y3.c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f17868a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super y3.c> getType() {
            return this.f17868a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f17868a = new y(d0.b(y3.c.class), C0327a.f17869a, b.f17870a);
        }
    }

    public e(@NotNull ap.d binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        kr.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
    }

    public static final void h(y3.c cVar, View view) {
        cVar.k().invoke();
    }

    public static final void i(y3.c cVar, View view) {
        cVar.n().invoke();
    }

    public static final Unit j(y3.c cVar) {
        cVar.j().invoke();
        return Unit.f21506a;
    }

    public static final Unit k(y3.c cVar) {
        cVar.l().invoke();
        return Unit.f21506a;
    }

    public final void f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, MaterialButton cameraButton, Button uploadButton, ThemeableLottieAnimationView idImage, View idImageContainer, ViewEnvironment viewEnvironment, ConstraintLayout contentContainer) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            root.setBackgroundColor(iIntValue);
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            jr.c.b(viewEnvironment, context, iIntValue);
        }
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = as.d.a(styles, context2);
        if (drawableA != null) {
            root.setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            h0.l(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            h0.l(body, textStyleValue, null, 2, null);
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            yr.e.h(cameraButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            yr.e.h(uploadButton, buttonSecondaryStyleValue, false, false, false, 14, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            idImageContainer.setBackground(new ColorDrawable(fillColorValue.intValue()));
        }
        yr.g.m(idImage, styles.getStrokeColorValue(), styles.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, null, new String[0], 68, null);
        yr.p.b(contentContainer, styles, false, false, 6, null);
    }

    @Override // nn.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final y3.c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        ap.d dVar = this.binding;
        Context context = dVar.getRoot().getContext();
        TextView title = dVar.f3214j;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        u.b(title, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        dVar.b.setText(rendering.getBody());
        if (rendering.e().contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
            if (StringsKt.p0(rendering.getCameraText())) {
                dVar.f3207c.setText((CharSequence) null);
                dVar.f3207c.setIcon(k.a.b(context, m3.f34828c));
            } else {
                dVar.f3207c.setText(rendering.getCameraText());
                dVar.f3207c.setIcon(null);
            }
            dVar.f3207c.setOnClickListener(new View.OnClickListener() { // from class: gp.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.h(rendering, view);
                }
            });
        }
        if (rendering.e().contains(CaptureOptionNativeMobile.UPLOAD)) {
            dVar.f3215k.setText(rendering.getUploadButtonText());
            dVar.f3215k.setOnClickListener(new View.OnClickListener() { // from class: gp.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.i(rendering, view);
                }
            });
        }
        ir.a navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: gp.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: gp.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = dVar.f3213i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = dVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutB2 = dVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        g0.b(coordinatorLayoutB2, rendering.getError(), rendering.m(), null, 0, 0, 56, null);
        if (rendering.getPictographAsset() == null) {
            dVar.f3209e.setAnimation(rendering.getLocalAsset());
        } else if (this.currentPictographAssetView == null) {
            RemoteImage pictographAsset = rendering.getPictographAsset();
            ConstraintLayout imageViewContainer = dVar.f3211g;
            Intrinsics.checkNotNullExpressionValue(imageViewContainer, "imageViewContainer");
            this.currentPictographAssetView = as.c.f(pictographAsset, imageViewContainer, false, 2, null);
            dVar.f3212h.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            CoordinatorLayout coordinatorLayoutB3 = dVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = dVar.f3213i;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = dVar.f3214j;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            TextView body = dVar.b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            PersonaMaterialButton cameraButton = dVar.f3207c;
            Intrinsics.checkNotNullExpressionValue(cameraButton, "cameraButton");
            PersonaMaterialButton uploadButton = dVar.f3215k;
            Intrinsics.checkNotNullExpressionValue(uploadButton, "uploadButton");
            ThemeableLottieAnimationView idImage = dVar.f3209e;
            Intrinsics.checkNotNullExpressionValue(idImage, "idImage");
            View idImageContainer = dVar.f3210f;
            Intrinsics.checkNotNullExpressionValue(idImageContainer, "idImageContainer");
            ConstraintLayout content = dVar.f3208d;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            f(styles3, coordinatorLayoutB3, navigationBar2, title2, body, cameraButton, uploadButton, idImage, idImageContainer, viewEnvironment, content);
        }
    }
}
