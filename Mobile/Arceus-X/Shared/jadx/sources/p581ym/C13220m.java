package p581ym;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;
import zm.WorkflowNodeId;

/* JADX INFO: renamed from: ym.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0014B-\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lym/m;", "", "Lym/i;", "workflowSnapshot", "Lkotlin/Function0;", "", "Lzm/k;", "childTreeSnapshots", "<init>", "(Lym/i;Lkotlin/jvm/functions/Function0;)V", "Lxu/h;", "c", "()Lxu/h;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljt/h;", "b", "()Lym/i;", "()Ljava/util/Map;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13220m {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h workflowSnapshot;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h childTreeSnapshots;

    /* JADX INFO: renamed from: ym.m$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lym/m$a;", "", "<init>", "()V", "Lxu/h;", "bytes", "Lym/m;", "a", "(Lxu/h;)Lym/m;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ym.m$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "Lzm/k;", "Lym/m;", "b", "()Ljava/util/Map;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class C14290a extends AbstractC7746m implements Function0<Map<WorkflowNodeId, ? extends C13220m>> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC12928g f46531i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14290a(InterfaceC12928g interfaceC12928g) {
                super(0);
                this.f46531i = interfaceC12928g;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<WorkflowNodeId, C13220m> invoke() {
                int i10 = this.f46531i.readInt();
                InterfaceC12928g interfaceC12928g = this.f46531i;
                Map mapM31789e = C7688j0.m31789e(i10);
                int i11 = 0;
                while (i11 < i10) {
                    i11++;
                    mapM31789e.put(WorkflowNodeId.INSTANCE.m50414a(C13217j.m48877a(interfaceC12928g)), C13220m.INSTANCE.m48888a(C13217j.m48877a(interfaceC12928g)));
                }
                return C7688j0.m31787c(mapM31789e);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ym.m.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C13220m m48888a(@NotNull C12930h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            C12924e c12924eMo48023d0 = new C12924e().mo48023d0(bytes);
            return new C13220m(Snapshot.INSTANCE.m48872b(C13217j.m48877a(c12924eMo48023d0)), new C14290a(c12924eMo48023d0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ym.m$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Lym/i;", "b", "()Lym/i;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function0<Snapshot> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Snapshot f46532i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Snapshot snapshot) {
            super(0);
            this.f46532i = snapshot;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke() {
            Snapshot snapshot = this.f46532i;
            if (snapshot == null || snapshot.m48870b().m48089I() == 0) {
                return null;
            }
            return snapshot;
        }
    }

    public C13220m(@Nullable Snapshot snapshot, @NotNull Function0<? extends Map<WorkflowNodeId, C13220m>> childTreeSnapshots) {
        Intrinsics.checkNotNullParameter(childTreeSnapshots, "childTreeSnapshots");
        EnumC7344k enumC7344k = EnumC7344k.NONE;
        this.workflowSnapshot = C7342i.m30455a(enumC7344k, new b(snapshot));
        this.childTreeSnapshots = C7342i.m30455a(enumC7344k, childTreeSnapshots);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<WorkflowNodeId, C13220m> m48885a() {
        return (Map) this.childTreeSnapshots.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Snapshot m48886b() {
        return (Snapshot) this.workflowSnapshot.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final C12930h m48887c() {
        Pair pair;
        C12924e c12924e = new C12924e();
        Snapshot snapshotM48886b = m48886b();
        C12930h c12930hM48870b = snapshotM48886b == null ? null : snapshotM48886b.m48870b();
        if (c12930hM48870b == null) {
            c12930hM48870b = C12930h.f45830e;
        }
        C13217j.m48879c(c12924e, c12930hM48870b);
        Map<WorkflowNodeId, C13220m> mapM48885a = m48885a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<WorkflowNodeId, C13220m> entry : mapM48885a.entrySet()) {
            WorkflowNodeId key = entry.getKey();
            C13220m value = entry.getValue();
            C12930h c12930hM50413d = key.m50413d();
            if (c12930hM50413d == null) {
                pair = null;
            } else {
                C12930h c12930hM48887c = value.m48887c();
                if (c12930hM48887c.m48089I() == 0) {
                    c12930hM48887c = null;
                }
                if (c12930hM48887c == null) {
                    pair = null;
                } else {
                    pair = new Pair(c12930hM50413d, c12930hM48887c);
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        c12924e.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair2 = (Pair) obj;
            C12930h c12930h = (C12930h) pair2.m31671a();
            C12930h c12930h2 = (C12930h) pair2.m31672b();
            C13217j.m48879c(c12924e, c12930h);
            C13217j.m48879c(c12924e, c12930h2);
        }
        return c12924e.mo47997F2();
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof C13220m)) {
            return false;
        }
        C13220m c13220m = (C13220m) other;
        return Intrinsics.m31980c(c13220m.m48886b(), m48886b()) && Intrinsics.m31980c(c13220m.m48885a(), m48885a());
    }

    public int hashCode() {
        Snapshot snapshotM48886b = m48886b();
        return ((snapshotM48886b == null ? 0 : snapshotM48886b.hashCode()) * 31) + m48885a().hashCode();
    }
}
