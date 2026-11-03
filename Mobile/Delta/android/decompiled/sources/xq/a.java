package xq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import iu.g1;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.h;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lxq/a;", "Lwm/o;", "Lxq/c$b;", "Ltr/h;", "Lxq/c;", "snaClient", "", "timeoutSeconds", "<init>", "(Lxq/c;I)V", "otherWorker", "", "c", "(Lwm/o;)Z", "Llu/h;", "run", "()Llu/h;", "b", "Lxq/c;", "I", "a", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<c.b>, h<c.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final c snaClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int timeoutSeconds;

    /* JADX INFO: renamed from: xq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxq/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "config", "", "timeoutSeconds", "Lxq/a;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;I)Lxq/a;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0658a {
        @NotNull
        public final a a(@NotNull Context applicationContext, @NotNull SilentNetworkAuthConfig config, int timeoutSeconds) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(config, "config");
            return new a(e.f36265a.a(applicationContext, config), timeoutSeconds);
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1", f = "SilentNetworkAuthWorker.kt", l = {24, 33, 39}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lxq/c$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<i<? super c.b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f36248t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f36249u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f36250v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f36251w;

        /* JADX INFO: renamed from: xq.a$b$a, reason: collision with other inner class name */
        @f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1$response$1", f = "SilentNetworkAuthWorker.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lxq/c$b;", "<anonymous>", "(Liu/p0;)Lxq/c$b;"}, k = 3, mv = {2, 2, 0})
        public static final class C0659a extends m implements Function2<p0, lt.b<? super c.b>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f36253t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f36254u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0659a(c cVar, lt.b<? super C0659a> bVar) {
                super(2, bVar);
                this.f36254u = cVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0659a(this.f36254u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super c.b> bVar) {
                return ((C0659a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f36253t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return this.f36254u.a();
            }
        }

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = a.this.new b(bVar);
            bVar2.f36251w = obj;
            return bVar2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0091  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0091, please report this as an issue */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xq.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super c.b> iVar, lt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public a(@Nullable c cVar, int i10) {
        this.snaClient = cVar;
        this.timeoutSeconds = i10;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof a;
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<c.b> run() {
        return j.y(j.w(new b(null)), g1.a());
    }
}
