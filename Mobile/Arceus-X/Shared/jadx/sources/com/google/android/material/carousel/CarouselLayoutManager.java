package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0546c;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.C1061l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p194ic.C6740d;
import p194ic.C6747k;
import p216jc.C7137a;
import p377qc.AbstractC10499e;
import p377qc.AbstractC10500f;
import p377qc.C10502h;
import p377qc.InterfaceC10496b;
import p377qc.InterfaceC10501g;
import p426s2.C11162a;
import p533x2.C12637g;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC1034q implements InterfaceC10496b, RecyclerView.AbstractC1013a0.b {

    /* JADX INFO: renamed from: A */
    public int f9847A;

    /* JADX INFO: renamed from: B */
    public Map<Integer, C2774b> f9848B;

    /* JADX INFO: renamed from: C */
    public AbstractC10499e f9849C;

    /* JADX INFO: renamed from: D */
    public final View.OnLayoutChangeListener f9850D;

    /* JADX INFO: renamed from: E */
    public int f9851E;

    /* JADX INFO: renamed from: F */
    public int f9852F;

    /* JADX INFO: renamed from: G */
    public int f9853G;

    /* JADX INFO: renamed from: s */
    public int f9854s;

    /* JADX INFO: renamed from: t */
    public int f9855t;

    /* JADX INFO: renamed from: u */
    public int f9856u;

    /* JADX INFO: renamed from: v */
    public boolean f9857v;

    /* JADX INFO: renamed from: w */
    public final C2771c f9858w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public AbstractC10500f f9859x;

    /* JADX INFO: renamed from: y */
    public C2775c f9860y;

    /* JADX INFO: renamed from: z */
    public C2774b f9861z;

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    public class C2769a extends C1061l {
        public C2769a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0
        /* JADX INFO: renamed from: a */
        public PointF mo5368a(int i10) {
            return CarouselLayoutManager.this.mo5177c(i10);
        }

        @Override // androidx.recyclerview.widget.C1061l
        /* JADX INFO: renamed from: t */
        public int mo5991t(View view, int i10) {
            if (CarouselLayoutManager.this.f9860y == null || !CarouselLayoutManager.this.mo12286f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.m12289h2(carouselLayoutManager.m5613l0(view));
        }

        @Override // androidx.recyclerview.widget.C1061l
        /* JADX INFO: renamed from: u */
        public int mo5992u(View view, int i10) {
            if (CarouselLayoutManager.this.f9860y == null || CarouselLayoutManager.this.mo12286f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.m12289h2(carouselLayoutManager.m5613l0(view));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    public static final class C2770b {

        /* JADX INFO: renamed from: a */
        public final View f9863a;

        /* JADX INFO: renamed from: b */
        public final float f9864b;

        /* JADX INFO: renamed from: c */
        public final float f9865c;

        /* JADX INFO: renamed from: d */
        public final C2772d f9866d;

        public C2770b(View view, float f10, float f11, C2772d c2772d) {
            this.f9863a = view;
            this.f9864b = f10;
            this.f9865c = f11;
            this.f9866d = c2772d;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    public static class C2771c extends RecyclerView.AbstractC1033p {

        /* JADX INFO: renamed from: a */
        public final Paint f9867a;

        /* JADX INFO: renamed from: b */
        public List<C2774b.c> f9868b;

        public C2771c() {
            Paint paint = new Paint();
            this.f9867a = paint;
            this.f9868b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1033p
        /* JADX INFO: renamed from: i */
        public void mo5541i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1015b0 c1015b0) {
            super.mo5541i(canvas, recyclerView, c1015b0);
            this.f9867a.setStrokeWidth(recyclerView.getResources().getDimension(C6740d.f25981n));
            for (C2774b.c cVar : this.f9868b) {
                this.f9867a.setColor(C0546c.m2669c(-65281, -16776961, cVar.f9886c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).mo12286f()) {
                    canvas.drawLine(cVar.f9885b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m12254B2(), cVar.f9885b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m12302w2(), this.f9867a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).m12304y2(), cVar.f9885b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m12305z2(), cVar.f9885b, this.f9867a);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m12306j(List<C2774b.c> list) {
            this.f9868b = Collections.unmodifiableList(list);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$d */
    public static class C2772d {

        /* JADX INFO: renamed from: a */
        public final C2774b.c f9869a;

        /* JADX INFO: renamed from: b */
        public final C2774b.c f9870b;

        public C2772d(C2774b.c cVar, C2774b.c cVar2) {
            C12637g.m47069a(cVar.f9884a <= cVar2.f9884a);
            this.f9869a = cVar;
            this.f9870b = cVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CarouselLayoutManager() {
        this(new C10502h());
    }

    /* JADX INFO: renamed from: F2 */
    public static C2772d m12242F2(List<C2774b.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            C2774b.c cVar = list.get(i14);
            float f15 = z10 ? cVar.f9885b : cVar.f9884a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new C2772d(list.get(i10), list.get(i12));
    }

    /* JADX INFO: renamed from: P2 */
    private int m12243P2(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f9860y == null) {
            m12264M2(c1041x);
        }
        int iM12251i2 = m12251i2(i10, this.f9854s, this.f9855t, this.f9856u);
        this.f9854s += iM12251i2;
        m12273W2(this.f9860y);
        float fM12324f = this.f9861z.m12324f() / 2.0f;
        float fM12287f2 = m12287f2(m5613l0(m5573N(0)));
        Rect rect = new Rect();
        float f10 = m12258G2() ? this.f9861z.m12326h().f9885b : this.f9861z.m12319a().f9885b;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < m5574O(); i11++) {
            View viewM5573N = m5573N(i11);
            float fAbs = Math.abs(f10 - m12263L2(viewM5573N, fM12287f2, fM12324f, rect));
            if (viewM5573N != null && fAbs < f11) {
                this.f9852F = m5613l0(viewM5573N);
                f11 = fAbs;
            }
            fM12287f2 = m12277Z1(fM12287f2, this.f9861z.m12324f());
        }
        m12291l2(c1041x, c1015b0);
        return iM12251i2;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m12245S1(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: qc.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f37715a.m12265N2();
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public static int m12251i2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    /* JADX INFO: renamed from: k2 */
    private int m12252k2(int i10) {
        int iM12301v2 = m12301v2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (iM12301v2 == 0) {
                return m12258G2() ? 1 : -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 33) {
            if (iM12301v2 == 1) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 66) {
            if (iM12301v2 == 0) {
                return m12258G2() ? -1 : 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 130) {
            if (iM12301v2 == 1) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: A */
    public int mo5072A(@NonNull RecyclerView.C1015b0 c1015b0) {
        return this.f9856u - this.f9855t;
    }

    /* JADX INFO: renamed from: A2 */
    public final int m12253A2() {
        return this.f9849C.mo40315k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: B1 */
    public int mo5073B1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (mo5191p()) {
            return m12243P2(i10, c1041x, c1015b0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: B2 */
    public final int m12254B2() {
        return this.f9849C.mo40316l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: C1 */
    public void mo5149C1(int i10) {
        this.f9852F = i10;
        if (this.f9860y == null) {
            return;
        }
        this.f9854s = m12256D2(i10, m12297r2(i10));
        this.f9847A = C11162a.m42060c(i10, 0, Math.max(0, m5595e() - 1));
        m12273W2(this.f9860y);
        m5639y1();
    }

    /* JADX INFO: renamed from: C2 */
    public final int m12255C2() {
        if (m5579R() || !this.f9859x.m40327f()) {
            return 0;
        }
        return m12301v2() == 1 ? m5604h0() : m5608j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: D1 */
    public int mo5074D1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (mo5193q()) {
            return m12243P2(i10, c1041x, c1015b0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: D2 */
    public final int m12256D2(int i10, C2774b c2774b) {
        return m12258G2() ? (int) (((m12294o2() - c2774b.m12326h().f9884a) - (i10 * c2774b.m12324f())) - (c2774b.m12324f() / 2.0f)) : (int) (((i10 * c2774b.m12324f()) - c2774b.m12319a().f9884a) + (c2774b.m12324f() / 2.0f));
    }

    /* JADX INFO: renamed from: E2 */
    public final int m12257E2(int i10, @NonNull C2774b c2774b) {
        int i11 = Integer.MAX_VALUE;
        for (C2774b.c cVar : c2774b.m12323e()) {
            float fM12324f = (i10 * c2774b.m12324f()) + (c2774b.m12324f() / 2.0f);
            int iM12294o2 = (m12258G2() ? (int) ((m12294o2() - cVar.f9884a) - fM12324f) : (int) (fM12324f - cVar.f9884a)) - this.f9854s;
            if (Math.abs(i11) > Math.abs(iM12294o2)) {
                i11 = iM12294o2;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: F0 */
    public void mo5556F0(@NonNull View view, int i10, int i11) {
        if (!(view instanceof InterfaceC10501g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
        Rect rect = new Rect();
        m5619o(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        C2775c c2775c = this.f9860y;
        float fM12324f = (c2775c == null || this.f9849C.f37716a != 0) ? ((ViewGroup.MarginLayoutParams) c1035r).width : c2775c.m12358g().m12324f();
        C2775c c2775c2 = this.f9860y;
        view.measure(RecyclerView.AbstractC1034q.m5543P(m5627s0(), m5629t0(), m5606i0() + m5608j0() + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin + i12, (int) fM12324f, mo5191p()), RecyclerView.AbstractC1034q.m5543P(m5592b0(), m5593c0(), m5611k0() + m5604h0() + ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin + i13, (int) ((c2775c2 == null || this.f9849C.f37716a != 1) ? ((ViewGroup.MarginLayoutParams) c1035r).height : c2775c2.m12358g().m12324f()), mo5193q()));
    }

    /* JADX INFO: renamed from: G2 */
    public boolean m12258G2() {
        return mo12286f() && m5594d0() == 1;
    }

    /* JADX INFO: renamed from: H2 */
    public final boolean m12259H2(float f10, C2772d c2772d) {
        float fM12279a2 = m12279a2(f10, m12299t2(f10, c2772d) / 2.0f);
        if (m12258G2()) {
            return fM12279a2 < 0.0f;
        }
        return fM12279a2 > ((float) m12294o2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1035r mo5077I() {
        return new RecyclerView.C1035r(-2, -2);
    }

    /* JADX INFO: renamed from: I2 */
    public final boolean m12260I2(float f10, C2772d c2772d) {
        float fM12277Z1 = m12277Z1(f10, m12299t2(f10, c2772d) / 2.0f);
        if (m12258G2()) {
            return fM12277Z1 > ((float) m12294o2());
        }
        return fM12277Z1 < 0.0f;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m12261J2() {
        if (this.f9857v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < m5574O(); i10++) {
                View viewM5573N = m5573N(i10);
                Log.d("CarouselLayoutManager", "item position " + m5613l0(viewM5573N) + ", center:" + m12295p2(viewM5573N) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final C2770b m12262K2(RecyclerView.C1041x c1041x, float f10, int i10) {
        View viewM5707o = c1041x.m5707o(i10);
        mo5556F0(viewM5707o, 0, 0);
        float fM12277Z1 = m12277Z1(f10, this.f9861z.m12324f() / 2.0f);
        C2772d c2772dM12242F2 = m12242F2(this.f9861z.m12325g(), fM12277Z1, false);
        return new C2770b(viewM5707o, fM12277Z1, m12285e2(viewM5707o, fM12277Z1, c2772dM12242F2), c2772dM12242F2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: L0 */
    public void mo5569L0(RecyclerView recyclerView) {
        super.mo5569L0(recyclerView);
        this.f9859x.m40326e(recyclerView.getContext());
        m12265N2();
        recyclerView.addOnLayoutChangeListener(this.f9850D);
    }

    /* JADX INFO: renamed from: L2 */
    public final float m12263L2(View view, float f10, float f11, Rect rect) {
        float fM12277Z1 = m12277Z1(f10, f11);
        C2772d c2772dM12242F2 = m12242F2(this.f9861z.m12325g(), fM12277Z1, false);
        float fM12285e2 = m12285e2(view, fM12277Z1, c2772dM12242F2);
        super.mo5583U(view, rect);
        m12272V2(view, fM12277Z1, c2772dM12242F2);
        this.f9849C.mo40319o(view, rect, f11, fM12285e2);
        return fM12285e2;
    }

    /* JADX INFO: renamed from: M2 */
    public final void m12264M2(RecyclerView.C1041x c1041x) {
        View viewM5707o = c1041x.m5707o(0);
        mo5556F0(viewM5707o, 0, 0);
        C2774b c2774bMo40328g = this.f9859x.mo40328g(this, viewM5707o);
        if (m12258G2()) {
            c2774bMo40328g = C2774b.m12318n(c2774bMo40328g, m12294o2());
        }
        this.f9860y = C2775c.m12346f(this, c2774bMo40328g, m12296q2(), m12298s2(), m12255C2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: N0 */
    public void mo5162N0(RecyclerView recyclerView, RecyclerView.C1041x c1041x) {
        super.mo5162N0(recyclerView, c1041x);
        recyclerView.removeOnLayoutChangeListener(this.f9850D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: N1 */
    public void mo5163N1(RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0, int i10) {
        C2769a c2769a = new C2769a(recyclerView.getContext());
        c2769a.m5383p(i10);
        m5575O1(c2769a);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m12265N2() {
        this.f9860y = null;
        m5639y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: O0 */
    public View mo5080O0(@NonNull View view, int i10, @NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0) {
        int iM12252k2;
        if (m5574O() == 0 || (iM12252k2 = m12252k2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iM12252k2 == -1) {
            if (m5613l0(view) == 0) {
                return null;
            }
            m12281b2(c1041x, m5613l0(m5573N(0)) - 1, 0);
            return m12293n2();
        }
        if (m5613l0(view) == m5595e() - 1) {
            return null;
        }
        m12281b2(c1041x, m5613l0(m5573N(m5574O() - 1)) + 1, -1);
        return m12292m2();
    }

    /* JADX INFO: renamed from: O2 */
    public final void m12266O2(RecyclerView.C1041x c1041x) {
        while (m5574O() > 0) {
            View viewM5573N = m5573N(0);
            float fM12295p2 = m12295p2(viewM5573N);
            if (!m12260I2(fM12295p2, m12242F2(this.f9861z.m12325g(), fM12295p2, true))) {
                break;
            } else {
                m5626r1(viewM5573N, c1041x);
            }
        }
        while (m5574O() - 1 >= 0) {
            View viewM5573N2 = m5573N(m5574O() - 1);
            float fM12295p3 = m12295p2(viewM5573N2);
            if (!m12259H2(fM12295p3, m12242F2(this.f9861z.m12325g(), fM12295p3, true))) {
                return;
            } else {
                m5626r1(viewM5573N2, c1041x);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: P0 */
    public void mo5166P0(@NonNull AccessibilityEvent accessibilityEvent) {
        super.mo5166P0(accessibilityEvent);
        if (m5574O() > 0) {
            accessibilityEvent.setFromIndex(m5613l0(m5573N(0)));
            accessibilityEvent.setToIndex(m5613l0(m5573N(m5574O() - 1)));
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m12267Q2(RecyclerView recyclerView, int i10) {
        if (mo12286f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void m12268R2(int i10) {
        this.f9853G = i10;
        m12265N2();
    }

    /* JADX INFO: renamed from: S2 */
    public final void m12269S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26472l0);
            m12268R2(typedArrayObtainStyledAttributes.getInt(C6747k.f26481m0, 0));
            m12271U2(typedArrayObtainStyledAttributes.getInt(C6747k.f26395c5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m12270T2(@NonNull AbstractC10500f abstractC10500f) {
        this.f9859x = abstractC10500f;
        m12265N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: U */
    public void mo5583U(@NonNull View view, @NonNull Rect rect) {
        super.mo5583U(view, rect);
        float fCenterY = rect.centerY();
        if (mo12286f()) {
            fCenterY = rect.centerX();
        }
        float fM12299t2 = m12299t2(fCenterY, m12242F2(this.f9861z.m12325g(), fCenterY, true));
        float fWidth = mo12286f() ? (rect.width() - fM12299t2) / 2.0f : 0.0f;
        float fHeight = mo12286f() ? 0.0f : (rect.height() - fM12299t2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    /* JADX INFO: renamed from: U2 */
    public void m12271U2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        mo5188l(null);
        AbstractC10499e abstractC10499e = this.f9849C;
        if (abstractC10499e == null || i10 != abstractC10499e.f37716a) {
            this.f9849C = AbstractC10499e.m40306c(this, i10);
            m12265N2();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final void m12272V2(View view, float f10, C2772d c2772d) {
        if (view instanceof InterfaceC10501g) {
            C2774b.c cVar = c2772d.f9869a;
            float f11 = cVar.f9886c;
            C2774b.c cVar2 = c2772d.f9870b;
            float fM29920b = C7137a.m29920b(f11, cVar2.f9886c, cVar.f9884a, cVar2.f9884a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFMo40310f = this.f9849C.mo40310f(height, width, C7137a.m29920b(0.0f, height / 2.0f, 0.0f, 1.0f, fM29920b), C7137a.m29920b(0.0f, width / 2.0f, 0.0f, 1.0f, fM29920b));
            float fM12285e2 = m12285e2(view, f10, c2772d);
            RectF rectF = new RectF(fM12285e2 - (rectFMo40310f.width() / 2.0f), fM12285e2 - (rectFMo40310f.height() / 2.0f), fM12285e2 + (rectFMo40310f.width() / 2.0f), (rectFMo40310f.height() / 2.0f) + fM12285e2);
            RectF rectF2 = new RectF(m12304y2(), m12254B2(), m12305z2(), m12302w2());
            if (this.f9859x.m40327f()) {
                this.f9849C.mo40308a(rectFMo40310f, rectF, rectF2);
            }
            this.f9849C.mo40318n(rectFMo40310f, rectF, rectF2);
            ((InterfaceC10501g) view).m40330a(rectFMo40310f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: W0 */
    public void mo5092W0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.mo5092W0(recyclerView, i10, i11);
        m12274X2();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m12273W2(@NonNull C2775c c2775c) {
        int i10 = this.f9856u;
        int i11 = this.f9855t;
        if (i10 <= i11) {
            this.f9861z = m12258G2() ? c2775c.m12359h() : c2775c.m12363l();
        } else {
            this.f9861z = c2775c.m12361j(this.f9854s, i11, i10);
        }
        this.f9858w.m12306j(this.f9861z.m12325g());
    }

    /* JADX INFO: renamed from: X2 */
    public final void m12274X2() {
        int iM5595e = m5595e();
        int i10 = this.f9851E;
        if (iM5595e == i10 || this.f9860y == null) {
            return;
        }
        if (this.f9859x.mo40329h(this, i10)) {
            m12265N2();
        }
        this.f9851E = iM5595e;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m12275Y1(View view, int i10, C2770b c2770b) {
        float fM12324f = this.f9861z.m12324f() / 2.0f;
        m5607j(view, i10);
        float f10 = c2770b.f9865c;
        this.f9849C.mo40317m(view, (int) (f10 - fM12324f), (int) (f10 + fM12324f));
        m12272V2(view, c2770b.f9864b, c2770b.f9866d);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m12276Y2() {
        if (!this.f9857v || m5574O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < m5574O() - 1) {
            int iM5613l0 = m5613l0(m5573N(i10));
            int i11 = i10 + 1;
            int iM5613l1 = m5613l0(m5573N(i11));
            if (iM5613l0 > iM5613l1) {
                m12261J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iM5613l0 + "] and child at index [" + i11 + "] had adapter position [" + iM5613l1 + "].");
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Z0 */
    public void mo5098Z0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.mo5098Z0(recyclerView, i10, i11);
        m12274X2();
    }

    /* JADX INFO: renamed from: Z1 */
    public final float m12277Z1(float f10, float f11) {
        return m12258G2() ? f10 - f11 : f10 + f11;
    }

    @Override // p377qc.InterfaceC10496b
    /* JADX INFO: renamed from: a */
    public int mo12278a() {
        return m5627s0();
    }

    /* JADX INFO: renamed from: a2 */
    public final float m12279a2(float f10, float f11) {
        return m12258G2() ? f10 + f11 : f10 - f11;
    }

    @Override // p377qc.InterfaceC10496b
    /* JADX INFO: renamed from: b */
    public int mo12280b() {
        return m5592b0();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m12281b2(@NonNull RecyclerView.C1041x c1041x, int i10, int i11) {
        if (i10 < 0 || i10 >= m5595e()) {
            return;
        }
        C2770b c2770bM12262K2 = m12262K2(c1041x, m12287f2(i10), i10);
        m12275Y1(c2770bM12262K2.f9863a, i11, c2770bM12262K2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0.b
    /* JADX INFO: renamed from: c */
    public PointF mo5177c(int i10) {
        if (this.f9860y == null) {
            return null;
        }
        int iM12300u2 = m12300u2(i10, m12297r2(i10));
        return mo12286f() ? new PointF(iM12300u2, 0.0f) : new PointF(0.0f, iM12300u2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: c1 */
    public void mo5103c1(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (c1015b0.m5392b() <= 0 || m12294o2() <= 0.0f) {
            m5622p1(c1041x);
            this.f9847A = 0;
            return;
        }
        boolean zM12258G2 = m12258G2();
        boolean z10 = this.f9860y == null;
        if (z10) {
            m12264M2(c1041x);
        }
        int iM12290j2 = m12290j2(this.f9860y);
        int iM12288g2 = m12288g2(c1015b0, this.f9860y);
        this.f9855t = zM12258G2 ? iM12288g2 : iM12290j2;
        if (zM12258G2) {
            iM12288g2 = iM12290j2;
        }
        this.f9856u = iM12288g2;
        if (z10) {
            this.f9854s = iM12290j2;
            this.f9848B = this.f9860y.m12360i(m5595e(), this.f9855t, this.f9856u, m12258G2());
            int i10 = this.f9852F;
            if (i10 != -1) {
                this.f9854s = m12256D2(i10, m12297r2(i10));
            }
        }
        int i11 = this.f9854s;
        this.f9854s = i11 + m12251i2(0, i11, this.f9855t, this.f9856u);
        this.f9847A = C11162a.m42060c(this.f9847A, 0, c1015b0.m5392b());
        m12273W2(this.f9860y);
        m5547B(c1041x);
        m12291l2(c1041x, c1015b0);
        this.f9851E = m5595e();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m12282c2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, int i10) {
        float fM12287f2 = m12287f2(i10);
        while (i10 < c1015b0.m5392b()) {
            C2770b c2770bM12262K2 = m12262K2(c1041x, fM12287f2, i10);
            if (m12259H2(c2770bM12262K2.f9865c, c2770bM12262K2.f9866d)) {
                return;
            }
            fM12287f2 = m12277Z1(fM12287f2, this.f9861z.m12324f());
            if (!m12260I2(c2770bM12262K2.f9865c, c2770bM12262K2.f9866d)) {
                m12275Y1(c2770bM12262K2.f9863a, -1, c2770bM12262K2);
            }
            i10++;
        }
    }

    @Override // p377qc.InterfaceC10496b
    /* JADX INFO: renamed from: d */
    public int mo12283d() {
        return this.f9853G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: d1 */
    public void mo5105d1(RecyclerView.C1015b0 c1015b0) {
        super.mo5105d1(c1015b0);
        if (m5574O() == 0) {
            this.f9847A = 0;
        } else {
            this.f9847A = m5613l0(m5573N(0));
        }
        m12276Y2();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m12284d2(RecyclerView.C1041x c1041x, int i10) {
        float fM12287f2 = m12287f2(i10);
        while (i10 >= 0) {
            C2770b c2770bM12262K2 = m12262K2(c1041x, fM12287f2, i10);
            if (m12260I2(c2770bM12262K2.f9865c, c2770bM12262K2.f9866d)) {
                return;
            }
            fM12287f2 = m12279a2(fM12287f2, this.f9861z.m12324f());
            if (!m12259H2(c2770bM12262K2.f9865c, c2770bM12262K2.f9866d)) {
                m12275Y1(c2770bM12262K2.f9863a, 0, c2770bM12262K2);
            }
            i10--;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final float m12285e2(View view, float f10, C2772d c2772d) {
        C2774b.c cVar = c2772d.f9869a;
        float f11 = cVar.f9885b;
        C2774b.c cVar2 = c2772d.f9870b;
        float fM29920b = C7137a.m29920b(f11, cVar2.f9885b, cVar.f9884a, cVar2.f9884a, f10);
        if (c2772d.f9870b != this.f9861z.m12321c() && c2772d.f9869a != this.f9861z.m12328j()) {
            return fM29920b;
        }
        float fMo40309e = this.f9849C.mo40309e((RecyclerView.C1035r) view.getLayoutParams()) / this.f9861z.m12324f();
        C2774b.c cVar3 = c2772d.f9870b;
        return fM29920b + ((f10 - cVar3.f9884a) * ((1.0f - cVar3.f9886c) + fMo40309e));
    }

    @Override // p377qc.InterfaceC10496b
    /* JADX INFO: renamed from: f */
    public boolean mo12286f() {
        return this.f9849C.f37716a == 0;
    }

    /* JADX INFO: renamed from: f2 */
    public final float m12287f2(int i10) {
        return m12277Z1(m12253A2() - this.f9854s, this.f9861z.m12324f() * i10);
    }

    /* JADX INFO: renamed from: g2 */
    public final int m12288g2(RecyclerView.C1015b0 c1015b0, C2775c c2775c) {
        boolean zM12258G2 = m12258G2();
        C2774b c2774bM12363l = zM12258G2 ? c2775c.m12363l() : c2775c.m12359h();
        C2774b.c cVarM12319a = zM12258G2 ? c2774bM12363l.m12319a() : c2774bM12363l.m12326h();
        int iM5392b = (int) (((((c1015b0.m5392b() - 1) * c2774bM12363l.m12324f()) * (zM12258G2 ? -1.0f : 1.0f)) - (cVarM12319a.f9884a - m12253A2())) + (m12303x2() - cVarM12319a.f9884a) + (zM12258G2 ? -cVarM12319a.f9890g : cVarM12319a.f9891h));
        return zM12258G2 ? Math.min(0, iM5392b) : Math.max(0, iM5392b);
    }

    /* JADX INFO: renamed from: h2 */
    public int m12289h2(int i10) {
        return (int) (this.f9854s - m12256D2(i10, m12297r2(i10)));
    }

    /* JADX INFO: renamed from: j2 */
    public final int m12290j2(@NonNull C2775c c2775c) {
        boolean zM12258G2 = m12258G2();
        C2774b c2774bM12359h = zM12258G2 ? c2775c.m12359h() : c2775c.m12363l();
        return (int) (m12253A2() - m12279a2((zM12258G2 ? c2774bM12359h.m12326h() : c2774bM12359h.m12319a()).f9884a, c2774bM12359h.m12324f() / 2.0f));
    }

    /* JADX INFO: renamed from: l2 */
    public final void m12291l2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        m12266O2(c1041x);
        if (m5574O() == 0) {
            m12284d2(c1041x, this.f9847A - 1);
            m12282c2(c1041x, c1015b0, this.f9847A);
        } else {
            int iM5613l0 = m5613l0(m5573N(0));
            int iM5613l1 = m5613l0(m5573N(m5574O() - 1));
            m12284d2(c1041x, iM5613l0 - 1);
            m12282c2(c1041x, c1015b0, iM5613l1 + 1);
        }
        m12276Y2();
    }

    /* JADX INFO: renamed from: m2 */
    public final View m12292m2() {
        return m5573N(m12258G2() ? 0 : m5574O() - 1);
    }

    /* JADX INFO: renamed from: n2 */
    public final View m12293n2() {
        return m5573N(m12258G2() ? m5574O() - 1 : 0);
    }

    /* JADX INFO: renamed from: o2 */
    public final int m12294o2() {
        return mo12286f() ? mo12278a() : mo12280b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: p */
    public boolean mo5191p() {
        return mo12286f();
    }

    /* JADX INFO: renamed from: p2 */
    public final float m12295p2(View view) {
        Rect rect = new Rect();
        super.mo5583U(view, rect);
        return mo12286f() ? rect.centerX() : rect.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: q */
    public boolean mo5193q() {
        return !mo12286f();
    }

    /* JADX INFO: renamed from: q2 */
    public final int m12296q2() {
        int i10;
        int i11;
        if (m5574O() <= 0) {
            return 0;
        }
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) m5573N(0).getLayoutParams();
        if (this.f9849C.f37716a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) c1035r).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) c1035r).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) c1035r).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin;
        }
        return i10 + i11;
    }

    /* JADX INFO: renamed from: r2 */
    public final C2774b m12297r2(int i10) {
        C2774b c2774b;
        Map<Integer, C2774b> map = this.f9848B;
        return (map == null || (c2774b = map.get(Integer.valueOf(C11162a.m42060c(i10, 0, Math.max(0, m5595e() + (-1)))))) == null) ? this.f9860y.m12358g() : c2774b;
    }

    /* JADX INFO: renamed from: s2 */
    public final int m12298s2() {
        if (m5579R() || !this.f9859x.m40327f()) {
            return 0;
        }
        return m12301v2() == 1 ? m5611k0() : m5606i0();
    }

    /* JADX INFO: renamed from: t2 */
    public final float m12299t2(float f10, C2772d c2772d) {
        C2774b.c cVar = c2772d.f9869a;
        float f11 = cVar.f9887d;
        C2774b.c cVar2 = c2772d.f9870b;
        return C7137a.m29920b(f11, cVar2.f9887d, cVar.f9885b, cVar2.f9885b, f10);
    }

    /* JADX INFO: renamed from: u2 */
    public int m12300u2(int i10, @NonNull C2774b c2774b) {
        return m12256D2(i10, c2774b) - this.f9854s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: v */
    public int mo5200v(@NonNull RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0 || this.f9860y == null || m5595e() <= 1) {
            return 0;
        }
        return (int) (m5627s0() * (this.f9860y.m12358g().m12324f() / mo5131x(c1015b0)));
    }

    /* JADX INFO: renamed from: v2 */
    public int m12301v2() {
        return this.f9849C.f37716a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: w */
    public int mo5130w(@NonNull RecyclerView.C1015b0 c1015b0) {
        return this.f9854s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: w0 */
    public boolean mo5201w0() {
        return true;
    }

    /* JADX INFO: renamed from: w2 */
    public final int m12302w2() {
        return this.f9849C.mo40311g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: x */
    public int mo5131x(@NonNull RecyclerView.C1015b0 c1015b0) {
        return this.f9856u - this.f9855t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: x1 */
    public boolean mo5637x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
        int iM12257E2;
        if (this.f9860y == null || (iM12257E2 = m12257E2(m5613l0(view), m12297r2(m5613l0(view)))) == 0) {
            return false;
        }
        m12267Q2(recyclerView, m12257E2(m5613l0(view), this.f9860y.m12361j(this.f9854s + m12251i2(iM12257E2, this.f9854s, this.f9855t, this.f9856u), this.f9855t, this.f9856u)));
        return true;
    }

    /* JADX INFO: renamed from: x2 */
    public final int m12303x2() {
        return this.f9849C.mo40312h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: y */
    public int mo5204y(@NonNull RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0 || this.f9860y == null || m5595e() <= 1) {
            return 0;
        }
        return (int) (m5592b0() * (this.f9860y.m12358g().m12324f() / mo5072A(c1015b0)));
    }

    /* JADX INFO: renamed from: y2 */
    public final int m12304y2() {
        return this.f9849C.mo40313i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: z */
    public int mo5132z(@NonNull RecyclerView.C1015b0 c1015b0) {
        return this.f9854s;
    }

    /* JADX INFO: renamed from: z2 */
    public final int m12305z2() {
        return this.f9849C.mo40314j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CarouselLayoutManager(@NonNull AbstractC10500f abstractC10500f) {
        this(abstractC10500f, 0);
    }

    public CarouselLayoutManager(@NonNull AbstractC10500f abstractC10500f, int i10) {
        this.f9857v = false;
        this.f9858w = new C2771c();
        this.f9847A = 0;
        this.f9850D = new View.OnLayoutChangeListener() { // from class: qc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.m12245S1(this.f37714a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f9852F = -1;
        this.f9853G = 0;
        m12270T2(abstractC10500f);
        m12271U2(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f9857v = false;
        this.f9858w = new C2771c();
        this.f9847A = 0;
        this.f9850D = new View.OnLayoutChangeListener() { // from class: qc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.m12245S1(this.f37714a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f9852F = -1;
        this.f9853G = 0;
        m12270T2(new C10502h());
        m12269S2(context, attributeSet);
    }
}
