package sw;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import mv.g0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s<T> {

    public class a extends s<Iterable<T>> {
        public a() {
        }

        @Override // sw.s
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
        @Override // sw.s
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
        public final Method f32000a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sw.h<T, g0> f32001c;

        public c(Method method, int i10, sw.h<T, g0> hVar) {
            this.f32000a = method;
            this.b = i10;
            this.f32001c = hVar;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                throw c0.p(this.f32000a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.l(this.f32001c.a(t8));
            } catch (IOException e10) {
                throw c0.q(this.f32000a, e10, this.b, "Unable to convert " + t8 + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class d<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32002a;
        public final sw.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f32003c;

        public d(String str, sw.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f32002a = str;
            this.b = hVar;
            this.f32003c = z10;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.a(this.f32002a, strA, this.f32003c);
        }
    }

    public static final class e<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32004a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sw.h<T, String> f32005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32006d;

        public e(Method method, int i10, sw.h<T, String> hVar, boolean z10) {
            this.f32004a = method;
            this.b = i10;
            this.f32005c = hVar;
            this.f32006d = z10;
        }

        @Override // sw.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f32004a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f32004a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f32004a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f32005c.a(value);
                if (strA == null) {
                    throw c0.p(this.f32004a, this.b, "Field map value '" + value + "' converted to null by " + this.f32005c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.a(key, strA, this.f32006d);
            }
        }
    }

    public static final class f<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32007a;
        public final sw.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f32008c;

        public f(String str, sw.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f32007a = str;
            this.b = hVar;
            this.f32008c = z10;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.b(this.f32007a, strA, this.f32008c);
        }
    }

    public static final class g<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32009a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sw.h<T, String> f32010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32011d;

        public g(Method method, int i10, sw.h<T, String> hVar, boolean z10) {
            this.f32009a = method;
            this.b = i10;
            this.f32010c = hVar;
            this.f32011d = z10;
        }

        @Override // sw.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f32009a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f32009a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f32009a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.b(key, this.f32010c.a(value), this.f32011d);
            }
        }
    }

    public static final class h extends s<mv.y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32012a;
        public final int b;

        public h(Method method, int i10) {
            this.f32012a = method;
            this.b = i10;
        }

        @Override // sw.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, mv.y yVar) {
            if (yVar == null) {
                throw c0.p(this.f32012a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.c(yVar);
        }
    }

    public static final class i<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32013a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mv.y f32014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final sw.h<T, g0> f32015d;

        public i(Method method, int i10, mv.y yVar, sw.h<T, g0> hVar) {
            this.f32013a = method;
            this.b = i10;
            this.f32014c = yVar;
            this.f32015d = hVar;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                vVar.d(this.f32014c, this.f32015d.a(t8));
            } catch (IOException e10) {
                throw c0.p(this.f32013a, this.b, "Unable to convert " + t8 + " to RequestBody", e10);
            }
        }
    }

    public static final class j<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32016a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sw.h<T, g0> f32017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f32018d;

        public j(Method method, int i10, sw.h<T, g0> hVar, String str) {
            this.f32016a = method;
            this.b = i10;
            this.f32017c = hVar;
            this.f32018d = str;
        }

        @Override // sw.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f32016a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f32016a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f32016a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.d(mv.y.f("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f32018d), this.f32017c.a(value));
            }
        }
    }

    public static final class k<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32019a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final sw.h<T, String> f32021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f32022e;

        public k(Method method, int i10, String str, sw.h<T, String> hVar, boolean z10) {
            this.f32019a = method;
            this.b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f32020c = str;
            this.f32021d = hVar;
            this.f32022e = z10;
        }

        @Override // sw.s
        public void a(v vVar, T t8) throws EOFException {
            if (t8 != null) {
                vVar.f(this.f32020c, this.f32021d.a(t8), this.f32022e);
                return;
            }
            throw c0.p(this.f32019a, this.b, "Path parameter \"" + this.f32020c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32023a;
        public final sw.h<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f32024c;

        public l(String str, sw.h<T, String> hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f32023a = str;
            this.b = hVar;
            this.f32024c = z10;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            String strA;
            if (t8 == null || (strA = this.b.a(t8)) == null) {
                return;
            }
            vVar.g(this.f32023a, strA, this.f32024c);
        }
    }

    public static final class m<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32025a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sw.h<T, String> f32026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32027d;

        public m(Method method, int i10, sw.h<T, String> hVar, boolean z10) {
            this.f32025a = method;
            this.b = i10;
            this.f32026c = hVar;
            this.f32027d = z10;
        }

        @Override // sw.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f32025a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f32025a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f32025a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f32026c.a(value);
                if (strA == null) {
                    throw c0.p(this.f32025a, this.b, "Query map value '" + value + "' converted to null by " + this.f32026c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.g(key, strA, this.f32027d);
            }
        }
    }

    public static final class n<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sw.h<T, String> f32028a;
        public final boolean b;

        public n(sw.h<T, String> hVar, boolean z10) {
            this.f32028a = hVar;
            this.b = z10;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            if (t8 == null) {
                return;
            }
            vVar.g(this.f32028a.a(t8), null, this.b);
        }
    }

    public static final class o extends s<mv.c0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f32029a = new o();

        @Override // sw.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, mv.c0.c cVar) {
            if (cVar != null) {
                vVar.e(cVar);
            }
        }
    }

    public static final class p extends s<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f32030a;
        public final int b;

        public p(Method method, int i10) {
            this.f32030a = method;
            this.b = i10;
        }

        @Override // sw.s
        public void a(v vVar, Object obj) {
            if (obj == null) {
                throw c0.p(this.f32030a, this.b, "@Url parameter is null.", new Object[0]);
            }
            vVar.m(obj);
        }
    }

    public static final class q<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f32031a;

        public q(Class<T> cls) {
            this.f32031a = cls;
        }

        @Override // sw.s
        public void a(v vVar, T t8) {
            vVar.h(this.f32031a, t8);
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
