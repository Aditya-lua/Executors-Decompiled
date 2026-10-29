package pm;

import com.roblox.universalapp.messagebus.MessageBus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lpm/b;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "APP_RESUME_ID", "c", "APP_STOP_ID", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f28730a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String APP_RESUME_ID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String APP_STOP_ID;

    static {
        String messageId = MessageBus.getMessageId("Realtime", "appResume");
        Intrinsics.checkNotNullExpressionValue(messageId, "getMessageId(...)");
        APP_RESUME_ID = messageId;
        String messageId2 = MessageBus.getMessageId("Realtime", "appStop");
        Intrinsics.checkNotNullExpressionValue(messageId2, "getMessageId(...)");
        APP_STOP_ID = messageId2;
    }
}
