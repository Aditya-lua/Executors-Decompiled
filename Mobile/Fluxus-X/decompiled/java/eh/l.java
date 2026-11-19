package eh;

import com.github.luben.zstd.BuildConfig;
import com.roblox.client.datastructures.NameValuePair;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Leh/l;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "evt", "ctx", BuildConfig.FLAVOR, "Lcom/roblox/client/datastructures/NameValuePair;", "params", BuildConfig.FLAVOR, "waitForFullBatch", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "b", "(Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {
    void a(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch);

    void b(boolean waitForFullBatch);
}
