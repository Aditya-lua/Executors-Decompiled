package p227jr;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C0546c;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194ic.C6738b;
import p226jq.C7273n;
import p226jq.C7288z;
import p229jt.C7345l;
import p497vp.C12238a;
import p526wq.C12543z;

/* JADX INFO: renamed from: jr.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aY\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\t\u0010\n\u001am\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u0015\u001a\u00020\u0012*\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0012*\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u0012*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001au\u0010\"\u001a\u00020\u0012*\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"", "json", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "styles", "", "originalStrokeColors", "originalFillColors", "originalSecondaryFillColors", "originalBackgroundColors", "g", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "", "strokeColorValue", "fillColorValue", "backgroundColorValue", "h", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "", "i", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "c", "Landroid/widget/ImageView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "b", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "component", "k", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "newStrokeColor", "newFillColor", "newSecondaryFillColor", "newBackgroundColor", "l", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7301g {

    /* JADX INFO: renamed from: jr.g$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28163a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28163a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m30369b(@NotNull ImageView imageView, @Nullable CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f10;
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (combinedStepImagePreviewComponentStyle != null && (marginValue = combinedStepImagePreviewComponentStyle.getMarginValue()) != null) {
            C8652d.m34730c(imageView, marginValue);
        }
        C8652d.m34729b(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getWidthValue() : null);
        C8652d.m34728a(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (combinedStepImagePreviewComponentStyle != null && (justify = combinedStepImagePreviewComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.C0513b)) {
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            int i10 = a.f28163a[base2.ordinal()];
            if (i10 == 1) {
                f10 = 0.0f;
            } else if (i10 == 2) {
                f10 = 0.5f;
            } else {
                if (i10 != 3) {
                    throw new C7345l();
                }
                f10 = 1.0f;
            }
            c0513b.f1962G = f10;
        }
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static final void m30370c(@NotNull final ThemeableLottieAnimationView themeableLottieAnimationView, @Nullable final LocalImageComponentStyle localImageComponentStyle, @NotNull final String[] originalStrokeColors, @NotNull final String[] originalFillColors, @NotNull final String[] originalSecondaryFillColors, @NotNull final String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalSecondaryFillColors, "originalSecondaryFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        if (themeableLottieAnimationView.isLaidOut()) {
            m30371d(localImageComponentStyle, themeableLottieAnimationView, originalStrokeColors, originalFillColors, originalSecondaryFillColors, originalBackgroundColors);
        } else {
            C12543z.m46890b(themeableLottieAnimationView, new Function0() { // from class: jr.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7301g.m30373f(localImageComponentStyle, themeableLottieAnimationView, originalStrokeColors, originalFillColors, originalSecondaryFillColors, originalBackgroundColors);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m30371d(LocalImageComponentStyle localImageComponentStyle, ThemeableLottieAnimationView themeableLottieAnimationView, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        AttributeStyles.LocalImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f10;
        StyleElements.SizeSet marginValue;
        Integer fillColorValue = localImageComponentStyle != null ? localImageComponentStyle.getFillColorValue() : null;
        Integer backgroundColorValue = localImageComponentStyle != null ? localImageComponentStyle.getBackgroundColorValue() : null;
        m30379l(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getStrokeColorValue() : null, fillColorValue, (fillColorValue == null || backgroundColorValue == null) ? null : Integer.valueOf(C0546c.m2669c(fillColorValue.intValue(), backgroundColorValue.intValue(), 0.66f)), backgroundColorValue, strArr, strArr2, strArr3, strArr4);
        if (localImageComponentStyle != null && (marginValue = localImageComponentStyle.getMarginValue()) != null) {
            C8652d.m34730c(themeableLottieAnimationView, marginValue);
        }
        C8652d.m34729b(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getWidthValue() : null);
        C8652d.m34728a(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView.getLayoutParams();
        if (localImageComponentStyle != null && (justify = localImageComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.C0513b)) {
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            int i10 = a.f28163a[base2.ordinal()];
            if (i10 == 1) {
                f10 = 0.0f;
            } else if (i10 == 2) {
                f10 = 0.5f;
            } else {
                if (i10 != 3) {
                    throw new C7345l();
                }
                f10 = 1.0f;
            }
            c0513b.f1962G = f10;
        }
        themeableLottieAnimationView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m30372e(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr3 = new String[0];
        }
        m30370c(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3, strArr4);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m30373f(LocalImageComponentStyle localImageComponentStyle, ThemeableLottieAnimationView themeableLottieAnimationView, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        m30371d(localImageComponentStyle, themeableLottieAnimationView, strArr, strArr2, strArr3, strArr4);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m30374g(@NotNull String json, @Nullable LocalImageComponentStyle localImageComponentStyle, @NotNull String[] originalStrokeColors, @NotNull String[] originalFillColors, @NotNull String[] originalSecondaryFillColors, @NotNull String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalSecondaryFillColors, "originalSecondaryFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        return localImageComponentStyle == null ? json : m30375h(json, localImageComponentStyle.getStrokeColorValue(), localImageComponentStyle.getFillColorValue(), localImageComponentStyle.getBackgroundColorValue(), originalStrokeColors, originalFillColors, originalSecondaryFillColors, originalBackgroundColors);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m30375h(@NotNull String json, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull String[] originalStrokeColors, @NotNull String[] originalFillColors, @NotNull String[] originalSecondaryFillColors, @NotNull String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalSecondaryFillColors, "originalSecondaryFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            for (String str : originalStrokeColors) {
                linkedHashMap.put(Integer.valueOf(Color.parseColor(str)), num);
            }
        }
        if (num2 != null) {
            for (String str2 : originalFillColors) {
                linkedHashMap.put(Integer.valueOf(Color.parseColor(str2)), num2);
            }
        }
        if (num3 != null) {
            for (String str3 : originalBackgroundColors) {
                linkedHashMap.put(Integer.valueOf(Color.parseColor(str3)), num3);
            }
        }
        if (num2 != null && num3 != null) {
            int iM2669c = C0546c.m2669c(num2.intValue(), num3.intValue(), 0.66f);
            for (String str4 : originalSecondaryFillColors) {
                linkedHashMap.put(Integer.valueOf(Color.parseColor(str4)), Integer.valueOf(iM2669c));
            }
        }
        return C7273n.m30315j(json, linkedHashMap);
    }

    /* JADX INFO: renamed from: i */
    public static final void m30376i(@NotNull ThemeableLottieAnimationView themeableLottieAnimationView, @Nullable LocalImageComponentStyle localImageComponentStyle, @NotNull String[] originalStrokeColors, @NotNull String[] originalFillColors, @NotNull String[] originalSecondaryFillColors, @NotNull String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalSecondaryFillColors, "originalSecondaryFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        if (localImageComponentStyle != null) {
            m30370c(themeableLottieAnimationView, localImageComponentStyle, originalStrokeColors, originalFillColors, originalSecondaryFillColors, originalBackgroundColors);
            return;
        }
        Context context = themeableLottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM30328d = C7288z.m30328d(context, C6738b.f25906m, null, false, 6, null);
        Context context2 = themeableLottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM30328d2 = C7288z.m30328d(context2, C6738b.f25907n, null, false, 6, null);
        Context context3 = themeableLottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iM30328d3 = C7288z.m30328d(context3, C6738b.f25908o, null, false, 6, null);
        m30379l(themeableLottieAnimationView, Integer.valueOf(iM30328d), Integer.valueOf(iM30328d2), Integer.valueOf(C0546c.m2669c(iM30328d2, iM30328d3, 0.66f)), Integer.valueOf(iM30328d3), originalStrokeColors, originalFillColors, originalSecondaryFillColors, originalBackgroundColors);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m30377j(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr3 = new String[0];
        }
        m30376i(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3, strArr4);
    }

    /* JADX INFO: renamed from: k */
    public static final void m30378k(@NotNull ImageView imageView, @NotNull RemoteImage component) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        StyleElements.SizeSet margin = component.getMargin();
        if (margin != null) {
            C8652d.m34730c(imageView, margin);
        }
        C8652d.m34729b(imageView, component.getWidth());
        C8652d.m34728a(imageView, component.getHeight());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = component.getJustification();
        float f10 = 0.0f;
        if (justification != null) {
            if (layoutParams instanceof ConstraintLayout.C0513b) {
                ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
                int i10 = a.f28163a[justification.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        f10 = 0.5f;
                    } else {
                        if (i10 != 3) {
                            throw new C7345l();
                        }
                        f10 = 1.0f;
                    }
                }
                c0513b.f1962G = f10;
            }
        } else if (layoutParams instanceof ConstraintLayout.C0513b) {
            ConstraintLayout.C0513b c0513b2 = (ConstraintLayout.C0513b) layoutParams;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c0513b2.f1962G = C7288z.m30326b(context, C12238a.f43169b, null, false, false, 14, null) ? 0.5f : 0.0f;
        }
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public static final void m30379l(@NotNull ThemeableLottieAnimationView themeableLottieAnimationView, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @NotNull String[] originalStrokeColors, @NotNull String[] originalFillColors, @NotNull String[] originalSecondaryFillColors, @NotNull String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalSecondaryFillColors, "originalSecondaryFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        if (num != null) {
            int iIntValue = num.intValue();
            for (String str : originalStrokeColors) {
                themeableLottieAnimationView.m20474F(Color.parseColor(str), iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            for (String str2 : originalFillColors) {
                themeableLottieAnimationView.m20474F(Color.parseColor(str2), iIntValue2);
            }
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (String str3 : originalSecondaryFillColors) {
                themeableLottieAnimationView.m20474F(Color.parseColor(str3), iIntValue3);
            }
        }
        if (num4 != null) {
            int iIntValue4 = num4.intValue();
            for (String str4 : originalBackgroundColors) {
                themeableLottieAnimationView.m20474F(Color.parseColor(str4), iIntValue4);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m30380m(ThemeableLottieAnimationView themeableLottieAnimationView, Integer num, Integer num2, Integer num3, Integer num4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        m30379l(themeableLottieAnimationView, num, num2, num3, num4, strArr, strArr2, (i10 & 64) != 0 ? new String[0] : strArr3, strArr4);
    }
}
