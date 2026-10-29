package p443t6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.C7473m;
import p239k6.Extras;
import p537x6.Options;

/* JADX INFO: renamed from: t6.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\f\"\u0015\u0010\u000f\u001a\u00020\u0005*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000e\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lk6/l$c;", "", "a", "Lk6/l$c;", "httpMethodKey", "Lt6/n;", "b", "httpHeadersKey", "Lt6/p;", "c", "httpBodyKey", "Lx6/p;", "(Lx6/p;)Ljava/lang/String;", "httpMethod", "(Lx6/p;)Lt6/n;", "httpHeaders", "(Lx6/p;)Lt6/p;", "httpBody", "coil-network-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11538h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Extras.c<String> f40822a = new Extras.c<>("GET");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Extras.c<NetworkHeaders> f40823b = new Extras.c<>(NetworkHeaders.f40873c);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Extras.c<InterfaceC11546p> f40824c = new Extras.c<>(null);

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final InterfaceC11546p m43115a(@NotNull Options options) {
        return (InterfaceC11546p) C7473m.m31063b(options, f40824c);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final NetworkHeaders m43116b(@NotNull Options options) {
        return (NetworkHeaders) C7473m.m31063b(options, f40823b);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m43117c(@NotNull Options options) {
        return (String) C7473m.m31063b(options, f40822a);
    }
}
