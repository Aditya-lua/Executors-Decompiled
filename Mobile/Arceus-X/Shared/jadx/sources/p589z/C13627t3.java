package p589z;

import p001a0.C0008c0;

/* JADX INFO: renamed from: z.t3 */
/* JADX INFO: loaded from: classes.dex */
public class C13627t3 {

    /* JADX INFO: renamed from: a */
    public final Object f47681a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0008c0 f47682b;

    /* JADX INFO: renamed from: c */
    public int f47683c;

    public C13627t3(C0008c0 c0008c0, int i10) {
        this.f47682b = c0008c0;
        this.f47683c = i10;
    }

    /* JADX INFO: renamed from: a */
    public int m49609a() {
        int i10;
        synchronized (this.f47681a) {
            i10 = this.f47683c;
        }
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public void m49610b(int i10) {
        synchronized (this.f47681a) {
            this.f47683c = i10;
        }
    }
}
