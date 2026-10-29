package p535x4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1533i;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p559xt.C12915a;

/* JADX INFO: renamed from: x4.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lx4/e;", "T", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "a", "(Lf5/d;Ljava/lang/Object;)V", "Lf5/b;", "connection", "", "c", "(Lf5/b;Ljava/lang/Object;)I", "", "entities", "d", "(Lf5/b;Ljava/lang/Iterable;)I", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12658e<T> {
    /* JADX INFO: renamed from: a */
    public abstract void mo24867a(@NotNull InterfaceC5361d statement, T entity);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract String mo24868b();

    /* JADX INFO: renamed from: c */
    public final int m47165c(@NotNull InterfaceC5359b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return 0;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3(mo24868b());
        try {
            mo24867a(interfaceC5361dMo24696r3, entity);
            interfaceC5361dMo24696r3.mo24704g3();
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return C1533i.m8096b(connection);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m47166d(@NotNull InterfaceC5359b connection, @Nullable Iterable<? extends T> entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        int iM8096b = 0;
        if (entities == null) {
            return 0;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3(mo24868b());
        try {
            for (T t8 : entities) {
                if (t8 != null) {
                    mo24867a(interfaceC5361dMo24696r3, t8);
                    interfaceC5361dMo24696r3.mo24704g3();
                    interfaceC5361dMo24696r3.reset();
                    iM8096b += C1533i.m8096b(connection);
                }
            }
            Unit unit = Unit.f29331a;
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return iM8096b;
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
