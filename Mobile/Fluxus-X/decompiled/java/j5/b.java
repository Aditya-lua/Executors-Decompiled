package j5;

import com.github.luben.zstd.BuildConfig;
import h5.d;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lj5/b;", "Lg5/c;", "Lh5/d;", "openHelper", "<init>", "(Lh5/d;)V", BuildConfig.FLAVOR, "fileName", "Lj5/a;", "c", "(Ljava/lang/String;)Lj5/a;", "a", "Lh5/d;", BuildConfig.FLAVOR, "b", "()Z", "hasConnectionPool$annotations", "()V", "hasConnectionPool", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements g5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d openHelper;

    public b(@NotNull d openHelper) {
        Intrinsics.checkNotNullParameter(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    @Override // g5.c
    public boolean b() {
        return true;
    }

    @Override // g5.c
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        String name = this.openHelper.getName();
        if (name == null) {
            if (!Intrinsics.c(fileName, ":memory:")) {
                throw new IllegalArgumentException(("This driver is configured to open an in-memory database but a file-based named '" + fileName + "' was requested.").toString());
            }
        } else if (!Intrinsics.c(name, fileName) && !Intrinsics.c(StringsKt.c1(name, '/', null, 2, null), StringsKt.c1(fileName, '/', null, 2, null))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + this.openHelper.getName() + "' but '" + fileName + "' was requested.").toString());
        }
        return new a(this.openHelper.w2());
    }
}
