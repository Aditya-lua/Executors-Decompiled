package lv;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import p231jv.InterfaceC7380h;
import p471um.AbstractC11873h;
import p471um.AbstractC11885t;
import p560xu.C12924e;

/* JADX INFO: renamed from: lv.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8268b<T> implements InterfaceC7380h<T, RequestBody> {

    /* JADX INFO: renamed from: c */
    public static final MediaType f30572c = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<T> f30573a;

    /* JADX INFO: renamed from: b */
    public final boolean f30574b;

    public C8268b(AbstractC11873h<T> abstractC11873h, boolean z10) {
        this.f30573a = abstractC11873h;
        this.f30574b = z10;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p231jv.InterfaceC7380h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody mo30540a(T t8) {
        if (this.f30574b) {
            return new C8270d(this.f30573a, t8);
        }
        C12924e c12924e = new C12924e();
        this.f30573a.toJson(AbstractC11885t.m44393q(c12924e), t8);
        return RequestBody.create(f30572c, c12924e.mo47997F2());
    }
}
