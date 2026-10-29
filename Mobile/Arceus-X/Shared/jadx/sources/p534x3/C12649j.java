package p534x3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p440t3.InterfaceC11490i;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x3.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lt3/i;", "Lx3/f;", "Lkotlin/Function2;", "Lx3/c;", "Lnt/b;", "", "", "transform", "a", "(Lt3/i;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "datastore-preferences-core_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12649j {

    /* JADX INFO: renamed from: x3.j$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lx3/f;", "it", "<anonymous>", "(Lx3/f;)Lx3/f;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m39664f = "Preferences.kt", m39665l = {358}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<AbstractC12645f, InterfaceC9557b<? super AbstractC12645f>, Object> {

        /* JADX INFO: renamed from: t */
        public int f44975t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f44976u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function2<C12642c, InterfaceC9557b<? super Unit>, Object> f44977v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super x3.c, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super C12642c, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f44977v = function2;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f44977v, interfaceC9557b);
            aVar.f44976u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f44975t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C12642c c12642c = (C12642c) this.f44976u;
                C7348o.m30470b(obj);
                return c12642c;
            }
            C7348o.m30470b(obj);
            C12642c c12642cM47101c = ((AbstractC12645f) this.f44976u).m47101c();
            Function2<C12642c, InterfaceC9557b<? super Unit>, Object> function2 = this.f44977v;
            this.f44976u = c12642cM47101c;
            this.f44975t = 1;
            return function2.invoke(c12642cM47101c, this) == objM38805e ? objM38805e : c12642cM47101c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC12645f abstractC12645f, @Nullable InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
            return ((a) create(abstractC12645f, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m47120a(@NotNull InterfaceC11490i<AbstractC12645f> interfaceC11490i, @NotNull Function2<? super C12642c, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
        return interfaceC11490i.mo42991a(new a(function2, null), interfaceC9557b);
    }
}
