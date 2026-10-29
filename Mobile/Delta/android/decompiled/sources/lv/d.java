package lv;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import um.h;
import xu.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f23562a;
    public final T b;

    public d(h<T> hVar, T t8) {
        this.f23562a = hVar;
        this.b = t8;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return b.f23559c;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(f fVar) {
        this.f23562a.toJson(fVar, this.b);
    }
}
