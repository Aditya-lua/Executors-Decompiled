package hv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h.a {

    public static final class a implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19837a = new a();

        @Override // hv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            try {
                return c0.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* JADX INFO: renamed from: hv.b$b, reason: collision with other inner class name */
    public static final class C0351b implements h<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0351b f19838a = new C0351b();

        @Override // hv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody a(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f19839a = new c();

        @Override // hv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f19840a = new d();

        @Override // hv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements h<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f19841a = new e();

        @Override // hv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit a(ResponseBody responseBody) {
            responseBody.close();
            return Unit.f22938a;
        }
    }

    public static final class f implements h<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f19842a = new f();

        @Override // hv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // hv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (RequestBody.class.isAssignableFrom(c0.h(type))) {
            return C0351b.f19838a;
        }
        return null;
    }

    @Override // hv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == ResponseBody.class) {
            return c0.l(annotationArr, kv.w.class) ? c.f19839a : a.f19837a;
        }
        if (type == Void.class) {
            return f.f19842a;
        }
        if (c0.m(type)) {
            return e.f19841a;
        }
        return null;
    }
}
