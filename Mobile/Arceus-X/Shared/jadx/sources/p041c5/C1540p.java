package p041c5;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7791r;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c5.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0003*\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\t*\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u0003*\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b*\u0010)\u001a\u0017\u0010+\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b+\u0010)¨\u0006,"}, m31665d2 = {"Lc5/o;", "", "other", "", "f", "(Lc5/o;Ljava/lang/Object;)Z", "", "k", "(Lc5/o;)I", "", "q", "(Lc5/o;)Ljava/lang/String;", "Lc5/o$a;", "c", "(Lc5/o$a;Ljava/lang/Object;)Z", "current", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "(Ljava/lang/String;)Z", "h", "(Lc5/o$a;)I", "n", "(Lc5/o$a;)Ljava/lang/String;", "Lc5/o$c;", "d", "(Lc5/o$c;Ljava/lang/Object;)Z", "i", "(Lc5/o$c;)I", "o", "(Lc5/o$c;)Ljava/lang/String;", "Lc5/o$d;", "e", "(Lc5/o$d;Ljava/lang/Object;)Z", "j", "(Lc5/o$d;)I", "p", "(Lc5/o$d;)Ljava/lang/String;", "", "collection", "g", "(Ljava/util/Collection;)Ljava/lang/String;", "m", "l", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1540p {

    /* JADX INFO: renamed from: c5.p$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(((C1539o.a) t8).name, ((C1539o.a) t10).name);
        }
    }

    /* JADX INFO: renamed from: c5.p$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(((C1539o.d) t8).name, ((C1539o.d) t10).name);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m8114a(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i13 = i12 + 1;
            if (i12 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i11++;
            } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                return false;
            }
            i10++;
            i12 = i13;
        }
        return i11 == 0;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8115b(@NotNull String current, @Nullable String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.m31980c(current, str)) {
            return true;
        }
        if (!m8114a(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Intrinsics.m31980c(StringsKt.m32183p1(strSubstring).toString(), str);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8116c(@NotNull C1539o.a aVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof C1539o.a)) {
            return false;
        }
        C1539o.a aVar2 = (C1539o.a) obj;
        if (aVar.m8112a() != aVar2.m8112a() || !Intrinsics.m31980c(aVar.name, aVar2.name) || aVar.notNull != aVar2.notNull) {
            return false;
        }
        String str = aVar.defaultValue;
        String str2 = aVar2.defaultValue;
        if (aVar.createdFrom == 1 && aVar2.createdFrom == 2 && str != null && !m8115b(str, str2)) {
            return false;
        }
        if (aVar.createdFrom == 2 && aVar2.createdFrom == 1 && str2 != null && !m8115b(str2, str)) {
            return false;
        }
        int i10 = aVar.createdFrom;
        return (i10 == 0 || i10 != aVar2.createdFrom || (str == null ? str2 == null : m8115b(str, str2))) && aVar.affinity == aVar2.affinity;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8117d(@NotNull C1539o.c cVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof C1539o.c)) {
            return false;
        }
        C1539o.c cVar2 = (C1539o.c) obj;
        if (Intrinsics.m31980c(cVar.referenceTable, cVar2.referenceTable) && Intrinsics.m31980c(cVar.onDelete, cVar2.onDelete) && Intrinsics.m31980c(cVar.onUpdate, cVar2.onUpdate) && Intrinsics.m31980c(cVar.columnNames, cVar2.columnNames)) {
            return Intrinsics.m31980c(cVar.referenceColumnNames, cVar2.referenceColumnNames);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8118e(@NotNull C1539o.d dVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof C1539o.d)) {
            return false;
        }
        C1539o.d dVar2 = (C1539o.d) obj;
        if (dVar.unique == dVar2.unique && Intrinsics.m31980c(dVar.columns, dVar2.columns) && Intrinsics.m31980c(dVar.orders, dVar2.orders)) {
            return C7797x.m32309T(dVar.name, "index_", false, 2, null) ? C7797x.m32309T(dVar2.name, "index_", false, 2, null) : Intrinsics.m31980c(dVar.name, dVar2.name);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8119f(@NotNull C1539o c1539o, @Nullable Object obj) {
        Set<C1539o.d> set;
        Intrinsics.checkNotNullParameter(c1539o, "<this>");
        if (c1539o == obj) {
            return true;
        }
        if (!(obj instanceof C1539o)) {
            return false;
        }
        C1539o c1539o2 = (C1539o) obj;
        if (!Intrinsics.m31980c(c1539o.name, c1539o2.name) || !Intrinsics.m31980c(c1539o.columns, c1539o2.columns) || !Intrinsics.m31980c(c1539o.foreignKeys, c1539o2.foreignKeys)) {
            return false;
        }
        Set<C1539o.d> set2 = c1539o.indices;
        if (set2 == null || (set = c1539o2.indices) == null) {
            return true;
        }
        return Intrinsics.m31980c(set2, set);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m8120g(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return C7791r.m32281j(CollectionsKt.m31715m0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    /* JADX INFO: renamed from: h */
    public static final int m8121h(@NotNull C1539o.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return (((((aVar.name.hashCode() * 31) + aVar.affinity) * 31) + (aVar.notNull ? 1231 : 1237)) * 31) + aVar.primaryKeyPosition;
    }

    /* JADX INFO: renamed from: i */
    public static final int m8122i(@NotNull C1539o.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return (((((((cVar.referenceTable.hashCode() * 31) + cVar.onDelete.hashCode()) * 31) + cVar.onUpdate.hashCode()) * 31) + cVar.columnNames.hashCode()) * 31) + cVar.referenceColumnNames.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public static final int m8123j(@NotNull C1539o.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return ((((((C7797x.m32309T(dVar.name, "index_", false, 2, null) ? -1184239155 : dVar.name.hashCode()) * 31) + (dVar.unique ? 1 : 0)) * 31) + dVar.columns.hashCode()) * 31) + dVar.orders.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public static final int m8124k(@NotNull C1539o c1539o) {
        Intrinsics.checkNotNullParameter(c1539o, "<this>");
        return (((c1539o.name.hashCode() * 31) + c1539o.columns.hashCode()) * 31) + c1539o.foreignKeys.hashCode();
    }

    /* JADX INFO: renamed from: l */
    public static final String m8125l(Collection<?> collection) {
        return C7791r.m32281j(CollectionsKt.m31715m0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null) + C7791r.m32281j(" }", null, 1, null);
    }

    /* JADX INFO: renamed from: m */
    public static final String m8126m(Collection<?> collection) {
        return C7791r.m32281j(CollectionsKt.m31715m0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null) + C7791r.m32281j("},", null, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m8127n(@NotNull C1539o.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(aVar.name);
        sb2.append("',\n            |   type = '");
        sb2.append(aVar.type);
        sb2.append("',\n            |   affinity = '");
        sb2.append(aVar.affinity);
        sb2.append("',\n            |   notNull = '");
        sb2.append(aVar.notNull);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(aVar.primaryKeyPosition);
        sb2.append("',\n            |   defaultValue = '");
        String str = aVar.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return C7791r.m32281j(C7791r.m32287p(sb2.toString(), null, 1, null), null, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m8128o(@NotNull C1539o.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return C7791r.m32281j(C7791r.m32287p("\n            |ForeignKey {\n            |   referenceTable = '" + cVar.referenceTable + "',\n            |   onDelete = '" + cVar.onDelete + "',\n            |   onUpdate = '" + cVar.onUpdate + "',\n            |   columnNames = {" + m8126m(CollectionsKt.m31678D0(cVar.columnNames)) + "\n            |   referenceColumnNames = {" + m8125l(CollectionsKt.m31678D0(cVar.referenceColumnNames)) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final String m8129p(@NotNull C1539o.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return C7791r.m32281j(C7791r.m32287p("\n            |Index {\n            |   name = '" + dVar.name + "',\n            |   unique = '" + dVar.unique + "',\n            |   columns = {" + m8126m(dVar.columns) + "\n            |   orders = {" + m8125l(dVar.orders) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final String m8130q(@NotNull C1539o c1539o) {
        List listM31892k;
        Intrinsics.checkNotNullParameter(c1539o, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(c1539o.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(m8120g(CollectionsKt.m31680F0(c1539o.columns.values(), new a())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(m8120g(c1539o.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<C1539o.d> set = c1539o.indices;
        if (set == null || (listM31892k = CollectionsKt.m31680F0(set, new b())) == null) {
            listM31892k = C7699p.m31892k();
        }
        sb2.append(m8120g(listM31892k));
        sb2.append("\n            |}\n        ");
        return C7791r.m32287p(sb2.toString(), null, 1, null);
    }
}
