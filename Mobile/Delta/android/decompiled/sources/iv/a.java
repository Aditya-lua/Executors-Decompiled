package iv;

import com.google.gson.reflect.TypeToken;
import hv.h;
import hv.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jg.f;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21440a;
    public final boolean b;

    public a(f fVar, boolean z10) {
        this.f21440a = fVar;
        this.b = z10;
    }

    public static a f() {
        return g(new f());
    }

    public static a g(f fVar) {
        if (fVar != null) {
            return new a(fVar, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // hv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        return new b(this.f21440a, this.f21440a.n(TypeToken.get(type)), this.b);
    }

    @Override // hv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        return new c(this.f21440a, this.f21440a.n(TypeToken.get(type)));
    }
}
