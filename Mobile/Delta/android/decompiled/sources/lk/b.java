package lk;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import ek.q;
import kk.d;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f23580h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f23581a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23586g;

    public b(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f23581a = rect;
        this.b = i10;
        this.f23582c = i11;
        this.f23583d = i12;
        this.f23584e = i13;
        this.f23585f = i14;
        this.f23586g = i15;
    }

    public static b a(View view, WindowManager windowManager, View view2, Rect rect) {
        int i10;
        int i11;
        int i12;
        int i13;
        b("getInfo() ------ start ------");
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        b("getInfo() sr:" + rect2.toString());
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        b("getInfo() ss:" + point.toString());
        int height = view.getHeight();
        int width = view.getWidth();
        if (d.a()) {
            i10 = 0;
            i11 = 0;
        } else {
            Point point2 = new Point();
            windowManager.getDefaultDisplay().getRealSize(point2);
            i10 = point2.y;
            i11 = point2.x;
        }
        b("getInfo() sh1:" + height + " sh2:" + i10);
        if (height > i10) {
            i12 = height;
        } else {
            width = i11;
            i12 = i10;
        }
        b("getInfo() sh:" + i12);
        int i14 = rect != null ? rect.bottom : i12 - rect2.bottom;
        b("getInfo() bm:" + i14);
        int i15 = i12 - point.y;
        b("getInfo() sbh:" + i15);
        if (rect != null) {
            i13 = rect.top;
        } else {
            int[] iArr = new int[2];
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
            }
            i13 = iArr[1];
        }
        int i16 = i13;
        b("getInfo() top:" + i16);
        int i17 = rect2.bottom;
        if (d.b() && i16 < rect2.top) {
            b("getInfo() adjusting top margin");
            int i18 = rect2.top;
            i17 -= i18;
            i15 -= i18;
        }
        int i19 = i17;
        b("getInfo() kby:" + i19);
        int i20 = rect != null ? rect.right : width - point.x;
        b("getInfo() rsbw:" + i20);
        int iMin = d.a() ? 0 : Math.min(i14, i15);
        b("getInfo() rsbh:" + iMin);
        int iMax = Math.max(0, i14 - i15);
        b("getInfo() kbh:" + iMax);
        return new b(rect2, i12, iMin, i20, iMax, i19, i16);
    }

    public static void b(String str) {
        if (f23580h) {
            q.i("rbx.screen", str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f23581a.equals(this.f23581a) && bVar.b == this.b && bVar.f23582c == this.f23582c && bVar.f23583d == this.f23583d && bVar.f23584e == this.f23584e && bVar.f23585f == this.f23585f && bVar.f23586g == this.f23586g;
    }
}
