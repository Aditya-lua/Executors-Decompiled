package p441t4;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p351p4.C10157a;
import p351p4.C10158b;

/* JADX INFO: renamed from: t4.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lt4/j;", "", "<init>", "()V", "Lt4/b;", "request", "Lt4/e;", "a", "(Lt4/b;Lnt/b;)Ljava/lang/Object;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC11520j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t4.j$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lt4/j$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lt4/j;", "a", "(Landroid/content/Context;)Lt4/j;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: t4.j$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroid/content/Context;", "it", "Lt4/k;", "a", "(Landroid/content/Context;)Lt4/k;"}, m31666k = 3, m31667mv = {1, 8, 0})
        public static final class C14257a extends AbstractC7746m implements Function1<Context, C11521k> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ Context f40801i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14257a(Context context) {
                super(1);
                this.f40801i = context;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11521k invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C11521k(this.f40801i);
            }
        }

        /* JADX INFO: renamed from: t4.j$a$b */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroid/content/Context;", "it", "Lt4/l;", "a", "(Landroid/content/Context;)Lt4/l;"}, m31666k = 3, m31667mv = {1, 8, 0})
        public static final class b extends AbstractC7746m implements Function1<Context, C11522l> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ Context f40802i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(1);
                this.f40802i = context;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11522l invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C11522l(this.f40802i);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: t4.j.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        /* JADX INFO: renamed from: a */
        public final AbstractC11520j m43091a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C10157a c10157a = C10157a.f36531a;
            if (c10157a.m39104a() >= 11) {
                return new C11525o(context);
            }
            if (c10157a.m39104a() >= 5) {
                return new C11527q(context);
            }
            if (c10157a.m39104a() == 4) {
                return new C11526p(context);
            }
            if (c10157a.m39105b() >= 11) {
                return (AbstractC11520j) C10158b.f36534a.m39108a(context, "TopicsManager", new C14257a(context));
            }
            if (c10157a.m39105b() >= 9) {
                return (AbstractC11520j) C10158b.f36534a.m39108a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo43090a(@NotNull C11512b c11512b, @NotNull InterfaceC9557b<? super C11515e> interfaceC9557b);
}
