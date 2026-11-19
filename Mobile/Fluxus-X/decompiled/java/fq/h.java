package fq;

import android.content.Context;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lfq/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lgq/c;", "binding", "i", "(Lgq/c;)V", "rendering", "n", "(Lgq/c;Lfq/h;)V", BuildConfig.FLAVOR, "isWrappingButtons", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lgq/c;Z)V", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "f", "g", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        return Unit.f21506a;
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

    public static final Unit q(gq.c cVar, h hVar) {
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
        hVar.h(hVar.styles, cVar, z10);
        return Unit.f21506a;
    }

    public final void h(StepStyle styles, gq.c binding, boolean isWrappingButtons) {
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

    public final void i(@NotNull gq.c binding) {
        int iD;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(binding, "binding");
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(binding.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Function0 function0 = new Function0() { // from class: fq.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.j(this.f16385a);
            }
        };
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        kr.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, null, binding.f17899h);
        binding.getRoot().postDelayed(new Runnable() { // from class: fq.e
            @Override // java.lang.Runnable
            public final void run() {
                h.k(bottomSheetBehaviorQ0);
            }
        }, 100L);
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: fq.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.l(view);
            }
        });
        binding.f17899h.setOnClickListener(new View.OnClickListener() { // from class: fq.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.m(bottomSheetBehaviorQ0, view);
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

    public final void n(@NotNull final gq.c binding, @NotNull final h rendering) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
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
        binding.f17898g.setOnClickListener(new View.OnClickListener() { // from class: fq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.o(this.f16373a, view);
            }
        });
        binding.f17897f.setText(rendering.negativeButtonText);
        binding.f17897f.setOnClickListener(new View.OnClickListener() { // from class: fq.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.p(this.f16380a, view);
            }
        });
        PersonaMaterialButton negativeButton = binding.f17897f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        kr.a0.b(negativeButton, new Function0() { // from class: fq.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.q(binding, this);
            }
        });
    }
}
