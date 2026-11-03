package iv;

import com.google.gson.stream.JsonWriter;
import hv.h;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import jg.a0;
import jg.f;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import vu.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MediaType f21441d = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21442a;
    public final a0<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21443c;

    public b(f fVar, a0<T> a0Var, boolean z10) {
        this.f21442a = fVar;
        this.b = a0Var;
        this.f21443c = z10;
    }

    public static <T> void c(vu.f fVar, f fVar2, a0<T> a0Var, T t8) throws IOException {
        JsonWriter jsonWriterS = fVar2.s(new OutputStreamWriter(fVar.l3(), StandardCharsets.UTF_8));
        a0Var.write(jsonWriterS, t8);
        jsonWriterS.close();
    }

    @Override // hv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t8) throws IOException {
        if (this.f21443c) {
            return new d(this.f21442a, this.b, t8);
        }
        e eVar = new e();
        c(eVar, this.f21442a, this.b, t8);
        return RequestBody.create(f21441d, eVar.G2());
    }
}
