package p589z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p296n0.C8802o3;
import p296n0.C8817r3;
import p296n0.InterfaceC8792m3;
import p533x2.C12637g;

/* JADX INFO: renamed from: z.r2 */
/* JADX INFO: loaded from: classes.dex */
public class C13612r2 implements InterfaceC8792m3 {

    /* JADX INFO: renamed from: b */
    public C13559k3 f47643b;

    /* JADX INFO: renamed from: c */
    public List<C8817r3> f47644c;

    /* JADX INFO: renamed from: e */
    public volatile C8802o3 f47646e;

    /* JADX INFO: renamed from: a */
    public final Object f47642a = new Object();

    /* JADX INFO: renamed from: d */
    public volatile boolean f47645d = false;

    public C13612r2(C13559k3 c13559k3, List<C8817r3> list) {
        C12637g.m47070b(c13559k3.f47475j == C13559k3.c.OPENED, "CaptureSession state must be OPENED. Current state:" + c13559k3.f47475j);
        this.f47643b = c13559k3;
        this.f47644c = Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public void m49587a() {
        synchronized (this.f47642a) {
            this.f47645d = true;
            this.f47643b = null;
            this.f47646e = null;
            this.f47644c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m49588b(C8802o3 c8802o3) {
        synchronized (this.f47642a) {
            this.f47646e = c8802o3;
        }
    }
}
