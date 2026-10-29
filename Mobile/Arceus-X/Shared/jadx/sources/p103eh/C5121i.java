package p103eh;

import il.InterfaceC6818c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: eh.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Leh/i;", "", "Lil/c;", "designFoundations", "Ljava/lang/Runnable;", "onTokensChanged", "<init>", "(Lil/c;Ljava/lang/Runnable;)V", "", "b", "()V", "c", "a", "Lil/c;", "Ljava/lang/Runnable;", "Lku/p0;", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5121i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6818c designFoundations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Runnable onTokensChanged;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: eh.i$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", "", "it"}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.components.ToolbarTokensObserver$start$1", m39664f = "ToolbarTokensObserver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<Unit, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f19982t;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5121i.this.new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f19982t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C5121i.this.onTokensChanged.run();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(unit, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C5121i(@NotNull InterfaceC6818c designFoundations, @NotNull Runnable onTokensChanged) {
        Intrinsics.checkNotNullParameter(designFoundations, "designFoundations");
        Intrinsics.checkNotNullParameter(onTokensChanged, "onTokensChanged");
        this.designFoundations = designFoundations;
        this.onTokensChanged = onTokensChanged;
    }

    /* JADX INFO: renamed from: b */
    public final void m23901b() {
        this.scope = C7910q0.m32886b();
        InterfaceC9575h interfaceC9575hM37768E = C9579j.m37768E(this.designFoundations.mo29190a(), new a(null));
        InterfaceC7906p0 interfaceC7906p0 = this.scope;
        Intrinsics.checkNotNull(interfaceC7906p0);
        C9579j.m37809z(interfaceC9575hM37768E, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: c */
    public final void m23902c() {
        InterfaceC7906p0 interfaceC7906p0 = this.scope;
        if (interfaceC7906p0 != null) {
            C7910q0.m32890f(interfaceC7906p0, null, 1, null);
        }
        this.scope = null;
    }
}
