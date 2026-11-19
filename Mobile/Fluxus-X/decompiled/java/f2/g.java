package f2;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15166a;
    public k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f15167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f15168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f15169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2.a[] f15170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a2.a f15171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f15174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[] f15175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double[] f15176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f15177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f15178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<k> f15179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap<String, e2.d> f15180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap<String, e2.c> f15181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashMap<String, e2.b> f15182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e[] f15183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f15185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Interpolator f15188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15189y;

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f15173i;
            if (f12 != 1.0d) {
                float f13 = this.f15172h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        a2.b bVar = this.b.f15231a;
        ArrayList<k> arrayList = this.f15179o;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            k kVar = arrayList.get(i10);
            i10++;
            k kVar2 = kVar;
            a2.b bVar2 = kVar2.f15231a;
            if (bVar2 != null) {
                float f15 = kVar2.f15232c;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = kVar2.f15232c;
                }
            }
        }
        if (bVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) bVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f15170f[0].a(d10, dArr);
        this.f15170f[0].c(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.b.b(d10, this.f15174j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f10, long j10, a2.c cVar) {
        boolean z10;
        View view2;
        View view3 = view;
        float fA = a(f10, null);
        int i10 = this.f15186v;
        if (i10 != d.f15164a) {
            float f11 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fA / f11)) * f11;
            float f12 = (fA % f11) / f11;
            if (!Float.isNaN(this.f15187w)) {
                f12 = (f12 + this.f15187w) % 1.0f;
            }
            Interpolator interpolator = this.f15188x;
            fA = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fA;
        HashMap<String, e2.c> map = this.f15181q;
        if (map != null) {
            Iterator<e2.c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().a(view3, f13);
            }
        }
        HashMap<String, e2.d> map2 = this.f15180p;
        if (map2 != null) {
            boolean zA = false;
            for (e2.d dVar : map2.values()) {
                if (!(dVar instanceof e2.d.a)) {
                    zA |= dVar.a(view3, f13, j10, cVar);
                    view3 = view;
                }
            }
            z10 = zA;
        } else {
            z10 = false;
        }
        a2.a[] aVarArr = this.f15170f;
        if (aVarArr != null) {
            double d10 = f13;
            aVarArr[0].a(d10, this.f15175k);
            this.f15170f[0].c(d10, this.f15176l);
            if (this.f15189y) {
                view2 = view;
            } else {
                this.b.c(f13, view, this.f15174j, this.f15175k, this.f15176l, null, this.f15166a);
                f13 = f13;
                view2 = view;
                this.f15166a = false;
            }
            if (this.f15184t != d.f15164a) {
                if (this.f15185u == null) {
                    this.f15185u = ((View) view2.getParent()).findViewById(this.f15184t);
                }
                View view4 = this.f15185u;
                if (view4 != null) {
                    float top = (view4.getTop() + this.f15185u.getBottom()) / 2.0f;
                    float left = (this.f15185u.getLeft() + this.f15185u.getRight()) / 2.0f;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left2 = left - view2.getLeft();
                        float top2 = top - view2.getTop();
                        view2.setPivotX(left2);
                        view2.setPivotY(top2);
                    }
                }
            }
            HashMap<String, e2.c> map3 = this.f15181q;
            if (map3 != null) {
                for (e2.c cVar2 : map3.values()) {
                    if (cVar2 instanceof e2.c.a) {
                        double[] dArr = this.f15176l;
                        if (dArr.length > 1) {
                            ((e2.c.a) cVar2).b(view2, f13, dArr[0], dArr[1]);
                        }
                    }
                }
            }
            int i11 = 1;
            while (true) {
                a2.a[] aVarArr2 = this.f15170f;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i11].b(d10, this.f15178n);
                e2.a.b(this.b.f15244o.get(this.f15177m[i11 - 1]), view2, this.f15178n);
                i11++;
            }
            f fVar = this.f15168d;
            if (fVar.f15165a == 0) {
                if (f13 <= 0.0f) {
                    view2.setVisibility(fVar.b);
                } else if (f13 >= 1.0f) {
                    view2.setVisibility(this.f15169e.b);
                } else if (this.f15169e.b != fVar.b) {
                    view2.setVisibility(0);
                }
            }
            if (this.f15183s != null) {
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f15183s;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i12].a(f13, view2);
                    i12++;
                }
            }
        } else {
            view2 = view;
            k kVar = this.b;
            float f14 = kVar.f15234e;
            k kVar2 = this.f15167c;
            float f15 = f14 + ((kVar2.f15234e - f14) * f13);
            float f16 = kVar.f15235f;
            float f17 = f16 + ((kVar2.f15235f - f16) * f13);
            float f18 = kVar.f15236g;
            float f19 = kVar2.f15236g;
            float f20 = kVar.f15237h;
            float f21 = kVar2.f15237h;
            float f22 = f15 + 0.5f;
            int i13 = (int) f22;
            float f23 = f17 + 0.5f;
            int i14 = (int) f23;
            int i15 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i16 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f19 != f18 || f21 != f20 || this.f15166a) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f15166a = false;
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap<String, e2.b> map4 = this.f15182r;
        if (map4 != null) {
            for (e2.b bVar : map4.values()) {
                if (bVar instanceof e2.b.a) {
                    double[] dArr2 = this.f15176l;
                    ((e2.b.a) bVar).b(view2, f13, dArr2[0], dArr2[1]);
                } else {
                    bVar.a(view2, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.b.f15234e + " y: " + this.b.f15235f + " end: x: " + this.f15167c.f15234e + " y: " + this.f15167c.f15235f;
    }
}
