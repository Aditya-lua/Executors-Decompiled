package p506w3;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087du.InterfaceC4691a;
import p256ku.C7864g1;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p440t3.InterfaceC11486g;
import p440t3.InterfaceC11490i;
import p457u3.C11789b;
import p534x3.AbstractC12645f;

/* JADX INFO: renamed from: w3.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"", "name", "Lu3/b;", "Lx3/f;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lt3/g;", "produceMigrations", "Lku/p0;", "scope", "Ldu/a;", "Lt3/i;", "a", "(Ljava/lang/String;Lu3/b;Lkotlin/jvm/functions/Function1;Lku/p0;)Ldu/a;", "datastore-preferences_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12297a {

    /* JADX INFO: renamed from: w3.a$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"Landroid/content/Context;", "it", "", "Lt3/g;", "Lx3/f;", "a", "(Landroid/content/Context;)Ljava/util/List;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function1<Context, List<? extends InterfaceC11486g<AbstractC12645f>>> {

        /* JADX INFO: renamed from: i */
        public static final a f43573i = new a();

        public a() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC11486g<AbstractC12645f>> invoke(@NotNull Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C7699p.m31892k();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4691a<Context, InterfaceC11490i<AbstractC12645f>> m45686a(@NotNull String name, @Nullable C11789b<AbstractC12645f> c11789b, @NotNull Function1<? super Context, ? extends List<? extends InterfaceC11486g<AbstractC12645f>>> produceMigrations, @NotNull InterfaceC7906p0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new C12299c(name, c11789b, produceMigrations, scope);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4691a m45687b(String str, C11789b c11789b, Function1 function1, InterfaceC7906p0 interfaceC7906p0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c11789b = null;
        }
        if ((i10 & 4) != 0) {
            function1 = a.f43573i;
        }
        if ((i10 & 8) != 0) {
            interfaceC7906p0 = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));
        }
        return m45686a(str, c11789b, function1, interfaceC7906p0);
    }
}
