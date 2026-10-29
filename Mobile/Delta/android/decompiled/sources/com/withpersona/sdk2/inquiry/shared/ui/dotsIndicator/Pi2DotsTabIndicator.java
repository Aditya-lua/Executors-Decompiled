package com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator;

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
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import jq.j;
import jq.q;
import jq.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xq.a;
import xq.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0002AEB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u0015J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\r2\u0006\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010/J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u0010\u0015J\u000f\u00107\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u0010\u0015J)\u0010<\u001a\u00020\r2\n\u00109\u001a\u0006\u0012\u0002\b\u0003082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:H\u0002¢\u0006\u0004\b<\u0010=R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR*\u0010J\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010/R*\u0010N\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010/R\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010QR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010Z\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010QR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "()V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "n", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "s", "r", "l", "D", "Lxq/a;", "q", "()Lxq/a;", "index", "v", "(I)V", "z", "y", "count", "m", "E", "w", "B", "A", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "onChanged", "C", "(Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;)V", "Ljava/util/ArrayList;", "Lcom/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$b;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "dots", "value", "b", "I", "getDotsColor", "()I", "setDotsColor", "dotsColor", "c", "getSelectedDotColor", "setSelectedDotColor", "selectedDotColor", "", "d", "F", "dotsSize", "e", "dotsCornerRadius", "f", "spaceBetweenDots", "g", "selectedDotWidth", "h", "contentWidth", "Lxq/b;", "i", "Lxq/b;", "pager", "Landroid/graphics/Paint;", "j", "Landroid/graphics/Paint;", "paint", "Landroid/animation/ArgbEvaluator;", "k", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Pi2DotsTabIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayList<Dot> dots;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int dotsColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int selectedDotColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float dotsSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float dotsCornerRadius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float spaceBetweenDots;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float selectedDotWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float contentWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b pager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArgbEvaluator argbEvaluator;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"com/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$c", "Lxq/a;", "", "selectedPosition", "nextPosition", "", "positionOffset", "", "c", "(IIF)V", "position", "d", "(I)V", "a", "()I", "pageCount", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends a {
        public c() {
        }

        @Override // xq.a
        public int a() {
            return Pi2DotsTabIndicator.this.dots.size();
        }

        @Override // xq.a
        public void c(int selectedPosition, int nextPosition, float positionOffset) {
            float f10;
            Dot dot = (Dot) CollectionsKt.f0(Pi2DotsTabIndicator.this.dots, selectedPosition);
            if (dot == null) {
                return;
            }
            float f11 = 1;
            float f12 = ((Pi2DotsTabIndicator.this.selectedDotWidth - Pi2DotsTabIndicator.this.dotsSize) * (f11 - positionOffset)) + Pi2DotsTabIndicator.this.dotsSize;
            dot.d((int) f12);
            if (nextPosition < 0 || nextPosition >= Pi2DotsTabIndicator.this.dots.size()) {
                f10 = 0.0f;
            } else {
                Object obj = Pi2DotsTabIndicator.this.dots.get(nextPosition);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Dot dot2 = (Dot) obj;
                f10 = ((Pi2DotsTabIndicator.this.selectedDotWidth - Pi2DotsTabIndicator.this.dotsSize) * positionOffset) + Pi2DotsTabIndicator.this.dotsSize;
                dot2.d((int) f10);
                Object objEvaluate = Pi2DotsTabIndicator.this.argbEvaluator.evaluate(positionOffset, Integer.valueOf(Pi2DotsTabIndicator.this.getSelectedDotColor()), Integer.valueOf(Pi2DotsTabIndicator.this.getDotsColor()));
                Intrinsics.d(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = Pi2DotsTabIndicator.this.argbEvaluator.evaluate(positionOffset, Integer.valueOf(Pi2DotsTabIndicator.this.getDotsColor()), Integer.valueOf(Pi2DotsTabIndicator.this.getSelectedDotColor()));
                Intrinsics.d(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                dot2.c(((Integer) objEvaluate2).intValue());
                dot.c(iIntValue);
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

        @Override // xq.a
        public void d(int position) {
            ((Dot) Pi2DotsTabIndicator.this.dots.get(position)).d((int) Pi2DotsTabIndicator.this.dotsSize);
            ((Dot) Pi2DotsTabIndicator.this.dots.get(position)).c(Pi2DotsTabIndicator.this.getDotsColor());
            Pi2DotsTabIndicator.this.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\tJ'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"com/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$d", "Landroidx/recyclerview/widget/RecyclerView$j;", "", "a", "()V", "", "positionStart", "itemCount", "b", "(II)V", "", "payload", "c", "(IILjava/lang/Object;)V", "d", "f", "fromPosition", "toPosition", "e", "(III)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends RecyclerView.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13262a;

        public d(Function0<Unit> function0) {
            this.f13262a = function0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            super.a();
            this.f13262a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int positionStart, int itemCount) {
            super.b(positionStart, itemCount);
            this.f13262a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int positionStart, int itemCount, Object payload) {
            super.c(positionStart, itemCount, payload);
            this.f13262a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int positionStart, int itemCount) {
            super.d(positionStart, itemCount);
            this.f13262a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int fromPosition, int toPosition, int itemCount) {
            super.e(fromPosition, toPosition, itemCount);
            this.f13262a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int positionStart, int itemCount) {
            super.f(positionStart, itemCount);
            this.f13262a.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final Unit o(final Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.post(new Runnable() { // from class: xq.g
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.p(this.f35289a);
            }
        });
        return Unit.f22483a;
    }

    public static final void p(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.w();
    }

    public static final void t(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.w();
    }

    public static final void u(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.w();
    }

    public static final void x(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        pi2DotsTabIndicator.z();
        pi2DotsTabIndicator.y();
        pi2DotsTabIndicator.A();
        pi2DotsTabIndicator.B();
    }

    public final void A() {
        ArrayList<Dot> arrayList = this.dots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Dot dot = arrayList.get(i10);
            i10++;
            dot.d((int) this.dotsSize);
        }
    }

    public final void B() {
        b bVar = this.pager;
        if (bVar != null && bVar.d()) {
            bVar.e();
            a aVarQ = q();
            bVar.a(aVarQ);
            aVarQ.b(bVar.c(), 0.0f);
        }
    }

    public final void C(RecyclerView.h<?> adapter, Function0<Unit> onChanged) {
        adapter.z(new d(onChanged));
    }

    public final void D() {
        ArrayList<Dot> arrayList = this.dots;
        arrayList.remove(p.m(arrayList));
    }

    public final void E(int count) {
        for (int i10 = 0; i10 < count; i10++) {
            D();
        }
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public final void l() {
        this.dots.add(new Dot((int) this.dotsSize, this.dotsColor, false, 4, null));
    }

    public final void m(int count) {
        for (int i10 = 0; i10 < count; i10++) {
            l();
        }
    }

    public final void n(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        RecyclerView.h adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("View pager has no adapter. Please set the adapter on the view pager before calling attach.");
        }
        C(adapter, new Function0() { // from class: xq.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pi2DotsTabIndicator.o(this.f35288a);
            }
        });
        this.pager = new b(viewPager);
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() { // from class: xq.e
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.t(this.f35287a);
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
                Pi2DotsTabIndicator.u(this.f35286a);
            }
        });
    }

    public final a q() {
        return new c();
    }

    public final void r() {
        setWillNotDraw(false);
        if (isInEditMode()) {
            m(5);
            w();
        }
    }

    public final void s(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, w.f21711a);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(w.f21712c, false)) {
                this.selectedDotWidth = this.dotsSize;
            }
            this.spaceBetweenDots = (float) j.a(typedArrayObtainStyledAttributes.getFloat(w.f21714e, 3.0f));
            setDotsColor(typedArrayObtainStyledAttributes.getColor(w.b, this.dotsColor));
            setSelectedDotColor(typedArrayObtainStyledAttributes.getColor(w.f21713d, this.selectedDotColor));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setDotsColor(int i10) {
        this.dotsColor = i10;
        y();
    }

    public final void setSelectedDotColor(int i10) {
        this.selectedDotColor = i10;
        y();
    }

    public final void v(int index) {
        b bVar = this.pager;
        if (bVar == null) {
            return;
        }
        this.dots.get(index).c(index == bVar.c() ? this.selectedDotColor : this.dotsColor);
        invalidate();
    }

    public final void w() {
        if (this.pager == null) {
            return;
        }
        post(new Runnable() { // from class: xq.c
            @Override // java.lang.Runnable
            public final void run() {
                Pi2DotsTabIndicator.x(this.f35285a);
            }
        });
    }

    public final void y() {
        int size = this.dots.size();
        for (int i10 = 0; i10 < size; i10++) {
            v(i10);
        }
    }

    public final void z() {
        b bVar = this.pager;
        if (bVar == null) {
            return;
        }
        if (this.dots.size() < bVar.b()) {
            m(bVar.b() - this.dots.size());
        } else if (this.dots.size() > bVar.b()) {
            E(this.dots.size() - bVar.b());
        }
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dots = new ArrayList<>();
        this.dotsColor = getContext().getColor(q.f21631a);
        this.selectedDotColor = getContext().getColor(q.b);
        float fA = (float) j.a(9.0d);
        this.dotsSize = fA;
        this.dotsCornerRadius = fA / 2.0f;
        this.spaceBetweenDots = (float) j.a(3.0d);
        this.selectedDotWidth = (float) j.a(23.0d);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        this.argbEvaluator = new ArgbEvaluator();
        r();
        s(context, attributeSet);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0016\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/dotsIndicator/Pi2DotsTabIndicator$b;", "", "", "width", "color", "", "isSelected", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "(I)V", "c", "Z", "()Z", "setSelected", "(Z)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dot {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public int width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public int color;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean isSelected;

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

        public final void c(int i10) {
            this.color = i10;
        }

        public final void d(int i10) {
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

        public /* synthetic */ Dot(int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i12 & 4) != 0 ? false : z10);
        }
    }
}
