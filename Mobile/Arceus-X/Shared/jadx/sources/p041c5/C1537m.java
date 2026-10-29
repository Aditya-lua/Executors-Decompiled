package p041c5;

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
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.C7700p0;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p559xt.C12915a;

/* JADX INFO: renamed from: c5.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, m31665d2 = {"", Payload.TYPE, "", "a", "(Ljava/lang/String;)I", "Lf5/b;", "connection", "tableName", "Lc5/o;", "g", "(Lf5/b;Ljava/lang/String;)Lc5/o;", "", "Lc5/o$c;", "d", "(Lf5/b;Ljava/lang/String;)Ljava/util/Set;", "Lf5/d;", "stmt", "", "Lc5/e;", "c", "(Lf5/d;)Ljava/util/List;", "", "Lc5/o$a;", "b", "(Lf5/b;Ljava/lang/String;)Ljava/util/Map;", "Lc5/o$d;", "f", "name", "", "unique", "e", "(Lf5/b;Ljava/lang/String;Z)Lc5/o$d;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1537m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String[] f6198a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: renamed from: c5.m$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a((Integer) ((Map.Entry) t8).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    /* JADX INFO: renamed from: c5.m$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a((Integer) ((Map.Entry) t8).getKey(), (Integer) ((Map.Entry) t10).getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m8104a(@Nullable String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (StringsKt.m32152a0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (StringsKt.m32152a0(upperCase, "CHAR", false, 2, null) || StringsKt.m32152a0(upperCase, "CLOB", false, 2, null) || StringsKt.m32152a0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (StringsKt.m32152a0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (StringsKt.m32152a0(upperCase, "REAL", false, 2, null) || StringsKt.m32152a0(upperCase, "FLOA", false, 2, null) || StringsKt.m32152a0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    /* JADX INFO: renamed from: b */
    public static final Map<String, C1539o.a> m8105b(InterfaceC5359b interfaceC5359b, String str) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = interfaceC5359b.mo24696r3("PRAGMA table_info(`" + str + "`)");
        try {
            if (!interfaceC5361dMo24696r3.mo24704g3()) {
                Map<String, C1539o.a> mapM31795j = C7690k0.m31795j();
                C12915a.m47941a(interfaceC5361dMo24696r3, null);
                return mapM31795j;
            }
            int iM8097a = C1534j.m8097a(interfaceC5361dMo24696r3, "name");
            int iM8097a2 = C1534j.m8097a(interfaceC5361dMo24696r3, Payload.TYPE);
            int iM8097a3 = C1534j.m8097a(interfaceC5361dMo24696r3, "notnull");
            int iM8097a4 = C1534j.m8097a(interfaceC5361dMo24696r3, "pk");
            int iM8097a5 = C1534j.m8097a(interfaceC5361dMo24696r3, "dflt_value");
            Map mapM31788d = C7688j0.m31788d();
            do {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8097a);
                mapM31788d.put(strMo24702E2, new C1539o.a(strMo24702E2, interfaceC5361dMo24696r3.mo24702E2(iM8097a2), interfaceC5361dMo24696r3.getLong(iM8097a3) != 0, (int) interfaceC5361dMo24696r3.getLong(iM8097a4), interfaceC5361dMo24696r3.isNull(iM8097a5) ? null : interfaceC5361dMo24696r3.mo24702E2(iM8097a5), 2));
            } while (interfaceC5361dMo24696r3.mo24704g3());
            Map<String, C1539o.a> mapM31787c = C7688j0.m31787c(mapM31788d);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return mapM31787c;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final List<C1529e> m8106c(InterfaceC5361d interfaceC5361d) {
        int iM8097a = C1534j.m8097a(interfaceC5361d, "id");
        int iM8097a2 = C1534j.m8097a(interfaceC5361d, "seq");
        int iM8097a3 = C1534j.m8097a(interfaceC5361d, "from");
        int iM8097a4 = C1534j.m8097a(interfaceC5361d, "to");
        List listM31877c = C7697o.m31877c();
        while (interfaceC5361d.mo24704g3()) {
            listM31877c.add(new C1529e((int) interfaceC5361d.getLong(iM8097a), (int) interfaceC5361d.getLong(iM8097a2), interfaceC5361d.mo24702E2(iM8097a3), interfaceC5361d.mo24702E2(iM8097a4)));
        }
        return CollectionsKt.m31678D0(C7697o.m31875a(listM31877c));
    }

    /* JADX INFO: renamed from: d */
    public static final Set<C1539o.c> m8107d(InterfaceC5359b interfaceC5359b, String str) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = interfaceC5359b.mo24696r3("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iM8097a = C1534j.m8097a(interfaceC5361dMo24696r3, "id");
            int iM8097a2 = C1534j.m8097a(interfaceC5361dMo24696r3, "seq");
            int iM8097a3 = C1534j.m8097a(interfaceC5361dMo24696r3, "table");
            int iM8097a4 = C1534j.m8097a(interfaceC5361dMo24696r3, "on_delete");
            int iM8097a5 = C1534j.m8097a(interfaceC5361dMo24696r3, "on_update");
            List<C1529e> listM8106c = m8106c(interfaceC5361dMo24696r3);
            interfaceC5361dMo24696r3.reset();
            Set setM31903b = C7700p0.m31903b();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                if (interfaceC5361dMo24696r3.getLong(iM8097a2) == 0) {
                    int i10 = (int) interfaceC5361dMo24696r3.getLong(iM8097a);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : listM8106c) {
                        if (((C1529e) obj).getId() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        C1529e c1529e = (C1529e) obj2;
                        arrayList.add(c1529e.getFrom());
                        arrayList2.add(c1529e.getTo());
                    }
                    setM31903b.add(new C1539o.c(interfaceC5361dMo24696r3.mo24702E2(iM8097a3), interfaceC5361dMo24696r3.mo24702E2(iM8097a4), interfaceC5361dMo24696r3.mo24702E2(iM8097a5), arrayList, arrayList2));
                }
            }
            Set<C1539o.c> setM31902a = C7700p0.m31902a(setM31903b);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return setM31902a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C1539o.d m8108e(InterfaceC5359b interfaceC5359b, String str, boolean z10) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = interfaceC5359b.mo24696r3("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM8097a = C1534j.m8097a(interfaceC5361dMo24696r3, "seqno");
            int iM8097a2 = C1534j.m8097a(interfaceC5361dMo24696r3, "cid");
            int iM8097a3 = C1534j.m8097a(interfaceC5361dMo24696r3, "name");
            int iM8097a4 = C1534j.m8097a(interfaceC5361dMo24696r3, "desc");
            if (iM8097a != -1 && iM8097a2 != -1 && iM8097a3 != -1 && iM8097a4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC5361dMo24696r3.mo24704g3()) {
                    if (((int) interfaceC5361dMo24696r3.getLong(iM8097a2)) >= 0) {
                        int i10 = (int) interfaceC5361dMo24696r3.getLong(iM8097a);
                        String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8097a3);
                        String str2 = interfaceC5361dMo24696r3.getLong(iM8097a4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strMo24702E2);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listF0 = CollectionsKt.m31680F0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(C7701q.m31905u(listF0, 10));
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM0 = CollectionsKt.m31687M0(arrayList);
                List listF1 = CollectionsKt.m31680F0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(C7701q.m31905u(listF1, 10));
                Iterator it2 = listF1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C1539o.d dVar = new C1539o.d(str, z10, listM0, CollectionsKt.m31687M0(arrayList2));
                C12915a.m47941a(interfaceC5361dMo24696r3, null);
                return dVar;
            }
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Set<C1539o.d> m8109f(InterfaceC5359b interfaceC5359b, String str) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = interfaceC5359b.mo24696r3("PRAGMA index_list(`" + str + "`)");
        try {
            int iM8097a = C1534j.m8097a(interfaceC5361dMo24696r3, "name");
            int iM8097a2 = C1534j.m8097a(interfaceC5361dMo24696r3, "origin");
            int iM8097a3 = C1534j.m8097a(interfaceC5361dMo24696r3, "unique");
            if (iM8097a != -1 && iM8097a2 != -1 && iM8097a3 != -1) {
                Set setM31903b = C7700p0.m31903b();
                while (interfaceC5361dMo24696r3.mo24704g3()) {
                    if (Intrinsics.m31980c("c", interfaceC5361dMo24696r3.mo24702E2(iM8097a2))) {
                        C1539o.d dVarM8108e = m8108e(interfaceC5359b, interfaceC5361dMo24696r3.mo24702E2(iM8097a), interfaceC5361dMo24696r3.getLong(iM8097a3) == 1);
                        if (dVarM8108e == null) {
                            C12915a.m47941a(interfaceC5361dMo24696r3, null);
                            return null;
                        }
                        setM31903b.add(dVarM8108e);
                    }
                }
                Set<C1539o.d> setM31902a = C7700p0.m31902a(setM31903b);
                C12915a.m47941a(interfaceC5361dMo24696r3, null);
                return setM31902a;
            }
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C1539o m8110g(@NotNull InterfaceC5359b connection, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new C1539o(tableName, m8105b(connection, tableName), m8107d(connection, tableName), m8109f(connection, tableName));
    }
}
