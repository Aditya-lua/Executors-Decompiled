package zf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i extends ff.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f38115a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public i(@NonNull a aVar) {
        this.f38115a = aVar;
    }

    public i(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f38115a = aVar;
    }
}
