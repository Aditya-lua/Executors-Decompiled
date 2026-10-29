package ym;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zm.WorkflowNodeId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0014B-\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lym/m;", "", "Lym/i;", "workflowSnapshot", "Lkotlin/Function0;", "", "Lzm/k;", "childTreeSnapshots", "<init>", "(Lym/i;Lkotlin/jvm/functions/Function0;)V", "Lxu/h;", "c", "()Lxu/h;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljt/h;", "b", "()Lym/i;", "()Ljava/util/Map;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h workflowSnapshot;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h childTreeSnapshots;

    /* JADX INFO: renamed from: ym.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lym/m$a;", "", "<init>", "()V", "Lxu/h;", "bytes", "Lym/m;", "a", "(Lxu/h;)Lym/m;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ym.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lzm/k;", "Lym/m;", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 6, 0})
        public static final class C0665a extends kotlin.jvm.internal.m implements Function0<Map<WorkflowNodeId, ? extends m>> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ xu.g f35951i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0665a(xu.g gVar) {
                super(0);
                this.f35951i = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<WorkflowNodeId, m> invoke() {
                int i10 = this.f35951i.readInt();
                xu.g gVar = this.f35951i;
                Map mapE = j0.e(i10);
                int i11 = 0;
                while (i11 < i10) {
                    i11++;
                    mapE.put(WorkflowNodeId.INSTANCE.a(j.a(gVar)), m.INSTANCE.a(j.a(gVar)));
                }
                return j0.c(mapE);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a(@NotNull xu.h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            xu.e eVarD0 = new xu.e().d0(bytes);
            return new m(Snapshot.INSTANCE.b(j.a(eVarD0)), new C0665a(eVarD0));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lym/i;", "b", "()Lym/i;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function0<Snapshot> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Snapshot f35952i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Snapshot snapshot) {
            super(0);
            this.f35952i = snapshot;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke() {
            Snapshot snapshot = this.f35952i;
            if (snapshot == null || snapshot.b().I() == 0) {
                return null;
            }
            return snapshot;
        }
    }

    public m(@Nullable Snapshot snapshot, @NotNull Function0<? extends Map<WorkflowNodeId, m>> childTreeSnapshots) {
        Intrinsics.checkNotNullParameter(childTreeSnapshots, "childTreeSnapshots");
        jt.k kVar = jt.k.NONE;
        this.workflowSnapshot = jt.i.a(kVar, new b(snapshot));
        this.childTreeSnapshots = jt.i.a(kVar, childTreeSnapshots);
    }

    @NotNull
    public final Map<WorkflowNodeId, m> a() {
        return (Map) this.childTreeSnapshots.getValue();
    }

    @Nullable
    public final Snapshot b() {
        return (Snapshot) this.workflowSnapshot.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    @NotNull
    public final xu.h c() {
        Pair pair;
        xu.e eVar = new xu.e();
        Snapshot snapshotB = b();
        xu.h hVarB = snapshotB == null ? null : snapshotB.b();
        if (hVarB == null) {
            hVarB = xu.h.f35343e;
        }
        j.c(eVar, hVarB);
        Map<WorkflowNodeId, m> mapA = a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<WorkflowNodeId, m> entry : mapA.entrySet()) {
            WorkflowNodeId key = entry.getKey();
            m value = entry.getValue();
            xu.h hVarD = key.d();
            if (hVarD == null) {
                pair = null;
            } else {
                xu.h hVarC = value.c();
                if (hVarC.I() == 0) {
                    hVarC = null;
                }
                if (hVarC == null) {
                    pair = null;
                } else {
                    pair = new Pair(hVarD, hVarC);
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        eVar.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair2 = (Pair) obj;
            xu.h hVar = (xu.h) pair2.a();
            xu.h hVar2 = (xu.h) pair2.b();
            j.c(eVar, hVar);
            j.c(eVar, hVar2);
        }
        return eVar.F2();
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.c(mVar.b(), b()) && Intrinsics.c(mVar.a(), a());
    }

    public int hashCode() {
        Snapshot snapshotB = b();
        return ((snapshotB == null ? 0 : snapshotB.hashCode()) * 31) + a().hashCode();
    }
}
