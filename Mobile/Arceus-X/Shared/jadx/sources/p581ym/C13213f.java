package p581ym;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7882k;
import p256ku.C7915r1;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import zm.C13843c;
import zm.C13853m;

/* JADX INFO: renamed from: ym.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00130\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m31665d2 = {"PropsT", "OutputT", "RenderingT", "Lym/q;", "workflow", "Lku/p0;", "scope", "Lnu/p0;", "props", "Lym/m;", "initialSnapshot", "", "Lym/t;", "interceptors", "Lkotlin/Function2;", "Lnt/b;", "", "", "onOutput", "Lym/g;", "a", "(Lym/q;Lku/p0;Lnu/p0;Lym/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lnu/p0;", "wf1-workflow-runtime"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13213f {

    /* JADX INFO: renamed from: ym.f$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"PropsT", "OutputT", "RenderingT", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", m39664f = "RenderWorkflow.kt", m39665l = {136, 145}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46508t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f46509u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13853m<PropsT, OutputT, RenderingT> f46510v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC9566c0<C13214g<RenderingT>> f46511w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Function2<OutputT, InterfaceC9557b<? super Unit>, Object> f46512x;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super OutputT, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C13853m<PropsT, OutputT, RenderingT> c13853m, InterfaceC9566c0<C13214g<RenderingT>> interfaceC9566c0, Function2<? super OutputT, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f46510v = c13853m;
            this.f46511w = interfaceC9566c0;
            this.f46512x = function2;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f46510v, this.f46511w, this.f46512x, interfaceC9557b);
            aVar.f46509u = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:23:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:23:0x005b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to ym.f$a for r7v2 'this'  nt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.AbstractC10339a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r7.f46508t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.f46509u
                ku.p0 r1 = (p256ku.InterfaceC7906p0) r1
                p229jt.C7348o.m30470b(r8)
                goto L5b
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f46509u
                ku.p0 r1 = (p256ku.InterfaceC7906p0) r1
                p229jt.C7348o.m30470b(r8)
                goto L43
            L26:
                p229jt.C7348o.m30470b(r8)
                java.lang.Object r8 = r7.f46509u
                ku.p0 r8 = (p256ku.InterfaceC7906p0) r8
            L2d:
                boolean r1 = p256ku.C7910q0.m32893i(r8)
                if (r1 == 0) goto L6e
                zm.m<PropsT, OutputT, RenderingT> r1 = r7.f46510v
                r7.f46509u = r8
                r7.f46508t = r3
                java.lang.Object r1 = r1.m50422f(r7)
                if (r1 != r0) goto L40
                goto L6d
            L40:
                r6 = r1
                r1 = r8
                r8 = r6
            L43:
                ym.v r8 = (p581ym.WorkflowOutput) r8
                boolean r4 = p256ku.C7910q0.m32893i(r1)
                if (r4 != 0) goto L4e
                kotlin.Unit r8 = kotlin.Unit.f29331a
                return r8
            L4e:
                nu.c0<ym.g<RenderingT>> r4 = r7.f46511w
                zm.m<PropsT, OutputT, RenderingT> r5 = r7.f46510v
                ym.g r5 = r5.m50423g()
                r4.setValue(r5)
                if (r8 != 0) goto L5d
            L5b:
                r8 = r1
                goto L2d
            L5d:
                kotlin.jvm.functions.Function2<OutputT, nt.b<? super kotlin.Unit>, java.lang.Object> r4 = r7.f46512x
                java.lang.Object r8 = r8.m48925a()
                r7.f46509u = r1
                r7.f46508t = r2
                java.lang.Object r8 = r4.invoke(r8, r7)
                if (r8 != r0) goto L5b
            L6d:
                return r0
            L6e:
                kotlin.Unit r8 = kotlin.Unit.f29331a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p581ym.C13213f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <PropsT, OutputT, RenderingT> InterfaceC9592p0<C13214g<RenderingT>> m48866a(@NotNull InterfaceC13224q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull InterfaceC7906p0 scope, @NotNull InterfaceC9592p0<? extends PropsT> props, @Nullable C13220m c13220m, @NotNull List<? extends InterfaceC13227t> interceptors, @NotNull Function2<? super OutputT, ? super InterfaceC9557b<? super Unit>, ? extends Object> onOutput) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        C13853m c13853m = new C13853m(scope, workflow, props, c13220m, C13843c.m50357a(interceptors));
        try {
            InterfaceC9566c0 interfaceC9566c0M37859a = C9596r0.m37859a(c13853m.m50423g());
            C7882k.m32780d(scope, null, null, new a(c13853m, interfaceC9566c0M37859a, onOutput, null), 3, null);
            return interfaceC9566c0M37859a;
        } catch (Throwable th2) {
            CancellationException cancellationExceptionM32905a = th2 instanceof CancellationException ? th2 : null;
            if (cancellationExceptionM32905a == null) {
                cancellationExceptionM32905a = C7915r1.m32905a("Workflow runtime failed", th2);
            }
            c13853m.m50421e(cancellationExceptionM32905a);
            throw th2;
        }
    }
}
