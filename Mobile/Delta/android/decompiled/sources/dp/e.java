package dp;

import com.withpersona.sdk2.inquiry.FallbackMode;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ft.d<FallbackMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14766a;

    public e(c cVar) {
        this.f14766a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static FallbackMode b(c cVar) {
        return (FallbackMode) ft.h.e(cVar.getFallbackMode());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackMode get() {
        return b(this.f14766a);
    }
}
