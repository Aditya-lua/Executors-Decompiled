package tf;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, qf.e<?>> f31727a;
    public final Map<Class<?>, qf.g<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf.e<Object> f31728c;

    public static final class a implements rf.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final qf.e<Object> f31729d = new qf.e() { // from class: tf.g
            @Override // qf.b
            public final void encode(Object obj, qf.f fVar) {
                h.a.a(obj, fVar);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, qf.e<?>> f31730a = new HashMap();
        public final Map<Class<?>, qf.g<?>> b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public qf.e<Object> f31731c = f31729d;

        public static /* synthetic */ void a(Object obj, qf.f fVar) {
            throw new qf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f31730a), new HashMap(this.b), this.f31731c);
        }

        @NonNull
        public a c(@NonNull rf.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // rf.b
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(@NonNull Class<U> cls, @NonNull qf.e<? super U> eVar) {
            this.f31730a.put(cls, eVar);
            this.b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, qf.e<?>> map, Map<Class<?>, qf.g<?>> map2, qf.e<Object> eVar) {
        this.f31727a = map;
        this.b = map2;
        this.f31728c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new f(outputStream, this.f31727a, this.b, this.f31728c).n(obj);
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
