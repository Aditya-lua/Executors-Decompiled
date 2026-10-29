package p227jr;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p229jt.C7345l;

/* JADX INFO: renamed from: jr.r */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0005\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "styles", "", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "b", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V", "a", "d", "e", "f", "Landroid/graphics/drawable/LayerDrawable;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)Landroid/graphics/drawable/LayerDrawable;", "Ljr/q;", "state", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Ljr/q;)Landroid/graphics/drawable/LayerDrawable;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7314r {

    /* JADX INFO: renamed from: jr.r$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28196a;

        static {
            int[] iArr = new int[EnumC7313q.values().length];
            try {
                iArr[EnumC7313q.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7313q.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7313q.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28196a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m30412a(@NotNull ConstraintLayout constraintLayout, @Nullable ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            m30416e(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(m30418g(clickableStackComponentStyle, EnumC7313q.ACTIVE));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m30413b(@NotNull ConstraintLayout constraintLayout, @NotNull ClickableStack.ClickableStackComponentStyle styles) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        m30416e(constraintLayout, styles);
        constraintLayout.setBackground(m30418g(styles, EnumC7313q.BASE));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int iM30285a = (int) C7265j.m30285a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            c0513b.f2024v = -1;
            ((ViewGroup.MarginLayoutParams) c0513b).width = iM30285a;
            constraintLayout.setLayoutParams(c0513b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m30414c(@NotNull ConstraintLayout constraintLayout, @NotNull HorizontalStack.HorizontalStackComponentStyle styles) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        m30417f(constraintLayout, styles);
        constraintLayout.setBackground(m30419h(styles));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int iM30285a = (int) C7265j.m30285a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            c0513b.f2024v = -1;
            ((ViewGroup.MarginLayoutParams) c0513b).width = iM30285a;
            constraintLayout.setLayoutParams(c0513b);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m30415d(@NotNull ConstraintLayout constraintLayout, @Nullable ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            m30416e(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(m30418g(clickableStackComponentStyle, EnumC7313q.DISABLED));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m30416e(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        StyleElements.SizeSet marginValue = clickableStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            C8652d.m34730c(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = clickableStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) C7265j.m30285a(dp5.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) C7265j.m30285a(dp4.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) C7265j.m30285a(dp3.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) C7265j.m30285a(dp2.doubleValue()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m30417f(ConstraintLayout constraintLayout, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        StyleElements.SizeSet marginValue = horizontalStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            C8652d.m34730c(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = horizontalStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) C7265j.m30285a(dp5.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) C7265j.m30285a(dp4.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) C7265j.m30285a(dp3.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) C7265j.m30285a(dp2.doubleValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX INFO: renamed from: g */
    public static final LayerDrawable m30418g(ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, EnumC7313q enumC7313q) {
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
        List listM31895n = C7699p.m31895n(dValueOf, dValueOf2, dValueOf3, Double.valueOf(dDoubleValue));
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM31895n, 10));
        Iterator it = listM31895n.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) Math.ceil(C7265j.m30285a(((Number) it.next()).doubleValue()))));
        }
        int iIntValue2 = ((Number) CollectionsKt.m31720r0(arrayList)).intValue();
        int[] iArr = a.f28196a;
        int i10 = iArr[enumC7313q.ordinal()];
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
                throw new C7345l();
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
            float fM30285a = (float) C7265j.m30285a(dp6.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.m31981d(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a});
        }
        int i11 = iArr[enumC7313q.ordinal()];
        if (i11 == 1) {
            baseBackgroundColorValue = clickableStackComponentStyle.getBaseBackgroundColorValue();
        } else if (i11 == 2) {
            baseBackgroundColorValue = clickableStackComponentStyle.getActiveBackgroundColorValue();
        } else {
            if (i11 != 3) {
                throw new C7345l();
            }
            baseBackgroundColorValue = clickableStackComponentStyle.getDisabledBackgroundColorValue();
        }
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp5 = top.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(C7265j.m30285a(dp5.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp4 = bottom.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(C7265j.m30285a(dp4.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp3 = left.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(C7265j.m30285a(dp3.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp2 = right.getDp()) != null) {
            iIntValue2 -= (int) Math.ceil(C7265j.m30285a(dp2.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue2, -iCeil2);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: h */
    public static final LayerDrawable m30419h(HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
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
        Iterator it = C7699p.m31895n(dp2, dp3, dp4, dp5).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dCeil = Math.ceil(C7265j.m30285a(((Number) next).doubleValue()));
                do {
                    Object next2 = it.next();
                    double dCeil2 = Math.ceil(C7265j.m30285a(((Number) next2).doubleValue()));
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
            float fM30285a = (float) C7265j.m30285a(dp10.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.m31981d(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a});
        }
        Integer baseBackgroundColorValue = horizontalStackComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp9 = top.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C7265j.m30285a(dp9.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp8 = bottom.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C7265j.m30285a(dp8.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp7 = left.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C7265j.m30285a(dp7.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp6 = right.getDp()) != null) {
            iIntValue -= (int) Math.ceil(C7265j.m30285a(dp6.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue, -iCeil2);
        return layerDrawable;
    }
}
