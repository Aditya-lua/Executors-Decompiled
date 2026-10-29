package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import jg.a0;
import jg.f;

/* JADX INFO: loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends a0<T> {
    private final f context;
    private final a0<T> delegate;
    private final Type type;

    public TypeAdapterRuntimeTypeWrapper(f fVar, a0<T> a0Var, Type type) {
        this.context = fVar;
        this.delegate = a0Var;
        this.type = type;
    }

    private static Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean isReflective(a0<?> a0Var) {
        a0<?> serializationDelegate;
        while ((a0Var instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) a0Var).getSerializationDelegate()) != a0Var) {
            a0Var = serializationDelegate;
        }
        return a0Var instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // jg.a0
    public T read(JsonReader jsonReader) {
        return this.delegate.read(jsonReader);
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, T t8) {
        a0<T> a0VarN = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t8);
        if (runtimeTypeIfMoreSpecific != this.type) {
            a0VarN = this.context.n(TypeToken.get(runtimeTypeIfMoreSpecific));
            if ((a0VarN instanceof ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
                a0VarN = this.delegate;
            }
        }
        a0VarN.write(jsonWriter, t8);
    }
}
