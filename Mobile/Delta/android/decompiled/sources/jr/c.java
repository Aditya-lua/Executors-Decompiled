package jr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/view/ViewGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Landroid/view/View;", "innerView", "Landroid/graphics/Rect;", "viewBuiltInPadding", "", "skipModalPadding", "", "b", "(Landroid/view/ViewGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/view/View;Landroid/graphics/Rect;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "cornerRadius", "Landroid/graphics/drawable/GradientDrawable;", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundImage", "e", "(Landroid/view/ViewGroup;Landroid/graphics/drawable/Drawable;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void b(@NotNull ViewGroup viewGroup, @Nullable StepStyle stepStyle, @NotNull View innerView, @Nullable Rect rect, boolean z10) {
        int iD;
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
            iD = jq.z.d(context, hc.b.f18790o, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(iD));
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = lr.d.a(stepStyle, context2);
            if (drawableA != null) {
                e(viewGroup, drawableA);
            }
        }
        if (!z10 && stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp5 = left.getDp()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((int) jq.j.a(dp5.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp4 = top.getDp()) == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(((int) jq.j.a(dp4.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp3 = right.getDp()) == null) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(((int) jq.j.a(dp3.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp2 = bottom.getDp()) == null) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(((int) jq.j.a(dp2.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            innerView.setPadding(numValueOf != null ? numValueOf.intValue() : viewGroup.getPaddingLeft(), numValueOf2 != null ? numValueOf2.intValue() : viewGroup.getPaddingTop(), numValueOf3 != null ? numValueOf3.intValue() : viewGroup.getPaddingRight(), numValueOf4 != null ? numValueOf4.intValue() : viewGroup.getPaddingBottom());
        }
        viewGroup.setBackground(d(stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null));
    }

    public static /* synthetic */ void c(ViewGroup viewGroup, StepStyle stepStyle, View view, Rect rect, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            view = viewGroup;
        }
        if ((i10 & 4) != 0) {
            rect = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        b(viewGroup, stepStyle, view, rect, z10);
    }

    public static final GradientDrawable d(StyleElements.Size size) {
        Double dp2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fA = (float) jq.j.a((size == null || (dp2 = size.getDp()) == null) ? 12.0d : dp2.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        return gradientDrawable;
    }

    public static final void e(ViewGroup viewGroup, Drawable drawable) {
        Sequence sequenceP = iu.p.p(u0.a(viewGroup), new Function1() { // from class: jr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c.f((View) obj));
            }
        });
        if (iu.p.m(sequenceP)) {
            ((View) iu.p.t(sequenceP)).setBackground(drawable);
            return;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View aVar = new a(context);
        aVar.setBackground(drawable);
        viewGroup.addView(aVar, 0);
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        bVar.f1551t = viewGroup.getId();
        bVar.f1555v = viewGroup.getId();
        bVar.f1529i = viewGroup.getId();
        bVar.f1535l = viewGroup.getId();
        aVar.setLayoutParams(bVar);
    }

    public static final boolean f(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof a;
    }
}
