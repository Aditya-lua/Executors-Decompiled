package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C1057h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.C3548i;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import er.C5199h;
import hu.InterfaceC6567c;
import io.C6880k;
import io.C6895n2;
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
import no.C9531g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p226jq.C7260g0;
import p226jq.C7265j;
import p226jq.C7288z;
import p227jr.C7304h0;
import p227jr.C7312p;
import p497vp.C12238a;
import p498vq.C12249c;
import p526wq.C12524g;
import p526wq.C12537t;
import p526wq.C12543z;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "Lno/g;", "binding", "<init>", "(Lno/g;)V", "rendering", "Lan/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;)V", "b", "Lno/g;", "", "c", "Z", "shouldHideSeparators", "Landroidx/recyclerview/widget/h;", "d", "Landroidx/recyclerview/widget/h;", "dividerItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3548i implements InterfaceC0382k<Screen.C3530e> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C9531g binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean shouldHideSeparators;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C1057h dividerItemDecoration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final RecyclerView recyclerView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3530e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<Screen.C3530e> f14103a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14128a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9531g> {

            /* JADX INFO: renamed from: a */
            public static final C14128a f14104a = new C14128a();

            public C14128a() {
                super(3, C9531g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C9531g m17559d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C9531g.m37630c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C9531g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m17559d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C9531g, C3548i> {

            /* JADX INFO: renamed from: a */
            public static final b f14105a = new b();

            public b() {
                super(1, C3548i.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C3548i invoke(C9531g p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C3548i(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.i.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3530e initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f14103a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3530e> getType() {
            return this.f14103a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f14103a = new C0395x(C7731d0.m32002b(Screen.C3530e.class), C14128a.f14104a, b.f14105a);
        }
    }

    public C3548i(@NotNull C9531g binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zM30326b = C7288z.m30326b(context, C12238a.f43172e, null, false, false, 14, null);
        this.shouldHideSeparators = zM30326b;
        C1057h c1057h = new C1057h(binding.getRoot().getContext(), 1);
        this.dividerItemDecoration = c1057h;
        RecyclerView recyclerView = binding.f34391h;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        if (!zM30326b) {
            recyclerView.m5317j(c1057h);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        this.recyclerView = recyclerView;
        CoordinatorLayout coordinatorLayoutM37631b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37631b, "getRoot(...)");
        C12524g.m46873d(coordinatorLayoutM37631b, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m17552g(C3548i c3548i, double d10) {
        View view = c3548i.binding.f34389f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (d10 > 0.0d) {
            layoutParams.height = (int) C7265j.m30285a(d10);
        } else {
            c3548i.binding.f34389f.setVisibility(8);
        }
        view.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17553i(Screen.C3530e c3530e, IdConfig idClass) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        c3530e.m17435o().invoke(idClass);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m17554j(Screen.C3530e c3530e) {
        c3530e.m17431k().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m17555k(Screen.C3530e c3530e) {
        c3530e.m17432l().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public final void m17556f(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C12249c.m45393b(viewEnvironment, context, iIntValue);
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            this.binding.getRoot().setBackground(drawableM33622a);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f34390g.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textviewGovernmentidInstructionsTitle = this.binding.f34394k;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            C7304h0.m30392l(textviewGovernmentidInstructionsTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textviewGovernmentidInstructionsBody = this.binding.f34392i;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
            C7304h0.m30392l(textviewGovernmentidInstructionsBody, textStyleValue, null, 2, null);
            TextView textviewGovernmentidInstructionslistheader = this.binding.f34395l;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
            C7304h0.m30392l(textviewGovernmentidInstructionslistheader, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f34393j;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
            C7304h0.m30392l(textviewGovernmentidInstructionsDisclaimer, disclaimerStyleValue, null, 2, null);
        }
        Integer governmentIdSelectOptionBorderColorValue = styles.getGovernmentIdSelectOptionBorderColorValue();
        if (governmentIdSelectOptionBorderColorValue != null) {
            int iIntValue2 = governmentIdSelectOptionBorderColorValue.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue2, iIntValue2});
            gradientDrawable.setSize((int) Math.ceil(C7265j.m30285a(1.0d)), (int) Math.ceil(C7265j.m30285a(1.0d)));
            this.dividerItemDecoration.m5947m(gradientDrawable);
            this.binding.f34389f.setBackgroundColor(iIntValue2);
        }
        Double governmentIdOptionBorderWidthValue = styles.getGovernmentIdOptionBorderWidthValue();
        if (governmentIdOptionBorderWidthValue != null) {
            final double dDoubleValue = governmentIdOptionBorderWidthValue.doubleValue();
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.dividerItemDecoration.m5946l();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setSize((int) Math.ceil(C7265j.m30285a(dDoubleValue)), (int) Math.ceil(C7265j.m30285a(dDoubleValue)));
            }
            View listDivider = this.binding.f34389f;
            Intrinsics.checkNotNullExpressionValue(listDivider, "listDivider");
            C12543z.m46890b(listDivider, new Function0() { // from class: io.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3548i.m17552g(this.f26952a, dDoubleValue);
                }
            });
        }
        ConstraintLayout contentContainer = this.binding.f34385b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        C7312p.m30410b(contentContainer, styles, false, false, 6, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: lr.c.f(com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage, androidx.constraintlayout.widget.ConstraintLayout, boolean, int, java.lang.Object):android.view.View */
    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3530e rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43170c, null, false, 6, null);
        NextStep.GovernmentId.AssetConfig.SelectPage assetConfig = rendering.getAssetConfig();
        RemoteImage headerPictograph = assetConfig != null ? assetConfig.getHeaderPictograph() : null;
        if (numM30330f != null) {
            this.binding.f34388e.setImageResource(numM30330f.intValue());
            TextView textviewGovernmentidInstructionsTitle = this.binding.f34394k;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            ViewGroup.LayoutParams layoutParams = textviewGovernmentidInstructionsTitle.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textviewGovernmentidInstructionsTitle.setLayoutParams(marginLayoutParams);
            this.binding.f34387d.setVisibility(8);
            this.binding.f34388e.setVisibility(0);
        } else if (headerPictograph != null) {
            ConstraintLayout governmentidHeaderImageContainer = this.binding.f34387d;
            Intrinsics.checkNotNullExpressionValue(governmentidHeaderImageContainer, "governmentidHeaderImageContainer");
            C8243c.m33618f(headerPictograph, governmentidHeaderImageContainer, false, 2, null);
            this.binding.f34387d.setVisibility(0);
            this.binding.f34388e.setVisibility(8);
        } else {
            this.binding.f34387d.setVisibility(8);
            this.binding.f34388e.setVisibility(8);
        }
        TextView textviewGovernmentidInstructionsTitle2 = this.binding.f34394k;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle2, "textviewGovernmentidInstructionsTitle");
        C12537t.m46886b(textviewGovernmentidInstructionsTitle2, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        TextView textviewGovernmentidInstructionsBody = this.binding.f34392i;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
        C12537t.m46886b(textviewGovernmentidInstructionsBody, rendering.getPrompt());
        TextView textviewGovernmentidInstructionslistheader = this.binding.f34395l;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
        C12537t.m46886b(textviewGovernmentidInstructionslistheader, rendering.getChooseText());
        TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f34393j;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
        C12537t.m46886b(textviewGovernmentidInstructionsDisclaimer, rendering.getDisclaimer());
        if (!StringsKt.m32182p0(rendering.getDisclaimer())) {
            this.binding.f34390g.setAccessibilityTraversalAfter(C6895n2.f27028H0);
        }
        this.binding.f34389f.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView.AbstractC1025h adapter = this.recyclerView.getAdapter();
        C6880k c6880k = adapter instanceof C6880k ? (C6880k) adapter : null;
        if (c6880k == null) {
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            c6880k = new C6880k(context2, rendering.m17426f(), rendering.getStyles(), rendering.getAssetConfig(), rendering.getIconStyle(), new Function1() { // from class: io.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3548i.m17553i(rendering, (IdConfig) obj);
                }
            });
        }
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(c6880k);
        }
        c6880k.m29318I(rendering.getIsEnabled());
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: io.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3548i.m17554j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: io.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3548i.m17555k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.f34390g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutM37631b = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37631b, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutM37631b, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutM37631b2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37631b2, "getRoot(...)");
        C7260g0.m30278b(coordinatorLayoutM37631b2, rendering.getError(), rendering.m17433m(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            m17556f(styles3, viewEnvironment);
        }
    }
}
