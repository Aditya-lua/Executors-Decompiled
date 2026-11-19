package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27807a;
    public long b;

    public /* synthetic */ se(ve veVar, String str, byte[] bArr) {
        this(veVar, str);
    }

    public se(ve veVar, String str) {
        Objects.requireNonNull(veVar);
        this.f27807a = str;
        this.b = veVar.e().b();
    }

    public /* synthetic */ se(ve veVar, byte[] bArr) {
        this(veVar, veVar.N0().l0());
    }
}
