package pp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lpp/h;", "", "", "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "", "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lqp/c;", "binding", "i", "(Lqp/c;)V", "rendering", "n", "(Lqp/c;Lpp/h;)V", "", "isWrappingButtons", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lqp/c;Z)V", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "f", "g", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

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

    public h(@NotNull String titleText, @NotNull String messageText, @NotNull String positiveButtonText, @Nullable StepStyle stepStyle, @NotNull Function0<Unit> onPositiveButtonClick, @NotNull String negativeButtonText, @NotNull Function0<Unit> onNegativeButtonClick) {
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
    }

    public static final Unit j(h hVar) {
        hVar.onNegativeButtonClick.invoke();
        return Unit.f22938a;
    }

    public static final void k(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(3);
    }

    public static final void l(View view) {
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void o(h hVar, View view) {
        hVar.onPositiveButtonClick.invoke();
    }

    public static final void p(h hVar, View view) {
        hVar.onNegativeButtonClick.invoke();
    }

    public static final Unit q(qp.c cVar, h hVar) {
        boolean z10 = true;
        if (cVar.f30032f.getLineCount() > 1 || cVar.f30033g.getLineCount() > 1) {
            PersonaMaterialButton negativeButton = cVar.f30032f;
            Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = cVar.f30030d.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            PersonaMaterialButton positiveButton = cVar.f30033g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = cVar.f30030d.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            cVar.f30030d.setReferencedIds(new int[]{cVar.f30033g.getId(), cVar.f30032f.getId()});
        } else {
            z10 = false;
        }
        hVar.h(hVar.styles, cVar, z10);
        return Unit.f22938a;
    }

    public final void h(StepStyle styles, qp.c binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.f30029c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        hr.c.c(bottomSheet, styles, bottomSheetContent, null, false, 12, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.f30035i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            hr.h0.l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.f30031e;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            hr.h0.l(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton positiveButton = binding.f30033g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            hr.e.h(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, false, 10, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton negativeButton = binding.f30032f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        hr.e.h(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, false, 10, null);
    }

    public final void i(@NotNull qp.c binding) {
        int iD;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(binding, "binding");
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(binding.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Function0 function0 = new Function0() { // from class: pp.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.j(this.f28957a);
            }
        };
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, null, binding.f30034h);
        binding.getRoot().postDelayed(new Runnable() { // from class: pp.e
            @Override // java.lang.Runnable
            public final void run() {
                h.k(bottomSheetBehaviorQ0);
            }
        }, 100L);
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: pp.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.l(view);
            }
        });
        binding.f30034h.setOnClickListener(new View.OnClickListener() { // from class: pp.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.m(bottomSheetBehaviorQ0, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iD = hq.z.d(context, ic.b.f20612o, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(mp.g.f24964a, Integer.valueOf(iD));
    }

    public final void n(@NotNull final qp.c binding, @NotNull final h rendering) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (this.titleText.length() > 0) {
            TextView title = binding.f30035i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            cr.h.e(title, this.titleText);
        } else {
            binding.f30035i.setVisibility(8);
        }
        TextView message = binding.f30031e;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        cr.h.e(message, this.messageText);
        binding.f30033g.setText(rendering.positiveButtonText);
        binding.f30033g.setOnClickListener(new View.OnClickListener() { // from class: pp.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.o(this.f28945a, view);
            }
        });
        binding.f30032f.setText(rendering.negativeButtonText);
        binding.f30032f.setOnClickListener(new View.OnClickListener() { // from class: pp.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.p(this.f28949a, view);
            }
        });
        PersonaMaterialButton negativeButton = binding.f30032f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        uq.z.b(negativeButton, new Function0() { // from class: pp.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.q(binding, this);
            }
        });
    }
}
