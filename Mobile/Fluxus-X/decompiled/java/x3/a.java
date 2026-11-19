package x3;

import android.content.Context;
import av.g1;
import av.p0;
import av.q0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {BuildConfig.FLAVOR, "name", "Lv3/b;", "Ly3/f;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", BuildConfig.FLAVOR, "Lu3/g;", "produceMigrations", "Lav/p0;", "scope", "Ltu/a;", "Lu3/i;", "a", "(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;)Ltu/a;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", BuildConfig.FLAVOR, "Lu3/g;", "Ly3/f;", "a", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class C0747a extends m implements Function1<Context, List<? extends u3.g<y3.f>>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0747a f36148i = new C0747a();

        public C0747a() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u3.g<y3.f>> invoke(@NotNull Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return p.k();
        }
    }

    @NotNull
    public static final tu.a<Context, u3.i<y3.f>> a(@NotNull String name, @Nullable v3.b<y3.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends u3.g<y3.f>>> produceMigrations, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ tu.a b(String str, v3.b bVar, Function1 function1, p0 p0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0747a.f36148i;
        }
        if ((i10 & 8) != 0) {
            p0Var = q0.a(g1.b().plus(z2.b(null, 1, null)));
        }
        return a(str, bVar, function1, p0Var);
    }
}
