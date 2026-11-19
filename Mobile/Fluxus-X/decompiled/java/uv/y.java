package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Luv/y;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "streamId", BuildConfig.FLAVOR, "Luv/d;", "requestHeaders", BuildConfig.FLAVOR, "b", "(ILjava/util/List;)Z", "responseHeaders", "last", "c", "(ILjava/util/List;Z)Z", "Lew/g;", Payload.SOURCE, "byteCount", "d", "(ILew/g;IZ)Z", "Luv/b;", "errorCode", BuildConfig.FLAVOR, "a", "(ILuv/b;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f34114a;

    @NotNull
    public static final y b = new Companion.C0693a();

    /* JADX INFO: renamed from: uv.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Luv/y$a;", BuildConfig.FLAVOR, "<init>", "()V", "Luv/y;", "CANCEL", "Luv/y;", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f34114a = new Companion();

        /* JADX INFO: renamed from: uv.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Luv/y$a$a;", "Luv/y;", "<init>", "()V", BuildConfig.FLAVOR, "streamId", BuildConfig.FLAVOR, "Luv/d;", "requestHeaders", BuildConfig.FLAVOR, "b", "(ILjava/util/List;)Z", "responseHeaders", "last", "c", "(ILjava/util/List;Z)Z", "Lew/g;", Payload.SOURCE, "byteCount", "d", "(ILew/g;IZ)Z", "Luv/b;", "errorCode", BuildConfig.FLAVOR, "a", "(ILuv/b;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0693a implements y {
            @Override // uv.y
            public void a(int streamId, @NotNull b errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // uv.y
            public boolean b(int streamId, @NotNull List<d> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // uv.y
            public boolean c(int streamId, @NotNull List<d> responseHeaders, boolean last) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // uv.y
            public boolean d(int streamId, @NotNull ew.g source, int byteCount, boolean last) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(byteCount);
                return true;
            }
        }
    }

    void a(int streamId, @NotNull b errorCode);

    boolean b(int streamId, @NotNull List<d> requestHeaders);

    boolean c(int streamId, @NotNull List<d> responseHeaders, boolean last);

    boolean d(int streamId, @NotNull ew.g source, int byteCount, boolean last);
}
