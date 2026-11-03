package kk;

import android.graphics.Point;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f22860h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f22854a = new Point();
    public Point b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f22855c = new Point();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22858f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22859g = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22856d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22857e = -1;

    public interface a {
        void b(i iVar);
    }

    public i(a aVar) {
        this.f22860h = aVar;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 - f12);
        int i11 = (int) (f11 - f13);
        Point point = this.f22855c;
        Point point2 = this.b;
        int i12 = point2.x;
        Point point3 = this.f22854a;
        int i13 = i12 - point3.x;
        point.x = i13;
        int i14 = point2.y - point3.y;
        point.y = i14;
        double dAtan2 = Math.atan2((i10 * i14) - (i11 * i13), (i13 * i10) + (i14 * i11));
        Point point4 = this.b;
        point4.x = (int) f10;
        point4.y = (int) f11;
        Point point5 = this.f22854a;
        point5.x = (int) f12;
        point5.y = (int) f13;
        this.f22858f -= (float) dAtan2;
    }

    public float b() {
        return this.f22858f;
    }

    public Point c() {
        return this.f22856d != -1 ? this.f22854a : new Point();
    }

    public Point d() {
        return this.f22857e != -1 ? this.b : new Point();
    }

    public int e() {
        return this.f22859g;
    }

    public boolean f(MotionEvent motionEvent) {
        float x10;
        float y10;
        float y11;
        float x11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f22859g = 2;
                if (this.f22856d != -1 && this.f22857e != -1) {
                    this.f22860h.b(this);
                }
                this.f22858f = 0.0f;
                this.f22856d = -1;
            } else if (actionMasked == 2) {
                int i10 = this.f22856d;
                if (i10 != -1 && this.f22857e != -1) {
                    this.f22859g = 1;
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f22857e);
                    if (iFindPointerIndex == -1 || iFindPointerIndex >= motionEvent.getPointerCount()) {
                        x10 = -1.0f;
                        y10 = -1.0f;
                    } else {
                        x10 = motionEvent.getX(motionEvent.findPointerIndex(this.f22856d));
                        y10 = motionEvent.getY(motionEvent.findPointerIndex(this.f22856d));
                    }
                    if (iFindPointerIndex2 == -1 || iFindPointerIndex2 >= motionEvent.getPointerCount()) {
                        y11 = -1.0f;
                        x11 = -1.0f;
                    } else {
                        x11 = motionEvent.getX(motionEvent.findPointerIndex(this.f22857e));
                        y11 = motionEvent.getY(motionEvent.findPointerIndex(this.f22857e));
                    }
                    if (x11 != -1.0f && y11 != -1.0f && x10 != -1.0f && y10 != -1.0f) {
                        a(x11, y11, x10, y10);
                    }
                    a aVar = this.f22860h;
                    if (aVar != null) {
                        aVar.b(this);
                    }
                }
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f22859g = 2;
                    if (this.f22856d != -1 && this.f22857e != -1) {
                        this.f22860h.b(this);
                    }
                    this.f22858f = 0.0f;
                    this.f22857e = -1;
                }
            } else if (this.f22857e == -1) {
                this.f22857e = motionEvent.getPointerId(motionEvent.getActionIndex());
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f22856d);
                int iFindPointerIndex4 = motionEvent.findPointerIndex(this.f22857e);
                if (iFindPointerIndex3 != -1 && iFindPointerIndex3 < motionEvent.getPointerCount()) {
                    this.f22854a.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22856d));
                    this.f22854a.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22856d));
                }
                if (iFindPointerIndex4 != -1 && iFindPointerIndex4 < motionEvent.getPointerCount()) {
                    this.b.x = (int) motionEvent.getX(motionEvent.findPointerIndex(this.f22857e));
                    this.b.y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f22857e));
                }
                Point point = this.f22855c;
                Point point2 = this.b;
                int i11 = point2.x;
                Point point3 = this.f22854a;
                point.x = i11 - point3.x;
                point.y = point2.y - point3.y;
                if (this.f22856d != -1) {
                    this.f22860h.b(this);
                }
            }
        } else if (this.f22856d == -1) {
            this.f22856d = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f22857e = -1;
            this.f22859g = 0;
            this.f22858f = 0.0f;
        }
        return true;
    }
}
