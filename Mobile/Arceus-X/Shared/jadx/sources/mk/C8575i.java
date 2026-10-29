package mk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: renamed from: mk.i */
/* JADX INFO: loaded from: classes2.dex */
public class C8575i {

    /* JADX INFO: renamed from: h */
    public a f31498h;

    /* JADX INFO: renamed from: a */
    public Point f31491a = new Point();

    /* JADX INFO: renamed from: b */
    public Point f31492b = new Point();

    /* JADX INFO: renamed from: c */
    public Point f31493c = new Point();

    /* JADX INFO: renamed from: f */
    public float f31496f = 0.0f;

    /* JADX INFO: renamed from: g */
    public int f31497g = -1;

    /* JADX INFO: renamed from: d */
    public int f31494d = -1;

    /* JADX INFO: renamed from: e */
    public int f31495e = -1;

    /* JADX INFO: renamed from: mk.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo34559a(C8575i c8575i);
    }

    public C8575i(a aVar) {
        this.f31498h = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m34587a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 - f12);
        int i11 = (int) (f11 - f13);
        Point point = this.f31493c;
        Point point2 = this.f31492b;
        int i12 = point2.x;
        Point point3 = this.f31491a;
        int i13 = i12 - point3.x;
        point.x = i13;
        int i14 = point2.y - point3.y;
        point.y = i14;
        double dAtan2 = Math.atan2((i10 * i14) - (i11 * i13), (i13 * i10) + (i14 * i11));
        Point point4 = this.f31492b;
        point4.x = (int) f10;
        point4.y = (int) f11;
        Point point5 = this.f31491a;
        point5.x = (int) f12;
        point5.y = (int) f13;
        this.f31496f -= (float) dAtan2;
    }

    /* JADX INFO: renamed from: b */
    public float m34588b() {
        return this.f31496f;
    }

    /* JADX INFO: renamed from: c */
    public Point m34589c() {
        return this.f31494d != -1 ? this.f31491a : new Point();
    }

    /* JADX INFO: renamed from: d */
    public Point m34590d() {
        return this.f31495e != -1 ? this.f31492b : new Point();
    }

    /* JADX INFO: renamed from: e */
    public int m34591e() {
        return this.f31497g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m34592f(MotionEvent motionEvent) {
        float x10;
        float y10;
        float y11;
        float x11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f31497g = 2;
                if (this.f31494d != -1 && this.f31495e != -1) {
                    this.f31498h.mo34559a(this);
                }
                this.f31496f = 0.0f;
                this.f31494d = -1;
            } else if (actionMasked == 2) {
                int i10 = this.f31494d;
                if (i10 != -1 && this.f31495e != -1) {
                    this.f31497g = 1;
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f31495e);
                    if (iFindPointerIndex == -1 || iFindPointerIndex >= motionEvent.getPointerCount()) {
                        x10 = -1.0f;
                        y10 = -1.0f;
                    } else {
                        x10 = motionEvent.getX(motionEvent.findPointerIndex(this.f31494d));
                        y10 = motionEvent.getY(motionEvent.findPointerIndex(this.f31494d));
                    }
                    if (iFindPointerIndex2 == -1 || iFindPointerIndex2 >= motionEvent.getPointerCount()) {
                        y11 = -1.0f;
                        x11 = -1.0f;
                    } else {
                        x11 = motionEvent.getX(motionEvent.findPointerIndex(this.f31495e));
                        y11 = motionEvent.getY(motionEvent.findPointerIndex(this.f31495e));
                    }
                    if (x11 != -1.0f && y11 != -1.0f && x10 != -1.0f && y10 != -1.0f) {
                        m34587a(x11, y11, x10, y10);
                    }
                    a aVar = this.f31498h;
                    if (aVar != null) {
                        aVar.mo34559a(this);
                    }
                }
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f31497g = 2;
                    if (this.f31494d != -1 && this.f31495e != -1) {
                        this.f31498h.mo34559a(this);
                    }
                    this.f31496f = 0.0f;
                    this.f31495e = -1;
                }
            } else if (this.f31495e == -1) {
                this.f31495e = motionEvent.getPointerId(motionEvent.getActionIndex());
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f31494d);
                int iFindPointerIndex4 = motionEvent.findPointerIndex(this.f31495e);
                if (iFindPointerIndex3 != -1 && iFindPointerIndex3 < motionEvent.getPointerCount()) {
                    this.f31491a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31494d));
                    this.f31491a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31494d));
                }
                if (iFindPointerIndex4 != -1 && iFindPointerIndex4 < motionEvent.getPointerCount()) {
                    this.f31492b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f31495e));
                    this.f31492b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f31495e));
                }
                Point point = this.f31493c;
                Point point2 = this.f31492b;
                int i11 = point2.x;
                Point point3 = this.f31491a;
                point.x = i11 - point3.x;
                point.y = point2.y - point3.y;
                if (this.f31494d != -1) {
                    this.f31498h.mo34559a(this);
                }
            }
        } else if (this.f31494d == -1) {
            this.f31494d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f31495e = -1;
            this.f31497g = 0;
            this.f31496f = 0.0f;
        }
        return true;
    }
}
