package kv;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import jg.a0;
import jg.f;
import jv.h;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import xu.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MediaType f22875d = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f22876a;
    public final a0<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22877c;

    public b(f fVar, a0<T> a0Var, boolean z10) {
        this.f22876a = fVar;
        this.b = a0Var;
        this.f22877c = z10;
    }

    public static <T> void c(xu.f fVar, f fVar2, a0<T> a0Var, T t8) throws IOException {
        JsonWriter jsonWriterS = fVar2.s(new OutputStreamWriter(fVar.j3(), StandardCharsets.UTF_8));
        a0Var.write(jsonWriterS, t8);
        jsonWriterS.close();
    }

    @Override // jv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t8) throws IOException {
        if (this.f22877c) {
            return new d(this.f22876a, this.b, t8);
        }
        e eVar = new e();
        c(eVar, this.f22876a, this.b, t8);
        return RequestBody.create(f22875d, eVar.F2());
    }
}
