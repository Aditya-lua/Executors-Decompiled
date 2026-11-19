package uk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f33486i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f33479a = new Point();
    public Point b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f33480c = new Point();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f33481d = new Point();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33484g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f33485h = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33482e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33483f = -1;

    public interface a {
        void b(j jVar);
    }

    public j(a aVar) {
        this.f33486i = aVar;
    }

    public Point a() {
        return this.f33482e != -1 ? this.f33480c : new Point();
    }

    public Point b() {
        return this.f33483f != -1 ? this.f33481d : new Point();
    }

    public float c() {
        return this.f33485h;
    }

    public int d() {
        return this.f33484g;
    }

    public boolean e(MotionEvent motionEvent) {
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f33484g = 2;
                    if (this.f33482e != -1 && this.f33483f != -1) {
                        this.f33486i.b(this);
                    }
                    this.f33485h = 1.0f;
                    this.f33482e = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f33482e;
                    if (i10 != -1 && this.f33483f != -1) {
                        this.f33484g = 1;
                        this.f33480c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(i10));
                        this.f33480c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33482e));
                        this.f33481d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33483f));
                        this.f33481d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33483f));
                        f();
                        a aVar = this.f33486i;
                        if (aVar != null) {
                            aVar.b(this);
                        }
                    }
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        this.f33484g = 2;
                        if (this.f33482e != -1 && this.f33483f != -1) {
                            this.f33486i.b(this);
                        }
                        this.f33485h = 1.0f;
                        this.f33483f = -1;
                    }
                } else if (this.f33483f == -1) {
                    this.f33483f = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f33479a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33482e));
                    this.f33479a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33482e));
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33483f));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33483f));
                    this.f33480c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33482e));
                    this.f33480c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33482e));
                    this.f33481d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33483f));
                    this.f33481d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33483f));
                    this.f33484g = 0;
                    if (this.f33482e != -1) {
                        this.f33486i.b(this);
                    }
                }
            } else if (this.f33482e == -1) {
                this.f33482e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f33483f = -1;
                this.f33484g = 0;
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public final void f() {
        Point point = this.b;
        int i10 = point.x;
        Point point2 = this.f33479a;
        double dSqrt = Math.sqrt(Math.pow(i10 - point2.x, 2.0d) + Math.pow(point.y - point2.y, 2.0d));
        Point point3 = this.f33481d;
        int i11 = point3.x;
        Point point4 = this.f33480c;
        double dSqrt2 = Math.sqrt(Math.pow(i11 - point4.x, 2.0d) + Math.pow(point3.y - point4.y, 2.0d));
        if (dSqrt != 0.0d) {
            this.f33485h = (float) (dSqrt2 / dSqrt);
        } else {
            this.f33485h = 1.0f;
        }
    }
}
