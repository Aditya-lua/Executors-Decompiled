package p257kv;

import java.io.IOException;
import kg.AbstractC7584a0;
import kg.C7590f;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p560xu.InterfaceC12926f;

/* JADX INFO: renamed from: kv.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7952d<T> extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final C7590f f29827a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7584a0<T> f29828b;

    /* JADX INFO: renamed from: c */
    public final T f29829c;

    public C7952d(C7590f c7590f, AbstractC7584a0<T> abstractC7584a0, T t8) {
        this.f29827a = c7590f;
        this.f29828b = abstractC7584a0;
        this.f29829c = t8;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getMediaType() {
        return C7950b.f29821d;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC12926f interfaceC12926f) throws IOException {
        C7950b.m32947c(interfaceC12926f, this.f29827a, this.f29828b, this.f29829c);
    }
}
