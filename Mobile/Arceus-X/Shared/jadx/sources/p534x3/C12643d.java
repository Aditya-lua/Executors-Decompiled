package p534x3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p440t3.InterfaceC11490i;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x3.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lx3/d;", "Lt3/i;", "Lx3/f;", "delegate", "<init>", "(Lt3/i;)V", "Lkotlin/Function2;", "Lnt/b;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Lt3/i;", "Lnu/h;", "getData", "()Lnu/h;", "data", "datastore-preferences-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12643d implements InterfaceC11490i<AbstractC12645f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11490i<AbstractC12645f> delegate;

    /* JADX INFO: renamed from: x3.d$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lx3/f;", "it", "<anonymous>", "(Lx3/f;)Lx3/f;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m39664f = "PreferenceDataStoreFactory.kt", m39665l = {94}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<AbstractC12645f, InterfaceC9557b<? super AbstractC12645f>, Object> {

        /* JADX INFO: renamed from: t */
        public int f44965t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f44966u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function2<AbstractC12645f, InterfaceC9557b<? super AbstractC12645f>, Object> f44967v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super x3.f, ? super nt.b<? super x3.f>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super AbstractC12645f, ? super InterfaceC9557b<? super AbstractC12645f>, ? extends Object> function2, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f44967v = function2;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f44967v, interfaceC9557b);
            aVar.f44966u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f44965t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AbstractC12645f abstractC12645f = (AbstractC12645f) this.f44966u;
                Function2<AbstractC12645f, InterfaceC9557b<? super AbstractC12645f>, Object> function2 = this.f44967v;
                this.f44965t = 1;
                obj = function2.invoke(abstractC12645f, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            AbstractC12645f abstractC12645f2 = (AbstractC12645f) obj;
            Intrinsics.m31981d(abstractC12645f2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((C12642c) abstractC12645f2).m47091f();
            return abstractC12645f2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC12645f abstractC12645f, @Nullable InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
            return ((a) create(abstractC12645f, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C12643d(@NotNull InterfaceC11490i<AbstractC12645f> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // p440t3.InterfaceC11490i
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42991a(@NotNull Function2<? super AbstractC12645f, ? super InterfaceC9557b<? super AbstractC12645f>, ? extends Object> function2, @NotNull InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
        return this.delegate.mo42991a(new a(function2, null), interfaceC9557b);
    }

    @Override // p440t3.InterfaceC11490i
    @NotNull
    public InterfaceC9575h<AbstractC12645f> getData() {
        return this.delegate.getData();
    }
}
