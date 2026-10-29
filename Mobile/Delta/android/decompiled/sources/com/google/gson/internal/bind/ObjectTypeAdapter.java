package com.google.gson.internal.bind;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jg.a0;
import jg.b0;
import jg.f;
import jg.y;
import jg.z;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends a0<Object> {
    private static final b0 DOUBLE_FACTORY = newFactory(y.f21451a);
    private final f gson;
    private final z toNumberStrategy;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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

    public static b0 getFactory(z zVar) {
        return zVar == y.f21451a ? DOUBLE_FACTORY : newFactory(zVar);
    }

    private static b0 newFactory(final z zVar) {
        return new b0() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // jg.b0
            public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(fVar, zVar);
                }
                return null;
            }
        };
    }

    private Object readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 3) {
            return jsonReader.nextString();
        }
        if (i10 == 4) {
            return this.toNumberStrategy.a(jsonReader);
        }
        if (i10 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private Object tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new LinkedTreeMap();
    }

    @Override // jg.a0
    public Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
        if (objTryBeginNesting == null) {
            return readTerminal(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objTryBeginNesting instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Object objTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                boolean z10 = objTryBeginNesting2 != null;
                if (objTryBeginNesting2 == null) {
                    objTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                }
                if (objTryBeginNesting instanceof List) {
                    ((List) objTryBeginNesting).add(objTryBeginNesting2);
                } else {
                    ((Map) objTryBeginNesting).put(strNextName, objTryBeginNesting2);
                }
                if (z10) {
                    arrayDeque.addLast(objTryBeginNesting);
                    objTryBeginNesting = objTryBeginNesting2;
                }
            } else {
                if (objTryBeginNesting instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objTryBeginNesting;
                }
                objTryBeginNesting = arrayDeque.removeLast();
            }
        }
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        a0 a0VarO = this.gson.o(obj.getClass());
        if (!(a0VarO instanceof ObjectTypeAdapter)) {
            a0VarO.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(f fVar, z zVar) {
        this.gson = fVar;
        this.toNumberStrategy = zVar;
    }
}
