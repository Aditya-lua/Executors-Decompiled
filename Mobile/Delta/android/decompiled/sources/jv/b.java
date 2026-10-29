package jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h.a {

    public static final class a implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21827a = new a();

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            try {
                return c0.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* JADX INFO: renamed from: jv.b$b, reason: collision with other inner class name */
    public static final class C0385b implements h<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0385b f21828a = new C0385b();

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f21829a = new c();

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f21830a = new d();

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements h<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f21831a = new e();

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit a(ResponseBody responseBody) {
            responseBody.close();
            return Unit.f22483a;
        }
    }

    public static final class f implements h<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f21832a = new f();

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // jv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (RequestBody.class.isAssignableFrom(c0.h(type))) {
            return C0385b.f21828a;
        }
        return null;
    }

    @Override // jv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == ResponseBody.class) {
            return c0.l(annotationArr, mv.w.class) ? c.f21829a : a.f21827a;
        }
        if (type == Void.class) {
            return f.f21832a;
        }
        if (c0.m(type)) {
            return e.f21831a;
        }
        return null;
    }
}
