package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: U */
    public static final Set<Integer> f3785U = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: I */
    public boolean f3786I;

    /* JADX INFO: renamed from: J */
    public int f3787J;

    /* JADX INFO: renamed from: K */
    public int[] f3788K;

    /* JADX INFO: renamed from: L */
    public View[] f3789L;

    /* JADX INFO: renamed from: M */
    public final SparseIntArray f3790M;

    /* JADX INFO: renamed from: N */
    public final SparseIntArray f3791N;

    /* JADX INFO: renamed from: O */
    public AbstractC1006d f3792O;

    /* JADX INFO: renamed from: P */
    public final Rect f3793P;

    /* JADX INFO: renamed from: Q */
    public boolean f3794Q;

    /* JADX INFO: renamed from: R */
    public int f3795R;

    /* JADX INFO: renamed from: S */
    public int f3796S;

    /* JADX INFO: renamed from: T */
    public int f3797T;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static class C1003a {
        /* JADX INFO: renamed from: a */
        public static boolean m5133a(@NonNull View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static final class C1004b extends AbstractC1006d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1006d
        /* JADX INFO: renamed from: e */
        public int mo5134e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1006d
        /* JADX INFO: renamed from: f */
        public int mo5135f(int i10) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$d */
    public static abstract class AbstractC1006d {

        /* JADX INFO: renamed from: a */
        public final SparseIntArray f3800a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        public final SparseIntArray f3801b = new SparseIntArray();

        /* JADX INFO: renamed from: c */
        public boolean f3802c = false;

        /* JADX INFO: renamed from: d */
        public boolean f3803d = false;

        /* JADX INFO: renamed from: a */
        public static int m5138a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* JADX INFO: renamed from: b */
        public int m5139b(int i10, int i11) {
            if (!this.f3803d) {
                return m5141d(i10, i11);
            }
            int i12 = this.f3801b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iM5141d = m5141d(i10, i11);
            this.f3801b.put(i10, iM5141d);
            return iM5141d;
        }

        /* JADX INFO: renamed from: c */
        public int m5140c(int i10, int i11) {
            if (!this.f3802c) {
                return mo5134e(i10, i11);
            }
            int i12 = this.f3800a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iMo5134e = mo5134e(i10, i11);
            this.f3800a.put(i10, iMo5134e);
            return iMo5134e;
        }

        /* JADX INFO: renamed from: d */
        public int m5141d(int i10, int i11) {
            int i12;
            int i13;
            int iM5140c;
            int iM5138a;
            if (!this.f3803d || (iM5138a = m5138a(this.f3801b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iM5140c = 0;
            } else {
                i12 = this.f3801b.get(iM5138a);
                i13 = iM5138a + 1;
                iM5140c = m5140c(iM5138a, i11) + mo5135f(iM5138a);
                if (iM5140c == i11) {
                    i12++;
                    iM5140c = 0;
                }
            }
            int iMo5135f = mo5135f(i10);
            while (i13 < i10) {
                int iMo5135f2 = mo5135f(i13);
                iM5140c += iMo5135f2;
                if (iM5140c == i11) {
                    i12++;
                    iM5140c = 0;
                } else if (iM5140c > i11) {
                    i12++;
                    iM5140c = iMo5135f2;
                }
                i13++;
            }
            return iM5140c + iMo5135f > i11 ? i12 + 1 : i12;
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo5134e(int i10, int i11);

        /* JADX INFO: renamed from: f */
        public abstract int mo5135f(int i10);

        /* JADX INFO: renamed from: g */
        public void m5142g() {
            this.f3801b.clear();
        }

        /* JADX INFO: renamed from: h */
        public void m5143h() {
            this.f3800a.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f3786I = false;
        this.f3787J = -1;
        this.f3790M = new SparseIntArray();
        this.f3791N = new SparseIntArray();
        this.f3792O = new C1004b();
        this.f3793P = new Rect();
        this.f3795R = -1;
        this.f3796S = -1;
        this.f3797T = -1;
        m5127t3(RecyclerView.AbstractC1034q.m5544m0(context, attributeSet, i10, i11).f4040b);
    }

    /* JADX INFO: renamed from: S2 */
    public static int[] m5071S2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: A */
    public int mo5072A(RecyclerView.C1015b0 c1015b0) {
        return this.f3794Q ? m5091V2(c1015b0) : super.mo5072A(c1015b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: B1 */
    public int mo5073B1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        m5128u3();
        m5095X2();
        return super.mo5073B1(i10, c1041x, c1015b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: D1 */
    public int mo5074D1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        m5128u3();
        m5095X2();
        return super.mo5074D1(i10, c1041x, c1015b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: G2 */
    public void mo5075G2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo5075G2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: H1 */
    public void mo5076H1(Rect rect, int i10, int i11) {
        int iM5545s;
        int iM5545s2;
        if (this.f3788K == null) {
            super.mo5076H1(rect, i10, i11);
        }
        int iM5606i0 = m5606i0() + m5608j0();
        int iM5611k0 = m5611k0() + m5604h0();
        if (this.f3812s == 1) {
            iM5545s2 = RecyclerView.AbstractC1034q.m5545s(i11, rect.height() + iM5611k0, m5598f0());
            int[] iArr = this.f3788K;
            iM5545s = RecyclerView.AbstractC1034q.m5545s(i10, iArr[iArr.length - 1] + iM5606i0, m5601g0());
        } else {
            iM5545s = RecyclerView.AbstractC1034q.m5545s(i10, rect.width() + iM5606i0, m5601g0());
            int[] iArr2 = this.f3788K;
            iM5545s2 = RecyclerView.AbstractC1034q.m5545s(i11, iArr2[iArr2.length - 1] + iM5611k0, m5598f0());
        }
        m5560G1(iM5545s, iM5545s2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1035r mo5077I() {
        return this.f3812s == 0 ? new C1005c(-2, -1) : new C1005c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: J */
    public RecyclerView.C1035r mo5078J(Context context, AttributeSet attributeSet) {
        return new C1005c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: K */
    public RecyclerView.C1035r mo5079K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1005c((ViewGroup.MarginLayoutParams) layoutParams) : new C1005c(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo5080O0(View view, int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        int iM5574O;
        int i11;
        int iM5574O2;
        View view2;
        View view3;
        View view4;
        int i12;
        int i13;
        int i14;
        RecyclerView.C1041x c1041x2 = c1041x;
        RecyclerView.C1015b0 c1015b1 = c1015b0;
        View viewM5558G = m5558G(view);
        View view5 = null;
        if (viewM5558G == null) {
            return null;
        }
        C1005c c1005c = (C1005c) viewM5558G.getLayoutParams();
        int i15 = c1005c.f3798e;
        int i16 = c1005c.f3799f + i15;
        if (super.mo5080O0(view, i10, c1041x, c1015b0) == null) {
            return null;
        }
        if ((m5171W1(i10) == 1) != this.f3817x) {
            iM5574O2 = m5574O() - 1;
            iM5574O = -1;
            i11 = -1;
        } else {
            iM5574O = m5574O();
            i11 = 1;
            iM5574O2 = 0;
        }
        boolean z10 = this.f3812s == 1 && m5195r2();
        int iM5117m3 = m5117m3(c1041x2, c1015b1, iM5574O2);
        int i17 = -1;
        int i18 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i19 = iM5574O2;
        View view6 = null;
        while (i19 != iM5574O) {
            int iM5117m4 = m5117m3(c1041x2, c1015b1, i19);
            View viewM5573N = m5573N(i19);
            if (viewM5573N == viewM5558G) {
                break;
            }
            if (!viewM5573N.hasFocusable() || iM5117m4 == iM5117m3) {
                C1005c c1005c2 = (C1005c) viewM5573N.getLayoutParams();
                int i20 = c1005c2.f3798e;
                view2 = viewM5558G;
                int i21 = c1005c2.f3799f + i20;
                if (viewM5573N.hasFocusable() && i20 == i15 && i21 == i16) {
                    return viewM5573N;
                }
                if (!(viewM5573N.hasFocusable() && view5 == null) && (viewM5573N.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i21, i16) - Math.max(i20, i15);
                    if (!viewM5573N.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i12 = iMin;
                            if (m5551D0(viewM5573N, false, true)) {
                                i13 = iMin2;
                                if (iMin3 > i13) {
                                    i14 = i18;
                                } else if (iMin3 == i13) {
                                    i14 = i18;
                                    if (z10 == (i20 > i14)) {
                                    }
                                    iMin = i12;
                                    view5 = view3;
                                    i19 += i11;
                                    c1041x2 = c1041x;
                                    c1015b1 = c1015b0;
                                    viewM5558G = view2;
                                } else {
                                    i14 = i18;
                                }
                                if (viewM5573N.hasFocusable()) {
                                    i18 = i14;
                                    iMin2 = i13;
                                    i17 = c1005c2.f3798e;
                                    view6 = view4;
                                    view5 = viewM5573N;
                                    iMin = Math.min(i21, i16) - Math.max(i20, i15);
                                } else {
                                    int i22 = c1005c2.f3798e;
                                    iMin2 = Math.min(i21, i16) - Math.max(i20, i15);
                                    view6 = viewM5573N;
                                    i18 = i22;
                                    iMin = i12;
                                    view5 = view3;
                                }
                                i19 += i11;
                                c1041x2 = c1041x;
                                c1015b1 = c1015b0;
                                viewM5558G = view2;
                            }
                            i18 = i14;
                            iMin2 = i13;
                            view6 = view4;
                            iMin = i12;
                            view5 = view3;
                            i19 += i11;
                            c1041x2 = c1041x;
                            c1015b1 = c1015b0;
                            viewM5558G = view2;
                        }
                        i14 = i18;
                        i13 = iMin2;
                        i18 = i14;
                        iMin2 = i13;
                        view6 = view4;
                        iMin = i12;
                        view5 = view3;
                        i19 += i11;
                        c1041x2 = c1041x;
                        c1015b1 = c1015b0;
                        viewM5558G = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i12 = iMin;
                i14 = i18;
                i13 = iMin2;
                if (viewM5573N.hasFocusable()) {
                    i18 = i14;
                    iMin2 = i13;
                    i17 = c1005c2.f3798e;
                    view6 = view4;
                    view5 = viewM5573N;
                    iMin = Math.min(i21, i16) - Math.max(i20, i15);
                } else {
                    int i23 = c1005c2.f3798e;
                    iMin2 = Math.min(i21, i16) - Math.max(i20, i15);
                    view6 = viewM5573N;
                    i18 = i23;
                    iMin = i12;
                    view5 = view3;
                }
                i19 += i11;
                c1041x2 = c1041x;
                c1015b1 = c1015b0;
                viewM5558G = view2;
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewM5558G;
                view3 = view5;
            }
            view4 = view6;
            i12 = iMin;
            i14 = i18;
            i13 = iMin2;
            i18 = i14;
            iMin2 = i13;
            view6 = view4;
            iMin = i12;
            view5 = view3;
            i19 += i11;
            c1041x2 = c1041x;
            c1015b1 = c1015b0;
            viewM5558G = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m5081P2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f3789L[i11];
            C1005c c1005c = (C1005c) view.getLayoutParams();
            int iM5120o3 = m5120o3(c1041x, c1015b0, m5613l0(view));
            c1005c.f3799f = iM5120o3;
            c1005c.f3798e = i14;
            i14 += iM5120o3;
            i11 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Q1 */
    public boolean mo5082Q1() {
        return this.f3807D == null && !this.f3786I;
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m5083Q2() {
        int iM5574O = m5574O();
        for (int i10 = 0; i10 < iM5574O; i10++) {
            C1005c c1005c = (C1005c) m5573N(i10).getLayoutParams();
            int iM5649b = c1005c.m5649b();
            this.f3790M.put(iM5649b, c1005c.m5137g());
            this.f3791N.put(iM5649b, c1005c.m5136f());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: R0 */
    public void mo5084R0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull C13017p c13017p) {
        super.mo5084R0(c1041x, c1015b0, c13017p);
        c13017p.m48408l0(GridView.class.getName());
        RecyclerView.AbstractC1025h abstractC1025h = this.f4020b.f3907m;
        if (abstractC1025h == null || abstractC1025h.mo5473e() <= 1) {
            return;
        }
        c13017p.m48388b(C13017p.a.f46062V);
    }

    /* JADX INFO: renamed from: R2 */
    public final void m5085R2(int i10) {
        this.f3788K = m5071S2(this.f3788K, this.f3787J, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: S */
    public int mo5086S(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (this.f3812s == 1) {
            return Math.min(this.f3787J, m5595e());
        }
        if (c1015b0.m5392b() < 1) {
            return 0;
        }
        return m5117m3(c1041x, c1015b0, c1015b0.m5392b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: S1 */
    public void mo5087S1(RecyclerView.C1015b0 c1015b0, LinearLayoutManager.C1010c c1010c, RecyclerView.AbstractC1034q.c cVar) {
        int iMo5135f = this.f3787J;
        for (int i10 = 0; i10 < this.f3787J && c1010c.m5219c(c1015b0) && iMo5135f > 0; i10++) {
            int i11 = c1010c.f3835d;
            cVar.mo5647a(i11, Math.max(0, c1010c.f3838g));
            iMo5135f -= this.f3792O.mo5135f(i11);
            c1010c.f3835d += c1010c.f3836e;
        }
    }

    /* JADX INFO: renamed from: T2 */
    public final void m5088T2() {
        this.f3790M.clear();
        this.f3791N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: U0 */
    public void mo5089U0(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, View view, C13017p c13017p) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1005c)) {
            super.m5582T0(view, c13017p);
            return;
        }
        C1005c c1005c = (C1005c) layoutParams;
        int iM5117m3 = m5117m3(c1041x, c1015b0, c1005c.m5649b());
        if (this.f3812s == 0) {
            c13017p.m48414o0(C13017p.g.m48455b(c1005c.m5136f(), c1005c.m5137g(), iM5117m3, 1, false, false));
        } else {
            c13017p.m48414o0(C13017p.g.m48455b(iM5117m3, 1, c1005c.m5136f(), c1005c.m5137g(), false, false));
        }
    }

    /* JADX INFO: renamed from: U2 */
    public final int m5090U2(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() != 0 && c1015b0.m5392b() != 0) {
            m5173Y1();
            boolean zM5196s2 = m5196s2();
            View viewM5178c2 = m5178c2(!zM5196s2, true);
            View viewM5176b2 = m5176b2(!zM5196s2, true);
            if (viewM5178c2 != null && viewM5176b2 != null) {
                int iM5139b = this.f3792O.m5139b(m5613l0(viewM5178c2), this.f3787J);
                int iM5139b2 = this.f3792O.m5139b(m5613l0(viewM5176b2), this.f3787J);
                int iMax = this.f3817x ? Math.max(0, ((this.f3792O.m5139b(c1015b0.m5392b() - 1, this.f3787J) + 1) - Math.max(iM5139b, iM5139b2)) - 1) : Math.max(0, Math.min(iM5139b, iM5139b2));
                if (zM5196s2) {
                    return Math.round((iMax * (Math.abs(this.f3814u.mo6007d(viewM5176b2) - this.f3814u.mo6010g(viewM5178c2)) / ((this.f3792O.m5139b(m5613l0(viewM5176b2), this.f3787J) - this.f3792O.m5139b(m5613l0(viewM5178c2), this.f3787J)) + 1))) + (this.f3814u.mo6016m() - this.f3814u.mo6010g(viewM5178c2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: V2 */
    public final int m5091V2(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() != 0 && c1015b0.m5392b() != 0) {
            m5173Y1();
            View viewM5178c2 = m5178c2(!m5196s2(), true);
            View viewM5176b2 = m5176b2(!m5196s2(), true);
            if (viewM5178c2 != null && viewM5176b2 != null) {
                if (!m5196s2()) {
                    return this.f3792O.m5139b(c1015b0.m5392b() - 1, this.f3787J) + 1;
                }
                return (int) (((this.f3814u.mo6007d(viewM5176b2) - this.f3814u.mo6010g(viewM5178c2)) / ((this.f3792O.m5139b(m5613l0(viewM5176b2), this.f3787J) - this.f3792O.m5139b(m5613l0(viewM5178c2), this.f3787J)) + 1)) * (this.f3792O.m5139b(c1015b0.m5392b() - 1, this.f3787J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: W0 */
    public void mo5092W0(RecyclerView recyclerView, int i10, int i11) {
        this.f3792O.m5143h();
        this.f3792O.m5142g();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m5093W2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, LinearLayoutManager.C1008a c1008a, int i10) {
        boolean z10 = i10 == 1;
        int iM5118n3 = m5118n3(c1041x, c1015b0, c1008a.f3824b);
        if (z10) {
            while (iM5118n3 > 0) {
                int i11 = c1008a.f3824b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                c1008a.f3824b = i12;
                iM5118n3 = m5118n3(c1041x, c1015b0, i12);
            }
            return;
        }
        int iM5392b = c1015b0.m5392b() - 1;
        int i13 = c1008a.f3824b;
        while (i13 < iM5392b) {
            int i14 = i13 + 1;
            int iM5118n4 = m5118n3(c1041x, c1015b0, i14);
            if (iM5118n4 <= iM5118n3) {
                break;
            }
            i13 = i14;
            iM5118n3 = iM5118n4;
        }
        c1008a.f3824b = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: X0 */
    public void mo5094X0(RecyclerView recyclerView) {
        this.f3792O.m5143h();
        this.f3792O.m5142g();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m5095X2() {
        View[] viewArr = this.f3789L;
        if (viewArr == null || viewArr.length != this.f3787J) {
            this.f3789L = new View[this.f3787J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Y0 */
    public void mo5096Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f3792O.m5143h();
        this.f3792O.m5142g();
    }

    /* JADX INFO: renamed from: Y2 */
    public final View m5097Y2() {
        for (int i10 = 0; i10 < m5574O(); i10++) {
            View viewM5573N = m5573N(i10);
            Objects.requireNonNull(viewM5573N);
            if (C1003a.m5133a(viewM5573N)) {
                return m5573N(i10);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Z0 */
    public void mo5098Z0(RecyclerView recyclerView, int i10, int i11) {
        this.f3792O.m5143h();
        this.f3792O.m5142g();
    }

    /* JADX INFO: renamed from: Z2 */
    public int m5099Z2(int i10) {
        if (i10 < 0 || this.f3812s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < m5595e(); i11++) {
            for (Integer num : m5111i3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f3796S = iIntValue;
                this.f3797T = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a3 */
    public int m5100a3(int i10) {
        if (i10 < 0 || this.f3812s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < m5595e(); i11++) {
            for (Integer num : m5111i3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f3796S = iIntValue;
                this.f3797T = m5108f3(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: b1 */
    public void mo5101b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f3792O.m5143h();
        this.f3792O.m5142g();
    }

    /* JADX INFO: renamed from: b3 */
    public final int m5102b3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iM5110h3 = m5110h3(i13);
            int iM5108f3 = m5108f3(i13);
            if (iM5110h3 < 0 || iM5108f3 < 0) {
                break;
            }
            if (this.f3812s == 1) {
                if (iM5110h3 < i10 && m5109g3(i13).contains(Integer.valueOf(i11))) {
                    this.f3796S = iM5110h3;
                    return i13;
                }
            } else if (iM5110h3 < i10 && iM5108f3 == i11) {
                this.f3796S = ((Integer) Collections.max(m5111i3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: c1 */
    public void mo5103c1(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (c1015b0.m5395e()) {
            m5083Q2();
        }
        super.mo5103c1(c1041x, c1015b0);
        m5088T2();
    }

    /* JADX INFO: renamed from: c3 */
    public final int m5104c3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < m5595e(); i13++) {
            int iM5110h3 = m5110h3(i13);
            int iM5108f3 = m5108f3(i13);
            if (iM5110h3 < 0 || iM5108f3 < 0) {
                break;
            }
            if (this.f3812s == 1) {
                if (iM5110h3 > i10 && (iM5108f3 == i11 || m5109g3(i13).contains(Integer.valueOf(i11)))) {
                    this.f3796S = iM5110h3;
                    return i13;
                }
            } else if (iM5110h3 > i10 && iM5108f3 == i11) {
                this.f3796S = m5110h3(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: d1 */
    public void mo5105d1(RecyclerView.C1015b0 c1015b0) {
        View viewMo5154H;
        super.mo5105d1(c1015b0);
        this.f3786I = false;
        int i10 = this.f3795R;
        if (i10 == -1 || (viewMo5154H = mo5154H(i10)) == null) {
            return;
        }
        viewMo5154H.sendAccessibilityEvent(67108864);
        this.f3795R = -1;
    }

    /* JADX INFO: renamed from: d3 */
    public final int m5106d3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iM5110h3 = m5110h3(i13);
            int iM5108f3 = m5108f3(i13);
            if (iM5110h3 < 0 || iM5108f3 < 0) {
                break;
            }
            if (this.f3812s == 1) {
                if ((iM5110h3 == i10 && iM5108f3 < i11) || iM5110h3 < i10) {
                    this.f3796S = iM5110h3;
                    this.f3797T = iM5108f3;
                    return i13;
                }
            } else if (m5111i3(i13).contains(Integer.valueOf(i10)) && iM5108f3 < i11) {
                this.f3797T = iM5108f3;
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e3 */
    public final int m5107e3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < m5595e(); i13++) {
            int iM5110h3 = m5110h3(i13);
            int iM5108f3 = m5108f3(i13);
            if (iM5110h3 < 0 || iM5108f3 < 0) {
                break;
            }
            if (this.f3812s == 1) {
                if ((iM5110h3 == i10 && iM5108f3 > i11) || iM5110h3 > i10) {
                    this.f3796S = iM5110h3;
                    this.f3797T = iM5108f3;
                    return i13;
                }
            } else if (iM5108f3 > i11 && m5111i3(i13).contains(Integer.valueOf(i10))) {
                this.f3797T = iM5108f3;
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f3 */
    public final int m5108f3(int i10) {
        if (this.f3812s == 0) {
            RecyclerView recyclerView = this.f4020b;
            return m5117m3(recyclerView.f3887c, recyclerView.f3902j0, i10);
        }
        RecyclerView recyclerView2 = this.f4020b;
        return m5118n3(recyclerView2.f3887c, recyclerView2.f3902j0, i10);
    }

    /* JADX INFO: renamed from: g3 */
    public final Set<Integer> m5109g3(int i10) {
        return m5112j3(m5108f3(i10), i10);
    }

    /* JADX INFO: renamed from: h3 */
    public final int m5110h3(int i10) {
        if (this.f3812s == 1) {
            RecyclerView recyclerView = this.f4020b;
            return m5117m3(recyclerView.f3887c, recyclerView.f3902j0, i10);
        }
        RecyclerView recyclerView2 = this.f4020b;
        return m5118n3(recyclerView2.f3887c, recyclerView2.f3902j0, i10);
    }

    /* JADX INFO: renamed from: i3 */
    public final Set<Integer> m5111i3(int i10) {
        return m5112j3(m5110h3(i10), i10);
    }

    /* JADX INFO: renamed from: j3 */
    public final Set<Integer> m5112j3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f4020b;
        int iM5120o3 = m5120o3(recyclerView.f3887c, recyclerView.f3902j0, i11);
        for (int i12 = i10; i12 < i10 + iM5120o3; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: k2 */
    public View mo5113k2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10, boolean z11) {
        int i10;
        int iM5574O;
        int iM5574O2 = m5574O();
        int i11 = 1;
        if (z11) {
            iM5574O = m5574O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iM5574O2;
            iM5574O = 0;
        }
        int iM5392b = c1015b0.m5392b();
        m5173Y1();
        int iMo6016m = this.f3814u.mo6016m();
        int iMo6012i = this.f3814u.mo6012i();
        View view = null;
        View view2 = null;
        while (iM5574O != i10) {
            View viewM5573N = m5573N(iM5574O);
            int iM5613l0 = m5613l0(viewM5573N);
            if (iM5613l0 >= 0 && iM5613l0 < iM5392b && m5118n3(c1041x, c1015b0, iM5613l0) == 0) {
                if (((RecyclerView.C1035r) viewM5573N.getLayoutParams()).m5651d()) {
                    if (view2 == null) {
                        view2 = viewM5573N;
                    }
                } else {
                    if (this.f3814u.mo6010g(viewM5573N) < iMo6012i && this.f3814u.mo6007d(viewM5573N) >= iMo6016m) {
                        return viewM5573N;
                    }
                    if (view == null) {
                        view = viewM5573N;
                    }
                }
            }
            iM5574O += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: k3 */
    public int m5114k3(int i10, int i11) {
        if (this.f3812s != 1 || !m5195r2()) {
            int[] iArr = this.f3788K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f3788K;
        int i12 = this.f3787J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: l1 */
    public boolean mo5115l1(int i10, Bundle bundle) {
        RecyclerView.AbstractC1023f0 abstractC1023f0M5327m0;
        int iM5106d3;
        if (i10 != C13017p.a.f46062V.m48436b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.mo5115l1(i10, bundle);
            }
            int i11 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
            int i12 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
            if (i11 != -1 && i12 != -1) {
                int iMo5473e = this.f4020b.f3907m.mo5473e();
                int i13 = 0;
                while (true) {
                    if (i13 >= iMo5473e) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f4020b;
                    int iM5118n3 = m5118n3(recyclerView.f3887c, recyclerView.f3902j0, i13);
                    RecyclerView recyclerView2 = this.f4020b;
                    int iM5117m3 = m5117m3(recyclerView2.f3887c, recyclerView2.f3902j0, i13);
                    if (this.f3812s != 1) {
                        if (iM5118n3 == i11 && iM5117m3 == i12) {
                            break;
                        }
                        i13++;
                    } else {
                        if (iM5118n3 == i12 && iM5117m3 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    m5151D2(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View viewM5097Y2 = m5097Y2();
        if (viewM5097Y2 == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!f3785U.contains(Integer.valueOf(i14)) || (abstractC1023f0M5327m0 = this.f4020b.m5327m0(viewM5097Y2)) == null) {
            return false;
        }
        int iM5441j = abstractC1023f0M5327m0.m5441j();
        int iM5110h3 = m5110h3(iM5441j);
        int iM5108f3 = m5108f3(iM5441j);
        if (iM5110h3 >= 0 && iM5108f3 >= 0) {
            if (m5122q3(iM5441j)) {
                this.f3796S = iM5110h3;
                this.f3797T = iM5108f3;
            }
            int i15 = this.f3796S;
            if (i15 == -1) {
                i15 = iM5110h3;
            }
            int i16 = this.f3797T;
            if (i16 != -1) {
                iM5108f3 = i16;
            }
            if (i14 == 17) {
                iM5106d3 = m5106d3(i15, iM5108f3, iM5441j);
            } else if (i14 == 33) {
                iM5106d3 = m5102b3(i15, iM5108f3, iM5441j);
            } else if (i14 == 66) {
                iM5106d3 = m5107e3(i15, iM5108f3, iM5441j);
            } else {
                if (i14 != 130) {
                    return false;
                }
                iM5106d3 = m5104c3(i15, iM5108f3, iM5441j);
            }
            if (iM5106d3 == -1 && this.f3812s == 0) {
                if (i14 == 17) {
                    iM5106d3 = m5100a3(iM5110h3);
                } else if (i14 == 66) {
                    iM5106d3 = m5099Z2(iM5110h3);
                }
            }
            if (iM5106d3 != -1) {
                mo5149C1(iM5106d3);
                this.f3795R = iM5106d3;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l3 */
    public int m5116l3() {
        return this.f3787J;
    }

    /* JADX INFO: renamed from: m3 */
    public final int m5117m3(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, int i10) {
        if (!c1015b0.m5395e()) {
            return this.f3792O.m5139b(i10, this.f3787J);
        }
        int iM5698f = c1041x.m5698f(i10);
        if (iM5698f != -1) {
            return this.f3792O.m5139b(iM5698f, this.f3787J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    /* JADX INFO: renamed from: n3 */
    public final int m5118n3(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, int i10) {
        if (!c1015b0.m5395e()) {
            return this.f3792O.m5140c(i10, this.f3787J);
        }
        int i11 = this.f3791N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iM5698f = c1041x.m5698f(i10);
        if (iM5698f != -1) {
            return this.f3792O.m5140c(iM5698f, this.f3787J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: o0 */
    public int mo5119o0(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (this.f3812s == 0) {
            return Math.min(this.f3787J, m5595e());
        }
        if (c1015b0.m5392b() < 1) {
            return 0;
        }
        return m5117m3(c1041x, c1015b0, c1015b0.m5392b() - 1) + 1;
    }

    /* JADX INFO: renamed from: o3 */
    public final int m5120o3(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, int i10) {
        if (!c1015b0.m5395e()) {
            return this.f3792O.mo5135f(i10);
        }
        int i11 = this.f3790M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iM5698f = c1041x.m5698f(i10);
        if (iM5698f != -1) {
            return this.f3792O.mo5135f(iM5698f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m5121p3(float f10, int i10) {
        m5085R2(Math.max(Math.round(f10 * this.f3787J), i10));
    }

    /* JADX INFO: renamed from: q3 */
    public final boolean m5122q3(int i10) {
        return (m5111i3(i10).contains(Integer.valueOf(this.f3796S)) && m5109g3(i10).contains(Integer.valueOf(this.f3797T))) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: r */
    public boolean mo5123r(RecyclerView.C1035r c1035r) {
        return c1035r instanceof C1005c;
    }

    /* JADX INFO: renamed from: r3 */
    public final void m5124r3(View view, int i10, boolean z10) {
        int iM5543P;
        int iM5543P2;
        C1005c c1005c = (C1005c) view.getLayoutParams();
        Rect rect = c1005c.f4044b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1005c).topMargin + ((ViewGroup.MarginLayoutParams) c1005c).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1005c).leftMargin + ((ViewGroup.MarginLayoutParams) c1005c).rightMargin;
        int iM5114k3 = m5114k3(c1005c.f3798e, c1005c.f3799f);
        if (this.f3812s == 1) {
            iM5543P2 = RecyclerView.AbstractC1034q.m5543P(iM5114k3, i10, i12, ((ViewGroup.MarginLayoutParams) c1005c).width, false);
            iM5543P = RecyclerView.AbstractC1034q.m5543P(this.f3814u.mo6017n(), m5593c0(), i11, ((ViewGroup.MarginLayoutParams) c1005c).height, true);
        } else {
            int iM5543P3 = RecyclerView.AbstractC1034q.m5543P(iM5114k3, i10, i11, ((ViewGroup.MarginLayoutParams) c1005c).height, false);
            int iM5543P4 = RecyclerView.AbstractC1034q.m5543P(this.f3814u.mo6017n(), m5629t0(), i12, ((ViewGroup.MarginLayoutParams) c1005c).width, true);
            iM5543P = iM5543P3;
            iM5543P2 = iM5543P4;
        }
        m5125s3(view, iM5543P2, iM5543P, z10);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m5125s3(View view, int i10, int i11, boolean z10) {
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
        if (z10 ? m5572M1(view, i10, i11, c1035r) : m5567K1(view, i10, i11, c1035r)) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: t2 */
    public void mo5126t2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, LinearLayoutManager.C1010c c1010c, LinearLayoutManager.C1009b c1009b) {
        int i10;
        int i11;
        int iM5606i0;
        int iM5611k0;
        int iMo6009f;
        int iMo6009f2;
        int i12;
        int iM5543P;
        int iM5543P2;
        View viewM5220d;
        int iMo6015l = this.f3814u.mo6015l();
        boolean z10 = iMo6015l != 1073741824;
        int i13 = m5574O() > 0 ? this.f3788K[this.f3787J] : 0;
        if (z10) {
            m5128u3();
        }
        boolean z11 = c1010c.f3836e == 1;
        int iM5118n3 = this.f3787J;
        if (!z11) {
            iM5118n3 = m5118n3(c1041x, c1015b0, c1010c.f3835d) + m5120o3(c1041x, c1015b0, c1010c.f3835d);
        }
        int i14 = 0;
        while (i14 < this.f3787J && c1010c.m5219c(c1015b0) && iM5118n3 > 0) {
            int i15 = c1010c.f3835d;
            int iM5120o3 = m5120o3(c1041x, c1015b0, i15);
            if (iM5120o3 > this.f3787J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iM5120o3 + " spans but GridLayoutManager has only " + this.f3787J + " spans.");
            }
            iM5118n3 -= iM5120o3;
            if (iM5118n3 < 0 || (viewM5220d = c1010c.m5220d(c1041x)) == null) {
                break;
            }
            this.f3789L[i14] = viewM5220d;
            i14++;
        }
        if (i14 == 0) {
            c1009b.f3829b = true;
            return;
        }
        m5081P2(c1041x, c1015b0, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f3789L[i17];
            if (c1010c.f3843l == null) {
                if (z11) {
                    m5605i(view);
                } else {
                    m5607j(view, 0);
                }
            } else if (z11) {
                m5600g(view);
            } else {
                m5603h(view, 0);
            }
            m5619o(view, this.f3793P);
            m5124r3(view, iMo6015l, false);
            int iMo6008e = this.f3814u.mo6008e(view);
            if (iMo6008e > i16) {
                i16 = iMo6008e;
            }
            float fMo6009f = (this.f3814u.mo6009f(view) * 1.0f) / ((C1005c) view.getLayoutParams()).f3799f;
            if (fMo6009f > f10) {
                f10 = fMo6009f;
            }
        }
        if (z10) {
            m5121p3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f3789L[i18];
                m5124r3(view2, 1073741824, true);
                int iMo6008e2 = this.f3814u.mo6008e(view2);
                if (iMo6008e2 > i16) {
                    i16 = iMo6008e2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f3789L[i19];
            if (this.f3814u.mo6008e(view3) != i16) {
                C1005c c1005c = (C1005c) view3.getLayoutParams();
                Rect rect = c1005c.f4044b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1005c).topMargin + ((ViewGroup.MarginLayoutParams) c1005c).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1005c).leftMargin + ((ViewGroup.MarginLayoutParams) c1005c).rightMargin;
                int iM5114k3 = m5114k3(c1005c.f3798e, c1005c.f3799f);
                if (this.f3812s == 1) {
                    iM5543P2 = RecyclerView.AbstractC1034q.m5543P(iM5114k3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c1005c).width, false);
                    iM5543P = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iM5543P = RecyclerView.AbstractC1034q.m5543P(iM5114k3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c1005c).height, false);
                    iM5543P2 = iMakeMeasureSpec;
                }
                m5125s3(view3, iM5543P2, iM5543P, true);
            }
        }
        c1009b.f3828a = i16;
        if (this.f3812s == 1) {
            if (c1010c.f3837f == -1) {
                iMo6009f2 = c1010c.f3833b;
                i12 = iMo6009f2 - i16;
            } else {
                i12 = c1010c.f3833b;
                iMo6009f2 = i12 + i16;
            }
            iM5611k0 = i12;
            iMo6009f = 0;
            iM5606i0 = 0;
        } else {
            if (c1010c.f3837f == -1) {
                i11 = c1010c.f3833b;
                i10 = i11 - i16;
            } else {
                i10 = c1010c.f3833b;
                i11 = i10 + i16;
            }
            iM5606i0 = i10;
            iM5611k0 = 0;
            iMo6009f = i11;
            iMo6009f2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f3789L[i22];
            C1005c c1005c2 = (C1005c) view4.getLayoutParams();
            if (this.f3812s != 1) {
                iM5611k0 = this.f3788K[c1005c2.f3798e] + m5611k0();
                iMo6009f2 = this.f3814u.mo6009f(view4) + iM5611k0;
            } else if (m5195r2()) {
                iMo6009f = m5606i0() + this.f3788K[this.f3787J - c1005c2.f3798e];
                iM5606i0 = iMo6009f - this.f3814u.mo6009f(view4);
            } else {
                iM5606i0 = this.f3788K[c1005c2.f3798e] + m5606i0();
                iMo6009f = this.f3814u.mo6009f(view4) + iM5606i0;
            }
            int i23 = iMo6009f2;
            int i24 = iM5611k0;
            int i25 = iMo6009f;
            int i26 = iM5606i0;
            m5553E0(view4, i26, i24, i25, i23);
            iMo6009f2 = i23;
            iM5606i0 = i26;
            iMo6009f = i25;
            iM5611k0 = i24;
            if (c1005c2.m5651d() || c1005c2.m5650c()) {
                c1009b.f3830c = true;
            }
            c1009b.f3831d = view4.hasFocusable() | c1009b.f3831d;
        }
        Arrays.fill(this.f3789L, (Object) null);
    }

    /* JADX INFO: renamed from: t3 */
    public void m5127t3(int i10) {
        if (i10 == this.f3787J) {
            return;
        }
        this.f3786I = true;
        if (i10 >= 1) {
            this.f3787J = i10;
            this.f3792O.m5143h();
            m5639y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m5128u3() {
        int iM5592b0;
        int iM5611k0;
        if (m5194q2() == 1) {
            iM5592b0 = m5627s0() - m5608j0();
            iM5611k0 = m5606i0();
        } else {
            iM5592b0 = m5592b0() - m5604h0();
            iM5611k0 = m5611k0();
        }
        m5085R2(iM5592b0 - iM5611k0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: v2 */
    public void mo5129v2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, LinearLayoutManager.C1008a c1008a, int i10) {
        super.mo5129v2(c1041x, c1015b0, c1008a, i10);
        m5128u3();
        if (c1015b0.m5392b() > 0 && !c1015b0.m5395e()) {
            m5093W2(c1041x, c1015b0, c1008a, i10);
        }
        m5095X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: w */
    public int mo5130w(RecyclerView.C1015b0 c1015b0) {
        return this.f3794Q ? m5090U2(c1015b0) : super.mo5130w(c1015b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: x */
    public int mo5131x(RecyclerView.C1015b0 c1015b0) {
        return this.f3794Q ? m5091V2(c1015b0) : super.mo5131x(c1015b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: z */
    public int mo5132z(RecyclerView.C1015b0 c1015b0) {
        return this.f3794Q ? m5090U2(c1015b0) : super.mo5132z(c1015b0);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static class C1005c extends RecyclerView.C1035r {

        /* JADX INFO: renamed from: e */
        public int f3798e;

        /* JADX INFO: renamed from: f */
        public int f3799f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1005c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3798e = -1;
            this.f3799f = 0;
        }

        /* JADX INFO: renamed from: f */
        public int m5136f() {
            return this.f3798e;
        }

        /* JADX INFO: renamed from: g */
        public int m5137g() {
            return this.f3799f;
        }

        public C1005c(int i10, int i11) {
            super(i10, i11);
            this.f3798e = -1;
            this.f3799f = 0;
        }

        public C1005c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3798e = -1;
            this.f3799f = 0;
        }

        public C1005c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3798e = -1;
            this.f3799f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f3786I = false;
        this.f3787J = -1;
        this.f3790M = new SparseIntArray();
        this.f3791N = new SparseIntArray();
        this.f3792O = new C1004b();
        this.f3793P = new Rect();
        this.f3795R = -1;
        this.f3796S = -1;
        this.f3797T = -1;
        m5127t3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f3786I = false;
        this.f3787J = -1;
        this.f3790M = new SparseIntArray();
        this.f3791N = new SparseIntArray();
        this.f3792O = new C1004b();
        this.f3793P = new Rect();
        this.f3795R = -1;
        this.f3796S = -1;
        this.f3797T = -1;
        m5127t3(i10);
    }
}
