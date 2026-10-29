package p041c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p559xt.C12915a;

/* JADX INFO: renamed from: c5.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lf5/b;", "connection", "", "a", "(Lf5/b;)J", "", "b", "(Lf5/b;)I", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1533i {
    /* JADX INFO: renamed from: a */
    public static final long m8095a(@NotNull InterfaceC5359b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (m8096b(connection) == 0) {
            return -1L;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT last_insert_rowid()");
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            long j10 = interfaceC5361dMo24696r3.getLong(0);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return j10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m8096b(@NotNull InterfaceC5359b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT changes()");
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            int i10 = (int) interfaceC5361dMo24696r3.getLong(0);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }
}
