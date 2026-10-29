package p213j9;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: j9.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7102i0 extends C7104j0 {

    /* JADX INFO: renamed from: f */
    public final Callable f27723f;

    public /* synthetic */ C7102i0(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f27723f = callable;
    }

    @Override // p213j9.C7104j0
    /* JADX INFO: renamed from: a */
    public final String mo29905a() {
        try {
            return (String) this.f27723f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
