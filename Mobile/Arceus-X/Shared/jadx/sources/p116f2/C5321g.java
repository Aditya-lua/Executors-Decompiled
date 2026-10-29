package p116f2;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p003a2.AbstractC0056a;
import p003a2.C0057b;
import p003a2.C0058c;
import p091e2.AbstractC4746b;
import p091e2.AbstractC4747c;
import p091e2.AbstractC4748d;
import p091e2.C4745a;

/* JADX INFO: renamed from: f2.g */
/* JADX INFO: loaded from: classes.dex */
public class C5321g {

    /* JADX INFO: renamed from: a */
    public boolean f20681a;

    /* JADX INFO: renamed from: b */
    public C5325k f20682b;

    /* JADX INFO: renamed from: c */
    public C5325k f20683c;

    /* JADX INFO: renamed from: d */
    public C5320f f20684d;

    /* JADX INFO: renamed from: e */
    public C5320f f20685e;

    /* JADX INFO: renamed from: f */
    public AbstractC0056a[] f20686f;

    /* JADX INFO: renamed from: g */
    public AbstractC0056a f20687g;

    /* JADX INFO: renamed from: h */
    public float f20688h;

    /* JADX INFO: renamed from: i */
    public float f20689i;

    /* JADX INFO: renamed from: j */
    public int[] f20690j;

    /* JADX INFO: renamed from: k */
    public double[] f20691k;

    /* JADX INFO: renamed from: l */
    public double[] f20692l;

    /* JADX INFO: renamed from: m */
    public String[] f20693m;

    /* JADX INFO: renamed from: n */
    public float[] f20694n;

    /* JADX INFO: renamed from: o */
    public ArrayList<C5325k> f20695o;

    /* JADX INFO: renamed from: p */
    public HashMap<String, AbstractC4748d> f20696p;

    /* JADX INFO: renamed from: q */
    public HashMap<String, AbstractC4747c> f20697q;

    /* JADX INFO: renamed from: r */
    public HashMap<String, AbstractC4746b> f20698r;

    /* JADX INFO: renamed from: s */
    public C5319e[] f20699s;

    /* JADX INFO: renamed from: t */
    public int f20700t;

    /* JADX INFO: renamed from: u */
    public View f20701u;

    /* JADX INFO: renamed from: v */
    public int f20702v;

    /* JADX INFO: renamed from: w */
    public float f20703w;

    /* JADX INFO: renamed from: x */
    public Interpolator f20704x;

    /* JADX INFO: renamed from: y */
    public boolean f20705y;

    /* JADX INFO: renamed from: a */
    public final float m24629a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f20689i;
            if (f12 != 1.0d) {
                float f13 = this.f20688h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        C0057b c0057b = this.f20682b.f20772a;
        ArrayList<C5325k> arrayList = this.f20695o;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            C5325k c5325k = arrayList.get(i10);
            i10++;
            C5325k c5325k2 = c5325k;
            C0057b c0057b2 = c5325k2.f20772a;
            if (c0057b2 != null) {
                float f15 = c5325k2.f20774c;
                if (f15 < f10) {
                    c0057b = c0057b2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = c5325k2.f20774c;
                }
            }
        }
        if (c0057b != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) c0057b.m126a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) c0057b.m127b(d10);
            }
        }
        return f10;
    }

    /* JADX INFO: renamed from: b */
    public void m24630b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f20686f[0].m123a(d10, dArr);
        this.f20686f[0].m125c(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f20682b.m24668b(d10, this.f20690j, dArr, fArr, dArr2, fArr2);
    }

    /* JADX INFO: renamed from: c */
    public boolean m24631c(View view, float f10, long j10, C0058c c0058c) {
        boolean z10;
        View view2;
        View view3 = view;
        float fM24629a = m24629a(f10, null);
        int i10 = this.f20702v;
        if (i10 != AbstractC5318d.f20678a) {
            float f11 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fM24629a / f11)) * f11;
            float f12 = (fM24629a % f11) / f11;
            if (!Float.isNaN(this.f20703w)) {
                f12 = (f12 + this.f20703w) % 1.0f;
            }
            Interpolator interpolator = this.f20704x;
            fM24629a = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fM24629a;
        HashMap<String, AbstractC4747c> map = this.f20697q;
        if (map != null) {
            Iterator<AbstractC4747c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m23135a(view3, f13);
            }
        }
        HashMap<String, AbstractC4748d> map2 = this.f20696p;
        if (map2 != null) {
            boolean zM23137a = false;
            for (AbstractC4748d abstractC4748d : map2.values()) {
                if (!(abstractC4748d instanceof AbstractC4748d.a)) {
                    zM23137a |= abstractC4748d.m23137a(view3, f13, j10, c0058c);
                    view3 = view;
                }
            }
            z10 = zM23137a;
        } else {
            z10 = false;
        }
        AbstractC0056a[] abstractC0056aArr = this.f20686f;
        if (abstractC0056aArr != null) {
            double d10 = f13;
            abstractC0056aArr[0].m123a(d10, this.f20691k);
            this.f20686f[0].m125c(d10, this.f20692l);
            if (this.f20705y) {
                view2 = view;
            } else {
                this.f20682b.m24669c(f13, view, this.f20690j, this.f20691k, this.f20692l, null, this.f20681a);
                f13 = f13;
                view2 = view;
                this.f20681a = false;
            }
            if (this.f20700t != AbstractC5318d.f20678a) {
                if (this.f20701u == null) {
                    this.f20701u = ((View) view2.getParent()).findViewById(this.f20700t);
                }
                View view4 = this.f20701u;
                if (view4 != null) {
                    float top = (view4.getTop() + this.f20701u.getBottom()) / 2.0f;
                    float left = (this.f20701u.getLeft() + this.f20701u.getRight()) / 2.0f;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left2 = left - view2.getLeft();
                        float top2 = top - view2.getTop();
                        view2.setPivotX(left2);
                        view2.setPivotY(top2);
                    }
                }
            }
            HashMap<String, AbstractC4747c> map3 = this.f20697q;
            if (map3 != null) {
                for (AbstractC4747c abstractC4747c : map3.values()) {
                    if (abstractC4747c instanceof AbstractC4747c.a) {
                        double[] dArr = this.f20692l;
                        if (dArr.length > 1) {
                            ((AbstractC4747c.a) abstractC4747c).m23136b(view2, f13, dArr[0], dArr[1]);
                        }
                    }
                }
            }
            int i11 = 1;
            while (true) {
                AbstractC0056a[] abstractC0056aArr2 = this.f20686f;
                if (i11 >= abstractC0056aArr2.length) {
                    break;
                }
                abstractC0056aArr2[i11].m124b(d10, this.f20694n);
                C4745a.m23132b(this.f20682b.f20786o.get(this.f20693m[i11 - 1]), view2, this.f20694n);
                i11++;
            }
            C5320f c5320f = this.f20684d;
            if (c5320f.f20679a == 0) {
                if (f13 <= 0.0f) {
                    view2.setVisibility(c5320f.f20680b);
                } else if (f13 >= 1.0f) {
                    view2.setVisibility(this.f20685e.f20680b);
                } else if (this.f20685e.f20680b != c5320f.f20680b) {
                    view2.setVisibility(0);
                }
            }
            if (this.f20699s != null) {
                int i12 = 0;
                while (true) {
                    C5319e[] c5319eArr = this.f20699s;
                    if (i12 >= c5319eArr.length) {
                        break;
                    }
                    c5319eArr[i12].m24628a(f13, view2);
                    i12++;
                }
            }
        } else {
            view2 = view;
            C5325k c5325k = this.f20682b;
            float f14 = c5325k.f20776e;
            C5325k c5325k2 = this.f20683c;
            float f15 = f14 + ((c5325k2.f20776e - f14) * f13);
            float f16 = c5325k.f20777f;
            float f17 = f16 + ((c5325k2.f20777f - f16) * f13);
            float f18 = c5325k.f20778g;
            float f19 = c5325k2.f20778g;
            float f20 = c5325k.f20779h;
            float f21 = c5325k2.f20779h;
            float f22 = f15 + 0.5f;
            int i13 = (int) f22;
            float f23 = f17 + 0.5f;
            int i14 = (int) f23;
            int i15 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i16 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f19 != f18 || f21 != f20 || this.f20681a) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f20681a = false;
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap<String, AbstractC4746b> map4 = this.f20698r;
        if (map4 != null) {
            for (AbstractC4746b abstractC4746b : map4.values()) {
                if (abstractC4746b instanceof AbstractC4746b.a) {
                    double[] dArr2 = this.f20692l;
                    ((AbstractC4746b.a) abstractC4746b).m23134b(view2, f13, dArr2[0], dArr2[1]);
                } else {
                    abstractC4746b.m23133a(view2, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.f20682b.f20776e + " y: " + this.f20682b.f20777f + " end: x: " + this.f20683c.f20776e + " y: " + this.f20683c.f20777f;
    }
}
