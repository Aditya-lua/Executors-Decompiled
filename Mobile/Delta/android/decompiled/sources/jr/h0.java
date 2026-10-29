package jr;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle;
import cr.b5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "styles", "", "Ljr/e0;", "excludedStyleElements", "", "k", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;)V", "", "fontName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeight", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onRemoteFontDownloaded", "h", "(Landroid/widget/TextView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lkotlin/jvm/functions/Function1;)V", "e", "newTypeface", "g", "(Landroid/widget/TextView;Landroid/graphics/Typeface;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justification", "d", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21748a;
        public static final /* synthetic */ int[] b;

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
            f21748a = iArr;
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
            b = iArr2;
        }
    }

    public static final int c(StyleElements.FontWeight fontWeight) {
        switch (a.f21748a[fontWeight.ordinal()]) {
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
                throw new jt.l();
        }
    }

    public static final void d(@NotNull TextView textView, @NotNull StyleElements.PositionType justification) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(justification, "justification");
        int gravity = textView.getGravity() & 112;
        int i10 = a.b[justification.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 8388611;
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new jt.l();
            }
            i11 = 8388613;
        }
        textView.setGravity(i11);
        textView.setGravity((textView.getGravity() & (-113)) | gravity);
    }

    public static final void e(final TextView textView, String str, final StyleElements.FontWeight fontWeight, final Function1<? super Typeface, Unit> function1) {
        String str2;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Typeface typefaceA = b5.a(context, str);
        if (typefaceA == null) {
            typefaceA = textView.getTypeface();
        }
        Intrinsics.checkNotNull(typefaceA);
        g(textView, typefaceA, fontWeight);
        kr.a aVarA = kr.a.INSTANCE.a();
        Map<String, Map<StyleElements.FontWeight, String>> mapD = aVarA.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : mapD.entrySet()) {
            if (Intrinsics.c(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map = (Map) CollectionsKt.e0(linkedHashMap.values());
        if (map == null || (str2 = (String) map.get(fontWeight)) == null) {
            str2 = map != null ? (String) map.get(StyleElements.FontWeight.NORMAL) : null;
        }
        if (str2 != null) {
            aVarA.a(str2, new Function1() { // from class: jr.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.f(textView, fontWeight, function1, (Typeface) obj);
                }
            });
        }
    }

    public static final Unit f(TextView textView, StyleElements.FontWeight fontWeight, Function1 function1, Typeface downloadedTypeface) {
        Intrinsics.checkNotNullParameter(downloadedTypeface, "downloadedTypeface");
        g(textView, downloadedTypeface, fontWeight);
        Typeface typeface = textView.getTypeface();
        Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
        function1.invoke(typeface);
        return Unit.f22483a;
    }

    public static final void g(TextView textView, Typeface typeface, StyleElements.FontWeight fontWeight) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTypeface(Typeface.create(typeface, c(fontWeight), false));
        } else {
            textView.setTypeface(typeface);
        }
    }

    public static final void h(@NotNull TextView textView, @Nullable String str, @Nullable StyleElements.FontWeight fontWeight, @NotNull Function1<? super Typeface, Unit> onRemoteFontDownloaded) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(onRemoteFontDownloaded, "onRemoteFontDownloaded");
        if (str != null) {
            if (fontWeight == null) {
                fontWeight = StyleElements.FontWeight.NORMAL;
            }
            e(textView, str, fontWeight, onRemoteFontDownloaded);
        } else if (fontWeight != null) {
            Typeface typeface = textView.getTypeface();
            Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
            g(textView, typeface, fontWeight);
        }
    }

    public static /* synthetic */ void i(TextView textView, String str, StyleElements.FontWeight fontWeight, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: jr.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return h0.j((Typeface) obj2);
                }
            };
        }
        h(textView, str, fontWeight, function1);
    }

    public static final Unit j(Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22483a;
    }

    public static final void k(@NotNull TextView textView, @NotNull TextViewStyle styles, @NotNull Set<? extends e0> excludedStyleElements) {
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(excludedStyleElements, "excludedStyleElements");
        if (!excludedStyleElements.contains(e0.Margin) && (marginValue = styles.getMarginValue()) != null) {
            mr.d.c(textView, marginValue);
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
            if (d3.i.c(textView) == 1) {
                int iA = d3.i.a(textView);
                int iB = d3.i.b(textView);
                int iD = (int) jq.j.d(dDoubleValue);
                if (iA <= 0) {
                    iA = (int) jq.j.d(12.0d);
                }
                int i10 = iB > 0 ? iB : 1;
                if (iA > iD) {
                    iA = iD;
                }
                d3.i.j(textView, iA, iD, i10, 0);
            }
            Double lineHeightValue = styles.getLineHeightValue();
            if (lineHeightValue != null) {
                if (excludedStyleElements.contains(e0.LineHeight)) {
                    lineHeightValue = null;
                }
                if (lineHeightValue != null) {
                    double dDoubleValue2 = lineHeightValue.doubleValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        textView.setLineSpacing((float) (jq.j.a(dDoubleValue2) - jq.j.a(dDoubleValue)), 1.0f);
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
        i(textView, fontNameValue, fontWeightValue, null, 4, null);
        StyleElements.PositionType justificationValue = styles.getJustificationValue();
        if (justificationValue != null) {
            StyleElements.PositionType positionType = excludedStyleElements.contains(e0.Justification) ? null : justificationValue;
            if (positionType != null) {
                d(textView, positionType);
            }
        }
    }

    public static /* synthetic */ void l(TextView textView, TextViewStyle textViewStyle, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = q0.d();
        }
        k(textView, textViewStyle, set);
    }
}
