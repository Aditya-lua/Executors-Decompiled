package vk;

import android.os.Handler;
import android.os.Looper;
import hv.e;
import hv.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class c extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f33551a;

    public class a implements e<Object, hv.d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f33552a;

        public a(Type type) {
            this.f33552a = type;
        }

        @Override // hv.e
        public Type a() {
            return this.f33552a;
        }

        @Override // hv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public hv.d<Object> b(hv.d<Object> dVar) {
            return new vk.b(c.this.f33551a, dVar);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f33553a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f33553a.post(runnable);
        }

        public b() {
            this.f33553a = new Handler(Looper.getMainLooper());
        }
    }

    public c(Executor executor) {
        this.f33551a = executor;
    }

    public static c e() {
        return new c(new b());
    }

    @Override // hv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != hv.d.class) {
            return null;
        }
        return new a(e.a.b(0, (ParameterizedType) type));
    }
}
