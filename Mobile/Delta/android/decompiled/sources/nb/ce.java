package nb;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ce implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26260a;
    public final /* synthetic */ pe b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f26261c;

    public ce(me meVar, String str, pe peVar) {
        this.f26260a = str;
        this.b = peVar;
        Objects.requireNonNull(meVar);
        this.f26261c = meVar;
    }

    @Override // nb.y5
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f26261c.v(this.f26260a, i10, th2, bArr, this.b);
    }
}
