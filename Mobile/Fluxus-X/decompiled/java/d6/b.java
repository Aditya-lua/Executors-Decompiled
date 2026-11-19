package d6;

import com.github.luben.zstd.BuildConfig;
import cv.t;
import cv.v;
import gu.m;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128$X¤\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ld6/b;", "T", "Ld6/e;", "Le6/h;", "tracker", "<init>", "(Le6/h;)V", "value", BuildConfig.FLAVOR, "e", "(Ljava/lang/Object;)Z", "Ly5/d;", "constraints", "Ldv/h;", "Lc6/b;", "a", "(Ly5/d;)Ldv/h;", "Le6/h;", BuildConfig.FLAVOR, "d", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e6.h<T> tracker;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcv/v;", "Lc6/b;", BuildConfig.FLAVOR, "<anonymous>", "(Lcv/v;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {62}, m = "invokeSuspend")
    public static final class a extends m implements Function2<v<? super c6.b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11948t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11949u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b<T> f11950v;

        /* JADX INFO: renamed from: d6.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"d6/b$a$a", "Lc6/a;", "newValue", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0217a implements c6.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<T> f11951a;
            public final /* synthetic */ v<c6.b> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0217a(b<T> bVar, v<? super c6.b> vVar) {
                this.f11951a = bVar;
                this.b = vVar;
            }

            @Override // c6.a
            public void a(T newValue) {
                this.b.a().v(this.f11951a.e(newValue) ? new c6.b.ConstraintsNotMet(this.f11951a.d()) : c6.b.a.f4833a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, eu.b<? super a> bVar2) {
            super(2, bVar2);
            this.f11950v = bVar;
        }

        public static final Unit q(b bVar, C0217a c0217a) {
            bVar.tracker.g(c0217a);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f11950v, bVar);
            aVar.f11949u = obj;
            return aVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f11948t;
            if (i10 == 0) {
                o.b(obj);
                v vVar = (v) this.f11949u;
                final C0217a c0217a = new C0217a(this.f11950v, vVar);
                this.f11950v.tracker.c(c0217a);
                final b<T> bVar = this.f11950v;
                Function0 function0 = new Function0() { // from class: d6.a
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a.q(bVar, c0217a);
                    }
                };
                this.f11948t = 1;
                if (t.a(vVar, function0, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super c6.b> vVar, eu.b<? super Unit> bVar) {
            return ((a) create(vVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public b(@NotNull e6.h<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // d6.e
    @NotNull
    public dv.h<c6.b> a(@NotNull y5.d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return dv.j.d(new a(this, null));
    }

    public abstract int d();

    public abstract boolean e(T value);
}
