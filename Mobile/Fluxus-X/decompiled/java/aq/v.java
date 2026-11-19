package aq;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0096A¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Laq/v;", "Ldv/g0;", BuildConfig.FLAVOR, "Landroid/net/Uri;", "<init>", "()V", "uri", BuildConfig.FLAVOR, "b", "(Ljava/util/List;)Z", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "a", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements dv.g0<List<? extends Uri>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final dv.b0<List<Uri>> f3319c = dv.i0.b(0, 1, cv.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv.b0<List<Uri>> f3320a = f3319c;

    public final boolean b(@NotNull List<Uri> uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return f3319c.a(uri);
    }

    @Override // dv.g0, dv.h
    @Nullable
    public Object collect(@NotNull dv.i<? super List<? extends Uri>> iVar, @NotNull eu.b<?> bVar) {
        return this.f3320a.collect(iVar, bVar);
    }
}
