package kk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f22868i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f22861a = new Point();
    public Point b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f22862c = new Point();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f22863d = new Point();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22866g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22867h = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22864e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22865f = -1;

    public interface a {
        void a(j jVar);
    }

    public j(a aVar) {
        this.f22868i = aVar;
    }

    public Point a() {
        return this.f22864e != -1 ? this.f22862c : new Point();
    }

    public Point b() {
        return this.f22865f != -1 ? this.f22863d : new Point();
    }

    public float c() {
        return this.f22867h;
    }

    public int d() {
        return this.f22866g;
    }

    public boolean e(MotionEvent motionEvent) {
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f22866g = 2;
                    if (this.f22864e != -1 && this.f22865f != -1) {
                        this.f22868i.a(this);
                    }
                    this.f22867h = 1.0f;
                    this.f22864e = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f22864e;
                    if (i10 != -1 && this.f22865f != -1) {
                        this.f22866g = 1;
                        this.f22862c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(i10));
                        this.f22862c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22864e));
                        this.f22863d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22865f));
                        this.f22863d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22865f));
                        f();
                        a aVar = this.f22868i;
                        if (aVar != null) {
                            aVar.a(this);
                        }
                    }
                } else if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        this.f22866g = 2;
                        if (this.f22864e != -1 && this.f22865f != -1) {
                            this.f22868i.a(this);
                        }
                        this.f22867h = 1.0f;
                        this.f22865f = -1;
                    }
                } else if (this.f22865f == -1) {
                    this.f22865f = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f22861a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22864e));
                    this.f22861a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22864e));
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22865f));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22865f));
                    this.f22862c.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22864e));
                    this.f22862c.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22864e));
                    this.f22863d.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22865f));
                    this.f22863d.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22865f));
                    this.f22866g = 0;
                    if (this.f22864e != -1) {
                        this.f22868i.a(this);
                    }
                }
            } else if (this.f22864e == -1) {
                this.f22864e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f22865f = -1;
                this.f22866g = 0;
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public final void f() {
        Point point = this.b;
        int i10 = point.x;
        Point point2 = this.f22861a;
        double dSqrt = Math.sqrt(Math.pow(i10 - point2.x, 2.0d) + Math.pow(point.y - point2.y, 2.0d));
        Point point3 = this.f22863d;
        int i11 = point3.x;
        Point point4 = this.f22862c;
        double dSqrt2 = Math.sqrt(Math.pow(i11 - point4.x, 2.0d) + Math.pow(point3.y - point4.y, 2.0d));
        if (dSqrt != 0.0d) {
            this.f22867h = (float) (dSqrt2 / dSqrt);
        } else {
            this.f22867h = 1.0f;
        }
    }
}
