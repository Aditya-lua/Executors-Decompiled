package fq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006+"}, d2 = {"Lfq/l0;", "Lnn/b;", BuildConfig.FLAVOR, "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lgq/c;", "binding", "l", "(Lgq/c;)V", "rendering", "Lnn/z;", "viewEnvironment", "p", "(Lgq/c;Lfq/l0;Lnn/z;)V", BuildConfig.FLAVOR, "isWrappingButtons", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lgq/c;Z)V", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "f", "g", "Lnn/b0;", "h", "Lnn/b0;", "()Lnn/b0;", "viewFactory", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements nn.b<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String titleText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String messageText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String positiveButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyle styles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onPositiveButtonClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String negativeButtonText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onNegativeButtonClick;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nn.b0<l0> viewFactory;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"fq/l0$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f16441a;

        public a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f16441a = bottomSheetBehavior;
        }

        public static final void b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.X0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            final BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16441a;
            view.postDelayed(new Runnable() { // from class: fq.k0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.a.b(bottomSheetBehavior);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, gq.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16442a = new b();

        public b() {
            super(3, gq.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);
        }

        public final gq.c d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return gq.c.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ gq.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public l0(@NotNull String titleText, @NotNull String messageText, @NotNull String positiveButtonText, @Nullable StepStyle stepStyle, @NotNull Function0<Unit> onPositiveButtonClick, @NotNull String negativeButtonText, @NotNull Function0<Unit> onNegativeButtonClick) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(onNegativeButtonClick, "onNegativeButtonClick");
        this.titleText = titleText;
        this.messageText = messageText;
        this.positiveButtonText = positiveButtonText;
        this.styles = stepStyle;
        this.onPositiveButtonClick = onPositiveButtonClick;
        this.negativeButtonText = negativeButtonText;
        this.onNegativeButtonClick = onNegativeButtonClick;
        nn.k.Companion companion = nn.k.INSTANCE;
        this.viewFactory = new nn.y(p001kotlin.jvm.internal.d0.b(l0.class), b.f16442a, new Function1() { // from class: fq.b0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.u(this.f16381a, (gq.c) obj);
            }
        });
    }

    public static final Unit m(l0 l0Var) {
        l0Var.onNegativeButtonClick.invoke();
        return Unit.f21506a;
    }

    public static final void n(View view) {
    }

    public static final void o(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final Unit q(gq.c cVar, l0 l0Var) {
        boolean z10 = true;
        if (cVar.f17897f.getLineCount() > 1 || cVar.f17898g.getLineCount() > 1) {
            PersonaMaterialButton negativeButton = cVar.f17897f;
            Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = cVar.f17895d.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            PersonaMaterialButton positiveButton = cVar.f17898g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = cVar.f17895d.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            cVar.f17895d.setReferencedIds(new int[]{cVar.f17898g.getId(), cVar.f17897f.getId()});
        } else {
            z10 = false;
        }
        l0Var.k(l0Var.styles, cVar, z10);
        return Unit.f21506a;
    }

    public static final void r(l0 l0Var, View view) {
        l0Var.onPositiveButtonClick.invoke();
    }

    public static final void s(l0 l0Var, View view) {
        l0Var.onNegativeButtonClick.invoke();
    }

    public static final Unit t(l0 l0Var) {
        l0Var.onNegativeButtonClick.invoke();
        return Unit.f21506a;
    }

    public static final nn.k u(final l0 l0Var, final gq.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        l0Var.l(it);
        return new nn.k() { // from class: fq.c0
            @Override // nn.k
            public final void a(Object obj, ViewEnvironment viewEnvironment) {
                l0.v(this.b, it, (l0) obj, viewEnvironment);
            }
        };
    }

    public static final void v(l0 l0Var, gq.c cVar, l0 rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNull(cVar);
        l0Var.p(cVar, rendering, viewEnvironment);
    }

    @Override // nn.b
    @NotNull
    public nn.b0<l0> a() {
        return this.viewFactory;
    }

    public final void k(StepStyle styles, gq.c binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.f17894c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        yr.c.c(bottomSheet, styles, bottomSheetContent, null, false, 12, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.f17900i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            yr.h0.l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.f17896e;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            yr.h0.l(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton positiveButton = binding.f17898g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            yr.e.h(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, false, 10, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton negativeButton = binding.f17897f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        yr.e.h(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, false, 10, null);
    }

    public final void l(gq.c binding) {
        int iD;
        Integer backgroundColorValue;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(binding.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Function0 function0 = new Function0() { // from class: fq.h0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.m(this.f16404a);
            }
        };
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        kr.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, null, binding.f17899h);
        binding.getRoot().addOnAttachStateChangeListener(new a(bottomSheetBehaviorQ0));
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: fq.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.n(view);
            }
        });
        binding.f17899h.setOnClickListener(new View.OnClickListener() { // from class: fq.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.o(bottomSheetBehaviorQ0, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iD = xq.z.d(context, jc.b.f20300o, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(cq.g.f11516a, Integer.valueOf(iD));
    }

    public final void p(final gq.c binding, final l0 rendering, ViewEnvironment viewEnvironment) {
        if (this.titleText.length() > 0) {
            TextView title = binding.f17900i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            sr.h.e(title, this.titleText);
        } else {
            binding.f17900i.setVisibility(8);
        }
        TextView message = binding.f17896e;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        sr.h.e(message, this.messageText);
        binding.f17898g.setText(rendering.positiveButtonText);
        binding.f17898g.setOnClickListener(new View.OnClickListener() { // from class: fq.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.r(this.f16386a, view);
            }
        });
        binding.f17897f.setText(rendering.negativeButtonText);
        binding.f17897f.setOnClickListener(new View.OnClickListener() { // from class: fq.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.s(this.f16389a, view);
            }
        });
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        nn.e.c(bottomSheet, new Function0() { // from class: fq.f0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.t(this.f16391a);
            }
        });
        PersonaMaterialButton negativeButton = binding.f17897f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        kr.a0.b(negativeButton, new Function0() { // from class: fq.g0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.q(binding, this);
            }
        });
    }
}
