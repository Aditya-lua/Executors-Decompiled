package zm;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p452tu.InterfaceC11752d;
import p581ym.AbstractC13225r;
import p581ym.C13220m;
import p581ym.C13230w;
import p581ym.InterfaceC13224q;
import p581ym.InterfaceC13227t;
import p581ym.WorkflowOutput;

/* JADX INFO: renamed from: zm.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004Bo\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012&\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019Jq\u0010#\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010\u001f\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u0017\"\u0004\b\u0003\u0010%2\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010'0&¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b+\u0010,J\u008f\u0001\u0010/\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010-\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0002¢\u0006\u0004\b/\u00100R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R4\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00108R0\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030.098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010:¨\u0006<"}, m31665d2 = {"Lzm/h;", "PropsT", "StateT", "OutputT", "Lzm/f$a;", "", "Lzm/k;", "Lym/m;", "snapshotCache", "Lkotlin/coroutines/CoroutineContext;", "contextForChildren", "Lkotlin/Function1;", "Lym/r;", "", "emitActionToParent", "Lym/t$c;", "workflowSession", "Lym/t;", "interceptor", "Lzm/d;", "idCounter", "<init>", "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V", "", "c", "()V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "handler", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "T", "Ltu/d;", "Lym/v;", "selector", "g", "(Ltu/d;)V", "f", "()Ljava/util/Map;", "initialProps", "Lzm/i;", "d", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lzm/i;", "Ljava/util/Map;", "b", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/jvm/functions/Function1;", "Lym/t$c;", "e", "Lym/t;", "Lzm/d;", "Lzm/a;", "Lzm/a;", "children", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13848h<PropsT, StateT, OutputT> implements C13846f.a<PropsT, StateT, OutputT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Map<WorkflowNodeId, C13220m> snapshotCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext contextForChildren;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>, Object> emitActionToParent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC13227t.c workflowSession;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13227t interceptor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final C13844d idCounter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public C13841a<C13849i<?, ?, ?, ?, ?>> children;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT] */
    /* JADX INFO: renamed from: zm.h$a */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public /* synthetic */ class a<ChildOutputT> extends C7744k implements Function1<ChildOutputT, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7729c0<C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> f48513a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C13848h<PropsT, StateT, OutputT> f48514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7729c0<C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> c7729c0, C13848h<PropsT, StateT, OutputT> c13848h) {
            super(1, Intrinsics.C7723a.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            this.f48513a = c7729c0;
            this.f48514b = c13848h;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(ChildOutputT childoutputt) {
            return C13848h.m50377e(this.f48513a, this.f48514b, childoutputt);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super ym.r<? super PropsT, StateT, ? extends OutputT>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13848h(@Nullable Map<WorkflowNodeId, C13220m> map, @NotNull CoroutineContext contextForChildren, @NotNull Function1<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>, ? extends Object> emitActionToParent, @Nullable InterfaceC13227t.c cVar, @NotNull InterfaceC13227t interceptor, @Nullable C13844d c13844d) {
        Intrinsics.checkNotNullParameter(contextForChildren, "contextForChildren");
        Intrinsics.checkNotNullParameter(emitActionToParent, "emitActionToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.snapshotCache = map;
        this.contextForChildren = contextForChildren;
        this.emitActionToParent = emitActionToParent;
        this.workflowSession = cVar;
        this.interceptor = interceptor;
        this.idCounter = c13844d;
        this.children = new C13841a<>();
    }

    /* JADX INFO: renamed from: e */
    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object m50377e(C7729c0<C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> c7729c0, C13848h<PropsT, StateT, OutputT> c13848h, ChildOutputT childoutputt) {
        C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> c13849i;
        C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> c13849i2 = c7729c0.f29425a;
        if (c13849i2 == null) {
            Intrinsics.m31998u("node");
            c13849i = null;
        } else {
            c13849i = c13849i2;
        }
        return c13848h.emitActionToParent.invoke(c13849i.m50382c(childoutputt));
    }

    @Override // zm.C13846f.a
    /* JADX INFO: renamed from: a */
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT mo50370a(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        for (C13845e.a aVarM50360b = this.children.staging.m50360b(); aVarM50360b != null; aVarM50360b = aVarM50360b.getNextListNode()) {
            if (((C13849i) aVarM50360b).m50387h(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + C13230w.m48935j(child) + ": key=\"" + key + '\"').toString());
            }
        }
        C13841a<C13849i<?, ?, ?, ?, ?>> c13841a = this.children;
        C13845e c13845e = c13841a.active;
        C13845e.a aVarM50379d = null;
        C13845e.a aVar = null;
        for (C13845e.a aVarM50360b2 = c13845e.m50360b(); aVarM50360b2 != null; aVarM50360b2 = aVarM50360b2.getNextListNode()) {
            if (((C13849i) aVarM50360b2).m50387h(child, key)) {
                if (aVar == null) {
                    c13845e.m50363e(aVarM50360b2.getNextListNode());
                } else {
                    aVar.mo50366b(aVarM50360b2.getNextListNode());
                }
                if (Intrinsics.m31980c(c13845e.m50361c(), aVarM50360b2)) {
                    c13845e.m50364f(aVar);
                }
                aVarM50360b2.mo50366b(null);
                aVarM50379d = aVarM50360b2;
                break;
            }
            aVar = aVarM50360b2;
        }
        if (aVarM50379d == null) {
            aVarM50379d = m50379d(child, props, key, handler);
        }
        c13841a.staging.m50362d(aVarM50379d);
        C13849i c13849i = (C13849i) aVarM50379d;
        c13849i.m50389j(handler);
        return (ChildRenderingT) c13849i.m50388i(child.mo48881b(), props);
    }

    /* JADX INFO: renamed from: c */
    public final void m50378c() {
        C13841a<C13849i<?, ?, ?, ?, ?>> c13841a = this.children;
        for (C13845e.a aVarM50360b = c13841a.active.m50360b(); aVarM50360b != null; aVarM50360b = aVarM50360b.getNextListNode()) {
            C13850j.m50392f(((C13849i) aVarM50360b).m50386g(), null, 1, null);
        }
        C13845e c13845e = c13841a.active;
        c13841a.active = c13841a.staging;
        c13841a.staging = c13845e;
        c13841a.staging.m50359a();
        this.snapshotCache = null;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, zm.i, zm.i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>] */
    /* JADX INFO: renamed from: d */
    public final <ChildPropsT, ChildOutputT, ChildRenderingT> C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> m50379d(InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT initialProps, String key, Function1<? super ChildOutputT, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler) {
        WorkflowNodeId workflowNodeIdM50415a = C13852l.m50415a(child, key);
        C7729c0 c7729c0 = new C7729c0();
        Map<WorkflowNodeId, C13220m> map = this.snapshotCache;
        ?? r12 = (C13849i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>) new C13849i(child, handler, new C13850j(workflowNodeIdM50415a, child.mo48881b(), initialProps, map == null ? null : map.get(workflowNodeIdM50415a), this.contextForChildren, new a(c7729c0, this), this.workflowSession, this.interceptor, this.idCounter));
        c7729c0.f29425a = r12;
        return r12;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Map<WorkflowNodeId, C13220m> m50380f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C13845e.a aVarM50360b = this.children.active.m50360b(); aVarM50360b != null; aVarM50360b = aVarM50360b.getNextListNode()) {
            C13849i c13849i = (C13849i) aVarM50360b;
            linkedHashMap.put(c13849i.m50383d(), c13849i.m50386g().m50403o(c13849i.m50385f().mo48881b()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    public final <T> void m50381g(@NotNull InterfaceC11752d<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        for (C13845e.a aVarM50360b = this.children.active.m50360b(); aVarM50360b != null; aVarM50360b = aVarM50360b.getNextListNode()) {
            ((C13849i) aVarM50360b).m50386g().m50404p(selector);
        }
    }
}
