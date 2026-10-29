package p042c6;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.C8685t;
import mu.InterfaceC8687v;
import nu.C9579j;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import p026b6.AbstractC1237b;
import p026b6.InterfaceC1236a;
import p069d6.AbstractC4457h;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.C12694d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: c6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138$X¤\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m31665d2 = {"Lc6/b;", "T", "Lc6/e;", "Ld6/h;", "tracker", "<init>", "(Ld6/h;)V", "value", "", "e", "(Ljava/lang/Object;)Z", "Lx5/d;", "constraints", "Lnu/h;", "Lb6/b;", "b", "(Lx5/d;)Lnu/h;", "a", "Ld6/h;", "", "d", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC1542b<T> implements InterfaceC1545e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC4457h<T> tracker;

    /* JADX INFO: renamed from: c6.b$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lmu/v;", "Lb6/b;", "", "<anonymous>", "(Lmu/v;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", m39664f = "ContraintControllers.kt", m39665l = {62}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC8687v<? super AbstractC1237b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f6226t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f6227u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC1542b<T> f6228v;

        /* JADX INFO: renamed from: c6.b$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"c6/b$a$a", "Lb6/a;", "newValue", "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14103a implements InterfaceC1236a<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC1542b<T> f6229a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC8687v<AbstractC1237b> f6230b;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: mu.v<? super b6.b> */
            /* JADX WARN: Multi-variable type inference failed */
            public C14103a(AbstractC1542b<T> abstractC1542b, InterfaceC8687v<? super AbstractC1237b> interfaceC8687v) {
                this.f6229a = abstractC1542b;
                this.f6230b = interfaceC8687v;
            }

            @Override // p026b6.InterfaceC1236a
            /* JADX INFO: renamed from: a */
            public void mo6932a(T newValue) {
                this.f6230b.mo34971a().mo34870w(this.f6229a.mo8133e(newValue) ? new AbstractC1237b.ConstraintsNotMet(this.f6229a.mo8132d()) : AbstractC1237b.a.f5166a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1542b<T> abstractC1542b, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f6228v = abstractC1542b;
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m8135s(AbstractC1542b abstractC1542b, C14103a c14103a) {
            abstractC1542b.tracker.m22390g(c14103a);
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f6228v, interfaceC9557b);
            aVar.f6227u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6226t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC8687v interfaceC8687v = (InterfaceC8687v) this.f6227u;
                final C14103a c14103a = new C14103a(this.f6228v, interfaceC8687v);
                this.f6228v.tracker.m22387c(c14103a);
                final AbstractC1542b<T> abstractC1542b = this.f6228v;
                Function0 function0 = new Function0() { // from class: c6.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC1542b.a.m8135s(abstractC1542b, c14103a);
                    }
                };
                this.f6226t = 1;
                if (C8685t.m34964a(interfaceC8687v, function0, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8687v<? super AbstractC1237b> interfaceC8687v, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC8687v, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public AbstractC1542b(@NotNull AbstractC4457h<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // p042c6.InterfaceC1545e
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC9575h<AbstractC1237b> mo6940b(@NotNull C12694d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return C9579j.m37787d(new a(this, null));
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo8132d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo8133e(T value);
}
