package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kg.AbstractC7596l;
import kg.C7593i;
import kg.C7598n;
import kg.C7599o;
import kg.C7602r;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2 */
    public static /* synthetic */ class C30572 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(AbstractC7596l abstractC7596l) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(abstractC7596l);
    }

    private void expect(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String getPath(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.stackSize;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i10];
            if (obj instanceof C7593i) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.pathIndices[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof C7599o) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.pathNames[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String nextName(boolean z10) {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = z10 ? "<skipped>" : str;
        push(entry.getValue());
        return str;
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i10 = this.stackSize - 1;
        this.stackSize = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void push(Object obj) {
        int i10 = this.stackSize;
        Object[] objArr = this.stack;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.stack = Arrays.copyOf(objArr, i11);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i11);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i11);
        }
        Object[] objArr2 = this.stack;
        int i12 = this.stackSize;
        this.stackSize = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() {
        expect(JsonToken.BEGIN_ARRAY);
        push(((C7593i) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() {
        expect(JsonToken.BEGIN_OBJECT);
        push(((C7599o) peekStack()).m31467D().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() {
        expect(JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        popStack();
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() {
        expect(JsonToken.BOOLEAN);
        boolean zMo31445b = ((C7602r) popStack()).mo31445b();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zMo31445b;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double dMo31446c = ((C7602r) peekStack()).mo31446c();
        if (!isLenient() && (Double.isNaN(dMo31446c) || Double.isInfinite(dMo31446c))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dMo31446c);
        }
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dMo31446c;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int iMo31448e = ((C7602r) peekStack()).mo31448e();
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iMo31448e;
    }

    public AbstractC7596l nextJsonElement() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            AbstractC7596l abstractC7596l = (AbstractC7596l) peekStack();
            skipValue();
            return abstractC7596l;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long jMo31449i = ((C7602r) peekStack()).mo31449i();
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jMo31449i;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() {
        expect(JsonToken.NULL);
        popStack();
        int i10 = this.stackSize;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek == jsonToken || jsonTokenPeek == JsonToken.NUMBER) {
            String strMo31451l = ((C7602r) popStack()).mo31451l();
            int i10 = this.stackSize;
            if (i10 > 0) {
                int[] iArr = this.pathIndices;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strMo31451l;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws MalformedJsonException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objPeekStack = peekStack();
        if (objPeekStack instanceof Iterator) {
            boolean z10 = this.stack[this.stackSize - 2] instanceof C7599o;
            Iterator it = (Iterator) objPeekStack;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z10) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (objPeekStack instanceof C7599o) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objPeekStack instanceof C7593i) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objPeekStack instanceof C7602r) {
            C7602r c7602r = (C7602r) objPeekStack;
            if (c7602r.m31483D()) {
                return JsonToken.STRING;
            }
            if (c7602r.m31481A()) {
                return JsonToken.BOOLEAN;
            }
            if (c7602r.m31482C()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objPeekStack instanceof C7598n) {
            return JsonToken.NULL;
        }
        if (objPeekStack == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objPeekStack.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new C7602r((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws MalformedJsonException {
        int i10 = C30572.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
        if (i10 == 1) {
            nextName(true);
            return;
        }
        if (i10 == 2) {
            endArray();
            return;
        }
        if (i10 == 3) {
            endObject();
            return;
        }
        if (i10 != 4) {
            popStack();
            int i11 = this.stackSize;
            if (i11 > 0) {
                int[] iArr = this.pathIndices;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() {
        return nextName(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
