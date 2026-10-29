package com.google.gson.internal.bind;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import jg.a0;
import jg.i;
import jg.l;
import jg.n;
import jg.o;
import jg.r;

/* JADX INFO: loaded from: classes2.dex */
class JsonElementTypeAdapter extends a0<l> {
    static final JsonElementTypeAdapter ADAPTER = new JsonElementTypeAdapter();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    private l readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 3) {
            return new r(jsonReader.nextString());
        }
        if (i10 == 4) {
            return new r(new LazilyParsedNumber(jsonReader.nextString()));
        }
        if (i10 == 5) {
            return new r(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return n.f21439a;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private l tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new i();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new o();
    }

    @Override // jg.a0
    public l read(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof JsonTreeReader) {
            return ((JsonTreeReader) jsonReader).nextJsonElement();
        }
        JsonToken jsonTokenPeek = jsonReader.peek();
        l lVarTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
        if (lVarTryBeginNesting == null) {
            return readTerminal(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = lVarTryBeginNesting instanceof o ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                l lVarTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                boolean z10 = lVarTryBeginNesting2 != null;
                if (lVarTryBeginNesting2 == null) {
                    lVarTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                }
                if (lVarTryBeginNesting instanceof i) {
                    ((i) lVarTryBeginNesting).y(lVarTryBeginNesting2);
                } else {
                    ((o) lVarTryBeginNesting).x(strNextName, lVarTryBeginNesting2);
                }
                if (z10) {
                    arrayDeque.addLast(lVarTryBeginNesting);
                    lVarTryBeginNesting = lVarTryBeginNesting2;
                }
            } else {
                if (lVarTryBeginNesting instanceof i) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return lVarTryBeginNesting;
                }
                lVarTryBeginNesting = (l) arrayDeque.removeLast();
            }
        }
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, l lVar) throws IOException {
        if (lVar == null || lVar.p()) {
            jsonWriter.nullValue();
            return;
        }
        if (lVar.u()) {
            r rVarH = lVar.h();
            if (rVarH.C()) {
                jsonWriter.value(rVarH.k());
                return;
            } else if (rVarH.A()) {
                jsonWriter.value(rVarH.b());
                return;
            } else {
                jsonWriter.value(rVarH.l());
                return;
            }
        }
        if (lVar.m()) {
            jsonWriter.beginArray();
            Iterator<l> it = lVar.f().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!lVar.t()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, l> entry : lVar.g().D()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
