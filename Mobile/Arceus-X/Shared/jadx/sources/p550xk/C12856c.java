package p550xk;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p231jv.C7397y;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7377e;

/* JADX INFO: renamed from: xk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C12856c extends InterfaceC7377e.a {

    /* JADX INFO: renamed from: a */
    public Executor f45680a;

    /* JADX INFO: renamed from: xk.c$a */
    public class a implements InterfaceC7377e<Object, InterfaceC7376d<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f45681a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Type type) {
            this.f45681a = type;
        }

        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: a */
        public Type mo30572a() {
            return this.f45681a;
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljv/d;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7376d<Object> mo30573b(InterfaceC7376d<Object> interfaceC7376d) {
            return new C12855b(C12856c.this.f45680a, interfaceC7376d);
        }
    }

    /* JADX INFO: renamed from: xk.c$b */
    public static class b implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f45683a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f45683a.post(runnable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f45683a = new Handler(Looper.getMainLooper());
        }
    }

    public C12856c(Executor executor) {
        this.f45680a = executor;
    }

    /* JADX INFO: renamed from: e */
    public static C12856c m47833e() {
        return new C12856c(new b());
    }

    @Override // p231jv.InterfaceC7377e.a
    /* JADX INFO: renamed from: a */
    public InterfaceC7377e<?, ?> mo30576a(Type type, Annotation[] annotationArr, C7397y c7397y) {
        if (InterfaceC7377e.a.m30575c(type) != InterfaceC7376d.class) {
            return null;
        }
        return new a(InterfaceC7377e.a.m30574b(0, (ParameterizedType) type));
    }
}
