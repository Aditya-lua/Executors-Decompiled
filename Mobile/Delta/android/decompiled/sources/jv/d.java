package jv;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import sm.h;
import vu.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f22215a;
    public final T b;

    public d(h<T> hVar, T t8) {
        this.f22215a = hVar;
        this.b = t8;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return b.f22212c;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(f fVar) {
        this.f22215a.toJson(fVar, this.b);
    }
}
