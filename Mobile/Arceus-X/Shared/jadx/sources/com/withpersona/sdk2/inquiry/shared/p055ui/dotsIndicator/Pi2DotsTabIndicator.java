package com.withpersona.sdk2.inquiry.shared.p055ui.dotsIndicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.withpersona.sdk2.inquiry.shared.p055ui.dotsIndicator.Pi2DotsTabIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p226jq.C7279q;
import p226jq.C7285w;
import p556xq.AbstractC12888a;
import p556xq.C12889b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0002AEB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u0015J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\r2\u0006\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010/J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u0010\u0015J\u000f\u00107\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u0010\u0015J)\u0010<\u001a\u00020\r2\n\u00109\u001a\u0006\u0012\u0002\b\u0003082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:H\u0002¢\u0006\u0004\b<\u0010=R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR*\u0010J\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010/R*\u0010N\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010/R\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010QR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Z\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010QR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "()V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "n", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "s", "r", "l", "D", "Lxq/a;", "q", "()Lxq/a;", "index", "v", "(I)V", "z", "y", "count", "m", "E", "w", "B", "A", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "onChanged", "C", "(Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;)V", "Ljava/util/ArrayList;", "Lcom/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$b;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "dots", "value", "b", "I", "getDotsColor", "()I", "setDotsColor", "dotsColor", "c", "getSelectedDotColor", "setSelectedDotColor", "selectedDotColor", "", "d", "F", "dotsSize", "e", "dotsCornerRadius", "f", "spaceBetweenDots", "g", "selectedDotWidth", "h", "contentWidth", "Lxq/b;", "i", "Lxq/b;", "pager", "Landroid/graphics/Paint;", "j", "Landroid/graphics/Paint;", "paint", "Landroid/animation/ArgbEvaluator;", "k", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Pi2DotsTabIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<Dot> dots;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int dotsColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int selectedDotColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float dotsSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float dotsCornerRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float spaceBetweenDots;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float selectedDotWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float contentWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public C12889b pager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ArgbEvaluator argbEvaluator;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator$c */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"com/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$c", "Lxq/a;", "", "selectedPosition", "nextPosition", "", "positionOffset", "", "c", "(IIF)V", "position", "d", "(I)V", "a", "()I", "pageCount", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4021c extends AbstractC12888a {
        public C4021c() {
        }

        @Override // p556xq.AbstractC12888a
        /* JADX INFO: renamed from: a */
        public int mo20513a() {
            return Pi2DotsTabIndicator.this.dots.size();
        }

        @Override // p556xq.AbstractC12888a
        /* JADX INFO: renamed from: c */
        public void mo20514c(int selectedPosition, int nextPosition, float positionOffset) {
            float f10;
            Dot dot = (Dot) CollectionsKt.m31708f0(Pi2DotsTabIndicator.this.dots, selectedPosition);
            if (dot == null) {
                return;
            }
            float f11 = 1;
            float f12 = ((Pi2DotsTabIndicator.this.selectedDotWidth - Pi2DotsTabIndicator.this.dotsSize) * (f11 - positionOffset)) + Pi2DotsTabIndicator.this.dotsSize;
            dot.m20512d((int) f12);
            if (nextPosition < 0 || nextPosition >= Pi2DotsTabIndicator.this.dots.size()) {
                f10 = 0.0f;
            } else {
                Object obj = Pi2DotsTabIndicator.this.dots.get(nextPosition);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Dot dot2 = (Dot) obj;
                f10 = ((Pi2DotsTabIndicator.this.selectedDotWidth - Pi2DotsTabIndicator.this.dotsSize) * positionOffset) + Pi2DotsTabIndicator.this.dotsSize;
                dot2.m20512d((int) f10);
                Object objEvaluate = Pi2DotsTabIndicator.this.argbEvaluator.evaluate(positionOffset, Integer.valueOf(Pi2DotsTabIndicator.this.getSelectedDotColor()), Integer.valueOf(Pi2DotsTabIndicator.this.getDotsColor()));
                Intrinsics.m31981d(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = Pi2DotsTabIndicator.this.argbEvaluator.evaluate(positionOffset, Integer.valueOf(Pi2DotsTabIndicator.this.getDotsColor()), Integer.valueOf(Pi2DotsTabIndicator.this.getSelectedDotColor()));
                Intrinsics.m31981d(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                dot2.m20511c(((Integer) objEvaluate2).intValue());
                dot.m20511c(iIntValue);
            }
            if (Pi2DotsTabIndicator.this.contentWidth > Pi2DotsTabIndicator.this.getMeasuredWidth()) {
                float f13 = Pi2DotsTabIndicator.this.dotsSize + Pi2DotsTabIndicator.this.spaceBetweenDots;
                float f14 = selectedPosition + positionOffset;
                float f15 = ((f14 - f11) * (Pi2DotsTabIndicator.this.dotsSize + Pi2DotsTabIndicator.this.spaceBetweenDots)) + f12 + f10;
                float f16 = f14 * (Pi2DotsTabIndicator.this.dotsSize + Pi2DotsTabIndicator.this.spaceBetweenDots);
                float measuredWidth = (f15 - Pi2DotsTabIndicator.this.getMeasuredWidth()) + f13;
                float f17 = f16 - f13;
                if (Pi2DotsTabIndicator.this.getScrollX() < measuredWidth) {
                    Pi2DotsTabIndicator.this.setScrollX((int) Math.min(Math.max(measuredWidth, 0.0f), Pi2DotsTabIndicator.this.contentWidth - Pi2DotsTabIndicator.this.getMeasuredWidth()));
                } else if (Pi2DotsTabIndicator.this.getScrollX() > f17) {
                    Pi2DotsTabIndicator.this.setScrollX((int) Math.min(Math.max(f17, 0.0f), Pi2DotsTabIndicator.this.contentWidth - Pi2DotsTabIndicator.this.getMeasuredWidth()));
                }
            } else {
                Pi2DotsTabIndicator.this.setScrollX(0);
            }
            Pi2DotsTabIndicator.this.invalidate();
        }

        @Override // p556xq.AbstractC12888a
        /* JADX INFO: renamed from: d */
        public void mo20515d(int position) {
            ((Dot) Pi2DotsTabIndicator.this.dots.get(position)).m20512d((int) Pi2DotsTabIndicator.this.dotsSize);
            ((Dot) Pi2DotsTabIndicator.this.dots.get(position)).m20511c(Pi2DotsTabIndicator.this.getDotsColor());
            Pi2DotsTabIndicator.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator$d */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\tJ'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"com/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$d", "Landroidx/recyclerview/widget/RecyclerView$j;", "", "a", "()V", "", "positionStart", "itemCount", "b", "(II)V", "", "payload", "c", "(IILjava/lang/Object;)V", "d", "f", "fromPosition", "toPosition", "e", "(III)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4022d extends RecyclerView.AbstractC1027j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f17006a;

        public C4022d(Function0<Unit> function0) {
            this.f17006a = function0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: a */
        public void mo5503a() {
            super.mo5503a();
            this.f17006a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: b */
        public void mo5504b(int positionStart, int itemCount) {
            super.mo5504b(positionStart, itemCount);
            this.f17006a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: c */
        public void mo5505c(int positionStart, int itemCount, Object payload) {
            super.mo5505c(positionStart, itemCount, payload);
            this.f17006a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: d */
        public void mo5506d(int positionStart, int itemCount) {
            super.mo5506d(positionStart, itemCount);
            this.f17006a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: e */
        public void mo5507e(int fromPosition, int toPosition, int itemCount) {
            super.mo5507e(fromPosition, toPosition, itemCount);
            this.f17006a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: f */
        public void mo5508f(int positionStart, int itemCount) {
            super.mo5508f(positionStart, itemCount);
            this.f17006a.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m20489o(final Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.post(new Runnable() { // from class: xq.g
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.m20490p(this.f45760a);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m20490p(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.m20506w();
    }

    /* JADX INFO: renamed from: t */
    public static final void m20491t(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.m20506w();
    }

    /* JADX INFO: renamed from: u */
    public static final void m20492u(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.m20506w();
    }

    /* JADX INFO: renamed from: x */
    public static final void m20493x(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.m20508z();
        pi2DotsTabIndicator.m20507y();
        pi2DotsTabIndicator.m20494A();
        pi2DotsTabIndicator.m20495B();
    }

    /* JADX INFO: renamed from: A */
    public final void m20494A() {
        ArrayList<Dot> arrayList = this.dots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Dot dot = arrayList.get(i10);
            i10++;
            dot.m20512d((int) this.dotsSize);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m20495B() {
        C12889b c12889b = this.pager;
        if (c12889b != null && c12889b.m47919d()) {
            c12889b.m47920e();
            AbstractC12888a abstractC12888aM20502q = m20502q();
            c12889b.m47916a(abstractC12888aM20502q);
            abstractC12888aM20502q.m47915b(c12889b.m47918c(), 0.0f);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m20496C(RecyclerView.AbstractC1025h<?> adapter, Function0<Unit> onChanged) {
        adapter.m5494z(new C4022d(onChanged));
    }

    /* JADX INFO: renamed from: D */
    public final void m20497D() {
        ArrayList<Dot> arrayList = this.dots;
        arrayList.remove(C7699p.m31894m(arrayList));
    }

    /* JADX INFO: renamed from: E */
    public final void m20498E(int count) {
        for (int i10 = 0; i10 < count; i10++) {
            m20497D();
        }
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    /* JADX INFO: renamed from: l */
    public final void m20499l() {
        this.dots.add(new Dot((int) this.dotsSize, this.dotsColor, false, 4, null));
    }

    /* JADX INFO: renamed from: m */
    public final void m20500m(int count) {
        for (int i10 = 0; i10 < count; i10++) {
            m20499l();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m20501n(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        RecyclerView.AbstractC1025h adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("View pager has no adapter. Please set the adapter on the view pager before calling attach.");
        }
        m20496C(adapter, new Function0() { // from class: xq.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pi2DotsTabIndicator.m20489o(this.f45759a);
            }
        });
        this.pager = new C12889b(viewPager);
        m20506w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() { // from class: xq.e
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.m20491t(this.f45758a);
            }
        });
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float measuredWidth = this.contentWidth >= ((float) getMeasuredWidth()) ? 0.0f : (getMeasuredWidth() - this.contentWidth) / 2.0f;
        Iterator<Dot> it = this.dots.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        float width = measuredWidth;
        while (it.hasNext()) {
            Dot next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Dot dot = next;
            this.paint.setColor(dot.getColor());
            float width2 = width + dot.getWidth();
            float f10 = this.dotsSize;
            float f11 = this.dotsCornerRadius;
            Canvas canvas2 = canvas;
            canvas2.drawRoundRect(width, 0.0f, width2, f10, f11, f11, this.paint);
            width += dot.getWidth() + this.spaceBetweenDots;
            canvas = canvas2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (getLayoutDirection() == 1) {
            setRotation(180.0f);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float size;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingStart = getPaddingStart() + getPaddingEnd();
        if (this.dots.isEmpty()) {
            size = paddingStart;
        } else {
            size = paddingStart + (this.dotsSize * (this.dots.size() - 1)) + this.selectedDotWidth + (this.spaceBetweenDots * (this.dots.size() - 1));
        }
        this.contentWidth = size;
        setMeasuredDimension(Math.min((int) size, size2), (int) this.dotsSize);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        super.onRestoreInstanceState(state);
        post(new Runnable() { // from class: xq.d
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.m20492u(this.f45757a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC12888a m20502q() {
        return new C4021c();
    }

    /* JADX INFO: renamed from: r */
    public final void m20503r() {
        setWillNotDraw(false);
        if (isInEditMode()) {
            m20500m(5);
            m20506w();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m20504s(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C7285w.f28125a);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(C7285w.f28127c, false)) {
                this.selectedDotWidth = this.dotsSize;
            }
            this.spaceBetweenDots = (float) C7265j.m30285a(typedArrayObtainStyledAttributes.getFloat(C7285w.f28129e, 3.0f));
            setDotsColor(typedArrayObtainStyledAttributes.getColor(C7285w.f28126b, this.dotsColor));
            setSelectedDotColor(typedArrayObtainStyledAttributes.getColor(C7285w.f28128d, this.selectedDotColor));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setDotsColor(int i10) {
        this.dotsColor = i10;
        m20507y();
    }

    public final void setSelectedDotColor(int i10) {
        this.selectedDotColor = i10;
        m20507y();
    }

    /* JADX INFO: renamed from: v */
    public final void m20505v(int index) {
        C12889b c12889b = this.pager;
        if (c12889b == null) {
            return;
        }
        this.dots.get(index).m20511c(index == c12889b.m47918c() ? this.selectedDotColor : this.dotsColor);
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m20506w() {
        if (this.pager == null) {
            return;
        }
        post(new Runnable() { // from class: xq.c
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.m20493x(this.f45756a);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m20507y() {
        int size = this.dots.size();
        for (int i10 = 0; i10 < size; i10++) {
            m20505v(i10);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m20508z() {
        C12889b c12889b = this.pager;
        if (c12889b == null) {
            return;
        }
        if (this.dots.size() < c12889b.m47917b()) {
            m20500m(c12889b.m47917b() - this.dots.size());
        } else if (this.dots.size() > c12889b.m47917b()) {
            m20498E(this.dots.size() - c12889b.m47917b());
        }
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dots = new ArrayList<>();
        this.dotsColor = getContext().getColor(C7279q.f28036a);
        this.selectedDotColor = getContext().getColor(C7279q.f28037b);
        float fM30285a = (float) C7265j.m30285a(9.0d);
        this.dotsSize = fM30285a;
        this.dotsCornerRadius = fM30285a / 2.0f;
        this.spaceBetweenDots = (float) C7265j.m30285a(3.0d);
        this.selectedDotWidth = (float) C7265j.m30285a(23.0d);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        this.argbEvaluator = new ArgbEvaluator();
        m20503r();
        m20504s(context, attributeSet);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0016\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$b;", "", "", "width", "color", "", "isSelected", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "(I)V", "c", "Z", "()Z", "setSelected", "(Z)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Dot {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public int width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public int color;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public boolean isSelected;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Dot(int i10, int i11, boolean z10) {
            this.width = i10;
            this.color = i11;
            this.isSelected = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: c */
        public final void m20511c(int i10) {
            this.color = i10;
        }

        /* JADX INFO: renamed from: d */
        public final void m20512d(int i10) {
            this.width = i10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dot)) {
                return false;
            }
            Dot dot = (Dot) other;
            return this.width == dot.width && this.color == dot.color && this.isSelected == dot.isSelected;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.color)) * 31) + Boolean.hashCode(this.isSelected);
        }

        @NotNull
        public String toString() {
            return "Dot(width=" + this.width + ", color=" + this.color + ", isSelected=" + this.isSelected + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 int)
          (r2v0 int)
          (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
         A[MD:(int, int, boolean):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator.b.<init>(int, int, boolean):void type: THIS */
        public /* synthetic */ Dot(int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i12 & 4) != 0 ? false : z10);
        }
    }
}
