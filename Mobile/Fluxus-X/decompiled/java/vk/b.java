package vk;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import bi.h;
import ok.q;
import uk.d;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f34407h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f34408a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34413g;

    public b(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f34408a = rect;
        this.b = i10;
        this.f34409c = i11;
        this.f34410d = i12;
        this.f34411e = i13;
        this.f34412f = i14;
        this.f34413g = i15;
    }

    public static int a(boolean z10, boolean z11, int i10, int i11, int i12) {
        if (!z10) {
            return Math.max(0, i11 - i12);
        }
        if (z11) {
            return Math.max(0, i10 - i12);
        }
        return 0;
    }

    public static b b(View view, WindowManager windowManager, View view2, Rect rect) {
        return c(view, windowManager, view2, rect, false, false, 0);
    }

    public static b c(View view, WindowManager windowManager, View view2, Rect rect, boolean z10, boolean z11, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        WindowInsetsCompat windowInsetsCompatF;
        d("getInfo() ------ start ------");
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        d("getInfo() sr:" + rect2.toString());
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        d("getInfo() ss:" + point.toString());
        int height = view.getHeight();
        int width = view.getWidth();
        if (d.a()) {
            i11 = 0;
            i12 = 0;
        } else {
            Point point2 = new Point();
            windowManager.getDefaultDisplay().getRealSize(point2);
            i11 = point2.y;
            i12 = point2.x;
        }
        d("getInfo() sh1:" + height + " sh2:" + i11);
        if (height > i11) {
            i12 = width;
            i13 = height;
        } else {
            i13 = i11;
        }
        d("getInfo() sh:" + i13);
        int i15 = rect != null ? rect.bottom : i13 - rect2.bottom;
        d("getInfo() bm:" + i15);
        int i16 = i13 - point.y;
        if (h.a().O() && view.getContext().getApplicationInfo().targetSdkVersion >= 36 && rect != null && !d.a() && (windowInsetsCompatF = o0.F(view)) != null) {
            i16 = windowInsetsCompatF.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars()).bottom;
        }
        d("getInfo() sbh:" + i16);
        if (rect != null) {
            i14 = rect.top;
        } else {
            int[] iArr = new int[2];
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
            }
            i14 = iArr[1];
        }
        int i17 = i14;
        d("getInfo() top:" + i17);
        int i18 = rect2.bottom;
        if (d.b() && i17 < rect2.top) {
            d("getInfo() adjusting top margin");
            int i19 = rect2.top;
            i18 -= i19;
            i16 -= i19;
        }
        int i20 = i18;
        d("getInfo() kby:" + i20);
        int i21 = rect != null ? rect.right : i12 - point.x;
        d("getInfo() rsbw:" + i21);
        int iMin = d.a() ? 0 : Math.min(i15, i16);
        d("getInfo() rsbh:" + iMin);
        int iA = a(z10, z11, i10, i15, i16);
        d("getInfo() kbh:" + iA);
        return new b(rect2, i13, iMin, i21, iA, i20, i17);
    }

    public static void d(String str) {
        if (f34407h) {
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
        return bVar.f34408a.equals(this.f34408a) && bVar.b == this.b && bVar.f34409c == this.f34409c && bVar.f34410d == this.f34410d && bVar.f34411e == this.f34411e && bVar.f34412f == this.f34412f && bVar.f34413g == this.f34413g;
    }
}
