package p535x4;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7728c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1533i;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p559xt.C12915a;

/* JADX INFO: renamed from: x4.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lx4/f;", "T", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "a", "(Lf5/d;Ljava/lang/Object;)V", "Lf5/b;", "connection", "d", "(Lf5/b;Ljava/lang/Object;)V", "", "entities", "e", "(Lf5/b;[Ljava/lang/Object;)V", "", "c", "(Lf5/b;Ljava/lang/Iterable;)V", "", "f", "(Lf5/b;Ljava/lang/Object;)J", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12660f<T> {
    /* JADX INFO: renamed from: a */
    public abstract void mo15957a(@NotNull InterfaceC5361d statement, T entity);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract String mo15958b();

    /* JADX INFO: renamed from: c */
    public final void m47170c(@NotNull InterfaceC5359b connection, @Nullable Iterable<? extends T> entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3(mo15958b());
        try {
            for (T t8 : entities) {
                if (t8 != null) {
                    mo15957a(interfaceC5361dMo24696r3, t8);
                    interfaceC5361dMo24696r3.mo24704g3();
                    interfaceC5361dMo24696r3.reset();
                }
            }
            Unit unit = Unit.f29331a;
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
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
    public final void m47171d(@NotNull InterfaceC5359b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3(mo15958b());
        try {
            mo15957a(interfaceC5361dMo24696r3, entity);
            interfaceC5361dMo24696r3.mo24704g3();
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: x4.f<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m47172e(@NotNull InterfaceC5359b connection, @Nullable T[] entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3(mo15958b());
        try {
            Iterator itM31999a = C7728c.m31999a(entities);
            while (itM31999a.hasNext()) {
                Object next = itM31999a.next();
                if (next != null) {
                    mo15957a(interfaceC5361dMo24696r3, next);
                    interfaceC5361dMo24696r3.mo24704g3();
                    interfaceC5361dMo24696r3.reset();
                }
            }
            Unit unit = Unit.f29331a;
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
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
    public final long m47173f(@NotNull InterfaceC5359b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return -1L;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3(mo15958b());
        try {
            mo15957a(interfaceC5361dMo24696r3, entity);
            interfaceC5361dMo24696r3.mo24704g3();
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return C1533i.m8095a(connection);
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
