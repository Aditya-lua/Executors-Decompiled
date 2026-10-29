package com.google.gson.internal.bind;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import jg.a0;
import jg.b0;
import jg.f;
import jg.l;
import jg.m;
import jg.u;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {
    public static final a0<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final b0 ATOMIC_BOOLEAN_FACTORY;
    public static final a0<AtomicInteger> ATOMIC_INTEGER;
    public static final a0<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final b0 ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final b0 ATOMIC_INTEGER_FACTORY;
    public static final a0<BigDecimal> BIG_DECIMAL;
    public static final a0<BigInteger> BIG_INTEGER;
    public static final a0<BitSet> BIT_SET;
    public static final b0 BIT_SET_FACTORY;
    public static final a0<Boolean> BOOLEAN;
    public static final a0<Boolean> BOOLEAN_AS_STRING;
    public static final b0 BOOLEAN_FACTORY;
    public static final a0<Number> BYTE;
    public static final b0 BYTE_FACTORY;
    public static final a0<Calendar> CALENDAR;
    public static final b0 CALENDAR_FACTORY;
    public static final a0<Character> CHARACTER;
    public static final b0 CHARACTER_FACTORY;
    public static final a0<Class> CLASS;
    public static final b0 CLASS_FACTORY;
    public static final a0<Currency> CURRENCY;
    public static final b0 CURRENCY_FACTORY;
    public static final a0<Number> DOUBLE;
    public static final b0 ENUM_FACTORY;
    public static final a0<Number> FLOAT;
    public static final a0<InetAddress> INET_ADDRESS;
    public static final b0 INET_ADDRESS_FACTORY;
    public static final a0<Number> INTEGER;
    public static final b0 INTEGER_FACTORY;
    public static final a0<l> JSON_ELEMENT;
    public static final b0 JSON_ELEMENT_FACTORY;
    public static final a0<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final a0<Locale> LOCALE;
    public static final b0 LOCALE_FACTORY;
    public static final a0<Number> LONG;
    public static final a0<Number> SHORT;
    public static final b0 SHORT_FACTORY;
    public static final a0<String> STRING;
    public static final a0<StringBuffer> STRING_BUFFER;
    public static final b0 STRING_BUFFER_FACTORY;
    public static final a0<StringBuilder> STRING_BUILDER;
    public static final b0 STRING_BUILDER_FACTORY;
    public static final b0 STRING_FACTORY;
    public static final a0<URI> URI;
    public static final b0 URI_FACTORY;
    public static final a0<URL> URL;
    public static final b0 URL_FACTORY;
    public static final a0<UUID> UUID;
    public static final b0 UUID_FACTORY;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass33 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        a0<Class> a0VarNullSafe = new a0<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Class read(JsonReader jsonReader) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + TroubleshootingGuide.createUrl("java-lang-class-unsupported"));
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + TroubleshootingGuide.createUrl("java-lang-class-unsupported"));
            }
        }.nullSafe();
        CLASS = a0VarNullSafe;
        CLASS_FACTORY = newFactory(Class.class, a0VarNullSafe);
        a0<BitSet> a0VarNullSafe2 = new a0<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // jg.a0
            public BitSet read(JsonReader jsonReader) throws IOException {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i10 = 0;
                while (jsonTokenPeek != JsonToken.END_ARRAY) {
                    int i11 = AnonymousClass33.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
                    boolean zNextBoolean = true;
                    if (i11 == 1 || i11 == 2) {
                        int iNextInt = jsonReader.nextInt();
                        if (iNextInt == 0) {
                            zNextBoolean = false;
                        } else if (iNextInt != 1) {
                            throw new u("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                        }
                    } else {
                        if (i11 != 3) {
                            throw new u("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                        }
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                    if (zNextBoolean) {
                        bitSet.set(i10);
                    }
                    i10++;
                    jsonTokenPeek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = a0VarNullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, a0VarNullSafe2);
        a0<Boolean> a0Var = new a0<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != JsonToken.NULL) {
                    return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = a0Var;
        BOOLEAN_AS_STRING = new a0<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Boolean read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, a0Var);
        a0<Number> a0Var2 = new a0<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 255 && iNextInt >= -128) {
                        return Byte.valueOf((byte) iNextInt);
                    }
                    throw new u("Lossy conversion from " + iNextInt + " to byte; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e10) {
                    throw new u(e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.byteValue());
                }
            }
        };
        BYTE = a0Var2;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, a0Var2);
        a0<Number> a0Var3 = new a0<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 65535 && iNextInt >= -32768) {
                        return Short.valueOf((short) iNextInt);
                    }
                    throw new u("Lossy conversion from " + iNextInt + " to short; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e10) {
                    throw new u(e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.shortValue());
                }
            }
        };
        SHORT = a0Var3;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, a0Var3);
        a0<Number> a0Var4 = new a0<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new u(e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.intValue());
                }
            }
        };
        INTEGER = a0Var4;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, a0Var4);
        a0<AtomicInteger> a0VarNullSafe3 = new a0<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // jg.a0
            public AtomicInteger read(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new u(e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = a0VarNullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, a0VarNullSafe3);
        a0<AtomicBoolean> a0VarNullSafe4 = new a0<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // jg.a0
            public AtomicBoolean read(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = a0VarNullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, a0VarNullSafe4);
        a0<AtomicIntegerArray> a0VarNullSafe5 = new a0<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // jg.a0
            public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e10) {
                        throw new u(e10);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(atomicIntegerArray.get(i10));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = a0VarNullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, a0VarNullSafe5);
        LONG = new a0<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e10) {
                    throw new u(e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }
        };
        FLOAT = new a0<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Number read(JsonReader jsonReader) throws IOException {
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
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                jsonWriter.value(number);
            }
        };
        DOUBLE = new a0<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Number read(JsonReader jsonReader) throws IOException {
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
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }
        };
        a0<Character> a0Var5 = new a0<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new u("Expecting character, got: " + strNextString + "; at " + jsonReader.getPreviousPath());
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Character ch2) throws IOException {
                jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        CHARACTER = a0Var5;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, a0Var5);
        a0<String> a0Var6 = new a0<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // jg.a0
            public String read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != JsonToken.NULL) {
                    return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        STRING = a0Var6;
        BIG_DECIMAL = new a0<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // jg.a0
            public BigDecimal read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return NumberLimits.parseBigDecimal(strNextString);
                } catch (NumberFormatException e10) {
                    throw new u("Failed parsing '" + strNextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new a0<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // jg.a0
            public BigInteger read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return NumberLimits.parseBigInteger(strNextString);
                } catch (NumberFormatException e10) {
                    throw new u("Failed parsing '" + strNextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        LAZILY_PARSED_NUMBER = new a0<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // jg.a0
            public LazilyParsedNumber read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
                jsonWriter.value(lazilyParsedNumber);
            }
        };
        STRING_FACTORY = newFactory(String.class, a0Var6);
        a0<StringBuilder> a0Var7 = new a0<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // jg.a0
            public StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
                jsonWriter.value(sb2 == null ? null : sb2.toString());
            }
        };
        STRING_BUILDER = a0Var7;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, a0Var7);
        a0<StringBuffer> a0Var8 = new a0<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // jg.a0
            public StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = a0Var8;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, a0Var8);
        a0<URL> a0Var9 = new a0<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // jg.a0
            public URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.equals("null")) {
                    return null;
                }
                return new URL(strNextString);
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = a0Var9;
        URL_FACTORY = newFactory(URL.class, a0Var9);
        a0<URI> a0Var10 = new a0<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // jg.a0
            public URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString = jsonReader.nextString();
                    if (strNextString.equals("null")) {
                        return null;
                    }
                    return new URI(strNextString);
                } catch (URISyntaxException e10) {
                    throw new m(e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = a0Var10;
        URI_FACTORY = newFactory(URI.class, a0Var10);
        a0<InetAddress> a0Var11 = new a0<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // jg.a0
            public InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = a0Var11;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, a0Var11);
        a0<UUID> a0Var12 = new a0<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // jg.a0
            public UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return UUID.fromString(strNextString);
                } catch (IllegalArgumentException e10) {
                    throw new u("Failed parsing '" + strNextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = a0Var12;
        UUID_FACTORY = newFactory(UUID.class, a0Var12);
        a0<Currency> a0VarNullSafe6 = new a0<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // jg.a0
            public Currency read(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(strNextString);
                } catch (IllegalArgumentException e10) {
                    throw new u("Failed parsing '" + strNextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = a0VarNullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, a0VarNullSafe6);
        a0<Calendar> a0Var13 = new a0<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            @Override // jg.a0
            public Calendar read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    int iNextInt = jsonReader.nextInt();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "dayOfMonth":
                            i12 = iNextInt;
                            break;
                        case "minute":
                            i14 = iNextInt;
                            break;
                        case "second":
                            i15 = iNextInt;
                            break;
                        case "year":
                            i10 = iNextInt;
                            break;
                        case "month":
                            i11 = iNextInt;
                            break;
                        case "hourOfDay":
                            i13 = iNextInt;
                            break;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name(YEAR);
                jsonWriter.value(calendar.get(1));
                jsonWriter.name(MONTH);
                jsonWriter.value(calendar.get(2));
                jsonWriter.name(DAY_OF_MONTH);
                jsonWriter.value(calendar.get(5));
                jsonWriter.name(HOUR_OF_DAY);
                jsonWriter.value(calendar.get(11));
                jsonWriter.name(MINUTE);
                jsonWriter.value(calendar.get(12));
                jsonWriter.name(SECOND);
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = a0Var13;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, a0Var13);
        a0<Locale> a0Var14 = new a0<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // jg.a0
            public Locale read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // jg.a0
            public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = a0Var14;
        LOCALE_FACTORY = newFactory(Locale.class, a0Var14);
        JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.ADAPTER;
        JSON_ELEMENT = jsonElementTypeAdapter;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(l.class, jsonElementTypeAdapter);
        ENUM_FACTORY = EnumTypeAdapter.FACTORY;
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> b0 newFactory(final TypeToken<TT> typeToken, final a0<TT> a0Var) {
        return new b0() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // jg.b0
            public <T> a0<T> create(f fVar, TypeToken<T> typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return a0Var;
                }
                return null;
            }
        };
    }

    public static <TT> b0 newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final a0<? super TT> a0Var) {
        return new b0() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // jg.b0
            public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return a0Var;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }

    public static <T1> b0 newTypeHierarchyFactory(final Class<T1> cls, final a0<T1> a0Var) {
        return new b0() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // jg.b0
            public <T2> a0<T2> create(f fVar, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (a0<T2>) new a0<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // jg.a0
                        public T1 read(JsonReader jsonReader) {
                            T1 t8 = (T1) a0Var.read(jsonReader);
                            if (t8 == null || rawType.isInstance(t8)) {
                                return t8;
                            }
                            throw new u("Expected a " + rawType.getName() + " but was " + t8.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                        }

                        @Override // jg.a0
                        public void write(JsonWriter jsonWriter, T1 t8) {
                            a0Var.write(jsonWriter, t8);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }

    public static <TT> b0 newFactory(final Class<TT> cls, final a0<TT> a0Var) {
        return new b0() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // jg.b0
            public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return a0Var;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }

    public static <TT> b0 newFactory(final Class<TT> cls, final Class<TT> cls2, final a0<? super TT> a0Var) {
        return new b0() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // jg.b0
            public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return a0Var;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }
}
