package zm;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.WorkflowOutput;
import ym.q;
import ym.r;
import ym.t;
import ym.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004Bo\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012&\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019Jq\u0010#\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010\u001f\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u0017\"\u0004\b\u0003\u0010%2\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010'0&¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b+\u0010,J\u008f\u0001\u0010/\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010-\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0002¢\u0006\u0004\b/\u00100R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R4\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00108R0\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030.098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010:¨\u0006<"}, d2 = {"Lzm/h;", "PropsT", "StateT", "OutputT", "Lzm/f$a;", "", "Lzm/k;", "Lym/m;", "snapshotCache", "Lkotlin/coroutines/CoroutineContext;", "contextForChildren", "Lkotlin/Function1;", "Lym/r;", "", "emitActionToParent", "Lym/t$c;", "workflowSession", "Lym/t;", "interceptor", "Lzm/d;", "idCounter", "<init>", "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V", "", "c", "()V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "handler", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "T", "Ltu/d;", "Lym/v;", "selector", "g", "(Ltu/d;)V", "f", "()Ljava/util/Map;", "initialProps", "Lzm/i;", "d", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lzm/i;", "Ljava/util/Map;", "b", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/jvm/functions/Function1;", "Lym/t$c;", "e", "Lym/t;", "Lzm/d;", "Lzm/a;", "Lzm/a;", "children", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class h<PropsT, StateT, OutputT> implements f.a<PropsT, StateT, OutputT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Map<WorkflowNodeId, ym.m> snapshotCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext contextForChildren;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<r<? super PropsT, StateT, ? extends OutputT>, Object> emitActionToParent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final t.c workflowSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t interceptor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final d idCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public zm.a<i<?, ?, ?, ?, ?>> children;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT] */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a<ChildOutputT> extends kotlin.jvm.internal.k implements Function1<ChildOutputT, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> f37688a;
        public final /* synthetic */ h<PropsT, StateT, OutputT> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> c0Var, h<PropsT, StateT, OutputT> hVar) {
            super(1, Intrinsics.a.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            this.f37688a = c0Var;
            this.b = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(ChildOutputT childoutputt) {
            return h.e(this.f37688a, this.b, childoutputt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Nullable Map<WorkflowNodeId, ym.m> map, @NotNull CoroutineContext contextForChildren, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>, ? extends Object> emitActionToParent, @Nullable t.c cVar, @NotNull t interceptor, @Nullable d dVar) {
        Intrinsics.checkNotNullParameter(contextForChildren, "contextForChildren");
        Intrinsics.checkNotNullParameter(emitActionToParent, "emitActionToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.snapshotCache = map;
        this.contextForChildren = contextForChildren;
        this.emitActionToParent = emitActionToParent;
        this.workflowSession = cVar;
        this.interceptor = interceptor;
        this.idCounter = dVar;
        this.children = new zm.a<>();
    }

    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object e(c0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> c0Var, h<PropsT, StateT, OutputT> hVar, ChildOutputT childoutputt) {
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar;
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar2 = c0Var.f22552a;
        if (iVar2 == null) {
            Intrinsics.u("node");
            iVar = null;
        } else {
            iVar = iVar2;
        }
        return hVar.emitActionToParent.invoke(iVar.c(childoutputt));
    }

    @Override // zm.f.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        for (e.a aVarB = this.children.staging.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            if (((i) aVarB).h(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + w.j(child) + ": key=\"" + key + '\"').toString());
            }
        }
        zm.a<i<?, ?, ?, ?, ?>> aVar = this.children;
        e eVar = aVar.active;
        e.a aVarD = null;
        e.a aVar2 = null;
        for (e.a aVarB2 = eVar.b(); aVarB2 != null; aVarB2 = aVarB2.getNextListNode()) {
            if (((i) aVarB2).h(child, key)) {
                if (aVar2 == null) {
                    eVar.e(aVarB2.getNextListNode());
                } else {
                    aVar2.b(aVarB2.getNextListNode());
                }
                if (Intrinsics.c(eVar.c(), aVarB2)) {
                    eVar.f(aVar2);
                }
                aVarB2.b(null);
                aVarD = aVarB2;
                break;
            }
            aVar2 = aVarB2;
        }
        if (aVarD == null) {
            aVarD = d(child, props, key, handler);
        }
        aVar.staging.d(aVarD);
        i iVar = (i) aVarD;
        iVar.j(handler);
        return (ChildRenderingT) iVar.i(child.b(), props);
    }

    public final void c() {
        zm.a<i<?, ?, ?, ?, ?>> aVar = this.children;
        for (e.a aVarB = aVar.active.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            j.f(((i) aVarB).g(), null, 1, null);
        }
        e eVar = aVar.active;
        aVar.active = aVar.staging;
        aVar.staging = eVar;
        aVar.staging.a();
        this.snapshotCache = null;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, zm.i, zm.i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>] */
    public final <ChildPropsT, ChildOutputT, ChildRenderingT> i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT initialProps, String key, Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        WorkflowNodeId workflowNodeIdA = l.a(child, key);
        c0 c0Var = new c0();
        Map<WorkflowNodeId, ym.m> map = this.snapshotCache;
        ?? r12 = (i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>) new i(child, handler, new j(workflowNodeIdA, child.b(), initialProps, map == null ? null : map.get(workflowNodeIdA), this.contextForChildren, new a(c0Var, this), this.workflowSession, this.interceptor, this.idCounter));
        c0Var.f22552a = r12;
        return r12;
    }

    @NotNull
    public final Map<WorkflowNodeId, ym.m> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e.a aVarB = this.children.active.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            i iVar = (i) aVarB;
            linkedHashMap.put(iVar.d(), iVar.g().o(iVar.f().b()));
        }
        return linkedHashMap;
    }

    public final <T> void g(@NotNull tu.d<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        for (e.a aVarB = this.children.active.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            ((i) aVarB).g().p(selector);
        }
    }
}
