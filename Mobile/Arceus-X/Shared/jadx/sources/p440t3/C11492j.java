package p440t3;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7864g1;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p457u3.C11788a;
import p457u3.C11789b;

/* JADX INFO: renamed from: t3.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lt3/j;", "", "<init>", "()V", "T", "Lt3/a0;", "serializer", "Lu3/b;", "corruptionHandler", "", "Lt3/g;", "migrations", "Lku/p0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lt3/i;", "a", "(Lt3/a0;Lu3/b;Ljava/util/List;Lku/p0;Lkotlin/jvm/functions/Function0;)Lt3/i;", "Lt3/e0;", "storage", "b", "(Lt3/e0;Lu3/b;Ljava/util/List;Lku/p0;)Lt3/i;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11492j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11492j f40576a = new C11492j();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC11490i m42992c(C11492j c11492j, InterfaceC11475a0 interfaceC11475a0, C11789b c11789b, List list, InterfaceC7906p0 interfaceC7906p0, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c11789b = null;
        }
        if ((i10 & 4) != 0) {
            list = C7699p.m31892k();
        }
        if ((i10 & 8) != 0) {
            interfaceC7906p0 = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));
        }
        return c11492j.m42993a(interfaceC11475a0, c11789b, list, interfaceC7906p0, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final <T> InterfaceC11490i<T> m42993a(@NotNull InterfaceC11475a0<T> serializer, @Nullable C11789b<T> corruptionHandler, @NotNull List<? extends InterfaceC11486g<T>> migrations, @NotNull InterfaceC7906p0 scope, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return m42994b(new C11499o(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T> InterfaceC11490i<T> m42994b(@NotNull InterfaceC11483e0<T> storage, @Nullable C11789b<T> corruptionHandler, @NotNull List<? extends InterfaceC11486g<T>> migrations, @NotNull InterfaceC7906p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (C11789b<T>) new C11788a();
        }
        return new C11494k(storage, C7697o.m31878d(C11488h.INSTANCE.m42986b(migrations)), corruptionHandler, scope);
    }
}
