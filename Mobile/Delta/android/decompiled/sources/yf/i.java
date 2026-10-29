package yf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i extends ef.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f35876a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public i(@NonNull a aVar) {
        this.f35876a = aVar;
    }

    public i(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f35876a = aVar;
    }
}
