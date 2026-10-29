package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.HashMap;
import p038c2.C1511d;
import p038c2.C1512e;
import p038c2.C1513f;
import p038c2.C1515h;
import p038c2.C1518k;
import p038c2.C1519l;
import p065d2.C4408b;
import p142g2.AbstractC5967b;
import p142g2.AbstractC5971f;
import p142g2.C5966a;
import p142g2.C5969d;
import p142g2.C5970e;
import p591z1.C13683e;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: y */
    public static C5970e f1930y;

    /* JADX INFO: renamed from: a */
    public SparseArray<View> f1931a;

    /* JADX INFO: renamed from: b */
    public ArrayList<AbstractC0517b> f1932b;

    /* JADX INFO: renamed from: c */
    public C1513f f1933c;

    /* JADX INFO: renamed from: d */
    public int f1934d;

    /* JADX INFO: renamed from: e */
    public int f1935e;

    /* JADX INFO: renamed from: f */
    public int f1936f;

    /* JADX INFO: renamed from: g */
    public int f1937g;

    /* JADX INFO: renamed from: h */
    public boolean f1938h;

    /* JADX INFO: renamed from: i */
    public int f1939i;

    /* JADX INFO: renamed from: j */
    public C0518c f1940j;

    /* JADX INFO: renamed from: k */
    public C5966a f1941k;

    /* JADX INFO: renamed from: l */
    public int f1942l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Integer> f1943m;

    /* JADX INFO: renamed from: n */
    public int f1944n;

    /* JADX INFO: renamed from: o */
    public int f1945o;

    /* JADX INFO: renamed from: p */
    public int f1946p;

    /* JADX INFO: renamed from: q */
    public int f1947q;

    /* JADX INFO: renamed from: r */
    public int f1948r;

    /* JADX INFO: renamed from: s */
    public int f1949s;

    /* JADX INFO: renamed from: t */
    public SparseArray<C1512e> f1950t;

    /* JADX INFO: renamed from: u */
    public C0514c f1951u;

    /* JADX INFO: renamed from: v */
    public int f1952v;

    /* JADX INFO: renamed from: w */
    public int f1953w;

    /* JADX INFO: renamed from: x */
    public ArrayList<InterfaceC0515d> f1954x;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C0512a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1955a;

        static {
            int[] iArr = new int[C1512e.b.values().length];
            f1955a = iArr;
            try {
                iArr[C1512e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1955a[C1512e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1955a[C1512e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1955a[C1512e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    public class C0514c implements C4408b.b {

        /* JADX INFO: renamed from: a */
        public ConstraintLayout f2032a;

        /* JADX INFO: renamed from: b */
        public int f2033b;

        /* JADX INFO: renamed from: c */
        public int f2034c;

        /* JADX INFO: renamed from: d */
        public int f2035d;

        /* JADX INFO: renamed from: e */
        public int f2036e;

        /* JADX INFO: renamed from: f */
        public int f2037f;

        /* JADX INFO: renamed from: g */
        public int f2038g;

        public C0514c(ConstraintLayout constraintLayout) {
            this.f2032a = constraintLayout;
        }

        @Override // p065d2.C4408b.b
        /* JADX INFO: renamed from: a */
        public final void mo2466a() {
            int childCount = this.f2032a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2032a.getChildAt(i10);
                if (childAt instanceof C0520e) {
                    ((C0520e) childAt).m2548a(this.f2032a);
                }
            }
            int size = this.f2032a.f1932b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0517b) this.f2032a.f1932b.get(i11)).m2488p(this.f2032a);
                }
            }
        }

        @Override // p065d2.C4408b.b
        @SuppressLint({"WrongCall"})
        /* JADX INFO: renamed from: b */
        public final void mo2467b(C1512e c1512e, C4408b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (c1512e == null) {
                return;
            }
            if (c1512e.m7745V() == 8 && !c1512e.m7778j0()) {
                aVar.f18309e = 0;
                aVar.f18310f = 0;
                aVar.f18311g = 0;
                return;
            }
            if (c1512e.m7723K() == null) {
                return;
            }
            ConstraintLayout.m2443b(ConstraintLayout.this);
            C1512e.b bVar = aVar.f18305a;
            C1512e.b bVar2 = aVar.f18306b;
            int i11 = aVar.f18307c;
            int i12 = aVar.f18308d;
            int i13 = this.f2033b + this.f2034c;
            int i14 = this.f2035d;
            View view = (View) c1512e.m7802s();
            int[] iArr = C0512a.f1955a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2037f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2037f, i14 + c1512e.m7705B(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2037f, i14, -2);
                boolean z10 = c1512e.f5913w == 1;
                int i16 = aVar.f18314j;
                if (i16 == C4408b.a.f18303l || i16 == C4408b.a.f18304m) {
                    boolean z11 = view.getMeasuredHeight() == c1512e.m7812x();
                    if (aVar.f18314j == C4408b.a.f18304m || !z10 || ((z10 && z11) || (view instanceof C0520e) || c1512e.mo7668n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1512e.m7747W(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2038g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2038g, i13 + c1512e.m7743U(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2038g, i13, -2);
                boolean z12 = c1512e.f5915x == 1;
                int i18 = aVar.f18314j;
                if (i18 == C4408b.a.f18303l || i18 == C4408b.a.f18304m) {
                    boolean z13 = view.getMeasuredWidth() == c1512e.m7747W();
                    if (aVar.f18314j == C4408b.a.f18304m || !z12 || ((z12 && z13) || (view instanceof C0520e) || c1512e.mo7669o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1512e.m7812x(), 1073741824);
                    }
                }
            }
            C1513f c1513f = (C1513f) c1512e.m7723K();
            if (c1513f != null && C1518k.m7926b(ConstraintLayout.this.f1939i, 256) && view.getMeasuredWidth() == c1512e.m7747W() && view.getMeasuredWidth() < c1513f.m7747W() && view.getMeasuredHeight() == c1512e.m7812x() && view.getMeasuredHeight() < c1513f.m7812x() && view.getBaseline() == c1512e.m7793p() && !c1512e.m7787m0() && m2469d(c1512e.m7707C(), iMakeMeasureSpec, c1512e.m7747W()) && m2469d(c1512e.m7709D(), iMakeMeasureSpec2, c1512e.m7812x())) {
                aVar.f18309e = c1512e.m7747W();
                aVar.f18310f = c1512e.m7812x();
                aVar.f18311g = c1512e.m7793p();
                return;
            }
            C1512e.b bVar3 = C1512e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            C1512e.b bVar4 = C1512e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == C1512e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == C1512e.b.FIXED;
            boolean z18 = z14 && c1512e.f5876d0 > 0.0f;
            boolean z19 = z15 && c1512e.f5876d0 > 0.0f;
            if (view == null) {
                return;
            }
            C0513b c0513b = (C0513b) view.getLayoutParams();
            int i19 = aVar.f18314j;
            if (i19 != C4408b.a.f18303l && i19 != C4408b.a.f18304m && z14 && c1512e.f5913w == 0 && z15 && c1512e.f5915x == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof AbstractC5971f) && (c1512e instanceof C1519l)) {
                    ((AbstractC5971f) view).mo2441t((C1519l) c1512e, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c1512e.m7748W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = c1512e.f5919z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = c1512e.f5833A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = c1512e.f5837C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = c1512e.f5839D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                boolean z21 = z16;
                if (!C1518k.m7926b(ConstraintLayout.this.f1939i, 1)) {
                    if (z18 && z21) {
                        iMax = (int) ((iMax2 * c1512e.f5876d0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / c1512e.f5876d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c1512e.m7748W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10;
            aVar.f18313i = (iMax == aVar.f18307c && iMax2 == aVar.f18308d) ? false : true;
            if (c0513b.f1995g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && c1512e.m7793p() != baseline) {
                aVar.f18313i = true;
            }
            aVar.f18309e = iMax;
            aVar.f18310f = iMax2;
            aVar.f18312h = z22;
            aVar.f18311g = baseline;
            ConstraintLayout.m2443b(ConstraintLayout.this);
        }

        /* JADX INFO: renamed from: c */
        public void m2468c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2033b = i12;
            this.f2034c = i13;
            this.f2035d = i14;
            this.f2036e = i15;
            this.f2037f = i10;
            this.f2038g = i11;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m2469d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$d */
    public interface InterfaceC0515d {
        /* JADX INFO: renamed from: a */
        boolean m2470a(int i10, int i11, int i12, View view, C0513b c0513b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1931a = new SparseArray<>();
        this.f1932b = new ArrayList<>(4);
        this.f1933c = new C1513f();
        this.f1934d = 0;
        this.f1935e = 0;
        this.f1936f = Integer.MAX_VALUE;
        this.f1937g = Integer.MAX_VALUE;
        this.f1938h = true;
        this.f1939i = InputDeviceCompat.SOURCE_KEYBOARD;
        this.f1940j = null;
        this.f1941k = null;
        this.f1942l = -1;
        this.f1943m = new HashMap<>();
        this.f1944n = -1;
        this.f1945o = -1;
        this.f1946p = -1;
        this.f1947q = -1;
        this.f1948r = 0;
        this.f1949s = 0;
        this.f1950t = new SparseArray<>();
        this.f1951u = new C0514c(this);
        this.f1952v = 0;
        this.f1953w = 0;
        m2446s(attributeSet, 0, 0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13683e m2443b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C5970e getSharedValues() {
        if (f1930y == null) {
            f1930y = new C5970e();
        }
        return f1930y;
    }

    /* JADX INFO: renamed from: s */
    private void m2446s(AttributeSet attributeSet, int i10, int i11) {
        this.f1933c.m7708C0(this);
        this.f1933c.m7842X1(this.f1951u);
        this.f1931a.put(getId(), this);
        this.f1940j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5969d.f22955V0, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == C5969d.f23041f1) {
                    this.f1934d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1934d);
                } else if (index == C5969d.f23050g1) {
                    this.f1935e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1935e);
                } else if (index == C5969d.f23023d1) {
                    this.f1936f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1936f);
                } else if (index == C5969d.f23032e1) {
                    this.f1937g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1937g);
                } else if (index == C5969d.f22901O2) {
                    this.f1939i = typedArrayObtainStyledAttributes.getInt(index, this.f1939i);
                } else if (index == C5969d.f22860J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2460v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1941k = null;
                        }
                    }
                } else if (index == C5969d.f23113n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0518c c0518c = new C0518c();
                        this.f1940j = c0518c;
                        c0518c.m2523t(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1940j = null;
                    }
                    this.f1942l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1933c.m7843Y1(this.f1939i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 c2.e$b) = (r2v3 c2.e$b), (r2v0 c2.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    public void m2447A(C1513f c1513f, int i10, int i11, int i12, int i13) {
        C1512e.b bVar;
        C0514c c0514c = this.f1951u;
        int i14 = c0514c.f2036e;
        int i15 = c0514c.f2035d;
        C1512e.b bVar2 = C1512e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = C1512e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1934d);
            }
        } else if (i10 == 0) {
            bVar = C1512e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f1934d) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f1936f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = C1512e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1935e);
            }
        } else if (i12 == 0) {
            bVar2 = C1512e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1935e);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f1937g - i14, i13);
        }
        if (i11 != c1513f.m7747W() || i13 != c1513f.m7812x()) {
            c1513f.m7835P1();
        }
        c1513f.m7790n1(0);
        c1513f.m7792o1(0);
        c1513f.m7752Y0(this.f1936f - i15);
        c1513f.m7750X0(this.f1937g - i14);
        c1513f.m7758b1(0);
        c1513f.m7756a1(0);
        c1513f.m7736Q0(bVar);
        c1513f.m7785l1(i11);
        c1513f.m7773h1(bVar2);
        c1513f.m7728M0(i13);
        c1513f.m7758b1(this.f1934d - i15);
        c1513f.m7756a1(this.f1935e - i14);
    }

    /* JADX INFO: renamed from: B */
    public final void m2448B(C1512e c1512e, C0513b c0513b, SparseArray<C1512e> sparseArray, int i10, C1511d.a aVar) {
        View view = this.f1931a.get(i10);
        C1512e c1512e2 = sparseArray.get(i10);
        if (c1512e2 == null || view == null || !(view.getLayoutParams() instanceof C0513b)) {
            return;
        }
        c0513b.f1995g0 = true;
        C1511d.a aVar2 = C1511d.a.BASELINE;
        if (aVar == aVar2) {
            C0513b c0513b2 = (C0513b) view.getLayoutParams();
            c0513b2.f1995g0 = true;
            c0513b2.f2025v0.m7726L0(true);
        }
        c1512e.mo7791o(aVar2).m7682b(c1512e2.mo7791o(aVar), c0513b.f1959D, c0513b.f1958C, true);
        c1512e.m7726L0(true);
        c1512e.mo7791o(C1511d.a.TOP).m7697q();
        c1512e.mo7791o(C1511d.a.BOTTOM).m7697q();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2449C() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            m2463y();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0513b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0517b> arrayList = this.f1932b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1932b.get(i10).m2489q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX INFO: renamed from: e */
    public void m2450e(boolean z10, View view, C1512e c1512e, C0513b c0513b, SparseArray<C1512e> sparseArray) {
        C1512e c1512e2;
        C1512e c1512e3;
        C1512e c1512e4;
        C1512e c1512e5;
        C0513b c0513b2;
        C1512e c1512e6;
        float f10;
        int i10;
        c0513b.m2465a();
        c0513b.f2027w0 = false;
        c1512e.m7782k1(view.getVisibility());
        if (c0513b.f2001j0) {
            c1512e.m7744U0(true);
            c1512e.m7782k1(8);
        }
        c1512e.m7708C0(view);
        if (view instanceof AbstractC0517b) {
            ((AbstractC0517b) view).mo2440n(c1512e, this.f1933c.m7837R1());
        }
        if (c0513b.f1997h0) {
            C1515h c1515h = (C1515h) c1512e;
            int i11 = c0513b.f2019s0;
            int i12 = c0513b.f2021t0;
            float f11 = c0513b.f2023u0;
            if (f11 != -1.0f) {
                c1515h.m7910A1(f11);
                return;
            } else if (i11 != -1) {
                c1515h.m7918y1(i11);
                return;
            } else {
                if (i12 != -1) {
                    c1515h.m7919z1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = c0513b.f2005l0;
        int i14 = c0513b.f2007m0;
        int i15 = c0513b.f2009n0;
        int i16 = c0513b.f2011o0;
        int i17 = c0513b.f2013p0;
        int i18 = c0513b.f2015q0;
        float f12 = c0513b.f2017r0;
        int i19 = c0513b.f2012p;
        if (i19 != -1) {
            C1512e c1512e7 = sparseArray.get(i19);
            if (c1512e7 != null) {
                c1512e.m7783l(c1512e7, c0513b.f2016r, c0513b.f2014q);
            }
            c1512e6 = c1512e;
            c0513b2 = c0513b;
        } else {
            if (i13 != -1) {
                C1512e c1512e8 = sparseArray.get(i13);
                if (c1512e8 != null) {
                    C1511d.a aVar = C1511d.a.LEFT;
                    c1512e.m7765e0(aVar, c1512e8, aVar, ((ViewGroup.MarginLayoutParams) c0513b).leftMargin, i17);
                }
            } else if (i14 != -1 && (c1512e2 = sparseArray.get(i14)) != null) {
                c1512e.m7765e0(C1511d.a.LEFT, c1512e2, C1511d.a.RIGHT, ((ViewGroup.MarginLayoutParams) c0513b).leftMargin, i17);
            }
            if (i15 != -1) {
                C1512e c1512e9 = sparseArray.get(i15);
                if (c1512e9 != null) {
                    c1512e.m7765e0(C1511d.a.RIGHT, c1512e9, C1511d.a.LEFT, ((ViewGroup.MarginLayoutParams) c0513b).rightMargin, i18);
                }
            } else if (i16 != -1 && (c1512e3 = sparseArray.get(i16)) != null) {
                C1511d.a aVar2 = C1511d.a.RIGHT;
                c1512e.m7765e0(aVar2, c1512e3, aVar2, ((ViewGroup.MarginLayoutParams) c0513b).rightMargin, i18);
            }
            int i20 = c0513b.f1998i;
            if (i20 != -1) {
                C1512e c1512e10 = sparseArray.get(i20);
                if (c1512e10 != null) {
                    C1511d.a aVar3 = C1511d.a.TOP;
                    c1512e.m7765e0(aVar3, c1512e10, aVar3, ((ViewGroup.MarginLayoutParams) c0513b).topMargin, c0513b.f2028x);
                }
            } else {
                int i21 = c0513b.f2000j;
                if (i21 != -1 && (c1512e4 = sparseArray.get(i21)) != null) {
                    c1512e.m7765e0(C1511d.a.TOP, c1512e4, C1511d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) c0513b).topMargin, c0513b.f2028x);
                }
            }
            int i22 = c0513b.f2002k;
            if (i22 != -1) {
                C1512e c1512e11 = sparseArray.get(i22);
                if (c1512e11 != null) {
                    c1512e.m7765e0(C1511d.a.BOTTOM, c1512e11, C1511d.a.TOP, ((ViewGroup.MarginLayoutParams) c0513b).bottomMargin, c0513b.f2030z);
                }
            } else {
                int i23 = c0513b.f2004l;
                if (i23 != -1 && (c1512e5 = sparseArray.get(i23)) != null) {
                    C1511d.a aVar4 = C1511d.a.BOTTOM;
                    c1512e.m7765e0(aVar4, c1512e5, aVar4, ((ViewGroup.MarginLayoutParams) c0513b).bottomMargin, c0513b.f2030z);
                }
            }
            int i24 = c0513b.f2006m;
            if (i24 != -1) {
                c0513b2 = c0513b;
                m2448B(c1512e, c0513b2, sparseArray, i24, C1511d.a.BASELINE);
            } else {
                c0513b2 = c0513b;
                int i25 = c0513b2.f2008n;
                if (i25 != -1) {
                    m2448B(c1512e, c0513b2, sparseArray, i25, C1511d.a.TOP);
                } else {
                    int i26 = c0513b2.f2010o;
                    if (i26 != -1) {
                        m2448B(c1512e, c0513b2, sparseArray, i26, C1511d.a.BOTTOM);
                        c1512e6 = c1512e;
                    }
                    if (f12 >= 0.0f) {
                        c1512e6.m7730N0(f12);
                    }
                    f10 = c0513b2.f1963H;
                    if (f10 >= 0.0f) {
                        c1512e6.m7766e1(f10);
                    }
                }
            }
            c1512e6 = c1512e;
            if (f12 >= 0.0f) {
                c1512e6.m7730N0(f12);
            }
            f10 = c0513b2.f1963H;
            if (f10 >= 0.0f) {
                c1512e6.m7766e1(f10);
            }
        }
        if (z10 && ((i10 = c0513b2.f1979X) != -1 || c0513b2.f1980Y != -1)) {
            c1512e6.m7760c1(i10, c0513b2.f1980Y);
        }
        if (c0513b2.f1991e0) {
            c1512e6.m7736Q0(C1512e.b.FIXED);
            c1512e6.m7785l1(((ViewGroup.MarginLayoutParams) c0513b2).width);
            if (((ViewGroup.MarginLayoutParams) c0513b2).width == -2) {
                c1512e6.m7736Q0(C1512e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c0513b2).width == -1) {
            if (c0513b2.f1983a0) {
                c1512e6.m7736Q0(C1512e.b.MATCH_CONSTRAINT);
            } else {
                c1512e6.m7736Q0(C1512e.b.MATCH_PARENT);
            }
            c1512e6.mo7791o(C1511d.a.LEFT).f5819g = ((ViewGroup.MarginLayoutParams) c0513b2).leftMargin;
            c1512e6.mo7791o(C1511d.a.RIGHT).f5819g = ((ViewGroup.MarginLayoutParams) c0513b2).rightMargin;
        } else {
            c1512e6.m7736Q0(C1512e.b.MATCH_CONSTRAINT);
            c1512e6.m7785l1(0);
        }
        if (c0513b2.f1993f0) {
            c1512e6.m7773h1(C1512e.b.FIXED);
            c1512e6.m7728M0(((ViewGroup.MarginLayoutParams) c0513b2).height);
            if (((ViewGroup.MarginLayoutParams) c0513b2).height == -2) {
                c1512e6.m7773h1(C1512e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c0513b2).height == -1) {
            if (c0513b2.f1985b0) {
                c1512e6.m7773h1(C1512e.b.MATCH_CONSTRAINT);
            } else {
                c1512e6.m7773h1(C1512e.b.MATCH_PARENT);
            }
            c1512e6.mo7791o(C1511d.a.TOP).f5819g = ((ViewGroup.MarginLayoutParams) c0513b2).topMargin;
            c1512e6.mo7791o(C1511d.a.BOTTOM).f5819g = ((ViewGroup.MarginLayoutParams) c0513b2).bottomMargin;
        } else {
            c1512e6.m7773h1(C1512e.b.MATCH_CONSTRAINT);
            c1512e6.m7728M0(0);
        }
        c1512e6.m7712E0(c0513b2.f1964I);
        c1512e6.m7740S0(c0513b2.f1967L);
        c1512e6.m7779j1(c0513b2.f1968M);
        c1512e6.m7732O0(c0513b2.f1969N);
        c1512e6.m7769f1(c0513b2.f1970O);
        c1512e6.m7788m1(c0513b2.f1989d0);
        c1512e6.m7738R0(c0513b2.f1971P, c0513b2.f1973R, c0513b2.f1975T, c0513b2.f1977V);
        c1512e6.m7776i1(c0513b2.f1972Q, c0513b2.f1974S, c0513b2.f1976U, c0513b2.f1978W);
    }

    /* JADX INFO: renamed from: f */
    public boolean m2451f(int i10, int i11) {
        if (this.f1954x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ArrayList<InterfaceC0515d> arrayList = this.f1954x;
        int size3 = arrayList.size();
        boolean zM2470a = false;
        int i12 = 0;
        while (i12 < size3) {
            int i13 = i12 + 1;
            InterfaceC0515d interfaceC0515d = arrayList.get(i12);
            ArrayList<C1512e> arrayListM7949s1 = this.f1933c.m7949s1();
            int size4 = arrayListM7949s1.size();
            for (int i14 = 0; i14 < size4; i14++) {
                View view = (View) arrayListM7949s1.get(i14).m7802s();
                zM2470a |= interfaceC0515d.m2470a(size, size2, view.getId(), view, (C0513b) view.getLayoutParams());
            }
            i12 = i13;
        }
        return zM2470a;
    }

    @Override // android.view.View
    public void forceLayout() {
        m2459u();
        super.forceLayout();
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0513b generateDefaultLayoutParams() {
        return new C0513b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f1937g;
    }

    public int getMaxWidth() {
        return this.f1936f;
    }

    public int getMinHeight() {
        return this.f1935e;
    }

    public int getMinWidth() {
        return this.f1934d;
    }

    public int getOptimizationLevel() {
        return this.f1933c.m7831L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1933c.f5897o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1933c.f5897o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1933c.f5897o = "parent";
            }
        }
        if (this.f1933c.m7804t() == null) {
            C1513f c1513f = this.f1933c;
            c1513f.m7710D0(c1513f.f5897o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1933c.m7804t());
        }
        ArrayList<C1512e> arrayListM7949s1 = this.f1933c.m7949s1();
        int size = arrayListM7949s1.size();
        int i10 = 0;
        while (i10 < size) {
            C1512e c1512e = arrayListM7949s1.get(i10);
            i10++;
            C1512e c1512e2 = c1512e;
            View view = (View) c1512e2.m7802s();
            if (view != null) {
                if (c1512e2.f5897o == null && (id2 = view.getId()) != -1) {
                    c1512e2.f5897o = getContext().getResources().getResourceEntryName(id2);
                }
                if (c1512e2.m7804t() == null) {
                    c1512e2.m7710D0(c1512e2.f5897o);
                    Log.v("ConstraintLayout", " setDebugName " + c1512e2.m7804t());
                }
            }
        }
        this.f1933c.mo7731O(sb2);
        return sb2.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0513b generateLayoutParams(AttributeSet attributeSet) {
        return new C0513b(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: l */
    public Object m2454l(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f1943m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1943m.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C0513b c0513b = (C0513b) childAt.getLayoutParams();
            C1512e c1512e = c0513b.f2025v0;
            if ((childAt.getVisibility() != 8 || c0513b.f1997h0 || c0513b.f1999i0 || c0513b.f2003k0 || zIsInEditMode) && !c0513b.f2001j0) {
                int iM7749X = c1512e.m7749X();
                int iM7751Y = c1512e.m7751Y();
                int iM7747W = c1512e.m7747W() + iM7749X;
                int iM7812x = c1512e.m7812x() + iM7751Y;
                childAt.layout(iM7749X, iM7751Y, iM7747W, iM7812x);
                if ((childAt instanceof C0520e) && (content = ((C0520e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM7749X, iM7751Y, iM7747W, iM7812x);
                }
            }
        }
        int size = this.f1932b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1932b.get(i15).m2487o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean zM2451f = this.f1938h | m2451f(i10, i11);
        this.f1938h = zM2451f;
        if (!zM2451f) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f1938h = true;
                    break;
                }
            }
        }
        this.f1952v = i10;
        this.f1953w = i11;
        this.f1933c.m7845a2(m2458t());
        if (this.f1938h) {
            this.f1938h = false;
            if (m2449C()) {
                this.f1933c.m7847c2();
            }
        }
        this.f1933c.m7829J1(null);
        m2462x(this.f1933c, this.f1939i, i10, i11);
        m2461w(i10, i11, this.f1933c.m7747W(), this.f1933c.m7812x(), this.f1933c.m7838S1(), this.f1933c.m7836Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1512e c1512eM2457r = m2457r(view);
        if ((view instanceof Guideline) && !(c1512eM2457r instanceof C1515h)) {
            C0513b c0513b = (C0513b) view.getLayoutParams();
            C1515h c1515h = new C1515h();
            c0513b.f2025v0 = c1515h;
            c0513b.f1997h0 = true;
            c1515h.m7911B1(c0513b.f1981Z);
        }
        if (view instanceof AbstractC0517b) {
            AbstractC0517b abstractC0517b = (AbstractC0517b) view;
            abstractC0517b.m2491s();
            ((C0513b) view.getLayoutParams()).f1999i0 = true;
            if (!this.f1932b.contains(abstractC0517b)) {
                this.f1932b.add(abstractC0517b);
            }
        }
        this.f1931a.put(view.getId(), view);
        this.f1938h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1931a.remove(view.getId());
        this.f1933c.m7950u1(m2457r(view));
        this.f1932b.remove(view);
        this.f1938h = true;
    }

    /* JADX INFO: renamed from: p */
    public final C1512e m2455p(int i10) {
        if (i10 == 0) {
            return this.f1933c;
        }
        View viewFindViewById = this.f1931a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1933c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C0513b) viewFindViewById.getLayoutParams()).f2025v0;
    }

    /* JADX INFO: renamed from: q */
    public View m2456q(int i10) {
        return this.f1931a.get(i10);
    }

    /* JADX INFO: renamed from: r */
    public final C1512e m2457r(View view) {
        if (view == this) {
            return this.f1933c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0513b) {
            return ((C0513b) view.getLayoutParams()).f2025v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0513b) {
            return ((C0513b) view.getLayoutParams()).f2025v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m2459u();
        super.requestLayout();
    }

    public void setConstraintSet(C0518c c0518c) {
        this.f1940j = c0518c;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1931a.remove(getId());
        super.setId(i10);
        this.f1931a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1937g) {
            return;
        }
        this.f1937g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1936f) {
            return;
        }
        this.f1936f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1935e) {
            return;
        }
        this.f1935e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1934d) {
            return;
        }
        this.f1934d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC5967b abstractC5967b) {
        C5966a c5966a = this.f1941k;
        if (c5966a != null) {
            c5966a.m26770c(abstractC5967b);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1939i = i10;
        this.f1933c.m7843Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m2458t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: u */
    public final void m2459u() {
        this.f1938h = true;
        this.f1944n = -1;
        this.f1945o = -1;
        this.f1946p = -1;
        this.f1947q = -1;
        this.f1948r = 0;
        this.f1949s = 0;
    }

    /* JADX INFO: renamed from: v */
    public void mo2460v(int i10) {
        this.f1941k = new C5966a(getContext(), this, i10);
    }

    /* JADX INFO: renamed from: w */
    public void m2461w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        C0514c c0514c = this.f1951u;
        int i14 = c0514c.f2036e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + c0514c.f2035d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0);
        int i15 = iResolveSizeAndState & ViewCompat.MEASURED_SIZE_MASK;
        int i16 = iResolveSizeAndState2 & ViewCompat.MEASURED_SIZE_MASK;
        int iMin = Math.min(this.f1936f, i15);
        int iMin2 = Math.min(this.f1937g, i16);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1944n = iMin;
        this.f1945o = iMin2;
    }

    /* JADX INFO: renamed from: x */
    public void m2462x(C1513f c1513f, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f1951u.m2468c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (m2458t()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            m2447A(c1513f, mode, i15, mode2, i16);
            c1513f.m7839T1(i10, mode, i15, mode2, i16, this.f1944n, this.f1945o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        m2447A(c1513f, mode, i17, mode2, i18);
        c1513f.m7839T1(i10, mode, i17, mode2, i18, this.f1944n, this.f1945o, i13, iMax);
    }

    /* JADX INFO: renamed from: y */
    public final void m2463y() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C1512e c1512eM2457r = m2457r(getChildAt(i10));
            if (c1512eM2457r != null) {
                c1512eM2457r.mo7805t0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m2464z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m2455p(childAt.getId()).m7710D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1942l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f1942l && (childAt2 instanceof C0519d)) {
                    this.f1940j = ((C0519d) childAt2).getConstraintSet();
                }
            }
        }
        C0518c c0518c = this.f1940j;
        if (c0518c != null) {
            c0518c.m2507d(this, true);
        }
        this.f1933c.m7951v1();
        int size = this.f1932b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f1932b.get(i13).m2490r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof C0520e) {
                ((C0520e) childAt3).m2549b(this);
            }
        }
        this.f1950t.clear();
        this.f1950t.put(0, this.f1933c);
        this.f1950t.put(getId(), this.f1933c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f1950t.put(childAt4.getId(), m2457r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            C1512e c1512eM2457r2 = m2457r(childAt5);
            if (c1512eM2457r2 != null) {
                C0513b c0513b = (C0513b) childAt5.getLayoutParams();
                this.f1933c.m7948a(c1512eM2457r2);
                m2450e(zIsInEditMode, childAt5, c1512eM2457r2, c0513b, this.f1950t);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2464z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1943m == null) {
                this.f1943m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1943m.put(strSubstring, (Integer) obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0513b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1931a = new SparseArray<>();
        this.f1932b = new ArrayList<>(4);
        this.f1933c = new C1513f();
        this.f1934d = 0;
        this.f1935e = 0;
        this.f1936f = Integer.MAX_VALUE;
        this.f1937g = Integer.MAX_VALUE;
        this.f1938h = true;
        this.f1939i = InputDeviceCompat.SOURCE_KEYBOARD;
        this.f1940j = null;
        this.f1941k = null;
        this.f1942l = -1;
        this.f1943m = new HashMap<>();
        this.f1944n = -1;
        this.f1945o = -1;
        this.f1946p = -1;
        this.f1947q = -1;
        this.f1948r = 0;
        this.f1949s = 0;
        this.f1950t = new SparseArray<>();
        this.f1951u = new C0514c(this);
        this.f1952v = 0;
        this.f1953w = 0;
        m2446s(attributeSet, i10, 0);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0513b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public int f1956A;

        /* JADX INFO: renamed from: B */
        public int f1957B;

        /* JADX INFO: renamed from: C */
        public int f1958C;

        /* JADX INFO: renamed from: D */
        public int f1959D;

        /* JADX INFO: renamed from: E */
        public boolean f1960E;

        /* JADX INFO: renamed from: F */
        public boolean f1961F;

        /* JADX INFO: renamed from: G */
        public float f1962G;

        /* JADX INFO: renamed from: H */
        public float f1963H;

        /* JADX INFO: renamed from: I */
        public String f1964I;

        /* JADX INFO: renamed from: J */
        public float f1965J;

        /* JADX INFO: renamed from: K */
        public int f1966K;

        /* JADX INFO: renamed from: L */
        public float f1967L;

        /* JADX INFO: renamed from: M */
        public float f1968M;

        /* JADX INFO: renamed from: N */
        public int f1969N;

        /* JADX INFO: renamed from: O */
        public int f1970O;

        /* JADX INFO: renamed from: P */
        public int f1971P;

        /* JADX INFO: renamed from: Q */
        public int f1972Q;

        /* JADX INFO: renamed from: R */
        public int f1973R;

        /* JADX INFO: renamed from: S */
        public int f1974S;

        /* JADX INFO: renamed from: T */
        public int f1975T;

        /* JADX INFO: renamed from: U */
        public int f1976U;

        /* JADX INFO: renamed from: V */
        public float f1977V;

        /* JADX INFO: renamed from: W */
        public float f1978W;

        /* JADX INFO: renamed from: X */
        public int f1979X;

        /* JADX INFO: renamed from: Y */
        public int f1980Y;

        /* JADX INFO: renamed from: Z */
        public int f1981Z;

        /* JADX INFO: renamed from: a */
        public int f1982a;

        /* JADX INFO: renamed from: a0 */
        public boolean f1983a0;

        /* JADX INFO: renamed from: b */
        public int f1984b;

        /* JADX INFO: renamed from: b0 */
        public boolean f1985b0;

        /* JADX INFO: renamed from: c */
        public float f1986c;

        /* JADX INFO: renamed from: c0 */
        public String f1987c0;

        /* JADX INFO: renamed from: d */
        public boolean f1988d;

        /* JADX INFO: renamed from: d0 */
        public int f1989d0;

        /* JADX INFO: renamed from: e */
        public int f1990e;

        /* JADX INFO: renamed from: e0 */
        public boolean f1991e0;

        /* JADX INFO: renamed from: f */
        public int f1992f;

        /* JADX INFO: renamed from: f0 */
        public boolean f1993f0;

        /* JADX INFO: renamed from: g */
        public int f1994g;

        /* JADX INFO: renamed from: g0 */
        public boolean f1995g0;

        /* JADX INFO: renamed from: h */
        public int f1996h;

        /* JADX INFO: renamed from: h0 */
        public boolean f1997h0;

        /* JADX INFO: renamed from: i */
        public int f1998i;

        /* JADX INFO: renamed from: i0 */
        public boolean f1999i0;

        /* JADX INFO: renamed from: j */
        public int f2000j;

        /* JADX INFO: renamed from: j0 */
        public boolean f2001j0;

        /* JADX INFO: renamed from: k */
        public int f2002k;

        /* JADX INFO: renamed from: k0 */
        public boolean f2003k0;

        /* JADX INFO: renamed from: l */
        public int f2004l;

        /* JADX INFO: renamed from: l0 */
        public int f2005l0;

        /* JADX INFO: renamed from: m */
        public int f2006m;

        /* JADX INFO: renamed from: m0 */
        public int f2007m0;

        /* JADX INFO: renamed from: n */
        public int f2008n;

        /* JADX INFO: renamed from: n0 */
        public int f2009n0;

        /* JADX INFO: renamed from: o */
        public int f2010o;

        /* JADX INFO: renamed from: o0 */
        public int f2011o0;

        /* JADX INFO: renamed from: p */
        public int f2012p;

        /* JADX INFO: renamed from: p0 */
        public int f2013p0;

        /* JADX INFO: renamed from: q */
        public int f2014q;

        /* JADX INFO: renamed from: q0 */
        public int f2015q0;

        /* JADX INFO: renamed from: r */
        public float f2016r;

        /* JADX INFO: renamed from: r0 */
        public float f2017r0;

        /* JADX INFO: renamed from: s */
        public int f2018s;

        /* JADX INFO: renamed from: s0 */
        public int f2019s0;

        /* JADX INFO: renamed from: t */
        public int f2020t;

        /* JADX INFO: renamed from: t0 */
        public int f2021t0;

        /* JADX INFO: renamed from: u */
        public int f2022u;

        /* JADX INFO: renamed from: u0 */
        public float f2023u0;

        /* JADX INFO: renamed from: v */
        public int f2024v;

        /* JADX INFO: renamed from: v0 */
        public C1512e f2025v0;

        /* JADX INFO: renamed from: w */
        public int f2026w;

        /* JADX INFO: renamed from: w0 */
        public boolean f2027w0;

        /* JADX INFO: renamed from: x */
        public int f2028x;

        /* JADX INFO: renamed from: y */
        public int f2029y;

        /* JADX INFO: renamed from: z */
        public int f2030z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f2031a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2031a = sparseIntArray;
                sparseIntArray.append(C5969d.f23213z2, 64);
                sparseIntArray.append(C5969d.f23015c2, 65);
                sparseIntArray.append(C5969d.f23096l2, 8);
                sparseIntArray.append(C5969d.f23105m2, 9);
                sparseIntArray.append(C5969d.f23123o2, 10);
                sparseIntArray.append(C5969d.f23132p2, 11);
                sparseIntArray.append(C5969d.f23181v2, 12);
                sparseIntArray.append(C5969d.f23173u2, 13);
                sparseIntArray.append(C5969d.f22932S1, 14);
                sparseIntArray.append(C5969d.f22924R1, 15);
                sparseIntArray.append(C5969d.f22892N1, 16);
                sparseIntArray.append(C5969d.f22908P1, 52);
                sparseIntArray.append(C5969d.f22900O1, 53);
                sparseIntArray.append(C5969d.f22940T1, 2);
                sparseIntArray.append(C5969d.f22956V1, 3);
                sparseIntArray.append(C5969d.f22948U1, 4);
                sparseIntArray.append(C5969d.f22821E2, 49);
                sparseIntArray.append(C5969d.f22829F2, 50);
                sparseIntArray.append(C5969d.f22988Z1, 5);
                sparseIntArray.append(C5969d.f22997a2, 6);
                sparseIntArray.append(C5969d.f23006b2, 7);
                sparseIntArray.append(C5969d.f22852I1, 67);
                sparseIntArray.append(C5969d.f22963W0, 1);
                sparseIntArray.append(C5969d.f23141q2, 17);
                sparseIntArray.append(C5969d.f23149r2, 18);
                sparseIntArray.append(C5969d.f22980Y1, 19);
                sparseIntArray.append(C5969d.f22972X1, 20);
                sparseIntArray.append(C5969d.f22861J2, 21);
                sparseIntArray.append(C5969d.f22885M2, 22);
                sparseIntArray.append(C5969d.f22869K2, 23);
                sparseIntArray.append(C5969d.f22845H2, 24);
                sparseIntArray.append(C5969d.f22877L2, 25);
                sparseIntArray.append(C5969d.f22853I2, 26);
                sparseIntArray.append(C5969d.f22837G2, 55);
                sparseIntArray.append(C5969d.f22893N2, 54);
                sparseIntArray.append(C5969d.f23060h2, 29);
                sparseIntArray.append(C5969d.f23189w2, 30);
                sparseIntArray.append(C5969d.f22964W1, 44);
                sparseIntArray.append(C5969d.f23078j2, 45);
                sparseIntArray.append(C5969d.f23205y2, 46);
                sparseIntArray.append(C5969d.f23069i2, 47);
                sparseIntArray.append(C5969d.f23197x2, 48);
                sparseIntArray.append(C5969d.f22876L1, 27);
                sparseIntArray.append(C5969d.f22868K1, 28);
                sparseIntArray.append(C5969d.f22789A2, 31);
                sparseIntArray.append(C5969d.f23024d2, 32);
                sparseIntArray.append(C5969d.f22805C2, 33);
                sparseIntArray.append(C5969d.f22797B2, 34);
                sparseIntArray.append(C5969d.f22813D2, 35);
                sparseIntArray.append(C5969d.f23042f2, 36);
                sparseIntArray.append(C5969d.f23033e2, 37);
                sparseIntArray.append(C5969d.f23051g2, 38);
                sparseIntArray.append(C5969d.f23087k2, 39);
                sparseIntArray.append(C5969d.f23165t2, 40);
                sparseIntArray.append(C5969d.f23114n2, 41);
                sparseIntArray.append(C5969d.f22916Q1, 42);
                sparseIntArray.append(C5969d.f22884M1, 43);
                sparseIntArray.append(C5969d.f23157s2, 51);
                sparseIntArray.append(C5969d.f22909P2, 66);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @SuppressLint({"ClassVerificationFailure"})
        public C0513b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1982a = -1;
            this.f1984b = -1;
            this.f1986c = -1.0f;
            this.f1988d = true;
            this.f1990e = -1;
            this.f1992f = -1;
            this.f1994g = -1;
            this.f1996h = -1;
            this.f1998i = -1;
            this.f2000j = -1;
            this.f2002k = -1;
            this.f2004l = -1;
            this.f2006m = -1;
            this.f2008n = -1;
            this.f2010o = -1;
            this.f2012p = -1;
            this.f2014q = 0;
            this.f2016r = 0.0f;
            this.f2018s = -1;
            this.f2020t = -1;
            this.f2022u = -1;
            this.f2024v = -1;
            this.f2026w = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2028x = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2029y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2030z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1956A = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1957B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1958C = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1959D = 0;
            this.f1960E = true;
            this.f1961F = true;
            this.f1962G = 0.5f;
            this.f1963H = 0.5f;
            this.f1964I = null;
            this.f1965J = 0.0f;
            this.f1966K = 1;
            this.f1967L = -1.0f;
            this.f1968M = -1.0f;
            this.f1969N = 0;
            this.f1970O = 0;
            this.f1971P = 0;
            this.f1972Q = 0;
            this.f1973R = 0;
            this.f1974S = 0;
            this.f1975T = 0;
            this.f1976U = 0;
            this.f1977V = 1.0f;
            this.f1978W = 1.0f;
            this.f1979X = -1;
            this.f1980Y = -1;
            this.f1981Z = -1;
            this.f1983a0 = false;
            this.f1985b0 = false;
            this.f1987c0 = null;
            this.f1989d0 = 0;
            this.f1991e0 = true;
            this.f1993f0 = true;
            this.f1995g0 = false;
            this.f1997h0 = false;
            this.f1999i0 = false;
            this.f2001j0 = false;
            this.f2003k0 = false;
            this.f2005l0 = -1;
            this.f2007m0 = -1;
            this.f2009n0 = -1;
            this.f2011o0 = -1;
            this.f2013p0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2015q0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2017r0 = 0.5f;
            this.f2025v0 = new C1512e();
            this.f2027w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof C0513b) {
                C0513b c0513b = (C0513b) layoutParams;
                this.f1982a = c0513b.f1982a;
                this.f1984b = c0513b.f1984b;
                this.f1986c = c0513b.f1986c;
                this.f1988d = c0513b.f1988d;
                this.f1990e = c0513b.f1990e;
                this.f1992f = c0513b.f1992f;
                this.f1994g = c0513b.f1994g;
                this.f1996h = c0513b.f1996h;
                this.f1998i = c0513b.f1998i;
                this.f2000j = c0513b.f2000j;
                this.f2002k = c0513b.f2002k;
                this.f2004l = c0513b.f2004l;
                this.f2006m = c0513b.f2006m;
                this.f2008n = c0513b.f2008n;
                this.f2010o = c0513b.f2010o;
                this.f2012p = c0513b.f2012p;
                this.f2014q = c0513b.f2014q;
                this.f2016r = c0513b.f2016r;
                this.f2018s = c0513b.f2018s;
                this.f2020t = c0513b.f2020t;
                this.f2022u = c0513b.f2022u;
                this.f2024v = c0513b.f2024v;
                this.f2026w = c0513b.f2026w;
                this.f2028x = c0513b.f2028x;
                this.f2029y = c0513b.f2029y;
                this.f2030z = c0513b.f2030z;
                this.f1956A = c0513b.f1956A;
                this.f1957B = c0513b.f1957B;
                this.f1958C = c0513b.f1958C;
                this.f1959D = c0513b.f1959D;
                this.f1962G = c0513b.f1962G;
                this.f1963H = c0513b.f1963H;
                this.f1964I = c0513b.f1964I;
                this.f1965J = c0513b.f1965J;
                this.f1966K = c0513b.f1966K;
                this.f1967L = c0513b.f1967L;
                this.f1968M = c0513b.f1968M;
                this.f1969N = c0513b.f1969N;
                this.f1970O = c0513b.f1970O;
                this.f1983a0 = c0513b.f1983a0;
                this.f1985b0 = c0513b.f1985b0;
                this.f1971P = c0513b.f1971P;
                this.f1972Q = c0513b.f1972Q;
                this.f1973R = c0513b.f1973R;
                this.f1975T = c0513b.f1975T;
                this.f1974S = c0513b.f1974S;
                this.f1976U = c0513b.f1976U;
                this.f1977V = c0513b.f1977V;
                this.f1978W = c0513b.f1978W;
                this.f1979X = c0513b.f1979X;
                this.f1980Y = c0513b.f1980Y;
                this.f1981Z = c0513b.f1981Z;
                this.f1991e0 = c0513b.f1991e0;
                this.f1993f0 = c0513b.f1993f0;
                this.f1995g0 = c0513b.f1995g0;
                this.f1997h0 = c0513b.f1997h0;
                this.f2005l0 = c0513b.f2005l0;
                this.f2007m0 = c0513b.f2007m0;
                this.f2009n0 = c0513b.f2009n0;
                this.f2011o0 = c0513b.f2011o0;
                this.f2013p0 = c0513b.f2013p0;
                this.f2015q0 = c0513b.f2015q0;
                this.f2017r0 = c0513b.f2017r0;
                this.f1987c0 = c0513b.f1987c0;
                this.f1989d0 = c0513b.f1989d0;
                this.f2025v0 = c0513b.f2025v0;
                this.f1960E = c0513b.f1960E;
                this.f1961F = c0513b.f1961F;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2465a() {
            this.f1997h0 = false;
            this.f1991e0 = true;
            this.f1993f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1983a0) {
                this.f1991e0 = false;
                if (this.f1971P == 0) {
                    this.f1971P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1985b0) {
                this.f1993f0 = false;
                if (this.f1972Q == 0) {
                    this.f1972Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1991e0 = false;
                if (i10 == 0 && this.f1971P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1983a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1993f0 = false;
                if (i11 == 0 && this.f1972Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1985b0 = true;
                }
            }
            if (this.f1986c == -1.0f && this.f1982a == -1 && this.f1984b == -1) {
                return;
            }
            this.f1997h0 = true;
            this.f1991e0 = true;
            this.f1993f0 = true;
            if (!(this.f2025v0 instanceof C1515h)) {
                this.f2025v0 = new C1515h();
            }
            ((C1515h) this.f2025v0).m7911B1(this.f1981Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f2009n0 = -1;
            this.f2011o0 = -1;
            this.f2005l0 = -1;
            this.f2007m0 = -1;
            this.f2013p0 = this.f2026w;
            this.f2015q0 = this.f2029y;
            float f10 = this.f1962G;
            this.f2017r0 = f10;
            int i17 = this.f1982a;
            this.f2019s0 = i17;
            int i18 = this.f1984b;
            this.f2021t0 = i18;
            float f11 = this.f1986c;
            this.f2023u0 = f11;
            if (z11) {
                int i19 = this.f2018s;
                if (i19 != -1) {
                    this.f2009n0 = i19;
                } else {
                    int i20 = this.f2020t;
                    if (i20 != -1) {
                        this.f2011o0 = i20;
                    } else {
                        i11 = this.f2022u;
                        if (i11 != -1) {
                            this.f2007m0 = i11;
                            z10 = true;
                        }
                        i12 = this.f2024v;
                        if (i12 != -1) {
                            this.f2005l0 = i12;
                            z10 = true;
                        }
                        i13 = this.f1956A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f2015q0 = i13;
                        }
                        i14 = this.f1957B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f2013p0 = i14;
                        }
                        if (z10) {
                            this.f2017r0 = 1.0f - f10;
                        }
                        if (this.f1997h0 && this.f1981Z == 1 && this.f1988d) {
                            if (f11 != -1.0f) {
                                this.f2023u0 = 1.0f - f11;
                                this.f2019s0 = -1;
                                this.f2021t0 = -1;
                            } else if (i17 != -1) {
                                this.f2021t0 = i17;
                                this.f2019s0 = -1;
                                this.f2023u0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f2019s0 = i18;
                                this.f2021t0 = -1;
                                this.f2023u0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f2022u;
                if (i11 != -1) {
                    this.f2007m0 = i11;
                    z10 = true;
                }
                i12 = this.f2024v;
                if (i12 != -1) {
                    this.f2005l0 = i12;
                    z10 = true;
                }
                i13 = this.f1956A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f2015q0 = i13;
                }
                i14 = this.f1957B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f2013p0 = i14;
                }
                if (z10) {
                    this.f2017r0 = 1.0f - f10;
                }
                if (this.f1997h0) {
                    if (f11 != -1.0f) {
                        this.f2023u0 = 1.0f - f11;
                        this.f2019s0 = -1;
                        this.f2021t0 = -1;
                    } else if (i17 != -1) {
                        this.f2021t0 = i17;
                        this.f2019s0 = -1;
                        this.f2023u0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f2019s0 = i18;
                        this.f2021t0 = -1;
                        this.f2023u0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f2018s;
                if (i21 != -1) {
                    this.f2007m0 = i21;
                }
                int i22 = this.f2020t;
                if (i22 != -1) {
                    this.f2005l0 = i22;
                }
                int i23 = this.f2022u;
                if (i23 != -1) {
                    this.f2009n0 = i23;
                }
                int i24 = this.f2024v;
                if (i24 != -1) {
                    this.f2011o0 = i24;
                }
                int i25 = this.f1956A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f2013p0 = i25;
                }
                int i26 = this.f1957B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f2015q0 = i26;
                }
            }
            if (this.f2022u == -1 && this.f2024v == -1 && this.f2020t == -1 && this.f2018s == -1) {
                int i27 = this.f1994g;
                if (i27 != -1) {
                    this.f2009n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f1996h;
                    if (i28 != -1) {
                        this.f2011o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f1990e;
                if (i29 != -1) {
                    this.f2005l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f1992f;
                if (i30 != -1) {
                    this.f2007m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public C0513b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1982a = -1;
            this.f1984b = -1;
            this.f1986c = -1.0f;
            this.f1988d = true;
            this.f1990e = -1;
            this.f1992f = -1;
            this.f1994g = -1;
            this.f1996h = -1;
            this.f1998i = -1;
            this.f2000j = -1;
            this.f2002k = -1;
            this.f2004l = -1;
            this.f2006m = -1;
            this.f2008n = -1;
            this.f2010o = -1;
            this.f2012p = -1;
            this.f2014q = 0;
            this.f2016r = 0.0f;
            this.f2018s = -1;
            this.f2020t = -1;
            this.f2022u = -1;
            this.f2024v = -1;
            this.f2026w = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2028x = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2029y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2030z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1956A = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1957B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1958C = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1959D = 0;
            this.f1960E = true;
            this.f1961F = true;
            this.f1962G = 0.5f;
            this.f1963H = 0.5f;
            this.f1964I = null;
            this.f1965J = 0.0f;
            this.f1966K = 1;
            this.f1967L = -1.0f;
            this.f1968M = -1.0f;
            this.f1969N = 0;
            this.f1970O = 0;
            this.f1971P = 0;
            this.f1972Q = 0;
            this.f1973R = 0;
            this.f1974S = 0;
            this.f1975T = 0;
            this.f1976U = 0;
            this.f1977V = 1.0f;
            this.f1978W = 1.0f;
            this.f1979X = -1;
            this.f1980Y = -1;
            this.f1981Z = -1;
            this.f1983a0 = false;
            this.f1985b0 = false;
            this.f1987c0 = null;
            this.f1989d0 = 0;
            this.f1991e0 = true;
            this.f1993f0 = true;
            this.f1995g0 = false;
            this.f1997h0 = false;
            this.f1999i0 = false;
            this.f2001j0 = false;
            this.f2003k0 = false;
            this.f2005l0 = -1;
            this.f2007m0 = -1;
            this.f2009n0 = -1;
            this.f2011o0 = -1;
            this.f2013p0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2015q0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2017r0 = 0.5f;
            this.f2025v0 = new C1512e();
            this.f2027w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5969d.f22955V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f2031a.get(index);
                switch (i11) {
                    case 1:
                        this.f1981Z = typedArrayObtainStyledAttributes.getInt(index, this.f1981Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2012p);
                        this.f2012p = resourceId;
                        if (resourceId == -1) {
                            this.f2012p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f2014q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2014q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f2016r) % 360.0f;
                        this.f2016r = f10;
                        if (f10 < 0.0f) {
                            this.f2016r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f1982a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1982a);
                        break;
                    case 6:
                        this.f1984b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1984b);
                        break;
                    case 7:
                        this.f1986c = typedArrayObtainStyledAttributes.getFloat(index, this.f1986c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1990e);
                        this.f1990e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1990e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1992f);
                        this.f1992f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1992f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1994g);
                        this.f1994g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1994g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1996h);
                        this.f1996h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1996h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1998i);
                        this.f1998i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1998i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2000j);
                        this.f2000j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2000j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2002k);
                        this.f2002k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2002k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2004l);
                        this.f2004l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2004l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2006m);
                        this.f2006m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2006m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2018s);
                        this.f2018s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2018s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2020t);
                        this.f2020t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2020t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2022u);
                        this.f2022u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2022u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2024v);
                        this.f2024v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2024v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f2026w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2026w);
                        break;
                    case 22:
                        this.f2028x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2028x);
                        break;
                    case 23:
                        this.f2029y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2029y);
                        break;
                    case 24:
                        this.f2030z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2030z);
                        break;
                    case 25:
                        this.f1956A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1956A);
                        break;
                    case 26:
                        this.f1957B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1957B);
                        break;
                    case 27:
                        this.f1983a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1983a0);
                        break;
                    case 28:
                        this.f1985b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1985b0);
                        break;
                    case 29:
                        this.f1962G = typedArrayObtainStyledAttributes.getFloat(index, this.f1962G);
                        break;
                    case 30:
                        this.f1963H = typedArrayObtainStyledAttributes.getFloat(index, this.f1963H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f1971P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f1972Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f1973R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1973R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1973R) == -2) {
                                this.f1973R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f1975T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1975T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1975T) == -2) {
                                this.f1975T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f1977V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f1977V));
                        this.f1971P = 2;
                        break;
                    case 36:
                        try {
                            this.f1974S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1974S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1974S) == -2) {
                                this.f1974S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f1976U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1976U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1976U) == -2) {
                                this.f1976U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f1978W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f1978W));
                        this.f1972Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                C0518c.m2498y(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f1967L = typedArrayObtainStyledAttributes.getFloat(index, this.f1967L);
                                break;
                            case 46:
                                this.f1968M = typedArrayObtainStyledAttributes.getFloat(index, this.f1968M);
                                break;
                            case 47:
                                this.f1969N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1970O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1979X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1979X);
                                break;
                            case 50:
                                this.f1980Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1980Y);
                                break;
                            case 51:
                                this.f1987c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2008n);
                                this.f2008n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2008n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2010o);
                                this.f2010o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2010o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f1959D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1959D);
                                break;
                            case 55:
                                this.f1958C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1958C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        C0518c.m2496w(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f1960E = true;
                                        break;
                                    case 65:
                                        C0518c.m2496w(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f1961F = true;
                                        break;
                                    case 66:
                                        this.f1989d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1989d0);
                                        break;
                                    case 67:
                                        this.f1988d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1988d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m2465a();
        }

        public C0513b(int i10, int i11) {
            super(i10, i11);
            this.f1982a = -1;
            this.f1984b = -1;
            this.f1986c = -1.0f;
            this.f1988d = true;
            this.f1990e = -1;
            this.f1992f = -1;
            this.f1994g = -1;
            this.f1996h = -1;
            this.f1998i = -1;
            this.f2000j = -1;
            this.f2002k = -1;
            this.f2004l = -1;
            this.f2006m = -1;
            this.f2008n = -1;
            this.f2010o = -1;
            this.f2012p = -1;
            this.f2014q = 0;
            this.f2016r = 0.0f;
            this.f2018s = -1;
            this.f2020t = -1;
            this.f2022u = -1;
            this.f2024v = -1;
            this.f2026w = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2028x = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2029y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2030z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1956A = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1957B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1958C = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f1959D = 0;
            this.f1960E = true;
            this.f1961F = true;
            this.f1962G = 0.5f;
            this.f1963H = 0.5f;
            this.f1964I = null;
            this.f1965J = 0.0f;
            this.f1966K = 1;
            this.f1967L = -1.0f;
            this.f1968M = -1.0f;
            this.f1969N = 0;
            this.f1970O = 0;
            this.f1971P = 0;
            this.f1972Q = 0;
            this.f1973R = 0;
            this.f1974S = 0;
            this.f1975T = 0;
            this.f1976U = 0;
            this.f1977V = 1.0f;
            this.f1978W = 1.0f;
            this.f1979X = -1;
            this.f1980Y = -1;
            this.f1981Z = -1;
            this.f1983a0 = false;
            this.f1985b0 = false;
            this.f1987c0 = null;
            this.f1989d0 = 0;
            this.f1991e0 = true;
            this.f1993f0 = true;
            this.f1995g0 = false;
            this.f1997h0 = false;
            this.f1999i0 = false;
            this.f2001j0 = false;
            this.f2003k0 = false;
            this.f2005l0 = -1;
            this.f2007m0 = -1;
            this.f2009n0 = -1;
            this.f2011o0 = -1;
            this.f2013p0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2015q0 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f2017r0 = 0.5f;
            this.f2025v0 = new C1512e();
            this.f2027w0 = false;
        }
    }
}
