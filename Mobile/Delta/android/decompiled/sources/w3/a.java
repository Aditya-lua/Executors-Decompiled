package w3;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import ku.g1;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "Lu3/b;", "Lx3/f;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lt3/g;", "produceMigrations", "Lku/p0;", "scope", "Ldu/a;", "Lt3/i;", "a", "(Ljava/lang/String;Lu3/b;Lkotlin/jvm/functions/Function1;Lku/p0;)Ldu/a;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", "", "Lt3/g;", "Lx3/f;", "a", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class C0617a extends m implements Function1<Context, List<? extends t3.g<x3.f>>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0617a f33658i = new C0617a();

        public C0617a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<t3.g<x3.f>> invoke(@NotNull Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return p.k();
        }
    }

    @NotNull
    public static final du.a<Context, t3.i<x3.f>> a(@NotNull String name, @Nullable u3.b<x3.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends t3.g<x3.f>>> produceMigrations, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ du.a b(String str, u3.b bVar, Function1 function1, p0 p0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0617a.f33658i;
        }
        if ((i10 & 8) != 0) {
            p0Var = q0.a(g1.b().plus(z2.b(null, 1, null)));
        }
        return a(str, bVar, function1, p0Var);
    }
}
