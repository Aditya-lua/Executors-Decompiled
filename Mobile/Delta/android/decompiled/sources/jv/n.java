package jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n<ResponseT, ReturnT> extends z<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f21856a;
    public final Call.Factory b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<ResponseBody, ResponseT> f21857c;

    public static final class a<ResponseT, ReturnT> extends n<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, ReturnT> f21858d;

        public a(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(wVar, factory, hVar);
            this.f21858d = eVar;
        }

        @Override // jv.n
        public ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f21858d.b(dVar);
        }
    }

    public static final class b<ResponseT> extends n<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f21859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f21860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f21861f;

        public b(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z10, boolean z11) {
            super(wVar, factory, hVar);
            this.f21859d = eVar;
            this.f21860e = z10;
            this.f21861f = z11;
        }

        @Override // jv.n
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.f21859d.b(dVar);
            nt.b bVar = (nt.b) objArr[objArr.length - 1];
            try {
                if (this.f21861f) {
                    return p.d(dVarB, bVar);
                }
                return this.f21860e ? p.b(dVarB, bVar) : p.a(dVarB, bVar);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return p.e(th2, bVar);
            }
        }
    }

    public static final class c<ResponseT> extends n<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f21862d;

        public c(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(wVar, factory, hVar);
            this.f21862d = eVar;
        }

        @Override // jv.n
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.f21862d.b(dVar);
            nt.b bVar = (nt.b) objArr[objArr.length - 1];
            try {
                return p.c(dVarB, bVar);
            } catch (Exception e10) {
                return p.e(e10, bVar);
            }
        }
    }

    public n(w wVar, Call.Factory factory, h<ResponseBody, ResponseT> hVar) {
        this.f21856a = wVar;
        this.b = factory;
        this.f21857c = hVar;
    }

    public static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) yVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw c0.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> h<ResponseBody, ResponseT> e(y yVar, Method method, Type type) {
        try {
            return yVar.i(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw c0.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> n<ResponseT, ReturnT> f(y yVar, Method method, w wVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zM;
        boolean z12 = wVar.f21949l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = c0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (c0.h(typeF) == x.class && (typeF instanceof ParameterizedType)) {
                typeF = c0.g(0, (ParameterizedType) typeF);
                zM = false;
                z10 = true;
            } else {
                if (c0.h(typeF) == d.class) {
                    throw c0.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", c0.g(0, (ParameterizedType) typeF));
                }
                zM = c0.m(typeF);
                z10 = false;
            }
            genericReturnType = new c0.b(null, d.class, typeF);
            annotations = b0.a(annotations);
            z11 = zM;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        e eVarD = d(yVar, method, genericReturnType, annotations);
        Type typeA = eVarD.a();
        if (typeA == Response.class) {
            throw c0.n(method, "'" + c0.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == x.class) {
            throw c0.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (wVar.f21941d.equals("HEAD") && !Void.class.equals(typeA) && !c0.m(typeA)) {
            throw c0.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h hVarE = e(yVar, method, typeA);
        Call.Factory factory = yVar.b;
        if (z12) {
            return z10 ? new c(wVar, factory, hVarE, eVarD) : new b(wVar, factory, hVarE, eVarD, false, z11);
        }
        return new a(wVar, factory, hVarE, eVarD);
    }

    @Override // jv.z
    public final ReturnT a(Object obj, Object[] objArr) {
        return c(new q(this.f21856a, obj, objArr, this.b, this.f21857c), objArr);
    }

    public abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
