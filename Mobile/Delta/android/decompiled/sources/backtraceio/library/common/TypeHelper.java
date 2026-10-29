package backtraceio.library.common;

/* JADX INFO: loaded from: classes.dex */
public class TypeHelper {
    public static boolean isPrimitiveOrPrimitiveWrapperOrString(Class cls) {
        return (cls.isPrimitive() && cls != Void.TYPE) || cls == Double.class || cls == Float.class || cls == Long.class || cls == Integer.class || cls == Short.class || cls == Character.class || cls == Byte.class || cls == Boolean.class || cls == String.class || cls.isEnum();
    }
}
