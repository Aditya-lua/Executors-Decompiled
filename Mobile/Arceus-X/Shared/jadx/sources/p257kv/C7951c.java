package p257kv;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.C7597m;
import okhttp3.ResponseBody;
import p231jv.InterfaceC7380h;

/* JADX INFO: renamed from: kv.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7951c<T> implements InterfaceC7380h<ResponseBody, T> {

    /* JADX INFO: renamed from: a */
    public final C7590f f29825a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7584a0<T> f29826b;

    public C7951c(C7590f c7590f, AbstractC7584a0<T> abstractC7584a0) {
        this.f29825a = c7590f;
        this.f29826b = abstractC7584a0;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p231jv.InterfaceC7380h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo30540a(ResponseBody responseBody) {
        JsonReader jsonReaderM31417r = this.f29825a.m31417r(responseBody.charStream());
        try {
            T t8 = this.f29826b.read(jsonReaderM31417r);
            if (jsonReaderM31417r.peek() != JsonToken.END_DOCUMENT) {
                throw new C7597m("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t8;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
