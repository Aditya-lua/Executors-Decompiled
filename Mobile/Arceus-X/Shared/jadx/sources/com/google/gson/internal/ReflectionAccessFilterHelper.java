package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC7607w;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectionAccessFilterHelper {

    public static abstract class AccessChecker {
        static final AccessChecker INSTANCE;

        static {
            AccessChecker accessChecker;
            if (JavaVersion.isJava9OrLater()) {
                try {
                    final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                            try {
                                return ((Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (Exception e10) {
                                throw new RuntimeException("Failed invoking canAccess", e10);
                            }
                        }
                    };
                } catch (NoSuchMethodException unused) {
                    accessChecker = null;
                }
            } else {
                accessChecker = null;
            }
            if (accessChecker == null) {
                accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.2
                    @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                    public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                        return true;
                    }
                };
            }
            INSTANCE = accessChecker;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private AccessChecker() {
        }

        public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);
    }

    private ReflectionAccessFilterHelper() {
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
    }

    public static InterfaceC7607w.a getFilterResult(List<InterfaceC7607w> list, Class<?> cls) {
        Iterator<InterfaceC7607w> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC7607w.a aVarM31489a = it.next().m31489a(cls);
            if (aVarM31489a != InterfaceC7607w.a.INDECISIVE) {
                return aVarM31489a;
            }
        }
        return InterfaceC7607w.a.ALLOW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isAndroidType(Class<?> cls) {
        return isAndroidType(cls.getName());
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        return isAndroidType(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isJavaType(Class<?> cls) {
        return isJavaType(cls.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static boolean isAndroidType(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || isJavaType(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static boolean isJavaType(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}
