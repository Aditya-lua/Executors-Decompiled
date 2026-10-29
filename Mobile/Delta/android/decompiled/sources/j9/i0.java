package j9;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable f21197f;

    public /* synthetic */ i0(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f21197f = callable;
    }

    @Override // j9.j0
    public final String a() {
        try {
            return (String) this.f21197f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
