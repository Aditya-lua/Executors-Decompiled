package com.withpersona.sdk2.inquiry.network.core;

import android.util.Base64;
import com.github.luben.zstd.BuildConfig;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mv.b0;
import mv.f0;
import mv.g0;
import mv.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p001kotlin.Pair;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.j0;
import p001kotlin.collections.k0;
import p001kotlin.collections.o;
import p001kotlin.collections.p;
import p001kotlin.collections.q;
import p001kotlin.collections.r0;
import p001kotlin.collections.u;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;
import p001kotlin.text.c0;
import p001kotlin.text.x;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f10944a = new a();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.a$a, reason: collision with other inner class name */
    public static final class C0191a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f10945a;

        @NotNull
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f10946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f10947d;

        public C0191a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.f10945a = str;
            this.b = str2;
            this.f10946c = str3;
            this.f10947d = str4;
        }

        @NotNull
        public final String a() {
            return this.f10946c;
        }

        @NotNull
        public final String b() {
            return this.f10945a;
        }

        @NotNull
        public final String c() {
            return this.f10947d;
        }

        @NotNull
        public final String d() {
            return this.b;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            Pair pair = (Pair) t8;
            Pair pair2 = (Pair) t10;
            return cu.a.a(CollectionsKt.m0(p.n(pair.c(), pair.d()), null, null, null, 0, null, null, 63, null), CollectionsKt.m0(p.n(pair2.c(), pair2.d()), null, null, null, 0, null, null, 63, null));
        }
    }

    public static /* synthetic */ f0 a(a aVar, f0 f0Var, bq.e eVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        return aVar.a(f0Var, eVar, j10);
    }

    public final String b(g0 g0Var) {
        ew.e eVar = new ew.e();
        g0Var.h(eVar);
        return StringsKt.n1(eVar.V2()).toString();
    }

    @NotNull
    public final JSONArray c(@NotNull g0 g0Var) {
        List<Pair<String, Object>> listC = f10944a.c(a(g0Var));
        ArrayList arrayList = new ArrayList(q.u(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            String string = pair.b().toString();
            arrayList.add(new Regex("^[+-]?\\d+(\\.\\d+)?$").f(string) ? s.a(str, c0.z1(string, 10)) : s.a(str, new Regex("\\s").replace(string, BuildConfig.FLAVOR)));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((String) ((Pair) obj).b()).length() > 0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(j0.f(q.u(arrayList2, 10)), 16));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linkedHashMap.put((String) ((Pair) obj2).c(), obj2);
        }
        List<Pair> listF0 = CollectionsKt.F0(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Pair pair2 : listF0) {
            String str2 = (String) pair2.a();
            String str3 = (String) pair2.b();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    @NotNull
    public final f0 a(@NotNull f0 f0Var, @NotNull bq.e eVar, long j10) {
        C0191a c0191aA = a(j10, f0Var, eVar);
        return c0191aA != null ? f0Var.j().a("NHMJLNRS", c0191aA.d()).a("STPBWSBB", c0191aA.b()).a("DNLGNZLZ", c0191aA.a()).a("TLJLGGDG", c0191aA.c()).b() : f0Var;
    }

    public final boolean b(List<String> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (x.T((String) it.next(), "filename=", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final C0191a a(long j10, f0 f0Var, bq.e eVar) {
        String strA = f0Var.getHeaders().a("Authorization");
        g0 body = f0Var.getBody();
        if (strA == null || body == null) {
            return null;
        }
        try {
            String strA2 = f0Var.getHeaders().a("User-Agent");
            if (strA2 != null && !StringsKt.p0(strA2)) {
                Map mapO = k0.o(s.a("User-Agent", strA2), s.a("VTDGJLGG", f0Var.getHeaders().a("VTDGJLGG")), s.a("Persona-Device-Vendor-Id", f0Var.getHeaders().a("Persona-Device-Vendor-Id")), s.a("Persona-Version", f0Var.getHeaders().a("Persona-Version")), s.a("BMRWJMTB", f0Var.getHeaders().a("BMRWJMTB")));
                mapO.put("TLJLGGDG", CollectionsKt.m0(r0.j(mapO.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62, null));
                Set setKeySet = mapO.keySet();
                Collection collectionValues = mapO.values();
                String str = (String) CollectionsKt.p0(StringsKt.split$default(strA, new String[]{" "}, false, 0, 6, null));
                if (str == null) {
                    eVar.a("Auth token is null.", null);
                    return null;
                }
                String strOptString = new JSONObject(new String(Base64.decode((String) StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null).get(1), 0), Charsets.UTF_8)).optString("sub");
                if (strOptString != null && !StringsKt.p0(strOptString)) {
                    String strValueOf = String.valueOf(j10 / ((long) 1000));
                    return new C0191a(a(CollectionsKt.m0(p.n(strOptString, strValueOf, x.N(c(body).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), strValueOf, a(CollectionsKt.m0(p.n(CollectionsKt.m0(collectionValues, BuildConfig.FLAVOR, null, null, 0, null, null, 62, null), strValueOf, x.N(c(body).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), CollectionsKt.m0(setKeySet, ", ", null, null, 0, null, null, 62, null));
                }
                eVar.a("Session token is null.", null);
                return null;
            }
            eVar.a("User agent is null.", null);
            return null;
        } catch (Exception e10) {
            eVar.a("An unexpected error occurred: " + e10.getMessage() + ".", null);
            return null;
        }
    }

    @NotNull
    public final List<Pair<String, Object>> c(@NotNull List<? extends Pair<String, ? extends Object>> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (Pair<String, ? extends Object> pair : list) {
                String strA = pair.a();
                Object objB = pair.b();
                List listSplit$default = StringsKt.split$default(strA, new String[]{"[]"}, false, 2, 2, null);
                if (listSplit$default.size() == 1) {
                    arrayList.add(s.a(strA, objB));
                } else {
                    String str = (String) listSplit$default.get(0);
                    String str2 = (String) listSplit$default.get(1);
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, 0);
                    }
                    if (!linkedHashSet.add(strA) && !StringsKt.a0(str2, "[]", false, 2, null)) {
                        Object obj = linkedHashMap.get(str);
                        if (obj != null) {
                            linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(strA);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(s.a(str + "[" + linkedHashMap.get(str) + "]" + str2, objB));
                    z10 = true;
                }
            }
            if (!z10) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    public final String a(String str) {
        return p001kotlin.text.e.i(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)), null, 1, null);
    }

    public final List<Pair<String, Object>> a(g0 g0Var) {
        List<String> listK;
        List listD;
        String strA;
        List listSplit$default;
        Object jSONArray;
        b0 contentType = g0Var.getMediaType();
        if (contentType == null) {
            return o.d(s.a(BuildConfig.FLAVOR, b(g0Var)));
        }
        if (Intrinsics.c(contentType.getSubtype(), "json")) {
            String strB = b(g0Var);
            boolean zC = Intrinsics.c(strB, "{}");
            Object obj = strB;
            if (!zC) {
                boolean zC2 = Intrinsics.c(strB, "[]");
                obj = strB;
                if (!zC2) {
                    if (x.T(strB, "{", false, 2, null)) {
                        jSONArray = new JSONObject(strB);
                    } else {
                        boolean zT = x.T(strB, "[", false, 2, null);
                        obj = strB;
                        if (zT) {
                            jSONArray = new JSONArray(strB);
                        }
                    }
                    obj = jSONArray;
                }
            }
            if (obj instanceof String) {
                return o.d(s.a(BuildConfig.FLAVOR, obj));
            }
            return a(obj);
        }
        if (Intrinsics.c(contentType.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), "multipart")) {
            List<mv.c0.c> listJ = ((mv.c0) g0Var).j();
            ArrayList arrayList = new ArrayList();
            for (mv.c0.c cVar : listJ) {
                y headers = cVar.getHeaders();
                if (headers != null && (strA = headers.a("Content-Disposition")) != null && (listSplit$default = StringsKt.split$default(strA, new String[]{";"}, false, 0, 6, null)) != null) {
                    listK = new ArrayList<>(q.u(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        listK.add(StringsKt.n1((String) it.next()).toString());
                    }
                } else {
                    listK = p.k();
                }
                a aVar = f10944a;
                String strA2 = aVar.a(listK);
                if (strA2 != null) {
                    if (aVar.b(listK)) {
                        listD = o.d(s.a(strA2, Long.valueOf(cVar.getBody().a())));
                    } else {
                        List<Pair<String, Object>> listA = aVar.a(cVar.getBody());
                        if (listA.isEmpty()) {
                            listD = p.k();
                        } else if (listA.size() == 1) {
                            listD = o.d(s.a(strA2, listA.get(0).d()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listA + ". Part name: " + strA2);
                        }
                    }
                    u.z(arrayList, listD);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return CollectionsKt.M0(arrayList);
        }
        if (Intrinsics.c(contentType.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), "image")) {
            return o.d(s.a(BuildConfig.FLAVOR, Long.valueOf(g0Var.a())));
        }
        throw new RuntimeException("Unsupported type: " + contentType);
    }

    public final List<Pair<String, Object>> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    public static /* synthetic */ void a(a aVar, Object obj, String str, List list, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        aVar.a(obj, str, (List<Pair<String, Object>>) list);
    }

    public final void a(Object obj, String str, List<Pair<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = f10944a;
                Object objOpt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                aVar.a(objOpt, next, list);
            }
            return;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            list.add(s.a(str, obj));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            a(jSONArray.opt(i10), str == null ? "[" + i10 + "]" : str + "[" + i10 + "]", list);
        }
    }

    public final String a(List<String> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!x.T((String) next, "name=", false, 2, null));
        String str = (String) next;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }
}
