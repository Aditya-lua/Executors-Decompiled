package uv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import vv.WindowCounter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\tJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Luv/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "streamId", "Lvv/a;", "windowCounter", BuildConfig.FLAVOR, "bufferSize", BuildConfig.FLAVOR, "a", "(ILvv/a;J)V", "b", "(Lvv/a;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luv/c$a;", "Luv/c;", "<init>", "()V", BuildConfig.FLAVOR, "streamId", "Lvv/a;", "windowCounter", BuildConfig.FLAVOR, "bufferSize", BuildConfig.FLAVOR, "a", "(ILvv/a;J)V", "b", "(Lvv/a;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f33970a = new a();

        @Override // uv.c
        public void a(int streamId, @NotNull WindowCounter windowCounter, long bufferSize) {
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        }

        @Override // uv.c
        public void b(@NotNull WindowCounter windowCounter) {
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        }
    }

    void a(int streamId, @NotNull WindowCounter windowCounter, long bufferSize);

    void b(@NotNull WindowCounter windowCounter);
}
