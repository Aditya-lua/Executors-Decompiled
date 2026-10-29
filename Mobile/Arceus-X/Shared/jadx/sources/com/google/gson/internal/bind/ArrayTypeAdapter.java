package com.google.gson.internal.bind;

import com.google.gson.internal.GsonTypes;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends AbstractC7584a0<Object> {
    public static final InterfaceC7586b0 FACTORY = new InterfaceC7586b0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = GsonTypes.getArrayComponentType(type);
            return new ArrayTypeAdapter(c7590f, c7590f.m31414n(TypeToken.get(arrayComponentType)), GsonTypes.getRawType(arrayComponentType));
        }
    };
    private final Class<E> componentType;
    private final AbstractC7584a0<E> componentTypeAdapter;

    public ArrayTypeAdapter(C7590f c7590f, AbstractC7584a0<E> abstractC7584a0, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(c7590f, abstractC7584a0, cls);
        this.componentType = cls;
    }

    @Override // kg.AbstractC7584a0
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.componentTypeAdapter.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (!this.componentType.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.componentType, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.componentType, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.componentTypeAdapter.write(jsonWriter, (E) Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
