package c5;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.p0;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"", Payload.TYPE, "", "a", "(Ljava/lang/String;)I", "Lf5/b;", "connection", "tableName", "Lc5/o;", "g", "(Lf5/b;Ljava/lang/String;)Lc5/o;", "", "Lc5/o$c;", "d", "(Lf5/b;Ljava/lang/String;)Ljava/util/Set;", "Lf5/d;", "stmt", "", "Lc5/e;", "c", "(Lf5/d;)Ljava/util/List;", "", "Lc5/o$a;", "b", "(Lf5/b;Ljava/lang/String;)Ljava/util/Map;", "Lc5/o$d;", "f", "name", "", "unique", "e", "(Lf5/b;Ljava/lang/String;Z)Lc5/o$d;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f4614a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a((Integer) ((Map.Entry) t8).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a((Integer) ((Map.Entry) t8).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    public static final int a(@Nullable String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (StringsKt.a0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (StringsKt.a0(upperCase, "CHAR", false, 2, null) || StringsKt.a0(upperCase, "CLOB", false, 2, null) || StringsKt.a0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (StringsKt.a0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (StringsKt.a0(upperCase, "REAL", false, 2, null) || StringsKt.a0(upperCase, "FLOA", false, 2, null) || StringsKt.a0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    public static final Map<String, o.a> b(f5.b bVar, String str) throws Exception {
        f5.d dVarR3 = bVar.r3("PRAGMA table_info(`" + str + "`)");
        try {
            if (!dVarR3.g3()) {
                Map<String, o.a> mapJ = k0.j();
                xt.a.a(dVarR3, null);
                return mapJ;
            }
            int iA = j.a(dVarR3, "name");
            int iA2 = j.a(dVarR3, Payload.TYPE);
            int iA3 = j.a(dVarR3, "notnull");
            int iA4 = j.a(dVarR3, "pk");
            int iA5 = j.a(dVarR3, "dflt_value");
            Map mapD = j0.d();
            do {
                String strE2 = dVarR3.E2(iA);
                mapD.put(strE2, new o.a(strE2, dVarR3.E2(iA2), dVarR3.getLong(iA3) != 0, (int) dVarR3.getLong(iA4), dVarR3.isNull(iA5) ? null : dVarR3.E2(iA5), 2));
            } while (dVarR3.g3());
            Map<String, o.a> mapC = j0.c(mapD);
            xt.a.a(dVarR3, null);
            return mapC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public static final List<e> c(f5.d dVar) {
        int iA = j.a(dVar, "id");
        int iA2 = j.a(dVar, "seq");
        int iA3 = j.a(dVar, "from");
        int iA4 = j.a(dVar, "to");
        List listC = kotlin.collections.o.c();
        while (dVar.g3()) {
            listC.add(new e((int) dVar.getLong(iA), (int) dVar.getLong(iA2), dVar.E2(iA3), dVar.E2(iA4)));
        }
        return CollectionsKt.D0(kotlin.collections.o.a(listC));
    }

    public static final Set<o.c> d(f5.b bVar, String str) throws Exception {
        f5.d dVarR3 = bVar.r3("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iA = j.a(dVarR3, "id");
            int iA2 = j.a(dVarR3, "seq");
            int iA3 = j.a(dVarR3, "table");
            int iA4 = j.a(dVarR3, "on_delete");
            int iA5 = j.a(dVarR3, "on_update");
            List<e> listC = c(dVarR3);
            dVarR3.reset();
            Set setB = p0.b();
            while (dVarR3.g3()) {
                if (dVarR3.getLong(iA2) == 0) {
                    int i10 = (int) dVarR3.getLong(iA);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : listC) {
                        if (((e) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        e eVar = (e) obj2;
                        arrayList.add(eVar.getFrom());
                        arrayList2.add(eVar.getTo());
                    }
                    setB.add(new o.c(dVarR3.E2(iA3), dVarR3.E2(iA4), dVarR3.E2(iA5), arrayList, arrayList2));
                }
            }
            Set<o.c> setA = p0.a(setB);
            xt.a.a(dVarR3, null);
            return setA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public static final o.d e(f5.b bVar, String str, boolean z10) throws Exception {
        f5.d dVarR3 = bVar.r3("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = j.a(dVarR3, "seqno");
            int iA2 = j.a(dVarR3, "cid");
            int iA3 = j.a(dVarR3, "name");
            int iA4 = j.a(dVarR3, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (dVarR3.g3()) {
                    if (((int) dVarR3.getLong(iA2)) >= 0) {
                        int i10 = (int) dVarR3.getLong(iA);
                        String strE2 = dVarR3.E2(iA3);
                        String str2 = dVarR3.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strE2);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listF0 = CollectionsKt.F0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(q.u(listF0, 10));
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM0 = CollectionsKt.M0(arrayList);
                List listF1 = CollectionsKt.F0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(q.u(listF1, 10));
                Iterator it2 = listF1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                o.d dVar = new o.d(str, z10, listM0, CollectionsKt.M0(arrayList2));
                xt.a.a(dVarR3, null);
                return dVar;
            }
            xt.a.a(dVarR3, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public static final Set<o.d> f(f5.b bVar, String str) throws Exception {
        f5.d dVarR3 = bVar.r3("PRAGMA index_list(`" + str + "`)");
        try {
            int iA = j.a(dVarR3, "name");
            int iA2 = j.a(dVarR3, "origin");
            int iA3 = j.a(dVarR3, "unique");
            if (iA != -1 && iA2 != -1 && iA3 != -1) {
                Set setB = p0.b();
                while (dVarR3.g3()) {
                    if (Intrinsics.c("c", dVarR3.E2(iA2))) {
                        o.d dVarE = e(bVar, dVarR3.E2(iA), dVarR3.getLong(iA3) == 1);
                        if (dVarE == null) {
                            xt.a.a(dVarR3, null);
                            return null;
                        }
                        setB.add(dVarE);
                    }
                }
                Set<o.d> setA = p0.a(setB);
                xt.a.a(dVarR3, null);
                return setA;
            }
            xt.a.a(dVarR3, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final o g(@NotNull f5.b connection, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new o(tableName, b(connection, tableName), d(connection, tableName), f(connection, tableName));
    }
}
