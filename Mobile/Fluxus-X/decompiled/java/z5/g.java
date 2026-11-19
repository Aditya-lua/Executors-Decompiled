package z5;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz5/g;", "Lb5/b;", "<init>", "()V", "Lh5/c;", "db", BuildConfig.FLAVOR, "b", "(Lh5/c;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends b5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final g f39026c = new g();

    public g() {
        super(12, 13);
    }

    @Override // b5.b
    public void b(@NotNull h5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.V("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.V("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
