package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H'¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFj1ySDK;", "", "", "registerClient", "()V", "AFKeystoreWrapper", "", "", "AFLogger", "()Ljava/util/Map;", "AFa1ySDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AFj1ySDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFKeystoreWrapper;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1ySDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AFKeystoreWrapper = new Companion();

        private Companion() {
        }
    }

    void AFKeystoreWrapper();

    @NotNull
    Map<String, Object> AFLogger();

    void registerClient();
}
