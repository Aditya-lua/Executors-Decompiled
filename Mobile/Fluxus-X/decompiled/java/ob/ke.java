package ob;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ke implements d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27523a;
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ve f27524c;

    public ke(ve veVar, String str, List list) {
        this.f27523a = str;
        this.b = list;
        Objects.requireNonNull(veVar);
        this.f27524c = veVar;
    }

    @Override // ob.d6
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f27524c.A(true, i10, th2, bArr, this.f27523a, this.b);
    }
}
