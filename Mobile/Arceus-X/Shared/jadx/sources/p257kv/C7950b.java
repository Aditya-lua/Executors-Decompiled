package p257kv;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kg.AbstractC7584a0;
import kg.C7590f;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p231jv.InterfaceC7380h;
import p560xu.C12924e;
import p560xu.InterfaceC12926f;

/* JADX INFO: renamed from: kv.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7950b<T> implements InterfaceC7380h<T, RequestBody> {

    /* JADX INFO: renamed from: d */
    public static final MediaType f29821d = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a */
    public final C7590f f29822a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7584a0<T> f29823b;

    /* JADX INFO: renamed from: c */
    public final boolean f29824c;

    public C7950b(C7590f c7590f, AbstractC7584a0<T> abstractC7584a0, boolean z10) {
        this.f29822a = c7590f;
        this.f29823b = abstractC7584a0;
        this.f29824c = z10;
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m32947c(InterfaceC12926f interfaceC12926f, C7590f c7590f, AbstractC7584a0<T> abstractC7584a0, T t8) throws IOException {
        JsonWriter jsonWriterM31418s = c7590f.m31418s(new OutputStreamWriter(interfaceC12926f.mo48035j3(), StandardCharsets.UTF_8));
        abstractC7584a0.write(jsonWriterM31418s, t8);
        jsonWriterM31418s.close();
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p231jv.InterfaceC7380h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody mo30540a(T t8) throws IOException {
        if (this.f29824c) {
            return new C7952d(this.f29822a, this.f29823b, t8);
        }
        C12924e c12924e = new C12924e();
        m32947c(c12924e, this.f29822a, this.f29823b, t8);
        return RequestBody.create(f29821d, c12924e.mo47997F2());
    }
}
