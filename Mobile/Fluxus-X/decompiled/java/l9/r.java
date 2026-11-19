package l9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class r extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.d f22016a;

    public r(@NonNull k9.d dVar) {
        this.f22016a = dVar;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f22016a));
    }
}
