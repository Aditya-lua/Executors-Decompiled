package c6;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.t;
import mu.v;
import org.jetbrains.annotations.NotNull;
import pt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138$X¤\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lc6/b;", "T", "Lc6/e;", "Ld6/h;", "tracker", "<init>", "(Ld6/h;)V", "value", "", "e", "(Ljava/lang/Object;)Z", "Lx5/d;", "constraints", "Lnu/h;", "Lb6/b;", "b", "(Lx5/d;)Lnu/h;", "a", "Ld6/h;", "", "d", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d6.h<T> tracker;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/v;", "Lb6/b;", "", "<anonymous>", "(Lmu/v;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {62}, m = "invokeSuspend")
    public static final class a extends m implements Function2<v<? super b6.b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4637t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4638u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b<T> f4639v;

        /* JADX INFO: renamed from: c6.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"c6/b$a$a", "Lb6/a;", "newValue", "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0101a implements b6.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<T> f4640a;
            public final /* synthetic */ v<b6.b> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0101a(b<T> bVar, v<? super b6.b> vVar) {
                this.f4640a = bVar;
                this.b = vVar;
            }

            @Override // b6.a
            public void a(T newValue) {
                this.b.a().w(this.f4640a.e(newValue) ? new b6.b.ConstraintsNotMet(this.f4640a.getReason()) : b6.b.a.f3950a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, nt.b<? super a> bVar2) {
            super(2, bVar2);
            this.f4639v = bVar;
        }

        public static final Unit s(b bVar, C0101a c0101a) {
            bVar.tracker.g(c0101a);
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f4639v, bVar);
            aVar.f4638u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f4637t;
            if (i10 == 0) {
                o.b(obj);
                v vVar = (v) this.f4638u;
                final C0101a c0101a = new C0101a(this.f4639v, vVar);
                this.f4639v.tracker.c(c0101a);
                final b<T> bVar = this.f4639v;
                Function0 function0 = new Function0() { // from class: c6.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a.s(bVar, c0101a);
                    }
                };
                this.f4637t = 1;
                if (t.a(vVar, function0, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super b6.b> vVar, nt.b<? super Unit> bVar) {
            return ((a) create(vVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public b(@NotNull d6.h<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // c6.e
    @NotNull
    public nu.h<b6.b> b(@NotNull x5.d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return nu.j.d(new a(this, null));
    }

    /* JADX INFO: renamed from: d */
    public abstract int getReason();

    public abstract boolean e(T value);
}
