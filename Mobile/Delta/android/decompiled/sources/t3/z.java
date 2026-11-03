package t3;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lt3/z;", "", "<init>", "()V", "", "b", "(Llt/b;)Ljava/lang/Object;", "a", "c", "Lsu/a;", "Lsu/a;", "runMutex", "Liu/x;", "Liu/x;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final su.a runMutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final iu.x<Unit> didRun = iu.z.c(null, 1, null);

    @nt.f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32102t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32103u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f32104v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32106x;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32104v = obj;
            this.f32106x |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    @Nullable
    public final Object a(@NotNull lt.b<? super Unit> bVar) {
        Object objN = this.didRun.n(bVar);
        return objN == mt.c.e() ? objN : Unit.f22938a;
    }

    @Nullable
    public abstract Object b(@NotNull lt.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull lt.b<? super Unit> bVar) throws Throwable {
        a aVar;
        su.a aVar2;
        z zVar;
        su.a aVar3;
        Throwable th2;
        z zVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f32106x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32106x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f32104v;
        Object objE = mt.c.e();
        int i11 = aVar.f32106x;
        try {
            if (i11 == 0) {
                gt.o.b(obj);
                if (this.didRun.d()) {
                    return Unit.f22938a;
                }
                aVar2 = this.runMutex;
                aVar.f32102t = this;
                aVar.f32103u = aVar2;
                aVar.f32106x = 1;
                if (aVar2.b(null, aVar) != objE) {
                    zVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (su.a) aVar.f32103u;
                zVar2 = (z) aVar.f32102t;
                try {
                    gt.o.b(obj);
                    iu.x<Unit> xVar = zVar2.didRun;
                    Unit unit = Unit.f22938a;
                    xVar.v(unit);
                    aVar3.f(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.f(null);
                    throw th2;
                }
            }
            su.a aVar4 = (su.a) aVar.f32103u;
            zVar = (z) aVar.f32102t;
            gt.o.b(obj);
            aVar2 = aVar4;
            if (zVar.didRun.d()) {
                Unit unit2 = Unit.f22938a;
                aVar2.f(null);
                return unit2;
            }
            aVar.f32102t = zVar;
            aVar.f32103u = aVar2;
            aVar.f32106x = 2;
            if (zVar.b(aVar) != objE) {
                aVar3 = aVar2;
                zVar2 = zVar;
                iu.x<Unit> xVar2 = zVar2.didRun;
                Unit unit3 = Unit.f22938a;
                xVar2.v(unit3);
                aVar3.f(null);
                return unit3;
            }
            return objE;
        } catch (Throwable th4) {
            aVar3 = aVar2;
            th2 = th4;
            aVar3.f(null);
            throw th2;
        }
    }
}
