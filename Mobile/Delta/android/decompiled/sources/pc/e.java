package pc;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28414a;

    public class a extends e {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.b = carouselLayoutManager;
        }

        @Override // pc.e
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
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

        @Override // pc.e
        public float e(RecyclerView.r rVar) {
            return ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // pc.e
        public RectF f(float f10, float f11, float f12, float f13) {
            return new RectF(0.0f, f12, f11, f10 - f12);
        }

        @Override // pc.e
        public int g() {
            return this.b.b0();
        }

        @Override // pc.e
        public int h() {
            return g();
        }

        @Override // pc.e
        public int i() {
            return this.b.i0();
        }

        @Override // pc.e
        public int j() {
            return this.b.s0() - this.b.j0();
        }

        @Override // pc.e
        public int k() {
            return l();
        }

        @Override // pc.e
        public int l() {
            return 0;
        }

        @Override // pc.e
        public void m(View view, int i10, int i11) {
            int i12 = i();
            this.b.E0(view, i12, i10, i12 + p(view), i11);
        }

        @Override // pc.e
        public void n(RectF rectF, RectF rectF2, RectF rectF3) {
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

        @Override // pc.e
        public void o(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        public int p(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.b.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }
    }

    public class b extends e {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.b = carouselLayoutManager;
        }

        @Override // pc.e
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
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

        @Override // pc.e
        public float e(RecyclerView.r rVar) {
            return ((ViewGroup.MarginLayoutParams) rVar).rightMargin + ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
        }

        @Override // pc.e
        public RectF f(float f10, float f11, float f12, float f13) {
            return new RectF(f13, 0.0f, f11 - f13, f10);
        }

        @Override // pc.e
        public int g() {
            return this.b.b0() - this.b.h0();
        }

        @Override // pc.e
        public int h() {
            return this.b.G2() ? i() : j();
        }

        @Override // pc.e
        public int i() {
            return 0;
        }

        @Override // pc.e
        public int j() {
            return this.b.s0();
        }

        @Override // pc.e
        public int k() {
            return this.b.G2() ? j() : i();
        }

        @Override // pc.e
        public int l() {
            return this.b.k0();
        }

        @Override // pc.e
        public void m(View view, int i10, int i11) {
            int iL = l();
            this.b.E0(view, i10, iL, i11, iL + p(view));
        }

        @Override // pc.e
        public void n(RectF rectF, RectF rectF2, RectF rectF3) {
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

        @Override // pc.e
        public void o(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        public int p(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.b.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
    }

    public /* synthetic */ e(int i10, a aVar) {
        this(i10);
    }

    public static e b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static e c(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return b(carouselLayoutManager);
        }
        if (i10 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static e d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract float e(RecyclerView.r rVar);

    public abstract RectF f(float f10, float f11, float f12, float f13);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract void m(View view, int i10, int i11);

    public abstract void n(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void o(View view, Rect rect, float f10, float f11);

    public e(int i10) {
        this.f28414a = i10;
    }
}
