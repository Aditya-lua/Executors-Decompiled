package ob;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class le implements d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27568a;
    public final /* synthetic */ ye b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ve f27569c;

    public le(ve veVar, String str, ye yeVar) {
        this.f27568a = str;
        this.b = yeVar;
        Objects.requireNonNull(veVar);
        this.f27569c = veVar;
    }

    @Override // ob.d6
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f27569c.v(this.f27568a, i10, th2, bArr, this.b);
    }
}
