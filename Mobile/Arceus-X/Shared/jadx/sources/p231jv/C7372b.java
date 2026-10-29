package p231jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import mv.InterfaceC8714w;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: jv.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7372b extends InterfaceC7380h.a {

    /* JADX INFO: renamed from: jv.b$a */
    public static final class a implements InterfaceC7380h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a */
        public static final a f28279a = new a();

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody mo30540a(ResponseBody responseBody) {
            try {
                return C7375c0.m30550a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* JADX INFO: renamed from: jv.b$b */
    public static final class b implements InterfaceC7380h<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a */
        public static final b f28280a = new b();

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestBody mo30540a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* JADX INFO: renamed from: jv.b$c */
    public static final class c implements InterfaceC7380h<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a */
        public static final c f28281a = new c();

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseBody mo30540a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* JADX INFO: renamed from: jv.b$d */
    public static final class d implements InterfaceC7380h<Object, String> {

        /* JADX INFO: renamed from: a */
        public static final d f28282a = new d();

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo30540a(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: jv.b$e */
    public static final class e implements InterfaceC7380h<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a */
        public static final e f28283a = new e();

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit mo30540a(ResponseBody responseBody) {
            responseBody.close();
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: jv.b$f */
    public static final class f implements InterfaceC7380h<ResponseBody, Void> {

        /* JADX INFO: renamed from: a */
        public static final f f28284a = new f();

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30540a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: c */
    public InterfaceC7380h<?, RequestBody> mo30538c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7397y c7397y) {
        if (RequestBody.class.isAssignableFrom(C7375c0.m30557h(type))) {
            return b.f28280a;
        }
        return null;
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: d */
    public InterfaceC7380h<ResponseBody, ?> mo30539d(Type type, Annotation[] annotationArr, C7397y c7397y) {
        if (type == ResponseBody.class) {
            return C7375c0.m30561l(annotationArr, InterfaceC8714w.class) ? c.f28281a : a.f28279a;
        }
        if (type == Void.class) {
            return f.f28284a;
        }
        if (C7375c0.m30562m(type)) {
            return e.f28283a;
        }
        return null;
    }
}
