package kv;

import java.io.IOException;
import jg.a0;
import jg.f;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T> extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f22879a;
    public final a0<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f22880c;

    public d(f fVar, a0<T> a0Var, T t8) {
        this.f22879a = fVar;
        this.b = a0Var;
        this.f22880c = t8;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getMediaType() {
        return b.f22875d;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(xu.f fVar) throws IOException {
        b.c(fVar, this.f22879a, this.b, this.f22880c);
    }
}
