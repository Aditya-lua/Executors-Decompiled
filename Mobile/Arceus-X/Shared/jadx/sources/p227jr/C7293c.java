package p227jr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0637u0;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194ic.C6738b;
import p201iu.C6988p;
import p226jq.C7265j;
import p226jq.C7288z;

/* JADX INFO: renamed from: jr.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Landroid/view/ViewGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Landroid/view/View;", "innerView", "Landroid/graphics/Rect;", "viewBuiltInPadding", "", "skipModalPadding", "", "b", "(Landroid/view/ViewGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/view/View;Landroid/graphics/Rect;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "cornerRadius", "Landroid/graphics/drawable/GradientDrawable;", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundImage", "e", "(Landroid/view/ViewGroup;Landroid/graphics/drawable/Drawable;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7293c {
    /* JADX DEBUG: Class process forced to load method for inline: jq.z.d(android.content.Context, int, android.util.TypedValue, boolean, int, java.lang.Object):int */
    /* JADX INFO: renamed from: b */
    public static final void m30333b(@NotNull ViewGroup viewGroup, @Nullable StepStyle stepStyle, @NotNull View innerView, @Nullable Rect rect, boolean z10) {
        int iM30328d;
        StyleElements.SizeSet modalPaddingValue;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(innerView, "innerView");
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iM30328d = C7288z.m30328d(context, C6738b.f25908o, null, false, 6, null);
        } else {
            iM30328d = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(iM30328d));
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableM33622a = C8244d.m33622a(stepStyle, context2);
            if (drawableM33622a != null) {
                m30336e(viewGroup, drawableM33622a);
            }
        }
        if (!z10 && stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp5 = left.getDp()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((int) C7265j.m30285a(dp5.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp4 = top.getDp()) == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(((int) C7265j.m30285a(dp4.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp3 = right.getDp()) == null) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(((int) C7265j.m30285a(dp3.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp2 = bottom.getDp()) == null) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(((int) C7265j.m30285a(dp2.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            innerView.setPadding(numValueOf != null ? numValueOf.intValue() : viewGroup.getPaddingLeft(), numValueOf2 != null ? numValueOf2.intValue() : viewGroup.getPaddingTop(), numValueOf3 != null ? numValueOf3.intValue() : viewGroup.getPaddingRight(), numValueOf4 != null ? numValueOf4.intValue() : viewGroup.getPaddingBottom());
        }
        viewGroup.setBackground(m30335d(stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m30334c(ViewGroup viewGroup, StepStyle stepStyle, View view, Rect rect, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            view = viewGroup;
        }
        if ((i10 & 4) != 0) {
            rect = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        m30333b(viewGroup, stepStyle, view, rect, z10);
    }

    /* JADX INFO: renamed from: d */
    public static final GradientDrawable m30335d(StyleElements.Size size) {
        Double dp2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fM30285a = (float) C7265j.m30285a((size == null || (dp2 = size.getDp()) == null) ? 12.0d : dp2.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{fM30285a, fM30285a, fM30285a, fM30285a, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public static final void m30336e(ViewGroup viewGroup, Drawable drawable) {
        Sequence sequenceM29388p = C6988p.m29388p(C0637u0.m3198a(viewGroup), new Function1() { // from class: jr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7293c.m30337f((View) obj));
            }
        });
        if (C6988p.m29385m(sequenceM29388p)) {
            ((View) C6988p.m29392t(sequenceM29388p)).setBackground(drawable);
            return;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View c7289a = new C7289a(context);
        c7289a.setBackground(drawable);
        viewGroup.addView(c7289a, 0);
        ViewGroup.LayoutParams layoutParams = c7289a.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0513b).height = 0;
        c0513b.f2020t = viewGroup.getId();
        c0513b.f2024v = viewGroup.getId();
        c0513b.f1998i = viewGroup.getId();
        c0513b.f2004l = viewGroup.getId();
        c7289a.setLayoutParams(c0513b);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m30337f(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof C7289a;
    }
}
