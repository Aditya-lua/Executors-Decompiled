package z;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public class q3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f36764e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f36765f = new Size(320, 240);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f36766g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f36767h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile q3 f36768i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f36769a;
    public volatile Size b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0.k f36770c = new d0.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0.d f36771d = new d0.d();

    public q3(Context context) {
        this.f36769a = (DisplayManager) context.getSystemService("display");
    }

    public static q3 c(Context context) {
        if (f36768i == null) {
            synchronized (f36767h) {
                try {
                    if (f36768i == null) {
                        f36768i = new q3(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36768i;
    }

    public final Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f36764e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f36770c.a(sizeB);
    }

    public final Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (w0.d.d(size, f36765f) && (size = this.f36771d.a()) == null) {
            size = f36766g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f36769a.getDisplays();
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
