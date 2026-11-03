package iv;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import hv.h;
import jg.a0;
import jg.f;
import jg.m;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21444a;
    public final a0<T> b;

    public c(f fVar, a0<T> a0Var) {
        this.f21444a = fVar;
        this.b = a0Var;
    }

    @Override // hv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(ResponseBody responseBody) {
        JsonReader jsonReaderR = this.f21444a.r(responseBody.charStream());
        try {
            T t8 = this.b.read(jsonReaderR);
            if (jsonReaderR.peek() != JsonToken.END_DOCUMENT) {
                throw new m("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t8;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
