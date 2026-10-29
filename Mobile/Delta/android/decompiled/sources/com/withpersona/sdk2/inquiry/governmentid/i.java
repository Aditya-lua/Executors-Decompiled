package com.withpersona.sdk2.inquiry.governmentid;

import an.ViewEnvironment;
import an.a0;
import an.x;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import io.n2;
import jq.g0;
import jq.z;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wq.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "Lno/g;", "binding", "<init>", "(Lno/g;)V", "rendering", "Lan/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;Lan/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;)V", "b", "Lno/g;", "", "c", "Z", "shouldHideSeparators", "Landroidx/recyclerview/widget/h;", "d", "Landroidx/recyclerview/widget/h;", "dividerItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements an.k<Screen.e> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final no.g binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean shouldHideSeparators;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.recyclerview.widget.h dividerItemDecoration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RecyclerView recyclerView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<Screen.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Screen.e> f10919a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0198a extends kotlin.jvm.internal.k implements zt.n<LayoutInflater, ViewGroup, Boolean, no.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0198a f10920a = new C0198a();

            public C0198a() {
                super(3, no.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);
            }

            public final no.g d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return no.g.c(p8, viewGroup, z10);
            }

            @Override // zt.n
            public /* bridge */ /* synthetic */ no.g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<no.g, i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f10921a = new b();

            public b() {
                super(1, i.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final i invoke(no.g p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new i(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // an.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.e initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f10919a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // an.a0
        @NotNull
        public hu.c<? super Screen.e> getType() {
            return this.f10919a.getType();
        }

        public Companion() {
            an.k.Companion companion = an.k.INSTANCE;
            this.f10919a = new x(d0.b(Screen.e.class), C0198a.f10920a, b.f10921a);
        }
    }

    public i(@NotNull no.g binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zB = z.b(context, vp.a.f33344e, null, false, false, 14, null);
        this.shouldHideSeparators = zB;
        androidx.recyclerview.widget.h hVar = new androidx.recyclerview.widget.h(binding.getRoot().getContext(), 1);
        this.dividerItemDecoration = hVar;
        RecyclerView recyclerView = binding.f26536h;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        if (!zB) {
            recyclerView.j(hVar);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        this.recyclerView = recyclerView;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        wq.g.d(coordinatorLayoutB, false, false, false, false, 15, null);
    }

    public static final Unit g(i iVar, double d10) {
        View view = iVar.binding.f26534f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (d10 > 0.0d) {
            layoutParams.height = (int) jq.j.a(d10);
        } else {
            iVar.binding.f26534f.setVisibility(8);
        }
        view.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }

    public static final Unit i(Screen.e eVar, IdConfig idClass) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        eVar.o().invoke(idClass);
        return Unit.f22483a;
    }

    public static final Unit j(Screen.e eVar) {
        eVar.k().invoke();
        return Unit.f22483a;
    }

    public static final Unit k(Screen.e eVar) {
        eVar.l().invoke();
        return Unit.f22483a;
    }

    public final void f(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            vq.c.b(viewEnvironment, context, iIntValue);
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = lr.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f26535g.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textviewGovernmentidInstructionsTitle = this.binding.f26539k;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            h0.l(textviewGovernmentidInstructionsTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textviewGovernmentidInstructionsBody = this.binding.f26537i;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
            h0.l(textviewGovernmentidInstructionsBody, textStyleValue, null, 2, null);
            TextView textviewGovernmentidInstructionslistheader = this.binding.f26540l;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
            h0.l(textviewGovernmentidInstructionslistheader, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f26538j;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
            h0.l(textviewGovernmentidInstructionsDisclaimer, disclaimerStyleValue, null, 2, null);
        }
        Integer governmentIdSelectOptionBorderColorValue = styles.getGovernmentIdSelectOptionBorderColorValue();
        if (governmentIdSelectOptionBorderColorValue != null) {
            int iIntValue2 = governmentIdSelectOptionBorderColorValue.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue2, iIntValue2});
            gradientDrawable.setSize((int) Math.ceil(jq.j.a(1.0d)), (int) Math.ceil(jq.j.a(1.0d)));
            this.dividerItemDecoration.m(gradientDrawable);
            this.binding.f26534f.setBackgroundColor(iIntValue2);
        }
        Double governmentIdOptionBorderWidthValue = styles.getGovernmentIdOptionBorderWidthValue();
        if (governmentIdOptionBorderWidthValue != null) {
            final double dDoubleValue = governmentIdOptionBorderWidthValue.doubleValue();
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.dividerItemDecoration.l();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setSize((int) Math.ceil(jq.j.a(dDoubleValue)), (int) Math.ceil(jq.j.a(dDoubleValue)));
            }
            View listDivider = this.binding.f26534f;
            Intrinsics.checkNotNullExpressionValue(listDivider, "listDivider");
            wq.z.b(listDivider, new Function0() { // from class: io.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.i.g(this.f20653a, dDoubleValue);
                }
            });
        }
        ConstraintLayout contentContainer = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        jr.p.b(contentContainer, styles, false, false, 6, null);
    }

    @Override // an.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final Screen.e rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = z.f(context, vp.a.f33342c, null, false, 6, null);
        NextStep.GovernmentId.AssetConfig.SelectPage assetConfig = rendering.getAssetConfig();
        RemoteImage headerPictograph = assetConfig != null ? assetConfig.getHeaderPictograph() : null;
        if (numF != null) {
            this.binding.f26533e.setImageResource(numF.intValue());
            TextView textviewGovernmentidInstructionsTitle = this.binding.f26539k;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            ViewGroup.LayoutParams layoutParams = textviewGovernmentidInstructionsTitle.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textviewGovernmentidInstructionsTitle.setLayoutParams(marginLayoutParams);
            this.binding.f26532d.setVisibility(8);
            this.binding.f26533e.setVisibility(0);
        } else if (headerPictograph != null) {
            ConstraintLayout governmentidHeaderImageContainer = this.binding.f26532d;
            Intrinsics.checkNotNullExpressionValue(governmentidHeaderImageContainer, "governmentidHeaderImageContainer");
            lr.c.f(headerPictograph, governmentidHeaderImageContainer, false, 2, null);
            this.binding.f26532d.setVisibility(0);
            this.binding.f26533e.setVisibility(8);
        } else {
            this.binding.f26532d.setVisibility(8);
            this.binding.f26533e.setVisibility(8);
        }
        TextView textviewGovernmentidInstructionsTitle2 = this.binding.f26539k;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle2, "textviewGovernmentidInstructionsTitle");
        t.b(textviewGovernmentidInstructionsTitle2, rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String());
        TextView textviewGovernmentidInstructionsBody = this.binding.f26537i;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
        t.b(textviewGovernmentidInstructionsBody, rendering.getPrompt());
        TextView textviewGovernmentidInstructionslistheader = this.binding.f26540l;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
        t.b(textviewGovernmentidInstructionslistheader, rendering.getChooseText());
        TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f26538j;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
        t.b(textviewGovernmentidInstructionsDisclaimer, rendering.getDisclaimer());
        if (!StringsKt.p0(rendering.getDisclaimer())) {
            this.binding.f26535g.setAccessibilityTraversalAfter(n2.H0);
        }
        this.binding.f26534f.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView.h adapter = this.recyclerView.getAdapter();
        io.k kVar = adapter instanceof io.k ? (io.k) adapter : null;
        if (kVar == null) {
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            kVar = new io.k(context2, rendering.f(), rendering.getStyles(), rendering.getAssetConfig(), rendering.getIconStyle(), new Function1() { // from class: io.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.i.i(rendering, (IdConfig) obj);
                }
            });
        }
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(kVar);
        }
        kVar.I(rendering.getIsEnabled());
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: io.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.i.j(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: io.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.i.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.f26535g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect rectH = styles != null ? er.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        ir.c.e(navigationState, function0, function1, null, navigationBar, coordinatorLayoutB, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        g0.b(coordinatorLayoutB2, rendering.getError(), rendering.m(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            f(styles3, viewEnvironment);
        }
    }
}
