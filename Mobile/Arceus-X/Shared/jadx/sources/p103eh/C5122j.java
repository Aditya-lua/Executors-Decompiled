package p103eh;

import android.view.MotionEvent;
import p151gk.C6124q;

/* JADX INFO: renamed from: eh.j */
/* JADX INFO: loaded from: classes2.dex */
public class C5122j {

    /* JADX INFO: renamed from: b */
    public static int f19984b = 0;

    /* JADX INFO: renamed from: c */
    public static int f19985c = 1;

    /* JADX INFO: renamed from: d */
    public static int f19986d = 2;

    /* JADX INFO: renamed from: a */
    public int f19987a = f19984b;

    /* JADX INFO: renamed from: a */
    public void m23904a(int i10) {
        this.f19987a = i10;
    }

    /* JADX INFO: renamed from: b */
    public boolean m23905b(MotionEvent motionEvent) {
        int i10 = this.f19987a;
        if (i10 > f19984b) {
            if (i10 == f19985c && (motionEvent.getFlags() & 1) == 1) {
                C6124q.m27057b("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f19987a == f19986d && (motionEvent.getFlags() & 2) == 2) {
                C6124q.m27057b("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
