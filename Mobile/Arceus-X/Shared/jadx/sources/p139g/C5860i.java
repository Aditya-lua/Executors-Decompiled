package p139g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p154h.C6252e;
import p154h.C6253f;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lh/f$h;", "mediaType", "", "maxItems", "", "isOrderedSelection", "Lh/f$b;", "defaultTab", "Lg/h;", "a", "(Lh/f$h;IZLh/f$b;)Lg/h;", "activity"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5860i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C5859h m26281a(@NotNull C6253f.h mediaType, int i10, boolean z10, @NotNull C6253f.b defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new C5859h.a().m26279d(mediaType).m26278c(i10).m26280e(z10).m26277b(defaultTab).m26276a();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5859h m26282b(C6253f.h hVar, int i10, boolean z10, C6253f.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = C6253f.c.f23772a;
        }
        if ((i11 & 2) != 0) {
            i10 = C6252e.INSTANCE.m27461a();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            bVar = C6253f.b.a.f23770a;
        }
        return m26281a(hVar, i10, z10, bVar);
    }
}
