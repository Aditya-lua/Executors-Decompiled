package g;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh/f$h;", "mediaType", BuildConfig.FLAVOR, "maxItems", BuildConfig.FLAVOR, "isOrderedSelection", "Lh/f$b;", "defaultTab", "Lg/j;", "a", "(Lh/f$h;IZLh/f$b;)Lg/j;", "activity"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {
    @NotNull
    public static final j a(@NotNull h.f.h mediaType, int i10, boolean z10, @NotNull h.f.b defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new j.a().d(mediaType).c(i10).e(z10).b(defaultTab).a();
    }

    public static /* synthetic */ j b(h.f.h hVar, int i10, boolean z10, h.f.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = h.f.c.f18000a;
        }
        if ((i11 & 2) != 0) {
            i10 = h.e.INSTANCE.a();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            bVar = h.f.b.a.f17999a;
        }
        return a(hVar, i10, z10, bVar);
    }
}
