package p419rp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import er.C5199h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194ic.C6738b;
import p226jq.C7288z;
import p227jr.C7293c;
import p227jr.C7297e;
import p227jr.C7304h0;
import p340op.C9841g;
import p434sp.C11444c;
import p526wq.C12519b;
import p526wq.C12543z;

/* JADX INFO: renamed from: rp.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006$"}, m31665d2 = {"Lrp/h;", "", "", "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "", "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lsp/c;", "binding", "i", "(Lsp/c;)V", "rendering", "n", "(Lsp/c;Lrp/h;)V", "", "isWrappingButtons", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lsp/c;Z)V", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "f", "g", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11020h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String titleText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String messageText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String positiveButtonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final StepStyle styles;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onPositiveButtonClick;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String negativeButtonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onNegativeButtonClick;

    public C11020h(@NotNull String titleText, @NotNull String messageText, @NotNull String positiveButtonText, @Nullable StepStyle stepStyle, @NotNull Function0<Unit> onPositiveButtonClick, @NotNull String negativeButtonText, @NotNull Function0<Unit> onNegativeButtonClick) {
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

    /* JADX INFO: renamed from: j */
    public static final Unit m41707j(C11020h c11020h) {
        c11020h.onNegativeButtonClick.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m41708k(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.m12125X0(3);
    }

    /* JADX INFO: renamed from: l */
    public static final void m41709l(View view) {
    }

    /* JADX INFO: renamed from: m */
    public static final void m41710m(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: o */
    public static final void m41711o(C11020h c11020h, View view) {
        c11020h.onPositiveButtonClick.invoke();
    }

    /* JADX INFO: renamed from: p */
    public static final void m41712p(C11020h c11020h, View view) {
        c11020h.onNegativeButtonClick.invoke();
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m41713q(C11444c c11444c, C11020h c11020h) {
        boolean z10 = true;
        if (c11444c.f40454f.getLineCount() > 1 || c11444c.f40455g.getLineCount() > 1) {
            PersonaMaterialButton negativeButton = c11444c.f40454f;
            Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = c11444c.f40452d.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            PersonaMaterialButton positiveButton = c11444c.f40455g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = c11444c.f40452d.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            c11444c.f40452d.setReferencedIds(new int[]{c11444c.f40455g.getId(), c11444c.f40454f.getId()});
        } else {
            z10 = false;
        }
        c11020h.m41714h(c11020h.styles, c11444c, z10);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public final void m41714h(StepStyle styles, C11444c binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.f40450b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.f40451c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        C7293c.m30334c(bottomSheet, styles, bottomSheetContent, null, false, 12, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.f40457i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.f40453e;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            C7304h0.m30392l(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton positiveButton = binding.f40455g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            C7297e.m30364h(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, false, 10, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton negativeButton = binding.f40454f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        C7297e.m30364h(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, false, 10, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m41715i(@NotNull C11444c binding) {
        int iM30328d;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(binding, "binding");
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(binding.f40450b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        Function0 function0 = new Function0() { // from class: rp.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11020h.m41707j(this.f38934a);
            }
        };
        FrameLayout bottomSheet = binding.f40450b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehaviorM12102q0, function0, bottomSheet, null, binding.f40456h);
        binding.getRoot().postDelayed(new Runnable() { // from class: rp.e
            @Override // java.lang.Runnable
            public final void run() {
                C11020h.m41708k(bottomSheetBehaviorM12102q0);
            }
        }, 100L);
        binding.f40450b.setOnClickListener(new View.OnClickListener() { // from class: rp.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11020h.m41709l(view);
            }
        });
        binding.f40456h.setOnClickListener(new View.OnClickListener() { // from class: rp.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11020h.m41710m(bottomSheetBehaviorM12102q0, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iM30328d = C7288z.m30328d(context, C6738b.f25908o, null, false, 6, null);
        } else {
            iM30328d = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(C9841g.f35675a, Integer.valueOf(iM30328d));
    }

    /* JADX INFO: renamed from: n */
    public final void m41716n(@NotNull final C11444c binding, @NotNull final C11020h rendering) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (this.titleText.length() > 0) {
            TextView title = binding.f40457i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C5199h.m24129e(title, this.titleText);
        } else {
            binding.f40457i.setVisibility(8);
        }
        TextView message = binding.f40453e;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        C5199h.m24129e(message, this.messageText);
        binding.f40455g.setText(rendering.positiveButtonText);
        binding.f40455g.setOnClickListener(new View.OnClickListener() { // from class: rp.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11020h.m41711o(this.f38917a, view);
            }
        });
        binding.f40454f.setText(rendering.negativeButtonText);
        binding.f40454f.setOnClickListener(new View.OnClickListener() { // from class: rp.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11020h.m41712p(this.f38922a, view);
            }
        });
        PersonaMaterialButton negativeButton = binding.f40454f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        C12543z.m46890b(negativeButton, new Function0() { // from class: rp.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11020h.m41713q(binding, this);
            }
        });
    }
}
