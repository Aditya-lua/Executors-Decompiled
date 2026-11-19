package tw;

import java.io.IOException;
import lg.a0;
import lg.f;
import mv.b0;
import mv.g0;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T> extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f32872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0<T> f32873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f32874e;

    public d(f fVar, a0<T> a0Var, T t8) {
        this.f32872c = fVar;
        this.f32873d = a0Var;
        this.f32874e = t8;
    }

    @Override // mv.g0
    /* JADX INFO: renamed from: b */
    public b0 getMediaType() {
        return b.f32868d;
    }

    @Override // mv.g0
    public void h(ew.f fVar) throws IOException {
        b.c(fVar, this.f32872c, this.f32873d, this.f32874e);
    }
}
