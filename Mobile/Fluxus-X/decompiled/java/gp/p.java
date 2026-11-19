package gp;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.io.File;
import kr.u;
import l6.s;
import l6.v;
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
import p001kotlin.text.x;
import vo.y3;
import xq.g0;
import y6.ImageRequest;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lgp/p;", "Lnn/k;", "Lvo/y3$j;", "Lap/j;", "binding", "<init>", "(Lap/j;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "g", "(Lvo/y3$j;Lnn/z;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "body", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "usePhotoButton", "Landroid/widget/Button;", "chooseNewPhotoButton", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lnn/z;)V", "b", "Lap/j;", "c", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements nn.k<y3.j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ap.j binding;

    /* JADX INFO: renamed from: gp.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgp/p$a;", "Lnn/b0;", "Lvo/y3$j;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lvo/y3$j;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<y3.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0<y3.j> f17888a;

        /* JADX INFO: renamed from: gp.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0330a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, ap.j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0330a f17889a = new C0330a();

            public C0330a() {
                super(3, ap.j.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;", 0);
            }

            public final ap.j d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return ap.j.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ ap.j invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: gp.p$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<ap.j, p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f17890a = new b();

            public b() {
                super(1, p.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final p invoke(ap.j p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new p(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull y3.j initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f17888a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super y3.j> getType() {
            return this.f17888a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f17888a = new y(d0.b(y3.j.class), C0330a.f17889a, b.f17890a);
        }
    }

    public p(@NotNull ap.j binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        kr.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
    }

    public static final void h(y3.j jVar, View view) {
        jVar.q().invoke();
    }

    public static final void i(y3.j jVar, View view) {
        jVar.o().invoke();
    }

    public static final Unit j(y3.j jVar) {
        jVar.m().invoke();
        return Unit.f21506a;
    }

    public static final Unit k(y3.j jVar) {
        jVar.n().invoke();
        return Unit.f21506a;
    }

    public final void f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, ButtonWithLoadingIndicator usePhotoButton, Button chooseNewPhotoButton, ViewEnvironment viewEnvironment) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
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
            yr.e.i(usePhotoButton, buttonPrimaryStyleValue, false, 2, null);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            yr.e.h(chooseNewPhotoButton, buttonSecondaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f3267j.setGuidelineBegin((int) xq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f3261d.setGuidelineEnd((int) xq.j.a(dp2.doubleValue()));
    }

    @Override // nn.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final y3.j rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        ap.j jVar = this.binding;
        TextView title = jVar.f3268k;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        u.b(title, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        jVar.b.setText(rendering.getBody());
        jVar.f3269l.setText(rendering.getConfirmButtonText());
        jVar.f3269l.setOnClickListener(new View.OnClickListener() { // from class: gp.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.h(rendering, view);
            }
        });
        jVar.f3260c.setText(rendering.getChooseNewPhotoText());
        jVar.f3260c.setOnClickListener(new View.OnClickListener() { // from class: gp.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.i(rendering, view);
            }
        });
        File file = new File(rendering.getFileToReviewPath());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(rendering.getFileToReviewPath(), options);
        if (x.T(rendering.getFileMimeType(), "image/", false, 2, null)) {
            ImageView imageView = jVar.f3264g;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            s imageLoader = rendering.getImageLoader();
            ImageRequest.a aVarQ = y6.j.q(new ImageRequest.a(imageView.getContext()).c(file), imageView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setSize(options.outWidth, options.outHeight);
            gradientDrawable.setColor(0);
            aVarQ.o(v.c(gradientDrawable));
            imageLoader.d(aVarQ.b());
        } else {
            jVar.f3264g.setVisibility(8);
            jVar.f3262e.setVisibility(0);
            jVar.f3263f.setVisibility(0);
            jVar.f3263f.setText(rendering.getFileName());
        }
        ir.a navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: gp.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: gp.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = jVar.f3266i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = jVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        jVar.f3269l.setIsLoading(rendering.getIsAutoClassifying());
        CoordinatorLayout coordinatorLayoutB2 = jVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        g0.b(coordinatorLayoutB2, rendering.getError(), rendering.p(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            CoordinatorLayout coordinatorLayoutB3 = jVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = jVar.f3266i;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = jVar.f3268k;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            TextView body = jVar.b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            ButtonWithLoadingIndicator usePhotoButton = jVar.f3269l;
            Intrinsics.checkNotNullExpressionValue(usePhotoButton, "usePhotoButton");
            PersonaMaterialButton chooseNewPhotoButton = jVar.f3260c;
            Intrinsics.checkNotNullExpressionValue(chooseNewPhotoButton, "chooseNewPhotoButton");
            f(styles3, coordinatorLayoutB3, navigationBar2, title2, body, usePhotoButton, chooseNewPhotoButton, viewEnvironment);
        }
    }
}
