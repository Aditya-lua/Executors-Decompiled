package r6;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import l6.h0;
import l6.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import y6.Options;
import y6.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr6/b;", "Lr6/c;", "Ll6/h0;", "<init>", "()V", "data", "Ly6/p;", "options", BuildConfig.FLAVOR, "b", "(Ll6/h0;Ly6/p;)Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements c<h0> {
    @Override // r6.c
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull h0 data, @NotNull Options options) {
        String strD;
        if (!f7.h0.n(data) || !i.d(options) || (strD = i0.d(data)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = options.getFileSystem().o(b0.Companion.e(b0.INSTANCE, strD, false, 1, null)).getLastModifiedAtMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append('-');
        sb2.append(lastModifiedAtMillis);
        return sb2.toString();
    }
}
