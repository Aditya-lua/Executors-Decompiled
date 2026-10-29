package lv;

import jv.h;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import um.t;
import xu.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f23559c = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final um.h<T> f23560a;
    public final boolean b;

    public b(um.h<T> hVar, boolean z10) {
        this.f23560a = hVar;
        this.b = z10;
    }

    @Override // jv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t8) {
        if (this.b) {
            return new d(this.f23560a, t8);
        }
        e eVar = new e();
        this.f23560a.toJson(t.q(eVar), t8);
        return RequestBody.create(f23559c, eVar.F2());
    }
}
