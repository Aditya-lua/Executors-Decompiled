package t3;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lt3/z;", "", "<init>", "()V", "", "b", "(Lnt/b;)Ljava/lang/Object;", "a", "c", "Luu/a;", "Luu/a;", "runMutex", "Lku/x;", "Lku/x;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a runMutex = uu.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ku.x<Unit> didRun = ku.z.c(null, 1, null);

    @pt.f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31583t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31584u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31585v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31587x;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31585v = obj;
            this.f31587x |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    @Nullable
    public final Object a(@NotNull nt.b<? super Unit> bVar) {
        Object objB = this.didRun.B(bVar);
        return objB == ot.c.e() ? objB : Unit.f22483a;
    }

    @Nullable
    public abstract Object b(@NotNull nt.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull nt.b<? super Unit> bVar) throws Throwable {
        a aVar;
        uu.a aVar2;
        z zVar;
        uu.a aVar3;
        Throwable th2;
        z zVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f31587x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31587x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f31585v;
        Object objE = ot.c.e();
        int i11 = aVar.f31587x;
        try {
            if (i11 == 0) {
                jt.o.b(obj);
                if (this.didRun.d()) {
                    return Unit.f22483a;
                }
                aVar2 = this.runMutex;
                aVar.f31583t = this;
                aVar.f31584u = aVar2;
                aVar.f31587x = 1;
                if (aVar2.f(null, aVar) != objE) {
                    zVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (uu.a) aVar.f31584u;
                zVar2 = (z) aVar.f31583t;
                try {
                    jt.o.b(obj);
                    ku.x<Unit> xVar = zVar2.didRun;
                    Unit unit = Unit.f22483a;
                    xVar.s(unit);
                    aVar3.e(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.e(null);
                    throw th2;
                }
            }
            uu.a aVar4 = (uu.a) aVar.f31584u;
            zVar = (z) aVar.f31583t;
            jt.o.b(obj);
            aVar2 = aVar4;
            if (zVar.didRun.d()) {
                Unit unit2 = Unit.f22483a;
                aVar2.e(null);
                return unit2;
            }
            aVar.f31583t = zVar;
            aVar.f31584u = aVar2;
            aVar.f31587x = 2;
            if (zVar.b(aVar) != objE) {
                aVar3 = aVar2;
                zVar2 = zVar;
                ku.x<Unit> xVar2 = zVar2.didRun;
                Unit unit3 = Unit.f22483a;
                xVar2.s(unit3);
                aVar3.e(null);
                return unit3;
            }
            return objE;
        } catch (Throwable th4) {
            aVar3 = aVar2;
            th2 = th4;
            aVar3.e(null);
            throw th2;
        }
    }
}
