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
import jg.a0;
import jg.b0;
import jg.f;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends a0<Object> {
    public static final b0 FACTORY = new b0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // jg.b0
        public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = GsonTypes.getArrayComponentType(type);
            return new ArrayTypeAdapter(fVar, fVar.n(TypeToken.get(arrayComponentType)), GsonTypes.getRawType(arrayComponentType));
        }
    };
    private final Class<E> componentType;
    private final a0<E> componentTypeAdapter;

    public ArrayTypeAdapter(f fVar, a0<E> a0Var, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(fVar, a0Var, cls);
        this.componentType = cls;
    }

    @Override // jg.a0
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

    @Override // jg.a0
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
