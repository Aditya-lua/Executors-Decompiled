package p589z;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import p063d0.C4373d;
import p063d0.C4380k;
import p503w0.C12274d;

/* JADX INFO: renamed from: z.q3 */
/* JADX INFO: loaded from: classes.dex */
public class C13606q3 {

    /* JADX INFO: renamed from: e */
    public static final Size f47612e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f */
    public static final Size f47613f = new Size(320, 240);

    /* JADX INFO: renamed from: g */
    public static final Size f47614g = new Size(640, 480);

    /* JADX INFO: renamed from: h */
    public static final Object f47615h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile C13606q3 f47616i;

    /* JADX INFO: renamed from: a */
    public final DisplayManager f47617a;

    /* JADX INFO: renamed from: b */
    public volatile Size f47618b = null;

    /* JADX INFO: renamed from: c */
    public final C4380k f47619c = new C4380k();

    /* JADX INFO: renamed from: d */
    public final C4373d f47620d = new C4373d();

    public C13606q3(Context context) {
        this.f47617a = (DisplayManager) context.getSystemService("display");
    }

    /* JADX INFO: renamed from: c */
    public static C13606q3 m49574c(Context context) {
        if (f47616i == null) {
            synchronized (f47615h) {
                try {
                    if (f47616i == null) {
                        f47616i = new C13606q3(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47616i;
    }

    /* JADX INFO: renamed from: a */
    public final Size m49575a() {
        Size sizeM49576b = m49576b();
        int width = sizeM49576b.getWidth() * sizeM49576b.getHeight();
        Size size = f47612e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeM49576b = size;
        }
        return this.f47619c.m22041a(sizeM49576b);
    }

    /* JADX INFO: renamed from: b */
    public final Size m49576b() {
        Point point = new Point();
        m49577d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (C12274d.m45572d(size, f47613f) && (size = this.f47620d.m22028a()) == null) {
            size = f47614g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* JADX INFO: renamed from: d */
    public Display m49577d(boolean z10) {
        Display[] displays = this.f47617a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM49578e = m49578e(displays, z10);
        if (displayM49578e == null && z10) {
            displayM49578e = m49578e(displays, false);
        }
        if (displayM49578e != null) {
            return displayM49578e;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: renamed from: e */
    public final Display m49578e(Display[] displayArr, boolean z10) {
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

    /* JADX INFO: renamed from: f */
    public Size m49579f() {
        if (this.f47618b != null) {
            return this.f47618b;
        }
        this.f47618b = m49575a();
        return this.f47618b;
    }

    /* JADX INFO: renamed from: g */
    public void m49580g() {
        this.f47618b = m49575a();
    }
}
