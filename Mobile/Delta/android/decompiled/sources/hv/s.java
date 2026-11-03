package hv;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class s<T> {

    public class a extends s<Iterable<T>> {
        public a() {
        }

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                s.this.a(vVar, it.next());
            }
        }
    }

    public class b extends s<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hv.s
        public void a(v vVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                s.this.a(vVar, Array.get(obj, i10));
            }
        }
    }

    public static final class c<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19902a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hv.h<T, RequestBody> f19903c;

        public c(Method method, int i10, hv.h<T, RequestBody> hVar) {
            this.f19902a = method;
            this.b = i10;
            this.f19903c = hVar;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                throw c0.p(this.f19902a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.l(this.f19903c.a(t8));
            } catch (IOException e10) {
                throw c0.q(this.f19902a, e10, this.b, "Unable to convert " + t8 + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class d<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19904a;
        public final hv.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19905c;

        public d(String str, hv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f19904a = str;
            this.b = hVar;
            this.f19905c = z10;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.a(this.f19904a, strA, this.f19905c);
        }
    }

    public static final class e<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19906a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hv.h<T, String> f19907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19908d;

        public e(Method method, int i10, hv.h<T, String> hVar, boolean z10) {
            this.f19906a = method;
            this.b = i10;
            this.f19907c = hVar;
            this.f19908d = z10;
        }

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f19906a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f19906a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f19906a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f19907c.a(value);
                if (strA == null) {
                    throw c0.p(this.f19906a, this.b, "Field map value '" + value + "' converted to null by " + this.f19907c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.a(key, strA, this.f19908d);
            }
        }
    }

    public static final class f<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19909a;
        public final hv.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19910c;

        public f(String str, hv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f19909a = str;
            this.b = hVar;
            this.f19910c = z10;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.b(this.f19909a, strA, this.f19910c);
        }
    }

    public static final class g<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19911a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hv.h<T, String> f19912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19913d;

        public g(Method method, int i10, hv.h<T, String> hVar, boolean z10) {
            this.f19911a = method;
            this.b = i10;
            this.f19912c = hVar;
            this.f19913d = z10;
        }

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f19911a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f19911a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f19911a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.b(key, this.f19912c.a(value), this.f19913d);
            }
        }
    }

    public static final class h extends s<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19914a;
        public final int b;

        public h(Method method, int i10) {
            this.f19914a = method;
            this.b = i10;
        }

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Headers headers) {
            if (headers == null) {
                throw c0.p(this.f19914a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.c(headers);
        }
    }

    public static final class i<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19915a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Headers f19916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hv.h<T, RequestBody> f19917d;

        public i(Method method, int i10, Headers headers, hv.h<T, RequestBody> hVar) {
            this.f19915a = method;
            this.b = i10;
            this.f19916c = headers;
            this.f19917d = hVar;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                vVar.d(this.f19916c, this.f19917d.a(t8));
            } catch (IOException e10) {
                throw c0.p(this.f19915a, this.b, "Unable to convert " + t8 + " to RequestBody", e10);
            }
        }
    }

    public static final class j<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19918a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hv.h<T, RequestBody> f19919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f19920d;

        public j(Method method, int i10, hv.h<T, RequestBody> hVar, String str) {
            this.f19918a = method;
            this.b = i10;
            this.f19919c = hVar;
            this.f19920d = str;
        }

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f19918a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f19918a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f19918a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f19920d), this.f19919c.a(value));
            }
        }
    }

    public static final class k<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19921a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hv.h<T, String> f19923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19924e;

        public k(Method method, int i10, String str, hv.h<T, String> hVar, boolean z10) {
            this.f19921a = method;
            this.b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f19922c = str;
            this.f19923d = hVar;
            this.f19924e = z10;
        }

        @Override // hv.s
        public void a(v vVar, T t8) throws EOFException {
            if (t8 != null) {
                vVar.f(this.f19922c, this.f19923d.a(t8), this.f19924e);
                return;
            }
            throw c0.p(this.f19921a, this.b, "Path parameter \"" + this.f19922c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19925a;
        public final hv.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19926c;

        public l(String str, hv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f19925a = str;
            this.b = hVar;
            this.f19926c = z10;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.g(this.f19925a, strA, this.f19926c);
        }
    }

    public static final class m<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19927a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hv.h<T, String> f19928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19929d;

        public m(Method method, int i10, hv.h<T, String> hVar, boolean z10) {
            this.f19927a = method;
            this.b = i10;
            this.f19928c = hVar;
            this.f19929d = z10;
        }

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f19927a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f19927a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f19927a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f19928c.a(value);
                if (strA == null) {
                    throw c0.p(this.f19927a, this.b, "Query map value '" + value + "' converted to null by " + this.f19928c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.g(key, strA, this.f19929d);
            }
        }
    }

    public static final class n<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hv.h<T, String> f19930a;
        public final boolean b;

        public n(hv.h<T, String> hVar, boolean z10) {
            this.f19930a = hVar;
            this.b = z10;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            vVar.g(this.f19930a.a(t8), null, this.b);
        }
    }

    public static final class o extends s<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f19931a = new o();

        @Override // hv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, MultipartBody.Part part) {
            if (part != null) {
                vVar.e(part);
            }
        }
    }

    public static final class p extends s<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f19932a;
        public final int b;

        public p(Method method, int i10) {
            this.f19932a = method;
            this.b = i10;
        }

        @Override // hv.s
        public void a(v vVar, Object obj) {
            if (obj == null) {
                throw c0.p(this.f19932a, this.b, "@Url parameter is null.", new Object[0]);
            }
            vVar.m(obj);
        }
    }

    public static final class q<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f19933a;

        public q(Class<T> cls) {
            this.f19933a = cls;
        }

        @Override // hv.s
        public void a(v vVar, T t8) {
            vVar.h(this.f19933a, t8);
        }
    }

    public abstract void a(v vVar, T t8);

    public final s<Object> b() {
        return new b();
    }

    public final s<Iterable<T>> c() {
        return new a();
    }
}
