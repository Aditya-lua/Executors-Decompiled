package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m1 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f2245a;

    public m1(r0 r0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f2245a = null;
    }

    public a0 a() {
        return new a0(getMessage());
    }
}
