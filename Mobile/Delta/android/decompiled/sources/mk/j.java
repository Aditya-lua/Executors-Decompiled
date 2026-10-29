package mk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f24389i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f24382a = new Point();
    public Point b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f24383c = new Point();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f24384d = new Point();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24387g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24388h = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24385e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24386f = -1;

    public interface a {
        void b(j jVar);
    }

    public j(a aVar) {
        this.f24389i = aVar;
    }

    public Point a() {
        return this.f24385e != -1 ? this.f24383c : new Point();
    }

    public Point b() {
        return this.f24386f != -1 ? this.f24384d : new Point();
    }

    public float c() {
        return this.f24388h;
    }

    public int d() {
        return this.f24387g;
    }

    public boolean e(MotionEvent motionEvent) {
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f24387g = 2;
                    if (this.f24385e != -1 && this.f24386f != -1) {
                        this.f24389i.b(this);
                    }
                    this.f24388h = 1.0f;
                    this.f24385e = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f24385e;
                    if (i10 != -1 && this.f24386f != -1) {
                        this.f24387g = 1;
                        this.f24383c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(i10));
                        this.f24383c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24385e));
                        this.f24384d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f24386f));
                        this.f24384d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24386f));
                        f();
                        a aVar = this.f24389i;
                        if (aVar != null) {
                            aVar.b(this);
                        }
                    }
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        this.f24387g = 2;
                        if (this.f24385e != -1 && this.f24386f != -1) {
                            this.f24389i.b(this);
                        }
                        this.f24388h = 1.0f;
                        this.f24386f = -1;
                    }
                } else if (this.f24386f == -1) {
                    this.f24386f = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f24382a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f24385e));
                    this.f24382a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24385e));
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f24386f));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24386f));
                    this.f24383c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f24385e));
                    this.f24383c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24385e));
                    this.f24384d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f24386f));
                    this.f24384d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24386f));
                    this.f24387g = 0;
                    if (this.f24385e != -1) {
                        this.f24389i.b(this);
                    }
                }
            } else if (this.f24385e == -1) {
                this.f24385e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f24386f = -1;
                this.f24387g = 0;
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public final void f() {
        Point point = this.b;
        int i10 = point.x;
        Point point2 = this.f24382a;
        double dSqrt = Math.sqrt(Math.pow(i10 - point2.x, 2.0d) + Math.pow(point.y - point2.y, 2.0d));
        Point point3 = this.f24384d;
        int i11 = point3.x;
        Point point4 = this.f24383c;
        double dSqrt2 = Math.sqrt(Math.pow(i11 - point4.x, 2.0d) + Math.pow(point3.y - point4.y, 2.0d));
        if (dSqrt != 0.0d) {
            this.f24388h = (float) (dSqrt2 / dSqrt);
        } else {
            this.f24388h = 1.0f;
        }
    }
}
