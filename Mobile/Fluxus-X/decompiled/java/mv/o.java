package mv;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lmv/o;", BuildConfig.FLAVOR, "Lmv/z;", "url", BuildConfig.FLAVOR, "Lmv/n;", "cookies", BuildConfig.FLAVOR, "a", "(Lmv/z;Ljava/util/List;)V", "b", "(Lmv/z;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f24767a;

    @NotNull
    public static final o b = new Companion.C0486a();

    /* JADX INFO: renamed from: mv.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Lmv/o$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/o;", "NO_COOKIES", "Lmv/o;", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24767a = new Companion();

        /* JADX INFO: renamed from: mv.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmv/o$a$a;", "Lmv/o;", "<init>", "()V", "Lmv/z;", "url", BuildConfig.FLAVOR, "Lmv/n;", "cookies", BuildConfig.FLAVOR, "a", "(Lmv/z;Ljava/util/List;)V", "b", "(Lmv/z;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0486a implements o {
            @Override // mv.o
            public void a(@NotNull z url, @NotNull List<n> cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // mv.o
            @NotNull
            public List<n> b(@NotNull z url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return p001kotlin.collections.p.k();
            }
        }
    }

    void a(@NotNull z url, @NotNull List<n> cookies);

    @NotNull
    List<n> b(@NotNull z url);
}
