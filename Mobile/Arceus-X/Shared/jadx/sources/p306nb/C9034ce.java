package p306nb;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: nb.ce */
/* JADX INFO: loaded from: classes.dex */
public final class C9034ce implements InterfaceC9380y5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f32828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9245pe f32829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9197me f32830c;

    public C9034ce(C9197me c9197me, String str, C9245pe c9245pe) {
        this.f32828a = str;
        this.f32829b = c9245pe;
        Objects.requireNonNull(c9197me);
        this.f32830c = c9197me;
    }

    @Override // p306nb.InterfaceC9380y5
    /* JADX INFO: renamed from: a */
    public final void mo36150a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f32830c.m36572v(this.f32828a, i10, th2, bArr, this.f32829b);
    }
}
