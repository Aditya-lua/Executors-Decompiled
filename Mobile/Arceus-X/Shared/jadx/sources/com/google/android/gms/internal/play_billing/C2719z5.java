package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2719z5 {

    /* JADX INFO: renamed from: a */
    public static final char[] f9433a;

    static {
        char[] cArr = new char[80];
        f9433a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m11859a(InterfaceC2697x5 interfaceC2697x5, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m11862d(interfaceC2697x5, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m11860b(StringBuilder sb2, int i10, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m11860b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m11860b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m11861c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC2640s3) {
                sb2.append(": \"");
                sb2.append(C2632r6.m11704a(((AbstractC2640s3) obj).m11721m()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof AbstractC2652t4) {
                sb2.append(" {");
                m11862d((AbstractC2652t4) obj, sb2, i10 + 2);
                sb2.append("\n");
                m11861c(i10, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i12 = i10 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            m11860b(sb2, i12, "key", entry.getKey());
            m11860b(sb2, i12, "value", entry.getValue());
            sb2.append("\n");
            m11861c(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < strReplace2.length(); i13++) {
            char cCharAt2 = strReplace2.charAt(i13);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = C2632r6.m11704a(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb2.append(strReplace);
                sb2.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z12 = true;
                } else if (cCharAt2 == '\'') {
                    z11 = true;
                } else if (cCharAt2 == '\\') {
                    z10 = true;
                }
            }
        }
        if (z10) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z11 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z12) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    /* JADX INFO: renamed from: c */
    public static void m11861c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f9433a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX INFO: renamed from: d */
    public static void m11862d(InterfaceC2697x5 interfaceC2697x5, StringBuilder sb2, int i10) {
        int i11;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC2697x5.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m11860b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2652t4.m11746y(method2, interfaceC2697x5, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m11860b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2652t4.m11746y(method, interfaceC2697x5, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM11746y = AbstractC2652t4.m11746y(method4, interfaceC2697x5, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) AbstractC2652t4.m11746y(method5, interfaceC2697x5, new Object[0])).booleanValue();
                    } else if (objM11746y instanceof Boolean) {
                        if (((Boolean) objM11746y).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM11746y instanceof Integer) {
                        if (((Integer) objM11746y).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM11746y instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM11746y).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM11746y instanceof Double)) {
                        if (objM11746y instanceof String) {
                            zEquals = objM11746y.equals("");
                        } else if (objM11746y instanceof AbstractC2640s3) {
                            zEquals = objM11746y.equals(AbstractC2640s3.f9227b);
                        } else if (!(objM11746y instanceof InterfaceC2697x5) ? !((objM11746y instanceof Enum) && ((Enum) objM11746y).ordinal() == 0) : objM11746y != ((InterfaceC2697x5) objM11746y).mo11750f()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM11746y).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m11860b(sb2, i10, strSubstring, objM11746y);
                    }
                }
            }
            i11 = 3;
        }
        if (interfaceC2697x5 instanceof AbstractC2619q4) {
            Iterator itM11526f = ((AbstractC2619q4) interfaceC2697x5).zzb.m11526f();
            if (itM11526f.hasNext()) {
                throw null;
            }
        }
        C2665u6 c2665u6 = ((AbstractC2652t4) interfaceC2697x5).zzc;
        if (c2665u6 != null) {
            c2665u6.m11784i(sb2, i10);
        }
    }
}
