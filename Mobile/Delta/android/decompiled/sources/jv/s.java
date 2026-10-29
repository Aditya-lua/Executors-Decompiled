package jv;

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

        @Override // jv.s
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
        @Override // jv.s
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
        public final Method f21892a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jv.h<T, RequestBody> f21893c;

        public c(Method method, int i10, jv.h<T, RequestBody> hVar) {
            this.f21892a = method;
            this.b = i10;
            this.f21893c = hVar;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                throw c0.p(this.f21892a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.l(this.f21893c.a(t8));
            } catch (IOException e10) {
                throw c0.q(this.f21892a, e10, this.b, "Unable to convert " + t8 + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class d<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21894a;
        public final jv.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21895c;

        public d(String str, jv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21894a = str;
            this.b = hVar;
            this.f21895c = z10;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.a(this.f21894a, strA, this.f21895c);
        }
    }

    public static final class e<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21896a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jv.h<T, String> f21897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21898d;

        public e(Method method, int i10, jv.h<T, String> hVar, boolean z10) {
            this.f21896a = method;
            this.b = i10;
            this.f21897c = hVar;
            this.f21898d = z10;
        }

        @Override // jv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21896a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21896a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21896a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f21897c.a(value);
                if (strA == null) {
                    throw c0.p(this.f21896a, this.b, "Field map value '" + value + "' converted to null by " + this.f21897c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.a(key, strA, this.f21898d);
            }
        }
    }

    public static final class f<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21899a;
        public final jv.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21900c;

        public f(String str, jv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21899a = str;
            this.b = hVar;
            this.f21900c = z10;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.b(this.f21899a, strA, this.f21900c);
        }
    }

    public static final class g<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21901a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jv.h<T, String> f21902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21903d;

        public g(Method method, int i10, jv.h<T, String> hVar, boolean z10) {
            this.f21901a = method;
            this.b = i10;
            this.f21902c = hVar;
            this.f21903d = z10;
        }

        @Override // jv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21901a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21901a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21901a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.b(key, this.f21902c.a(value), this.f21903d);
            }
        }
    }

    public static final class h extends s<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21904a;
        public final int b;

        public h(Method method, int i10) {
            this.f21904a = method;
            this.b = i10;
        }

        @Override // jv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Headers headers) {
            if (headers == null) {
                throw c0.p(this.f21904a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.c(headers);
        }
    }

    public static final class i<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21905a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Headers f21906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final jv.h<T, RequestBody> f21907d;

        public i(Method method, int i10, Headers headers, jv.h<T, RequestBody> hVar) {
            this.f21905a = method;
            this.b = i10;
            this.f21906c = headers;
            this.f21907d = hVar;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                vVar.d(this.f21906c, this.f21907d.a(t8));
            } catch (IOException e10) {
                throw c0.p(this.f21905a, this.b, "Unable to convert " + t8 + " to RequestBody", e10);
            }
        }
    }

    public static final class j<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21908a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jv.h<T, RequestBody> f21909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f21910d;

        public j(Method method, int i10, jv.h<T, RequestBody> hVar, String str) {
            this.f21908a = method;
            this.b = i10;
            this.f21909c = hVar;
            this.f21910d = str;
        }

        @Override // jv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21908a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21908a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21908a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f21910d), this.f21909c.a(value));
            }
        }
    }

    public static final class k<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21911a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f21912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final jv.h<T, String> f21913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f21914e;

        public k(Method method, int i10, String str, jv.h<T, String> hVar, boolean z10) {
            this.f21911a = method;
            this.b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f21912c = str;
            this.f21913d = hVar;
            this.f21914e = z10;
        }

        @Override // jv.s
        public void a(v vVar, T t8) throws EOFException {
            if (t8 != null) {
                vVar.f(this.f21912c, this.f21913d.a(t8), this.f21914e);
                return;
            }
            throw c0.p(this.f21911a, this.b, "Path parameter \"" + this.f21912c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21915a;
        public final jv.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21916c;

        public l(String str, jv.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21915a = str;
            this.b = hVar;
            this.f21916c = z10;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.g(this.f21915a, strA, this.f21916c);
        }
    }

    public static final class m<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21917a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jv.h<T, String> f21918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21919d;

        public m(Method method, int i10, jv.h<T, String> hVar, boolean z10) {
            this.f21917a = method;
            this.b = i10;
            this.f21918c = hVar;
            this.f21919d = z10;
        }

        @Override // jv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f21917a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f21917a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f21917a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f21918c.a(value);
                if (strA == null) {
                    throw c0.p(this.f21917a, this.b, "Query map value '" + value + "' converted to null by " + this.f21918c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.g(key, strA, this.f21919d);
            }
        }
    }

    public static final class n<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jv.h<T, String> f21920a;
        public final boolean b;

        public n(jv.h<T, String> hVar, boolean z10) {
            this.f21920a = hVar;
            this.b = z10;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            vVar.g(this.f21920a.a(t8), null, this.b);
        }
    }

    public static final class o extends s<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f21921a = new o();

        @Override // jv.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, MultipartBody.Part part) {
            if (part != null) {
                vVar.e(part);
            }
        }
    }

    public static final class p extends s<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21922a;
        public final int b;

        public p(Method method, int i10) {
            this.f21922a = method;
            this.b = i10;
        }

        @Override // jv.s
        public void a(v vVar, Object obj) {
            if (obj == null) {
                throw c0.p(this.f21922a, this.b, "@Url parameter is null.", new Object[0]);
            }
            vVar.m(obj);
        }
    }

    public static final class q<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f21923a;

        public q(Class<T> cls) {
            this.f21923a = cls;
        }

        @Override // jv.s
        public void a(v vVar, T t8) {
            vVar.h(this.f21923a, t8);
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
