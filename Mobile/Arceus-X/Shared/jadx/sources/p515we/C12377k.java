package p515we;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import kg.AbstractC7584a0;
import kg.AbstractC7596l;
import kg.C7593i;
import kg.C7598n;
import kg.C7599o;
import kg.C7602r;

/* JADX INFO: renamed from: we.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C12377k {

    /* JADX INFO: renamed from: a */
    public static final b f44298a = new b(null);

    /* JADX INFO: renamed from: we.k$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44299a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f44299a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44299a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44299a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44299a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44299a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44299a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: we.k$b */
    public static final class b extends AbstractC7584a0<AbstractC7596l> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private b() {
        }

        public final AbstractC7596l readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f44299a[jsonToken.ordinal()];
            if (i10 == 3) {
                String strNextString = jsonReader.nextString();
                if (C12377k.m46381b(strNextString)) {
                    return new C7602r(strNextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new C7602r(new c(jsonReader.nextString()));
            }
            if (i10 == 5) {
                return new C7602r(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i10 == 6) {
                jsonReader.nextNull();
                return C7598n.f29112a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        public final AbstractC7596l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f44299a[jsonToken.ordinal()];
            if (i10 == 1) {
                jsonReader.beginArray();
                return new C7593i();
            }
            if (i10 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new C7599o();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: we.k.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        public AbstractC7596l read(JsonReader jsonReader) throws IOException {
            String strNextName;
            JsonToken jsonTokenPeek = jsonReader.peek();
            AbstractC7596l abstractC7596lTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
            if (abstractC7596lTryBeginNesting == null) {
                return readTerminal(jsonReader, jsonTokenPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (abstractC7596lTryBeginNesting instanceof C7599o) {
                        strNextName = jsonReader.nextName();
                        if (!C12377k.m46381b(strNextName)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strNextName = null;
                    }
                    JsonToken jsonTokenPeek2 = jsonReader.peek();
                    AbstractC7596l abstractC7596lTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                    boolean z10 = abstractC7596lTryBeginNesting2 != null;
                    if (abstractC7596lTryBeginNesting2 == null) {
                        abstractC7596lTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                    }
                    if (abstractC7596lTryBeginNesting instanceof C7593i) {
                        ((C7593i) abstractC7596lTryBeginNesting).m31453y(abstractC7596lTryBeginNesting2);
                    } else {
                        C7599o c7599o = (C7599o) abstractC7596lTryBeginNesting;
                        if (c7599o.m31471H(strNextName)) {
                            throw new IOException("duplicate key: " + strNextName);
                        }
                        c7599o.m31474x(strNextName, abstractC7596lTryBeginNesting2);
                    }
                    if (z10) {
                        arrayDeque.addLast(abstractC7596lTryBeginNesting);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        abstractC7596lTryBeginNesting = abstractC7596lTryBeginNesting2;
                    } else {
                        continue;
                    }
                } else {
                    if (abstractC7596lTryBeginNesting instanceof C7593i) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return abstractC7596lTryBeginNesting;
                    }
                    abstractC7596lTryBeginNesting = (AbstractC7596l) arrayDeque.removeLast();
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, AbstractC7596l abstractC7596l) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    /* JADX INFO: renamed from: we.k$c */
    public static final class c extends Number {

        /* JADX INFO: renamed from: a */
        public final String f44300a;

        public c(String str) {
            this.f44300a = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f44300a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f44300a.equals(((c) obj).f44300a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f44300a);
        }

        public int hashCode() {
            return this.f44300a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f44300a);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f44300a);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f44300a).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f44300a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f44300a).longValue();
            }
        }

        public String toString() {
            return this.f44300a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m46380a(Number number) {
        if (number instanceof c) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m46381b(String str) {
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

    /* JADX INFO: renamed from: c */
    public static AbstractC7596l m46382c(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(false);
            return f44298a.read(jsonReader);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }
}
