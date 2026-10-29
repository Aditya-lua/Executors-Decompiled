package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFa1kSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1lSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V", "", "unregisterClient", "(Ljava/lang/String;Ljava/lang/Object;)V", "registerClient", "Ljava/util/Map;", "d", "Lcom/appsflyer/internal/AFa1lSDK;", "AFKeystoreWrapper", "AFa1zSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFa1kSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> d;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata */
    @Nullable
    final AFa1lSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1kSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1lSDK;", "p0", "Lcom/appsflyer/internal/AFa1kSDK;", "d", "(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;", "", "", "AFLogger", "(Ljava/util/Map;)Lcom/appsflyer/internal/AFa1kSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static AFa1kSDK AFLogger(@NotNull Map<String, Object> p8) {
            Intrinsics.checkNotNullParameter(p8, "");
            return new AFa1kSDK(p8, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public static AFa1kSDK d(@NotNull AFa1lSDK p8) {
            Intrinsics.checkNotNullParameter(p8, "");
            return new AFa1kSDK(new LinkedHashMap(), p8, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1kSDK(Map<String, Object> map, AFa1lSDK aFa1lSDK) {
        this.d = map;
        this.AFKeystoreWrapper = aFa1lSDK;
    }

    @NotNull
    public static final AFa1kSDK unregisterClient(@NotNull AFa1lSDK aFa1lSDK) {
        return Companion.d(aFa1lSDK);
    }

    @NotNull
    public static final AFa1kSDK unregisterClient(@NotNull Map<String, Object> map) {
        return Companion.AFLogger(map);
    }

    public final void unregisterClient(@NotNull String p8, @Nullable Object p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        this.d.put(p8, p10);
        AFa1lSDK aFa1lSDK = this.AFKeystoreWrapper;
        if (aFa1lSDK != null) {
            aFa1lSDK.d(this.d);
        }
    }

    public /* synthetic */ AFa1kSDK(Map map, AFa1lSDK aFa1lSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? null : aFa1lSDK);
    }

    public /* synthetic */ AFa1kSDK(Map map, AFa1lSDK aFa1lSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1lSDK);
    }
}
