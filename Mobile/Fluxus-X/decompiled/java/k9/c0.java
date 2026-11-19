package k9;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakReference f21225c = new WeakReference(null);
    public WeakReference b;

    public c0(byte[] bArr) {
        super(bArr);
        this.b = f21225c;
    }

    @Override // k9.z
    public final byte[] t2() {
        byte[] bArrV2;
        synchronized (this) {
            try {
                bArrV2 = (byte[]) this.b.get();
                if (bArrV2 == null) {
                    bArrV2 = v2();
                    this.b = new WeakReference(bArrV2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrV2;
    }

    public abstract byte[] v2();
}
