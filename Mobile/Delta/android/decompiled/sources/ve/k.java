package ve;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f32977a = new b(null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32978a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f32978a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32978a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32978a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32978a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32978a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32978a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b extends jg.a0<jg.l> {
        private b() {
        }

        public final jg.l readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f32978a[jsonToken.ordinal()];
            if (i10 == 3) {
                String strNextString = jsonReader.nextString();
                if (k.b(strNextString)) {
                    return new jg.r(strNextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new jg.r(new c(jsonReader.nextString()));
            }
            if (i10 == 5) {
                return new jg.r(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i10 == 6) {
                jsonReader.nextNull();
                return jg.n.f21439a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        public final jg.l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f32978a[jsonToken.ordinal()];
            if (i10 == 1) {
                jsonReader.beginArray();
                return new jg.i();
            }
            if (i10 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new jg.o();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // jg.a0
        public jg.l read(JsonReader jsonReader) throws IOException {
            String strNextName;
            JsonToken jsonTokenPeek = jsonReader.peek();
            jg.l lVarTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
            if (lVarTryBeginNesting == null) {
                return readTerminal(jsonReader, jsonTokenPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (lVarTryBeginNesting instanceof jg.o) {
                        strNextName = jsonReader.nextName();
                        if (!k.b(strNextName)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strNextName = null;
                    }
                    JsonToken jsonTokenPeek2 = jsonReader.peek();
                    jg.l lVarTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                    boolean z10 = lVarTryBeginNesting2 != null;
                    if (lVarTryBeginNesting2 == null) {
                        lVarTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                    }
                    if (lVarTryBeginNesting instanceof jg.i) {
                        ((jg.i) lVarTryBeginNesting).y(lVarTryBeginNesting2);
                    } else {
                        jg.o oVar = (jg.o) lVarTryBeginNesting;
                        if (oVar.H(strNextName)) {
                            throw new IOException("duplicate key: " + strNextName);
                        }
                        oVar.x(strNextName, lVarTryBeginNesting2);
                    }
                    if (z10) {
                        arrayDeque.addLast(lVarTryBeginNesting);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        lVarTryBeginNesting = lVarTryBeginNesting2;
                    } else {
                        continue;
                    }
                } else {
                    if (lVarTryBeginNesting instanceof jg.i) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return lVarTryBeginNesting;
                    }
                    lVarTryBeginNesting = (jg.l) arrayDeque.removeLast();
                }
            }
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, jg.l lVar) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    public static final class c extends Number {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32979a;

        public c(String str) {
            this.f32979a = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f32979a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f32979a.equals(((c) obj).f32979a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f32979a);
        }

        public int hashCode() {
            return this.f32979a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f32979a);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f32979a);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f32979a).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f32979a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f32979a).longValue();
            }
        }

        public String toString() {
            return this.f32979a;
        }
    }

    public static long a(Number number) {
        if (number instanceof c) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static jg.l c(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(false);
            return f32977a.read(jsonReader);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }
}
