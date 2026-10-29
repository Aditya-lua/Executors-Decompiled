package mp;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.EnumC8666a;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: mp.v */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0096A¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lmp/v;", "Lnu/g0;", "", "Landroid/net/Uri;", "<init>", "()V", "uri", "", "b", "(Ljava/util/List;)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8639v implements InterfaceC9574g0<List<? extends Uri>> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC9564b0<List<Uri>> f31629c = C9578i0.m37758b(0, 1, EnumC8666a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9564b0<List<Uri>> f31630a = f31629c;

    /* JADX INFO: renamed from: b */
    public final boolean m34712b(@NotNull List<Uri> uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return f31629c.mo37707a(uri);
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super List<? extends Uri>> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.f31630a.collect(interfaceC9577i, interfaceC9557b);
    }
}
