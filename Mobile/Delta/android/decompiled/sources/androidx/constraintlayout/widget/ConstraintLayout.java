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
import c2.f;
import c2.h;
import c2.k;
import c2.l;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static g2.e f1489y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<View> f1490a;
    public ArrayList<androidx.constraintlayout.widget.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f1491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f1498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g2.a f1499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap<String, Integer> f1501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SparseArray<c2.e> f1508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f1509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<d> f1512x;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1513a;

        static {
            int[] iArr = new int[c2.e.b.values().length];
            f1513a = iArr;
            try {
                iArr[c2.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1513a[c2.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1513a[c2.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1513a[c2.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements d2.b.InterfaceC0264b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f1563a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1568g;

        public c(ConstraintLayout constraintLayout) {
            this.f1563a = constraintLayout;
        }

        @Override // d2.b.InterfaceC0264b
        public final void a() {
            int childCount = this.f1563a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f1563a.getChildAt(i10);
                if (childAt instanceof e) {
                    ((e) childAt).a(this.f1563a);
                }
            }
            int size = this.f1563a.b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f1563a.b.get(i11)).p(this.f1563a);
                }
            }
        }

        @Override // d2.b.InterfaceC0264b
        @SuppressLint({"WrongCall"})
        public final void b(c2.e eVar, d2.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f14313e = 0;
                aVar.f14314f = 0;
                aVar.f14315g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            c2.e.b bVar = aVar.f14310a;
            c2.e.b bVar2 = aVar.b;
            int i11 = aVar.f14311c;
            int i12 = aVar.f14312d;
            int i13 = this.b + this.f1564c;
            int i14 = this.f1565d;
            View view = (View) eVar.s();
            int[] iArr = a.f1513a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1567f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1567f, i14 + eVar.B(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1567f, i14, -2);
                boolean z10 = eVar.f4403w == 1;
                int i16 = aVar.f14318j;
                if (i16 == d2.b.a.f14308l || i16 == d2.b.a.f14309m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f14318j == d2.b.a.f14309m || !z10 || ((z10 && z11) || (view instanceof e) || eVar.n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1568g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1568g, i13 + eVar.U(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1568g, i13, -2);
                boolean z12 = eVar.f4405x == 1;
                int i18 = aVar.f14318j;
                if (i18 == d2.b.a.f14308l || i18 == d2.b.a.f14309m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f14318j == d2.b.a.f14309m || !z12 || ((z12 && z13) || (view instanceof e) || eVar.o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            f fVar = (f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.f1497i, Barcode.FORMAT_QR_CODE) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), iMakeMeasureSpec, eVar.W()) && d(eVar.D(), iMakeMeasureSpec2, eVar.x())) {
                aVar.f14313e = eVar.W();
                aVar.f14314f = eVar.x();
                aVar.f14315g = eVar.p();
                return;
            }
            c2.e.b bVar3 = c2.e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            c2.e.b bVar4 = c2.e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == c2.e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == c2.e.b.FIXED;
            boolean z18 = z14 && eVar.f4366d0 > 0.0f;
            boolean z19 = z15 && eVar.f4366d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f14318j;
            if (i19 != d2.b.a.f14308l && i19 != d2.b.a.f14309m && z14 && eVar.f4403w == 0 && z15 && eVar.f4405x == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof g2.f) && (eVar instanceof l)) {
                    ((g2.f) view).t((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = eVar.f4409z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = eVar.A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = eVar.C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = eVar.D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                boolean z21 = z16;
                if (!k.b(ConstraintLayout.this.f1497i, 1)) {
                    if (z18 && z21) {
                        iMax = (int) ((iMax2 * eVar.f4366d0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / eVar.f4366d0) + 0.5f);
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
                    eVar.W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10;
            aVar.f14317i = (iMax == aVar.f14311c && iMax2 == aVar.f14312d) ? false : true;
            if (bVar5.f1526g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && eVar.p() != baseline) {
                aVar.f14317i = true;
            }
            aVar.f14313e = iMax;
            aVar.f14314f = iMax2;
            aVar.f14316h = z22;
            aVar.f14315g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.b = i12;
            this.f1564c = i13;
            this.f1565d = i14;
            this.f1566e = i15;
            this.f1567f = i10;
            this.f1568g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
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

    public interface d {
        boolean a(int i10, int i11, int i12, View view, b bVar);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1490a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.f1491c = new f();
        this.f1492d = 0;
        this.f1493e = 0;
        this.f1494f = Integer.MAX_VALUE;
        this.f1495g = Integer.MAX_VALUE;
        this.f1496h = true;
        this.f1497i = 257;
        this.f1498j = null;
        this.f1499k = null;
        this.f1500l = -1;
        this.f1501m = new HashMap<>();
        this.f1502n = -1;
        this.f1503o = -1;
        this.f1504p = -1;
        this.f1505q = -1;
        this.f1506r = 0;
        this.f1507s = 0;
        this.f1508t = new SparseArray<>();
        this.f1509u = new c(this);
        this.f1510v = 0;
        this.f1511w = 0;
        s(attributeSet, 0, 0);
    }

    public static /* synthetic */ z1.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static g2.e getSharedValues() {
        if (f1489y == null) {
            f1489y = new g2.e();
        }
        return f1489y;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f1491c.C0(this);
        this.f1491c.X1(this.f1509u);
        this.f1490a.put(getId(), this);
        this.f1498j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.V0, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == g2.d.f17700f1) {
                    this.f1492d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1492d);
                } else if (index == g2.d.f17709g1) {
                    this.f1493e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1493e);
                } else if (index == g2.d.f17682d1) {
                    this.f1494f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1494f);
                } else if (index == g2.d.f17691e1) {
                    this.f1495g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1495g);
                } else if (index == g2.d.O2) {
                    this.f1497i = typedArrayObtainStyledAttributes.getInt(index, this.f1497i);
                } else if (index == g2.d.J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1499k = null;
                        }
                    }
                } else if (index == g2.d.f17772n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f1498j = cVar;
                        cVar.t(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1498j = null;
                    }
                    this.f1500l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1491c.Y1(this.f1497i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 c2.e$b) = (r2v3 c2.e$b), (r2v0 c2.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void A(f fVar, int i10, int i11, int i12, int i13) {
        c2.e.b bVar;
        c cVar = this.f1509u;
        int i14 = cVar.f1566e;
        int i15 = cVar.f1565d;
        c2.e.b bVar2 = c2.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = c2.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1492d);
            }
        } else if (i10 == 0) {
            bVar = c2.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f1492d) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f1494f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = c2.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1493e);
            }
        } else if (i12 == 0) {
            bVar2 = c2.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1493e);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f1495g - i14, i13);
        }
        if (i11 != fVar.W() || i13 != fVar.x()) {
            fVar.P1();
        }
        fVar.n1(0);
        fVar.o1(0);
        fVar.Y0(this.f1494f - i15);
        fVar.X0(this.f1495g - i14);
        fVar.b1(0);
        fVar.a1(0);
        fVar.Q0(bVar);
        fVar.l1(i11);
        fVar.h1(bVar2);
        fVar.M0(i13);
        fVar.b1(this.f1492d - i15);
        fVar.a1(this.f1493e - i14);
    }

    public final void B(c2.e eVar, b bVar, SparseArray<c2.e> sparseArray, int i10, c2.d.a aVar) {
        View view = this.f1490a.get(i10);
        c2.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1526g0 = true;
        c2.d.a aVar2 = c2.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f1526g0 = true;
            bVar2.f1556v0.L0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.D, bVar.C, true);
        eVar.L0(true);
        eVar.o(c2.d.a.TOP).q();
        eVar.o(c2.d.a.BOTTOM).q();
    }

    public final boolean C() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            y();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.b.get(i10).q(this);
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
                        paint.setColor(-65536);
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
    public void e(boolean z10, View view, c2.e eVar, b bVar, SparseArray<c2.e> sparseArray) {
        c2.e eVar2;
        c2.e eVar3;
        c2.e eVar4;
        c2.e eVar5;
        b bVar2;
        c2.e eVar6;
        float f10;
        int i10;
        bVar.a();
        bVar.f1558w0 = false;
        eVar.k1(view.getVisibility());
        if (bVar.f1532j0) {
            eVar.U0(true);
            eVar.k1(8);
        }
        eVar.C0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(eVar, this.f1491c.R1());
        }
        if (bVar.f1528h0) {
            h hVar = (h) eVar;
            int i11 = bVar.f1550s0;
            int i12 = bVar.f1552t0;
            float f11 = bVar.f1554u0;
            if (f11 != -1.0f) {
                hVar.A1(f11);
                return;
            } else if (i11 != -1) {
                hVar.y1(i11);
                return;
            } else {
                if (i12 != -1) {
                    hVar.z1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f1536l0;
        int i14 = bVar.f1538m0;
        int i15 = bVar.f1540n0;
        int i16 = bVar.f1542o0;
        int i17 = bVar.f1544p0;
        int i18 = bVar.f1546q0;
        float f12 = bVar.f1548r0;
        int i19 = bVar.f1543p;
        if (i19 != -1) {
            c2.e eVar7 = sparseArray.get(i19);
            if (eVar7 != null) {
                eVar.l(eVar7, bVar.f1547r, bVar.f1545q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i13 != -1) {
                c2.e eVar8 = sparseArray.get(i13);
                if (eVar8 != null) {
                    c2.d.a aVar = c2.d.a.LEFT;
                    eVar.e0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                eVar.e0(c2.d.a.LEFT, eVar2, c2.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                c2.e eVar9 = sparseArray.get(i15);
                if (eVar9 != null) {
                    eVar.e0(c2.d.a.RIGHT, eVar9, c2.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = sparseArray.get(i16)) != null) {
                c2.d.a aVar2 = c2.d.a.RIGHT;
                eVar.e0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f1529i;
            if (i20 != -1) {
                c2.e eVar10 = sparseArray.get(i20);
                if (eVar10 != null) {
                    c2.d.a aVar3 = c2.d.a.TOP;
                    eVar.e0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f1559x);
                }
            } else {
                int i21 = bVar.f1531j;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.e0(c2.d.a.TOP, eVar4, c2.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f1559x);
                }
            }
            int i22 = bVar.f1533k;
            if (i22 != -1) {
                c2.e eVar11 = sparseArray.get(i22);
                if (eVar11 != null) {
                    eVar.e0(c2.d.a.BOTTOM, eVar11, c2.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f1561z);
                }
            } else {
                int i23 = bVar.f1535l;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    c2.d.a aVar4 = c2.d.a.BOTTOM;
                    eVar.e0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f1561z);
                }
            }
            int i24 = bVar.f1537m;
            if (i24 != -1) {
                bVar2 = bVar;
                B(eVar, bVar2, sparseArray, i24, c2.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f1539n;
                if (i25 != -1) {
                    B(eVar, bVar2, sparseArray, i25, c2.d.a.TOP);
                } else {
                    int i26 = bVar2.f1541o;
                    if (i26 != -1) {
                        B(eVar, bVar2, sparseArray, i26, c2.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f12 >= 0.0f) {
                        eVar6.N0(f12);
                    }
                    f10 = bVar2.H;
                    if (f10 >= 0.0f) {
                        eVar6.e1(f10);
                    }
                }
            }
            eVar6 = eVar;
            if (f12 >= 0.0f) {
                eVar6.N0(f12);
            }
            f10 = bVar2.H;
            if (f10 >= 0.0f) {
                eVar6.e1(f10);
            }
        }
        if (z10 && ((i10 = bVar2.X) != -1 || bVar2.Y != -1)) {
            eVar6.c1(i10, bVar2.Y);
        }
        if (bVar2.f1522e0) {
            eVar6.Q0(c2.e.b.FIXED);
            eVar6.l1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.Q0(c2.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f1515a0) {
                eVar6.Q0(c2.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.Q0(c2.e.b.MATCH_PARENT);
            }
            eVar6.o(c2.d.a.LEFT).f4348g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.o(c2.d.a.RIGHT).f4348g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.Q0(c2.e.b.MATCH_CONSTRAINT);
            eVar6.l1(0);
        }
        if (bVar2.f1524f0) {
            eVar6.h1(c2.e.b.FIXED);
            eVar6.M0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.h1(c2.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f1516b0) {
                eVar6.h1(c2.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.h1(c2.e.b.MATCH_PARENT);
            }
            eVar6.o(c2.d.a.TOP).f4348g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.o(c2.d.a.BOTTOM).f4348g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.h1(c2.e.b.MATCH_CONSTRAINT);
            eVar6.M0(0);
        }
        eVar6.E0(bVar2.I);
        eVar6.S0(bVar2.L);
        eVar6.j1(bVar2.M);
        eVar6.O0(bVar2.N);
        eVar6.f1(bVar2.O);
        eVar6.m1(bVar2.f1520d0);
        eVar6.R0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.i1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    public boolean f(int i10, int i11) {
        if (this.f1512x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ArrayList<d> arrayList = this.f1512x;
        int size3 = arrayList.size();
        boolean zA = false;
        int i12 = 0;
        while (i12 < size3) {
            int i13 = i12 + 1;
            d dVar = arrayList.get(i12);
            ArrayList<c2.e> arrayListS1 = this.f1491c.s1();
            int size4 = arrayListS1.size();
            for (int i14 = 0; i14 < size4; i14++) {
                View view = (View) arrayListS1.get(i14).s();
                zA |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
            i12 = i13;
        }
        return zA;
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f1495g;
    }

    public int getMaxWidth() {
        return this.f1494f;
    }

    public int getMinHeight() {
        return this.f1493e;
    }

    public int getMinWidth() {
        return this.f1492d;
    }

    public int getOptimizationLevel() {
        return this.f1491c.L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1491c.f4387o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1491c.f4387o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1491c.f4387o = "parent";
            }
        }
        if (this.f1491c.t() == null) {
            f fVar = this.f1491c;
            fVar.D0(fVar.f4387o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1491c.t());
        }
        ArrayList<c2.e> arrayListS1 = this.f1491c.s1();
        int size = arrayListS1.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = arrayListS1.get(i10);
            i10++;
            c2.e eVar2 = eVar;
            View view = (View) eVar2.s();
            if (view != null) {
                if (eVar2.f4387o == null && (id2 = view.getId()) != -1) {
                    eVar2.f4387o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar2.t() == null) {
                    eVar2.D0(eVar2.f4387o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar2.t());
                }
            }
        }
        this.f1491c.O(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object l(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f1501m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1501m.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            c2.e eVar = bVar.f1556v0;
            if ((childAt.getVisibility() != 8 || bVar.f1528h0 || bVar.f1530i0 || bVar.f1534k0 || zIsInEditMode) && !bVar.f1532j0) {
                int iX = eVar.X();
                int iY = eVar.Y();
                int iW = eVar.W() + iX;
                int iX2 = eVar.x() + iY;
                childAt.layout(iX, iY, iW, iX2);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iX, iY, iW, iX2);
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.b.get(i15).o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean zF = this.f1496h | f(i10, i11);
        this.f1496h = zF;
        if (!zF) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f1496h = true;
                    break;
                }
            }
        }
        this.f1510v = i10;
        this.f1511w = i11;
        this.f1491c.a2(t());
        if (this.f1496h) {
            this.f1496h = false;
            if (C()) {
                this.f1491c.c2();
            }
        }
        this.f1491c.J1(null);
        x(this.f1491c, this.f1497i, i10, i11);
        w(i10, i11, this.f1491c.W(), this.f1491c.x(), this.f1491c.S1(), this.f1491c.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        c2.e eVarR = r(view);
        if ((view instanceof Guideline) && !(eVarR instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f1556v0 = hVar;
            bVar.f1528h0 = true;
            hVar.B1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f1530i0 = true;
            if (!this.b.contains(bVar2)) {
                this.b.add(bVar2);
            }
        }
        this.f1490a.put(view.getId(), view);
        this.f1496h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1490a.remove(view.getId());
        this.f1491c.u1(r(view));
        this.b.remove(view);
        this.f1496h = true;
    }

    public final c2.e p(int i10) {
        if (i10 == 0) {
            return this.f1491c;
        }
        View viewFindViewById = this.f1490a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1491c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f1556v0;
    }

    public View q(int i10) {
        return this.f1490a.get(i10);
    }

    public final c2.e r(View view) {
        if (view == this) {
            return this.f1491c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1556v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1556v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f1498j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1490a.remove(getId());
        super.setId(i10);
        this.f1490a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1495g) {
            return;
        }
        this.f1495g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1494f) {
            return;
        }
        this.f1494f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1493e) {
            return;
        }
        this.f1493e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1492d) {
            return;
        }
        this.f1492d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(g2.b bVar) {
        g2.a aVar = this.f1499k;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1497i = i10;
        this.f1491c.Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void u() {
        this.f1496h = true;
        this.f1502n = -1;
        this.f1503o = -1;
        this.f1504p = -1;
        this.f1505q = -1;
        this.f1506r = 0;
        this.f1507s = 0;
    }

    public void v(int i10) {
        this.f1499k = new g2.a(getContext(), this, i10);
    }

    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f1509u;
        int i14 = cVar.f1566e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f1565d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f1494f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1495g, iResolveSizeAndState2);
        if (z10) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z11) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1502n = iMin;
        this.f1503o = iMin2;
    }

    public void x(f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f1509u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (t()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            A(fVar, mode, i15, mode2, i16);
            fVar.T1(i10, mode, i15, mode2, i16, this.f1502n, this.f1503o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        A(fVar, mode, i17, mode2, i18);
        fVar.T1(i10, mode, i17, mode2, i18, this.f1502n, this.f1503o, i13, iMax);
    }

    public final void y() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            c2.e eVarR = r(getChildAt(i10));
            if (eVarR != null) {
                eVarR.t0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    p(childAt.getId()).D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1500l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f1500l && (childAt2 instanceof androidx.constraintlayout.widget.d)) {
                    this.f1498j = ((androidx.constraintlayout.widget.d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f1498j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f1491c.v1();
        int size = this.b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.b.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof e) {
                ((e) childAt3).b(this);
            }
        }
        this.f1508t.clear();
        this.f1508t.put(0, this.f1491c);
        this.f1508t.put(getId(), this.f1491c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f1508t.put(childAt4.getId(), r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            c2.e eVarR2 = r(childAt5);
            if (eVarR2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1491c.a(eVarR2);
                e(zIsInEditMode, childAt5, eVarR2, bVar, this.f1508t);
            }
        }
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1501m == null) {
                this.f1501m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1501m.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1490a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.f1491c = new f();
        this.f1492d = 0;
        this.f1493e = 0;
        this.f1494f = Integer.MAX_VALUE;
        this.f1495g = Integer.MAX_VALUE;
        this.f1496h = true;
        this.f1497i = 257;
        this.f1498j = null;
        this.f1499k = null;
        this.f1500l = -1;
        this.f1501m = new HashMap<>();
        this.f1502n = -1;
        this.f1503o = -1;
        this.f1504p = -1;
        this.f1505q = -1;
        this.f1506r = 0;
        this.f1507s = 0;
        this.f1508t = new SparseArray<>();
        this.f1509u = new c(this);
        this.f1510v = 0;
        this.f1511w = 0;
        s(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1514a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f1515a0;
        public int b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f1516b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1517c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f1518c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1519d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1520d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1521e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f1522e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1523f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f1524f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1525g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public boolean f1526g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1527h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f1528h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1529i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f1530i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1531j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f1532j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1533k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public boolean f1534k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1535l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f1536l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1537m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public int f1538m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1539n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f1540n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1541o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f1542o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1543p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f1544p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1545q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1546q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f1547r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f1548r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1549s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f1550s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1551t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f1552t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1553u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f1554u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1555v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public c2.e f1556v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1557w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f1558w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1559x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1560y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f1561z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1562a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1562a = sparseIntArray;
                sparseIntArray.append(g2.d.f17870z2, 64);
                sparseIntArray.append(g2.d.f17674c2, 65);
                sparseIntArray.append(g2.d.f17755l2, 8);
                sparseIntArray.append(g2.d.f17764m2, 9);
                sparseIntArray.append(g2.d.f17782o2, 10);
                sparseIntArray.append(g2.d.f17791p2, 11);
                sparseIntArray.append(g2.d.f17840v2, 12);
                sparseIntArray.append(g2.d.f17832u2, 13);
                sparseIntArray.append(g2.d.S1, 14);
                sparseIntArray.append(g2.d.R1, 15);
                sparseIntArray.append(g2.d.N1, 16);
                sparseIntArray.append(g2.d.P1, 52);
                sparseIntArray.append(g2.d.O1, 53);
                sparseIntArray.append(g2.d.T1, 2);
                sparseIntArray.append(g2.d.V1, 3);
                sparseIntArray.append(g2.d.U1, 4);
                sparseIntArray.append(g2.d.E2, 49);
                sparseIntArray.append(g2.d.F2, 50);
                sparseIntArray.append(g2.d.Z1, 5);
                sparseIntArray.append(g2.d.f17657a2, 6);
                sparseIntArray.append(g2.d.f17665b2, 7);
                sparseIntArray.append(g2.d.I1, 67);
                sparseIntArray.append(g2.d.W0, 1);
                sparseIntArray.append(g2.d.f17800q2, 17);
                sparseIntArray.append(g2.d.f17808r2, 18);
                sparseIntArray.append(g2.d.Y1, 19);
                sparseIntArray.append(g2.d.X1, 20);
                sparseIntArray.append(g2.d.J2, 21);
                sparseIntArray.append(g2.d.M2, 22);
                sparseIntArray.append(g2.d.K2, 23);
                sparseIntArray.append(g2.d.H2, 24);
                sparseIntArray.append(g2.d.L2, 25);
                sparseIntArray.append(g2.d.I2, 26);
                sparseIntArray.append(g2.d.G2, 55);
                sparseIntArray.append(g2.d.N2, 54);
                sparseIntArray.append(g2.d.f17719h2, 29);
                sparseIntArray.append(g2.d.f17847w2, 30);
                sparseIntArray.append(g2.d.W1, 44);
                sparseIntArray.append(g2.d.f17737j2, 45);
                sparseIntArray.append(g2.d.f17862y2, 46);
                sparseIntArray.append(g2.d.f17728i2, 47);
                sparseIntArray.append(g2.d.f17854x2, 48);
                sparseIntArray.append(g2.d.L1, 27);
                sparseIntArray.append(g2.d.K1, 28);
                sparseIntArray.append(g2.d.A2, 31);
                sparseIntArray.append(g2.d.f17683d2, 32);
                sparseIntArray.append(g2.d.C2, 33);
                sparseIntArray.append(g2.d.B2, 34);
                sparseIntArray.append(g2.d.D2, 35);
                sparseIntArray.append(g2.d.f17701f2, 36);
                sparseIntArray.append(g2.d.f17692e2, 37);
                sparseIntArray.append(g2.d.f17710g2, 38);
                sparseIntArray.append(g2.d.f17746k2, 39);
                sparseIntArray.append(g2.d.f17824t2, 40);
                sparseIntArray.append(g2.d.f17773n2, 41);
                sparseIntArray.append(g2.d.Q1, 42);
                sparseIntArray.append(g2.d.M1, 43);
                sparseIntArray.append(g2.d.f17816s2, 51);
                sparseIntArray.append(g2.d.P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1514a = -1;
            this.b = -1;
            this.f1517c = -1.0f;
            this.f1519d = true;
            this.f1521e = -1;
            this.f1523f = -1;
            this.f1525g = -1;
            this.f1527h = -1;
            this.f1529i = -1;
            this.f1531j = -1;
            this.f1533k = -1;
            this.f1535l = -1;
            this.f1537m = -1;
            this.f1539n = -1;
            this.f1541o = -1;
            this.f1543p = -1;
            this.f1545q = 0;
            this.f1547r = 0.0f;
            this.f1549s = -1;
            this.f1551t = -1;
            this.f1553u = -1;
            this.f1555v = -1;
            this.f1557w = Integer.MIN_VALUE;
            this.f1559x = Integer.MIN_VALUE;
            this.f1560y = Integer.MIN_VALUE;
            this.f1561z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1515a0 = false;
            this.f1516b0 = false;
            this.f1518c0 = null;
            this.f1520d0 = 0;
            this.f1522e0 = true;
            this.f1524f0 = true;
            this.f1526g0 = false;
            this.f1528h0 = false;
            this.f1530i0 = false;
            this.f1532j0 = false;
            this.f1534k0 = false;
            this.f1536l0 = -1;
            this.f1538m0 = -1;
            this.f1540n0 = -1;
            this.f1542o0 = -1;
            this.f1544p0 = Integer.MIN_VALUE;
            this.f1546q0 = Integer.MIN_VALUE;
            this.f1548r0 = 0.5f;
            this.f1556v0 = new c2.e();
            this.f1558w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f1514a = bVar.f1514a;
                this.b = bVar.b;
                this.f1517c = bVar.f1517c;
                this.f1519d = bVar.f1519d;
                this.f1521e = bVar.f1521e;
                this.f1523f = bVar.f1523f;
                this.f1525g = bVar.f1525g;
                this.f1527h = bVar.f1527h;
                this.f1529i = bVar.f1529i;
                this.f1531j = bVar.f1531j;
                this.f1533k = bVar.f1533k;
                this.f1535l = bVar.f1535l;
                this.f1537m = bVar.f1537m;
                this.f1539n = bVar.f1539n;
                this.f1541o = bVar.f1541o;
                this.f1543p = bVar.f1543p;
                this.f1545q = bVar.f1545q;
                this.f1547r = bVar.f1547r;
                this.f1549s = bVar.f1549s;
                this.f1551t = bVar.f1551t;
                this.f1553u = bVar.f1553u;
                this.f1555v = bVar.f1555v;
                this.f1557w = bVar.f1557w;
                this.f1559x = bVar.f1559x;
                this.f1560y = bVar.f1560y;
                this.f1561z = bVar.f1561z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f1515a0 = bVar.f1515a0;
                this.f1516b0 = bVar.f1516b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f1522e0 = bVar.f1522e0;
                this.f1524f0 = bVar.f1524f0;
                this.f1526g0 = bVar.f1526g0;
                this.f1528h0 = bVar.f1528h0;
                this.f1536l0 = bVar.f1536l0;
                this.f1538m0 = bVar.f1538m0;
                this.f1540n0 = bVar.f1540n0;
                this.f1542o0 = bVar.f1542o0;
                this.f1544p0 = bVar.f1544p0;
                this.f1546q0 = bVar.f1546q0;
                this.f1548r0 = bVar.f1548r0;
                this.f1518c0 = bVar.f1518c0;
                this.f1520d0 = bVar.f1520d0;
                this.f1556v0 = bVar.f1556v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public void a() {
            this.f1528h0 = false;
            this.f1522e0 = true;
            this.f1524f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1515a0) {
                this.f1522e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1516b0) {
                this.f1524f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1522e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1515a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1524f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1516b0 = true;
                }
            }
            if (this.f1517c == -1.0f && this.f1514a == -1 && this.b == -1) {
                return;
            }
            this.f1528h0 = true;
            this.f1522e0 = true;
            this.f1524f0 = true;
            if (!(this.f1556v0 instanceof h)) {
                this.f1556v0 = new h();
            }
            ((h) this.f1556v0).B1(this.Z);
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
            this.f1540n0 = -1;
            this.f1542o0 = -1;
            this.f1536l0 = -1;
            this.f1538m0 = -1;
            this.f1544p0 = this.f1557w;
            this.f1546q0 = this.f1560y;
            float f10 = this.G;
            this.f1548r0 = f10;
            int i17 = this.f1514a;
            this.f1550s0 = i17;
            int i18 = this.b;
            this.f1552t0 = i18;
            float f11 = this.f1517c;
            this.f1554u0 = f11;
            if (z11) {
                int i19 = this.f1549s;
                if (i19 != -1) {
                    this.f1540n0 = i19;
                } else {
                    int i20 = this.f1551t;
                    if (i20 != -1) {
                        this.f1542o0 = i20;
                    } else {
                        i11 = this.f1553u;
                        if (i11 != -1) {
                            this.f1538m0 = i11;
                            z10 = true;
                        }
                        i12 = this.f1555v;
                        if (i12 != -1) {
                            this.f1536l0 = i12;
                            z10 = true;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f1546q0 = i13;
                        }
                        i14 = this.B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f1544p0 = i14;
                        }
                        if (z10) {
                            this.f1548r0 = 1.0f - f10;
                        }
                        if (this.f1528h0 && this.Z == 1 && this.f1519d) {
                            if (f11 != -1.0f) {
                                this.f1554u0 = 1.0f - f11;
                                this.f1550s0 = -1;
                                this.f1552t0 = -1;
                            } else if (i17 != -1) {
                                this.f1552t0 = i17;
                                this.f1550s0 = -1;
                                this.f1554u0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f1550s0 = i18;
                                this.f1552t0 = -1;
                                this.f1554u0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f1553u;
                if (i11 != -1) {
                    this.f1538m0 = i11;
                    z10 = true;
                }
                i12 = this.f1555v;
                if (i12 != -1) {
                    this.f1536l0 = i12;
                    z10 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f1546q0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f1544p0 = i14;
                }
                if (z10) {
                    this.f1548r0 = 1.0f - f10;
                }
                if (this.f1528h0) {
                    if (f11 != -1.0f) {
                        this.f1554u0 = 1.0f - f11;
                        this.f1550s0 = -1;
                        this.f1552t0 = -1;
                    } else if (i17 != -1) {
                        this.f1552t0 = i17;
                        this.f1550s0 = -1;
                        this.f1554u0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f1550s0 = i18;
                        this.f1552t0 = -1;
                        this.f1554u0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f1549s;
                if (i21 != -1) {
                    this.f1538m0 = i21;
                }
                int i22 = this.f1551t;
                if (i22 != -1) {
                    this.f1536l0 = i22;
                }
                int i23 = this.f1553u;
                if (i23 != -1) {
                    this.f1540n0 = i23;
                }
                int i24 = this.f1555v;
                if (i24 != -1) {
                    this.f1542o0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f1544p0 = i25;
                }
                int i26 = this.B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f1546q0 = i26;
                }
            }
            if (this.f1553u == -1 && this.f1555v == -1 && this.f1551t == -1 && this.f1549s == -1) {
                int i27 = this.f1525g;
                if (i27 != -1) {
                    this.f1540n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f1527h;
                    if (i28 != -1) {
                        this.f1542o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f1521e;
                if (i29 != -1) {
                    this.f1536l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f1523f;
                if (i30 != -1) {
                    this.f1538m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1514a = -1;
            this.b = -1;
            this.f1517c = -1.0f;
            this.f1519d = true;
            this.f1521e = -1;
            this.f1523f = -1;
            this.f1525g = -1;
            this.f1527h = -1;
            this.f1529i = -1;
            this.f1531j = -1;
            this.f1533k = -1;
            this.f1535l = -1;
            this.f1537m = -1;
            this.f1539n = -1;
            this.f1541o = -1;
            this.f1543p = -1;
            this.f1545q = 0;
            this.f1547r = 0.0f;
            this.f1549s = -1;
            this.f1551t = -1;
            this.f1553u = -1;
            this.f1555v = -1;
            this.f1557w = Integer.MIN_VALUE;
            this.f1559x = Integer.MIN_VALUE;
            this.f1560y = Integer.MIN_VALUE;
            this.f1561z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1515a0 = false;
            this.f1516b0 = false;
            this.f1518c0 = null;
            this.f1520d0 = 0;
            this.f1522e0 = true;
            this.f1524f0 = true;
            this.f1526g0 = false;
            this.f1528h0 = false;
            this.f1530i0 = false;
            this.f1532j0 = false;
            this.f1534k0 = false;
            this.f1536l0 = -1;
            this.f1538m0 = -1;
            this.f1540n0 = -1;
            this.f1542o0 = -1;
            this.f1544p0 = Integer.MIN_VALUE;
            this.f1546q0 = Integer.MIN_VALUE;
            this.f1548r0 = 0.5f;
            this.f1556v0 = new c2.e();
            this.f1558w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f1562a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1543p);
                        this.f1543p = resourceId;
                        if (resourceId == -1) {
                            this.f1543p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f1545q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1545q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f1547r) % 360.0f;
                        this.f1547r = f10;
                        if (f10 < 0.0f) {
                            this.f1547r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f1514a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1514a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.f1517c = typedArrayObtainStyledAttributes.getFloat(index, this.f1517c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1521e);
                        this.f1521e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1521e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1523f);
                        this.f1523f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1523f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1525g);
                        this.f1525g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1525g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1527h);
                        this.f1527h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1527h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1529i);
                        this.f1529i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1529i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1531j);
                        this.f1531j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1531j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1533k);
                        this.f1533k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1533k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1535l);
                        this.f1535l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1535l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1537m);
                        this.f1537m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1537m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1549s);
                        this.f1549s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1549s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1551t);
                        this.f1551t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1551t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1553u);
                        this.f1553u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1553u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1555v);
                        this.f1555v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1555v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f1557w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1557w);
                        break;
                    case 22:
                        this.f1559x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1559x);
                        break;
                    case 23:
                        this.f1560y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1560y);
                        break;
                    case 24:
                        this.f1561z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1561z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f1515a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1515a0);
                        break;
                    case 28:
                        this.f1516b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1516b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.c.y(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1518c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1539n);
                                this.f1539n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1539n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1541o);
                                this.f1541o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1541o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.w(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.c.w(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1520d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1520d0);
                                        break;
                                    case 67:
                                        this.f1519d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1519d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f1514a = -1;
            this.b = -1;
            this.f1517c = -1.0f;
            this.f1519d = true;
            this.f1521e = -1;
            this.f1523f = -1;
            this.f1525g = -1;
            this.f1527h = -1;
            this.f1529i = -1;
            this.f1531j = -1;
            this.f1533k = -1;
            this.f1535l = -1;
            this.f1537m = -1;
            this.f1539n = -1;
            this.f1541o = -1;
            this.f1543p = -1;
            this.f1545q = 0;
            this.f1547r = 0.0f;
            this.f1549s = -1;
            this.f1551t = -1;
            this.f1553u = -1;
            this.f1555v = -1;
            this.f1557w = Integer.MIN_VALUE;
            this.f1559x = Integer.MIN_VALUE;
            this.f1560y = Integer.MIN_VALUE;
            this.f1561z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1515a0 = false;
            this.f1516b0 = false;
            this.f1518c0 = null;
            this.f1520d0 = 0;
            this.f1522e0 = true;
            this.f1524f0 = true;
            this.f1526g0 = false;
            this.f1528h0 = false;
            this.f1530i0 = false;
            this.f1532j0 = false;
            this.f1534k0 = false;
            this.f1536l0 = -1;
            this.f1538m0 = -1;
            this.f1540n0 = -1;
            this.f1542o0 = -1;
            this.f1544p0 = Integer.MIN_VALUE;
            this.f1546q0 = Integer.MIN_VALUE;
            this.f1548r0 = 0.5f;
            this.f1556v0 = new c2.e();
            this.f1558w0 = false;
        }
    }
}
