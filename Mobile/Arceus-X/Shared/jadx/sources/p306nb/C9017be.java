package p306nb;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: nb.be */
/* JADX INFO: loaded from: classes.dex */
public final class C9017be implements InterfaceC9380y5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f32735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f32736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9197me f32737c;

    public C9017be(C9197me c9197me, String str, List list) {
        this.f32735a = str;
        this.f32736b = list;
        Objects.requireNonNull(c9197me);
        this.f32737c = c9197me;
    }

    @Override // p306nb.InterfaceC9380y5
    /* JADX INFO: renamed from: a */
    public final void mo36150a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f32737c.m36497A(true, i10, th2, bArr, this.f32735a, this.f32736b);
    }
}
