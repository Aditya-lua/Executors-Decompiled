package jr;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0005\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "styles", "", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "b", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V", "a", "d", "e", "f", "Landroid/graphics/drawable/LayerDrawable;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)Landroid/graphics/drawable/LayerDrawable;", "Ljr/q;", "state", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Ljr/q;)Landroid/graphics/drawable/LayerDrawable;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21765a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21765a = iArr;
        }
    }

    public static final void a(@NotNull ConstraintLayout constraintLayout, @Nullable ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            e(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(g(clickableStackComponentStyle, q.ACTIVE));
        }
    }

    public static final void b(@NotNull ConstraintLayout constraintLayout, @NotNull ClickableStack.ClickableStackComponentStyle styles) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        e(constraintLayout, styles);
        constraintLayout.setBackground(g(styles, q.BASE));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int iA = (int) jq.j.a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f1555v = -1;
            ((ViewGroup.MarginLayoutParams) bVar).width = iA;
            constraintLayout.setLayoutParams(bVar);
        }
    }

    public static final void c(@NotNull ConstraintLayout constraintLayout, @NotNull HorizontalStack.HorizontalStackComponentStyle styles) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        f(constraintLayout, styles);
        constraintLayout.setBackground(h(styles));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int iA = (int) jq.j.a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f1555v = -1;
            ((ViewGroup.MarginLayoutParams) bVar).width = iA;
            constraintLayout.setLayoutParams(bVar);
        }
    }

    public static final void d(@NotNull ConstraintLayout constraintLayout, @Nullable ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            e(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(g(clickableStackComponentStyle, q.DISABLED));
        }
    }

    public static final void e(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        StyleElements.SizeSet marginValue = clickableStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            mr.d.c(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = clickableStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) jq.j.a(dp5.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) jq.j.a(dp4.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) jq.j.a(dp3.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) jq.j.a(dp2.doubleValue()));
        }
    }

    public static final void f(ConstraintLayout constraintLayout, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        StyleElements.SizeSet marginValue = horizontalStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            mr.d.c(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = horizontalStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) jq.j.a(dp5.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) jq.j.a(dp4.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) jq.j.a(dp3.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) jq.j.a(dp2.doubleValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    public static final LayerDrawable g(ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, q qVar) {
        int iIntValue;
        Integer baseBackgroundColorValue;
        StyleElements.Size right;
        Double dp2;
        StyleElements.Size left;
        Double dp3;
        StyleElements.Size bottom;
        Double dp4;
        StyleElements.Size top;
        Double dp5;
        Double dp6;
        StyleElements.Size right2;
        Double dp7;
        StyleElements.Size left2;
        Double dp8;
        StyleElements.Size bottom2;
        Double dp9;
        StyleElements.Size top2;
        Double dp10;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        StyleElements.SizeSet borderWidthValue = clickableStackComponentStyle.getBorderWidthValue();
        double dDoubleValue = 0.0d;
        Double dValueOf = Double.valueOf((borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp10 = top2.getDp()) == null) ? 0.0d : dp10.doubleValue());
        StyleElements.SizeSet borderWidthValue2 = clickableStackComponentStyle.getBorderWidthValue();
        Double dValueOf2 = Double.valueOf((borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp9 = bottom2.getDp()) == null) ? 0.0d : dp9.doubleValue());
        StyleElements.SizeSet borderWidthValue3 = clickableStackComponentStyle.getBorderWidthValue();
        Double dValueOf3 = Double.valueOf((borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp8 = left2.getDp()) == null) ? 0.0d : dp8.doubleValue());
        StyleElements.SizeSet borderWidthValue4 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 != null && (right2 = borderWidthValue4.getRight()) != null && (dp7 = right2.getDp()) != null) {
            dDoubleValue = dp7.doubleValue();
        }
        List listN = kotlin.collections.p.n(dValueOf, dValueOf2, dValueOf3, Double.valueOf(dDoubleValue));
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) Math.ceil(jq.j.a(((Number) it.next()).doubleValue()))));
        }
        int iIntValue2 = ((Number) CollectionsKt.r0(arrayList)).intValue();
        int[] iArr = a.f21765a;
        int i10 = iArr[qVar.ordinal()];
        if (i10 == 1) {
            Integer baseBorderColorValue = clickableStackComponentStyle.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                iIntValue = baseBorderColorValue.intValue();
            } else {
                iIntValue = 0;
            }
        } else if (i10 == 2) {
            Integer activeBorderColorValue = clickableStackComponentStyle.getActiveBorderColorValue();
            if (activeBorderColorValue != null) {
                iIntValue = activeBorderColorValue.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            if (i10 != 3) {
                throw new jt.l();
            }
            Integer disabledBorderColorValue = clickableStackComponentStyle.getDisabledBorderColorValue();
            if (disabledBorderColorValue != null) {
                iIntValue = disabledBorderColorValue.intValue();
            } else {
                iIntValue = 0;
            }
        }
        gradientDrawable.setStroke(iIntValue2, iIntValue);
        StyleElements.Size borderRadiusValue = clickableStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp6 = borderRadiusValue.getDp()) != null) {
            float fA = (float) jq.j.a(dp6.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.d(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
        }
        int i11 = iArr[qVar.ordinal()];
        if (i11 == 1) {
            baseBackgroundColorValue = clickableStackComponentStyle.getBaseBackgroundColorValue();
        } else if (i11 == 2) {
            baseBackgroundColorValue = clickableStackComponentStyle.getActiveBackgroundColorValue();
        } else {
            if (i11 != 3) {
                throw new jt.l();
            }
            baseBackgroundColorValue = clickableStackComponentStyle.getDisabledBackgroundColorValue();
        }
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp5 = top.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(jq.j.a(dp5.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp4 = bottom.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(jq.j.a(dp4.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp3 = left.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(jq.j.a(dp3.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp2 = right.getDp()) != null) {
            iIntValue2 -= (int) Math.ceil(jq.j.a(dp2.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue2, -iCeil2);
        return layerDrawable;
    }

    public static final LayerDrawable h(HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Object dp2;
        Object dp3;
        Object dp4;
        Object dp5;
        Object obj;
        StyleElements.Size right;
        Double dp6;
        StyleElements.Size left;
        Double dp7;
        StyleElements.Size bottom;
        Double dp8;
        StyleElements.Size top;
        Double dp9;
        Double dp10;
        StyleElements.Size right2;
        StyleElements.Size left2;
        StyleElements.Size bottom2;
        StyleElements.Size top2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Object obj2 = 0;
        gradientDrawable.setShape(0);
        StyleElements.SizeSet borderWidthValue = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp2 = top2.getDp()) == null) {
            dp2 = obj2;
        }
        StyleElements.SizeSet borderWidthValue2 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp3 = bottom2.getDp()) == null) {
            dp3 = obj2;
        }
        StyleElements.SizeSet borderWidthValue3 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp4 = left2.getDp()) == null) {
            dp4 = obj2;
        }
        StyleElements.SizeSet borderWidthValue4 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 == null || (right2 = borderWidthValue4.getRight()) == null || (dp5 = right2.getDp()) == null) {
            dp5 = obj2;
        }
        Iterator it = kotlin.collections.p.n(dp2, dp3, dp4, dp5).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dCeil = Math.ceil(jq.j.a(((Number) next).doubleValue()));
                do {
                    Object next2 = it.next();
                    double dCeil2 = Math.ceil(jq.j.a(((Number) next2).doubleValue()));
                    if (Double.compare(dCeil, dCeil2) < 0) {
                        next = next2;
                        dCeil = dCeil2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        int iIntValue = ((Number) (obj != null ? obj : 0)).intValue();
        Integer baseBorderColorValue = horizontalStackComponentStyle.getBaseBorderColorValue();
        gradientDrawable.setStroke(iIntValue, baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0);
        StyleElements.Size borderRadiusValue = horizontalStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp10 = borderRadiusValue.getDp()) != null) {
            float fA = (float) jq.j.a(dp10.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.d(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
        }
        Integer baseBackgroundColorValue = horizontalStackComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp9 = top.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(jq.j.a(dp9.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp8 = bottom.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(jq.j.a(dp8.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp7 = left.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(jq.j.a(dp7.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp6 = right.getDp()) != null) {
            iIntValue -= (int) Math.ceil(jq.j.a(dp6.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue, -iCeil2);
        return layerDrawable;
    }
}
