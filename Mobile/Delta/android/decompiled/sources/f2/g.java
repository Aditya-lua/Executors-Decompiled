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
    public boolean f16689a;
    public k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f16690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f16691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f16692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2.a[] f16693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a2.a f16694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f16697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[] f16698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double[] f16699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f16700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f16701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<k> f16702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap<String, e2.d> f16703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap<String, e2.c> f16704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashMap<String, e2.b> f16705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e[] f16706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f16708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Interpolator f16711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16712y;

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f16696i;
            if (f12 != 1.0d) {
                float f13 = this.f16695h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        a2.b bVar = this.b.f16754a;
        ArrayList<k> arrayList = this.f16702o;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            k kVar = arrayList.get(i10);
            i10++;
            k kVar2 = kVar;
            a2.b bVar2 = kVar2.f16754a;
            if (bVar2 != null) {
                float f15 = kVar2.f16755c;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = kVar2.f16755c;
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
        this.f16693f[0].a(d10, dArr);
        this.f16693f[0].c(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.b.b(d10, this.f16697j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f10, long j10, a2.c cVar) {
        boolean z10;
        View view2;
        View view3 = view;
        float fA = a(f10, null);
        int i10 = this.f16709v;
        if (i10 != d.f16687a) {
            float f11 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fA / f11)) * f11;
            float f12 = (fA % f11) / f11;
            if (!Float.isNaN(this.f16710w)) {
                f12 = (f12 + this.f16710w) % 1.0f;
            }
            Interpolator interpolator = this.f16711x;
            fA = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fA;
        HashMap<String, e2.c> map = this.f16704q;
        if (map != null) {
            Iterator<e2.c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().a(view3, f13);
            }
        }
        HashMap<String, e2.d> map2 = this.f16703p;
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
        a2.a[] aVarArr = this.f16693f;
        if (aVarArr != null) {
            double d10 = f13;
            aVarArr[0].a(d10, this.f16698k);
            this.f16693f[0].c(d10, this.f16699l);
            if (this.f16712y) {
                view2 = view;
            } else {
                this.b.c(f13, view, this.f16697j, this.f16698k, this.f16699l, null, this.f16689a);
                f13 = f13;
                view2 = view;
                this.f16689a = false;
            }
            if (this.f16707t != d.f16687a) {
                if (this.f16708u == null) {
                    this.f16708u = ((View) view2.getParent()).findViewById(this.f16707t);
                }
                View view4 = this.f16708u;
                if (view4 != null) {
                    float top = (view4.getTop() + this.f16708u.getBottom()) / 2.0f;
                    float left = (this.f16708u.getLeft() + this.f16708u.getRight()) / 2.0f;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left2 = left - view2.getLeft();
                        float top2 = top - view2.getTop();
                        view2.setPivotX(left2);
                        view2.setPivotY(top2);
                    }
                }
            }
            HashMap<String, e2.c> map3 = this.f16704q;
            if (map3 != null) {
                for (e2.c cVar2 : map3.values()) {
                    if (cVar2 instanceof e2.c.a) {
                        double[] dArr = this.f16699l;
                        if (dArr.length > 1) {
                            ((e2.c.a) cVar2).b(view2, f13, dArr[0], dArr[1]);
                        }
                    }
                }
            }
            int i11 = 1;
            while (true) {
                a2.a[] aVarArr2 = this.f16693f;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i11].b(d10, this.f16701n);
                e2.a.b(this.b.f16767o.get(this.f16700m[i11 - 1]), view2, this.f16701n);
                i11++;
            }
            f fVar = this.f16691d;
            if (fVar.f16688a == 0) {
                if (f13 <= 0.0f) {
                    view2.setVisibility(fVar.b);
                } else if (f13 >= 1.0f) {
                    view2.setVisibility(this.f16692e.b);
                } else if (this.f16692e.b != fVar.b) {
                    view2.setVisibility(0);
                }
            }
            if (this.f16706s != null) {
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f16706s;
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
            float f14 = kVar.f16757e;
            k kVar2 = this.f16690c;
            float f15 = f14 + ((kVar2.f16757e - f14) * f13);
            float f16 = kVar.f16758f;
            float f17 = f16 + ((kVar2.f16758f - f16) * f13);
            float f18 = kVar.f16759g;
            float f19 = kVar2.f16759g;
            float f20 = kVar.f16760h;
            float f21 = kVar2.f16760h;
            float f22 = f15 + 0.5f;
            int i13 = (int) f22;
            float f23 = f17 + 0.5f;
            int i14 = (int) f23;
            int i15 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i16 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f19 != f18 || f21 != f20 || this.f16689a) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f16689a = false;
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap<String, e2.b> map4 = this.f16705r;
        if (map4 != null) {
            for (e2.b bVar : map4.values()) {
                if (bVar instanceof e2.b.a) {
                    double[] dArr2 = this.f16699l;
                    ((e2.b.a) bVar).b(view2, f13, dArr2[0], dArr2[1]);
                } else {
                    bVar.a(view2, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.b.f16757e + " y: " + this.b.f16758f + " end: x: " + this.f16690c.f16757e + " y: " + this.f16690c.f16758f;
    }
}
