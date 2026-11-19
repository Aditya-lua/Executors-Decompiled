package d5;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg5/d;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "a", "(Lg5/d;Ljava/lang/String;)I", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
public final /* synthetic */ class l {
    public static final int a(@NotNull g5.d dVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int iB = j.b(dVar, name);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = j.b(dVar, '`' + name + '`');
        return iB2 >= 0 ? iB2 : b(dVar, name);
    }

    public static final int b(g5.d dVar, String str) {
        return -1;
    }
}
