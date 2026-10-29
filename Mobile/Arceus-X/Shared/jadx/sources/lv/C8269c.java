package lv;

import okhttp3.ResponseBody;
import p231jv.InterfaceC7380h;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.C11875j;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: lv.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8269c<T> implements InterfaceC7380h<ResponseBody, T> {

    /* JADX INFO: renamed from: b */
    public static final C12930h f30575b = C12930h.m48079c("EFBBBF");

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<T> f30576a;

    public C8269c(AbstractC11873h<T> abstractC11873h) {
        this.f30576a = abstractC11873h;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p231jv.InterfaceC7380h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo30540a(ResponseBody responseBody) {
        InterfaceC12928g source = responseBody.getSource();
        try {
            C12930h c12930h = f30575b;
            if (source.mo48044o0(0L, c12930h)) {
                source.skip(c12930h.m48089I());
            }
            AbstractC11878m abstractC11878mM44314s = AbstractC11878m.m44314s(source);
            T tFromJson = this.f30576a.fromJson(abstractC11878mM44314s);
            if (abstractC11878mM44314s.mo44339u() != AbstractC11878m.c.END_DOCUMENT) {
                throw new C11875j("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tFromJson;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
