package p213j9;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: j9.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7086a0 extends AbstractBinderC7119x {

    /* JADX INFO: renamed from: c */
    public static final WeakReference f27683c = new WeakReference(null);

    /* JADX INFO: renamed from: b */
    public WeakReference f27684b;

    public AbstractBinderC7086a0(byte[] bArr) {
        super(bArr);
        this.f27684b = f27683c;
    }

    @Override // p213j9.AbstractBinderC7119x
    /* JADX INFO: renamed from: t2 */
    public final byte[] mo29846t2() {
        byte[] bArrMo29847v2;
        synchronized (this) {
            try {
                bArrMo29847v2 = (byte[]) this.f27684b.get();
                if (bArrMo29847v2 == null) {
                    bArrMo29847v2 = mo29847v2();
                    this.f27684b = new WeakReference(bArrMo29847v2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrMo29847v2;
    }

    /* JADX INFO: renamed from: v2 */
    public abstract byte[] mo29847v2();
}
