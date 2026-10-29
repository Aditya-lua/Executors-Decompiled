package kg;

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

/* JADX INFO: renamed from: kg.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7590f {

    /* JADX INFO: renamed from: A */
    public static final C7589e f29055A = C7589e.f29050d;

    /* JADX INFO: renamed from: B */
    public static final String f29056B = null;

    /* JADX INFO: renamed from: C */
    public static final InterfaceC7588d f29057C = EnumC7587c.f29042a;

    /* JADX INFO: renamed from: D */
    public static final InterfaceC7610z f29058D = EnumC7609y.f29127a;

    /* JADX INFO: renamed from: E */
    public static final InterfaceC7610z f29059E = EnumC7609y.f29128b;

    /* JADX INFO: renamed from: z */
    public static final EnumC7608x f29060z = null;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal<Map<TypeToken<?>, AbstractC7584a0<?>>> f29061a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<TypeToken<?>, AbstractC7584a0<?>> f29062b;

    /* JADX INFO: renamed from: c */
    public final ConstructorConstructor f29063c;

    /* JADX INFO: renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f29064d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC7586b0> f29065e;

    /* JADX INFO: renamed from: f */
    public final Excluder f29066f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7588d f29067g;

    /* JADX INFO: renamed from: h */
    public final Map<Type, InterfaceC7592h<?>> f29068h;

    /* JADX INFO: renamed from: i */
    public final boolean f29069i;

    /* JADX INFO: renamed from: j */
    public final boolean f29070j;

    /* JADX INFO: renamed from: k */
    public final boolean f29071k;

    /* JADX INFO: renamed from: l */
    public final boolean f29072l;

    /* JADX INFO: renamed from: m */
    public final C7589e f29073m;

    /* JADX INFO: renamed from: n */
    public final EnumC7608x f29074n;

    /* JADX INFO: renamed from: o */
    public final boolean f29075o;

    /* JADX INFO: renamed from: p */
    public final boolean f29076p;

    /* JADX INFO: renamed from: q */
    public final String f29077q;

    /* JADX INFO: renamed from: r */
    public final int f29078r;

    /* JADX INFO: renamed from: s */
    public final int f29079s;

    /* JADX INFO: renamed from: t */
    public final EnumC7606v f29080t;

    /* JADX INFO: renamed from: u */
    public final List<InterfaceC7586b0> f29081u;

    /* JADX INFO: renamed from: v */
    public final List<InterfaceC7586b0> f29082v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC7610z f29083w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC7610z f29084x;

    /* JADX INFO: renamed from: y */
    public final List<InterfaceC7607w> f29085y;

    /* JADX INFO: renamed from: kg.f$a */
    public class a extends AbstractC7584a0<Number> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            double dDoubleValue = number.doubleValue();
            C7590f.m31401d(dDoubleValue);
            jsonWriter.value(dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: kg.f$b */
    public class b extends AbstractC7584a0<Number> {
        public b() {
        }

        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            float fFloatValue = number.floatValue();
            C7590f.m31401d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            jsonWriter.value(number);
        }
    }

    /* JADX INFO: renamed from: kg.f$c */
    public class c extends AbstractC7584a0<Number> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kg.AbstractC7584a0
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* JADX INFO: renamed from: kg.f$d */
    public class d extends AbstractC7584a0<AtomicLong> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC7584a0 f29088a;

        public d(AbstractC7584a0 abstractC7584a0) {
            this.f29088a = abstractC7584a0;
        }

        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLong read(JsonReader jsonReader) {
            return new AtomicLong(((Number) this.f29088a.read(jsonReader)).longValue());
        }

        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) {
            this.f29088a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: renamed from: kg.f$e */
    public class e extends AbstractC7584a0<AtomicLongArray> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC7584a0 f29089a;

        public e(AbstractC7584a0 abstractC7584a0) {
            this.f29089a = abstractC7584a0;
        }

        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f29089a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f29089a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    /* JADX INFO: renamed from: kg.f$f */
    public static class f<T> extends SerializationDelegatingTypeAdapter<T> {

        /* JADX INFO: renamed from: a */
        public AbstractC7584a0<T> f29090a = null;

        /* JADX INFO: renamed from: a */
        public void m31432a(AbstractC7584a0<T> abstractC7584a0) {
            if (this.f29090a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f29090a = abstractC7584a0;
        }

        public final AbstractC7584a0<T> delegate() {
            AbstractC7584a0<T> abstractC7584a0 = this.f29090a;
            if (abstractC7584a0 != null) {
                return abstractC7584a0;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public AbstractC7584a0<T> getSerializationDelegate() {
            return delegate();
        }

        @Override // kg.AbstractC7584a0
        public T read(JsonReader jsonReader) {
            return delegate().read(jsonReader);
        }

        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, T t8) {
            delegate().write(jsonWriter, t8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C7590f() {
        Excluder excluder = Excluder.DEFAULT;
        InterfaceC7588d interfaceC7588d = f29057C;
        Map map = Collections.EMPTY_MAP;
        C7589e c7589e = f29055A;
        EnumC7608x enumC7608x = f29060z;
        EnumC7606v enumC7606v = EnumC7606v.f29115a;
        String str = f29056B;
        List list = Collections.EMPTY_LIST;
        this(excluder, interfaceC7588d, map, false, false, false, true, c7589e, enumC7608x, false, true, enumC7606v, str, 2, 2, list, list, list, f29058D, f29059E, list);
    }

    /* JADX INFO: renamed from: a */
    public static void m31398a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new C7605u("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new C7605u(e10);
            } catch (IOException e11) {
                throw new C7597m(e11);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC7584a0<AtomicLong> m31399b(AbstractC7584a0<Number> abstractC7584a0) {
        return new d(abstractC7584a0).nullSafe();
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC7584a0<AtomicLongArray> m31400c(AbstractC7584a0<Number> abstractC7584a0) {
        return new e(abstractC7584a0).nullSafe();
    }

    /* JADX INFO: renamed from: d */
    public static void m31401d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC7584a0<Number> m31402q(EnumC7606v enumC7606v) {
        return enumC7606v == EnumC7606v.f29115a ? TypeAdapters.LONG : new c();
    }

    /* JADX INFO: renamed from: A */
    public AbstractC7596l m31403A(Object obj) {
        return obj == null ? C7598n.f29112a : m31404B(obj, obj.getClass());
    }

    /* JADX INFO: renamed from: B */
    public AbstractC7596l m31404B(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        m31422w(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC7584a0<Number> m31405e(boolean z10) {
        return z10 ? TypeAdapters.DOUBLE : new a();
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC7584a0<Number> m31406f(boolean z10) {
        return z10 ? TypeAdapters.FLOAT : new b();
    }

    /* JADX INFO: renamed from: g */
    public <T> T m31407g(JsonReader jsonReader, TypeToken<T> typeToken) {
        boolean z10;
        EnumC7608x strictness = jsonReader.getStrictness();
        EnumC7608x enumC7608x = this.f29074n;
        if (enumC7608x != null) {
            jsonReader.setStrictness(enumC7608x);
        } else if (jsonReader.getStrictness() == EnumC7608x.LEGACY_STRICT) {
            jsonReader.setStrictness(EnumC7608x.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z10 = false;
                        try {
                            AbstractC7584a0<T> abstractC7584a0M31414n = m31414n(typeToken);
                            T t8 = abstractC7584a0M31414n.read(jsonReader);
                            Class clsWrap = Primitives.wrap(typeToken.getRawType());
                            if (t8 != null && !clsWrap.isInstance(t8)) {
                                throw new ClassCastException("Type adapter '" + abstractC7584a0M31414n + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + t8.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            jsonReader.setStrictness(strictness);
                            return t8;
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new C7605u(e);
                            }
                            jsonReader.setStrictness(strictness);
                            return null;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new C7605u(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new C7605u(e14);
            }
        } catch (Throwable th2) {
            jsonReader.setStrictness(strictness);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> T m31408h(Reader reader, TypeToken<T> typeToken) {
        JsonReader jsonReaderM31417r = m31417r(reader);
        T t8 = (T) m31407g(jsonReaderM31417r, typeToken);
        m31398a(t8, jsonReaderM31417r);
        return t8;
    }

    /* JADX INFO: renamed from: i */
    public <T> T m31409i(String str, TypeToken<T> typeToken) {
        if (str == null) {
            return null;
        }
        return (T) m31408h(new StringReader(str), typeToken);
    }

    /* JADX INFO: renamed from: j */
    public <T> T m31410j(String str, Class<T> cls) {
        return (T) m31409i(str, TypeToken.get((Class) cls));
    }

    /* JADX INFO: renamed from: k */
    public <T> T m31411k(String str, Type type) {
        return (T) m31409i(str, TypeToken.get(type));
    }

    /* JADX INFO: renamed from: l */
    public <T> T m31412l(AbstractC7596l abstractC7596l, TypeToken<T> typeToken) {
        if (abstractC7596l == null) {
            return null;
        }
        return (T) m31407g(new JsonTreeReader(abstractC7596l), typeToken);
    }

    /* JADX INFO: renamed from: m */
    public <T> T m31413m(AbstractC7596l abstractC7596l, Type type) {
        return (T) m31412l(abstractC7596l, TypeToken.get(type));
    }

    /* JADX INFO: renamed from: n */
    public <T> AbstractC7584a0<T> m31414n(TypeToken<T> typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        AbstractC7584a0<T> abstractC7584a0 = (AbstractC7584a0) this.f29062b.get(typeToken);
        if (abstractC7584a0 != null) {
            return abstractC7584a0;
        }
        Map<? extends TypeToken<?>, ? extends AbstractC7584a0<?>> map = this.f29061a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f29061a.set((Map<TypeToken<?>, AbstractC7584a0<?>>) map);
            z10 = true;
        } else {
            AbstractC7584a0<T> abstractC7584a1 = (AbstractC7584a0) map.get(typeToken);
            if (abstractC7584a1 != null) {
                return abstractC7584a1;
            }
            z10 = false;
        }
        try {
            f fVar = new f();
            map.put(typeToken, fVar);
            Iterator<InterfaceC7586b0> it = this.f29065e.iterator();
            AbstractC7584a0<T> abstractC7584a0Create = null;
            while (it.hasNext()) {
                abstractC7584a0Create = it.next().create(this, typeToken);
                if (abstractC7584a0Create != null) {
                    fVar.m31432a(abstractC7584a0Create);
                    map.put(typeToken, abstractC7584a0Create);
                    break;
                }
            }
            if (z10) {
                this.f29061a.remove();
            }
            if (abstractC7584a0Create != null) {
                if (z10) {
                    this.f29062b.putAll(map);
                }
                return abstractC7584a0Create;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z10) {
                this.f29061a.remove();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public <T> AbstractC7584a0<T> m31415o(Class<T> cls) {
        return m31414n(TypeToken.get((Class) cls));
    }

    /* JADX INFO: renamed from: p */
    public <T> AbstractC7584a0<T> m31416p(InterfaceC7586b0 interfaceC7586b0, TypeToken<T> typeToken) {
        Objects.requireNonNull(interfaceC7586b0, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f29064d.isClassJsonAdapterFactory(typeToken, interfaceC7586b0)) {
            interfaceC7586b0 = this.f29064d;
        }
        boolean z10 = false;
        for (InterfaceC7586b0 interfaceC7586b1 : this.f29065e) {
            if (z10) {
                AbstractC7584a0<T> abstractC7584a0Create = interfaceC7586b1.create(this, typeToken);
                if (abstractC7584a0Create != null) {
                    return abstractC7584a0Create;
                }
            } else if (interfaceC7586b1 == interfaceC7586b0) {
                z10 = true;
            }
        }
        if (!z10) {
            return m31414n(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    /* JADX INFO: renamed from: r */
    public JsonReader m31417r(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        EnumC7608x enumC7608x = this.f29074n;
        if (enumC7608x == null) {
            enumC7608x = EnumC7608x.LEGACY_STRICT;
        }
        jsonReader.setStrictness(enumC7608x);
        return jsonReader;
    }

    /* JADX INFO: renamed from: s */
    public JsonWriter m31418s(Writer writer) throws IOException {
        if (this.f29071k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f29073m);
        jsonWriter.setHtmlSafe(this.f29072l);
        EnumC7608x enumC7608x = this.f29074n;
        if (enumC7608x == null) {
            enumC7608x = EnumC7608x.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(enumC7608x);
        jsonWriter.setSerializeNulls(this.f29069i);
        return jsonWriter;
    }

    /* JADX INFO: renamed from: t */
    public String m31419t(Object obj) {
        return obj == null ? m31421v(C7598n.f29112a) : m31420u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f29069i + ",factories:" + this.f29065e + ",instanceCreators:" + this.f29063c + "}";
    }

    /* JADX INFO: renamed from: u */
    public String m31420u(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        m31423x(obj, type, sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public String m31421v(AbstractC7596l abstractC7596l) {
        StringBuilder sb2 = new StringBuilder();
        m31425z(abstractC7596l, sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public void m31422w(Object obj, Type type, JsonWriter jsonWriter) {
        AbstractC7584a0 abstractC7584a0M31414n = m31414n(TypeToken.get(type));
        EnumC7608x strictness = jsonWriter.getStrictness();
        EnumC7608x enumC7608x = this.f29074n;
        if (enumC7608x != null) {
            jsonWriter.setStrictness(enumC7608x);
        } else if (jsonWriter.getStrictness() == EnumC7608x.LEGACY_STRICT) {
            jsonWriter.setStrictness(EnumC7608x.LENIENT);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f29072l);
        jsonWriter.setSerializeNulls(this.f29069i);
        try {
            try {
                try {
                    abstractC7584a0M31414n.write(jsonWriter, obj);
                    jsonWriter.setStrictness(strictness);
                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new C7597m(e11);
            }
        } catch (Throwable th2) {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m31423x(Object obj, Type type, Appendable appendable) {
        try {
            m31422w(obj, type, m31418s(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new C7597m(e10);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m31424y(AbstractC7596l abstractC7596l, JsonWriter jsonWriter) {
        EnumC7608x strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f29072l);
        jsonWriter.setSerializeNulls(this.f29069i);
        EnumC7608x enumC7608x = this.f29074n;
        if (enumC7608x != null) {
            jsonWriter.setStrictness(enumC7608x);
        } else if (jsonWriter.getStrictness() == EnumC7608x.LEGACY_STRICT) {
            jsonWriter.setStrictness(EnumC7608x.LENIENT);
        }
        try {
            try {
                Streams.write(abstractC7596l, jsonWriter);
                jsonWriter.setStrictness(strictness);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e10) {
                throw new C7597m(e10);
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

    /* JADX INFO: renamed from: z */
    public void m31425z(AbstractC7596l abstractC7596l, Appendable appendable) {
        try {
            m31424y(abstractC7596l, m31418s(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new C7597m(e10);
        }
    }

    public C7590f(Excluder excluder, InterfaceC7588d interfaceC7588d, Map<Type, InterfaceC7592h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, C7589e c7589e, EnumC7608x enumC7608x, boolean z14, boolean z15, EnumC7606v enumC7606v, String str, int i10, int i11, List<InterfaceC7586b0> list, List<InterfaceC7586b0> list2, List<InterfaceC7586b0> list3, InterfaceC7610z interfaceC7610z, InterfaceC7610z interfaceC7610z2, List<InterfaceC7607w> list4) {
        this.f29061a = new ThreadLocal<>();
        this.f29062b = new ConcurrentHashMap();
        this.f29066f = excluder;
        this.f29067g = interfaceC7588d;
        this.f29068h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z15, list4);
        this.f29063c = constructorConstructor;
        this.f29069i = z10;
        this.f29070j = z11;
        this.f29071k = z12;
        this.f29072l = z13;
        this.f29073m = c7589e;
        this.f29074n = enumC7608x;
        this.f29075o = z14;
        this.f29076p = z15;
        this.f29080t = enumC7606v;
        this.f29077q = str;
        this.f29078r = i10;
        this.f29079s = i11;
        this.f29081u = list;
        this.f29082v = list2;
        this.f29083w = interfaceC7610z;
        this.f29084x = interfaceC7610z2;
        this.f29085y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(interfaceC7610z));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        AbstractC7584a0<Number> abstractC7584a0M31402q = m31402q(enumC7606v);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, abstractC7584a0M31402q));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, m31405e(z14)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, m31406f(z14)));
        arrayList.add(NumberTypeAdapter.getFactory(interfaceC7610z2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, m31399b(abstractC7584a0M31402q)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, m31400c(abstractC7584a0M31402q)));
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
        this.f29064d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, interfaceC7588d, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f29065e = Collections.unmodifiableList(arrayList);
    }
}
