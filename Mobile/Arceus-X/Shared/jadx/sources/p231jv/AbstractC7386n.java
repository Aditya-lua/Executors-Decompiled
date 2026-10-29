package p231jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: jv.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7386n<ResponseT, ReturnT> extends AbstractC7398z<ReturnT> {

    /* JADX INFO: renamed from: a */
    public final C7395w f28319a;

    /* JADX INFO: renamed from: b */
    public final Call.Factory f28320b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7380h<ResponseBody, ResponseT> f28321c;

    /* JADX INFO: renamed from: jv.n$a */
    public static final class a<ResponseT, ReturnT> extends AbstractC7386n<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC7377e<ResponseT, ReturnT> f28322d;

        public a(C7395w c7395w, Call.Factory factory, InterfaceC7380h<ResponseBody, ResponseT> interfaceC7380h, InterfaceC7377e<ResponseT, ReturnT> interfaceC7377e) {
            super(c7395w, factory, interfaceC7380h);
            this.f28322d = interfaceC7377e;
        }

        @Override // p231jv.AbstractC7386n
        /* JADX INFO: renamed from: c */
        public ReturnT mo30593c(InterfaceC7376d<ResponseT> interfaceC7376d, Object[] objArr) {
            return this.f28322d.mo30573b(interfaceC7376d);
        }
    }

    /* JADX INFO: renamed from: jv.n$b */
    public static final class b<ResponseT> extends AbstractC7386n<ResponseT, Object> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC7377e<ResponseT, InterfaceC7376d<ResponseT>> f28323d;

        /* JADX INFO: renamed from: e */
        public final boolean f28324e;

        /* JADX INFO: renamed from: f */
        public final boolean f28325f;

        public b(C7395w c7395w, Call.Factory factory, InterfaceC7380h<ResponseBody, ResponseT> interfaceC7380h, InterfaceC7377e<ResponseT, InterfaceC7376d<ResponseT>> interfaceC7377e, boolean z10, boolean z11) {
            super(c7395w, factory, interfaceC7380h);
            this.f28323d = interfaceC7377e;
            this.f28324e = z10;
            this.f28325f = z11;
        }

        @Override // p231jv.AbstractC7386n
        /* JADX INFO: renamed from: c */
        public Object mo30593c(InterfaceC7376d<ResponseT> interfaceC7376d, Object[] objArr) {
            InterfaceC7376d<ResponseT> interfaceC7376dMo30573b = this.f28323d.mo30573b(interfaceC7376d);
            InterfaceC9557b interfaceC9557b = (InterfaceC9557b) objArr[objArr.length - 1];
            try {
                if (this.f28325f) {
                    return C7388p.m30599d(interfaceC7376dMo30573b, interfaceC9557b);
                }
                return this.f28324e ? C7388p.m30597b(interfaceC7376dMo30573b, interfaceC9557b) : C7388p.m30596a(interfaceC7376dMo30573b, interfaceC9557b);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return C7388p.m30600e(th2, interfaceC9557b);
            }
        }
    }

    /* JADX INFO: renamed from: jv.n$c */
    public static final class c<ResponseT> extends AbstractC7386n<ResponseT, Object> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC7377e<ResponseT, InterfaceC7376d<ResponseT>> f28326d;

        public c(C7395w c7395w, Call.Factory factory, InterfaceC7380h<ResponseBody, ResponseT> interfaceC7380h, InterfaceC7377e<ResponseT, InterfaceC7376d<ResponseT>> interfaceC7377e) {
            super(c7395w, factory, interfaceC7380h);
            this.f28326d = interfaceC7377e;
        }

        @Override // p231jv.AbstractC7386n
        /* JADX INFO: renamed from: c */
        public Object mo30593c(InterfaceC7376d<ResponseT> interfaceC7376d, Object[] objArr) {
            InterfaceC7376d<ResponseT> interfaceC7376dMo30573b = this.f28326d.mo30573b(interfaceC7376d);
            InterfaceC9557b interfaceC9557b = (InterfaceC9557b) objArr[objArr.length - 1];
            try {
                return C7388p.m30598c(interfaceC7376dMo30573b, interfaceC9557b);
            } catch (Exception e10) {
                return C7388p.m30600e(e10, interfaceC9557b);
            }
        }
    }

    public AbstractC7386n(C7395w c7395w, Call.Factory factory, InterfaceC7380h<ResponseBody, ResponseT> interfaceC7380h) {
        this.f28319a = c7395w;
        this.f28320b = factory;
        this.f28321c = interfaceC7380h;
    }

    /* JADX INFO: renamed from: d */
    public static <ResponseT, ReturnT> InterfaceC7377e<ResponseT, ReturnT> m30589d(C7397y c7397y, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (InterfaceC7377e<ResponseT, ReturnT>) c7397y.m30659a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw C7375c0.m30564o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* JADX INFO: renamed from: e */
    public static <ResponseT> InterfaceC7380h<ResponseBody, ResponseT> m30590e(C7397y c7397y, Method method, Type type) {
        try {
            return c7397y.m30667i(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw C7375c0.m30564o(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: renamed from: f */
    public static <ResponseT, ReturnT> AbstractC7386n<ResponseT, ReturnT> m30591f(C7397y c7397y, Method method, C7395w c7395w) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zM30562m;
        boolean z12 = c7395w.f28436l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM30555f = C7375c0.m30555f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C7375c0.m30557h(typeM30555f) == C7396x.class && (typeM30555f instanceof ParameterizedType)) {
                typeM30555f = C7375c0.m30556g(0, (ParameterizedType) typeM30555f);
                zM30562m = false;
                z10 = true;
            } else {
                if (C7375c0.m30557h(typeM30555f) == InterfaceC7376d.class) {
                    throw C7375c0.m30563n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", C7375c0.m30556g(0, (ParameterizedType) typeM30555f));
                }
                zM30562m = C7375c0.m30562m(typeM30555f);
                z10 = false;
            }
            genericReturnType = new C7375c0.b(null, InterfaceC7376d.class, typeM30555f);
            annotations = C7373b0.m30547a(annotations);
            z11 = zM30562m;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        InterfaceC7377e interfaceC7377eM30589d = m30589d(c7397y, method, genericReturnType, annotations);
        Type typeMo30572a = interfaceC7377eM30589d.mo30572a();
        if (typeMo30572a == Response.class) {
            throw C7375c0.m30563n(method, "'" + C7375c0.m30557h(typeMo30572a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo30572a == C7396x.class) {
            throw C7375c0.m30563n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c7395w.f28428d.equals("HEAD") && !Void.class.equals(typeMo30572a) && !C7375c0.m30562m(typeMo30572a)) {
            throw C7375c0.m30563n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        InterfaceC7380h interfaceC7380hM30590e = m30590e(c7397y, method, typeMo30572a);
        Call.Factory factory = c7397y.f28467b;
        if (z12) {
            return z10 ? new c(c7395w, factory, interfaceC7380hM30590e, interfaceC7377eM30589d) : new b(c7395w, factory, interfaceC7380hM30590e, interfaceC7377eM30589d, false, z11);
        }
        return new a(c7395w, factory, interfaceC7380hM30590e, interfaceC7377eM30589d);
    }

    @Override // p231jv.AbstractC7398z
    /* JADX INFO: renamed from: a */
    public final ReturnT mo30592a(Object obj, Object[] objArr) {
        return mo30593c(new C7389q(this.f28319a, obj, objArr, this.f28320b, this.f28321c), objArr);
    }

    /* JADX INFO: renamed from: c */
    public abstract ReturnT mo30593c(InterfaceC7376d<ResponseT> interfaceC7376d, Object[] objArr);
}
