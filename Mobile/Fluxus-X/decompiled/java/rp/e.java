package rp;

import com.withpersona.sdk2.inquiry.FallbackMode;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements wt.d<FallbackMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30838a;

    public e(c cVar) {
        this.f30838a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static FallbackMode b(c cVar) {
        return (FallbackMode) wt.h.e(cVar.getFallbackMode());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackMode get() {
        return b(this.f30838a);
    }
}
