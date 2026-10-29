package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.qc */
/* JADX INFO: loaded from: classes.dex */
public final class C2268qc {

    /* JADX INFO: renamed from: a */
    public static final char[] f8597a;

    static {
        char[] cArr = new char[80];
        f8597a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m10580a(InterfaceC2232oc interfaceC2232oc, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m10582c(interfaceC2232oc, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m10581b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m10581b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m10581b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m10583d(i10, sb2);
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
        if (obj instanceof String) {
            sb2.append(": \"");
            AbstractC2104ha abstractC2104ha = AbstractC2104ha.f8218b;
            sb2.append(C2143jd.m10304a(new C2085ga(((String) obj).getBytes(C2267qb.f8595a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2104ha) {
            sb2.append(": \"");
            sb2.append(C2143jd.m10304a((AbstractC2104ha) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2086gb) {
            sb2.append(" {");
            m10582c((AbstractC2086gb) obj, sb2, i10 + 2);
            sb2.append("\n");
            m10583d(i10, sb2);
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
        m10581b(sb2, i12, "key", entry.getKey());
        m10581b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        m10583d(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX INFO: renamed from: c */
    public static void m10582c(InterfaceC2232oc interfaceC2232oc, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC2232oc.getClass().getDeclaredMethods();
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
                m10581b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2086gb.m10059w(method2, interfaceC2232oc, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m10581b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2086gb.m10059w(method, interfaceC2232oc, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM10059w = AbstractC2086gb.m10059w(method4, interfaceC2232oc, new Object[0]);
                    if (method5 == null) {
                        if (objM10059w instanceof Boolean) {
                            if (((Boolean) objM10059w).booleanValue()) {
                                m10581b(sb2, i10, strSubstring, objM10059w);
                            }
                        } else if (objM10059w instanceof Integer) {
                            if (((Integer) objM10059w).intValue() != 0) {
                                m10581b(sb2, i10, strSubstring, objM10059w);
                            }
                        } else if (objM10059w instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM10059w).floatValue()) != 0) {
                                m10581b(sb2, i10, strSubstring, objM10059w);
                            }
                        } else if (!(objM10059w instanceof Double)) {
                            if (objM10059w instanceof String) {
                                zEquals = objM10059w.equals("");
                            } else if (objM10059w instanceof AbstractC2104ha) {
                                zEquals = objM10059w.equals(AbstractC2104ha.f8218b);
                            } else if (objM10059w instanceof InterfaceC2232oc) {
                                if (objM10059w != ((InterfaceC2232oc) objM10059w).mo10067h()) {
                                    m10581b(sb2, i10, strSubstring, objM10059w);
                                }
                            } else if (!(objM10059w instanceof Enum) || ((Enum) objM10059w).ordinal() != 0) {
                                m10581b(sb2, i10, strSubstring, objM10059w);
                            }
                            if (!zEquals) {
                                m10581b(sb2, i10, strSubstring, objM10059w);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM10059w).doubleValue()) != 0) {
                            m10581b(sb2, i10, strSubstring, objM10059w);
                        }
                    } else if (((Boolean) AbstractC2086gb.m10059w(method5, interfaceC2232oc, new Object[0])).booleanValue()) {
                        m10581b(sb2, i10, strSubstring, objM10059w);
                    }
                }
            }
            i11 = 3;
        }
        if (interfaceC2232oc instanceof AbstractC2029db) {
            Iterator itM10947c = ((AbstractC2029db) interfaceC2232oc).zzb.m10947c();
            if (itM10947c.hasNext()) {
                throw null;
            }
        }
        C2197md c2197md = ((AbstractC2086gb) interfaceC2232oc).zzc;
        if (c2197md != null) {
            c2197md.m10398j(sb2, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10583d(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f8597a, 0, i11);
            i10 -= i11;
        }
    }
}
