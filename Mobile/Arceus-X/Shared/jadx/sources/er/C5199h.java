package er;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Base64;
import android.widget.TextView;
import androidx.core.graphics.C0546c;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup;
import com.withpersona.sdk2.markwon.core.spans.LinkSpan;
import hu.InterfaceC6567c;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084dr.HelpPagerItem;
import p226jq.C7265j;
import p261l2.C7975b;
import p497vp.C12239b;
import p497vp.C12243f;
import us.AbstractC11939e;

/* JADX INFO: renamed from: er.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0010*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010!\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0007*\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010'\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010,\u001a\u0004\u0018\u00010+*\u00020*¢\u0006\u0004\b,\u0010-\"\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010.¨\u00060"}, m31665d2 = {"Landroid/content/Context;", "context", "Lus/e;", "d", "(Landroid/content/Context;)Lus/e;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "", "Lhu/c;", Payload.TYPE, "Lkotlin/Function1;", "", "predicate", "a", "(Ljava/util/List;Lhu/c;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/widget/TextView;", "", Text.type, "", "e", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/text/Spanned;", "spanned", "f", "(Landroid/widget/TextView;Landroid/text/Spanned;)V", "Landroid/graphics/Bitmap;", "g", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "", "defaultColor", "textSizeWidth", "serverColor", "Landroid/graphics/drawable/Drawable;", "b", "(Landroid/content/Context;IILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$ScanHint;", "Ldr/s;", "i", "(Ljava/util/List;)Ljava/util/List;", "hintType", "c", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Landroid/graphics/Rect;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;", "Lus/e;", "markwon", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5199h {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static AbstractC11939e f20234a;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T extends UiComponent> T m24125a(@NotNull List<? extends UiComponent> list, @NotNull InterfaceC6567c<T> type, @NotNull Function1<? super T, Boolean> predicate) {
        T t8;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends UiComponent> it = list.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (type.mo28425b(t10)) {
                Intrinsics.m31981d(t10, "null cannot be cast to non-null type T of com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.findFirstComponentOrNull");
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
            } else if ((t10 instanceof UiComponentGroup) && (t8 = (T) m24125a(((UiComponentGroup) t10).getChildren(), type, predicate)) != null) {
                return t8;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Drawable m24126b(@NotNull Context context, int i10, int i11, @Nullable Integer num) {
        int iM33005c;
        Intrinsics.checkNotNullParameter(context, "context");
        if (num != null) {
            iM33005c = num.intValue();
        } else {
            int iM33005c2 = C7975b.m33005c(context, C12239b.f43190c);
            iM33005c = C7975b.m33005c(context, C12239b.f43191d);
            if (C0546c.m2670d(i10, iM33005c2) >= C0546c.m2670d(i10, iM33005c)) {
                iM33005c = iM33005c2;
            }
        }
        float fM30285a = (float) C7265j.m30285a(8.0d);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iM33005c);
        gradientDrawable.setCornerRadii(new float[]{fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a});
        gradientDrawable.setSize(i11 + ((int) C7265j.m30285a(24.0d)), gradientDrawable.getMinimumHeight());
        return new InsetDrawable((Drawable) gradientDrawable, (int) C7265j.m30285a(4.0d));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Integer m24127c(@NotNull String hintType) {
        Intrinsics.checkNotNullParameter(hintType, "hintType");
        switch (hintType.hashCode()) {
            case -1978532433:
                if (hintType.equals("horizontal_passport_scan")) {
                    return Integer.valueOf(C12243f.f43207e);
                }
                return null;
            case -1956118531:
                if (hintType.equals("isometric_id_under_scanner")) {
                    return Integer.valueOf(C12243f.f43209g);
                }
                return null;
            case -1505169936:
                if (hintType.equals("passport_front_back_outside")) {
                    return Integer.valueOf(C12243f.f43212j);
                }
                return null;
            case -892663386:
                if (hintType.equals("wallet_removal")) {
                    return Integer.valueOf(C12243f.f43215m);
                }
                return null;
            case -90829931:
                if (hintType.equals("isometric_passport_front_inside")) {
                    return Integer.valueOf(C12243f.f43211i);
                }
                return null;
            case 834032922:
                if (hintType.equals("isometric_id_top_of_scanner")) {
                    return Integer.valueOf(C12243f.f43208f);
                }
                return null;
            case 1158542641:
                if (hintType.equals("isometric_passport_back_inside")) {
                    return Integer.valueOf(C12243f.f43210h);
                }
                return null;
            case 1845234141:
                if (hintType.equals("case_removal")) {
                    return Integer.valueOf(C12243f.f43206d);
                }
                return null;
            case 1981666600:
                if (hintType.equals("passport_portrait")) {
                    return Integer.valueOf(C12243f.f43214l);
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final AbstractC11939e m24128d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC11939e abstractC11939e = f20234a;
        if (abstractC11939e != null) {
            return abstractC11939e;
        }
        AbstractC11939e abstractC11939eM44561b = AbstractC11939e.m44561b(context);
        f20234a = abstractC11939eM44561b;
        Intrinsics.checkNotNullExpressionValue(abstractC11939eM44561b, "also(...)");
        return abstractC11939eM44561b;
    }

    /* JADX INFO: renamed from: e */
    public static final void m24129e(@NotNull TextView textView, @NotNull String text) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Spanned spannedMo44564e = m24128d(context).mo44564e(text);
        Intrinsics.checkNotNullExpressionValue(spannedMo44564e, "toMarkdown(...)");
        m24130f(textView, spannedMo44564e);
    }

    /* JADX INFO: renamed from: f */
    public static final void m24130f(@NotNull TextView textView, @NotNull Spanned spanned) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        m24128d(context).mo44563d(textView, spanned);
        if (spanned.getSpans(0, spanned.length(), LinkSpan.class).length == 0 && spanned.getSpans(0, spanned.length(), URLSpan.class).length == 0) {
            textView.setMovementMethod(null);
        } else {
            textView.setTextIsSelectable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m24131g(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3);
        Intrinsics.checkNotNull(strEncodeToString);
        return strEncodeToString;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Rect m24132h(@NotNull StepStyle stepStyle) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Intrinsics.checkNotNullParameter(stepStyle, "<this>");
        StepStyles.StepPaddingStyle padding = stepStyle.getPadding();
        if (padding == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null) {
            return null;
        }
        StyleElements.Size left = base.getLeft();
        double dDoubleValue = 24.0d;
        int iM30285a = (int) ((left == null || (dp5 = left.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp5.doubleValue()));
        StyleElements.Size top = base.getTop();
        int iM30285a2 = (int) ((top == null || (dp4 = top.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp4.doubleValue()));
        StyleElements.Size right = base.getRight();
        int iM30285a3 = (int) ((right == null || (dp3 = right.getDp()) == null) ? C7265j.m30285a(24.0d) : C7265j.m30285a(dp3.doubleValue()));
        StyleElements.Size bottom = base.getBottom();
        if (bottom != null && (dp2 = bottom.getDp()) != null) {
            dDoubleValue = dp2.doubleValue();
        }
        return new Rect(iM30285a, iM30285a2, iM30285a3, (int) C7265j.m30285a(dDoubleValue));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final List<HelpPagerItem> m24133i(@NotNull List<GovernmentIdNfcScan.ScanHint> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<GovernmentIdNfcScan.ScanHint> list2 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
        for (GovernmentIdNfcScan.ScanHint scanHint : list2) {
            arrayList.add(new HelpPagerItem(m24127c(scanHint.getHintType()), scanHint.getHintText()));
        }
        return arrayList;
    }
}
