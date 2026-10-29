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
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.C7704r0;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.C7776c0;
import kotlin.text.C7778e;
import kotlin.text.C7797x;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import mt.C8662a;
import np.C9542e;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p229jt.C7352s;
import p560xu.C12924e;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3784a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3784a f15662a = new C3784a();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f15663a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f15664b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f15665c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final String f15666d;

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.f15663a = str;
            this.f15664b = str2;
            this.f15665c = str3;
            this.f15666d = str4;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m18950a() {
            return this.f15665c;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m18951b() {
            return this.f15663a;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m18952c() {
            return this.f15666d;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final String m18953d() {
            return this.f15664b;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.a$b */
    public static final class b<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.String[] */
        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.String[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            Pair pair = (Pair) t8;
            Pair pair2 = (Pair) t10;
            return C8662a.m34743a(CollectionsKt.m31715m0(C7699p.m31895n(pair.m31673c(), pair.m31674d()), null, null, null, 0, null, null, 63, null), CollectionsKt.m31715m0(C7699p.m31895n(pair2.m31673c(), pair2.m31674d()), null, null, null, 0, null, null, 63, null));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Request m18937a(C3784a c3784a, Request request, C9542e c9542e, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        return c3784a.m18944a(request, c9542e, j10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m18946b(RequestBody requestBody) {
        C12924e c12924e = new C12924e();
        requestBody.writeTo(c12924e);
        return StringsKt.m32183p1(c12924e.mo48008R2()).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final JSONArray m18949c(@NotNull RequestBody requestBody) {
        List<Pair<String, Object>> listM18948c = f15662a.m18948c(m18943a(requestBody));
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM18948c, 10));
        Iterator<T> it = listM18948c.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.m31671a();
            String string = pair.m31672b().toString();
            arrayList.add(new Regex("^[+-]?\\d+(\\.\\d+)?$").m32113f(string) ? C7352s.m30477a(str, C7776c0.m32209B1(string, 10)) : C7352s.m30477a(str, new Regex("\\s").replace(string, "")));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((String) ((Pair) obj).m31672b()).length() > 0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(arrayList2, 10)), 16));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linkedHashMap.put((String) ((Pair) obj2).m31673c(), obj2);
        }
        List<Pair> listF0 = CollectionsKt.m31680F0(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Pair pair2 : listF0) {
            String str2 = (String) pair2.m31671a();
            String str3 = (String) pair2.m31672b();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Request m18944a(@NotNull Request request, @NotNull C9542e c9542e, long j10) {
        a aVarM18939a = m18939a(j10, request, c9542e);
        return aVarM18939a != null ? request.newBuilder().addHeader("NHMJLNRS", aVarM18939a.m18953d()).addHeader("STPBWSBB", aVarM18939a.m18951b()).addHeader("DNLGNZLZ", aVarM18939a.m18950a()).addHeader("TLJLGGDG", aVarM18939a.m18952c()).build() : request;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18947b(List<String> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (C7797x.m32309T((String) it.next(), "filename=", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final a m18939a(long j10, Request request, C9542e c9542e) {
        String str = request.headers().get("Authorization");
        RequestBody requestBodyBody = request.body();
        if (str == null || requestBodyBody == null) {
            return null;
        }
        try {
            String str2 = request.headers().get("User-Agent");
            if (str2 != null && !StringsKt.m32182p0(str2)) {
                Map mapM31799n = C7690k0.m31799n(C7352s.m30477a("User-Agent", str2), C7352s.m30477a("VTDGJLGG", request.headers().get("VTDGJLGG")), C7352s.m30477a("Persona-Device-Vendor-Id", request.headers().get("Persona-Device-Vendor-Id")), C7352s.m30477a("Persona-Version", request.headers().get("Persona-Version")), C7352s.m30477a("BMRWJMTB", request.headers().get("BMRWJMTB")));
                mapM31799n.put("TLJLGGDG", CollectionsKt.m31715m0(C7704r0.m31914j(mapM31799n.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62, null));
                Set setKeySet = mapM31799n.keySet();
                Collection collectionValues = mapM31799n.values();
                String str3 = (String) CollectionsKt.m31718p0(StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null));
                if (str3 == null) {
                    c9542e.m37667a("Auth token is null.", null);
                    return null;
                }
                String strOptString = new JSONObject(new String(Base64.decode((String) StringsKt.split$default(str3, new String[]{"."}, false, 0, 6, null).get(1), 0), Charsets.UTF_8)).optString("sub");
                if (strOptString != null && !StringsKt.m32182p0(strOptString)) {
                    String strValueOf = String.valueOf(j10 / ((long) 1000));
                    return new a(m18940a(CollectionsKt.m31715m0(C7699p.m31895n(strOptString, strValueOf, C7797x.m32303N(m18949c(requestBodyBody).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), strValueOf, m18940a(CollectionsKt.m31715m0(C7699p.m31895n(CollectionsKt.m31715m0(collectionValues, "", null, null, 0, null, null, 62, null), strValueOf, C7797x.m32303N(m18949c(requestBodyBody).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), CollectionsKt.m31715m0(setKeySet, ", ", null, null, 0, null, null, 62, null));
                }
                c9542e.m37667a("Session token is null.", null);
                return null;
            }
            c9542e.m37667a("User agent is null.", null);
            return null;
        } catch (Exception e10) {
            c9542e.m37667a("An unexpected error occurred: " + e10.getMessage() + ".", null);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<Pair<String, Object>> m18948c(@NotNull List<? extends Pair<String, ? extends Object>> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (Pair<String, ? extends Object> pair : list) {
                String strM31671a = pair.m31671a();
                Object objM31672b = pair.m31672b();
                List listSplit$default = StringsKt.split$default(strM31671a, new String[]{_UrlKt.PATH_SEGMENT_ENCODE_SET_URI}, false, 2, 2, null);
                if (listSplit$default.size() == 1) {
                    arrayList.add(C7352s.m30477a(strM31671a, objM31672b));
                } else {
                    String str = (String) listSplit$default.get(0);
                    String str2 = (String) listSplit$default.get(1);
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, 0);
                    }
                    if (!linkedHashSet.add(strM31671a) && !StringsKt.m32152a0(str2, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
                        Object obj = linkedHashMap.get(str);
                        if (obj != null) {
                            linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(strM31671a);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(C7352s.m30477a(str + "[" + linkedHashMap.get(str) + "]" + str2, objM31672b));
                    z10 = true;
                }
            }
            if (!z10) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18940a(String str) {
        return C7778e.m32226i(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)), null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final List<Pair<String, Object>> m18943a(RequestBody requestBody) {
        List<String> listM31892k;
        List listM31878d;
        String str;
        List listSplit$default;
        Object obj;
        Object jSONArray;
        MediaType contentType = requestBody.getMediaType();
        if (contentType == null) {
            return C7697o.m31878d(C7352s.m30477a("", m18946b(requestBody)));
        }
        if (Intrinsics.m31980c(contentType.subtype(), "json")) {
            String strM18946b = m18946b(requestBody);
            if (!Intrinsics.m31980c(strM18946b, "{}") && !Intrinsics.m31980c(strM18946b, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI)) {
                if (C7797x.m32309T(strM18946b, "{", false, 2, null)) {
                    obj = strM18946b;
                    obj = strM18946b;
                    jSONArray = new JSONObject(strM18946b);
                } else if (C7797x.m32309T(strM18946b, "[", false, 2, null)) {
                    obj = strM18946b;
                    obj = strM18946b;
                    obj = strM18946b;
                    jSONArray = new JSONArray(strM18946b);
                }
                obj = jSONArray;
            }
            obj = strM18946b;
            obj = strM18946b;
            obj = strM18946b;
            obj = strM18946b;
            obj = strM18946b;
            obj = strM18946b;
            if (obj instanceof String) {
                return C7697o.m31878d(C7352s.m30477a("", obj));
            }
            return m18942a(obj);
        }
        if (Intrinsics.m31980c(contentType.type(), "multipart")) {
            List<MultipartBody.Part> listParts = ((MultipartBody) requestBody).parts();
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : listParts) {
                Headers headers = part.headers();
                if (headers != null && (str = headers.get("Content-Disposition")) != null && (listSplit$default = StringsKt.split$default(str, new String[]{";"}, false, 0, 6, null)) != null) {
                    listM31892k = new ArrayList<>(C7701q.m31905u(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        listM31892k.add(StringsKt.m32183p1((String) it.next()).toString());
                    }
                } else {
                    listM31892k = C7699p.m31892k();
                }
                C3784a c3784a = f15662a;
                String strM18941a = c3784a.m18941a(listM31892k);
                if (strM18941a != null) {
                    if (c3784a.m18947b(listM31892k)) {
                        listM31878d = C7697o.m31878d(C7352s.m30477a(strM18941a, Long.valueOf(part.body().contentLength())));
                    } else {
                        List<Pair<String, Object>> listM18943a = c3784a.m18943a(part.body());
                        if (listM18943a.isEmpty()) {
                            listM31878d = C7699p.m31892k();
                        } else if (listM18943a.size() == 1) {
                            listM31878d = C7697o.m31878d(C7352s.m30477a(strM18941a, listM18943a.get(0).m31674d()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listM18943a + ". Part name: " + strM18941a);
                        }
                    }
                    C7708u.m31931z(arrayList, listM31878d);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return CollectionsKt.m31687M0(arrayList);
        }
        if (Intrinsics.m31980c(contentType.type(), "image")) {
            return C7697o.m31878d(C7352s.m30477a("", Long.valueOf(requestBody.contentLength())));
        }
        throw new RuntimeException("Unsupported type: " + contentType);
    }

    /* JADX INFO: renamed from: a */
    public final List<Pair<String, Object>> m18942a(Object obj) {
        ArrayList arrayList = new ArrayList();
        m18938a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18938a(C3784a c3784a, Object obj, String str, List list, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        c3784a.m18945a(obj, str, (List<Pair<String, Object>>) list);
    }

    /* JADX INFO: renamed from: a */
    public final void m18945a(Object obj, String str, List<Pair<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C3784a c3784a = f15662a;
                Object objOpt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                c3784a.m18945a(objOpt, next, list);
            }
            return;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                str = "";
            }
            list.add(C7352s.m30477a(str, obj));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            m18945a(jSONArray.opt(i10), str == null ? "[" + i10 + "]" : str + "[" + i10 + "]", list);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18941a(List<String> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!C7797x.m32309T((String) next, "name=", false, 2, null));
        String str = (String) next;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }
}
