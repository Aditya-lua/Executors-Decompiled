package p041c5;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p559xt.C12915a;

/* JADX INFO: renamed from: c5.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "room-runtime"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "androidx/room/util/DBUtil")
public final /* synthetic */ class C1526b {
    /* JADX INFO: renamed from: a */
    public static final void m8069a(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List listM31877c = C7697o.m31877c();
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC5361dMo24696r3.mo24704g3()) {
            try {
                listM31877c.add(interfaceC5361dMo24696r3.mo24702E2(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.f29331a;
        C12915a.m47941a(interfaceC5361dMo24696r3, null);
        for (String str : C7697o.m31875a(listM31877c)) {
            if (C7797x.m32309T(str, "room_fts_content_sync_", false, 2, null)) {
                C5358a.m24693a(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
