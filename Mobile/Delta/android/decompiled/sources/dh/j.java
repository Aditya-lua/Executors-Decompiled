package dh;

import android.view.MotionEvent;
import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f14813c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f14814d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14815a = b;

    public void a(int i10) {
        this.f14815a = i10;
    }

    public boolean b(MotionEvent motionEvent) {
        int i10 = this.f14815a;
        if (i10 > b) {
            if (i10 == f14813c && (motionEvent.getFlags() & 1) == 1) {
                q.b("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f14815a == f14814d && (motionEvent.getFlags() & 2) == 2) {
                q.b("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
