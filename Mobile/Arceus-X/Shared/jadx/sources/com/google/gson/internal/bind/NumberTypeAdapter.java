package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.C7605u;
import kg.EnumC7609y;
import kg.InterfaceC7586b0;
import kg.InterfaceC7610z;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberTypeAdapter extends AbstractC7584a0<Number> {
    private static final InterfaceC7586b0 LAZILY_PARSED_NUMBER_FACTORY = newFactory(EnumC7609y.f29128b);
    private final InterfaceC7610z toNumberStrategy;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2 */
    public static /* synthetic */ class C30602 {
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

    private NumberTypeAdapter(InterfaceC7610z interfaceC7610z) {
        this.toNumberStrategy = interfaceC7610z;
    }

    public static InterfaceC7586b0 getFactory(InterfaceC7610z interfaceC7610z) {
        return interfaceC7610z == EnumC7609y.f29128b ? LAZILY_PARSED_NUMBER_FACTORY : newFactory(interfaceC7610z);
    }

    private static InterfaceC7586b0 newFactory(InterfaceC7610z interfaceC7610z) {
        return new InterfaceC7586b0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // kg.InterfaceC7586b0
            public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kg.AbstractC7584a0
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = C30602.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
        if (i10 == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.toNumberStrategy.mo31493a(jsonReader);
        }
        throw new C7605u("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
