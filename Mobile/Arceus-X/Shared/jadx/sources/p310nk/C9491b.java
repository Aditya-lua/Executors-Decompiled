package p310nk;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import mk.C8570d;
import p151gk.C6124q;

/* JADX INFO: renamed from: nk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C9491b {

    /* JADX INFO: renamed from: h */
    public static boolean f34100h;

    /* JADX INFO: renamed from: a */
    public Rect f34101a;

    /* JADX INFO: renamed from: b */
    public int f34102b;

    /* JADX INFO: renamed from: c */
    public int f34103c;

    /* JADX INFO: renamed from: d */
    public int f34104d;

    /* JADX INFO: renamed from: e */
    public int f34105e;

    /* JADX INFO: renamed from: f */
    public int f34106f;

    /* JADX INFO: renamed from: g */
    public int f34107g;

    public C9491b(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f34101a = rect;
        this.f34102b = i10;
        this.f34103c = i11;
        this.f34104d = i12;
        this.f34105e = i13;
        this.f34106f = i14;
        this.f34107g = i15;
    }

    /* JADX INFO: renamed from: a */
    public static C9491b m37386a(View view, WindowManager windowManager, View view2, Rect rect) {
        int i10;
        int i11;
        int i12;
        int i13;
        m37387b("getInfo() ------ start ------");
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        m37387b("getInfo() sr:" + rect2.toString());
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        m37387b("getInfo() ss:" + point.toString());
        int height = view.getHeight();
        int width = view.getWidth();
        if (C8570d.m34530a()) {
            i10 = 0;
            i11 = 0;
        } else {
            Point point2 = new Point();
            windowManager.getDefaultDisplay().getRealSize(point2);
            i10 = point2.y;
            i11 = point2.x;
        }
        m37387b("getInfo() sh1:" + height + " sh2:" + i10);
        if (height > i10) {
            i12 = height;
        } else {
            width = i11;
            i12 = i10;
        }
        m37387b("getInfo() sh:" + i12);
        int i14 = rect != null ? rect.bottom : i12 - rect2.bottom;
        m37387b("getInfo() bm:" + i14);
        int i15 = i12 - point.y;
        m37387b("getInfo() sbh:" + i15);
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
        m37387b("getInfo() top:" + i16);
        int i17 = rect2.bottom;
        if (C8570d.m34531b() && i16 < rect2.top) {
            m37387b("getInfo() adjusting top margin");
            int i18 = rect2.top;
            i17 -= i18;
            i15 -= i18;
        }
        int i19 = i17;
        m37387b("getInfo() kby:" + i19);
        int i20 = rect != null ? rect.right : width - point.x;
        m37387b("getInfo() rsbw:" + i20);
        int iMin = C8570d.m34530a() ? 0 : Math.min(i14, i15);
        m37387b("getInfo() rsbh:" + iMin);
        int iMax = Math.max(0, i14 - i15);
        m37387b("getInfo() kbh:" + iMax);
        return new C9491b(rect2, i12, iMin, i20, iMax, i19, i16);
    }

    /* JADX INFO: renamed from: b */
    public static void m37387b(String str) {
        if (f34100h) {
            C6124q.m27064i("rbx.screen", str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9491b)) {
            return false;
        }
        C9491b c9491b = (C9491b) obj;
        return c9491b.f34101a.equals(this.f34101a) && c9491b.f34102b == this.f34102b && c9491b.f34103c == this.f34103c && c9491b.f34104d == this.f34104d && c9491b.f34105e == this.f34105e && c9491b.f34106f == this.f34106f && c9491b.f34107g == this.f34107g;
    }
}
