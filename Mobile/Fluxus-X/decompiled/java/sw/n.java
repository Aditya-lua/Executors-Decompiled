package sw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import mv.h0;
import mv.i0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n<ResponseT, ReturnT> extends z<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f31963a;
    public final mv.e.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<i0, ResponseT> f31964c;

    public static final class a<ResponseT, ReturnT> extends n<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, ReturnT> f31965d;

        public a(w wVar, mv.e.a aVar, h<i0, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(wVar, aVar, hVar);
            this.f31965d = eVar;
        }

        @Override // sw.n
        public ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f31965d.b(dVar);
        }
    }

    public static final class b<ResponseT> extends n<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f31966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f31967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f31968f;

        public b(w wVar, mv.e.a aVar, h<i0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z10, boolean z11) {
            super(wVar, aVar, hVar);
            this.f31966d = eVar;
            this.f31967e = z10;
            this.f31968f = z11;
        }

        @Override // sw.n
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.f31966d.b(dVar);
            eu.b bVar = (eu.b) objArr[objArr.length - 1];
            try {
                if (this.f31968f) {
                    return p.d(dVarB, bVar);
                }
                return this.f31967e ? p.b(dVarB, bVar) : p.a(dVarB, bVar);
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
        public final e<ResponseT, d<ResponseT>> f31969d;

        public c(w wVar, mv.e.a aVar, h<i0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(wVar, aVar, hVar);
            this.f31969d = eVar;
        }

        @Override // sw.n
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.f31969d.b(dVar);
            eu.b bVar = (eu.b) objArr[objArr.length - 1];
            try {
                return p.c(dVarB, bVar);
            } catch (Exception e10) {
                return p.e(e10, bVar);
            }
        }
    }

    public n(w wVar, mv.e.a aVar, h<i0, ResponseT> hVar) {
        this.f31963a = wVar;
        this.b = aVar;
        this.f31964c = hVar;
    }

    public static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) yVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw c0.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> h<i0, ResponseT> e(y yVar, Method method, Type type) {
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
        boolean z12 = wVar.f32058l;
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
        if (typeA == h0.class) {
            throw c0.n(method, "'" + c0.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == x.class) {
            throw c0.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (wVar.f32050d.equals("HEAD") && !Void.class.equals(typeA) && !c0.m(typeA)) {
            throw c0.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h hVarE = e(yVar, method, typeA);
        mv.e.a aVar = yVar.b;
        if (z12) {
            return z10 ? new c(wVar, aVar, hVarE, eVarD) : new b(wVar, aVar, hVarE, eVarD, false, z11);
        }
        return new a(wVar, aVar, hVarE, eVarD);
    }

    @Override // sw.z
    public final ReturnT a(Object obj, Object[] objArr) {
        return c(new q(this.f31963a, obj, objArr, this.b, this.f31964c), objArr);
    }

    public abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
