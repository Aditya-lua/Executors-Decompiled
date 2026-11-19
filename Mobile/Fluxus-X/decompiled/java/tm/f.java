package tm;

import com.github.luben.zstd.BuildConfig;
import dv.i;
import dv.j;
import e3.i0;
import e3.k0;
import e3.l0;
import f3.l;
import gu.m;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.h;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ltm/f;", BuildConfig.FLAVOR, "Lj/b;", "activity", "<init>", "(Lj/b;)V", BuildConfig.FLAVOR, "nonce", "Ldv/h;", "Ltm/g;", "c", "(Ljava/lang/String;)Ldv/h;", "a", "Lj/b;", "e", "()Lj/b;", "Le3/o;", "b", "Lzt/h;", "f", "()Le3/o;", "credentialManager", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h credentialManager;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Ltm/g;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.universalapp.externalidentity.GoogleSignInManager$acquireGoogleCredentials$1", f = "GoogleSignInManager.kt", l = {24, 33, 53}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<i<? super g>, eu.b<? super Unit>, Object> {
        public final /* synthetic */ String B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32559t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32560u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32561v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f32562w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32563x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f32564y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f32565z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, eu.b<? super a> bVar) {
            super(2, bVar);
            this.B = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = f.this.new a(this.B, bVar);
            aVar.f32565z = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00db A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:11:0x0036, B:23:0x00b1, B:25:0x00bb, B:27:0x00c7, B:29:0x00e2, B:28:0x00db, B:20:0x0057), top: B:44:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L41;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Throwable thE;
            e3.m credential;
            Object error;
            i iVar = (i) this.f32565z;
            Object objE = fu.c.e();
            int i10 = this.f32564y;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    g.c cVar = g.c.f32568a;
                    this.f32565z = iVar;
                    this.f32564y = 1;
                    if (iVar.emit(cVar, this) != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    o.b(obj);
                } else if (i10 == 2) {
                    o.b(obj);
                    credential = ((l0) obj).getCredential();
                    if ((credential instanceof i0) || !Intrinsics.c(credential.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                        error = new g.Error("UnexpectedCredentialType");
                    } else {
                        error = new g.Success(ic.d.INSTANCE.a(credential.getData()).getF19361e());
                    }
                    objB = n.b(error);
                    thE = n.e(objB);
                    if (thE != null) {
                        if (thE instanceof l) {
                            objB = g.a.f32566a;
                        } else {
                            String simpleName = thE.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                            objB = new g.Error(simpleName);
                        }
                    }
                    g gVar = (g) objB;
                    this.f32565z = gu.l.a(iVar);
                    this.f32559t = gu.l.a(gVar);
                    this.f32560u = null;
                    this.f32561v = null;
                    this.f32562w = null;
                    this.f32564y = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
                f fVar = f.this;
                String str = this.B;
                n.Companion companion = n.INSTANCE;
                String string = fVar.getActivity().getString(dm.a.f12544a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ic.c cVarA = new ic.c.a(string).b(str).a();
                k0 k0VarB = new k0.a().a(cVarA).b();
                e3.o oVarF = fVar.f();
                j.b activity = fVar.getActivity();
                this.f32565z = iVar;
                this.f32559t = gu.l.a(iVar);
                this.f32560u = gu.l.a(cVarA);
                this.f32561v = gu.l.a(string);
                this.f32562w = gu.l.a(k0VarB);
                this.f32563x = 0;
                this.f32564y = 2;
                obj = oVarF.c(activity, k0VarB, this);
                if (obj != objE) {
                    credential = ((l0) obj).getCredential();
                    if (credential instanceof i0) {
                        error = new g.Error("UnexpectedCredentialType");
                    } else {
                        error = new g.Error("UnexpectedCredentialType");
                    }
                    objB = n.b(error);
                    thE = n.e(objB);
                    if (thE != null) {
                        if (thE instanceof l) {
                            objB = g.a.f32566a;
                        } else {
                            String simpleName2 = thE.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                            objB = new g.Error(simpleName2);
                        }
                    }
                    g gVar2 = (g) objB;
                    this.f32565z = gu.l.a(iVar);
                    this.f32559t = gu.l.a(gVar2);
                    this.f32560u = null;
                    this.f32561v = null;
                    this.f32562w = null;
                    this.f32564y = 3;
                }
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super g> iVar, eu.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public f(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.credentialManager = zt.i.a(new Function0() { // from class: tm.e
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d(this.f32557a);
            }
        });
    }

    public static final e3.o d(f fVar) {
        return e3.o.INSTANCE.a(fVar.activity);
    }

    @NotNull
    public final dv.h<g> c(@NotNull String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        return j.w(new a(nonce, null));
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final j.b getActivity() {
        return this.activity;
    }

    public final e3.o f() {
        return (e3.o) this.credentialManager.getValue();
    }
}
