package p041c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p119f5.InterfaceC5361d;

/* JADX INFO: renamed from: c5.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31665d2 = {"Lf5/d;", "", "name", "", "a", "(Lf5/d;Ljava/lang/String;)I", "b", "room-runtime"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "androidx/room/util/SQLiteStatementUtil")
public final /* synthetic */ class C1536l {
    /* JADX INFO: renamed from: a */
    public static final int m8102a(@NotNull InterfaceC5361d interfaceC5361d, @NotNull String name) {
        Intrinsics.checkNotNullParameter(interfaceC5361d, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int iM8098b = C1534j.m8098b(interfaceC5361d, name);
        if (iM8098b >= 0) {
            return iM8098b;
        }
        int iM8098b2 = C1534j.m8098b(interfaceC5361d, '`' + name + '`');
        return iM8098b2 >= 0 ? iM8098b2 : m8103b(interfaceC5361d, name);
    }

    /* JADX INFO: renamed from: b */
    public static final int m8103b(InterfaceC5361d interfaceC5361d, String str) {
        return -1;
    }
}
