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
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.EnumC7609y;
import kg.InterfaceC7586b0;
import kg.InterfaceC7610z;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends AbstractC7584a0<Object> {
    private static final InterfaceC7586b0 DOUBLE_FACTORY = newFactory(EnumC7609y.f29127a);
    private final C7590f gson;
    private final InterfaceC7610z toNumberStrategy;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2 */
    public static /* synthetic */ class C30622 {
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

    public static InterfaceC7586b0 getFactory(InterfaceC7610z interfaceC7610z) {
        return interfaceC7610z == EnumC7609y.f29127a ? DOUBLE_FACTORY : newFactory(interfaceC7610z);
    }

    private static InterfaceC7586b0 newFactory(final InterfaceC7610z interfaceC7610z) {
        return new InterfaceC7586b0() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // kg.InterfaceC7586b0
            public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(c7590f, interfaceC7610z);
                }
                return null;
            }
        };
    }

    private Object readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = C30622.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i10 == 3) {
            return jsonReader.nextString();
        }
        if (i10 == 4) {
            return this.toNumberStrategy.mo31493a(jsonReader);
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
        int i10 = C30622.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
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

    @Override // kg.AbstractC7584a0
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

    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AbstractC7584a0 abstractC7584a0M31415o = this.gson.m31415o(obj.getClass());
        if (!(abstractC7584a0M31415o instanceof ObjectTypeAdapter)) {
            abstractC7584a0M31415o.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private ObjectTypeAdapter(C7590f c7590f, InterfaceC7610z interfaceC7610z) {
        this.gson = c7590f;
        this.toNumberStrategy = interfaceC7610z;
    }
}
