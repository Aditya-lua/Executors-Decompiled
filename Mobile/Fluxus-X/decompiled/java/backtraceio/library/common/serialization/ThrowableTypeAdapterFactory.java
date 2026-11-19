package backtraceio.library.common.serialization;

import backtraceio.library.logger.BacktraceLogger;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lg.a0;
import lg.b0;
import lg.f;
import lg.l;
import lg.o;
import lg.p;
import sg.a;
import tg.b;
import tg.c;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableTypeAdapterFactory implements b0 {
    private final transient String LOG_TAG = ThrowableTypeAdapterFactory.class.getSimpleName();

    public static class ConstructorSpec<T extends Throwable> {
        final Object[] args;
        final Class<?>[] paramTypes;

        public ConstructorSpec(Class<?>[] clsArr, Object[] objArr) {
            this.paramTypes = clsArr;
            this.args = objArr;
        }
    }

    @Override // lg.b0
    public <T> a0<T> create(f fVar, a<T> aVar) {
        final Class<? super T> clsC = aVar.c();
        if (Throwable.class.isAssignableFrom(clsC)) {
            final a0<T> a0VarL = fVar.l(l.class);
            final a0<T> a0VarL2 = fVar.l(StackTraceElement.class);
            final a0<T> a0VarL3 = fVar.l(Throwable.class);
            return new a0<T>() { // from class: backtraceio.library.common.serialization.ThrowableTypeAdapterFactory.1
                /* JADX WARN: Multi-variable type inference failed */
                private T createFallbackInstanceOrThrow(Throwable th2, String str, List<StackTraceElement> list) {
                    String str2 = String.format("Deserialized to %s but expected assignable to %s. Message: %s", th2 != null ? th2.getClass().getName() : "null", clsC.getName(), str);
                    try {
                        Constructor<T> declaredConstructor = clsC.getDeclaredConstructor(String.class, Throwable.class);
                        declaredConstructor.setAccessible(true);
                        T tNewInstance = declaredConstructor.newInstance(str2, th2);
                        ((Throwable) tNewInstance).setStackTrace((StackTraceElement[]) list.toArray(new StackTraceElement[0]));
                        return tNewInstance;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                        throw new p("Could not create fallback instance of " + clsC.getName() + ": " + e10.getMessage(), e10);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                private Class<? extends Throwable> determineClassToInstantiate(String str) {
                    Class<? extends Throwable> cls = clsC;
                    if (str != null) {
                        try {
                            Class cls2 = Class.forName(str);
                            if (Throwable.class.isAssignableFrom(cls2) && clsC.isAssignableFrom(cls2)) {
                                return cls2;
                            }
                        } catch (ClassNotFoundException unused) {
                            BacktraceLogger.d(ThrowableTypeAdapterFactory.this.LOG_TAG, "Class " + str + " not found, will fall back to using rawType (the type requested from Gson): " + clsC.getSimpleName());
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
                                    BacktraceLogger.d(ThrowableTypeAdapterFactory.this.LOG_TAG, "Could not initCause for " + cls.getName() + " after constructor with args: " + Arrays.toString(constructorSpec.paramTypes));
                                }
                            }
                            return th3;
                        } catch (Exception e10) {
                            BacktraceLogger.d(ThrowableTypeAdapterFactory.this.LOG_TAG, "Failed to instantiate " + cls.getName() + " with constructor with args: " + Arrays.toString(constructorSpec.paramTypes) + ", error message: " + e10);
                        }
                    }
                    return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v7, types: [T, java.lang.Object, java.lang.Throwable] */
                @Override // lg.a0
                public T read(tg.a aVar2) throws IOException {
                    if (aVar2.Q() == b.NULL) {
                        aVar2.K();
                        return null;
                    }
                    l lVar = (l) a0VarL.read(aVar2);
                    if (!lVar.q()) {
                        throw new p("Expected a JSON object for Throwable deserialization");
                    }
                    o oVarG = lVar.g();
                    String strL = oVarG.H("class") ? oVarG.E("class").l() : null;
                    String strL2 = (oVarG.H("message") && oVarG.E("message").t()) ? oVarG.E("message").l() : null;
                    List<StackTraceElement> arrayList = new ArrayList<>();
                    if (oVarG.H("stack-trace") && oVarG.E("stack-trace").m()) {
                        Iterator<l> it = oVarG.F("stack-trace").iterator();
                        while (it.hasNext()) {
                            arrayList.add((StackTraceElement) a0VarL2.fromJsonTree(it.next()));
                        }
                    }
                    Throwable th2 = (oVarG.H("cause") && oVarG.E("cause").q()) ? (Throwable) a0VarL3.fromJsonTree(oVarG.G("cause")) : null;
                    Class<? extends Throwable> clsDetermineClassToInstantiate = determineClassToInstantiate(strL);
                    ?? r10 = (T) tryInstantiateThrowable(clsDetermineClassToInstantiate, strL2, th2);
                    if (r10 == 0) {
                        BacktraceLogger.w(ThrowableTypeAdapterFactory.this.LOG_TAG, String.format("Could not instantiate specific Throwable type '%s'. Falling back by returning null.", clsDetermineClassToInstantiate.getName()));
                        return null;
                    }
                    r10.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    return clsC.isInstance(r10) ? r10 : createFallbackInstanceOrThrow(r10, strL2, arrayList);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // lg.a0
                public void write(c cVar, T t8) throws IOException {
                    if (t8 == 0) {
                        cVar.s();
                        return;
                    }
                    Throwable th2 = (Throwable) t8;
                    cVar.e();
                    cVar.p("message").Y(th2.getMessage());
                    cVar.p("class").Y(th2.getClass().getName());
                    cVar.p("stack-trace");
                    cVar.d();
                    for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                        a0VarL2.write(cVar, stackTraceElement);
                    }
                    cVar.g();
                    if (th2.getCause() != null) {
                        cVar.p("cause");
                        a0VarL3.write(cVar, th2.getCause());
                    }
                    cVar.h();
                }
            };
        }
        BacktraceLogger.d(this.LOG_TAG, "ThrowableTypeAdapterFactory doesn't handle " + clsC.getName() + " type");
        return null;
    }
}
