package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lmv/f;", BuildConfig.FLAVOR, "Lmv/e;", "call", "Ljava/io/IOException;", "Lokio/IOException;", "e", BuildConfig.FLAVOR, "onFailure", "(Lmv/e;Ljava/io/IOException;)V", "Lmv/h0;", Payload.RESPONSE, "onResponse", "(Lmv/e;Lmv/h0;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    void onFailure(@NotNull e call, @NotNull IOException e10);

    void onResponse(@NotNull e call, @NotNull h0 response);
}
