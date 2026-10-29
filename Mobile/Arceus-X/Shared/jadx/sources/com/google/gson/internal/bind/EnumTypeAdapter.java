package com.google.gson.internal.bind;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
class EnumTypeAdapter<T extends Enum<T>> extends AbstractC7584a0<T> {
    static final InterfaceC7586b0 FACTORY = new InterfaceC7586b0() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };
    private final Map<T, String> constantToName;
    private final Map<String, T> nameToConstant;
    private final Map<String, T> stringToConstant;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private EnumTypeAdapter(Class<T> cls) {
        this.nameToConstant = new HashMap();
        this.stringToConstant = new HashMap();
        this.constantToName = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r8 = (Enum) field2.get(null);
                String strName = r8.name();
                String string = r8.toString();
                SerializedName serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    strName = serializedName.value();
                    for (String str : serializedName.alternate()) {
                        this.nameToConstant.put(str, (T) r8);
                    }
                }
                this.nameToConstant.put(strName, (T) r8);
                this.stringToConstant.put(string, (T) r8);
                this.constantToName.put((T) r8, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // kg.AbstractC7584a0
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        T t8 = this.nameToConstant.get(strNextString);
        return t8 == null ? this.stringToConstant.get(strNextString) : t8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, T t8) throws IOException {
        jsonWriter.value(t8 == null ? null : this.constantToName.get(t8));
    }
}
