package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.InterfaceC7586b0;
import kg.InterfaceC7595k;
import kg.InterfaceC7604t;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC7586b0 {
    private static final InterfaceC7586b0 TREE_TYPE_CLASS_DUMMY_FACTORY;
    private static final InterfaceC7586b0 TREE_TYPE_FIELD_DUMMY_FACTORY;
    private final ConcurrentMap<Class<?>, InterfaceC7586b0> adapterFactoryMap = new ConcurrentHashMap();
    private final ConstructorConstructor constructorConstructor;

    public static class DummyTypeAdapterFactory implements InterfaceC7586b0 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private DummyTypeAdapterFactory() {
        }

        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
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

    private InterfaceC7586b0 putFactoryAndGetCurrent(Class<?> cls, InterfaceC7586b0 interfaceC7586b0) {
        InterfaceC7586b0 interfaceC7586b0PutIfAbsent = this.adapterFactoryMap.putIfAbsent(cls, interfaceC7586b0);
        return interfaceC7586b0PutIfAbsent != null ? interfaceC7586b0PutIfAbsent : interfaceC7586b0;
    }

    @Override // kg.InterfaceC7586b0
    public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
        JsonAdapter annotation = getAnnotation(typeToken.getRawType());
        if (annotation == null) {
            return null;
        }
        return (AbstractC7584a0<T>) getTypeAdapter(this.constructorConstructor, c7590f, typeToken, annotation, true);
    }

    public AbstractC7584a0<?> getTypeAdapter(ConstructorConstructor constructorConstructor, C7590f c7590f, TypeToken<?> typeToken, JsonAdapter jsonAdapter, boolean z10) {
        AbstractC7584a0<?> abstractC7584a0Create;
        Object objCreateAdapter = createAdapter(constructorConstructor, jsonAdapter.value());
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objCreateAdapter instanceof AbstractC7584a0) {
            abstractC7584a0Create = (AbstractC7584a0) objCreateAdapter;
        } else if (objCreateAdapter instanceof InterfaceC7586b0) {
            InterfaceC7586b0 interfaceC7586b0PutFactoryAndGetCurrent = (InterfaceC7586b0) objCreateAdapter;
            if (z10) {
                interfaceC7586b0PutFactoryAndGetCurrent = putFactoryAndGetCurrent(typeToken.getRawType(), interfaceC7586b0PutFactoryAndGetCurrent);
            }
            abstractC7584a0Create = interfaceC7586b0PutFactoryAndGetCurrent.create(c7590f, typeToken);
        } else {
            boolean z11 = objCreateAdapter instanceof InterfaceC7604t;
            if (!z11 && !(objCreateAdapter instanceof InterfaceC7595k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objCreateAdapter.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z11 ? (InterfaceC7604t) objCreateAdapter : null, objCreateAdapter instanceof InterfaceC7595k ? (InterfaceC7595k) objCreateAdapter : null, c7590f, typeToken, z10 ? TREE_TYPE_CLASS_DUMMY_FACTORY : TREE_TYPE_FIELD_DUMMY_FACTORY, zNullSafe);
            zNullSafe = false;
            abstractC7584a0Create = treeTypeAdapter;
        }
        return (abstractC7584a0Create == null || !zNullSafe) ? abstractC7584a0Create : abstractC7584a0Create.nullSafe();
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, InterfaceC7586b0 interfaceC7586b0) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(interfaceC7586b0);
        if (interfaceC7586b0 == TREE_TYPE_CLASS_DUMMY_FACTORY) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        InterfaceC7586b0 interfaceC7586b1 = this.adapterFactoryMap.get(rawType);
        if (interfaceC7586b1 != null) {
            return interfaceC7586b1 == interfaceC7586b0;
        }
        JsonAdapter annotation = getAnnotation(rawType);
        if (annotation == null) {
            return false;
        }
        Class<?> clsValue = annotation.value();
        return InterfaceC7586b0.class.isAssignableFrom(clsValue) && putFactoryAndGetCurrent(rawType, (InterfaceC7586b0) createAdapter(this.constructorConstructor, clsValue)) == interfaceC7586b0;
    }
}
