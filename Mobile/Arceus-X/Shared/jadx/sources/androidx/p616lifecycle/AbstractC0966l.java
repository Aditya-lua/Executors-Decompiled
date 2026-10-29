package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0007\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bR*\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Landroidx/lifecycle/l;", "", "<init>", "()V", "Landroidx/lifecycle/r;", "observer", "", "a", "(Landroidx/lifecycle/r;)V", "d", "Landroidx/lifecycle/c;", "Landroidx/lifecycle/c;", "c", "()Landroidx/lifecycle/c;", "setInternalScopeRef", "(Landroidx/lifecycle/c;)V", "internalScopeRef", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "currentState", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC0966l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public C0945c<Object> internalScopeRef = new C0945c<>(null);

    /* JADX INFO: renamed from: androidx.lifecycle.l$a */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m31665d2 = {"Landroidx/lifecycle/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "targetState", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(m4939a());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m31665d2 = {"Landroidx/lifecycle/l$a$a;", "", "<init>", "()V", "Landroidx/lifecycle/l$b;", "state", "Landroidx/lifecycle/l$a;", "a", "(Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$a;", "b", "c", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: androidx.lifecycle.l$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
            public static final /* synthetic */ class C14083a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f3689a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3689a = iArr;
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.l.a.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final a m4941a(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C14083a.f3689a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @Nullable
            /* JADX INFO: renamed from: b */
            public final a m4942b(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C14083a.f3689a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public final a m4943c(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C14083a.f3689a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.l$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f3690a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3690a = iArr;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final b m4940b() {
            switch (b.f3690a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new C7345l();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.l$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m31665d2 = {"Landroidx/lifecycle/l$b;", "", "<init>", "(Ljava/lang/String;I)V", "state", "", "b", "(Landroidx/lifecycle/l$b;)Z", "a", "c", "d", "e", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC10707a f3697g = C10708b.m40805a(m4944a());

        /* JADX INFO: renamed from: b */
        public final boolean m4945b(@NotNull b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4935a(@NotNull InterfaceC0978r observer);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract b mo4936b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C0945c<Object> m4937c() {
        return this.internalScopeRef;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4938d(@NotNull InterfaceC0978r observer);
}
