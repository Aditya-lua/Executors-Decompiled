package fw;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lew/k;", "Lew/b0;", "path", "Lew/j;", "c", "(Lew/k;Lew/b0;)Lew/j;", BuildConfig.FLAVOR, "b", "(Lew/k;Lew/b0;)Z", "dir", "mustCreate", BuildConfig.FLAVOR, "a", "(Lew/k;Lew/b0;Z)V", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void a(@NotNull ew.k kVar, @NotNull b0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        p001kotlin.collections.i iVar = new p001kotlin.collections.i();
        for (b0 b0VarK = dir; b0VarK != null && !kVar.m(b0VarK); b0VarK = b0VarK.k()) {
            iVar.addFirst(b0VarK);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            ew.k.g(kVar, (b0) it.next(), false, 2, null);
        }
    }

    public static final boolean b(@NotNull ew.k kVar, @NotNull b0 path) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return kVar.p(path) != null;
    }

    @NotNull
    public static final ew.j c(@NotNull ew.k kVar, @NotNull b0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        ew.j jVarP = kVar.p(path);
        if (jVarP != null) {
            return jVarP;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
