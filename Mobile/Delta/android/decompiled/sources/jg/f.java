package jg;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final jg.e A = jg.e.f21385d;
    public static final String B = null;
    public static final jg.d C = jg.c.f21378a;
    public static final z D = y.f21451a;
    public static final z E = y.b;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x f21389z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<TypeToken<?>, a0<?>>> f21390a;
    public final ConcurrentMap<TypeToken<?>, a0<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstructorConstructor f21391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f21392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b0> f21393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Excluder f21394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jg.d f21395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Type, h<?>> f21396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jg.e f21401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f21402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f21403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f21405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f21406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f21407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f21408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<b0> f21409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<b0> f21410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f21411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f21412x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<w> f21413y;

    public class a extends a0<Number> {
        public a() {
        }

        @Override // jg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            jsonWriter.value(dDoubleValue);
        }
    }

    public class b extends a0<Number> {
        public b() {
        }

        @Override // jg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            jsonWriter.value(number);
        }
    }

    public class c extends a0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // jg.a0
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    public class d extends a0<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f21416a;

        public d(a0 a0Var) {
            this.f21416a = a0Var;
        }

        @Override // jg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLong read(JsonReader jsonReader) {
            return new AtomicLong(((Number) this.f21416a.read(jsonReader)).longValue());
        }

        @Override // jg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) {
            this.f21416a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    public class e extends a0<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f21417a;

        public e(a0 a0Var) {
            this.f21417a = a0Var;
        }

        @Override // jg.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f21417a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // jg.a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f21417a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    /* JADX INFO: renamed from: jg.f$f, reason: collision with other inner class name */
    public static class C0379f<T> extends SerializationDelegatingTypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0<T> f21418a = null;

        public void a(a0<T> a0Var) {
            if (this.f21418a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f21418a = a0Var;
        }

        public final a0<T> delegate() {
            a0<T> a0Var = this.f21418a;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public a0<T> getSerializationDelegate() {
            return delegate();
        }

        @Override // jg.a0
        public T read(JsonReader jsonReader) {
            return delegate().read(jsonReader);
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, T t8) {
            delegate().write(jsonWriter, t8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        Excluder excluder = Excluder.DEFAULT;
        jg.d dVar = C;
        Map map = Collections.EMPTY_MAP;
        jg.e eVar = A;
        x xVar = f21389z;
        v vVar = v.f21442a;
        String str = B;
        List list = Collections.EMPTY_LIST;
        this(excluder, dVar, map, false, false, false, true, eVar, xVar, false, true, vVar, str, 2, 2, list, list, list, D, E, list);
    }

    public static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new u("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new u(e10);
            } catch (IOException e11) {
                throw new m(e11);
            }
        }
    }

    public static a0<AtomicLong> b(a0<Number> a0Var) {
        return new d(a0Var).nullSafe();
    }

    public static a0<AtomicLongArray> c(a0<Number> a0Var) {
        return new e(a0Var).nullSafe();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static a0<Number> q(v vVar) {
        return vVar == v.f21442a ? TypeAdapters.LONG : new c();
    }

    public l A(Object obj) {
        return obj == null ? n.f21439a : B(obj, obj.getClass());
    }

    public l B(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        w(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public final a0<Number> e(boolean z10) {
        return z10 ? TypeAdapters.DOUBLE : new a();
    }

    public final a0<Number> f(boolean z10) {
        return z10 ? TypeAdapters.FLOAT : new b();
    }

    public <T> T g(JsonReader jsonReader, TypeToken<T> typeToken) {
        boolean z10;
        x strictness = jsonReader.getStrictness();
        x xVar = this.f21402n;
        if (xVar != null) {
            jsonReader.setStrictness(xVar);
        } else if (jsonReader.getStrictness() == x.LEGACY_STRICT) {
            jsonReader.setStrictness(x.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z10 = false;
                        try {
                            a0<T> a0VarN = n(typeToken);
                            T t8 = a0VarN.read(jsonReader);
                            Class clsWrap = Primitives.wrap(typeToken.getRawType());
                            if (t8 != null && !clsWrap.isInstance(t8)) {
                                throw new ClassCastException("Type adapter '" + a0VarN + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + t8.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            jsonReader.setStrictness(strictness);
                            return t8;
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new u(e);
                            }
                            jsonReader.setStrictness(strictness);
                            return null;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new u(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new u(e14);
            }
        } catch (Throwable th2) {
            jsonReader.setStrictness(strictness);
            throw th2;
        }
    }

    public <T> T h(Reader reader, TypeToken<T> typeToken) {
        JsonReader jsonReaderR = r(reader);
        T t8 = (T) g(jsonReaderR, typeToken);
        a(t8, jsonReaderR);
        return t8;
    }

    public <T> T i(String str, TypeToken<T> typeToken) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), typeToken);
    }

    public <T> T j(String str, Class<T> cls) {
        return (T) i(str, TypeToken.get((Class) cls));
    }

    public <T> T k(String str, Type type) {
        return (T) i(str, TypeToken.get(type));
    }

    public <T> T l(l lVar, TypeToken<T> typeToken) {
        if (lVar == null) {
            return null;
        }
        return (T) g(new JsonTreeReader(lVar), typeToken);
    }

    public <T> T m(l lVar, Type type) {
        return (T) l(lVar, TypeToken.get(type));
    }

    public <T> a0<T> n(TypeToken<T> typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        a0<T> a0Var = (a0) this.b.get(typeToken);
        if (a0Var != null) {
            return a0Var;
        }
        Map<? extends TypeToken<?>, ? extends a0<?>> map = this.f21390a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f21390a.set((Map<TypeToken<?>, a0<?>>) map);
            z10 = true;
        } else {
            a0<T> a0Var2 = (a0) map.get(typeToken);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z10 = false;
        }
        try {
            C0379f c0379f = new C0379f();
            map.put(typeToken, c0379f);
            Iterator<b0> it = this.f21393e.iterator();
            a0<T> a0VarCreate = null;
            while (it.hasNext()) {
                a0VarCreate = it.next().create(this, typeToken);
                if (a0VarCreate != null) {
                    c0379f.a(a0VarCreate);
                    map.put(typeToken, a0VarCreate);
                    break;
                }
            }
            if (z10) {
                this.f21390a.remove();
            }
            if (a0VarCreate != null) {
                if (z10) {
                    this.b.putAll(map);
                }
                return a0VarCreate;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z10) {
                this.f21390a.remove();
            }
            throw th2;
        }
    }

    public <T> a0<T> o(Class<T> cls) {
        return n(TypeToken.get((Class) cls));
    }

    public <T> a0<T> p(b0 b0Var, TypeToken<T> typeToken) {
        Objects.requireNonNull(b0Var, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f21392d.isClassJsonAdapterFactory(typeToken, b0Var)) {
            b0Var = this.f21392d;
        }
        boolean z10 = false;
        for (b0 b0Var2 : this.f21393e) {
            if (z10) {
                a0<T> a0VarCreate = b0Var2.create(this, typeToken);
                if (a0VarCreate != null) {
                    return a0VarCreate;
                }
            } else if (b0Var2 == b0Var) {
                z10 = true;
            }
        }
        if (!z10) {
            return n(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public JsonReader r(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        x xVar = this.f21402n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        jsonReader.setStrictness(xVar);
        return jsonReader;
    }

    public JsonWriter s(Writer writer) throws IOException {
        if (this.f21399k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f21401m);
        jsonWriter.setHtmlSafe(this.f21400l);
        x xVar = this.f21402n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(xVar);
        jsonWriter.setSerializeNulls(this.f21397i);
        return jsonWriter;
    }

    public String t(Object obj) {
        return obj == null ? v(n.f21439a) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f21397i + ",factories:" + this.f21393e + ",instanceCreators:" + this.f21391c + "}";
    }

    public String u(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        x(obj, type, sb2);
        return sb2.toString();
    }

    public String v(l lVar) {
        StringBuilder sb2 = new StringBuilder();
        z(lVar, sb2);
        return sb2.toString();
    }

    public void w(Object obj, Type type, JsonWriter jsonWriter) {
        a0 a0VarN = n(TypeToken.get(type));
        x strictness = jsonWriter.getStrictness();
        x xVar = this.f21402n;
        if (xVar != null) {
            jsonWriter.setStrictness(xVar);
        } else if (jsonWriter.getStrictness() == x.LEGACY_STRICT) {
            jsonWriter.setStrictness(x.LENIENT);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f21400l);
        jsonWriter.setSerializeNulls(this.f21397i);
        try {
            try {
                try {
                    a0VarN.write(jsonWriter, obj);
                    jsonWriter.setStrictness(strictness);
                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new m(e11);
            }
        } catch (Throwable th2) {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th2;
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, s(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public void y(l lVar, JsonWriter jsonWriter) {
        x strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f21400l);
        jsonWriter.setSerializeNulls(this.f21397i);
        x xVar = this.f21402n;
        if (xVar != null) {
            jsonWriter.setStrictness(xVar);
        } else if (jsonWriter.getStrictness() == x.LEGACY_STRICT) {
            jsonWriter.setStrictness(x.LENIENT);
        }
        try {
            try {
                Streams.write(lVar, jsonWriter);
                jsonWriter.setStrictness(strictness);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e10) {
                throw new m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th2;
        }
    }

    public void z(l lVar, Appendable appendable) {
        try {
            y(lVar, s(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public f(Excluder excluder, jg.d dVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, jg.e eVar, x xVar, boolean z14, boolean z15, v vVar, String str, int i10, int i11, List<b0> list, List<b0> list2, List<b0> list3, z zVar, z zVar2, List<w> list4) {
        this.f21390a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f21394f = excluder;
        this.f21395g = dVar;
        this.f21396h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z15, list4);
        this.f21391c = constructorConstructor;
        this.f21397i = z10;
        this.f21398j = z11;
        this.f21399k = z12;
        this.f21400l = z13;
        this.f21401m = eVar;
        this.f21402n = xVar;
        this.f21403o = z14;
        this.f21404p = z15;
        this.f21408t = vVar;
        this.f21405q = str;
        this.f21406r = i10;
        this.f21407s = i11;
        this.f21409u = list;
        this.f21410v = list2;
        this.f21411w = zVar;
        this.f21412x = zVar2;
        this.f21413y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(zVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        a0<Number> a0VarQ = q(vVar);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, a0VarQ));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, e(z14)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, f(z14)));
        arrayList.add(NumberTypeAdapter.getFactory(zVar2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, b(a0VarQ)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, c(a0VarQ)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList.add(SqlTypesSupport.TIME_FACTORY);
            arrayList.add(SqlTypesSupport.DATE_FACTORY);
            arrayList.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f21392d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f21393e = Collections.unmodifiableList(arrayList);
    }
}
