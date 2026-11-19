package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lmv/b;", BuildConfig.FLAVOR, "Lmv/j0;", "route", "Lmv/h0;", Payload.RESPONSE, "Lmv/f0;", "a", "(Lmv/j0;Lmv/h0;)Lmv/f0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f24454a;

    @NotNull
    public static final b b = new Companion.C0482a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f24453c = new ov.a(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: mv.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001¨\u0006\t"}, d2 = {"Lmv/b$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/b;", "NONE", "Lmv/b;", "JAVA_NET_AUTHENTICATOR", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24454a = new Companion();

        /* JADX INFO: renamed from: mv.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmv/b$a$a;", "Lmv/b;", "<init>", "()V", "Lmv/j0;", "route", "Lmv/h0;", Payload.RESPONSE, "Lmv/f0;", "a", "(Lmv/j0;Lmv/h0;)Lmv/f0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0482a implements b {
            @Override // mv.b
            @Nullable
            public f0 a(@Nullable j0 route, @NotNull h0 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }
    }

    @Nullable
    f0 a(@Nullable j0 route, @NotNull h0 response);
}
