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
    public final Context f22271a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.a f22272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k9.a.d f22273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l9.b f22274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f22275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f22277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l9.s f22278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final l9.f f22279j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final a f22280c = new C0394a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final l9.s f22281a;

        @NonNull
        public final Looper b;

        /* JADX INFO: renamed from: k9.e$a$a, reason: collision with other inner class name */
        public static class C0394a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l9.s f22282a;
            public Looper b;

            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            public a a() {
                if (this.f22282a == null) {
                    this.f22282a = new l9.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.f22282a, this.b);
            }

            @NonNull
            public C0394a b(@NonNull l9.s sVar) {
                n9.m.m(sVar, "StatusExceptionMapper must not be null.");
                this.f22282a = sVar;
                return this;
            }
        }

        public a(l9.s sVar, Account account, Looper looper) {
            this.f22281a = sVar;
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
        n9.m.m(pVar.f23064a.b(), "Listener has already been released.");
        n9.m.m(pVar.b.a(), "Listener has already been released.");
        return this.f22279j.y(this, pVar.f23064a, pVar.b, pVar.f23065c);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> B(@NonNull l9.k.a<?> aVar, int i10) {
        n9.m.m(aVar, "Listener key cannot be null.");
        return this.f22279j.z(this, aVar, i10);
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
        return (O) this.f22273d;
    }

    @NonNull
    public Context G() {
        return this.f22271a;
    }

    public String H() {
        return this.b;
    }

    @NonNull
    public Looper I() {
        return this.f22275f;
    }

    @NonNull
    public <L> l9.k<L> J(@NonNull L l10, @NonNull String str) {
        return l9.l.a(l10, this.f22275f, str);
    }

    public final int K() {
        return this.f22276g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k9.a.f L(Looper looper, j0 j0Var) {
        n9.d dVarA = x().a();
        k9.a.f fVarA = ((k9.a.AbstractC0392a) n9.m.l(this.f22272c.a())).a(this.f22271a, looper, dVarA, this.f22273d, j0Var, j0Var);
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
        this.f22279j.E(this, i10, aVar);
        return aVar;
    }

    public final Task O(int i10, @NonNull l9.u uVar) {
        sb.k kVar = new sb.k();
        this.f22279j.F(this, i10, uVar, kVar, this.f22278i);
        return kVar.a();
    }

    @Override // k9.g
    @NonNull
    public final l9.b<O> u() {
        return this.f22274e;
    }

    @NonNull
    public f w() {
        return this.f22277h;
    }

    @NonNull
    public n9.d.a x() {
        Account accountG2;
        GoogleSignInAccount googleSignInAccountW2;
        GoogleSignInAccount googleSignInAccountW3;
        n9.d.a aVar = new n9.d.a();
        k9.a.d dVar = this.f22273d;
        if (!(dVar instanceof k9.a.d.b) || (googleSignInAccountW3 = ((k9.a.d.b) dVar).w2()) == null) {
            k9.a.d dVar2 = this.f22273d;
            accountG2 = dVar2 instanceof k9.a.d.InterfaceC0393a ? ((k9.a.d.InterfaceC0393a) dVar2).G2() : null;
        } else {
            accountG2 = googleSignInAccountW3.G2();
        }
        aVar.d(accountG2);
        k9.a.d dVar3 = this.f22273d;
        Set<Scope> setB3 = (!(dVar3 instanceof k9.a.d.b) || (googleSignInAccountW2 = ((k9.a.d.b) dVar3).w2()) == null) ? Collections.EMPTY_SET : googleSignInAccountW2.B3();
        aVar.c(setB3);
        aVar.e(this.f22271a.getClass().getName());
        aVar.b(this.f22271a.getPackageName());
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
        this.f22271a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : E(context);
        this.b = attributionTag;
        this.f22272c = aVar;
        this.f22273d = dVar;
        this.f22275f = aVar2.b;
        l9.b bVarA = l9.b.a(aVar, dVar, attributionTag);
        this.f22274e = bVarA;
        this.f22277h = new o0(this);
        l9.f fVarV = l9.f.v(context2);
        this.f22279j = fVarV;
        this.f22276g = fVarV.l();
        this.f22278i = aVar2.f22281a;
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
        a.C0394a c0394a = new a.C0394a();
        c0394a.b(sVar);
        this(context, aVar, o8, c0394a.a());
    }
}
