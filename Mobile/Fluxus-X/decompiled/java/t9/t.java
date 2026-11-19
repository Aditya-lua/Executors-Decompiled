package t9;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f32223a;
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s9.a f32224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f32225d;

    public t(v vVar, AtomicReference atomicReference, tb.k kVar, s9.a aVar) {
        this.f32225d = vVar;
        this.f32223a = atomicReference;
        this.b = kVar;
        this.f32224c = aVar;
    }

    @Override // t9.b, t9.h
    public final void O0(Status status, s9.g gVar) {
        if (gVar != null) {
            this.f32223a.set(gVar);
        }
        m9.v.c(status, null, this.b);
        if (!status.F3() || (gVar != null && gVar.B3())) {
            this.f32225d.B(m9.l.c(this.f32224c, s9.a.class.getSimpleName()), 27306);
        }
    }
}
