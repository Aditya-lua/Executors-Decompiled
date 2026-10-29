package t4;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt4/j;", "", "<init>", "()V", "Lt4/b;", "request", "Lt4/e;", "a", "(Lt4/b;Lnt/b;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t4.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt4/j$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lt4/j;", "a", "(Landroid/content/Context;)Lt4/j;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: t4.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lt4/k;", "a", "(Landroid/content/Context;)Lt4/k;"}, k = 3, mv = {1, 8, 0})
        public static final class C0563a extends kotlin.jvm.internal.m implements Function1<Context, k> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Context f31598i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0563a(Context context) {
                super(1);
                this.f31598i = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new k(this.f31598i);
            }
        }

        /* JADX INFO: renamed from: t4.j$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lt4/l;", "a", "(Landroid/content/Context;)Lt4/l;"}, k = 3, mv = {1, 8, 0})
        public static final class b extends kotlin.jvm.internal.m implements Function1<Context, l> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Context f31599i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(1);
                this.f31599i = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new l(this.f31599i);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final j a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p4.a aVar = p4.a.f28213a;
            if (aVar.a() >= 11) {
                return new o(context);
            }
            if (aVar.a() >= 5) {
                return new q(context);
            }
            if (aVar.a() == 4) {
                return new p(context);
            }
            if (aVar.b() >= 11) {
                return (j) p4.b.f28216a.a(context, "TopicsManager", new C0563a(context));
            }
            if (aVar.b() >= 9) {
                return (j) p4.b.f28216a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        public Companion() {
        }
    }

    @Nullable
    public abstract Object a(@NotNull b bVar, @NotNull nt.b<? super e> bVar2);
}
