package uk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f33478h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f33472a = new Point();
    public Point b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f33473c = new Point();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f33476f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33477g = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33474d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33475e = -1;

    public interface a {
        void a(i iVar);
    }

    public i(a aVar) {
        this.f33478h = aVar;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 - f12);
        int i11 = (int) (f11 - f13);
        Point point = this.f33473c;
        Point point2 = this.b;
        int i12 = point2.x;
        Point point3 = this.f33472a;
        int i13 = i12 - point3.x;
        point.x = i13;
        int i14 = point2.y - point3.y;
        point.y = i14;
        double dAtan2 = Math.atan2((i10 * i14) - (i11 * i13), (i13 * i10) + (i14 * i11));
        Point point4 = this.b;
        point4.x = (int) f10;
        point4.y = (int) f11;
        Point point5 = this.f33472a;
        point5.x = (int) f12;
        point5.y = (int) f13;
        this.f33476f -= (float) dAtan2;
    }

    public float b() {
        return this.f33476f;
    }

    public Point c() {
        return this.f33474d != -1 ? this.f33472a : new Point();
    }

    public Point d() {
        return this.f33475e != -1 ? this.b : new Point();
    }

    public int e() {
        return this.f33477g;
    }

    public boolean f(MotionEvent motionEvent) {
        float x5;
        float y10;
        float y11;
        float x10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f33477g = 2;
                if (this.f33474d != -1 && this.f33475e != -1) {
                    this.f33478h.a(this);
                }
                this.f33476f = 0.0f;
                this.f33474d = -1;
            } else if (actionMasked == 2) {
                int i10 = this.f33474d;
                if (i10 != -1 && this.f33475e != -1) {
                    this.f33477g = 1;
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f33475e);
                    if (iFindPointerIndex == -1 || iFindPointerIndex >= motionEvent.getPointerCount()) {
                        x5 = -1.0f;
                        y10 = -1.0f;
                    } else {
                        x5 = motionEvent.getX(motionEvent.findPointerIndex(this.f33474d));
                        y10 = motionEvent.getY(motionEvent.findPointerIndex(this.f33474d));
                    }
                    if (iFindPointerIndex2 == -1 || iFindPointerIndex2 >= motionEvent.getPointerCount()) {
                        y11 = -1.0f;
                        x10 = -1.0f;
                    } else {
                        x10 = motionEvent.getX(motionEvent.findPointerIndex(this.f33475e));
                        y11 = motionEvent.getY(motionEvent.findPointerIndex(this.f33475e));
                    }
                    if (x10 != -1.0f && y11 != -1.0f && x5 != -1.0f && y10 != -1.0f) {
                        a(x10, y11, x5, y10);
                    }
                    a aVar = this.f33478h;
                    if (aVar != null) {
                        aVar.a(this);
                    }
                }
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f33477g = 2;
                    if (this.f33474d != -1 && this.f33475e != -1) {
                        this.f33478h.a(this);
                    }
                    this.f33476f = 0.0f;
                    this.f33475e = -1;
                }
            } else if (this.f33475e == -1) {
                this.f33475e = motionEvent.getPointerId(motionEvent.getActionIndex());
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f33474d);
                int iFindPointerIndex4 = motionEvent.findPointerIndex(this.f33475e);
                if (iFindPointerIndex3 != -1 && iFindPointerIndex3 < motionEvent.getPointerCount()) {
                    this.f33472a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33474d));
                    this.f33472a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33474d));
                }
                if (iFindPointerIndex4 != -1 && iFindPointerIndex4 < motionEvent.getPointerCount()) {
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f33475e));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f33475e));
                }
                Point point = this.f33473c;
                Point point2 = this.b;
                int i11 = point2.x;
                Point point3 = this.f33472a;
                point.x = i11 - point3.x;
                point.y = point2.y - point3.y;
                if (this.f33474d != -1) {
                    this.f33478h.a(this);
                }
            }
        } else if (this.f33474d == -1) {
            this.f33474d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f33475e = -1;
            this.f33477g = 0;
            this.f33476f = 0.0f;
        }
        return true;
    }
}
