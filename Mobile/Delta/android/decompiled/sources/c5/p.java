package c5;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0003*\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\t*\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u0003*\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b*\u0010)\u001a\u0017\u0010+\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b+\u0010)¨\u0006,"}, d2 = {"Lc5/o;", "", "other", "", "f", "(Lc5/o;Ljava/lang/Object;)Z", "", "k", "(Lc5/o;)I", "", "q", "(Lc5/o;)Ljava/lang/String;", "Lc5/o$a;", "c", "(Lc5/o$a;Ljava/lang/Object;)Z", "current", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "(Ljava/lang/String;)Z", "h", "(Lc5/o$a;)I", "n", "(Lc5/o$a;)Ljava/lang/String;", "Lc5/o$c;", "d", "(Lc5/o$c;Ljava/lang/Object;)Z", "i", "(Lc5/o$c;)I", "o", "(Lc5/o$c;)Ljava/lang/String;", "Lc5/o$d;", "e", "(Lc5/o$d;Ljava/lang/Object;)Z", "j", "(Lc5/o$d;)I", "p", "(Lc5/o$d;)Ljava/lang/String;", "", "collection", "g", "(Ljava/util/Collection;)Ljava/lang/String;", "m", "l", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a(((o.a) t8).name, ((o.a) t10).name);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a(((o.d) t8).name, ((o.d) t10).name);
        }
    }

    public static final boolean a(String str) {
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

    public static final boolean b(@NotNull String current, @Nullable String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.c(current, str)) {
            return true;
        }
        if (!a(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Intrinsics.c(StringsKt.p1(strSubstring).toString(), str);
    }

    public static final boolean c(@NotNull o.a aVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof o.a)) {
            return false;
        }
        o.a aVar2 = (o.a) obj;
        if (aVar.a() != aVar2.a() || !Intrinsics.c(aVar.name, aVar2.name) || aVar.notNull != aVar2.notNull) {
            return false;
        }
        String str = aVar.defaultValue;
        String str2 = aVar2.defaultValue;
        if (aVar.createdFrom == 1 && aVar2.createdFrom == 2 && str != null && !b(str, str2)) {
            return false;
        }
        if (aVar.createdFrom == 2 && aVar2.createdFrom == 1 && str2 != null && !b(str2, str)) {
            return false;
        }
        int i10 = aVar.createdFrom;
        return (i10 == 0 || i10 != aVar2.createdFrom || (str == null ? str2 == null : b(str, str2))) && aVar.affinity == aVar2.affinity;
    }

    public static final boolean d(@NotNull o.c cVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof o.c)) {
            return false;
        }
        o.c cVar2 = (o.c) obj;
        if (Intrinsics.c(cVar.referenceTable, cVar2.referenceTable) && Intrinsics.c(cVar.onDelete, cVar2.onDelete) && Intrinsics.c(cVar.onUpdate, cVar2.onUpdate) && Intrinsics.c(cVar.columnNames, cVar2.columnNames)) {
            return Intrinsics.c(cVar.referenceColumnNames, cVar2.referenceColumnNames);
        }
        return false;
    }

    public static final boolean e(@NotNull o.d dVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof o.d)) {
            return false;
        }
        o.d dVar2 = (o.d) obj;
        if (dVar.unique == dVar2.unique && Intrinsics.c(dVar.columns, dVar2.columns) && Intrinsics.c(dVar.orders, dVar2.orders)) {
            return x.T(dVar.name, "index_", false, 2, null) ? x.T(dVar2.name, "index_", false, 2, null) : Intrinsics.c(dVar.name, dVar2.name);
        }
        return false;
    }

    public static final boolean f(@NotNull o oVar, @Nullable Object obj) {
        Set<o.d> set;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar2 = (o) obj;
        if (!Intrinsics.c(oVar.name, oVar2.name) || !Intrinsics.c(oVar.columns, oVar2.columns) || !Intrinsics.c(oVar.foreignKeys, oVar2.foreignKeys)) {
            return false;
        }
        Set<o.d> set2 = oVar.indices;
        if (set2 == null || (set = oVar2.indices) == null) {
            return true;
        }
        return Intrinsics.c(set2, set);
    }

    @NotNull
    public static final String g(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return r.j(CollectionsKt.m0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int h(@NotNull o.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return (((((aVar.name.hashCode() * 31) + aVar.affinity) * 31) + (aVar.notNull ? 1231 : 1237)) * 31) + aVar.primaryKeyPosition;
    }

    public static final int i(@NotNull o.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return (((((((cVar.referenceTable.hashCode() * 31) + cVar.onDelete.hashCode()) * 31) + cVar.onUpdate.hashCode()) * 31) + cVar.columnNames.hashCode()) * 31) + cVar.referenceColumnNames.hashCode();
    }

    public static final int j(@NotNull o.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return ((((((x.T(dVar.name, "index_", false, 2, null) ? -1184239155 : dVar.name.hashCode()) * 31) + (dVar.unique ? 1 : 0)) * 31) + dVar.columns.hashCode()) * 31) + dVar.orders.hashCode();
    }

    public static final int k(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return (((oVar.name.hashCode() * 31) + oVar.columns.hashCode()) * 31) + oVar.foreignKeys.hashCode();
    }

    public static final String l(Collection<?> collection) {
        return r.j(CollectionsKt.m0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null) + r.j(" }", null, 1, null);
    }

    public static final String m(Collection<?> collection) {
        return r.j(CollectionsKt.m0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null) + r.j("},", null, 1, null);
    }

    @NotNull
    public static final String n(@NotNull o.a aVar) {
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
        return r.j(r.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    @NotNull
    public static final String o(@NotNull o.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return r.j(r.p("\n            |ForeignKey {\n            |   referenceTable = '" + cVar.referenceTable + "',\n            |   onDelete = '" + cVar.onDelete + "',\n            |   onUpdate = '" + cVar.onUpdate + "',\n            |   columnNames = {" + m(CollectionsKt.D0(cVar.columnNames)) + "\n            |   referenceColumnNames = {" + l(CollectionsKt.D0(cVar.referenceColumnNames)) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    @NotNull
    public static final String p(@NotNull o.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return r.j(r.p("\n            |Index {\n            |   name = '" + dVar.name + "',\n            |   unique = '" + dVar.unique + "',\n            |   columns = {" + m(dVar.columns) + "\n            |   orders = {" + l(dVar.orders) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    @NotNull
    public static final String q(@NotNull o oVar) {
        List listK;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(oVar.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(g(CollectionsKt.F0(oVar.columns.values(), new a())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(g(oVar.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<o.d> set = oVar.indices;
        if (set == null || (listK = CollectionsKt.F0(set, new b())) == null) {
            listK = kotlin.collections.p.k();
        }
        sb2.append(g(listK));
        sb2.append("\n            |}\n        ");
        return r.p(sb2.toString(), null, 1, null);
    }
}
