package el;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import sw.e;
import sw.y;

/* JADX INFO: loaded from: classes2.dex */
public class c extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f13823a;

    public class a implements e<Object, sw.d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f13824a;

        public a(Type type) {
            this.f13824a = type;
        }

        @Override // sw.e
        public Type a() {
            return this.f13824a;
        }

        @Override // sw.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public sw.d<Object> b(sw.d<Object> dVar) {
            return new el.b(c.this.f13823a, dVar);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f13825a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f13825a.post(runnable);
        }

        public b() {
            this.f13825a = new Handler(Looper.getMainLooper());
        }
    }

    public c(Executor executor) {
        this.f13823a = executor;
    }

    public static c e() {
        return new c(new b());
    }

    @Override // sw.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != sw.d.class) {
            return null;
        }
        return new a(e.a.b(0, (ParameterizedType) type));
    }
}
