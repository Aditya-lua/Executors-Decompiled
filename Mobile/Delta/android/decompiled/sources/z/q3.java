package z;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public class q3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f37459e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f37460f = new Size(320, 240);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f37461g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f37462h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile q3 f37463i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f37464a;
    public volatile Size b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0.k f37465c = new d0.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0.d f37466d = new d0.d();

    public q3(Context context) {
        this.f37464a = (DisplayManager) context.getSystemService("display");
    }

    public static q3 c(Context context) {
        if (f37463i == null) {
            synchronized (f37462h) {
                try {
                    if (f37463i == null) {
                        f37463i = new q3(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37463i;
    }

    public final Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f37459e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f37465c.a(sizeB);
    }

    public final Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (w0.d.d(size, f37460f) && (size = this.f37466d.a()) == null) {
            size = f37461g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f37464a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayE = e(displays, z10);
        if (displayE == null && z10) {
            displayE = e(displays, false);
        }
        if (displayE != null) {
            return displayE;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    public Size f() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }

    public void g() {
        this.b = a();
    }
}
