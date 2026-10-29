package com.google.gson.internal;

import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kg.C7597m;
import kg.InterfaceC7592h;
import kg.InterfaceC7607w;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstructorConstructor {
    private final Map<Type, InterfaceC7592h<?>> instanceCreators;
    private final List<InterfaceC7607w> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, InterfaceC7592h<?>> map, boolean z10, List<InterfaceC7607w> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z10;
        this.reflectionFilters = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.concurrent.ConcurrentHashMap.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m14694a() {
        return new ConcurrentHashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.ArrayList.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Collection m14695b() {
        return new ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Map m14696c() {
        return new LinkedHashMap();
    }

    public static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap kg.m:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] call: kg.m.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m14697d(String str) {
        throw new C7597m(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m14698e(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m14699f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new C7597m("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C7597m("Invalid EnumMap type: " + type.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.concurrent.ConcurrentSkipListMap.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Map m14701h() {
        return new ConcurrentSkipListMap();
    }

    private static boolean hasStringKeyType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && GsonTypes.getRawType(actualTypeArguments[0]) == String.class;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.TreeMap.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Map m14703j() {
        return new TreeMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap kg.m:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] call: kg.m.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m14704k(String str) {
        throw new C7597m(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Collection m14705l() {
        return new LinkedHashSet();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m14706m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new C7597m("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C7597m("Invalid EnumSet type: " + type.toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap kg.m:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] call: kg.m.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m14707n(String str) {
        throw new C7597m(str);
    }

    private static ObjectConstructor<? extends Collection<? extends Object>> newCollectionConstructor(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.q
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14695b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.r
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14705l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.s
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14711r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.t
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14713t();
                }
            };
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, InterfaceC7607w.a aVar) {
        final String strTryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            InterfaceC7607w.a aVar2 = InterfaceC7607w.a.ALLOW;
            if (aVar == aVar2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (aVar != InterfaceC7607w.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strTryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new ObjectConstructor() { // from class: com.google.gson.internal.m
                    @Override // com.google.gson.internal.ObjectConstructor
                    public final Object construct() {
                        return ConstructorConstructor.m14712s(declaredConstructor);
                    }
                } : new ObjectConstructor() { // from class: com.google.gson.internal.k
                    @Override // com.google.gson.internal.ObjectConstructor
                    public final Object construct() {
                        return ConstructorConstructor.m14704k(strTryMakeAccessible);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new ObjectConstructor() { // from class: com.google.gson.internal.j
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14707n(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newCollectionConstructor(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newMapConstructor(type, cls);
        }
        return null;
    }

    private static ObjectConstructor<? extends Map<? extends Object, Object>> newMapConstructor(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(LinkedTreeMap.class) && hasStringKeyType(type)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.e
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14709p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.f
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14696c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.g
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14703j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.h
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14694a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.i
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14701h();
                }
            };
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.c
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14706m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.d
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14699f(type);
                }
            };
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(final Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.u
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14698e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new ObjectConstructor() { // from class: com.google.gson.internal.b
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object construct() {
                return ConstructorConstructor.m14708o(str);
            }
        };
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap kg.m:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] call: kg.m.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m14708o(String str) {
        throw new C7597m(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (m)] call: com.google.gson.internal.LinkedTreeMap.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Map m14709p() {
        return new LinkedTreeMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap kg.m:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] call: kg.m.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m14710q(String str) {
        throw new C7597m(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.TreeSet.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Collection m14711r() {
        return new TreeSet();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m14712s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e12.getCause());
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.ArrayDeque.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Collection m14713t() {
        return new ArrayDeque();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap kg.m:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m), WRAPPED] call: kg.m.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Object m14714u(String str) {
        throw new C7597m(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        return get(typeToken, true);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken, boolean z10) {
        final Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final InterfaceC7592h<?> interfaceC7592h = this.instanceCreators.get(type);
        if (interfaceC7592h != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.a
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return interfaceC7592h.m31441a(type);
                }
            };
        }
        final InterfaceC7592h<?> interfaceC7592h2 = this.instanceCreators.get(rawType);
        if (interfaceC7592h2 != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.l
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return interfaceC7592h2.m31441a(type);
                }
            };
        }
        ObjectConstructor<T> objectConstructorNewSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (objectConstructorNewSpecialCollectionConstructor != null) {
            return objectConstructorNewSpecialCollectionConstructor;
        }
        InterfaceC7607w.a filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> objectConstructorNewDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (objectConstructorNewDefaultConstructor != null) {
            return objectConstructorNewDefaultConstructor;
        }
        ObjectConstructor<T> objectConstructorNewDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (objectConstructorNewDefaultImplementationConstructor != null) {
            return objectConstructorNewDefaultImplementationConstructor;
        }
        final String strCheckInstantiable = checkInstantiable(rawType);
        if (strCheckInstantiable != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.n
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14710q(strCheckInstantiable);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new ObjectConstructor() { // from class: com.google.gson.internal.o
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m14697d(str);
                }
            };
        }
        if (filterResult == InterfaceC7607w.a.ALLOW) {
            return newUnsafeAllocator(rawType);
        }
        final String str2 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new ObjectConstructor() { // from class: com.google.gson.internal.p
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object construct() {
                return ConstructorConstructor.m14714u(str2);
            }
        };
    }
}
