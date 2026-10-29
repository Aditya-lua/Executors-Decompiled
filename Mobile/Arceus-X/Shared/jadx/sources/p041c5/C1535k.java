package p041c5;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p119f5.InterfaceC5361d;

/* JADX INFO: renamed from: c5.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"Lf5/d;", "stmt", "", "name", "", "b", "(Lf5/d;Ljava/lang/String;)I", "a", "room-runtime"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "androidx/room/util/SQLiteStatementUtil")
public final /* synthetic */ class C1535k {
    /* JADX INFO: renamed from: a */
    public static final int m8100a(@NotNull InterfaceC5361d interfaceC5361d, @NotNull String name) {
        Intrinsics.checkNotNullParameter(interfaceC5361d, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (interfaceC5361d instanceof C1531g) {
            return ((C1531g) interfaceC5361d).getColumnIndex(name);
        }
        int columnCount = interfaceC5361d.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (Intrinsics.m31980c(name, interfaceC5361d.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m8101b(@NotNull InterfaceC5361d stmt, @NotNull String name) {
        Intrinsics.checkNotNullParameter(stmt, "stmt");
        Intrinsics.checkNotNullParameter(name, "name");
        int iM8097a = C1534j.m8097a(stmt, name);
        if (iM8097a >= 0) {
            return iM8097a;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + CollectionsKt.m31715m0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }
}
