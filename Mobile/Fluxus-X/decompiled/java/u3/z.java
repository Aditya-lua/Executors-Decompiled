package u3;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lu3/z;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "b", "(Leu/b;)Ljava/lang/Object;", "a", "c", "Lkv/a;", "Lkv/a;", "runMutex", "Lav/x;", "Lav/x;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.a runMutex = kv.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final av.x<Unit> didRun = av.z.c(null, 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33149t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33150u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33151v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33153x;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33151v = obj;
            this.f33153x |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    @Nullable
    public final Object a(@NotNull eu.b<? super Unit> bVar) {
        Object objY = this.didRun.y(bVar);
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }

    @Nullable
    public abstract Object b(@NotNull eu.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull eu.b<? super Unit> bVar) throws Throwable {
        a aVar;
        kv.a aVar2;
        z zVar;
        kv.a aVar3;
        Throwable th2;
        z zVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f33153x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33153x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f33151v;
        Object objE = fu.c.e();
        int i11 = aVar.f33153x;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                if (this.didRun.d()) {
                    return Unit.f21506a;
                }
                aVar2 = this.runMutex;
                aVar.f33149t = this;
                aVar.f33150u = aVar2;
                aVar.f33153x = 1;
                if (aVar2.d(null, aVar) != objE) {
                    zVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kv.a) aVar.f33150u;
                zVar2 = (z) aVar.f33149t;
                try {
                    zt.o.b(obj);
                    av.x<Unit> xVar = zVar2.didRun;
                    Unit unit = Unit.f21506a;
                    xVar.s(unit);
                    aVar3.f(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.f(null);
                    throw th2;
                }
            }
            kv.a aVar4 = (kv.a) aVar.f33150u;
            zVar = (z) aVar.f33149t;
            zt.o.b(obj);
            aVar2 = aVar4;
            if (zVar.didRun.d()) {
                Unit unit2 = Unit.f21506a;
                aVar2.f(null);
                return unit2;
            }
            aVar.f33149t = zVar;
            aVar.f33150u = aVar2;
            aVar.f33153x = 2;
            if (zVar.b(aVar) != objE) {
                aVar3 = aVar2;
                zVar2 = zVar;
                av.x<Unit> xVar2 = zVar2.didRun;
                Unit unit3 = Unit.f21506a;
                xVar2.s(unit3);
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
