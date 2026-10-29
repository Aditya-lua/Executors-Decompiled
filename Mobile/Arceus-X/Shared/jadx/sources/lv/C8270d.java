package lv;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import p471um.AbstractC11873h;
import p560xu.InterfaceC12926f;

/* JADX INFO: renamed from: lv.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C8270d<T> extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<T> f30577a;

    /* JADX INFO: renamed from: b */
    public final T f30578b;

    public C8270d(AbstractC11873h<T> abstractC11873h, T t8) {
        this.f30577a = abstractC11873h;
        this.f30578b = t8;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return C8268b.f30572c;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC12926f interfaceC12926f) {
        this.f30577a.toJson(interfaceC12926f, this.f30578b);
    }
}
