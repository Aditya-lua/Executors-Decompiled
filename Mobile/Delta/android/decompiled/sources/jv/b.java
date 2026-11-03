package jv;

import hv.h;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import sm.t;
import vu.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f22212c = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sm.h<T> f22213a;
    public final boolean b;

    public b(sm.h<T> hVar, boolean z10) {
        this.f22213a = hVar;
        this.b = z10;
    }

    @Override // hv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t8) {
        if (this.b) {
            return new d(this.f22213a, t8);
        }
        e eVar = new e();
        this.f22213a.toJson(t.q(eVar), t8);
        return RequestBody.create(f22212c, eVar.G2());
    }
}
