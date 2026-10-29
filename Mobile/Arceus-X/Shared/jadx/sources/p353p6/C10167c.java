package p353p6;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.C7731d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043c7.AbstractC1553c;
import p096e7.C4848b;
import p096e7.C4862i;
import p096e7.C4863i0;
import p096e7.InterfaceC4875u;
import p239k6.BitmapImage;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p537x6.C12749j;
import p537x6.Options;
import p568y6.EnumC13104c;

/* JADX INFO: renamed from: p6.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lk6/n;", "image", "Lx6/p;", "options", "", "Lc7/c;", "transformations", "Le7/u;", "logger", "Landroid/graphics/Bitmap;", "a", "(Lk6/n;Lx6/p;Ljava/util/List;Le7/u;)Landroid/graphics/Bitmap;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10167c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bitmap m39174a(@NotNull InterfaceC7474n interfaceC7474n, @NotNull Options options, @NotNull List<? extends AbstractC1553c> list, @Nullable InterfaceC4875u interfaceC4875u) {
        if (interfaceC7474n instanceof BitmapImage) {
            Bitmap bitmap = ((BitmapImage) interfaceC7474n).getBitmap();
            Bitmap.Config configM23411c = C4848b.m23411c(bitmap);
            if (C7693m.m31838G(C4863i0.m23460f(), configM23411c)) {
                return bitmap;
            }
            if (interfaceC4875u != null) {
                InterfaceC4875u.a aVar = InterfaceC4875u.a.Info;
                if (interfaceC4875u.m23484a().compareTo(aVar) <= 0) {
                    interfaceC4875u.m23485b("EngineInterceptor", aVar, "Converting bitmap with config " + configM23411c + " to apply transformations: " + list + '.', null);
                }
            }
        } else if (interfaceC4875u != null) {
            InterfaceC4875u.a aVar2 = InterfaceC4875u.a.Info;
            if (interfaceC4875u.m23484a().compareTo(aVar2) <= 0) {
                interfaceC4875u.m23485b("EngineInterceptor", aVar2, "Converting image of type " + C7731d0.m32002b(interfaceC7474n.getClass()).mo28426f() + " to apply transformations: " + list + '.', null);
            }
        }
        return C4862i.f19549a.m23452a(C7482v.m31086a(interfaceC7474n, options.getContext().getResources()), C12749j.m47593j(options), options.getSize(), options.getScale(), options.getPrecision() == EnumC13104c.INEXACT);
    }
}
