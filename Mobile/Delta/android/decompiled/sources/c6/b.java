package c6;

import gt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.t;
import ku.v;
import nt.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138$X¤\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lc6/b;", "T", "Lc6/e;", "Ld6/h;", "tracker", "<init>", "(Ld6/h;)V", "value", "", "e", "(Ljava/lang/Object;)Z", "Lx5/d;", "constraints", "Llu/h;", "Lb6/b;", "b", "(Lx5/d;)Llu/h;", "a", "Ld6/h;", "", "d", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d6.h<T> tracker;

    @nt.f(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {62}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/v;", "Lb6/b;", "", "<anonymous>", "(Lku/v;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends m implements Function2<v<? super b6.b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4803t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4804u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b<T> f4805v;

        /* JADX INFO: renamed from: c6.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"c6/b$a$a", "Lb6/a;", "newValue", "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0101a implements b6.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<T> f4806a;
            public final /* synthetic */ v<b6.b> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0101a(b<T> bVar, v<? super b6.b> vVar) {
                this.f4806a = bVar;
                this.b = vVar;
            }

            @Override // b6.a
            public void a(T newValue) {
                this.b.a().y(this.f4806a.e(newValue) ? new b6.b.ConstraintsNotMet(this.f4806a.d()) : b6.b.a.f3848a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, lt.b<? super a> bVar2) {
            super(2, bVar2);
            this.f4805v = bVar;
        }

        public static final Unit q(b bVar, C0101a c0101a) {
            bVar.tracker.g(c0101a);
            return Unit.f22938a;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            a aVar = new a(this.f4805v, bVar);
            aVar.f4804u = obj;
            return aVar;
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4803t;
            if (i10 == 0) {
                o.b(obj);
                v vVar = (v) this.f4804u;
                final C0101a c0101a = new C0101a(this.f4805v, vVar);
                this.f4805v.tracker.c(c0101a);
                final b<T> bVar = this.f4805v;
                Function0 function0 = new Function0() { // from class: c6.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a.q(bVar, c0101a);
                    }
                };
                this.f4803t = 1;
                if (t.a(vVar, function0, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super b6.b> vVar, lt.b<? super Unit> bVar) {
            return ((a) create(vVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public b(@NotNull d6.h<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // c6.e
    @NotNull
    public lu.h<b6.b> b(@NotNull x5.d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return lu.j.d(new a(this, null));
    }

    public abstract int d();

    public abstract boolean e(T value);
}
