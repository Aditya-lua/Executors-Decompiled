package p041c5;

import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5359b;
import p315nt.InterfaceC9557b;
import p535x4.AbstractC12682u;

/* JADX INFO: renamed from: c5.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"c5/b", "c5/c"}, m31665d2 = {}, m31666k = 4, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1525a {
    /* JADX INFO: renamed from: a */
    public static final void m8063a(@NotNull InterfaceC5359b interfaceC5359b) {
        C1526b.m8069a(interfaceC5359b);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m8064b(@NotNull AbstractC12682u abstractC12682u, boolean z10, @NotNull InterfaceC9557b<? super CoroutineContext> interfaceC9557b) {
        return C1527c.m8070a(abstractC12682u, z10, interfaceC9557b);
    }

    /* JADX INFO: renamed from: c */
    public static final <R> R m8065c(@NotNull AbstractC12682u abstractC12682u, boolean z10, boolean z11, @NotNull Function1<? super InterfaceC5359b, ? extends R> function1) {
        return (R) C1527c.m8071b(abstractC12682u, z10, z11, function1);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <R> Object m8066d(@NotNull AbstractC12682u abstractC12682u, @NotNull Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        return C1527c.m8072c(abstractC12682u, function1, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <R> Object m8067e(@NotNull AbstractC12682u abstractC12682u, boolean z10, boolean z11, @NotNull Function1<? super InterfaceC5359b, ? extends R> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        return C1527c.m8073d(abstractC12682u, z10, z11, function1, interfaceC9557b);
    }

    /* JADX INFO: renamed from: f */
    public static final int m8068f(@NotNull File file) {
        return C1527c.m8074e(file);
    }
}
