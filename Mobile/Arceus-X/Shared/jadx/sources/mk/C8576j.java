package mk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: renamed from: mk.j */
/* JADX INFO: loaded from: classes2.dex */
public class C8576j {

    /* JADX INFO: renamed from: i */
    public a f31507i;

    /* JADX INFO: renamed from: a */
    public Point f31499a = new Point();

    /* JADX INFO: renamed from: b */
    public Point f31500b = new Point();

    /* JADX INFO: renamed from: c */
    public Point f31501c = new Point();

    /* JADX INFO: renamed from: d */
    public Point f31502d = new Point();

    /* JADX INFO: renamed from: g */
    public int f31505g = -1;

    /* JADX INFO: renamed from: h */
    public float f31506h = 1.0f;

    /* JADX INFO: renamed from: e */
    public int f31503e = -1;

    /* JADX INFO: renamed from: f */
    public int f31504f = -1;

    /* JADX INFO: renamed from: mk.j$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo34560b(C8576j c8576j);
    }

    public C8576j(a aVar) {
        this.f31507i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public Point m34593a() {
        return this.f31503e != -1 ? this.f31501c : new Point();
    }

    /* JADX INFO: renamed from: b */
    public Point m34594b() {
        return this.f31504f != -1 ? this.f31502d : new Point();
    }

    /* JADX INFO: renamed from: c */
    public float m34595c() {
        return this.f31506h;
    }

    /* JADX INFO: renamed from: d */
    public int m34596d() {
        return this.f31505g;
    }

    /* JADX INFO: renamed from: e */
    public boolean m34597e(MotionEvent motionEvent) {
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f31505g = 2;
                    if (this.f31503e != -1 && this.f31504f != -1) {
                        this.f31507i.mo34560b(this);
                    }
                    this.f31506h = 1.0f;
                    this.f31503e = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f31503e;
                    if (i10 != -1 && this.f31504f != -1) {
                        this.f31505g = 1;
                        this.f31501c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(i10));
                        this.f31501c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31503e));
                        this.f31502d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31504f));
                        this.f31502d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31504f));
                        m34598f();
                        a aVar = this.f31507i;
                        if (aVar != null) {
                            aVar.mo34560b(this);
                        }
                    }
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        this.f31505g = 2;
                        if (this.f31503e != -1 && this.f31504f != -1) {
                            this.f31507i.mo34560b(this);
                        }
                        this.f31506h = 1.0f;
                        this.f31504f = -1;
                    }
                } else if (this.f31504f == -1) {
                    this.f31504f = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f31499a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31503e));
                    this.f31499a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31503e));
                    this.f31500b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31504f));
                    this.f31500b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31504f));
                    this.f31501c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31503e));
                    this.f31501c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31503e));
                    this.f31502d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31504f));
                    this.f31502d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31504f));
                    this.f31505g = 0;
                    if (this.f31503e != -1) {
                        this.f31507i.mo34560b(this);
                    }
                }
            } else if (this.f31503e == -1) {
                this.f31503e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f31504f = -1;
                this.f31505g = 0;
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m34598f() {
        Point point = this.f31500b;
        int i10 = point.x;
        Point point2 = this.f31499a;
        double dSqrt = Math.sqrt(Math.pow(i10 - point2.x, 2.0d) + Math.pow(point.y - point2.y, 2.0d));
        Point point3 = this.f31502d;
        int i11 = point3.x;
        Point point4 = this.f31501c;
        double dSqrt2 = Math.sqrt(Math.pow(i11 - point4.x, 2.0d) + Math.pow(point3.y - point4.y, 2.0d));
        if (dSqrt != 0.0d) {
            this.f31506h = (float) (dSqrt2 / dSqrt);
        } else {
            this.f31506h = 1.0f;
        }
    }
}
