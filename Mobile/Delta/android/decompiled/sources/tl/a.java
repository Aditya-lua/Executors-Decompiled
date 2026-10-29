package tl;

import java.util.function.BiConsumer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Ltl/a;", "", "", "experimentVariant", "Ljava/util/function/BiConsumer;", "", "callback", "", "b", "(Ljava/lang/String;Ljava/util/function/BiConsumer;)V", "adTracingId", "adUnitId", "Ltl/e;", "listener", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl/e;)V", "Lorg/json/JSONObject;", "params", "Ltl/c;", "e", "(Ljava/lang/String;Lorg/json/JSONObject;Ltl/c;)V", "Ltl/f;", "d", "(Ljava/lang/String;Ltl/f;)V", "a", "()V", "destroy", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a();

    void b(@NotNull String experimentVariant, @NotNull BiConsumer<Boolean, String> callback);

    void c(@NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant, @NotNull e listener);

    void d(@NotNull String adTracingId, @NotNull f listener);

    void destroy();

    void e(@NotNull String adTracingId, @NotNull JSONObject params, @NotNull c listener);
}
