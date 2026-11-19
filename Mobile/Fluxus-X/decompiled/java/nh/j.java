package nh;

import android.view.MotionEvent;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25629c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25630d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25631a = b;

    public void a(int i10) {
        this.f25631a = i10;
    }

    public boolean b(MotionEvent motionEvent) {
        int i10 = this.f25631a;
        if (i10 > b) {
            if (i10 == f25629c && (motionEvent.getFlags() & 1) == 1) {
                q.b("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f25631a == f25630d && (motionEvent.getFlags() & 2) == 2) {
                q.b("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
