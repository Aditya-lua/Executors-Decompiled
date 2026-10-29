package p485v6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p443t6.C11543m;
import p443t6.InterfaceC11539i;
import p508w6.C12308a;

/* JADX INFO: renamed from: v6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lt6/m$a;", "d", "()Lt6/m$a;", "Lokhttp3/Call$Factory;", "Lt6/i;", "c", "(Lokhttp3/Call$Factory;)Lt6/i;", "coil-network-okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12013b {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC11539i m44837b() {
        return m44838c(new OkHttpClient());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC11539i m44838c(@NotNull Call.Factory factory) {
        return C12308a.m45757b(C12308a.m45758c(factory));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C11543m.a m44839d() {
        return new C11543m.a(new Function0() { // from class: v6.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12013b.m44837b();
            }
        }, null, null, 6, null);
    }
}
