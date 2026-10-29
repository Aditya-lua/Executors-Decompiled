package ur;

import android.content.Context;
import android.media.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u008d\u0001\u0010\u0013\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\nH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH&¢\u0006\u0004\b#\u0010\"R\u001e\u0010)\u001a\u0004\u0018\u00010$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010/\u001a\u0004\u0018\u00010*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"¨\u00061À\u0006\u0003"}, d2 = {"Lur/a;", "", "", "userName", "credential", "serverUrl", "jwt", "", "width", "height", "", "isAudioRequired", "Lkotlin/Function0;", "", "completion", "onConnectionError", "onIceComplete", "Lkotlin/Function1;", "onStopRequestReceived", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/media/Image;", "image", "rotation", "b", "(Landroid/media/Image;I)V", "stepName", "webRtcObjectIdReceived", "f", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "a", "()V", "d", "c", "()Z", "g", "Ltr/a;", "getService", "()Ltr/a;", "h", "(Ltr/a;)V", "service", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "i", "(Landroid/content/Context;)V", "context", "isConnected", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a();

    void b(@Nullable Image image, int rotation);

    boolean c();

    void d();

    void e(@Nullable String userName, @Nullable String credential, @Nullable String serverUrl, @Nullable String jwt, int width, int height, boolean isAudioRequired, @NotNull Function0<Unit> completion, @NotNull Function0<Unit> onConnectionError, @NotNull Function0<Unit> onIceComplete, @NotNull Function1<? super String, Unit> onStopRequestReceived);

    void f(@NotNull String stepName, @NotNull Function1<? super String, Unit> webRtcObjectIdReceived);

    boolean g();

    void h(@Nullable tr.a aVar);

    void i(@Nullable Context context);

    boolean isConnected();
}
