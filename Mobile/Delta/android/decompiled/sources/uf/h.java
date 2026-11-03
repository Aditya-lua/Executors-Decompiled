package uf;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, rf.e<?>> f32787a;
    public final Map<Class<?>, rf.g<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf.e<Object> f32788c;

    public static final class a implements sf.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final rf.e<Object> f32789d = new rf.e() { // from class: uf.g
            @Override // rf.b
            public final void encode(Object obj, rf.f fVar) {
                h.a.a(obj, fVar);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, rf.e<?>> f32790a = new HashMap();
        public final Map<Class<?>, rf.g<?>> b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public rf.e<Object> f32791c = f32789d;

        public static /* synthetic */ void a(Object obj, rf.f fVar) {
            throw new rf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f32790a), new HashMap(this.b), this.f32791c);
        }

        @NonNull
        public a c(@NonNull sf.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // sf.b
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(@NonNull Class<U> cls, @NonNull rf.e<? super U> eVar) {
            this.f32790a.put(cls, eVar);
            this.b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, rf.e<?>> map, Map<Class<?>, rf.g<?>> map2, rf.e<Object> eVar) {
        this.f32787a = map;
        this.b = map2;
        this.f32788c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new f(outputStream, this.f32787a, this.b, this.f32788c).n(obj);
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
