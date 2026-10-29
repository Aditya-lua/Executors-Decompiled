package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25645a;
    public long b;

    public /* synthetic */ je(me meVar, String str, byte[] bArr) {
        this(meVar, str);
    }

    public je(me meVar, String str) {
        Objects.requireNonNull(meVar);
        this.f25645a = str;
        this.b = meVar.e().b();
    }

    public /* synthetic */ je(me meVar, byte[] bArr) {
        this(meVar, meVar.N0().l0());
    }
}
