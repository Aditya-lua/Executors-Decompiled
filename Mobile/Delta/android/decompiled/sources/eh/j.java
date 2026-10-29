package eh;

import android.view.MotionEvent;
import gk.p;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f15559c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f15560d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15561a = b;

    public void a(int i10) {
        this.f15561a = i10;
    }

    public boolean b(MotionEvent motionEvent) {
        int i10 = this.f15561a;
        if (i10 > b) {
            if (i10 == f15559c && (motionEvent.getFlags() & 1) == 1) {
                p.b("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f15561a == f15560d && (motionEvent.getFlags() & 2) == 2) {
                p.b("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
