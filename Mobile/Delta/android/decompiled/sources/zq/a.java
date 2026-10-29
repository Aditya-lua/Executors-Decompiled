package zq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;
import vr.h;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzq/a;", "Lym/o;", "Lzq/c$b;", "Lvr/h;", "Lzq/c;", "snaClient", "", "timeoutSeconds", "<init>", "(Lzq/c;I)V", "otherWorker", "", "b", "(Lym/o;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lzq/c;", "c", "I", "a", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<c.b>, h<c.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final c snaClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int timeoutSeconds;

    /* JADX INFO: renamed from: zq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzq/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "config", "", "timeoutSeconds", "Lzq/a;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;I)Lzq/a;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0689a {
        @NotNull
        public final a a(@NotNull Context applicationContext, @NotNull SilentNetworkAuthConfig config, int timeoutSeconds) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(config, "config");
            return new a(e.f38142a.a(applicationContext, config), timeoutSeconds);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lzq/c$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1", f = "SilentNetworkAuthWorker.kt", l = {24, 33, 39}, m = "invokeSuspend")
    public static final class b extends m implements Function2<i<? super c.b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f38125t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f38126u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f38127v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f38128w;

        /* JADX INFO: renamed from: zq.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lzq/c$b;", "<anonymous>", "(Lku/p0;)Lzq/c$b;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1$response$1", f = "SilentNetworkAuthWorker.kt", l = {}, m = "invokeSuspend")
        public static final class C0690a extends m implements Function2<p0, nt.b<? super c.b>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f38130t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f38131u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0690a(c cVar, nt.b<? super C0690a> bVar) {
                super(2, bVar);
                this.f38131u = cVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0690a(this.f38131u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f38130t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return this.f38131u.a();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super c.b> bVar) {
                return ((C0690a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = a.this.new b(bVar);
            bVar2.f38128w = obj;
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
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zq.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super c.b> iVar, nt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public a(@Nullable c cVar, int i10) {
        this.snaClient = cVar;
        this.timeoutSeconds = i10;
    }

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof a;
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> hVar) {
        return super.c(hVar);
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<c.b> run() {
        return j.y(j.w(new b(null)), g1.a());
    }
}
