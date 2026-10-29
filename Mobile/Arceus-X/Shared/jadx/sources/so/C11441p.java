package so;

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
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import er.C5199h;
import hu.InterfaceC6567c;
import ir.C6966c;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import lr.C8244d;
import no.C9534j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p226jq.C7260g0;
import p226jq.C7265j;
import p227jr.C7297e;
import p227jr.C7304h0;
import p239k6.C7482v;
import p239k6.InterfaceC7479s;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12537t;
import p537x6.C12749j;
import p537x6.ImageRequest;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: so.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m31665d2 = {"Lso/p;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;", "Lno/j;", "binding", "<init>", "(Lno/j;)V", "rendering", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "body", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "usePhotoButton", "Landroid/widget/Button;", "chooseNewPhotoButton", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lan/y;)V", "b", "Lno/j;", "c", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11441p implements InterfaceC0382k<Screen.C3534i> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C9534j binding;

    /* JADX INFO: renamed from: so.p$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lso/p$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3534i> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<Screen.C3534i> f40443a;

        /* JADX INFO: renamed from: so.p$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14249a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9534j> {

            /* JADX INFO: renamed from: a */
            public static final C14249a f40444a = new C14249a();

            public C14249a() {
                super(3, C9534j.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C9534j m42853d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C9534j.m37639c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C9534j invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m42853d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: so.p$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C9534j, C11441p> {

            /* JADX INFO: renamed from: a */
            public static final b f40445a = new b();

            public b() {
                super(1, C11441p.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C11441p invoke(C9534j p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C11441p(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: so.p.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3534i initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f40443a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3534i> getType() {
            return this.f40443a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f40443a = new C0395x(C7731d0.m32002b(Screen.C3534i.class), C14249a.f40444a, b.f40445a);
        }
    }

    public C11441p(@NotNull C9534j binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutM37640b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37640b, "getRoot(...)");
        C12524g.m46873d(coordinatorLayoutM37640b, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m42846h(Screen.C3534i c3534i, View view) {
        c3534i.m17484q().invoke();
    }

    /* JADX INFO: renamed from: i */
    public static final void m42847i(Screen.C3534i c3534i, View view) {
        c3534i.m17482o().invoke();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m42848j(Screen.C3534i c3534i) {
        c3534i.m17480m().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m42849k(Screen.C3534i c3534i) {
        c3534i.m17481n().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public final void m42850f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, ButtonWithLoadingIndicator usePhotoButton, Button chooseNewPhotoButton, ViewEnvironment viewEnvironment) {
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
            C7297e.m30365i(usePhotoButton, buttonPrimaryStyleValue, false, 2, null);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            C7297e.m30364h(chooseNewPhotoButton, buttonSecondaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f34432j.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f34426d.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3534i rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        C9534j c9534j = this.binding;
        TextView title = c9534j.f34433k;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C12537t.m46886b(title, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        c9534j.f34424b.setText(rendering.getBody());
        c9534j.f34434l.setText(rendering.getConfirmButtonText());
        c9534j.f34434l.setOnClickListener(new View.OnClickListener() { // from class: so.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11441p.m42846h(rendering, view);
            }
        });
        c9534j.f34425c.setText(rendering.getChooseNewPhotoText());
        c9534j.f34425c.setOnClickListener(new View.OnClickListener() { // from class: so.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11441p.m42847i(rendering, view);
            }
        });
        File file = new File(rendering.getFileToReviewPath());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(rendering.getFileToReviewPath(), options);
        if (C7797x.m32309T(rendering.getFileMimeType(), "image/", false, 2, null)) {
            ImageView imageView = c9534j.f34429g;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            InterfaceC7479s imageLoader = rendering.getImageLoader();
            ImageRequest.a aVarM47600q = C12749j.m47600q(new ImageRequest.a(imageView.getContext()).m47525c(file), imageView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setSize(options.outWidth, options.outHeight);
            gradientDrawable.setColor(0);
            aVarM47600q.m47536n(C7482v.m31088c(gradientDrawable));
            imageLoader.mo31067c(aVarM47600q.m47524b());
        } else {
            c9534j.f34429g.setVisibility(8);
            c9534j.f34427e.setVisibility(0);
            c9534j.f34428f.setVisibility(0);
            c9534j.f34428f.setText(rendering.getFileName());
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: so.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11441p.m42848j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: so.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11441p.m42849k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c9534j.f34431i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutM37640b = c9534j.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37640b, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutM37640b, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        c9534j.f34434l.setIsLoading(rendering.getIsAutoClassifying());
        CoordinatorLayout coordinatorLayoutM37640b2 = c9534j.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37640b2, "getRoot(...)");
        C7260g0.m30278b(coordinatorLayoutM37640b2, rendering.getError(), rendering.m17483p(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            CoordinatorLayout coordinatorLayoutM37640b3 = c9534j.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37640b3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = c9534j.f34431i;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = c9534j.f34433k;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            TextView body = c9534j.f34424b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            ButtonWithLoadingIndicator usePhotoButton = c9534j.f34434l;
            Intrinsics.checkNotNullExpressionValue(usePhotoButton, "usePhotoButton");
            PersonaMaterialButton chooseNewPhotoButton = c9534j.f34425c;
            Intrinsics.checkNotNullExpressionValue(chooseNewPhotoButton, "chooseNewPhotoButton");
            m42850f(styles3, coordinatorLayoutM37640b3, navigationBar2, title2, body, usePhotoButton, chooseNewPhotoButton, viewEnvironment);
        }
    }
}
