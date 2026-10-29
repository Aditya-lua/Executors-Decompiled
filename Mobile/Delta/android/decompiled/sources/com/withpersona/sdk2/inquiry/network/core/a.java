package com.withpersona.sdk2.inquiry.network.core;

import android.util.Base64;
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
import jt.s;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.r0;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c0;
import kotlin.text.x;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f12167a = new a();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.a$a, reason: collision with other inner class name */
    public static final class C0223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f12168a;

        @NotNull
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f12169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f12170d;

        public C0223a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.f12168a = str;
            this.b = str2;
            this.f12169c = str3;
            this.f12170d = str4;
        }

        @NotNull
        public final String a() {
            return this.f12169c;
        }

        @NotNull
        public final String b() {
            return this.f12168a;
        }

        @NotNull
        public final String c() {
            return this.f12170d;
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
            return mt.a.a(CollectionsKt.m0(p.n(pair.c(), pair.d()), null, null, null, 0, null, null, 63, null), CollectionsKt.m0(p.n(pair2.c(), pair2.d()), null, null, null, 0, null, null, 63, null));
        }
    }

    public static /* synthetic */ Request a(a aVar, Request request, np.e eVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        return aVar.a(request, eVar, j10);
    }

    public final String b(RequestBody requestBody) {
        xu.e eVar = new xu.e();
        requestBody.writeTo(eVar);
        return StringsKt.p1(eVar.R2()).toString();
    }

    @NotNull
    public final JSONArray c(@NotNull RequestBody requestBody) {
        List<Pair<String, Object>> listC = f12167a.c(a(requestBody));
        ArrayList arrayList = new ArrayList(q.u(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            String string = pair.b().toString();
            arrayList.add(new Regex("^[+-]?\\d+(\\.\\d+)?$").f(string) ? s.a(str, c0.B1(string, 10)) : s.a(str, new Regex("\\s").replace(string, "")));
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
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(arrayList2, 10)), 16));
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
    public final Request a(@NotNull Request request, @NotNull np.e eVar, long j10) {
        C0223a c0223aA = a(j10, request, eVar);
        return c0223aA != null ? request.newBuilder().addHeader("NHMJLNRS", c0223aA.d()).addHeader("STPBWSBB", c0223aA.b()).addHeader("DNLGNZLZ", c0223aA.a()).addHeader("TLJLGGDG", c0223aA.c()).build() : request;
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

    public final C0223a a(long j10, Request request, np.e eVar) {
        String str = request.headers().get("Authorization");
        RequestBody requestBodyBody = request.body();
        if (str == null || requestBodyBody == null) {
            return null;
        }
        try {
            String str2 = request.headers().get("User-Agent");
            if (str2 != null && !StringsKt.p0(str2)) {
                Map mapN = k0.n(s.a("User-Agent", str2), s.a("VTDGJLGG", request.headers().get("VTDGJLGG")), s.a("Persona-Device-Vendor-Id", request.headers().get("Persona-Device-Vendor-Id")), s.a("Persona-Version", request.headers().get("Persona-Version")), s.a("BMRWJMTB", request.headers().get("BMRWJMTB")));
                mapN.put("TLJLGGDG", CollectionsKt.m0(r0.j(mapN.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62, null));
                Set setKeySet = mapN.keySet();
                Collection collectionValues = mapN.values();
                String str3 = (String) CollectionsKt.p0(StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null));
                if (str3 == null) {
                    eVar.a("Auth token is null.", null);
                    return null;
                }
                String strOptString = new JSONObject(new String(Base64.decode((String) StringsKt.split$default(str3, new String[]{"."}, false, 0, 6, null).get(1), 0), Charsets.UTF_8)).optString("sub");
                if (strOptString != null && !StringsKt.p0(strOptString)) {
                    String strValueOf = String.valueOf(j10 / ((long) 1000));
                    return new C0223a(a(CollectionsKt.m0(p.n(strOptString, strValueOf, x.N(c(requestBodyBody).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), strValueOf, a(CollectionsKt.m0(p.n(CollectionsKt.m0(collectionValues, "", null, null, 0, null, null, 62, null), strValueOf, x.N(c(requestBodyBody).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), CollectionsKt.m0(setKeySet, ", ", null, null, 0, null, null, 62, null));
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
                List listSplit$default = StringsKt.split$default(strA, new String[]{_UrlKt.PATH_SEGMENT_ENCODE_SET_URI}, false, 2, 2, null);
                if (listSplit$default.size() == 1) {
                    arrayList.add(s.a(strA, objB));
                } else {
                    String str = (String) listSplit$default.get(0);
                    String str2 = (String) listSplit$default.get(1);
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, 0);
                    }
                    if (!linkedHashSet.add(strA) && !StringsKt.a0(str2, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
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
        return kotlin.text.e.i(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)), null, 1, null);
    }

    public final List<Pair<String, Object>> a(RequestBody requestBody) {
        List<String> listK;
        List listD;
        String str;
        List listSplit$default;
        Object obj;
        Object jSONArray;
        MediaType contentType = requestBody.getMediaType();
        if (contentType == null) {
            return o.d(s.a("", b(requestBody)));
        }
        if (Intrinsics.c(contentType.subtype(), "json")) {
            String strB = b(requestBody);
            if (!Intrinsics.c(strB, "{}") && !Intrinsics.c(strB, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI)) {
                if (x.T(strB, "{", false, 2, null)) {
                    obj = strB;
                    obj = strB;
                    jSONArray = new JSONObject(strB);
                } else if (x.T(strB, "[", false, 2, null)) {
                    obj = strB;
                    obj = strB;
                    obj = strB;
                    jSONArray = new JSONArray(strB);
                }
                obj = jSONArray;
            }
            obj = strB;
            obj = strB;
            obj = strB;
            obj = strB;
            obj = strB;
            obj = strB;
            if (obj instanceof String) {
                return o.d(s.a("", obj));
            }
            return a(obj);
        }
        if (Intrinsics.c(contentType.type(), "multipart")) {
            List<MultipartBody.Part> listParts = ((MultipartBody) requestBody).parts();
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : listParts) {
                Headers headers = part.headers();
                if (headers != null && (str = headers.get("Content-Disposition")) != null && (listSplit$default = StringsKt.split$default(str, new String[]{";"}, false, 0, 6, null)) != null) {
                    listK = new ArrayList<>(q.u(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        listK.add(StringsKt.p1((String) it.next()).toString());
                    }
                } else {
                    listK = p.k();
                }
                a aVar = f12167a;
                String strA = aVar.a(listK);
                if (strA != null) {
                    if (aVar.b(listK)) {
                        listD = o.d(s.a(strA, Long.valueOf(part.body().contentLength())));
                    } else {
                        List<Pair<String, Object>> listA = aVar.a(part.body());
                        if (listA.isEmpty()) {
                            listD = p.k();
                        } else if (listA.size() == 1) {
                            listD = o.d(s.a(strA, listA.get(0).d()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listA + ". Part name: " + strA);
                        }
                    }
                    u.z(arrayList, listD);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return CollectionsKt.M0(arrayList);
        }
        if (Intrinsics.c(contentType.type(), "image")) {
            return o.d(s.a("", Long.valueOf(requestBody.contentLength())));
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
                a aVar = f12167a;
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
                str = "";
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
