package k9;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import k9.a.d;
import l9.a0;
import l9.f1;
import l9.j0;
import l9.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<O extends k9.a.d> implements g<O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22495a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.a f22496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k9.a.d f22497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l9.b f22498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f22499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f22501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l9.s f22502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final l9.f f22503j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final a f22504c = new C0393a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final l9.s f22505a;

        @NonNull
        public final Looper b;

        /* JADX INFO: renamed from: k9.e$a$a, reason: collision with other inner class name */
        public static class C0393a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l9.s f22506a;
            public Looper b;

            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            public a a() {
                if (this.f22506a == null) {
                    this.f22506a = new l9.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.f22506a, this.b);
            }

            @NonNull
            public C0393a b(@NonNull l9.s sVar) {
                n9.m.m(sVar, "StatusExceptionMapper must not be null.");
                this.f22506a = sVar;
                return this;
            }
        }

        public a(l9.s sVar, Account account, Looper looper) {
            this.f22505a = sVar;
            this.b = looper;
        }
    }

    public e(@NonNull Activity activity, @NonNull k9.a<O> aVar, @NonNull O o8, @NonNull a aVar2) {
        this(activity, activity, aVar, o8, aVar2);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends k9.a.b> Task<Void> A(@NonNull l9.p<A, ?> pVar) {
        n9.m.l(pVar);
        n9.m.m(pVar.f23458a.b(), "Listener has already been released.");
        n9.m.m(pVar.b.a(), "Listener has already been released.");
        return this.f22503j.y(this, pVar.f23458a, pVar.b, pVar.f23459c);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> B(@NonNull l9.k.a<?> aVar, int i10) {
        n9.m.m(aVar, "Listener key cannot be null.");
        return this.f22503j.z(this, aVar, i10);
    }

    @NonNull
    public <A extends k9.a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T C(@NonNull T t8) {
        N(1, t8);
        return t8;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends k9.a.b> Task<TResult> D(@NonNull l9.u<A, TResult> uVar) {
        return O(1, uVar);
    }

    public String E(@NonNull Context context) {
        return null;
    }

    @NonNull
    public O F() {
        return (O) this.f22497d;
    }

    @NonNull
    public Context G() {
        return this.f22495a;
    }

    public String H() {
        return this.b;
    }

    @NonNull
    public Looper I() {
        return this.f22499f;
    }

    @NonNull
    public <L> l9.k<L> J(@NonNull L l10, @NonNull String str) {
        return l9.l.a(l10, this.f22499f, str);
    }

    public final int K() {
        return this.f22500g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k9.a.f L(Looper looper, j0 j0Var) {
        n9.d dVarA = x().a();
        k9.a.f fVarA = ((k9.a.AbstractC0391a) n9.m.l(this.f22496c.a())).a(this.f22495a, looper, dVarA, this.f22497d, j0Var, j0Var);
        String strH = H();
        if (strH != null && (fVarA instanceof n9.c)) {
            ((n9.c) fVarA).setAttributionTag(strH);
        }
        if (strH != null && (fVarA instanceof l9.m)) {
            ((l9.m) fVarA).d(strH);
        }
        return fVarA;
    }

    public final f1 M(Context context, Handler handler) {
        return new f1(context, handler, x().a());
    }

    public final com.google.android.gms.common.api.internal.a N(int i10, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        aVar.l();
        this.f22503j.E(this, i10, aVar);
        return aVar;
    }

    public final Task O(int i10, @NonNull l9.u uVar) {
        sb.k kVar = new sb.k();
        this.f22503j.F(this, i10, uVar, kVar, this.f22502i);
        return kVar.a();
    }

    @Override // k9.g
    @NonNull
    public final l9.b<O> u() {
        return this.f22498e;
    }

    @NonNull
    public f w() {
        return this.f22501h;
    }

    @NonNull
    public n9.d.a x() {
        Account accountH2;
        GoogleSignInAccount googleSignInAccountX2;
        GoogleSignInAccount googleSignInAccountX3;
        n9.d.a aVar = new n9.d.a();
        k9.a.d dVar = this.f22497d;
        if (!(dVar instanceof k9.a.d.b) || (googleSignInAccountX3 = ((k9.a.d.b) dVar).x2()) == null) {
            k9.a.d dVar2 = this.f22497d;
            accountH2 = dVar2 instanceof k9.a.d.InterfaceC0392a ? ((k9.a.d.InterfaceC0392a) dVar2).H2() : null;
        } else {
            accountH2 = googleSignInAccountX3.H2();
        }
        aVar.d(accountH2);
        k9.a.d dVar3 = this.f22497d;
        Set<Scope> setB3 = (!(dVar3 instanceof k9.a.d.b) || (googleSignInAccountX2 = ((k9.a.d.b) dVar3).x2()) == null) ? Collections.EMPTY_SET : googleSignInAccountX2.B3();
        aVar.c(setB3);
        aVar.e(this.f22495a.getClass().getName());
        aVar.b(this.f22495a.getPackageName());
        return aVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends k9.a.b> Task<TResult> y(@NonNull l9.u<A, TResult> uVar) {
        return O(2, uVar);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends k9.a.b> Task<TResult> z(@NonNull l9.u<A, TResult> uVar) {
        return O(0, uVar);
    }

    public e(@NonNull Context context, Activity activity, k9.a aVar, k9.a.d dVar, a aVar2) {
        n9.m.m(context, "Null context is not permitted.");
        n9.m.m(aVar, "Api must not be null.");
        n9.m.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) n9.m.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f22495a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : E(context);
        this.b = attributionTag;
        this.f22496c = aVar;
        this.f22497d = dVar;
        this.f22499f = aVar2.b;
        l9.b bVarA = l9.b.a(aVar, dVar, attributionTag);
        this.f22498e = bVarA;
        this.f22501h = new o0(this);
        l9.f fVarV = l9.f.v(context2);
        this.f22503j = fVarV;
        this.f22500g = fVarV.l();
        this.f22502i = aVar2.f22505a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            a0.u(activity, fVarV, bVarA);
        }
        fVarV.J(this);
    }

    public e(@NonNull Context context, @NonNull k9.a<O> aVar, @NonNull O o8, @NonNull a aVar2) {
        this(context, null, aVar, o8, aVar2);
    }

    @Deprecated
    public e(@NonNull Context context, @NonNull k9.a<O> aVar, @NonNull O o8, @NonNull l9.s sVar) {
        a.C0393a c0393a = new a.C0393a();
        c0393a.b(sVar);
        this(context, aVar, o8, c0393a.a());
    }
}
