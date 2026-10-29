package de;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14574a;

    public a0(Object obj) {
        this.f14574a = obj;
    }

    public static z b(Object obj) {
        if (obj != null) {
            return new a0(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // de.e0
    public final Object a() {
        return this.f14574a;
    }
}
