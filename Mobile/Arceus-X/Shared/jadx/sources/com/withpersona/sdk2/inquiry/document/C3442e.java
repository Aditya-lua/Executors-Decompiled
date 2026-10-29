package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import ao.C1129c;
import ar.InterfaceC1151f;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.document.C3442e;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
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
import lr.C8244d;
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
import p498vq.C12247a;
import p498vq.C12249c;
import p526wq.C12521d;
import p526wq.C12524g;
import p526wq.C12537t;
import p615zt.InterfaceC14057n;
import us.AbstractC11939e;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/e;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lar/f;", "Lao/c;", "binding", "<init>", "(Lao/c;)V", "rendering", "Lan/y;", "viewEnvironment", "", "m", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;)V", "Lvq/a;", "systemUiController", "h", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lvq/a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lvq/a;)V", "b", "Lao/c;", "c", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3442e implements InterfaceC0382k<DocumentWorkflow.InterfaceC3432c.ReviewCaptures>, InterfaceC1151f<DocumentWorkflow.InterfaceC3432c.ReviewCaptures> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1129c binding;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/e$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<DocumentWorkflow.InterfaceC3432c.ReviewCaptures> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<DocumentWorkflow.InterfaceC3432c.ReviewCaptures> f13206a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14114a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1129c> {

            /* JADX INFO: renamed from: a */
            public static final C14114a f13207a = new C14114a();

            public C14114a() {
                super(3, C1129c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C1129c m16605d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C1129c.m6438c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C1129c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m16605d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.e$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C1129c, C3442e> {

            /* JADX INFO: renamed from: a */
            public static final b f13208a = new b();

            public b() {
                super(1, C3442e.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C3442e invoke(C1129c p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C3442e(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.e.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull DocumentWorkflow.InterfaceC3432c.ReviewCaptures initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f13206a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super DocumentWorkflow.InterfaceC3432c.ReviewCaptures> getType() {
            return this.f13206a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f13206a = new C0395x(C7731d0.m32002b(DocumentWorkflow.InterfaceC3432c.ReviewCaptures.class), C14114a.f13207a, b.f13208a);
        }
    }

    public C3442e(@NotNull C1129c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout coordinatorLayoutM6439b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM6439b, "getRoot(...)");
        C12524g.m46873d(coordinatorLayoutM6439b, false, false, false, false, 15, null);
        binding.f4645g.m5317j(new C12521d((int) C7265j.m30285a(8.0d), false, false, false, 8, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.withpersona.sdk2.inquiry.document.DocumentFile */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final Unit m16597i(DocumentWorkflow.InterfaceC3432c.ReviewCaptures cVar, DocumentFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentFile.Remote) {
            cVar.m16544m().invoke(it);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m16598j(DocumentWorkflow.InterfaceC3432c.ReviewCaptures cVar, View view) {
        cVar.m16545n().invoke();
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m16599k(DocumentWorkflow.InterfaceC3432c.ReviewCaptures cVar) {
        cVar.m16541j().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m16600l(DocumentWorkflow.InterfaceC3432c.ReviewCaptures cVar) {
        cVar.m16542k().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public final void m16601g(StepStyles.DocumentStepStyle styles, C12247a systemUiController) {
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyle padding2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        if (styles != null && (backgroundColorValue = styles.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.m45389a(context, iIntValue);
            }
        }
        if (styles != null) {
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableM33622a = C8244d.m33622a(styles, context2);
            if (drawableM33622a != null) {
                this.binding.getRoot().setBackground(drawableM33622a);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.f4644f.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = this.binding.f4648j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView body = this.binding.f4640b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            C7304h0.m30392l(body, textStyleValue, null, 2, null);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView disclaimer = this.binding.f4642d;
            Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
            C7304h0.m30392l(disclaimer, disclaimerStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton submitButton = this.binding.f4647i;
            Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
            C7297e.m30364h(submitButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        if (styles != null && (padding2 = styles.getPadding()) != null && (screen2 = padding2.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f4646h.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        if (styles == null || (padding = styles.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f4643e.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Lvq/a;)V */
    @Override // ar.InterfaceC1151f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo6493b(@NotNull final DocumentWorkflow.InterfaceC3432c.ReviewCaptures rendering, @Nullable C12247a systemUiController) {
        C3443f c3443f;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        C1129c c1129c = this.binding;
        TextView title = c1129c.f4648j;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C12537t.m46886b(title, rendering.getTitle());
        String strM16547p = rendering.getPrompt();
        if (strM16547p != null) {
            AbstractC11939e.m44561b(this.binding.getRoot().getContext()).mo44562c(c1129c.f4640b, strM16547p);
        }
        c1129c.f4642d.setText(rendering.getDisclaimer());
        if (c1129c.f4645g.getAdapter() == null) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c3443f = new C3443f(context, rendering.getImageLoader(), rendering.m16546o(), rendering.getStyles());
            c1129c.f4645g.setAdapter(c3443f);
        } else {
            RecyclerView.AbstractC1025h adapter = c1129c.f4645g.getAdapter();
            Intrinsics.m31981d(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            c3443f = (C3443f) adapter;
        }
        c3443f.m16615K(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.m16536e());
        c3443f.m16614J(new Function1() { // from class: zn.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3442e.m16597i(rendering, (DocumentFile) obj);
            }
        });
        c1129c.f4647i.setText(rendering.getSubmitButtonText());
        c1129c.f4647i.setEnabled(rendering.getSubmitButtonEnabled());
        c1129c.f4647i.setOnClickListener(new View.OnClickListener() { // from class: zn.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3442e.m16598j(rendering, view);
            }
        });
        NavigationState navigationStateM16540i = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: zn.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3442e.m16599k(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: zn.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3442e.m16600l(rendering);
            }
        };
        Pi2NavigationBar navigationBar = c1129c.f4644f;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutM6439b = c1129c.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM6439b, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleM16548q = rendering.getStyles();
        Rect rectM24132h = documentStepStyleM16548q != null ? C5199h.m24132h(documentStepStyleM16548q) : null;
        String strM16539h = rendering.getNavBarTitle();
        StepStyles.DocumentStepStyle documentStepStyleM16548q2 = rendering.getStyles();
        C6966c.m29335e(navigationStateM16540i, function0, function1, null, navigationBar, coordinatorLayoutM6439b, rectM24132h, strM16539h, documentStepStyleM16548q2 != null ? documentStepStyleM16548q2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutM6439b2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM6439b2, "getRoot(...)");
        C7260g0.m30277a(coordinatorLayoutM6439b2, rendering.getError(), rendering.m16543l(), this.binding.f4647i, 4, BacktraceMetrics.defaultTimeBetweenRetriesMs);
        m16601g(rendering.getStyles(), systemUiController);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull DocumentWorkflow.InterfaceC3432c.ReviewCaptures rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        mo6493b(rendering, C12249c.m45392a(viewEnvironment));
    }
}
