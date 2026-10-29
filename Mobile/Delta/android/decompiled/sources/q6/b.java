package q6;

import k6.h0;
import k6.i0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import x6.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq6/b;", "Lq6/c;", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "", "b", "(Lk6/h0;Lx6/p;)Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements c<h0> {
    @Override // q6.c
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull h0 data, @NotNull Options options) {
        String strD;
        if (!e7.h0.n(data) || !i.d(options) || (strD = i0.d(data)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = options.getFileSystem().metadata(xu.h0.Companion.e(xu.h0.INSTANCE, strD, false, 1, null)).getLastModifiedAtMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append('-');
        sb2.append(lastModifiedAtMillis);
        return sb2.toString();
    }
}
