package x3;

import gt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx3/d;", "Lt3/i;", "Lx3/f;", "delegate", "<init>", "(Lt3/i;)V", "Lkotlin/Function2;", "Llt/b;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "Lt3/i;", "Llu/h;", "getData", "()Llu/h;", "data", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements t3.i<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.i<f> delegate;

    @nt.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx3/f;", "it", "<anonymous>", "(Lx3/f;)Lx3/f;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends m implements Function2<f, lt.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35186t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35187u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<f, lt.b<? super f>, Object> f35188v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super f, ? super lt.b<? super f>, ? extends Object> function2, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f35188v = function2;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            a aVar = new a(this.f35188v, bVar);
            aVar.f35187u = obj;
            return aVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f35186t;
            if (i10 == 0) {
                o.b(obj);
                f fVar = (f) this.f35187u;
                Function2<f, lt.b<? super f>, Object> function2 = this.f35188v;
                this.f35186t = 1;
                obj = function2.invoke(fVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.d(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull f fVar, @Nullable lt.b<? super f> bVar) {
            return ((a) create(fVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public d(@NotNull t3.i<f> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // t3.i
    @Nullable
    public Object a(@NotNull Function2<? super f, ? super lt.b<? super f>, ? extends Object> function2, @NotNull lt.b<? super f> bVar) {
        return this.delegate.a(new a(function2, null), bVar);
    }

    @Override // t3.i
    @NotNull
    public lu.h<f> getData() {
        return this.delegate.getData();
    }
}
