package er;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import jr.e0;
import jr.h0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wq.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\r\u001a\u00020\u0005*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0018\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroid/widget/LinearLayout;", "", "markdown", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "style", "", "e", "(Landroid/widget/LinearLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "", "Ler/o;", "textBlocks", "", "isInList", "a", "(Landroid/widget/LinearLayout;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Z)V", "Ler/o$a;", "Landroid/content/Context;", "context", "b", "(Ler/o$a;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)Landroid/widget/LinearLayout;", "Ler/o$b;", "", "listIndex", "Landroid/widget/TextView;", "c", "(Ler/o$b;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/Integer;)Landroid/widget/TextView;", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: er.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"er/a$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly2/p;", "info", "", "g", "(Landroid/view/View;Ly2/p;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0302a extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o.ListTextBlock f15742d;

        public C0302a(o.ListTextBlock listTextBlock) {
            this.f15742d = listTextBlock;
        }

        @Override // androidx.core.view.a
        public void g(View host, y2.p info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.g(host, info);
            info.n0(y2.p.f.a(this.f15742d.b().size(), 1, false));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"er/a$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly2/p;", "info", "", "g", "(Landroid/view/View;Ly2/p;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer f15743d;

        public b(Integer num) {
            this.f15743d = num;
        }

        @Override // androidx.core.view.a
        public void g(View host, y2.p info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.g(host, info);
            info.o0(y2.p.g.a(this.f15743d.intValue(), 1, 0, 1, false));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Spanned f15744a;

        public c(Spanned spanned) {
            this.f15744a = spanned;
        }

        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a(Integer.valueOf(this.f15744a.getSpanStart(t8)), Integer.valueOf(this.f15744a.getSpanStart(t10)));
        }
    }

    public static final void a(LinearLayout linearLayout, List<? extends o> list, TextBasedComponentStyle textBasedComponentStyle, boolean z10) {
        View viewC;
        int i10 = 0;
        for (o oVar : list) {
            int i11 = i10 + 1;
            if (oVar instanceof o.ListTextBlock) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                viewC = b((o.ListTextBlock) oVar, context, textBasedComponentStyle);
            } else {
                if (!(oVar instanceof o.b)) {
                    throw new jt.l();
                }
                o.b bVar = (o.b) oVar;
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                viewC = c(bVar, context2, textBasedComponentStyle, z10 ? Integer.valueOf(i10) : null);
            }
            if (i10 != kotlin.collections.p.m(list)) {
                ViewGroup.LayoutParams layoutParams = viewC.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = (int) jq.j.a(8.0d);
                viewC.setLayoutParams(layoutParams2);
            }
            linearLayout.addView(viewC);
            i10 = i11;
        }
    }

    public static final LinearLayout b(o.ListTextBlock listTextBlock, Context context, TextBasedComponentStyle textBasedComponentStyle) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        a(linearLayout, listTextBlock.b(), textBasedComponentStyle, true);
        z.e(linearLayout, new C0302a(listTextBlock));
        return linearLayout;
    }

    public static final TextView c(o.b bVar, Context context, TextBasedComponentStyle textBasedComponentStyle, Integer num) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        h.f(textView, bVar.getSpanned());
        if (num != null) {
            z.e(textView, new b(num));
        }
        if (textBasedComponentStyle != null) {
            h0.k(textView, textBasedComponentStyle, p0.c(e0.Margin));
        }
        return textView;
    }

    public static final List<o> d(Context context, String str) {
        Spanned spannedE = h.d(context).e(str);
        Intrinsics.checkNotNullExpressionValue(spannedE, "toMarkdown(...)");
        int i10 = 0;
        Object[] spans = spannedE.getSpans(0, spannedE.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        List listF0 = kotlin.collections.m.f0(spans, new c(spannedE));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (obj instanceof xs.b) {
                int spanStart = spannedE.getSpanStart(obj);
                int spanEnd = spannedE.getSpanEnd(obj);
                if (i10 > spanStart) {
                    return kotlin.collections.o.d(new o.b(spannedE));
                }
                if (spanStart != i10) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedE, i10, spanStart);
                    if (!StringsKt.p0(spannableStringBuilder)) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) spannedE, i10, spanStart);
                        arrayList.add(new o.b(spannableStringBuilder2));
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) spannedE, spanStart, spanEnd);
                o.b bVar = new o.b(spannableStringBuilder3);
                o oVar = (o) CollectionsKt.p0(arrayList);
                if (oVar instanceof o.ListTextBlock) {
                    o.ListTextBlock listTextBlock = (o.ListTextBlock) oVar;
                    arrayList.set(kotlin.collections.p.m(arrayList), listTextBlock.a(CollectionsKt.x0(listTextBlock.b(), bVar)));
                } else {
                    arrayList.add(new o.ListTextBlock(kotlin.collections.o.d(bVar)));
                }
                i10 = spanEnd;
            }
        }
        return arrayList;
    }

    public static final void e(@NotNull LinearLayout linearLayout, @NotNull String markdown, @Nullable TextBasedComponentStyle textBasedComponentStyle) {
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<o> listD = d(context, markdown);
        linearLayout.removeAllViews();
        a(linearLayout, listD, textBasedComponentStyle, false);
        if (textBasedComponentStyle == null || (marginValue = textBasedComponentStyle.getMarginValue()) == null) {
            return;
        }
        mr.d.c(linearLayout, marginValue);
    }
}
