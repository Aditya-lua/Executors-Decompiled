package c5;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
public final /* synthetic */ class b {
    public static final void a(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List listC = kotlin.collections.o.c();
        f5.d dVarR3 = connection.r3("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (dVarR3.g3()) {
            try {
                listC.add(dVarR3.E2(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    xt.a.a(dVarR3, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.f22483a;
        xt.a.a(dVarR3, null);
        for (String str : kotlin.collections.o.a(listC)) {
            if (x.T(str, "room_fts_content_sync_", false, 2, null)) {
                f5.a.a(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
