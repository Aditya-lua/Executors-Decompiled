package p428s4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p351p4.C10157a;
import p351p4.C10158b;

/* JADX INFO: renamed from: s4.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Ls4/b;", "", "<init>", "()V", "Ls4/a;", "deletionRequest", "", "a", "(Ls4/a;Lnt/b;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lnt/b;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lnt/b;)Ljava/lang/Object;", "Ls4/i;", "request", "f", "(Ls4/i;Lnt/b;)Ljava/lang/Object;", "Ls4/j;", "g", "(Ls4/j;Lnt/b;)Ljava/lang/Object;", "Ls4/h;", "d", "(Ls4/h;Lnt/b;)Ljava/lang/Object;", "", "b", "(Lnt/b;)Ljava/lang/Object;", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC11165b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s4.b$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"Ls4/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ls4/b;", "a", "(Landroid/content/Context;)Ls4/b;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: s4.b$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroid/content/Context;", "it", "Ls4/c;", "a", "(Landroid/content/Context;)Ls4/c;"}, m31666k = 3, m31667mv = {1, 8, 0})
        public static final class C14240a extends AbstractC7746m implements Function1<Context, C11166c> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ Context f39405i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14240a(Context context) {
                super(1);
                this.f39405i = context;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C11166c invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C11166c(this.f39405i);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: s4.b.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        /* JADX INFO: renamed from: a */
        public final AbstractC11165b m42069a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C10157a c10157a = C10157a.f36531a;
            sb2.append(c10157a.m39104a());
            Log.d("MeasurementManager", sb2.toString());
            if (c10157a.m39104a() >= 5) {
                return new C11169f(context);
            }
            if (c10157a.m39105b() >= 9) {
                return (AbstractC11165b) C10158b.f36534a.m39108a(context, "MeasurementManager", new C14240a(context));
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo42062a(@NotNull C11164a c11164a, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo42063b(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Object mo42064c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo42065d(@NotNull C11171h c11171h, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo42066e(@NotNull Uri uri, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Object mo42067f(@NotNull C11172i c11172i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: g */
    public abstract Object mo42068g(@NotNull C11173j c11173j, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);
}
