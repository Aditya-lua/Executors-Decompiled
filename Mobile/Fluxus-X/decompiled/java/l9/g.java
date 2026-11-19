package l9;

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
import l9.a.d;
import m9.a0;
import m9.f1;
import m9.j0;
import m9.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<O extends l9.a.d> implements i<O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22003a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9.a f22004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l9.a.d f22005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m9.b f22006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f22007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f22009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m9.s f22010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final m9.f f22011j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final a f22012c = new C0423a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final m9.s f22013a;

        @NonNull
        public final Looper b;

        /* JADX INFO: renamed from: l9.g$a$a, reason: collision with other inner class name */
        public static class C0423a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public m9.s f22014a;
            public Looper b;

            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            public a a() {
                if (this.f22014a == null) {
                    this.f22014a = new m9.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.f22014a, this.b);
            }

            @NonNull
            public C0423a b(@NonNull m9.s sVar) {
                o9.s.m(sVar, "StatusExceptionMapper must not be null.");
                this.f22014a = sVar;
                return this;
            }
        }

        public a(m9.s sVar, Account account, Looper looper) {
            this.f22013a = sVar;
            this.b = looper;
        }
    }

    public g(@NonNull Activity activity, @NonNull l9.a<O> aVar, @NonNull O o10, @NonNull a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends l9.a.b> Task<Void> A(@NonNull m9.p<A, ?> pVar) {
        o9.s.l(pVar);
        o9.s.m(pVar.f23049a.b(), "Listener has already been released.");
        o9.s.m(pVar.b.a(), "Listener has already been released.");
        return this.f22011j.y(this, pVar.f23049a, pVar.b, pVar.f23050c);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> B(@NonNull m9.k.a<?> aVar, int i10) {
        o9.s.m(aVar, "Listener key cannot be null.");
        return this.f22011j.z(this, aVar, i10);
    }

    @NonNull
    public <A extends l9.a.b, T extends com.google.android.gms.common.api.internal.a<? extends p, A>> T C(@NonNull T t8) {
        N(1, t8);
        return t8;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends l9.a.b> Task<TResult> D(@NonNull m9.u<A, TResult> uVar) {
        return O(1, uVar);
    }

    public String E(@NonNull Context context) {
        return null;
    }

    @NonNull
    public O F() {
        return (O) this.f22005d;
    }

    @NonNull
    public Context G() {
        return this.f22003a;
    }

    public String H() {
        return this.b;
    }

    @NonNull
    public Looper I() {
        return this.f22007f;
    }

    @NonNull
    public <L> m9.k<L> J(@NonNull L l10, @NonNull String str) {
        return m9.l.a(l10, this.f22007f, str);
    }

    public final int K() {
        return this.f22008g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l9.a.f L(Looper looper, j0 j0Var) {
        o9.f fVarA = x().a();
        l9.a.f fVarA2 = ((l9.a.AbstractC0421a) o9.s.l(this.f22004c.a())).a(this.f22003a, looper, fVarA, this.f22005d, j0Var, j0Var);
        String strH = H();
        if (strH != null && (fVarA2 instanceof o9.d)) {
            ((o9.d) fVarA2).setAttributionTag(strH);
        }
        if (strH != null && (fVarA2 instanceof m9.m)) {
            ((m9.m) fVarA2).d(strH);
        }
        return fVarA2;
    }

    public final f1 M(Context context, Handler handler) {
        return new f1(context, handler, x().a());
    }

    public final com.google.android.gms.common.api.internal.a N(int i10, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        aVar.l();
        this.f22011j.E(this, i10, aVar);
        return aVar;
    }

    public final Task O(int i10, @NonNull m9.u uVar) {
        tb.k kVar = new tb.k();
        this.f22011j.F(this, i10, uVar, kVar, this.f22010i);
        return kVar.a();
    }

    @Override // l9.i
    @NonNull
    public final m9.b<O> v() {
        return this.f22006e;
    }

    @NonNull
    public h w() {
        return this.f22009h;
    }

    @NonNull
    public o9.f.a x() {
        Account accountK2;
        GoogleSignInAccount googleSignInAccountZ2;
        GoogleSignInAccount googleSignInAccountZ3;
        o9.f.a aVar = new o9.f.a();
        l9.a.d dVar = this.f22005d;
        if (!(dVar instanceof l9.a.d.b) || (googleSignInAccountZ3 = ((l9.a.d.b) dVar).z2()) == null) {
            l9.a.d dVar2 = this.f22005d;
            accountK2 = dVar2 instanceof l9.a.d.InterfaceC0422a ? ((l9.a.d.InterfaceC0422a) dVar2).K2() : null;
        } else {
            accountK2 = googleSignInAccountZ3.K2();
        }
        aVar.d(accountK2);
        l9.a.d dVar3 = this.f22005d;
        Set<Scope> setG3 = (!(dVar3 instanceof l9.a.d.b) || (googleSignInAccountZ2 = ((l9.a.d.b) dVar3).z2()) == null) ? Collections.EMPTY_SET : googleSignInAccountZ2.G3();
        aVar.c(setG3);
        aVar.e(this.f22003a.getClass().getName());
        aVar.b(this.f22003a.getPackageName());
        return aVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends l9.a.b> Task<TResult> y(@NonNull m9.u<A, TResult> uVar) {
        return O(2, uVar);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends l9.a.b> Task<TResult> z(@NonNull m9.u<A, TResult> uVar) {
        return O(0, uVar);
    }

    public g(@NonNull Context context, Activity activity, l9.a aVar, l9.a.d dVar, a aVar2) {
        o9.s.m(context, "Null context is not permitted.");
        o9.s.m(aVar, "Api must not be null.");
        o9.s.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) o9.s.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f22003a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : E(context);
        this.b = attributionTag;
        this.f22004c = aVar;
        this.f22005d = dVar;
        this.f22007f = aVar2.b;
        m9.b bVarA = m9.b.a(aVar, dVar, attributionTag);
        this.f22006e = bVarA;
        this.f22009h = new o0(this);
        m9.f fVarV = m9.f.v(context2);
        this.f22011j = fVarV;
        this.f22008g = fVarV.l();
        this.f22010i = aVar2.f22013a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            a0.u(activity, fVarV, bVarA);
        }
        fVarV.J(this);
    }

    public g(@NonNull Context context, @NonNull l9.a<O> aVar, @NonNull O o10, @NonNull a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    @Deprecated
    public g(@NonNull Context context, @NonNull l9.a<O> aVar, @NonNull O o10, @NonNull m9.s sVar) {
        a.C0423a c0423a = new a.C0423a();
        c0423a.b(sVar);
        this(context, aVar, o10, c0423a.a());
    }
}
