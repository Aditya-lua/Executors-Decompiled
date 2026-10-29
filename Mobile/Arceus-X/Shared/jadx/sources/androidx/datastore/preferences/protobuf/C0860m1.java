package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m1 */
/* JADX INFO: loaded from: classes.dex */
public class C0860m1 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final List<String> f2954a;

    public C0860m1(InterfaceC0874r0 interfaceC0874r0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f2954a = null;
    }

    /* JADX INFO: renamed from: a */
    public C0823a0 m3885a() {
        return new C0823a0(getMessage());
    }
}
