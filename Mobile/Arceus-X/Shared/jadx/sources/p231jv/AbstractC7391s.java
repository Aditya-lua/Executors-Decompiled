package p231jv;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: renamed from: jv.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7391s<T> {

    /* JADX INFO: renamed from: jv.s$a */
    public class a extends AbstractC7391s<Iterable<T>> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC7391s.this.mo30611a(c7394v, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$b */
    public class b extends AbstractC7391s<Object> {
        public b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: jv.s */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC7391s.this.mo30611a(c7394v, Array.get(obj, i10));
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$c */
    public static final class c<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final Method f28362a;

        /* JADX INFO: renamed from: b */
        public final int f28363b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7380h<T, RequestBody> f28364c;

        public c(Method method, int i10, InterfaceC7380h<T, RequestBody> interfaceC7380h) {
            this.f28362a = method;
            this.f28363b = i10;
            this.f28364c = interfaceC7380h;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            if (t8 == null) {
                throw C7375c0.m30565p(this.f28362a, this.f28363b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c7394v.m30635l(this.f28364c.mo30540a(t8));
            } catch (IOException e10) {
                throw C7375c0.m30566q(this.f28362a, e10, this.f28363b, "Unable to convert " + t8 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$d */
    public static final class d<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final String f28365a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7380h<T, String> f28366b;

        /* JADX INFO: renamed from: c */
        public final boolean f28367c;

        public d(String str, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f28365a = str;
            this.f28366b = interfaceC7380h;
            this.f28367c = z10;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            String strMo30540a;
            if (t8 == null || (strMo30540a = this.f28366b.mo30540a(t8)) == null) {
                return;
            }
            c7394v.m30626a(this.f28365a, strMo30540a, this.f28367c);
        }
    }

    /* JADX INFO: renamed from: jv.s$e */
    public static final class e<T> extends AbstractC7391s<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f28368a;

        /* JADX INFO: renamed from: b */
        public final int f28369b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7380h<T, String> f28370c;

        /* JADX INFO: renamed from: d */
        public final boolean f28371d;

        public e(Method method, int i10, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            this.f28368a = method;
            this.f28369b = i10;
            this.f28370c = interfaceC7380h;
            this.f28371d = z10;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, Map<String, T> map) {
            if (map == null) {
                throw C7375c0.m30565p(this.f28368a, this.f28369b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7375c0.m30565p(this.f28368a, this.f28369b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7375c0.m30565p(this.f28368a, this.f28369b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strMo30540a = this.f28370c.mo30540a(value);
                if (strMo30540a == null) {
                    throw C7375c0.m30565p(this.f28368a, this.f28369b, "Field map value '" + value + "' converted to null by " + this.f28370c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                c7394v.m30626a(key, strMo30540a, this.f28371d);
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$f */
    public static final class f<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final String f28372a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7380h<T, String> f28373b;

        /* JADX INFO: renamed from: c */
        public final boolean f28374c;

        public f(String str, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f28372a = str;
            this.f28373b = interfaceC7380h;
            this.f28374c = z10;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            String strMo30540a;
            if (t8 == null || (strMo30540a = this.f28373b.mo30540a(t8)) == null) {
                return;
            }
            c7394v.m30627b(this.f28372a, strMo30540a, this.f28374c);
        }
    }

    /* JADX INFO: renamed from: jv.s$g */
    public static final class g<T> extends AbstractC7391s<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f28375a;

        /* JADX INFO: renamed from: b */
        public final int f28376b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7380h<T, String> f28377c;

        /* JADX INFO: renamed from: d */
        public final boolean f28378d;

        public g(Method method, int i10, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            this.f28375a = method;
            this.f28376b = i10;
            this.f28377c = interfaceC7380h;
            this.f28378d = z10;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, Map<String, T> map) {
            if (map == null) {
                throw C7375c0.m30565p(this.f28375a, this.f28376b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7375c0.m30565p(this.f28375a, this.f28376b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7375c0.m30565p(this.f28375a, this.f28376b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                c7394v.m30627b(key, this.f28377c.mo30540a(value), this.f28378d);
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$h */
    public static final class h extends AbstractC7391s<Headers> {

        /* JADX INFO: renamed from: a */
        public final Method f28379a;

        /* JADX INFO: renamed from: b */
        public final int f28380b;

        public h(Method method, int i10) {
            this.f28379a = method;
            this.f28380b = i10;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, Headers headers) {
            if (headers == null) {
                throw C7375c0.m30565p(this.f28379a, this.f28380b, "Headers parameter must not be null.", new Object[0]);
            }
            c7394v.m30628c(headers);
        }
    }

    /* JADX INFO: renamed from: jv.s$i */
    public static final class i<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final Method f28381a;

        /* JADX INFO: renamed from: b */
        public final int f28382b;

        /* JADX INFO: renamed from: c */
        public final Headers f28383c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7380h<T, RequestBody> f28384d;

        public i(Method method, int i10, Headers headers, InterfaceC7380h<T, RequestBody> interfaceC7380h) {
            this.f28381a = method;
            this.f28382b = i10;
            this.f28383c = headers;
            this.f28384d = interfaceC7380h;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                c7394v.m30629d(this.f28383c, this.f28384d.mo30540a(t8));
            } catch (IOException e10) {
                throw C7375c0.m30565p(this.f28381a, this.f28382b, "Unable to convert " + t8 + " to RequestBody", e10);
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$j */
    public static final class j<T> extends AbstractC7391s<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f28385a;

        /* JADX INFO: renamed from: b */
        public final int f28386b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7380h<T, RequestBody> f28387c;

        /* JADX INFO: renamed from: d */
        public final String f28388d;

        public j(Method method, int i10, InterfaceC7380h<T, RequestBody> interfaceC7380h, String str) {
            this.f28385a = method;
            this.f28386b = i10;
            this.f28387c = interfaceC7380h;
            this.f28388d = str;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, Map<String, T> map) {
            if (map == null) {
                throw C7375c0.m30565p(this.f28385a, this.f28386b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7375c0.m30565p(this.f28385a, this.f28386b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7375c0.m30565p(this.f28385a, this.f28386b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                c7394v.m30629d(Headers.m38576of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f28388d), this.f28387c.mo30540a(value));
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$k */
    public static final class k<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final Method f28389a;

        /* JADX INFO: renamed from: b */
        public final int f28390b;

        /* JADX INFO: renamed from: c */
        public final String f28391c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7380h<T, String> f28392d;

        /* JADX INFO: renamed from: e */
        public final boolean f28393e;

        public k(Method method, int i10, String str, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            this.f28389a = method;
            this.f28390b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f28391c = str;
            this.f28392d = interfaceC7380h;
            this.f28393e = z10;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) throws EOFException {
            if (t8 != null) {
                c7394v.m30631f(this.f28391c, this.f28392d.mo30540a(t8), this.f28393e);
                return;
            }
            throw C7375c0.m30565p(this.f28389a, this.f28390b, "Path parameter \"" + this.f28391c + "\" value must not be null.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: jv.s$l */
    public static final class l<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final String f28394a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7380h<T, String> f28395b;

        /* JADX INFO: renamed from: c */
        public final boolean f28396c;

        public l(String str, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f28394a = str;
            this.f28395b = interfaceC7380h;
            this.f28396c = z10;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            String strMo30540a;
            if (t8 == null || (strMo30540a = this.f28395b.mo30540a(t8)) == null) {
                return;
            }
            c7394v.m30632g(this.f28394a, strMo30540a, this.f28396c);
        }
    }

    /* JADX INFO: renamed from: jv.s$m */
    public static final class m<T> extends AbstractC7391s<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f28397a;

        /* JADX INFO: renamed from: b */
        public final int f28398b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7380h<T, String> f28399c;

        /* JADX INFO: renamed from: d */
        public final boolean f28400d;

        public m(Method method, int i10, InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            this.f28397a = method;
            this.f28398b = i10;
            this.f28399c = interfaceC7380h;
            this.f28400d = z10;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, Map<String, T> map) {
            if (map == null) {
                throw C7375c0.m30565p(this.f28397a, this.f28398b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7375c0.m30565p(this.f28397a, this.f28398b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7375c0.m30565p(this.f28397a, this.f28398b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strMo30540a = this.f28399c.mo30540a(value);
                if (strMo30540a == null) {
                    throw C7375c0.m30565p(this.f28397a, this.f28398b, "Query map value '" + value + "' converted to null by " + this.f28399c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                c7394v.m30632g(key, strMo30540a, this.f28400d);
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$n */
    public static final class n<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7380h<T, String> f28401a;

        /* JADX INFO: renamed from: b */
        public final boolean f28402b;

        public n(InterfaceC7380h<T, String> interfaceC7380h, boolean z10) {
            this.f28401a = interfaceC7380h;
            this.f28402b = z10;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            if (t8 == null) {
                return;
            }
            c7394v.m30632g(this.f28401a.mo30540a(t8), null, this.f28402b);
        }
    }

    /* JADX INFO: renamed from: jv.s$o */
    public static final class o extends AbstractC7391s<MultipartBody.Part> {

        /* JADX INFO: renamed from: a */
        public static final o f28403a = new o();

        /* JADX DEBUG: Method merged with bridge method: a(Ljv/v;Ljava/lang/Object;)V */
        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30611a(C7394v c7394v, MultipartBody.Part part) {
            if (part != null) {
                c7394v.m30630e(part);
            }
        }
    }

    /* JADX INFO: renamed from: jv.s$p */
    public static final class p extends AbstractC7391s<Object> {

        /* JADX INFO: renamed from: a */
        public final Method f28404a;

        /* JADX INFO: renamed from: b */
        public final int f28405b;

        public p(Method method, int i10) {
            this.f28404a = method;
            this.f28405b = i10;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, Object obj) {
            if (obj == null) {
                throw C7375c0.m30565p(this.f28404a, this.f28405b, "@Url parameter is null.", new Object[0]);
            }
            c7394v.m30636m(obj);
        }
    }

    /* JADX INFO: renamed from: jv.s$q */
    public static final class q<T> extends AbstractC7391s<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f28406a;

        public q(Class<T> cls) {
            this.f28406a = cls;
        }

        @Override // p231jv.AbstractC7391s
        /* JADX INFO: renamed from: a */
        public void mo30611a(C7394v c7394v, T t8) {
            c7394v.m30633h(this.f28406a, t8);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo30611a(C7394v c7394v, T t8);

    /* JADX INFO: renamed from: b */
    public final AbstractC7391s<Object> m30612b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC7391s<Iterable<T>> m30613c() {
        return new a();
    }
}
