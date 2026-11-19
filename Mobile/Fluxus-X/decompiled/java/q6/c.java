package q6;

import android.graphics.Bitmap;
import com.github.luben.zstd.BuildConfig;
import f7.i;
import f7.i0;
import f7.u;
import java.util.List;
import l6.BitmapImage;
import l6.n;
import l6.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.m;
import p001kotlin.jvm.internal.d0;
import y6.Options;
import y6.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll6/n;", "image", "Ly6/p;", "options", BuildConfig.FLAVOR, "Ld7/c;", "transformations", "Lf7/u;", "logger", "Landroid/graphics/Bitmap;", "a", "(Ll6/n;Ly6/p;Ljava/util/List;Lf7/u;)Landroid/graphics/Bitmap;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    @NotNull
    public static final Bitmap a(@NotNull n nVar, @NotNull Options options, @NotNull List<? extends d7.c> list, @Nullable u uVar) {
        if (nVar instanceof BitmapImage) {
            Bitmap bitmap = ((BitmapImage) nVar).getBitmap();
            Bitmap.Config configC = f7.b.c(bitmap);
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
        return i.f15646a.a(v.a(nVar, options.getContext().getResources()), j.j(options), options.getSize(), options.getScale(), options.getPrecision() == z6.c.INEXACT);
    }
}
