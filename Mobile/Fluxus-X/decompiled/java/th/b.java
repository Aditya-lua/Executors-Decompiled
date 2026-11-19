package th;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lth/b;", "Lb5/a;", "<init>", "()V", "Lh5/c;", "db", BuildConfig.FLAVOR, "a", "(Lh5/c;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b5.a {
    @Override // b5.a
    public void a(@NotNull h5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.V("DELETE FROM analytic_event");
    }

    @Override // b5.a
    public /* bridge */ void b(@NotNull g5.b bVar) {
        super.b(bVar);
    }
}
