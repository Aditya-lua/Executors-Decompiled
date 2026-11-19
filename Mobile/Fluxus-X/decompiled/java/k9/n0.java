package k9;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable f21278f;

    public /* synthetic */ n0(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f21278f = callable;
    }

    @Override // k9.o0
    public final String a() {
        try {
            return (String) this.f21278f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
