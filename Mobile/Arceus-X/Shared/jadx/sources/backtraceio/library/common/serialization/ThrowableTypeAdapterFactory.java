package backtraceio.library.common.serialization;

import backtraceio.library.logger.BacktraceLogger;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kg.AbstractC7584a0;
import kg.AbstractC7596l;
import kg.C7590f;
import kg.C7599o;
import kg.C7600p;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableTypeAdapterFactory implements InterfaceC7586b0 {
    private final transient String LOG_TAG = ThrowableTypeAdapterFactory.class.getSimpleName();

    public static class ConstructorSpec<T extends Throwable> {
        final Object[] args;
        final Class<?>[] paramTypes;

        public ConstructorSpec(Class<?>[] clsArr, Object[] objArr) {
            this.paramTypes = clsArr;
            this.args = objArr;
        }
    }

    @Override // kg.InterfaceC7586b0
    public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
        final Class<? super T> rawType = typeToken.getRawType();
        if (Throwable.class.isAssignableFrom(rawType)) {
            final AbstractC7584a0<T> abstractC7584a0M31415o = c7590f.m31415o(AbstractC7596l.class);
            final AbstractC7584a0<T> abstractC7584a0M31415o2 = c7590f.m31415o(StackTraceElement.class);
            final AbstractC7584a0<T> abstractC7584a0M31415o3 = c7590f.m31415o(Throwable.class);
            return new AbstractC7584a0<T>() { // from class: backtraceio.library.common.serialization.ThrowableTypeAdapterFactory.1
                /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                private T createFallbackInstanceOrThrow(Throwable th2, String str, List<StackTraceElement> list) {
                    String str2 = String.format("Deserialized to %s but expected assignable to %s. Message: %s", th2 != null ? th2.getClass().getName() : "null", rawType.getName(), str);
                    try {
                        Constructor<T> declaredConstructor = rawType.getDeclaredConstructor(String.class, Throwable.class);
                        declaredConstructor.setAccessible(true);
                        T tNewInstance = declaredConstructor.newInstance(str2, th2);
                        ((Throwable) tNewInstance).setStackTrace((StackTraceElement[]) list.toArray(new StackTraceElement[0]));
                        return tNewInstance;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                        throw new C7600p("Could not create fallback instance of " + rawType.getName() + ": " + e10.getMessage(), e10);
                    }
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Class */
                /* JADX WARN: Multi-variable type inference failed */
                private Class<? extends Throwable> determineClassToInstantiate(String str) {
                    Class<? extends Throwable> cls = rawType;
                    if (str != null) {
                        try {
                            Class cls2 = Class.forName(str);
                            if (Throwable.class.isAssignableFrom(cls2) && rawType.isAssignableFrom(cls2)) {
                                return cls2;
                            }
                        } catch (ClassNotFoundException unused) {
                            BacktraceLogger.m7080d(ThrowableTypeAdapterFactory.this.LOG_TAG, "Class " + str + " not found, will fall back to using rawType (the type requested from Gson): " + rawType.getSimpleName());
                        }
                    }
                    return cls;
                }

                /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Throwable;>(Ljava/lang/Class<TT;>;Ljava/lang/String;Ljava/lang/Throwable;)TT; */
                private Throwable tryInstantiateThrowable(Class cls, String str, Throwable th2) {
                    ConstructorSpec[] constructorSpecArr = {new ConstructorSpec(new Class[]{String.class, Throwable.class}, new Object[]{str, th2}), new ConstructorSpec(new Class[]{Throwable.class}, new Object[]{th2}), new ConstructorSpec(new Class[]{String.class}, new Object[]{str}), new ConstructorSpec(new Class[0], new Object[0])};
                    for (int i10 = 0; i10 < 4; i10++) {
                        ConstructorSpec constructorSpec = constructorSpecArr[i10];
                        try {
                            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(constructorSpec.paramTypes);
                            declaredConstructor.setAccessible(true);
                            Throwable th3 = (Throwable) declaredConstructor.newInstance(constructorSpec.args);
                            if (th2 != null) {
                                try {
                                    th3.initCause(th2);
                                } catch (Exception unused) {
                                    BacktraceLogger.m7080d(ThrowableTypeAdapterFactory.this.LOG_TAG, "Could not initCause for " + cls.getName() + " after constructor with args: " + Arrays.toString(constructorSpec.paramTypes));
                                }
                            }
                            return th3;
                        } catch (Exception e10) {
                            BacktraceLogger.m7080d(ThrowableTypeAdapterFactory.this.LOG_TAG, "Failed to instantiate " + cls.getName() + " with constructor with args: " + Arrays.toString(constructorSpec.paramTypes) + ", error message: " + e10);
                        }
                    }
                    return null;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.lang.Class */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v7, types: [T, java.lang.Object, java.lang.Throwable] */
                @Override // kg.AbstractC7584a0
                public T read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    AbstractC7596l abstractC7596l = (AbstractC7596l) abstractC7584a0M31415o.read(jsonReader);
                    if (!abstractC7596l.m31461t()) {
                        throw new C7600p("Expected a JSON object for Throwable deserialization");
                    }
                    C7599o c7599oM31457g = abstractC7596l.m31457g();
                    String strMo31451l = c7599oM31457g.m31471H("class") ? c7599oM31457g.m31468E("class").mo31451l() : null;
                    String strMo31451l2 = (c7599oM31457g.m31471H("message") && c7599oM31457g.m31468E("message").m31462u()) ? c7599oM31457g.m31468E("message").mo31451l() : null;
                    List<StackTraceElement> arrayList = new ArrayList<>();
                    if (c7599oM31457g.m31471H("stack-trace") && c7599oM31457g.m31468E("stack-trace").m31459m()) {
                        Iterator<AbstractC7596l> it = c7599oM31457g.m31469F("stack-trace").iterator();
                        while (it.hasNext()) {
                            arrayList.add((StackTraceElement) abstractC7584a0M31415o2.fromJsonTree(it.next()));
                        }
                    }
                    Throwable th2 = (c7599oM31457g.m31471H("cause") && c7599oM31457g.m31468E("cause").m31461t()) ? (Throwable) abstractC7584a0M31415o3.fromJsonTree(c7599oM31457g.m31470G("cause")) : null;
                    Class<? extends Throwable> clsDetermineClassToInstantiate = determineClassToInstantiate(strMo31451l);
                    ?? r8 = (T) tryInstantiateThrowable(clsDetermineClassToInstantiate, strMo31451l2, th2);
                    if (r8 == 0) {
                        BacktraceLogger.m7083w(ThrowableTypeAdapterFactory.this.LOG_TAG, String.format("Could not instantiate specific Throwable type '%s'. Falling back by returning null.", clsDetermineClassToInstantiate.getName()));
                        return null;
                    }
                    r8.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    return rawType.isInstance(r8) ? r8 : createFallbackInstanceOrThrow(r8, strMo31451l2, arrayList);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kg.AbstractC7584a0
                public void write(JsonWriter jsonWriter, T t8) throws IOException {
                    if (t8 == 0) {
                        jsonWriter.nullValue();
                        return;
                    }
                    Throwable th2 = (Throwable) t8;
                    jsonWriter.beginObject();
                    jsonWriter.name("message").value(th2.getMessage());
                    jsonWriter.name("class").value(th2.getClass().getName());
                    jsonWriter.name("stack-trace");
                    jsonWriter.beginArray();
                    for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                        abstractC7584a0M31415o2.write(jsonWriter, stackTraceElement);
                    }
                    jsonWriter.endArray();
                    if (th2.getCause() != null) {
                        jsonWriter.name("cause");
                        abstractC7584a0M31415o3.write(jsonWriter, th2.getCause());
                    }
                    jsonWriter.endObject();
                }
            };
        }
        BacktraceLogger.m7080d(this.LOG_TAG, "ThrowableTypeAdapterFactory doesn't handle " + rawType.getName() + " type");
        return null;
    }
}
