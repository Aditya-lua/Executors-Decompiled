package nk;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import gk.p;
import mk.d;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f26291h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f26292a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26297g;

    public b(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f26292a = rect;
        this.b = i10;
        this.f26293c = i11;
        this.f26294d = i12;
        this.f26295e = i13;
        this.f26296f = i14;
        this.f26297g = i15;
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
        if (f26291h) {
            p.i("rbx.screen", str);
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
        return bVar.f26292a.equals(this.f26292a) && bVar.b == this.b && bVar.f26293c == this.f26293c && bVar.f26294d == this.f26294d && bVar.f26295e == this.f26295e && bVar.f26296f == this.f26296f && bVar.f26297g == this.f26297g;
    }
}
