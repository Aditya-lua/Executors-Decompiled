package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m1 */
/* JADX INFO: loaded from: classes2.dex */
public class C2937m1 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final List<String> f10948a;

    public C2937m1(InterfaceC2954s0 interfaceC2954s0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f10948a = null;
    }

    /* JADX INFO: renamed from: a */
    public C2903b0 m13983a() {
        return new C2903b0(getMessage());
    }
}
