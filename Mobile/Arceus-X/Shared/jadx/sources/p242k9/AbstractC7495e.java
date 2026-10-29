package p242k9;

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
import com.google.android.gms.common.api.internal.AbstractC1899a;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import p242k9.C7491a.d;
import p268l9.AbstractC8078u;
import p268l9.BinderC8035f1;
import p268l9.C8017a;
import p268l9.C8018a0;
import p268l9.C8021b;
import p268l9.C8033f;
import p268l9.C8046j0;
import p268l9.C8048k;
import p268l9.C8051l;
import p268l9.C8061o0;
import p268l9.C8063p;
import p268l9.InterfaceC8072s;
import p268l9.ServiceConnectionC8054m;
import p305n9.AbstractC8923c;
import p305n9.C8926d;
import p305n9.C8953m;
import sb.C11264k;

/* JADX INFO: renamed from: k9.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7495e<O extends C7491a.d> implements InterfaceC7497g<O> {

    /* JADX INFO: renamed from: a */
    public final Context f28850a;

    /* JADX INFO: renamed from: b */
    public final String f28851b;

    /* JADX INFO: renamed from: c */
    public final C7491a f28852c;

    /* JADX INFO: renamed from: d */
    public final C7491a.d f28853d;

    /* JADX INFO: renamed from: e */
    public final C8021b f28854e;

    /* JADX INFO: renamed from: f */
    public final Looper f28855f;

    /* JADX INFO: renamed from: g */
    public final int f28856g;

    /* JADX INFO: renamed from: h */
    public final AbstractC7496f f28857h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC8072s f28858i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C8033f f28859j;

    /* JADX INFO: renamed from: k9.e$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        @NonNull
        public static final a f28860c = new C14196a().m31152a();

        /* JADX INFO: renamed from: a */
        @NonNull
        public final InterfaceC8072s f28861a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final Looper f28862b;

        /* JADX INFO: renamed from: k9.e$a$a, reason: collision with other inner class name */
        public static class C14196a {

            /* JADX INFO: renamed from: a */
            public InterfaceC8072s f28863a;

            /* JADX INFO: renamed from: b */
            public Looper f28864b;

            /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            /* JADX INFO: renamed from: a */
            public a m31152a() {
                if (this.f28863a == null) {
                    this.f28863a = new C8017a();
                }
                if (this.f28864b == null) {
                    this.f28864b = Looper.getMainLooper();
                }
                return new a(this.f28863a, this.f28864b);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C14196a m31153b(@NonNull InterfaceC8072s interfaceC8072s) {
                C8953m.m36048m(interfaceC8072s, "StatusExceptionMapper must not be null.");
                this.f28863a = interfaceC8072s;
                return this;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(InterfaceC8072s interfaceC8072s, Account account, Looper looper) {
            this.f28861a = interfaceC8072s;
            this.f28862b = looper;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7495e(@NonNull Activity activity, @NonNull C7491a<O> c7491a, @NonNull O o8, @NonNull a aVar) {
        this(activity, activity, c7491a, o8, aVar);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: A */
    public <A extends C7491a.b> Task<Void> m31133A(@NonNull C8063p<A, ?> c8063p) {
        C8953m.m36047l(c8063p);
        C8953m.m36048m(c8063p.f30066a.m33248b(), "Listener has already been released.");
        C8953m.m36048m(c8063p.f30067b.m33293a(), "Listener has already been released.");
        return this.f28859j.m33162y(this, c8063p.f30066a, c8063p.f30067b, c8063p.f30068c);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: B */
    public Task<Boolean> m31134B(@NonNull C8048k.a<?> aVar, int i10) {
        C8953m.m36048m(aVar, "Listener key cannot be null.");
        return this.f28859j.m33163z(this, aVar, i10);
    }

    @NonNull
    /* JADX INFO: renamed from: C */
    public <A extends C7491a.b, T extends AbstractC1899a<? extends InterfaceC7504n, A>> T m31135C(@NonNull T t8) {
        m31146N(1, t8);
        return t8;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: D */
    public <TResult, A extends C7491a.b> Task<TResult> m31136D(@NonNull AbstractC8078u<A, TResult> abstractC8078u) {
        return m31147O(1, abstractC8078u);
    }

    /* JADX INFO: renamed from: E */
    public String m31137E(@NonNull Context context) {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public O m31138F() {
        return (O) this.f28853d;
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public Context m31139G() {
        return this.f28850a;
    }

    /* JADX INFO: renamed from: H */
    public String m31140H() {
        return this.f28851b;
    }

    @NonNull
    /* JADX INFO: renamed from: I */
    public Looper m31141I() {
        return this.f28855f;
    }

    @NonNull
    /* JADX INFO: renamed from: J */
    public <L> C8048k<L> m31142J(@NonNull L l10, @NonNull String str) {
        return C8051l.m33233a(l10, this.f28855f, str);
    }

    /* JADX INFO: renamed from: K */
    public final int m31143K() {
        return this.f28856g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: k9.a$f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final C7491a.f m31144L(Looper looper, C8046j0 c8046j0) {
        C8926d c8926dM35970a = mo25219x().m35970a();
        C7491a.f fVarMo23559a = ((C7491a.a) C8953m.m36047l(this.f28852c.m31125a())).mo23559a(this.f28850a, looper, c8926dM35970a, this.f28853d, c8046j0, c8046j0);
        String strM31140H = m31140H();
        if (strM31140H != null && (fVarMo23559a instanceof AbstractC8923c)) {
            ((AbstractC8923c) fVarMo23559a).setAttributionTag(strM31140H);
        }
        if (strM31140H != null && (fVarMo23559a instanceof ServiceConnectionC8054m)) {
            ((ServiceConnectionC8054m) fVarMo23559a).m33240d(strM31140H);
        }
        return fVarMo23559a;
    }

    /* JADX INFO: renamed from: M */
    public final BinderC8035f1 m31145M(Context context, Handler handler) {
        return new BinderC8035f1(context, handler, mo25219x().m35970a());
    }

    /* JADX INFO: renamed from: N */
    public final AbstractC1899a m31146N(int i10, @NonNull AbstractC1899a abstractC1899a) {
        abstractC1899a.m9179l();
        this.f28859j.m33145E(this, i10, abstractC1899a);
        return abstractC1899a;
    }

    /* JADX INFO: renamed from: O */
    public final Task m31147O(int i10, @NonNull AbstractC8078u abstractC8078u) {
        C11264k c11264k = new C11264k();
        this.f28859j.m33146F(this, i10, abstractC8078u, c11264k, this.f28858i);
        return c11264k.m42326a();
    }

    @Override // p242k9.InterfaceC7497g
    @NonNull
    /* JADX INFO: renamed from: u */
    public final C8021b<O> mo31148u() {
        return this.f28854e;
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public AbstractC7496f m31149w() {
        return this.f28857h;
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public C8926d.a mo25219x() {
        Account accountM31128G2;
        GoogleSignInAccount googleSignInAccountM31129w2;
        GoogleSignInAccount googleSignInAccountM31129w3;
        C8926d.a aVar = new C8926d.a();
        C7491a.d dVar = this.f28853d;
        if (!(dVar instanceof C7491a.d.b) || (googleSignInAccountM31129w3 = ((C7491a.d.b) dVar).m31129w2()) == null) {
            C7491a.d dVar2 = this.f28853d;
            accountM31128G2 = dVar2 instanceof C7491a.d.a ? ((C7491a.d.a) dVar2).m31128G2() : null;
        } else {
            accountM31128G2 = googleSignInAccountM31129w3.m9069G2();
        }
        aVar.m35973d(accountM31128G2);
        C7491a.d dVar3 = this.f28853d;
        Set<Scope> setM9066B3 = (!(dVar3 instanceof C7491a.d.b) || (googleSignInAccountM31129w2 = ((C7491a.d.b) dVar3).m31129w2()) == null) ? Collections.EMPTY_SET : googleSignInAccountM31129w2.m9066B3();
        aVar.m35972c(setM9066B3);
        aVar.m35974e(this.f28850a.getClass().getName());
        aVar.m35971b(this.f28850a.getPackageName());
        return aVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: y */
    public <TResult, A extends C7491a.b> Task<TResult> m31150y(@NonNull AbstractC8078u<A, TResult> abstractC8078u) {
        return m31147O(2, abstractC8078u);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: z */
    public <TResult, A extends C7491a.b> Task<TResult> m31151z(@NonNull AbstractC8078u<A, TResult> abstractC8078u) {
        return m31147O(0, abstractC8078u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7495e(@NonNull Context context, Activity activity, C7491a c7491a, C7491a.d dVar, a aVar) {
        C8953m.m36048m(context, "Null context is not permitted.");
        C8953m.m36048m(c7491a, "Api must not be null.");
        C8953m.m36048m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C8953m.m36048m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f28850a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : m31137E(context);
        this.f28851b = attributionTag;
        this.f28852c = c7491a;
        this.f28853d = dVar;
        this.f28855f = aVar.f28862b;
        C8021b c8021bM33115a = C8021b.m33115a(c7491a, dVar, attributionTag);
        this.f28854e = c8021bM33115a;
        this.f28857h = new C8061o0(this);
        C8033f c8033fM33143v = C8033f.m33143v(context2);
        this.f28859j = c8033fM33143v;
        this.f28856g = c8033fM33143v.m33159l();
        this.f28858i = aVar.f28861a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C8018a0.m33103u(activity, c8033fM33143v, c8021bM33115a);
        }
        c8033fM33143v.m33150J(this);
    }

    public AbstractC7495e(@NonNull Context context, @NonNull C7491a<O> c7491a, @NonNull O o8, @NonNull a aVar) {
        this(context, null, c7491a, o8, aVar);
    }

    @Deprecated
    public AbstractC7495e(@NonNull Context context, @NonNull C7491a<O> c7491a, @NonNull O o8, @NonNull InterfaceC8072s interfaceC8072s) {
        a.C14196a c14196a = new a.C14196a();
        c14196a.m31153b(interfaceC8072s);
        this(context, c7491a, o8, c14196a.m31152a());
    }
}
