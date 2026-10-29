package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.C7597m;
import kg.C7600p;
import kg.C7605u;
import kg.InterfaceC7586b0;
import kg.InterfaceC7588d;
import kg.InterfaceC7607w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC7586b0 {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final InterfaceC7588d fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List<InterfaceC7607w> reflectionFilters;

    public static abstract class Adapter<T, A> extends AbstractC7584a0<T> {
        private final FieldsData fieldsData;

        public Adapter(FieldsData fieldsData) {
            this.fieldsData = fieldsData;
        }

        public abstract A createAccumulator();

        public abstract T finalize(A a10);

        @Override // kg.AbstractC7584a0
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A aCreateAccumulator = createAccumulator();
            Map<String, BoundField> map = this.fieldsData.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = map.get(jsonReader.nextName());
                    if (boundField == null) {
                        jsonReader.skipValue();
                    } else {
                        readField(aCreateAccumulator, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return finalize(aCreateAccumulator);
            } catch (IllegalAccessException e10) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
            } catch (IllegalStateException e11) {
                throw new C7605u(e11);
            }
        }

        public abstract void readField(A a10, JsonReader jsonReader, BoundField boundField);

        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, T t8) throws IOException {
            if (t8 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.fieldsData.serializedFields.iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t8);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
            }
        }
    }

    public static abstract class BoundField {
        final Field field;
        final String fieldName;
        final String serializedName;

        public BoundField(String str, Field field) {
            this.serializedName = str;
            this.field = field;
            this.fieldName = field.getName();
        }

        public abstract void readIntoArray(JsonReader jsonReader, int i10, Object[] objArr);

        public abstract void readIntoField(JsonReader jsonReader, Object obj);

        public abstract void write(JsonWriter jsonWriter, Object obj);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final ObjectConstructor<T> constructor;

        public FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(T t8) {
            return t8;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(T t8, JsonReader jsonReader, BoundField boundField) {
            boundField.readIntoField(jsonReader, t8);
        }
    }

    public static class FieldsData {
        static final FieldsData EMPTY = new FieldsData(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        final Map<String, BoundField> deserializedFields;
        final List<BoundField> serializedFields;

        public FieldsData(Map<String, BoundField> map, List<BoundField> list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final Map<String, Integer> componentIndices;
        private final Constructor<T> constructor;
        private final Object[] constructorArgsDefaults;

        public RecordAdapter(Class<T> cls, FieldsData fieldsData, boolean z10) {
            super(fieldsData);
            this.componentIndices = new HashMap();
            Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z10) {
                ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i10 = 0; i10 < recordComponentNames.length; i10++) {
                this.componentIndices.put(recordComponentNames[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.constructorArgsDefaults[i11] = PRIMITIVE_DEFAULTS.get(parameterTypes[i11]);
            }
        }

        private static Map<Class<?>, Object> primitiveDefaults() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: createAccumulator()Ljava/lang/Object; */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object[] createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: finalize(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: readField(Ljava/lang/Object;Lcom/google/gson/stream/JsonReader;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;)V */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(Object[] objArr, JsonReader jsonReader, BoundField boundField) {
            Integer num = this.componentIndices.get(boundField.fieldName);
            if (num != null) {
                boundField.readIntoArray(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' for field with name '" + boundField.fieldName + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, InterfaceC7588d interfaceC7588d, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<InterfaceC7607w> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = interfaceC7588d;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void checkAccessible(Object obj, M m10) {
        if (Modifier.isStatic(m10.getModifiers())) {
            obj = null;
        }
        if (ReflectionAccessFilterHelper.canAccess(m10, obj)) {
            return;
        }
        throw new C7597m(ReflectionHelper.getAccessibleObjectDescription(m10, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private BoundField createBoundField(C7590f c7590f, Field field, final Method method, String str, TypeToken<?> typeToken, boolean z10, final boolean z11) {
        final AbstractC7584a0<?> typeAdapterRuntimeTypeWrapper;
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        final boolean z12 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = true;
        }
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        AbstractC7584a0<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, c7590f, typeToken, jsonAdapter, false) : null;
        boolean z13 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = c7590f.m31414n(typeToken);
        }
        final AbstractC7584a0<?> abstractC7584a0 = typeAdapter;
        if (z10) {
            typeAdapterRuntimeTypeWrapper = z13 ? abstractC7584a0 : new TypeAdapterRuntimeTypeWrapper<>(c7590f, abstractC7584a0, typeToken.getType());
        } else {
            typeAdapterRuntimeTypeWrapper = abstractC7584a0;
        }
        return new BoundField(str, field) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.2
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void readIntoArray(JsonReader jsonReader, int i10, Object[] objArr) {
                Object obj = abstractC7584a0.read(jsonReader);
                if (obj != null || !zIsPrimitive) {
                    objArr[i10] = obj;
                    return;
                }
                throw new C7600p("null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + jsonReader.getPath());
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException {
                Object obj2 = abstractC7584a0.read(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z11) {
                    ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                } else if (z12) {
                    throw new C7597m("Cannot set value of 'static final' " + ReflectionHelper.getAccessibleObjectDescription(this.field, false));
                }
                this.field.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
                Object objInvoke;
                if (z11) {
                    Method method2 = method;
                    if (method2 == null) {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                    } else {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                    }
                }
                Method method3 = method;
                if (method3 != null) {
                    try {
                        objInvoke = method3.invoke(obj, null);
                    } catch (InvocationTargetException e10) {
                        throw new C7597m("Accessor " + ReflectionHelper.getAccessibleObjectDescription(method, false) + " threw exception", e10.getCause());
                    }
                } else {
                    objInvoke = this.field.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                jsonWriter.name(this.serializedName);
                typeAdapterRuntimeTypeWrapper.write(jsonWriter, objInvoke);
            }
        };
    }

    private static IllegalArgumentException createDuplicateFieldException(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + TroubleshootingGuide.createUrl("duplicate-fields"));
    }

    private FieldsData getBoundFields(C7590f c7590f, TypeToken<?> typeToken, Class<?> cls, boolean z10, boolean z11) {
        boolean z12;
        TypeToken<?> typeToken2;
        boolean z13;
        int i10;
        int i11;
        BoundField boundField;
        if (cls.isInterface()) {
            return FieldsData.EMPTY;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken<?> typeToken3 = typeToken;
        boolean z14 = z10;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            boolean z15 = true;
            boolean z16 = false;
            if (rawType != cls && declaredFields.length > 0) {
                InterfaceC7607w.a filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
                if (filterResult == InterfaceC7607w.a.BLOCK_ALL) {
                    throw new C7597m("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z14 = filterResult == InterfaceC7607w.a.BLOCK_INACCESSIBLE;
            }
            boolean z17 = z14;
            int length = declaredFields.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i12;
                Field field = declaredFields[i13];
                boolean zIncludeField = this.includeField(field, z15);
                boolean zIncludeField2 = this.includeField(field, z16);
                if (zIncludeField || zIncludeField2) {
                    Method accessor = null;
                    if (!z11) {
                        z12 = zIncludeField2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z12 = z16;
                    } else {
                        accessor = ReflectionHelper.getAccessor(rawType, field);
                        if (!z17) {
                            ReflectionHelper.makeAccessible(accessor);
                        }
                        if (accessor.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
                            throw new C7597m("@SerializedName on " + ReflectionHelper.getAccessibleObjectDescription(accessor, z16) + " is not supported");
                        }
                        z12 = zIncludeField2;
                    }
                    if (!z17 && accessor == null) {
                        ReflectionHelper.makeAccessible(field);
                    }
                    Type typeResolve = GsonTypes.resolve(typeToken3.getType(), rawType, field.getGenericType());
                    List<String> fieldNames = this.getFieldNames(field);
                    typeToken2 = typeToken3;
                    z13 = false;
                    String str = fieldNames.get(0);
                    i10 = i13;
                    i11 = length;
                    BoundField boundFieldCreateBoundField = this.createBoundField(c7590f, field, accessor, str, TypeToken.get(typeResolve), zIncludeField, z17);
                    if (z12) {
                        for (String str2 : fieldNames) {
                            BoundField boundField2 = (BoundField) linkedHashMap.put(str2, boundFieldCreateBoundField);
                            if (boundField2 != null) {
                                throw createDuplicateFieldException(cls, str2, boundField2.field, field);
                            }
                        }
                    }
                    if (zIncludeField && (boundField = (BoundField) linkedHashMap2.put(str, boundFieldCreateBoundField)) != null) {
                        throw createDuplicateFieldException(cls, str, boundField.field, field);
                    }
                } else {
                    i11 = length;
                    i10 = i13;
                    typeToken2 = typeToken3;
                    z13 = z16;
                }
                i12 = i10 + 1;
                this = this;
                z16 = z13;
                typeToken3 = typeToken2;
                length = i11;
                z15 = true;
            }
            typeToken3 = TypeToken.get(GsonTypes.resolve(typeToken3.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = typeToken3.getRawType();
            z14 = z17;
        }
        return new FieldsData(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List<String> getFieldNames(Field field) {
        String strMo31392b;
        List<String> listM31393a;
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            strMo31392b = this.fieldNamingPolicy.mo31392b(field);
            listM31393a = this.fieldNamingPolicy.m31393a(field);
        } else {
            String strValue = serializedName.value();
            List<String> listAsList = Arrays.asList(serializedName.alternate());
            strMo31392b = strValue;
            listM31393a = listAsList;
        }
        if (listM31393a.isEmpty()) {
            return Collections.singletonList(strMo31392b);
        }
        ArrayList arrayList = new ArrayList(listM31393a.size() + 1);
        arrayList.add(strMo31392b);
        arrayList.addAll(listM31393a);
        return arrayList;
    }

    private boolean includeField(Field field, boolean z10) {
        return !this.excluder.excludeField(field, z10);
    }

    @Override // kg.InterfaceC7586b0
    public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new AbstractC7584a0<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // kg.AbstractC7584a0
                public T read(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // kg.AbstractC7584a0
                public void write(JsonWriter jsonWriter, T t8) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        InterfaceC7607w.a filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult != InterfaceC7607w.a.BLOCK_ALL) {
            boolean z10 = filterResult == InterfaceC7607w.a.BLOCK_INACCESSIBLE;
            return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, getBoundFields(c7590f, typeToken, rawType, z10, true), z10) : new FieldReflectionAdapter(this.constructorConstructor.get(typeToken, true), getBoundFields(c7590f, typeToken, rawType, z10, false));
        }
        throw new C7597m("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
