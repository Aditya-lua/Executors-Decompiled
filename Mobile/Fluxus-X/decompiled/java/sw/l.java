package sw;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Constructor<MethodHandles.Lookup> f31960a;

    @IgnoreJRERequirement
    public static Object a(Method method, Class<?> cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor<MethodHandles.Lookup> declaredConstructor = f31960a;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f31960a = declaredConstructor;
        }
        return declaredConstructor.newInstance(cls, -1).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
