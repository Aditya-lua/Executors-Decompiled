package com.google.gson.internal.bind;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import kg.AbstractC7584a0;
import kg.AbstractC7596l;
import kg.C7593i;
import kg.C7598n;
import kg.C7599o;
import kg.C7602r;

/* JADX INFO: loaded from: classes2.dex */
class JsonElementTypeAdapter extends AbstractC7584a0<AbstractC7596l> {
    static final JsonElementTypeAdapter ADAPTER = new JsonElementTypeAdapter();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1 */
    public static /* synthetic */ class C30551 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private JsonElementTypeAdapter() {
    }

    private AbstractC7596l readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = C30551.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 3) {
            return new C7602r(jsonReader.nextString());
        }
        if (i10 == 4) {
            return new C7602r(new LazilyParsedNumber(jsonReader.nextString()));
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

    private AbstractC7596l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = C30551.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // kg.AbstractC7584a0
    public AbstractC7596l read(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof JsonTreeReader) {
            return ((JsonTreeReader) jsonReader).nextJsonElement();
        }
        JsonToken jsonTokenPeek = jsonReader.peek();
        AbstractC7596l abstractC7596lTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
        if (abstractC7596lTryBeginNesting == null) {
            return readTerminal(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = abstractC7596lTryBeginNesting instanceof C7599o ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                AbstractC7596l abstractC7596lTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                boolean z10 = abstractC7596lTryBeginNesting2 != null;
                if (abstractC7596lTryBeginNesting2 == null) {
                    abstractC7596lTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                }
                if (abstractC7596lTryBeginNesting instanceof C7593i) {
                    ((C7593i) abstractC7596lTryBeginNesting).m31453y(abstractC7596lTryBeginNesting2);
                } else {
                    ((C7599o) abstractC7596lTryBeginNesting).m31474x(strNextName, abstractC7596lTryBeginNesting2);
                }
                if (z10) {
                    arrayDeque.addLast(abstractC7596lTryBeginNesting);
                    abstractC7596lTryBeginNesting = abstractC7596lTryBeginNesting2;
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
    public void write(JsonWriter jsonWriter, AbstractC7596l abstractC7596l) throws IOException {
        if (abstractC7596l == null || abstractC7596l.m31460p()) {
            jsonWriter.nullValue();
            return;
        }
        if (abstractC7596l.m31462u()) {
            C7602r c7602rM31458h = abstractC7596l.m31458h();
            if (c7602rM31458h.m31482C()) {
                jsonWriter.value(c7602rM31458h.mo31450k());
                return;
            } else if (c7602rM31458h.m31481A()) {
                jsonWriter.value(c7602rM31458h.mo31445b());
                return;
            } else {
                jsonWriter.value(c7602rM31458h.mo31451l());
                return;
            }
        }
        if (abstractC7596l.m31459m()) {
            jsonWriter.beginArray();
            Iterator<AbstractC7596l> it = abstractC7596l.m31456f().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!abstractC7596l.m31461t()) {
            throw new IllegalArgumentException("Couldn't write " + abstractC7596l.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, AbstractC7596l> entry : abstractC7596l.m31457g().m31467D()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
