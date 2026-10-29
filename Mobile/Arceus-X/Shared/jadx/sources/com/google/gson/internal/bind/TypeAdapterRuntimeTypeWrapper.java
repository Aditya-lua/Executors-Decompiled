package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kg.AbstractC7584a0;
import kg.C7590f;

/* JADX INFO: loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends AbstractC7584a0<T> {
    private final C7590f context;
    private final AbstractC7584a0<T> delegate;
    private final Type type;

    public TypeAdapterRuntimeTypeWrapper(C7590f c7590f, AbstractC7584a0<T> abstractC7584a0, Type type) {
        this.context = c7590f;
        this.delegate = abstractC7584a0;
        this.type = type;
    }

    private static Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean isReflective(AbstractC7584a0<?> abstractC7584a0) {
        AbstractC7584a0<?> serializationDelegate;
        while ((abstractC7584a0 instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) abstractC7584a0).getSerializationDelegate()) != abstractC7584a0) {
            abstractC7584a0 = serializationDelegate;
        }
        return abstractC7584a0 instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // kg.AbstractC7584a0
    public T read(JsonReader jsonReader) {
        return this.delegate.read(jsonReader);
    }

    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, T t8) {
        AbstractC7584a0<T> abstractC7584a0M31414n = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t8);
        if (runtimeTypeIfMoreSpecific != this.type) {
            abstractC7584a0M31414n = this.context.m31414n(TypeToken.get(runtimeTypeIfMoreSpecific));
            if ((abstractC7584a0M31414n instanceof ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
                abstractC7584a0M31414n = this.delegate;
            }
        }
        abstractC7584a0M31414n.write(jsonWriter, t8);
    }
}
