package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C2953s {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2947q<?> f10990a = new C2950r();

    /* JADX INFO: renamed from: b */
    public static final AbstractC2947q<?> f10991b = m14175c();

    /* JADX INFO: renamed from: a */
    public static AbstractC2947q<?> m14173a() {
        AbstractC2947q<?> abstractC2947q = f10991b;
        if (abstractC2947q != null) {
            return abstractC2947q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2947q<?> m14174b() {
        return f10990a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2947q<?> m14175c() {
        if (C2907c1.f10823d) {
            return null;
        }
        try {
            return (AbstractC2947q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
