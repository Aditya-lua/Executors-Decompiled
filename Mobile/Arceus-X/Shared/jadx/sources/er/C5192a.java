package er;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0582a;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7700p0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mr.C8652d;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p227jr.C7304h0;
import p227jr.EnumC7298e0;
import p229jt.C7345l;
import p526wq.C12543z;
import p558xs.C12905b;
import p564y2.C13017p;

/* JADX INFO: renamed from: er.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\r\u001a\u00020\u0005*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0018\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Landroid/widget/LinearLayout;", "", "markdown", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "style", "", "e", "(Landroid/widget/LinearLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "", "Ler/o;", "textBlocks", "", "isInList", "a", "(Landroid/widget/LinearLayout;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Z)V", "Ler/o$a;", "Landroid/content/Context;", "context", "b", "(Ler/o$a;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)Landroid/widget/LinearLayout;", "Ler/o$b;", "", "listIndex", "Landroid/widget/TextView;", "c", "(Ler/o$b;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/Integer;)Landroid/widget/TextView;", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5192a {

    /* JADX INFO: renamed from: er.a$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"er/a$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly2/p;", "info", "", "g", "(Landroid/view/View;Ly2/p;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends C0582a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5206o.ListTextBlock f20206d;

        public a(InterfaceC5206o.ListTextBlock listTextBlock) {
            this.f20206d = listTextBlock;
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View host, C13017p info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.mo2799g(host, info);
            info.m48412n0(C13017p.f.m48452a(this.f20206d.m24152b().size(), 1, false));
        }
    }

    /* JADX INFO: renamed from: er.a$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"er/a$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly2/p;", "info", "", "g", "(Landroid/view/View;Ly2/p;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends C0582a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Integer f20207d;

        public b(Integer num) {
            this.f20207d = num;
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View host, C13017p info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.mo2799g(host, info);
            info.m48414o0(C13017p.g.m48454a(this.f20207d.intValue(), 1, 0, 1, false));
        }
    }

    /* JADX INFO: renamed from: er.a$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Spanned f20208a;

        public c(Spanned spanned) {
            this.f20208a = spanned;
        }

        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(Integer.valueOf(this.f20208a.getSpanStart(t8)), Integer.valueOf(this.f20208a.getSpanStart(t10)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m24089a(LinearLayout linearLayout, List<? extends InterfaceC5206o> list, TextBasedComponentStyle textBasedComponentStyle, boolean z10) {
        View viewM24091c;
        int i10 = 0;
        for (InterfaceC5206o interfaceC5206o : list) {
            int i11 = i10 + 1;
            if (interfaceC5206o instanceof InterfaceC5206o.ListTextBlock) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                viewM24091c = m24090b((InterfaceC5206o.ListTextBlock) interfaceC5206o, context, textBasedComponentStyle);
            } else {
                if (!(interfaceC5206o instanceof InterfaceC5206o.b)) {
                    throw new C7345l();
                }
                InterfaceC5206o.b bVar = (InterfaceC5206o.b) interfaceC5206o;
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                viewM24091c = m24091c(bVar, context2, textBasedComponentStyle, z10 ? Integer.valueOf(i10) : null);
            }
            if (i10 != C7699p.m31894m(list)) {
                ViewGroup.LayoutParams layoutParams = viewM24091c.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = (int) C7265j.m30285a(8.0d);
                viewM24091c.setLayoutParams(layoutParams2);
            }
            linearLayout.addView(viewM24091c);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final LinearLayout m24090b(InterfaceC5206o.ListTextBlock listTextBlock, Context context, TextBasedComponentStyle textBasedComponentStyle) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        m24089a(linearLayout, listTextBlock.m24152b(), textBasedComponentStyle, true);
        C12543z.m46893e(linearLayout, new a(listTextBlock));
        return linearLayout;
    }

    /* JADX INFO: renamed from: c */
    public static final TextView m24091c(InterfaceC5206o.b bVar, Context context, TextBasedComponentStyle textBasedComponentStyle, Integer num) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C5199h.m24130f(textView, bVar.getSpanned());
        if (num != null) {
            C12543z.m46893e(textView, new b(num));
        }
        if (textBasedComponentStyle != null) {
            C7304h0.m30391k(textView, textBasedComponentStyle, C7700p0.m31904c(EnumC7298e0.Margin));
        }
        return textView;
    }

    /* JADX INFO: renamed from: d */
    public static final List<InterfaceC5206o> m24092d(Context context, String str) {
        Spanned spannedMo44564e = C5199h.m24128d(context).mo44564e(str);
        Intrinsics.checkNotNullExpressionValue(spannedMo44564e, "toMarkdown(...)");
        int i10 = 0;
        Object[] spans = spannedMo44564e.getSpans(0, spannedMo44564e.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        List listM31863f0 = C7693m.m31863f0(spans, new c(spannedMo44564e));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM31863f0) {
            if (obj instanceof C12905b) {
                int spanStart = spannedMo44564e.getSpanStart(obj);
                int spanEnd = spannedMo44564e.getSpanEnd(obj);
                if (i10 > spanStart) {
                    return C7697o.m31878d(new InterfaceC5206o.b(spannedMo44564e));
                }
                if (spanStart != i10) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedMo44564e, i10, spanStart);
                    if (!StringsKt.m32182p0(spannableStringBuilder)) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) spannedMo44564e, i10, spanStart);
                        arrayList.add(new InterfaceC5206o.b(spannableStringBuilder2));
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) spannedMo44564e, spanStart, spanEnd);
                InterfaceC5206o.b bVar = new InterfaceC5206o.b(spannableStringBuilder3);
                InterfaceC5206o interfaceC5206o = (InterfaceC5206o) CollectionsKt.m31718p0(arrayList);
                if (interfaceC5206o instanceof InterfaceC5206o.ListTextBlock) {
                    InterfaceC5206o.ListTextBlock listTextBlock = (InterfaceC5206o.ListTextBlock) interfaceC5206o;
                    arrayList.set(C7699p.m31894m(arrayList), listTextBlock.m24151a(CollectionsKt.m31726x0(listTextBlock.m24152b(), bVar)));
                } else {
                    arrayList.add(new InterfaceC5206o.ListTextBlock(C7697o.m31878d(bVar)));
                }
                i10 = spanEnd;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final void m24093e(@NotNull LinearLayout linearLayout, @NotNull String markdown, @Nullable TextBasedComponentStyle textBasedComponentStyle) {
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<InterfaceC5206o> listM24092d = m24092d(context, markdown);
        linearLayout.removeAllViews();
        m24089a(linearLayout, listM24092d, textBasedComponentStyle, false);
        if (textBasedComponentStyle == null || (marginValue = textBasedComponentStyle.getMarginValue()) == null) {
            return;
        }
        C8652d.m34730c(linearLayout, marginValue);
    }
}
