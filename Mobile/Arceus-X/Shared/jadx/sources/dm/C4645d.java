package dm;

import com.roblox.universalapp.messagebus.MessageBus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dm.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, m31665d2 = {"Ldm/d;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "USER_LAYER_LOADING_STATUS_CHANGED", "c", "REGISTER_USER_LAYER", "d", "INITIALIZE_USER_LAYERS", "e", "GET_USER_LAYER_VARIABLES_REQUEST", "f", "GET_USER_LAYER_VARIABLES_RESPONSE", "g", "LOG_BROWSER_TRACKER_LAYER_EXPOSURE", "h", "LOG_USER_LAYER_EXPOSURE", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4645d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4645d f19027a = new C4645d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String USER_LAYER_LOADING_STATUS_CHANGED;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String REGISTER_USER_LAYER;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String INITIALIZE_USER_LAYERS;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final String GET_USER_LAYER_VARIABLES_REQUEST;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final String GET_USER_LAYER_VARIABLES_RESPONSE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final String LOG_BROWSER_TRACKER_LAYER_EXPOSURE;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final String LOG_USER_LAYER_EXPOSURE;

    static {
        String messageId = MessageBus.getMessageId("Experimentation", "userLayerLoadingStatusChanged");
        Intrinsics.checkNotNullExpressionValue(messageId, "getMessageId(...)");
        USER_LAYER_LOADING_STATUS_CHANGED = messageId;
        String messageId2 = MessageBus.getMessageId("Experimentation", "registerUserLayers");
        Intrinsics.checkNotNullExpressionValue(messageId2, "getMessageId(...)");
        REGISTER_USER_LAYER = messageId2;
        String messageId3 = MessageBus.getMessageId("Experimentation", "initializeUserLayers");
        Intrinsics.checkNotNullExpressionValue(messageId3, "getMessageId(...)");
        INITIALIZE_USER_LAYERS = messageId3;
        String messageId4 = MessageBus.getMessageId("Experimentation", "getUserLayerVariablesRequest");
        Intrinsics.checkNotNullExpressionValue(messageId4, "getMessageId(...)");
        GET_USER_LAYER_VARIABLES_REQUEST = messageId4;
        String messageId5 = MessageBus.getMessageId("Experimentation", "getUserLayerVariablesResponse");
        Intrinsics.checkNotNullExpressionValue(messageId5, "getMessageId(...)");
        GET_USER_LAYER_VARIABLES_RESPONSE = messageId5;
        String messageId6 = MessageBus.getMessageId("Experimentation", "logBrowserTrackerLayerExposure");
        Intrinsics.checkNotNullExpressionValue(messageId6, "getMessageId(...)");
        LOG_BROWSER_TRACKER_LAYER_EXPOSURE = messageId6;
        String messageId7 = MessageBus.getMessageId("Experimentation", "logUserLayerExposure");
        Intrinsics.checkNotNullExpressionValue(messageId7, "getMessageId(...)");
        LOG_USER_LAYER_EXPOSURE = messageId7;
    }
}
