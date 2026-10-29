package p6;

import android.graphics.Bitmap;
import e7.i;
import e7.i0;
import e7.u;
import java.util.List;
import k6.BitmapImage;
import k6.n;
import k6.v;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import x6.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk6/n;", "image", "Lx6/p;", "options", "", "Lc7/c;", "transformations", "Le7/u;", "logger", "Landroid/graphics/Bitmap;", "a", "(Lk6/n;Lx6/p;Ljava/util/List;Le7/u;)Landroid/graphics/Bitmap;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    @NotNull
    public static final Bitmap a(@NotNull n nVar, @NotNull Options options, @NotNull List<? extends c7.c> list, @Nullable u uVar) {
        if (nVar instanceof BitmapImage) {
            Bitmap bitmap = ((BitmapImage) nVar).getBitmap();
            Bitmap.Config configC = e7.b.c(bitmap);
            if (m.G(i0.f(), configC)) {
                return bitmap;
            }
            if (uVar != null) {
                u.a aVar = u.a.Info;
                if (uVar.a().compareTo(aVar) <= 0) {
                    uVar.b("EngineInterceptor", aVar, "Converting bitmap with config " + configC + " to apply transformations: " + list + '.', null);
                }
            }
        } else if (uVar != null) {
            u.a aVar2 = u.a.Info;
            if (uVar.a().compareTo(aVar2) <= 0) {
                uVar.b("EngineInterceptor", aVar2, "Converting image of type " + d0.b(nVar.getClass()).f() + " to apply transformations: " + list + '.', null);
            }
        }
        return i.f15192a.a(v.a(nVar, options.getContext().getResources()), j.j(options), options.getSize(), options.getScale(), options.getPrecision() == y6.c.INEXACT);
    }
}
