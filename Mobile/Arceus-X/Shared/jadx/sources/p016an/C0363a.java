package p016an;

import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.C0967l0;
import com.squareup.workflow1.p052ui.PickledTreesnapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import nu.InterfaceC9586m0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p581ym.C13213f;
import p581ym.C13214g;
import p581ym.InterfaceC13224q;
import p581ym.InterfaceC13227t;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: an.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m31665d2 = {"PropsT", "OutputT", "RenderingT", "Lym/q;", "workflow", "Lku/p0;", "scope", "Lnu/p0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "", "Lym/t;", "interceptors", "Lkotlin/Function2;", "Lnt/b;", "", "", "onOutput", "a", "(Lym/q;Lku/p0;Lnu/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lnu/p0;", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0363a {

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* JADX INFO: renamed from: an.a$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a<RenderingT> implements InterfaceC9575h<RenderingT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f886a;

        /* JADX INFO: renamed from: an.a$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m31665d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class C14064a implements InterfaceC9577i<C13214g<? extends RenderingT>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f887a;

            /* JADX INFO: renamed from: an.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", m39664f = "AndroidRenderWorkflow.kt", m39665l = {137}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
            public static final class C14065a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f888t;

                /* JADX INFO: renamed from: u */
                public int f889u;

                public C14065a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f888t = obj;
                    this.f889u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C14064a.this.emit(null, this);
                }
            }

            public C14064a(InterfaceC9577i interfaceC9577i) {
                this.f887a = interfaceC9577i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            @Nullable
            public Object emit(Object obj, @NotNull InterfaceC9557b interfaceC9557b) {
                C14065a c14065a;
                if (interfaceC9557b instanceof C14065a) {
                    c14065a = (C14065a) interfaceC9557b;
                    int i10 = c14065a.f889u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14065a.f889u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14065a = new C14065a(interfaceC9557b);
                    }
                } else {
                    c14065a = new C14065a(interfaceC9557b);
                }
                Object obj2 = c14065a.f888t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14065a.f889u;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    InterfaceC9577i interfaceC9577i = this.f887a;
                    Object objM48867a = ((C13214g) obj).m48867a();
                    c14065a.f889u = 1;
                    if (interfaceC9577i.emit(objM48867a, c14065a) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj2);
                }
                return Unit.f29331a;
            }
        }

        public a(InterfaceC9575h interfaceC9575h) {
            this.f886a = interfaceC9575h;
        }

        @Override // nu.InterfaceC9575h
        @Nullable
        public Object collect(@NotNull InterfaceC9577i interfaceC9577i, @NotNull InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f886a.collect(new C14064a(interfaceC9577i), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* JADX INFO: renamed from: an.a$b */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"PropsT", "OutputT", "RenderingT", "Lym/g;", "it", "", "<anonymous>", "(Lym/g;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", m39664f = "AndroidRenderWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b<RenderingT> extends AbstractC10351m implements Function2<C13214g<? extends RenderingT>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f891t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f892u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C0967l0 f893v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0967l0 c0967l0, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f893v = c0967l0;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f893v, interfaceC9557b);
            bVar.f892u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f891t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C13214g c13214g = (C13214g) this.f892u;
            C0967l0 c0967l0 = this.f893v;
            if (c0967l0 != null) {
                c0967l0.m4954i("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new PickledTreesnapshot(c13214g.getSnapshot()));
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull C13214g<? extends RenderingT> c13214g, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(c13214g, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <PropsT, OutputT, RenderingT> InterfaceC9592p0<RenderingT> m1377a(@NotNull InterfaceC13224q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull InterfaceC7906p0 scope, @NotNull InterfaceC9592p0<? extends PropsT> props, @Nullable C0967l0 c0967l0, @NotNull List<? extends InterfaceC13227t> interceptors, @NotNull Function2<? super OutputT, ? super InterfaceC9557b<? super Unit>, ? extends Object> onOutput) {
        PickledTreesnapshot pickledTreesnapshot;
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        InterfaceC9592p0 interfaceC9592p0M48866a = C13213f.m48866a(workflow, scope, props, (c0967l0 == null || (pickledTreesnapshot = (PickledTreesnapshot) c0967l0.m4947b("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : pickledTreesnapshot.getSnapshot(), interceptors, onOutput);
        return C9579j.m37775L(new a(C9579j.m37768E(interfaceC9592p0M48866a, new b(c0967l0, null))), scope, InterfaceC9586m0.INSTANCE.m37829a(), ((C13214g) interfaceC9592p0M48866a.getValue()).m48867a());
    }
}
