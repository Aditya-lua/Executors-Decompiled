package p199ik;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p239k6.InterfaceC7479s;
import p302n6.C8888b;
import p302n6.InterfaceC8887a;
import p430s6.InterfaceC11178d;
import p477ut.C11966k;

/* JADX INFO: renamed from: ik.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lik/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lk6/s;", "a", "(Landroid/content/Context;)Lk6/s;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6815a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6815a f26770a = new C6815a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC7479s m29185a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC7479s.a aVarM31080k = new InterfaceC7479s.a(context).m31080k(new InterfaceC11178d.a().m42105c(context, 0.15d).m42104b());
        InterfaceC8887a.a aVarM35766c = new InterfaceC8887a.a().m35766c(10485760L);
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return aVarM31080k.m31078i(C8888b.m35769a(aVarM35766c, C11966k.m44661s(cacheDir, "img_cache")).m35764a()).m31076d();
    }
}
