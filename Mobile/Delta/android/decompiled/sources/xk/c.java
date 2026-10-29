package xk;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import jv.e;
import jv.y;

/* JADX INFO: loaded from: classes2.dex */
public class c extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f35229a;

    public class a implements e<Object, jv.d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f35230a;

        public a(Type type) {
            this.f35230a = type;
        }

        @Override // jv.e
        public Type a() {
            return this.f35230a;
        }

        @Override // jv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public jv.d<Object> b(jv.d<Object> dVar) {
            return new xk.b(c.this.f35229a, dVar);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f35231a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f35231a.post(runnable);
        }

        public b() {
            this.f35231a = new Handler(Looper.getMainLooper());
        }
    }

    public c(Executor executor) {
        this.f35229a = executor;
    }

    public static c e() {
        return new c(new b());
    }

    @Override // jv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != jv.d.class) {
            return null;
        }
        return new a(e.a.b(0, (ParameterizedType) type));
    }
}
