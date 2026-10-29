package go;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgo/z;", "Lgo/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "", "c", "Z", "getDefaultValue", "()Z", "defaultValue", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f18324a = new z();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String key = "tips_mobile_sdk";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final boolean defaultValue = false;

    @Override // go.d
    public boolean getDefaultValue() {
        return defaultValue;
    }

    @Override // go.d
    @NotNull
    public String getKey() {
        return key;
    }
}
