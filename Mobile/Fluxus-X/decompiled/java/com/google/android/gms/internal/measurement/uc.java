package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6870a;

    static {
        char[] cArr = new char[80];
        f6870a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(sc scVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(scVar, sb2, 0);
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        d(i10, sb2);
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
            la laVar = la.b;
            sb2.append(nd.a(new ka(((String) obj).getBytes(ub.f6869a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof la) {
            sb2.append(": \"");
            sb2.append(nd.a((la) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof kb) {
            sb2.append(" {");
            c((kb) obj, sb2, i10 + 2);
            sb2.append("\n");
            d(i10, sb2);
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
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        d(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    public static void c(sc scVar, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = scVar.getClass().getDeclaredMethods();
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
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), kb.v(method2, scVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), kb.v(method, scVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objV = kb.v(method4, scVar, new Object[0]);
                    if (method5 == null) {
                        if (objV instanceof Boolean) {
                            if (((Boolean) objV).booleanValue()) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (objV instanceof Integer) {
                            if (((Integer) objV).intValue() != 0) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (objV instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objV).floatValue()) != 0) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (!(objV instanceof Double)) {
                            if (objV instanceof String) {
                                zEquals = objV.equals(BuildConfig.FLAVOR);
                            } else if (objV instanceof la) {
                                zEquals = objV.equals(la.b);
                            } else if (objV instanceof sc) {
                                if (objV != ((sc) objV).i()) {
                                    b(sb2, i10, strSubstring, objV);
                                }
                            } else if (!(objV instanceof Enum) || ((Enum) objV).ordinal() != 0) {
                                b(sb2, i10, strSubstring, objV);
                            }
                            if (!zEquals) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objV).doubleValue()) != 0) {
                            b(sb2, i10, strSubstring, objV);
                        }
                    } else if (((Boolean) kb.v(method5, scVar, new Object[0])).booleanValue()) {
                        b(sb2, i10, strSubstring, objV);
                    }
                }
            }
            i11 = 3;
        }
        if (scVar instanceof hb) {
            Iterator itC = ((hb) scVar).zzb.c();
            if (itC.hasNext()) {
                throw null;
            }
        }
        qd qdVar = ((kb) scVar).zzc;
        if (qdVar != null) {
            qdVar.j(sb2, i10);
        }
    }

    public static void d(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f6870a, 0, i11);
            i10 -= i11;
        }
    }
}
