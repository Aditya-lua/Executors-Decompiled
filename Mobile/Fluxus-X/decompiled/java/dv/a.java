package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Ldv/a;", "T", "Ldv/h;", "Ldv/c;", "<init>", "()V", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements h<T>, c<T> {

    /* JADX INFO: renamed from: dv.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    public static final class C0235a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12693t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12694u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a<T> f12695v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12696w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0235a(a<T> aVar, eu.b<? super C0235a> bVar) {
            super(bVar);
            this.f12695v = aVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12694u = obj;
            this.f12696w |= Integer.MIN_VALUE;
            return this.f12695v.collect(null, this);
        }
    }

    @Nullable
    public abstract Object b(@NotNull i<? super T> iVar, @NotNull eu.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dv.h
    @Nullable
    public final Object collect(@NotNull i<? super T> iVar, @NotNull eu.b<? super Unit> bVar) throws Throwable {
        C0235a c0235a;
        Throwable th2;
        kotlin.v vVar;
        if (bVar instanceof C0235a) {
            c0235a = (C0235a) bVar;
            int i10 = c0235a.f12696w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0235a.f12696w = i10 - Integer.MIN_VALUE;
            } else {
                c0235a = new C0235a(this, bVar);
            }
        } else {
            c0235a = new C0235a(this, bVar);
        }
        Object obj = c0235a.f12694u;
        Object objE = fu.c.e();
        int i11 = c0235a.f12696w;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (kotlin.v) c0235a.f12693t;
            try {
                zt.o.b(obj);
                vVar.releaseIntercepted();
                return Unit.f21506a;
            } catch (Throwable th3) {
                th2 = th3;
                vVar.releaseIntercepted();
                throw th2;
            }
        }
        zt.o.b(obj);
        kotlin.v vVar2 = new kotlin.v(iVar, c0235a.getContext());
        try {
            c0235a.f12693t = vVar2;
            c0235a.f12696w = 1;
            if (b(vVar2, c0235a) == objE) {
                return objE;
            }
            vVar = vVar2;
            vVar.releaseIntercepted();
            return Unit.f21506a;
        } catch (Throwable th4) {
            th2 = th4;
            vVar = vVar2;
            vVar.releaseIntercepted();
            throw th2;
        }
    }
}
