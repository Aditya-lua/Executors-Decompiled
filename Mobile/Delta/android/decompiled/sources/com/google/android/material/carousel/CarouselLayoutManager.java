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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.carousel.CarouselLayoutManager;
import hc.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import pc.e;
import pc.f;
import pc.h;
import x2.g;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.q implements pc.b, RecyclerView.a0.b {
    public int A;
    public Map<Integer, com.google.android.material.carousel.b> B;
    public e C;
    public final View.OnLayoutChangeListener D;
    public int E;
    public int F;
    public int G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7705u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f7707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public f f7708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.google.android.material.carousel.c f7709y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.google.android.material.carousel.b f7710z;

    public class a extends l {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i10) {
            return CarouselLayoutManager.this.c(i10);
        }

        @Override // androidx.recyclerview.widget.l
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f7709y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.l
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f7709y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f7712a;
        public final float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f7713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f7714d;

        public b(View view, float f10, float f11, d dVar) {
            this.f7712a = view;
            this.b = f10;
            this.f7713c = f11;
            this.f7714d = dVar;
        }
    }

    public static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f7715a;
        public List<com.google.android.material.carousel.b.c> b;

        public c() {
            Paint paint = new Paint();
            this.f7715a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.b0 b0Var) {
            super.i(canvas, recyclerView, b0Var);
            this.f7715a.setStrokeWidth(recyclerView.getResources().getDimension(hc.d.f18835n));
            for (com.google.android.material.carousel.b.c cVar : this.b) {
                this.f7715a.setColor(androidx.core.graphics.c.c(-65281, -16776961, cVar.f7729c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).B2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).w2(), this.f7715a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.b, this.f7715a);
                }
            }
        }

        public void j(List<com.google.android.material.carousel.b.c> list) {
            this.b = Collections.unmodifiableList(list);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.material.carousel.b.c f7716a;
        public final com.google.android.material.carousel.b.c b;

        public d(com.google.android.material.carousel.b.c cVar, com.google.android.material.carousel.b.c cVar2) {
            g.a(cVar.f7728a <= cVar2.f7728a);
            this.f7716a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    public static d F2(List<com.google.android.material.carousel.b.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            com.google.android.material.carousel.b.c cVar = list.get(i14);
            float f15 = z10 ? cVar.b : cVar.f7728a;
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
        return new d(list.get(i10), list.get(i12));
    }

    private int P2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f7709y == null) {
            M2(xVar);
        }
        int iI2 = i2(i10, this.f7703s, this.f7704t, this.f7705u);
        this.f7703s += iI2;
        W2(this.f7709y);
        float f10 = this.f7710z.f() / 2.0f;
        float fF2 = f2(l0(N(0)));
        Rect rect = new Rect();
        float f11 = G2() ? this.f7710z.h().b : this.f7710z.a().b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View viewN = N(i11);
            float fAbs = Math.abs(f11 - L2(viewN, fF2, f10, rect));
            if (viewN != null && fAbs < f12) {
                this.F = l0(viewN);
                f12 = fAbs;
            }
            fF2 = Z1(fF2, this.f7710z.f());
        }
        l2(xVar, b0Var);
        return iI2;
    }

    public static /* synthetic */ void S1(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: pc.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f28413a.N2();
            }
        });
    }

    public static int i2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int k2(int i10) {
        int iV2 = v2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (iV2 == 0) {
                return G2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return iV2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (iV2 == 0) {
                return G2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return iV2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(@NonNull RecyclerView.b0 b0Var) {
        return this.f7705u - this.f7704t;
    }

    public final int A2() {
        return this.C.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (p()) {
            return P2(i10, xVar, b0Var);
        }
        return 0;
    }

    public final int B2() {
        return this.C.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.F = i10;
        if (this.f7709y == null) {
            return;
        }
        this.f7703s = D2(i10, r2(i10));
        this.A = s2.a.c(i10, 0, Math.max(0, e() - 1));
        W2(this.f7709y);
        y1();
    }

    public final int C2() {
        if (R() || !this.f7708x.f()) {
            return 0;
        }
        return v2() == 1 ? h0() : j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (q()) {
            return P2(i10, xVar, b0Var);
        }
        return 0;
    }

    public final int D2(int i10, com.google.android.material.carousel.b bVar) {
        return G2() ? (int) (((o2() - bVar.h().f7728a) - (i10 * bVar.f())) - (bVar.f() / 2.0f)) : (int) (((i10 * bVar.f()) - bVar.a().f7728a) + (bVar.f() / 2.0f));
    }

    public final int E2(int i10, @NonNull com.google.android.material.carousel.b bVar) {
        int i11 = Integer.MAX_VALUE;
        for (com.google.android.material.carousel.b.c cVar : bVar.e()) {
            float f10 = (i10 * bVar.f()) + (bVar.f() / 2.0f);
            int iO2 = (G2() ? (int) ((o2() - cVar.f7728a) - f10) : (int) (f10 - cVar.f7728a)) - this.f7703s;
            if (Math.abs(i11) > Math.abs(iO2)) {
                i11 = iO2;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void F0(@NonNull View view, int i10, int i11) {
        if (!(view instanceof pc.g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        Rect rect = new Rect();
        o(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        com.google.android.material.carousel.c cVar = this.f7709y;
        float f10 = (cVar == null || this.C.f28414a != 0) ? ((ViewGroup.MarginLayoutParams) rVar).width : cVar.g().f();
        com.google.android.material.carousel.c cVar2 = this.f7709y;
        view.measure(RecyclerView.q.P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, (int) f10, p()), RecyclerView.q.P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, (int) ((cVar2 == null || this.C.f28414a != 1) ? ((ViewGroup.MarginLayoutParams) rVar).height : cVar2.g().f()), q()));
    }

    public boolean G2() {
        return f() && d0() == 1;
    }

    public final boolean H2(float f10, d dVar) {
        float fA2 = a2(f10, t2(f10, dVar) / 2.0f);
        if (G2()) {
            return fA2 < 0.0f;
        }
        return fA2 > ((float) o2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    public final boolean I2(float f10, d dVar) {
        float fZ1 = Z1(f10, t2(f10, dVar) / 2.0f);
        if (G2()) {
            return fZ1 > ((float) o2());
        }
        return fZ1 < 0.0f;
    }

    public final void J2() {
        if (this.f7706v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View viewN = N(i10);
                Log.d("CarouselLayoutManager", "item position " + l0(viewN) + ", center:" + p2(viewN) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    public final b K2(RecyclerView.x xVar, float f10, int i10) {
        View viewO = xVar.o(i10);
        F0(viewO, 0, 0);
        float fZ1 = Z1(f10, this.f7710z.f() / 2.0f);
        d dVarF2 = F2(this.f7710z.g(), fZ1, false);
        return new b(viewO, fZ1, e2(viewO, fZ1, dVarF2), dVarF2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.f7708x.e(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    public final float L2(View view, float f10, float f11, Rect rect) {
        float fZ1 = Z1(f10, f11);
        d dVarF2 = F2(this.f7710z.g(), fZ1, false);
        float fE2 = e2(view, fZ1, dVarF2);
        super.U(view, rect);
        V2(view, fZ1, dVarF2);
        this.C.o(view, rect, f11, fE2);
        return fE2;
    }

    public final void M2(RecyclerView.x xVar) {
        View viewO = xVar.o(0);
        F0(viewO, 0, 0);
        com.google.android.material.carousel.b bVarG = this.f7708x.g(this, viewO);
        if (G2()) {
            bVarG = com.google.android.material.carousel.b.n(bVarG, o2());
        }
        this.f7709y = com.google.android.material.carousel.c.f(this, bVarG, q2(), s2(), C2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        O1(aVar);
    }

    public final void N2() {
        this.f7709y = null;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(@NonNull View view, int i10, @NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var) {
        int iK2;
        if (O() == 0 || (iK2 = k2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iK2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            b2(xVar, l0(N(0)) - 1, 0);
            return n2();
        }
        if (l0(view) == e() - 1) {
            return null;
        }
        b2(xVar, l0(N(O() - 1)) + 1, -1);
        return m2();
    }

    public final void O2(RecyclerView.x xVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fP2 = p2(viewN);
            if (!I2(fP2, F2(this.f7710z.g(), fP2, true))) {
                break;
            } else {
                r1(viewN, xVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fP3 = p2(viewN2);
            if (!H2(fP3, F2(this.f7710z.g(), fP3, true))) {
                return;
            } else {
                r1(viewN2, xVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(@NonNull AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public final void Q2(RecyclerView recyclerView, int i10) {
        if (f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    public void R2(int i10) {
        this.G = i10;
        N2();
    }

    public final void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f19058l0);
            R2(typedArrayObtainStyledAttributes.getInt(k.f19067m0, 0));
            U2(typedArrayObtainStyledAttributes.getInt(k.f18981c5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void T2(@NonNull f fVar) {
        this.f7708x = fVar;
        N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U(@NonNull View view, @NonNull Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (f()) {
            fCenterY = rect.centerX();
        }
        float fT2 = t2(fCenterY, F2(this.f7710z.g(), fCenterY, true));
        float fWidth = f() ? (rect.width() - fT2) / 2.0f : 0.0f;
        float fHeight = f() ? 0.0f : (rect.height() - fT2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void U2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        e eVar = this.C;
        if (eVar == null || i10 != eVar.f28414a) {
            this.C = e.c(this, i10);
            N2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V2(View view, float f10, d dVar) {
        if (view instanceof pc.g) {
            com.google.android.material.carousel.b.c cVar = dVar.f7716a;
            float f11 = cVar.f7729c;
            com.google.android.material.carousel.b.c cVar2 = dVar.b;
            float fB = ic.a.b(f11, cVar2.f7729c, cVar.f7728a, cVar2.f7728a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.C.f(height, width, ic.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), ic.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fE2 = e2(view, f10, dVar);
            RectF rectF = new RectF(fE2 - (rectFF.width() / 2.0f), fE2 - (rectFF.height() / 2.0f), fE2 + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fE2);
            RectF rectF2 = new RectF(y2(), B2(), z2(), w2());
            if (this.f7708x.f()) {
                this.C.a(rectFF, rectF, rectF2);
            }
            this.C.n(rectFF, rectF, rectF2);
            ((pc.g) view).a(rectFF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.W0(recyclerView, i10, i11);
        X2();
    }

    public final void W2(@NonNull com.google.android.material.carousel.c cVar) {
        int i10 = this.f7705u;
        int i11 = this.f7704t;
        if (i10 <= i11) {
            this.f7710z = G2() ? cVar.h() : cVar.l();
        } else {
            this.f7710z = cVar.j(this.f7703s, i11, i10);
        }
        this.f7707w.j(this.f7710z.g());
    }

    public final void X2() {
        int iE = e();
        int i10 = this.E;
        if (iE == i10 || this.f7709y == null) {
            return;
        }
        if (this.f7708x.h(this, i10)) {
            N2();
        }
        this.E = iE;
    }

    public final void Y1(View view, int i10, b bVar) {
        float f10 = this.f7710z.f() / 2.0f;
        j(view, i10);
        float f11 = bVar.f7713c;
        this.C.m(view, (int) (f11 - f10), (int) (f11 + f10));
        V2(view, bVar.b, bVar.f7714d);
    }

    public final void Y2() {
        if (!this.f7706v || O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < O() - 1) {
            int iL0 = l0(N(i10));
            int i11 = i10 + 1;
            int iL1 = l0(N(i11));
            if (iL0 > iL1) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iL0 + "] and child at index [" + i11 + "] had adapter position [" + iL1 + "].");
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.Z0(recyclerView, i10, i11);
        X2();
    }

    public final float Z1(float f10, float f11) {
        return G2() ? f10 - f11 : f10 + f11;
    }

    @Override // pc.b
    public int a() {
        return s0();
    }

    public final float a2(float f10, float f11) {
        return G2() ? f10 + f11 : f10 - f11;
    }

    @Override // pc.b
    public int b() {
        return b0();
    }

    public final void b2(@NonNull RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0 || i10 >= e()) {
            return;
        }
        b bVarK2 = K2(xVar, f2(i10), i10);
        Y1(bVarK2.f7712a, i11, bVarK2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        if (this.f7709y == null) {
            return null;
        }
        int iU2 = u2(i10, r2(i10));
        return f() ? new PointF(iU2, 0.0f) : new PointF(0.0f, iU2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (b0Var.b() <= 0 || o2() <= 0.0f) {
            p1(xVar);
            this.A = 0;
            return;
        }
        boolean zG2 = G2();
        boolean z10 = this.f7709y == null;
        if (z10) {
            M2(xVar);
        }
        int iJ2 = j2(this.f7709y);
        int iG2 = g2(b0Var, this.f7709y);
        this.f7704t = zG2 ? iG2 : iJ2;
        if (zG2) {
            iG2 = iJ2;
        }
        this.f7705u = iG2;
        if (z10) {
            this.f7703s = iJ2;
            this.B = this.f7709y.i(e(), this.f7704t, this.f7705u, G2());
            int i10 = this.F;
            if (i10 != -1) {
                this.f7703s = D2(i10, r2(i10));
            }
        }
        int i11 = this.f7703s;
        this.f7703s = i11 + i2(0, i11, this.f7704t, this.f7705u);
        this.A = s2.a.c(this.A, 0, b0Var.b());
        W2(this.f7709y);
        B(xVar);
        l2(xVar, b0Var);
        this.E = e();
    }

    public final void c2(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        float fF2 = f2(i10);
        while (i10 < b0Var.b()) {
            b bVarK2 = K2(xVar, fF2, i10);
            if (H2(bVarK2.f7713c, bVarK2.f7714d)) {
                return;
            }
            fF2 = Z1(fF2, this.f7710z.f());
            if (!I2(bVarK2.f7713c, bVarK2.f7714d)) {
                Y1(bVarK2.f7712a, -1, bVarK2);
            }
            i10++;
        }
    }

    @Override // pc.b
    public int d() {
        return this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = l0(N(0));
        }
        Y2();
    }

    public final void d2(RecyclerView.x xVar, int i10) {
        float fF2 = f2(i10);
        while (i10 >= 0) {
            b bVarK2 = K2(xVar, fF2, i10);
            if (I2(bVarK2.f7713c, bVarK2.f7714d)) {
                return;
            }
            fF2 = a2(fF2, this.f7710z.f());
            if (!H2(bVarK2.f7713c, bVarK2.f7714d)) {
                Y1(bVarK2.f7712a, 0, bVarK2);
            }
            i10--;
        }
    }

    public final float e2(View view, float f10, d dVar) {
        com.google.android.material.carousel.b.c cVar = dVar.f7716a;
        float f11 = cVar.b;
        com.google.android.material.carousel.b.c cVar2 = dVar.b;
        float fB = ic.a.b(f11, cVar2.b, cVar.f7728a, cVar2.f7728a, f10);
        if (dVar.b != this.f7710z.c() && dVar.f7716a != this.f7710z.j()) {
            return fB;
        }
        float fE = this.C.e((RecyclerView.r) view.getLayoutParams()) / this.f7710z.f();
        com.google.android.material.carousel.b.c cVar3 = dVar.b;
        return fB + ((f10 - cVar3.f7728a) * ((1.0f - cVar3.f7729c) + fE));
    }

    @Override // pc.b
    public boolean f() {
        return this.C.f28414a == 0;
    }

    public final float f2(int i10) {
        return Z1(A2() - this.f7703s, this.f7710z.f() * i10);
    }

    public final int g2(RecyclerView.b0 b0Var, com.google.android.material.carousel.c cVar) {
        boolean zG2 = G2();
        com.google.android.material.carousel.b bVarL = zG2 ? cVar.l() : cVar.h();
        com.google.android.material.carousel.b.c cVarA = zG2 ? bVarL.a() : bVarL.h();
        int iB = (int) (((((b0Var.b() - 1) * bVarL.f()) * (zG2 ? -1.0f : 1.0f)) - (cVarA.f7728a - A2())) + (x2() - cVarA.f7728a) + (zG2 ? -cVarA.f7733g : cVarA.f7734h));
        return zG2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    public int h2(int i10) {
        return (int) (this.f7703s - D2(i10, r2(i10)));
    }

    public final int j2(@NonNull com.google.android.material.carousel.c cVar) {
        boolean zG2 = G2();
        com.google.android.material.carousel.b bVarH = zG2 ? cVar.h() : cVar.l();
        return (int) (A2() - a2((zG2 ? bVarH.h() : bVarH.a()).f7728a, bVarH.f() / 2.0f));
    }

    public final void l2(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        O2(xVar);
        if (O() == 0) {
            d2(xVar, this.A - 1);
            c2(xVar, b0Var, this.A);
        } else {
            int iL0 = l0(N(0));
            int iL1 = l0(N(O() - 1));
            d2(xVar, iL0 - 1);
            c2(xVar, b0Var, iL1 + 1);
        }
        Y2();
    }

    public final View m2() {
        return N(G2() ? 0 : O() - 1);
    }

    public final View n2() {
        return N(G2() ? O() - 1 : 0);
    }

    public final int o2() {
        return f() ? a() : b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return f();
    }

    public final float p2(View view) {
        Rect rect = new Rect();
        super.U(view, rect);
        return f() ? rect.centerX() : rect.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return !f();
    }

    public final int q2() {
        int i10;
        int i11;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) N(0).getLayoutParams();
        if (this.C.f28414a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i10 + i11;
    }

    public final com.google.android.material.carousel.b r2(int i10) {
        com.google.android.material.carousel.b bVar;
        Map<Integer, com.google.android.material.carousel.b> map = this.B;
        return (map == null || (bVar = map.get(Integer.valueOf(s2.a.c(i10, 0, Math.max(0, e() + (-1)))))) == null) ? this.f7709y.g() : bVar;
    }

    public final int s2() {
        if (R() || !this.f7708x.f()) {
            return 0;
        }
        return v2() == 1 ? k0() : i0();
    }

    public final float t2(float f10, d dVar) {
        com.google.android.material.carousel.b.c cVar = dVar.f7716a;
        float f11 = cVar.f7730d;
        com.google.android.material.carousel.b.c cVar2 = dVar.b;
        return ic.a.b(f11, cVar2.f7730d, cVar.b, cVar2.b, f10);
    }

    public int u2(int i10, @NonNull com.google.android.material.carousel.b bVar) {
        return D2(i10, bVar) - this.f7703s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(@NonNull RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f7709y == null || e() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f7709y.g().f() / x(b0Var)));
    }

    public int v2() {
        return this.C.f28414a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(@NonNull RecyclerView.b0 b0Var) {
        return this.f7703s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    public final int w2() {
        return this.C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(@NonNull RecyclerView.b0 b0Var) {
        return this.f7705u - this.f7704t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
        int iE2;
        if (this.f7709y == null || (iE2 = E2(l0(view), r2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, E2(l0(view), this.f7709y.j(this.f7703s + i2(iE2, this.f7703s, this.f7704t, this.f7705u), this.f7704t, this.f7705u)));
        return true;
    }

    public final int x2() {
        return this.C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(@NonNull RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f7709y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f7709y.g().f() / A(b0Var)));
    }

    public final int y2() {
        return this.C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(@NonNull RecyclerView.b0 b0Var) {
        return this.f7703s;
    }

    public final int z2() {
        return this.C.j();
    }

    public CarouselLayoutManager(@NonNull f fVar) {
        this(fVar, 0);
    }

    public CarouselLayoutManager(@NonNull f fVar, int i10) {
        this.f7706v = false;
        this.f7707w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: pc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.S1(this.f28412a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(fVar);
        U2(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f7706v = false;
        this.f7707w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: pc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.S1(this.f28412a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(new h());
        S2(context, attributeSet);
    }
}
