package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r2 implements n0.m3 {
    public k3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<n0.r3> f36790c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile n0.o3 f36792e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36789a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f36791d = false;

    public r2(k3 k3Var, List<n0.r3> list) {
        x2.g.b(k3Var.f36652j == k3.c.OPENED, "CaptureSession state must be OPENED. Current state:" + k3Var.f36652j);
        this.b = k3Var;
        this.f36790c = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        synchronized (this.f36789a) {
            this.f36791d = true;
            this.b = null;
            this.f36792e = null;
            this.f36790c = null;
        }
    }

    public void b(n0.o3 o3Var) {
        synchronized (this.f36789a) {
            this.f36792e = o3Var;
        }
    }
}
