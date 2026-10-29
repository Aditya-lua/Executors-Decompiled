package x3;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt3/i;", "Lx3/f;", "Lkotlin/Function2;", "Lx3/c;", "Lnt/b;", "", "", "transform", "a", "(Lt3/i;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx3/f;", "it", "<anonymous>", "(Lx3/f;)Lx3/f;"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    public static final class a extends m implements Function2<f, nt.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34697t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f34698u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<c, nt.b<? super Unit>, Object> f34699v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super c, ? super nt.b<? super Unit>, ? extends Object> function2, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f34699v = function2;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            a aVar = new a(this.f34699v, bVar);
            aVar.f34698u = obj;
            return aVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f34697t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f34698u;
                o.b(obj);
                return cVar;
            }
            o.b(obj);
            c cVarC = ((f) this.f34698u).c();
            Function2<c, nt.b<? super Unit>, Object> function2 = this.f34699v;
            this.f34698u = cVarC;
            this.f34697t = 1;
            return function2.invoke(cVarC, this) == objE ? objE : cVarC;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull f fVar, @Nullable nt.b<? super f> bVar) {
            return ((a) create(fVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final Object a(@NotNull t3.i<f> iVar, @NotNull Function2<? super c, ? super nt.b<? super Unit>, ? extends Object> function2, @NotNull nt.b<? super f> bVar) {
        return iVar.a(new a(function2, null), bVar);
    }
}
