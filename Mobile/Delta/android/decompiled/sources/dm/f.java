package dm;

import e3.o;
import gt.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ldm/f;", "", "Lj/b;", "activity", "<init>", "(Lj/b;)V", "", "nonce", "Llu/h;", "Ldm/g;", "c", "(Ljava/lang/String;)Llu/h;", "a", "Lj/b;", "e", "()Lj/b;", "Le3/o;", "b", "Lgt/h;", "f", "()Le3/o;", "credentialManager", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h credentialManager;

    @nt.f(c = "com.roblox.universalapp.externalidentity.GoogleSignInManager$acquireGoogleCredentials$1", f = "GoogleSignInManager.kt", l = {24, 33, 53}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Ldm/g;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<i<? super g>, lt.b<? super Unit>, Object> {
        public final /* synthetic */ String B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15031t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15032u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f15033v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f15034w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f15035x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f15036y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f15037z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lt.b<? super a> bVar) {
            super(2, bVar);
            this.B = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            a aVar = f.this.new a(this.B, bVar);
            aVar.f15037z = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00db A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:11:0x0036, B:23:0x00b1, B:25:0x00bb, B:27:0x00c7, B:29:0x00e2, B:28:0x00db, B:20:0x0057), top: B:44:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L41;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dm.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super g> iVar, lt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public f(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.credentialManager = gt.i.b(new Function0() { // from class: dm.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d(this.f15029a);
            }
        });
    }

    public static final o d(f fVar) {
        return o.INSTANCE.a(fVar.activity);
    }

    @NotNull
    public final lu.h<g> c(@NotNull String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        return j.w(new a(nonce, null));
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final j.b getActivity() {
        return this.activity;
    }

    public final o f() {
        return (o) this.credentialManager.getValue();
    }
}
