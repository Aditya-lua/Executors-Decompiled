package z5;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lz5/g1;", "Lb5/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lh5/c;", "db", BuildConfig.FLAVOR, "b", "(Lh5/c;)V", "c", "Landroid/content/Context;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 extends b5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(@NotNull Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // b5.b
    public void b(@NotNull h5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.V("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        h6.w.c(this.context, db2);
        h6.o.c(this.context, db2);
    }
}
