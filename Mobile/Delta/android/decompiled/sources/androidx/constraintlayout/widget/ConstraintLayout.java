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
    public static g2.e f1334y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<View> f1335a;
    public ArrayList<androidx.constraintlayout.widget.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f1336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f1343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g2.a f1344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap<String, Integer> f1346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SparseArray<c2.e> f1353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f1354u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<d> f1357x;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1358a;

        static {
            int[] iArr = new int[c2.e.b.values().length];
            f1358a = iArr;
            try {
                iArr[c2.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1358a[c2.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1358a[c2.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1358a[c2.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements d2.b.InterfaceC0276b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f1408a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1413g;

        public c(ConstraintLayout constraintLayout) {
            this.f1408a = constraintLayout;
        }

        @Override // d2.b.InterfaceC0276b
        public final void a() {
            int childCount = this.f1408a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f1408a.getChildAt(i10);
                if (childAt instanceof e) {
                    ((e) childAt).a(this.f1408a);
                }
            }
            int size = this.f1408a.b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f1408a.b.get(i11)).p(this.f1408a);
                }
            }
        }

        @Override // d2.b.InterfaceC0276b
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
                aVar.f14293e = 0;
                aVar.f14294f = 0;
                aVar.f14295g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            c2.e.b bVar = aVar.f14290a;
            c2.e.b bVar2 = aVar.b;
            int i11 = aVar.f14291c;
            int i12 = aVar.f14292d;
            int i13 = this.b + this.f1409c;
            int i14 = this.f1410d;
            View view = (View) eVar.s();
            int[] iArr = a.f1358a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1412f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1412f, i14 + eVar.B(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1412f, i14, -2);
                boolean z10 = eVar.f4569w == 1;
                int i16 = aVar.f14298j;
                if (i16 == d2.b.a.f14288l || i16 == d2.b.a.f14289m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f14298j == d2.b.a.f14289m || !z10 || ((z10 && z11) || (view instanceof e) || eVar.n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1413g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1413g, i13 + eVar.U(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1413g, i13, -2);
                boolean z12 = eVar.f4571x == 1;
                int i18 = aVar.f14298j;
                if (i18 == d2.b.a.f14288l || i18 == d2.b.a.f14289m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f14298j == d2.b.a.f14289m || !z12 || ((z12 && z13) || (view instanceof e) || eVar.o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            f fVar = (f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.f1342i, Barcode.FORMAT_QR_CODE) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), iMakeMeasureSpec, eVar.W()) && d(eVar.D(), iMakeMeasureSpec2, eVar.x())) {
                aVar.f14293e = eVar.W();
                aVar.f14294f = eVar.x();
                aVar.f14295g = eVar.p();
                return;
            }
            c2.e.b bVar3 = c2.e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            c2.e.b bVar4 = c2.e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == c2.e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == c2.e.b.FIXED;
            boolean z18 = z14 && eVar.f4532d0 > 0.0f;
            boolean z19 = z15 && eVar.f4532d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f14298j;
            if (i19 != d2.b.a.f14288l && i19 != d2.b.a.f14289m && z14 && eVar.f4569w == 0 && z15 && eVar.f4571x == 0) {
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
                int i20 = eVar.f4575z;
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
                if (!k.b(ConstraintLayout.this.f1342i, 1)) {
                    if (z18 && z21) {
                        iMax = (int) ((iMax2 * eVar.f4532d0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / eVar.f4532d0) + 0.5f);
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
            aVar.f14297i = (iMax == aVar.f14291c && iMax2 == aVar.f14292d) ? false : true;
            if (bVar5.f1371g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && eVar.p() != baseline) {
                aVar.f14297i = true;
            }
            aVar.f14293e = iMax;
            aVar.f14294f = iMax2;
            aVar.f14296h = z22;
            aVar.f14295g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.b = i12;
            this.f1409c = i13;
            this.f1410d = i14;
            this.f1411e = i15;
            this.f1412f = i10;
            this.f1413g = i11;
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
        this.f1335a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.f1336c = new f();
        this.f1337d = 0;
        this.f1338e = 0;
        this.f1339f = Integer.MAX_VALUE;
        this.f1340g = Integer.MAX_VALUE;
        this.f1341h = true;
        this.f1342i = 257;
        this.f1343j = null;
        this.f1344k = null;
        this.f1345l = -1;
        this.f1346m = new HashMap<>();
        this.f1347n = -1;
        this.f1348o = -1;
        this.f1349p = -1;
        this.f1350q = -1;
        this.f1351r = 0;
        this.f1352s = 0;
        this.f1353t = new SparseArray<>();
        this.f1354u = new c(this);
        this.f1355v = 0;
        this.f1356w = 0;
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
        if (f1334y == null) {
            f1334y = new g2.e();
        }
        return f1334y;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f1336c.C0(this);
        this.f1336c.X1(this.f1354u);
        this.f1335a.put(getId(), this);
        this.f1343j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.V0, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == g2.d.f18239f1) {
                    this.f1337d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1337d);
                } else if (index == g2.d.f18248g1) {
                    this.f1338e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1338e);
                } else if (index == g2.d.f18221d1) {
                    this.f1339f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1339f);
                } else if (index == g2.d.f18230e1) {
                    this.f1340g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1340g);
                } else if (index == g2.d.O2) {
                    this.f1342i = typedArrayObtainStyledAttributes.getInt(index, this.f1342i);
                } else if (index == g2.d.J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1344k = null;
                        }
                    }
                } else if (index == g2.d.f18311n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f1343j = cVar;
                        cVar.t(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1343j = null;
                    }
                    this.f1345l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1336c.Y1(this.f1342i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 c2.e$b) = (r2v3 c2.e$b), (r2v0 c2.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void A(f fVar, int i10, int i11, int i12, int i13) {
        c2.e.b bVar;
        c cVar = this.f1354u;
        int i14 = cVar.f1411e;
        int i15 = cVar.f1410d;
        c2.e.b bVar2 = c2.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = c2.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1337d);
            }
        } else if (i10 == 0) {
            bVar = c2.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f1337d) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f1339f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = c2.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1338e);
            }
        } else if (i12 == 0) {
            bVar2 = c2.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1338e);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f1340g - i14, i13);
        }
        if (i11 != fVar.W() || i13 != fVar.x()) {
            fVar.P1();
        }
        fVar.n1(0);
        fVar.o1(0);
        fVar.Y0(this.f1339f - i15);
        fVar.X0(this.f1340g - i14);
        fVar.b1(0);
        fVar.a1(0);
        fVar.Q0(bVar);
        fVar.l1(i11);
        fVar.h1(bVar2);
        fVar.M0(i13);
        fVar.b1(this.f1337d - i15);
        fVar.a1(this.f1338e - i14);
    }

    public final void B(c2.e eVar, b bVar, SparseArray<c2.e> sparseArray, int i10, c2.d.a aVar) {
        View view = this.f1335a.get(i10);
        c2.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1371g0 = true;
        c2.d.a aVar2 = c2.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f1371g0 = true;
            bVar2.f1401v0.L0(true);
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
        bVar.f1403w0 = false;
        eVar.k1(view.getVisibility());
        if (bVar.f1377j0) {
            eVar.U0(true);
            eVar.k1(8);
        }
        eVar.C0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(eVar, this.f1336c.R1());
        }
        if (bVar.f1373h0) {
            h hVar = (h) eVar;
            int i11 = bVar.f1395s0;
            int i12 = bVar.f1397t0;
            float f11 = bVar.f1399u0;
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
        int i13 = bVar.f1381l0;
        int i14 = bVar.f1383m0;
        int i15 = bVar.f1385n0;
        int i16 = bVar.f1387o0;
        int i17 = bVar.f1389p0;
        int i18 = bVar.f1391q0;
        float f12 = bVar.f1393r0;
        int i19 = bVar.f1388p;
        if (i19 != -1) {
            c2.e eVar7 = sparseArray.get(i19);
            if (eVar7 != null) {
                eVar.l(eVar7, bVar.f1392r, bVar.f1390q);
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
            int i20 = bVar.f1374i;
            if (i20 != -1) {
                c2.e eVar10 = sparseArray.get(i20);
                if (eVar10 != null) {
                    c2.d.a aVar3 = c2.d.a.TOP;
                    eVar.e0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f1404x);
                }
            } else {
                int i21 = bVar.f1376j;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.e0(c2.d.a.TOP, eVar4, c2.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f1404x);
                }
            }
            int i22 = bVar.f1378k;
            if (i22 != -1) {
                c2.e eVar11 = sparseArray.get(i22);
                if (eVar11 != null) {
                    eVar.e0(c2.d.a.BOTTOM, eVar11, c2.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f1406z);
                }
            } else {
                int i23 = bVar.f1380l;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    c2.d.a aVar4 = c2.d.a.BOTTOM;
                    eVar.e0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f1406z);
                }
            }
            int i24 = bVar.f1382m;
            if (i24 != -1) {
                bVar2 = bVar;
                B(eVar, bVar2, sparseArray, i24, c2.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f1384n;
                if (i25 != -1) {
                    B(eVar, bVar2, sparseArray, i25, c2.d.a.TOP);
                } else {
                    int i26 = bVar2.f1386o;
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
        if (bVar2.f1367e0) {
            eVar6.Q0(c2.e.b.FIXED);
            eVar6.l1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.Q0(c2.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f1360a0) {
                eVar6.Q0(c2.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.Q0(c2.e.b.MATCH_PARENT);
            }
            eVar6.o(c2.d.a.LEFT).f4514g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.o(c2.d.a.RIGHT).f4514g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.Q0(c2.e.b.MATCH_CONSTRAINT);
            eVar6.l1(0);
        }
        if (bVar2.f1369f0) {
            eVar6.h1(c2.e.b.FIXED);
            eVar6.M0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.h1(c2.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f1361b0) {
                eVar6.h1(c2.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.h1(c2.e.b.MATCH_PARENT);
            }
            eVar6.o(c2.d.a.TOP).f4514g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.o(c2.d.a.BOTTOM).f4514g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.h1(c2.e.b.MATCH_CONSTRAINT);
            eVar6.M0(0);
        }
        eVar6.E0(bVar2.I);
        eVar6.S0(bVar2.L);
        eVar6.j1(bVar2.M);
        eVar6.O0(bVar2.N);
        eVar6.f1(bVar2.O);
        eVar6.m1(bVar2.f1365d0);
        eVar6.R0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.i1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    public boolean f(int i10, int i11) {
        if (this.f1357x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ArrayList<d> arrayList = this.f1357x;
        int size3 = arrayList.size();
        boolean zA = false;
        int i12 = 0;
        while (i12 < size3) {
            int i13 = i12 + 1;
            d dVar = arrayList.get(i12);
            ArrayList<c2.e> arrayListS1 = this.f1336c.s1();
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
        return this.f1340g;
    }

    public int getMaxWidth() {
        return this.f1339f;
    }

    public int getMinHeight() {
        return this.f1338e;
    }

    public int getMinWidth() {
        return this.f1337d;
    }

    public int getOptimizationLevel() {
        return this.f1336c.L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1336c.f4553o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1336c.f4553o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1336c.f4553o = "parent";
            }
        }
        if (this.f1336c.t() == null) {
            f fVar = this.f1336c;
            fVar.D0(fVar.f4553o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1336c.t());
        }
        ArrayList<c2.e> arrayListS1 = this.f1336c.s1();
        int size = arrayListS1.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = arrayListS1.get(i10);
            i10++;
            c2.e eVar2 = eVar;
            View view = (View) eVar2.s();
            if (view != null) {
                if (eVar2.f4553o == null && (id2 = view.getId()) != -1) {
                    eVar2.f4553o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar2.t() == null) {
                    eVar2.D0(eVar2.f4553o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar2.t());
                }
            }
        }
        this.f1336c.O(sb2);
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
        HashMap<String, Integer> map = this.f1346m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1346m.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            c2.e eVar = bVar.f1401v0;
            if ((childAt.getVisibility() != 8 || bVar.f1373h0 || bVar.f1375i0 || bVar.f1379k0 || zIsInEditMode) && !bVar.f1377j0) {
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
        boolean zF = this.f1341h | f(i10, i11);
        this.f1341h = zF;
        if (!zF) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f1341h = true;
                    break;
                }
            }
        }
        this.f1355v = i10;
        this.f1356w = i11;
        this.f1336c.a2(t());
        if (this.f1341h) {
            this.f1341h = false;
            if (C()) {
                this.f1336c.c2();
            }
        }
        this.f1336c.J1(null);
        x(this.f1336c, this.f1342i, i10, i11);
        w(i10, i11, this.f1336c.W(), this.f1336c.x(), this.f1336c.S1(), this.f1336c.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        c2.e eVarR = r(view);
        if ((view instanceof Guideline) && !(eVarR instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f1401v0 = hVar;
            bVar.f1373h0 = true;
            hVar.B1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f1375i0 = true;
            if (!this.b.contains(bVar2)) {
                this.b.add(bVar2);
            }
        }
        this.f1335a.put(view.getId(), view);
        this.f1341h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1335a.remove(view.getId());
        this.f1336c.u1(r(view));
        this.b.remove(view);
        this.f1341h = true;
    }

    public final c2.e p(int i10) {
        if (i10 == 0) {
            return this.f1336c;
        }
        View viewFindViewById = this.f1335a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1336c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f1401v0;
    }

    public View q(int i10) {
        return this.f1335a.get(i10);
    }

    public final c2.e r(View view) {
        if (view == this) {
            return this.f1336c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1401v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1401v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f1343j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1335a.remove(getId());
        super.setId(i10);
        this.f1335a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1340g) {
            return;
        }
        this.f1340g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1339f) {
            return;
        }
        this.f1339f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1338e) {
            return;
        }
        this.f1338e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1337d) {
            return;
        }
        this.f1337d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(g2.b bVar) {
        g2.a aVar = this.f1344k;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1342i = i10;
        this.f1336c.Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void u() {
        this.f1341h = true;
        this.f1347n = -1;
        this.f1348o = -1;
        this.f1349p = -1;
        this.f1350q = -1;
        this.f1351r = 0;
        this.f1352s = 0;
    }

    public void v(int i10) {
        this.f1344k = new g2.a(getContext(), this, i10);
    }

    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f1354u;
        int i14 = cVar.f1411e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f1410d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f1339f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1340g, iResolveSizeAndState2);
        if (z10) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z11) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1347n = iMin;
        this.f1348o = iMin2;
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
        this.f1354u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (t()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            A(fVar, mode, i15, mode2, i16);
            fVar.T1(i10, mode, i15, mode2, i16, this.f1347n, this.f1348o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        A(fVar, mode, i17, mode2, i18);
        fVar.T1(i10, mode, i17, mode2, i18, this.f1347n, this.f1348o, i13, iMax);
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
        if (this.f1345l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f1345l && (childAt2 instanceof androidx.constraintlayout.widget.d)) {
                    this.f1343j = ((androidx.constraintlayout.widget.d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f1343j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f1336c.v1();
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
        this.f1353t.clear();
        this.f1353t.put(0, this.f1336c);
        this.f1353t.put(getId(), this.f1336c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f1353t.put(childAt4.getId(), r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            c2.e eVarR2 = r(childAt5);
            if (eVarR2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1336c.a(eVarR2);
                e(zIsInEditMode, childAt5, eVarR2, bVar, this.f1353t);
            }
        }
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1346m == null) {
                this.f1346m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1346m.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1335a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.f1336c = new f();
        this.f1337d = 0;
        this.f1338e = 0;
        this.f1339f = Integer.MAX_VALUE;
        this.f1340g = Integer.MAX_VALUE;
        this.f1341h = true;
        this.f1342i = 257;
        this.f1343j = null;
        this.f1344k = null;
        this.f1345l = -1;
        this.f1346m = new HashMap<>();
        this.f1347n = -1;
        this.f1348o = -1;
        this.f1349p = -1;
        this.f1350q = -1;
        this.f1351r = 0;
        this.f1352s = 0;
        this.f1353t = new SparseArray<>();
        this.f1354u = new c(this);
        this.f1355v = 0;
        this.f1356w = 0;
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
        public int f1359a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f1360a0;
        public int b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f1361b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1362c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f1363c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1364d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1365d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1366e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f1367e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1368f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f1369f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1370g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public boolean f1371g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1372h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f1373h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1374i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f1375i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1376j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f1377j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1378k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public boolean f1379k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1380l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f1381l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1382m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public int f1383m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1384n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f1385n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1386o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f1387o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1388p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f1389p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1390q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1391q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f1392r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f1393r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1394s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f1395s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1396t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f1397t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1398u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f1399u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1400v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public c2.e f1401v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1402w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f1403w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1404x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1405y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f1406z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1407a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1407a = sparseIntArray;
                sparseIntArray.append(g2.d.f18409z2, 64);
                sparseIntArray.append(g2.d.f18213c2, 65);
                sparseIntArray.append(g2.d.f18294l2, 8);
                sparseIntArray.append(g2.d.f18303m2, 9);
                sparseIntArray.append(g2.d.f18321o2, 10);
                sparseIntArray.append(g2.d.f18330p2, 11);
                sparseIntArray.append(g2.d.f18379v2, 12);
                sparseIntArray.append(g2.d.f18371u2, 13);
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
                sparseIntArray.append(g2.d.f18196a2, 6);
                sparseIntArray.append(g2.d.f18204b2, 7);
                sparseIntArray.append(g2.d.I1, 67);
                sparseIntArray.append(g2.d.W0, 1);
                sparseIntArray.append(g2.d.f18339q2, 17);
                sparseIntArray.append(g2.d.f18347r2, 18);
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
                sparseIntArray.append(g2.d.f18258h2, 29);
                sparseIntArray.append(g2.d.f18386w2, 30);
                sparseIntArray.append(g2.d.W1, 44);
                sparseIntArray.append(g2.d.f18276j2, 45);
                sparseIntArray.append(g2.d.f18401y2, 46);
                sparseIntArray.append(g2.d.f18267i2, 47);
                sparseIntArray.append(g2.d.f18393x2, 48);
                sparseIntArray.append(g2.d.L1, 27);
                sparseIntArray.append(g2.d.K1, 28);
                sparseIntArray.append(g2.d.A2, 31);
                sparseIntArray.append(g2.d.f18222d2, 32);
                sparseIntArray.append(g2.d.C2, 33);
                sparseIntArray.append(g2.d.B2, 34);
                sparseIntArray.append(g2.d.D2, 35);
                sparseIntArray.append(g2.d.f18240f2, 36);
                sparseIntArray.append(g2.d.f18231e2, 37);
                sparseIntArray.append(g2.d.f18249g2, 38);
                sparseIntArray.append(g2.d.f18285k2, 39);
                sparseIntArray.append(g2.d.f18363t2, 40);
                sparseIntArray.append(g2.d.f18312n2, 41);
                sparseIntArray.append(g2.d.Q1, 42);
                sparseIntArray.append(g2.d.M1, 43);
                sparseIntArray.append(g2.d.f18355s2, 51);
                sparseIntArray.append(g2.d.P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1359a = -1;
            this.b = -1;
            this.f1362c = -1.0f;
            this.f1364d = true;
            this.f1366e = -1;
            this.f1368f = -1;
            this.f1370g = -1;
            this.f1372h = -1;
            this.f1374i = -1;
            this.f1376j = -1;
            this.f1378k = -1;
            this.f1380l = -1;
            this.f1382m = -1;
            this.f1384n = -1;
            this.f1386o = -1;
            this.f1388p = -1;
            this.f1390q = 0;
            this.f1392r = 0.0f;
            this.f1394s = -1;
            this.f1396t = -1;
            this.f1398u = -1;
            this.f1400v = -1;
            this.f1402w = Integer.MIN_VALUE;
            this.f1404x = Integer.MIN_VALUE;
            this.f1405y = Integer.MIN_VALUE;
            this.f1406z = Integer.MIN_VALUE;
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
            this.f1360a0 = false;
            this.f1361b0 = false;
            this.f1363c0 = null;
            this.f1365d0 = 0;
            this.f1367e0 = true;
            this.f1369f0 = true;
            this.f1371g0 = false;
            this.f1373h0 = false;
            this.f1375i0 = false;
            this.f1377j0 = false;
            this.f1379k0 = false;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1389p0 = Integer.MIN_VALUE;
            this.f1391q0 = Integer.MIN_VALUE;
            this.f1393r0 = 0.5f;
            this.f1401v0 = new c2.e();
            this.f1403w0 = false;
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
                this.f1359a = bVar.f1359a;
                this.b = bVar.b;
                this.f1362c = bVar.f1362c;
                this.f1364d = bVar.f1364d;
                this.f1366e = bVar.f1366e;
                this.f1368f = bVar.f1368f;
                this.f1370g = bVar.f1370g;
                this.f1372h = bVar.f1372h;
                this.f1374i = bVar.f1374i;
                this.f1376j = bVar.f1376j;
                this.f1378k = bVar.f1378k;
                this.f1380l = bVar.f1380l;
                this.f1382m = bVar.f1382m;
                this.f1384n = bVar.f1384n;
                this.f1386o = bVar.f1386o;
                this.f1388p = bVar.f1388p;
                this.f1390q = bVar.f1390q;
                this.f1392r = bVar.f1392r;
                this.f1394s = bVar.f1394s;
                this.f1396t = bVar.f1396t;
                this.f1398u = bVar.f1398u;
                this.f1400v = bVar.f1400v;
                this.f1402w = bVar.f1402w;
                this.f1404x = bVar.f1404x;
                this.f1405y = bVar.f1405y;
                this.f1406z = bVar.f1406z;
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
                this.f1360a0 = bVar.f1360a0;
                this.f1361b0 = bVar.f1361b0;
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
                this.f1367e0 = bVar.f1367e0;
                this.f1369f0 = bVar.f1369f0;
                this.f1371g0 = bVar.f1371g0;
                this.f1373h0 = bVar.f1373h0;
                this.f1381l0 = bVar.f1381l0;
                this.f1383m0 = bVar.f1383m0;
                this.f1385n0 = bVar.f1385n0;
                this.f1387o0 = bVar.f1387o0;
                this.f1389p0 = bVar.f1389p0;
                this.f1391q0 = bVar.f1391q0;
                this.f1393r0 = bVar.f1393r0;
                this.f1363c0 = bVar.f1363c0;
                this.f1365d0 = bVar.f1365d0;
                this.f1401v0 = bVar.f1401v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public void a() {
            this.f1373h0 = false;
            this.f1367e0 = true;
            this.f1369f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1360a0) {
                this.f1367e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1361b0) {
                this.f1369f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1367e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1360a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1369f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1361b0 = true;
                }
            }
            if (this.f1362c == -1.0f && this.f1359a == -1 && this.b == -1) {
                return;
            }
            this.f1373h0 = true;
            this.f1367e0 = true;
            this.f1369f0 = true;
            if (!(this.f1401v0 instanceof h)) {
                this.f1401v0 = new h();
            }
            ((h) this.f1401v0).B1(this.Z);
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
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1389p0 = this.f1402w;
            this.f1391q0 = this.f1405y;
            float f10 = this.G;
            this.f1393r0 = f10;
            int i17 = this.f1359a;
            this.f1395s0 = i17;
            int i18 = this.b;
            this.f1397t0 = i18;
            float f11 = this.f1362c;
            this.f1399u0 = f11;
            if (z11) {
                int i19 = this.f1394s;
                if (i19 != -1) {
                    this.f1385n0 = i19;
                } else {
                    int i20 = this.f1396t;
                    if (i20 != -1) {
                        this.f1387o0 = i20;
                    } else {
                        i11 = this.f1398u;
                        if (i11 != -1) {
                            this.f1383m0 = i11;
                            z10 = true;
                        }
                        i12 = this.f1400v;
                        if (i12 != -1) {
                            this.f1381l0 = i12;
                            z10 = true;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f1391q0 = i13;
                        }
                        i14 = this.B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f1389p0 = i14;
                        }
                        if (z10) {
                            this.f1393r0 = 1.0f - f10;
                        }
                        if (this.f1373h0 && this.Z == 1 && this.f1364d) {
                            if (f11 != -1.0f) {
                                this.f1399u0 = 1.0f - f11;
                                this.f1395s0 = -1;
                                this.f1397t0 = -1;
                            } else if (i17 != -1) {
                                this.f1397t0 = i17;
                                this.f1395s0 = -1;
                                this.f1399u0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f1395s0 = i18;
                                this.f1397t0 = -1;
                                this.f1399u0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f1398u;
                if (i11 != -1) {
                    this.f1383m0 = i11;
                    z10 = true;
                }
                i12 = this.f1400v;
                if (i12 != -1) {
                    this.f1381l0 = i12;
                    z10 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f1391q0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f1389p0 = i14;
                }
                if (z10) {
                    this.f1393r0 = 1.0f - f10;
                }
                if (this.f1373h0) {
                    if (f11 != -1.0f) {
                        this.f1399u0 = 1.0f - f11;
                        this.f1395s0 = -1;
                        this.f1397t0 = -1;
                    } else if (i17 != -1) {
                        this.f1397t0 = i17;
                        this.f1395s0 = -1;
                        this.f1399u0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f1395s0 = i18;
                        this.f1397t0 = -1;
                        this.f1399u0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f1394s;
                if (i21 != -1) {
                    this.f1383m0 = i21;
                }
                int i22 = this.f1396t;
                if (i22 != -1) {
                    this.f1381l0 = i22;
                }
                int i23 = this.f1398u;
                if (i23 != -1) {
                    this.f1385n0 = i23;
                }
                int i24 = this.f1400v;
                if (i24 != -1) {
                    this.f1387o0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f1389p0 = i25;
                }
                int i26 = this.B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f1391q0 = i26;
                }
            }
            if (this.f1398u == -1 && this.f1400v == -1 && this.f1396t == -1 && this.f1394s == -1) {
                int i27 = this.f1370g;
                if (i27 != -1) {
                    this.f1385n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f1372h;
                    if (i28 != -1) {
                        this.f1387o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f1366e;
                if (i29 != -1) {
                    this.f1381l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f1368f;
                if (i30 != -1) {
                    this.f1383m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1359a = -1;
            this.b = -1;
            this.f1362c = -1.0f;
            this.f1364d = true;
            this.f1366e = -1;
            this.f1368f = -1;
            this.f1370g = -1;
            this.f1372h = -1;
            this.f1374i = -1;
            this.f1376j = -1;
            this.f1378k = -1;
            this.f1380l = -1;
            this.f1382m = -1;
            this.f1384n = -1;
            this.f1386o = -1;
            this.f1388p = -1;
            this.f1390q = 0;
            this.f1392r = 0.0f;
            this.f1394s = -1;
            this.f1396t = -1;
            this.f1398u = -1;
            this.f1400v = -1;
            this.f1402w = Integer.MIN_VALUE;
            this.f1404x = Integer.MIN_VALUE;
            this.f1405y = Integer.MIN_VALUE;
            this.f1406z = Integer.MIN_VALUE;
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
            this.f1360a0 = false;
            this.f1361b0 = false;
            this.f1363c0 = null;
            this.f1365d0 = 0;
            this.f1367e0 = true;
            this.f1369f0 = true;
            this.f1371g0 = false;
            this.f1373h0 = false;
            this.f1375i0 = false;
            this.f1377j0 = false;
            this.f1379k0 = false;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1389p0 = Integer.MIN_VALUE;
            this.f1391q0 = Integer.MIN_VALUE;
            this.f1393r0 = 0.5f;
            this.f1401v0 = new c2.e();
            this.f1403w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f1407a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1388p);
                        this.f1388p = resourceId;
                        if (resourceId == -1) {
                            this.f1388p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f1390q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1390q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f1392r) % 360.0f;
                        this.f1392r = f10;
                        if (f10 < 0.0f) {
                            this.f1392r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f1359a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1359a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.f1362c = typedArrayObtainStyledAttributes.getFloat(index, this.f1362c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1366e);
                        this.f1366e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1366e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1368f);
                        this.f1368f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1368f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1370g);
                        this.f1370g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1370g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1372h);
                        this.f1372h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1372h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1374i);
                        this.f1374i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1374i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1376j);
                        this.f1376j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1376j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1378k);
                        this.f1378k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1378k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1380l);
                        this.f1380l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1380l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1382m);
                        this.f1382m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1382m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1394s);
                        this.f1394s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1394s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1396t);
                        this.f1396t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1396t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1398u);
                        this.f1398u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1398u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1400v);
                        this.f1400v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1400v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f1402w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1402w);
                        break;
                    case 22:
                        this.f1404x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1404x);
                        break;
                    case 23:
                        this.f1405y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1405y);
                        break;
                    case 24:
                        this.f1406z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1406z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f1360a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1360a0);
                        break;
                    case 28:
                        this.f1361b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1361b0);
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
                                this.f1363c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1384n);
                                this.f1384n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1384n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1386o);
                                this.f1386o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1386o = typedArrayObtainStyledAttributes.getInt(index, -1);
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
                                        this.f1365d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1365d0);
                                        break;
                                    case 67:
                                        this.f1364d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1364d);
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
            this.f1359a = -1;
            this.b = -1;
            this.f1362c = -1.0f;
            this.f1364d = true;
            this.f1366e = -1;
            this.f1368f = -1;
            this.f1370g = -1;
            this.f1372h = -1;
            this.f1374i = -1;
            this.f1376j = -1;
            this.f1378k = -1;
            this.f1380l = -1;
            this.f1382m = -1;
            this.f1384n = -1;
            this.f1386o = -1;
            this.f1388p = -1;
            this.f1390q = 0;
            this.f1392r = 0.0f;
            this.f1394s = -1;
            this.f1396t = -1;
            this.f1398u = -1;
            this.f1400v = -1;
            this.f1402w = Integer.MIN_VALUE;
            this.f1404x = Integer.MIN_VALUE;
            this.f1405y = Integer.MIN_VALUE;
            this.f1406z = Integer.MIN_VALUE;
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
            this.f1360a0 = false;
            this.f1361b0 = false;
            this.f1363c0 = null;
            this.f1365d0 = 0;
            this.f1367e0 = true;
            this.f1369f0 = true;
            this.f1371g0 = false;
            this.f1373h0 = false;
            this.f1375i0 = false;
            this.f1377j0 = false;
            this.f1379k0 = false;
            this.f1381l0 = -1;
            this.f1383m0 = -1;
            this.f1385n0 = -1;
            this.f1387o0 = -1;
            this.f1389p0 = Integer.MIN_VALUE;
            this.f1391q0 = Integer.MIN_VALUE;
            this.f1393r0 = 0.5f;
            this.f1401v0 = new c2.e();
            this.f1403w0 = false;
        }
    }
}
