package p242k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: k9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7506p extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a */
    public final Feature f28866a;

    public C7506p(@NonNull Feature feature) {
        this.f28866a = feature;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f28866a));
    }
}
