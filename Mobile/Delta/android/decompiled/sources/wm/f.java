package wm;

import iu.p0;
import iu.r1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00130\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lwm/q;", "workflow", "Liu/p0;", "scope", "Llu/p0;", "props", "Lwm/m;", "initialSnapshot", "", "Lwm/t;", "interceptors", "Lkotlin/Function2;", "Llt/b;", "", "", "onOutput", "Lwm/g;", "a", "(Lwm/q;Liu/p0;Llu/p0;Lwm/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Llu/p0;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class f {

    @nt.f(c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", f = "RenderWorkflow.kt", l = {136, 145}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"PropsT", "OutputT", "RenderingT", "Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34561t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f34562u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ xm.m<PropsT, OutputT, RenderingT> f34563v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ lu.c0<g<RenderingT>> f34564w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<OutputT, lt.b<? super Unit>, Object> f34565x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xm.m<PropsT, OutputT, RenderingT> mVar, lu.c0<g<RenderingT>> c0Var, Function2<? super OutputT, ? super lt.b<? super Unit>, ? extends Object> function2, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f34563v = mVar;
            this.f34564w = c0Var;
            this.f34565x = function2;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            a aVar = new a(this.f34563v, this.f34564w, this.f34565x, bVar);
            aVar.f34562u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:23:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:23:0x005b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lt.b to wm.f$a for r7v2 'this'  lt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // nt.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r7.f34561t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.f34562u
                iu.p0 r1 = (iu.p0) r1
                gt.o.b(r8)
                goto L5b
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f34562u
                iu.p0 r1 = (iu.p0) r1
                gt.o.b(r8)
                goto L43
            L26:
                gt.o.b(r8)
                java.lang.Object r8 = r7.f34562u
                iu.p0 r8 = (iu.p0) r8
            L2d:
                boolean r1 = iu.q0.i(r8)
                if (r1 == 0) goto L6e
                xm.m<PropsT, OutputT, RenderingT> r1 = r7.f34563v
                r7.f34562u = r8
                r7.f34561t = r3
                java.lang.Object r1 = r1.f(r7)
                if (r1 != r0) goto L40
                goto L6d
            L40:
                r6 = r1
                r1 = r8
                r8 = r6
            L43:
                wm.v r8 = (wm.WorkflowOutput) r8
                boolean r4 = iu.q0.i(r1)
                if (r4 != 0) goto L4e
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            L4e:
                lu.c0<wm.g<RenderingT>> r4 = r7.f34564w
                xm.m<PropsT, OutputT, RenderingT> r5 = r7.f34563v
                wm.g r5 = r5.g()
                r4.setValue(r5)
                if (r8 != 0) goto L5d
            L5b:
                r8 = r1
                goto L2d
            L5d:
                kotlin.jvm.functions.Function2<OutputT, lt.b<? super kotlin.Unit>, java.lang.Object> r4 = r7.f34565x
                java.lang.Object r8 = r8.a()
                r7.f34562u = r1
                r7.f34561t = r2
                java.lang.Object r8 = r4.invoke(r8, r7)
                if (r8 != r0) goto L5b
            L6d:
                return r0
            L6e:
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: wm.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> lu.p0<g<RenderingT>> a(@NotNull q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull p0 scope, @NotNull lu.p0<? extends PropsT> props, @Nullable m mVar, @NotNull List<? extends t> interceptors, @NotNull Function2<? super OutputT, ? super lt.b<? super Unit>, ? extends Object> onOutput) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        xm.m mVar2 = new xm.m(scope, workflow, props, mVar, xm.c.a(interceptors));
        try {
            lu.c0 c0VarA = r0.a(mVar2.g());
            iu.k.d(scope, null, null, new a(mVar2, c0VarA, onOutput, null), 3, null);
            return c0VarA;
        } catch (Throwable th2) {
            CancellationException cancellationExceptionA = th2 instanceof CancellationException ? th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = r1.a("Workflow runtime failed", th2);
            }
            mVar2.e(cancellationExceptionA);
            throw th2;
        }
    }
}
