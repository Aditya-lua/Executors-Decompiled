package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import jg.a0;
import jg.b0;
import jg.f;
import jg.u;
import jg.y;
import jg.z;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberTypeAdapter extends a0<Number> {
    private static final b0 LAZILY_PARSED_NUMBER_FACTORY = newFactory(y.b);
    private final z toNumberStrategy;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(z zVar) {
        this.toNumberStrategy = zVar;
    }

    public static b0 getFactory(z zVar) {
        return zVar == y.b ? LAZILY_PARSED_NUMBER_FACTORY : newFactory(zVar);
    }

    private static b0 newFactory(z zVar) {
        return new b0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // jg.b0
            public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // jg.a0
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
        if (i10 == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.toNumberStrategy.a(jsonReader);
        }
        throw new u("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
