package wf;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, tf.e<?>> f35757a;
    public final Map<Class<?>, tf.g<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tf.e<Object> f35758c;

    public static final class a implements uf.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final tf.e<Object> f35759d = new tf.e() { // from class: wf.g
            @Override // tf.b
            public final void encode(Object obj, tf.f fVar) {
                h.a.a(obj, fVar);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, tf.e<?>> f35760a = new HashMap();
        public final Map<Class<?>, tf.g<?>> b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public tf.e<Object> f35761c = f35759d;

        public static /* synthetic */ void a(Object obj, tf.f fVar) {
            throw new tf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f35760a), new HashMap(this.b), this.f35761c);
        }

        @NonNull
        public a c(@NonNull uf.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // uf.b
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(@NonNull Class<U> cls, @NonNull tf.e<? super U> eVar) {
            this.f35760a.put(cls, eVar);
            this.b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, tf.e<?>> map, Map<Class<?>, tf.g<?>> map2, tf.e<Object> eVar) {
        this.f35757a = map;
        this.b = map2;
        this.f35758c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new f(outputStream, this.f35757a, this.b, this.f35758c).n(obj);
    }

    @NonNull
    public byte[] c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
