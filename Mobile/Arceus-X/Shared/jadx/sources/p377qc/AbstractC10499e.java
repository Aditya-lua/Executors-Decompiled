package p377qc;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: qc.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10499e {

    /* JADX INFO: renamed from: a */
    public final int f37716a;

    /* JADX INFO: renamed from: qc.e$a */
    public class a extends AbstractC10499e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CarouselLayoutManager f37717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f37717b = carouselLayoutManager;
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: a */
        public void mo40308a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.top;
            float f11 = rectF3.top;
            if (f10 < f11 && rectF2.bottom > f11) {
                float f12 = f11 - f10;
                rectF.top += f12;
                rectF3.top += f12;
            }
            float f13 = rectF2.bottom;
            float f14 = rectF3.bottom;
            if (f13 <= f14 || rectF2.top >= f14) {
                return;
            }
            float f15 = f13 - f14;
            rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: e */
        public float mo40309e(RecyclerView.C1035r c1035r) {
            return ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin;
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: f */
        public RectF mo40310f(float f10, float f11, float f12, float f13) {
            return new RectF(0.0f, f12, f11, f10 - f12);
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: g */
        public int mo40311g() {
            return this.f37717b.m5592b0();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: h */
        public int mo40312h() {
            return mo40311g();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: i */
        public int mo40313i() {
            return this.f37717b.m5606i0();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: j */
        public int mo40314j() {
            return this.f37717b.m5627s0() - this.f37717b.m5608j0();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: k */
        public int mo40315k() {
            return mo40316l();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: l */
        public int mo40316l() {
            return 0;
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: m */
        public void mo40317m(View view, int i10, int i11) {
            int iMo40313i = mo40313i();
            this.f37717b.m5553E0(view, iMo40313i, i10, iMo40313i + m40320p(view), i11);
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: n */
        public void mo40318n(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: o */
        public void mo40319o(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        /* JADX INFO: renamed from: p */
        public int m40320p(View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return this.f37717b.m5587X(view) + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin;
        }
    }

    /* JADX INFO: renamed from: qc.e$b */
    public class b extends AbstractC10499e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CarouselLayoutManager f37718b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f37718b = carouselLayoutManager;
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: a */
        public void mo40308a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.left;
            float f11 = rectF3.left;
            if (f10 < f11 && rectF2.right > f11) {
                float f12 = f11 - f10;
                rectF.left += f12;
                rectF2.left += f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF3.right;
            if (f13 <= f14 || rectF2.left >= f14) {
                return;
            }
            float f15 = f13 - f14;
            rectF.right = Math.max(rectF.right - f15, rectF.left);
            rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: e */
        public float mo40309e(RecyclerView.C1035r c1035r) {
            return ((ViewGroup.MarginLayoutParams) c1035r).rightMargin + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin;
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: f */
        public RectF mo40310f(float f10, float f11, float f12, float f13) {
            return new RectF(f13, 0.0f, f11 - f13, f10);
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: g */
        public int mo40311g() {
            return this.f37718b.m5592b0() - this.f37718b.m5604h0();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: h */
        public int mo40312h() {
            return this.f37718b.m12258G2() ? mo40313i() : mo40314j();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: i */
        public int mo40313i() {
            return 0;
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: j */
        public int mo40314j() {
            return this.f37718b.m5627s0();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: k */
        public int mo40315k() {
            return this.f37718b.m12258G2() ? mo40314j() : mo40313i();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: l */
        public int mo40316l() {
            return this.f37718b.m5611k0();
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: m */
        public void mo40317m(View view, int i10, int i11) {
            int iMo40316l = mo40316l();
            this.f37718b.m5553E0(view, i10, iMo40316l, i11, iMo40316l + m40321p(view));
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: n */
        public void mo40318n(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // p377qc.AbstractC10499e
        /* JADX INFO: renamed from: o */
        public void mo40319o(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        /* JADX INFO: renamed from: p */
        public int m40321p(View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return this.f37718b.m5586W(view) + ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] (LINE:1) call: qc.e.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC10499e(int i10, a aVar) {
        this(i10);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC10499e m40305b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC10499e m40306c(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return m40305b(carouselLayoutManager);
        }
        if (i10 == 1) {
            return m40307d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC10499e m40307d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo40308a(RectF rectF, RectF rectF2, RectF rectF3);

    /* JADX INFO: renamed from: e */
    public abstract float mo40309e(RecyclerView.C1035r c1035r);

    /* JADX INFO: renamed from: f */
    public abstract RectF mo40310f(float f10, float f11, float f12, float f13);

    /* JADX INFO: renamed from: g */
    public abstract int mo40311g();

    /* JADX INFO: renamed from: h */
    public abstract int mo40312h();

    /* JADX INFO: renamed from: i */
    public abstract int mo40313i();

    /* JADX INFO: renamed from: j */
    public abstract int mo40314j();

    /* JADX INFO: renamed from: k */
    public abstract int mo40315k();

    /* JADX INFO: renamed from: l */
    public abstract int mo40316l();

    /* JADX INFO: renamed from: m */
    public abstract void mo40317m(View view, int i10, int i11);

    /* JADX INFO: renamed from: n */
    public abstract void mo40318n(RectF rectF, RectF rectF2, RectF rectF3);

    /* JADX INFO: renamed from: o */
    public abstract void mo40319o(View view, Rect rect, float f10, float f11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC10499e(int i10) {
        this.f37716a = i10;
    }
}
