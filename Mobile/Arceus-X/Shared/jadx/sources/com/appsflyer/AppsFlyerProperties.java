package com.appsflyer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bf\u0018\u0000  2\u00020\u0001:\u0001 J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\nH¦\u0002¢\u0006\u0004\b\b\u0010\u000bJ\"\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\rJ\"\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u000eH¦\u0002¢\u0006\u0004\b\b\u0010\u000fJ\"\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0010H¦\u0002¢\u0006\u0004\b\b\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0010H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\fH&¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u000eH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010\u0013"}, m31665d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "", "", "key", "", "remove", "(Ljava/lang/String;)V", "value", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "(Ljava/lang/String;I)V", "", "(Ljava/lang/String;J)V", "", "(Ljava/lang/String;Z)V", "clear", "()V", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "defValue", "getBoolean", "(Ljava/lang/String;Z)Z", "defaultValue", "getInt", "(Ljava/lang/String;I)I", "getLong", "(Ljava/lang/String;J)J", "saveProperties", "loadProperties", "Companion"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public interface AppsFlyerProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFLogger;

    @NotNull
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";

    @NotNull
    public static final String ONELINK_DOMAIN = "onelinkDomain";

    @NotNull
    public static final String ONELINK_SCHEME = "onelinkScheme";

    @NotNull
    public static final String ONELINK_VERSION = "onelinkVersion";

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lcom/appsflyer/AppsFlyerProperties$Companion;", "", "<init>", "()V"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AFLogger = new Companion();

        private Companion() {
        }
    }

    void clear();

    boolean getBoolean(@Nullable String key, boolean defValue);

    int getInt(@Nullable String key, int defaultValue);

    long getLong(@Nullable String key, long defaultValue);

    @Nullable
    String getString(@Nullable String key);

    void loadProperties();

    void remove(@Nullable String key);

    void saveProperties();

    void set(@Nullable String key, int value);

    void set(@Nullable String key, long value);

    void set(@Nullable String key, @Nullable String value);

    void set(@Nullable String key, boolean value);

    void set(@Nullable String key, @Nullable String[] value);
}
