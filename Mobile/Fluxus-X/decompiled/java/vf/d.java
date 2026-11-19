package vf;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import tf.f;
import tf.g;
import tf.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements uf.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tf.e<Object> f34341e = new tf.e() { // from class: vf.a
        @Override // tf.b
        public final void encode(Object obj, f fVar) {
            d.b(obj, fVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g<String> f34342f = new g() { // from class: vf.b
        @Override // tf.b
        public final void encode(Object obj, h hVar) {
            hVar.add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g<Boolean> f34343g = new g() { // from class: vf.c
        @Override // tf.b
        public final void encode(Object obj, h hVar) {
            hVar.add(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f34344h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, tf.e<?>> f34345a = new HashMap();
    public final Map<Class<?>, g<?>> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tf.e<Object> f34346c = f34341e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34347d = false;

    public class a implements tf.a {
        public a() {
        }

        @Override // tf.a
        public void a(@NonNull Object obj, @NonNull Writer writer) {
            e eVar = new e(writer, d.this.f34345a, d.this.b, d.this.f34346c, d.this.f34347d);
            eVar.c(obj, false);
            eVar.k();
        }

        @Override // tf.a
        public String b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f34349a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f34349a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(@NonNull Date date, @NonNull h hVar) {
            hVar.add(f34349a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        l(String.class, f34342f);
        l(Boolean.class, f34343g);
        l(Date.class, f34344h);
    }

    public static /* synthetic */ void b(Object obj, f fVar) {
        throw new tf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public tf.a h() {
        return new a();
    }

    @NonNull
    public d i(@NonNull uf.a aVar) {
        aVar.configure(this);
        return this;
    }

    @NonNull
    public d j(boolean z10) {
        this.f34347d = z10;
        return this;
    }

    @Override // uf.b
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <T> d registerEncoder(@NonNull Class<T> cls, @NonNull tf.e<? super T> eVar) {
        this.f34345a.put(cls, eVar);
        this.b.remove(cls);
        return this;
    }

    @NonNull
    public <T> d l(@NonNull Class<T> cls, @NonNull g<? super T> gVar) {
        this.b.put(cls, gVar);
        this.f34345a.remove(cls);
        return this;
    }
}
