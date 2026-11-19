package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r2 implements n0.m3 {
    public k3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<n0.r3> f38590c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile n0.o3 f38592e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38589a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f38591d = false;

    public r2(k3 k3Var, List<n0.r3> list) {
        x2.g.b(k3Var.f38452j == k3.c.OPENED, "CaptureSession state must be OPENED. Current state:" + k3Var.f38452j);
        this.b = k3Var;
        this.f38590c = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        synchronized (this.f38589a) {
            this.f38591d = true;
            this.b = null;
            this.f38592e = null;
            this.f38590c = null;
        }
    }

    public void b(n0.o3 o3Var) {
        synchronized (this.f38589a) {
            this.f38592e = o3Var;
        }
    }
}
