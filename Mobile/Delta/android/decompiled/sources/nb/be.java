package nb;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class be implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25374a;
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f25375c;

    public be(me meVar, String str, List list) {
        this.f25374a = str;
        this.b = list;
        Objects.requireNonNull(meVar);
        this.f25375c = meVar;
    }

    @Override // nb.y5
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f25375c.A(true, i10, th2, bArr, this.f25374a, this.b);
    }
}
