package sw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import mv.g0;
import mv.i0;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h.a {

    public static final class a implements h<i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31934a = new a();

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(i0 i0Var) {
            try {
                return c0.a(i0Var);
            } finally {
                i0Var.close();
            }
        }
    }

    /* JADX INFO: renamed from: sw.b$b, reason: collision with other inner class name */
    public static final class C0639b implements h<g0, g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0639b f31935a = new C0639b();

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(g0 g0Var) {
            return g0Var;
        }
    }

    public static final class c implements h<i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31936a = new c();

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(i0 i0Var) {
            return i0Var;
        }
    }

    public static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31937a = new d();

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements h<i0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31938a = new e();

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit a(i0 i0Var) {
            i0Var.close();
            return Unit.f21506a;
        }
    }

    public static final class f implements h<i0, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f31939a = new f();

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i0 i0Var) {
            i0Var.close();
            return null;
        }
    }

    @Override // sw.h.a
    public h<?, g0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (g0.class.isAssignableFrom(c0.h(type))) {
            return C0639b.f31935a;
        }
        return null;
    }

    @Override // sw.h.a
    public h<i0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == i0.class) {
            return c0.l(annotationArr, vw.w.class) ? c.f31936a : a.f31934a;
        }
        if (type == Void.class) {
            return f.f31939a;
        }
        if (c0.m(type)) {
            return e.f31938a;
        }
        return null;
    }
}
