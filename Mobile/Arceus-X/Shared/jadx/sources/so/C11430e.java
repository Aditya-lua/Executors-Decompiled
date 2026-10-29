package so;

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
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import er.C5199h;
import hu.InterfaceC6567c;
import io.C6891m2;
import ir.C6966c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lr.C8243c;
import lr.C8244d;
import no.C9528d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p226jq.C7260g0;
import p227jr.C7297e;
import p227jr.C7301g;
import p227jr.C7304h0;
import p227jr.C7312p;
import p232k.C7399a;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12537t;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: so.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m31665d2 = {"Lso/e;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "Lno/d;", "binding", "<init>", "(Lno/d;)V", "rendering", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "body", "Lcom/google/android/material/button/MaterialButton;", "cameraButton", "Landroid/widget/Button;", "uploadButton", "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "idImage", "idImageContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "contentContainer", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "b", "Lno/d;", "c", "Landroid/view/View;", "currentPictographAssetView", "d", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11430e implements InterfaceC0382k<Screen.C3528c> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C9528d binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View currentPictographAssetView;

    /* JADX INFO: renamed from: so.e$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lso/e$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3528c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<Screen.C3528c> f40419a;

        /* JADX INFO: renamed from: so.e$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14246a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9528d> {

            /* JADX INFO: renamed from: a */
            public static final C14246a f40420a = new C14246a();

            public C14246a() {
                super(3, C9528d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C9528d m42823d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C9528d.m37621c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C9528d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m42823d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: so.e$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C9528d, C11430e> {

            /* JADX INFO: renamed from: a */
            public static final b f40421a = new b();

            public b() {
                super(1, C11430e.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C11430e invoke(C9528d p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C11430e(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: so.e.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3528c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f40419a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3528c> getType() {
            return this.f40419a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f40419a = new C0395x(C7731d0.m32002b(Screen.C3528c.class), C14246a.f40420a, b.f40421a);
        }
    }

    public C11430e(@NotNull C9528d binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutM37622b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37622b, "getRoot(...)");
        C12524g.m46873d(coordinatorLayoutM37622b, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m42816h(Screen.C3528c c3528c, View view) {
        c3528c.m17406k().invoke();
    }

    /* JADX INFO: renamed from: i */
    public static final void m42817i(Screen.C3528c c3528c, View view) {
        c3528c.m17409n().invoke();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m42818j(Screen.C3528c c3528c) {
        c3528c.m17405j().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m42819k(Screen.C3528c c3528c) {
        c3528c.m17407l().invoke();
        return Unit.f29331a;
    }

    /* JADX DEBUG: Class process forced to load method for inline: jr.g.m(com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String[], java.lang.String[], java.lang.String[], java.lang.String[], int, java.lang.Object):void */
    /* JADX INFO: renamed from: f */
    public final void m42820f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, MaterialButton cameraButton, Button uploadButton, ThemeableLottieAnimationView idImage, View idImageContainer, ViewEnvironment viewEnvironment, ConstraintLayout contentContainer) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            root.setBackgroundColor(iIntValue);
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context, iIntValue);
        }
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            root.setBackground(drawableM33622a);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            C7304h0.m30392l(body, textStyleValue, null, 2, null);
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            C7297e.m30364h(cameraButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            C7297e.m30364h(uploadButton, buttonSecondaryStyleValue, false, false, false, 14, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            idImageContainer.setBackground(new ColorDrawable(fillColorValue.intValue()));
        }
        C7301g.m30380m(idImage, styles.getStrokeColorValue(), styles.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, null, new String[0], 68, null);
        C7312p.m30410b(contentContainer, styles, false, false, 6, null);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3528c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        C9528d c9528d = this.binding;
        Context context = c9528d.getRoot().getContext();
        TextView title = c9528d.f34374j;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C12537t.m46886b(title, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        c9528d.f34366b.setText(rendering.getBody());
        if (rendering.m17400e().contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
            if (StringsKt.m32182p0(rendering.getCameraText())) {
                c9528d.f34367c.setText((CharSequence) null);
                c9528d.f34367c.setIcon(C7399a.m30679b(context, C6891m2.f26999c));
            } else {
                c9528d.f34367c.setText(rendering.getCameraText());
                c9528d.f34367c.setIcon(null);
            }
            c9528d.f34367c.setOnClickListener(new View.OnClickListener() { // from class: so.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11430e.m42816h(rendering, view);
                }
            });
        }
        if (rendering.m17400e().contains(CaptureOptionNativeMobile.UPLOAD)) {
            c9528d.f34375k.setText(rendering.getUploadButtonText());
            c9528d.f34375k.setOnClickListener(new View.OnClickListener() { // from class: so.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11430e.m42817i(rendering, view);
                }
            });
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: so.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11430e.m42818j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: so.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11430e.m42819k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c9528d.f34373i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutM37622b = c9528d.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37622b, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutM37622b, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutM37622b2 = c9528d.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37622b2, "getRoot(...)");
        C7260g0.m30278b(coordinatorLayoutM37622b2, rendering.getError(), rendering.m17408m(), null, 0, 0, 56, null);
        if (rendering.getPictographAsset() == null) {
            c9528d.f34369e.setAnimation(rendering.getLocalAsset());
        } else if (this.currentPictographAssetView == null) {
            RemoteImage pictographAsset = rendering.getPictographAsset();
            ConstraintLayout imageViewContainer = c9528d.f34371g;
            Intrinsics.checkNotNullExpressionValue(imageViewContainer, "imageViewContainer");
            this.currentPictographAssetView = C8243c.m33618f(pictographAsset, imageViewContainer, false, 2, null);
            c9528d.f34372h.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            CoordinatorLayout coordinatorLayoutM37622b3 = c9528d.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37622b3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = c9528d.f34373i;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = c9528d.f34374j;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            TextView body = c9528d.f34366b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            PersonaMaterialButton cameraButton = c9528d.f34367c;
            Intrinsics.checkNotNullExpressionValue(cameraButton, "cameraButton");
            PersonaMaterialButton uploadButton = c9528d.f34375k;
            Intrinsics.checkNotNullExpressionValue(uploadButton, "uploadButton");
            ThemeableLottieAnimationView idImage = c9528d.f34369e;
            Intrinsics.checkNotNullExpressionValue(idImage, "idImage");
            View idImageContainer = c9528d.f34370f;
            Intrinsics.checkNotNullExpressionValue(idImageContainer, "idImageContainer");
            ConstraintLayout content = c9528d.f34368d;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            m42820f(styles3, coordinatorLayoutM37622b3, navigationBar2, title2, body, cameraButton, uploadButton, idImage, idImageContainer, viewEnvironment, content);
        }
    }
}
