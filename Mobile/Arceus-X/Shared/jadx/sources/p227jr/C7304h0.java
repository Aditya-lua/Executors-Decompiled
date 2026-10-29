package p227jr;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle;
import cr.C4213b5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kr.InterfaceC7814a;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p066d3.C4431i;
import p226jq.C7265j;
import p229jt.C7345l;

/* JADX INFO: renamed from: jr.h0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "styles", "", "Ljr/e0;", "excludedStyleElements", "", "k", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;)V", "", "fontName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeight", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onRemoteFontDownloaded", "h", "(Landroid/widget/TextView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lkotlin/jvm/functions/Function1;)V", "e", "newTypeface", "g", "(Landroid/widget/TextView;Landroid/graphics/Typeface;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justification", "d", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7304h0 {

    /* JADX INFO: renamed from: jr.h0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28171a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f28172b;

        static {
            int[] iArr = new int[StyleElements.FontWeight.values().length];
            try {
                iArr[StyleElements.FontWeight.THIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.FontWeight.EXTRA_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.FontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyleElements.FontWeight.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StyleElements.FontWeight.MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StyleElements.FontWeight.SEMI_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StyleElements.FontWeight.BOLD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StyleElements.FontWeight.EXTRA_BOLD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StyleElements.FontWeight.HEAVY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StyleElements.FontWeight.EXTRA_BLACK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f28171a = iArr;
            int[] iArr2 = new int[StyleElements.PositionType.values().length];
            try {
                iArr2[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f28172b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m30383c(StyleElements.FontWeight fontWeight) {
        switch (a.f28171a[fontWeight.ordinal()]) {
            case 1:
                return 100;
            case 2:
                return MlKitException.CODE_SCANNER_UNAVAILABLE;
            case 3:
                return MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
            case 4:
                return 400;
            case 5:
                return 500;
            case 6:
                return 600;
            case 7:
                return 700;
            case 8:
                return 800;
            case 9:
                return 900;
            case 10:
                return 950;
            default:
                throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m30384d(@NotNull TextView textView, @NotNull StyleElements.PositionType justification) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(justification, "justification");
        int gravity = textView.getGravity() & 112;
        int i10 = a.f28172b[justification.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = GravityCompat.START;
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new C7345l();
            }
            i11 = GravityCompat.END;
        }
        textView.setGravity(i11);
        textView.setGravity((textView.getGravity() & (-113)) | gravity);
    }

    /* JADX INFO: renamed from: e */
    public static final void m30385e(final TextView textView, String str, final StyleElements.FontWeight fontWeight, final Function1<? super Typeface, Unit> function1) {
        String str2;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Typeface typefaceM21739a = C4213b5.m21739a(context, str);
        if (typefaceM21739a == null) {
            typefaceM21739a = textView.getTypeface();
        }
        Intrinsics.checkNotNull(typefaceM21739a);
        m30387g(textView, typefaceM21739a, fontWeight);
        InterfaceC7814a interfaceC7814aM32427a = InterfaceC7814a.INSTANCE.m32427a();
        Map<String, Map<StyleElements.FontWeight, String>> mapMo20929d = interfaceC7814aM32427a.mo20929d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : mapMo20929d.entrySet()) {
            if (Intrinsics.m31980c(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map = (Map) CollectionsKt.m31707e0(linkedHashMap.values());
        if (map == null || (str2 = (String) map.get(fontWeight)) == null) {
            str2 = map != null ? (String) map.get(StyleElements.FontWeight.NORMAL) : null;
        }
        if (str2 != null) {
            interfaceC7814aM32427a.mo20926a(str2, new Function1() { // from class: jr.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C7304h0.m30386f(textView, fontWeight, function1, (Typeface) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m30386f(TextView textView, StyleElements.FontWeight fontWeight, Function1 function1, Typeface downloadedTypeface) {
        Intrinsics.checkNotNullParameter(downloadedTypeface, "downloadedTypeface");
        m30387g(textView, downloadedTypeface, fontWeight);
        Typeface typeface = textView.getTypeface();
        Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
        function1.invoke(typeface);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m30387g(TextView textView, Typeface typeface, StyleElements.FontWeight fontWeight) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTypeface(Typeface.create(typeface, m30383c(fontWeight), false));
        } else {
            textView.setTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m30388h(@NotNull TextView textView, @Nullable String str, @Nullable StyleElements.FontWeight fontWeight, @NotNull Function1<? super Typeface, Unit> onRemoteFontDownloaded) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(onRemoteFontDownloaded, "onRemoteFontDownloaded");
        if (str != null) {
            if (fontWeight == null) {
                fontWeight = StyleElements.FontWeight.NORMAL;
            }
            m30385e(textView, str, fontWeight, onRemoteFontDownloaded);
        } else if (fontWeight != null) {
            Typeface typeface = textView.getTypeface();
            Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
            m30387g(textView, typeface, fontWeight);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m30389i(TextView textView, String str, StyleElements.FontWeight fontWeight, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: jr.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C7304h0.m30390j((Typeface) obj2);
                }
            };
        }
        m30388h(textView, str, fontWeight, function1);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m30390j(Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m30391k(@NotNull TextView textView, @NotNull TextViewStyle styles, @NotNull Set<? extends EnumC7298e0> excludedStyleElements) {
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(excludedStyleElements, "excludedStyleElements");
        if (!excludedStyleElements.contains(EnumC7298e0.Margin) && (marginValue = styles.getMarginValue()) != null) {
            C8652d.m34730c(textView, marginValue);
        }
        Integer textColorValue = styles.getTextColorValue();
        if (textColorValue != null) {
            textView.setTextColor(textColorValue.intValue());
        }
        Integer textColorHighlightValue = styles.getTextColorHighlightValue();
        if (textColorHighlightValue != null) {
            textView.setLinkTextColor(textColorHighlightValue.intValue());
        }
        Double fontSizeValue = styles.getFontSizeValue();
        if (fontSizeValue != null) {
            double dDoubleValue = fontSizeValue.doubleValue();
            textView.setTextSize((float) dDoubleValue);
            if (C4431i.m22296c(textView) == 1) {
                int iM22294a = C4431i.m22294a(textView);
                int iM22295b = C4431i.m22295b(textView);
                int iM30288d = (int) C7265j.m30288d(dDoubleValue);
                if (iM22294a <= 0) {
                    iM22294a = (int) C7265j.m30288d(12.0d);
                }
                int i10 = iM22295b > 0 ? iM22295b : 1;
                if (iM22294a > iM30288d) {
                    iM22294a = iM30288d;
                }
                C4431i.m22303j(textView, iM22294a, iM30288d, i10, 0);
            }
            Double lineHeightValue = styles.getLineHeightValue();
            if (lineHeightValue != null) {
                if (excludedStyleElements.contains(EnumC7298e0.LineHeight)) {
                    lineHeightValue = null;
                }
                if (lineHeightValue != null) {
                    double dDoubleValue2 = lineHeightValue.doubleValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        textView.setLineSpacing((float) (C7265j.m30285a(dDoubleValue2) - C7265j.m30285a(dDoubleValue)), 1.0f);
                    }
                }
            }
        }
        Double letterSpacingValue = styles.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            textView.setLetterSpacing((float) (letterSpacingValue.doubleValue() / ((double) textView.getTextSize())));
        }
        String fontNameValue = styles.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = styles.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        m30389i(textView, fontNameValue, fontWeightValue, null, 4, null);
        StyleElements.PositionType justificationValue = styles.getJustificationValue();
        if (justificationValue != null) {
            StyleElements.PositionType positionType = excludedStyleElements.contains(EnumC7298e0.Justification) ? null : justificationValue;
            if (positionType != null) {
                m30384d(textView, positionType);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m30392l(TextView textView, TextViewStyle textViewStyle, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = C7702q0.m31908d();
        }
        m30391k(textView, textViewStyle, set);
    }
}
