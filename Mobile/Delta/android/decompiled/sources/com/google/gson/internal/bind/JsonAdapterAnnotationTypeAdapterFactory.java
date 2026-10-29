package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import jg.a0;
import jg.b0;
import jg.f;
import jg.k;
import jg.t;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements b0 {
    private static final b0 TREE_TYPE_CLASS_DUMMY_FACTORY;
    private static final b0 TREE_TYPE_FIELD_DUMMY_FACTORY;
    private final ConcurrentMap<Class<?>, b0> adapterFactoryMap = new ConcurrentHashMap();
    private final ConstructorConstructor constructorConstructor;

    public static class DummyTypeAdapterFactory implements b0 {
        private DummyTypeAdapterFactory() {
        }

        @Override // jg.b0
        public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        TREE_TYPE_CLASS_DUMMY_FACTORY = new DummyTypeAdapterFactory();
        TREE_TYPE_FIELD_DUMMY_FACTORY = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    private static Object createAdapter(ConstructorConstructor constructorConstructor, Class<?> cls) {
        return constructorConstructor.get(TypeToken.get((Class) cls), true).construct();
    }

    private static JsonAdapter getAnnotation(Class<?> cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    private b0 putFactoryAndGetCurrent(Class<?> cls, b0 b0Var) {
        b0 b0VarPutIfAbsent = this.adapterFactoryMap.putIfAbsent(cls, b0Var);
        return b0VarPutIfAbsent != null ? b0VarPutIfAbsent : b0Var;
    }

    @Override // jg.b0
    public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
        JsonAdapter annotation = getAnnotation(typeToken.getRawType());
        if (annotation == null) {
            return null;
        }
        return (a0<T>) getTypeAdapter(this.constructorConstructor, fVar, typeToken, annotation, true);
    }

    public a0<?> getTypeAdapter(ConstructorConstructor constructorConstructor, f fVar, TypeToken<?> typeToken, JsonAdapter jsonAdapter, boolean z10) {
        a0<?> a0VarCreate;
        Object objCreateAdapter = createAdapter(constructorConstructor, jsonAdapter.value());
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objCreateAdapter instanceof a0) {
            a0VarCreate = (a0) objCreateAdapter;
        } else if (objCreateAdapter instanceof b0) {
            b0 b0VarPutFactoryAndGetCurrent = (b0) objCreateAdapter;
            if (z10) {
                b0VarPutFactoryAndGetCurrent = putFactoryAndGetCurrent(typeToken.getRawType(), b0VarPutFactoryAndGetCurrent);
            }
            a0VarCreate = b0VarPutFactoryAndGetCurrent.create(fVar, typeToken);
        } else {
            boolean z11 = objCreateAdapter instanceof t;
            if (!z11 && !(objCreateAdapter instanceof k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objCreateAdapter.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z11 ? (t) objCreateAdapter : null, objCreateAdapter instanceof k ? (k) objCreateAdapter : null, fVar, typeToken, z10 ? TREE_TYPE_CLASS_DUMMY_FACTORY : TREE_TYPE_FIELD_DUMMY_FACTORY, zNullSafe);
            zNullSafe = false;
            a0VarCreate = treeTypeAdapter;
        }
        return (a0VarCreate == null || !zNullSafe) ? a0VarCreate : a0VarCreate.nullSafe();
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, b0 b0Var) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(b0Var);
        if (b0Var == TREE_TYPE_CLASS_DUMMY_FACTORY) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        b0 b0Var2 = this.adapterFactoryMap.get(rawType);
        if (b0Var2 != null) {
            return b0Var2 == b0Var;
        }
        JsonAdapter annotation = getAnnotation(rawType);
        if (annotation == null) {
            return false;
        }
        Class<?> clsValue = annotation.value();
        return b0.class.isAssignableFrom(clsValue) && putFactoryAndGetCurrent(rawType, (b0) createAdapter(this.constructorConstructor, clsValue)) == b0Var;
    }
}
