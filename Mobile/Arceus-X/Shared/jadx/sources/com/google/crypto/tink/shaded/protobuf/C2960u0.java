package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2960u0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f11037a;

    static {
        char[] cArr = new char[80];
        f11037a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m14213a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f11037a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14214b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof AbstractC2920h) {
            return obj.equals(AbstractC2920h.f10853b);
        }
        if (obj instanceof InterfaceC2954s0) {
            return obj == ((InterfaceC2954s0) obj).mo569f();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m14215c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static void m14216d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m14216d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m14216d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m14213a(i10, sb2);
        sb2.append(m14215c(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(C2934l1.m13958c((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2920h) {
            sb2.append(": \"");
            sb2.append(C2934l1.m13956a((AbstractC2920h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2967y) {
            sb2.append(" {");
            m14217e((AbstractC2967y) obj, sb2, i10 + 2);
            sb2.append("\n");
            m14213a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i10 + 2;
        m14216d(sb2, i11, "key", entry.getKey());
        m14216d(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        m14213a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0174, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static void m14217e(InterfaceC2954s0 interfaceC2954s0, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objM14309G;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC2954s0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method4.getReturnType().equals(List.class)) {
                    m14216d(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2967y.m14309G(method4, interfaceC2954s0, new Object[0]));
                }
                i11 = i12;
            }
            if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objM14309G = AbstractC2967y.m14309G(method, interfaceC2954s0, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) AbstractC2967y.m14309G(method2, interfaceC2954s0, new Object[0])).booleanValue();
                                } else if (m14214b(objM14309G)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    m14216d(sb2, i10, strSubstring, objM14309G);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objM14309G = AbstractC2967y.m14309G(method, interfaceC2954s0, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) AbstractC2967y.m14309G(method2, interfaceC2954s0, new Object[0])).booleanValue();
                            } else if (m14214b(objM14309G)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                m14216d(sb2, i10, strSubstring, objM14309G);
                            }
                        }
                    }
                }
            } else {
                m14216d(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2967y.m14309G(method3, interfaceC2954s0, new Object[0]));
            }
            i11 = i12;
        }
        if (interfaceC2954s0 instanceof AbstractC2967y.c) {
            Iterator<Map.Entry<T, Object>> itM14202s = ((AbstractC2967y.c) interfaceC2954s0).extensions.m14202s();
            while (itM14202s.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM14202s.next();
                m14216d(sb2, i10, "[" + ((AbstractC2967y.d) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        C2943o1 c2943o1 = ((AbstractC2967y) interfaceC2954s0).unknownFields;
        if (c2943o1 != null) {
            c2943o1.m14031m(sb2, i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m14218f(InterfaceC2954s0 interfaceC2954s0, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m14217e(interfaceC2954s0, sb2, 0);
        return sb2.toString();
    }
}
