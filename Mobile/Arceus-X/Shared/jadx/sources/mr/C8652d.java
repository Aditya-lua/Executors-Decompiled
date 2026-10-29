package mr;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import cr.C4213b5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p229jt.C7345l;

/* JADX INFO: renamed from: mr.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000b\u001a%\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "margins", "", "c", "(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V", "padding", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "width", "b", "(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "height", "a", "Lcom/google/android/material/textfield/TextInputLayout;", "", "errorMessage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "d", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8652d {
    /* JADX INFO: renamed from: a */
    public static final void m34728a(@NotNull View view, @Nullable StyleElements.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (size instanceof StyleElements.DPSize) {
            layoutParams.height = (int) C7265j.m30285a(((StyleElements.DPSize) size).getDp().doubleValue());
        } else if (size instanceof StyleElements.Size.PercentSize) {
            Object parent = view.getParent();
            if (layoutParams instanceof ConstraintLayout.C0513b) {
                ((ConstraintLayout.C0513b) layoutParams).f1978W = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (parent instanceof View) {
                layoutParams.height = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((double) ((View) parent).getHeight()));
            }
        } else if (size != null) {
            throw new C7345l();
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public static final void m34729b(@NotNull View view, @Nullable StyleElements.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (size instanceof StyleElements.DPSize) {
            int iM30285a = (int) C7265j.m30285a(((StyleElements.DPSize) size).getDp().doubleValue());
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            int width = Integer.MAX_VALUE;
            if ((layoutParams2 == null || layoutParams2.width != -2) && view2 != null) {
                width = view2.getWidth();
            }
            layoutParams.width = C7764d.m32081f(iM30285a, width);
        } else if (size instanceof StyleElements.Size.PercentSize) {
            if (layoutParams instanceof ConstraintLayout.C0513b) {
                ((ConstraintLayout.C0513b) layoutParams).f1977V = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (view2 != null) {
                layoutParams.width = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((double) view2.getWidth()));
            }
        } else if (size != null) {
            throw new C7345l();
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static final void m34730c(@NotNull View view, @NotNull StyleElements.SizeSet margins) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(margins, "margins");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.Size left = margins.getLeft();
            marginLayoutParams.leftMargin = (left == null || (dp5 = left.getDp()) == null) ? marginLayoutParams.leftMargin : (int) C7265j.m30285a(dp5.doubleValue());
            StyleElements.Size right = margins.getRight();
            marginLayoutParams.rightMargin = (right == null || (dp4 = right.getDp()) == null) ? marginLayoutParams.rightMargin : (int) C7265j.m30285a(dp4.doubleValue());
            StyleElements.Size top = margins.getTop();
            marginLayoutParams.topMargin = (top == null || (dp3 = top.getDp()) == null) ? marginLayoutParams.topMargin : (int) C7265j.m30285a(dp3.doubleValue());
            StyleElements.Size bottom = margins.getBottom();
            marginLayoutParams.bottomMargin = (bottom == null || (dp2 = bottom.getDp()) == null) ? marginLayoutParams.bottomMargin : (int) C7265j.m30285a(dp2.doubleValue());
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public static final void m34731d(@NotNull TextInputLayout textInputLayout, @Nullable String str, @Nullable TextBasedComponentStyle textBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (str == null || StringsKt.m32182p0(str)) {
            textInputLayout.setErrorEnabled(false);
            return;
        }
        textInputLayout.setError(str);
        if (textBasedComponentStyle != null) {
            SpannableString spannableString = new SpannableString(textInputLayout.getError());
            String fontNameValue = textBasedComponentStyle.getFontNameValue();
            if (fontNameValue != null) {
                Context context = textInputLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Typeface typefaceM21739a = C4213b5.m21739a(context, fontNameValue);
                if (typefaceM21739a != null) {
                    spannableString.setSpan(new C8651c(typefaceM21739a), 0, spannableString.length(), 33);
                }
            }
            Double fontSizeValue = textBasedComponentStyle.getFontSizeValue();
            if (fontSizeValue != null) {
                spannableString.setSpan(new AbsoluteSizeSpan((int) C7265j.m30285a(fontSizeValue.doubleValue())), 0, spannableString.length(), 33);
            }
            textInputLayout.setError(spannableString);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m34732e(@NotNull View view, @NotNull StyleElements.SizeSet padding) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(padding, "padding");
        StyleElements.Size left = padding.getLeft();
        int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? view.getPaddingLeft() : (int) C7265j.m30285a(dp5.doubleValue());
        StyleElements.Size top = padding.getTop();
        int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? view.getPaddingTop() : (int) C7265j.m30285a(dp4.doubleValue());
        StyleElements.Size right = padding.getRight();
        int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? view.getPaddingRight() : (int) C7265j.m30285a(dp3.doubleValue());
        StyleElements.Size bottom = padding.getBottom();
        view.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? view.getPaddingBottom() : (int) C7265j.m30285a(dp2.doubleValue()));
    }
}
