package p231jv;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: jv.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7384l {

    /* JADX INFO: renamed from: a */
    public static Constructor<MethodHandles.Lookup> f28315a;

    @IgnoreJRERequirement
    /* JADX INFO: renamed from: a */
    public static Object m30585a(Method method, Class<?> cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor<MethodHandles.Lookup> declaredConstructor = f28315a;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f28315a = declaredConstructor;
        }
        return declaredConstructor.newInstance(cls, -1).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
