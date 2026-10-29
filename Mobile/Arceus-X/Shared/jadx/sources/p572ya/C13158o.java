package p572ya;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import p242k9.AbstractC7495e;
import p242k9.AbstractC7496f;
import p242k9.C7491a;
import p242k9.C7492b;
import p268l9.AbstractC8078u;
import p268l9.C8033f;
import p268l9.InterfaceC8066q;
import p305n9.C8953m;
import p325o9.C9719c;
import p598z8.C13748l;
import p598z8.InterfaceC13739c;
import sb.C11264k;

/* JADX INFO: renamed from: ya.o */
/* JADX INFO: loaded from: classes.dex */
public final class C13158o extends AbstractC7495e implements InterfaceC13739c {

    /* JADX INFO: renamed from: l */
    public static final C7491a.g f46411l;

    /* JADX INFO: renamed from: m */
    public static final C7491a.a f46412m;

    /* JADX INFO: renamed from: n */
    public static final C7491a f46413n;

    /* JADX INFO: renamed from: k */
    public final String f46414k;

    static {
        C7491a.g gVar = new C7491a.g();
        f46411l = gVar;
        C13153j c13153j = new C13153j();
        f46412m = c13153j;
        f46413n = new C7491a("Auth.Api.Identity.SignIn.API", c13153j, gVar);
    }

    public C13158o(@NonNull Context context, @NonNull C13748l c13748l) {
        super(context, (C7491a<C13748l>) f46413n, c13748l, AbstractC7495e.a.f28860c);
        this.f46414k = C13161r.m48764a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m48756P(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, C13159p c13159p, C11264k c11264k) {
        ((C13151h0) c13159p.getService()).m48752u2(new BinderC13157n(this, c11264k), getPhoneNumberHintIntentRequest, this.f46414k);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m48757Q(C13159p c13159p, C11264k c11264k) {
        ((C13151h0) c13159p.getService()).m48754w2(new BinderC13155l(this, c11264k), this.f46414k);
    }

    @Override // p598z8.InterfaceC13739c
    /* JADX INFO: renamed from: b */
    public final Task<PendingIntent> mo48758b(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        C8953m.m36047l(getSignInIntentRequest);
        GetSignInIntentRequest.C1878a c1878aM9031A3 = GetSignInIntentRequest.m9031A3(getSignInIntentRequest);
        c1878aM9031A3.m9042f(this.f46414k);
        final GetSignInIntentRequest getSignInIntentRequestM9037a = c1878aM9031A3.m9037a();
        return m31151z(AbstractC8078u.m33280c().m33288d(C13160q.f46421f).m33286b(new InterfaceC8066q() { // from class: ya.i
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C13151h0) ((C13159p) obj).getService()).m48753v2(new BinderC13156m(this.f46405a, (C11264k) obj2), (GetSignInIntentRequest) C8953m.m36047l(getSignInIntentRequestM9037a));
            }
        }).m33289e(1555).m33285a());
    }

    @Override // p598z8.InterfaceC13739c
    /* JADX INFO: renamed from: d */
    public final SignInCredential mo48759d(Intent intent) throws C7492b {
        if (intent == null) {
            throw new C7492b(Status.f7407m);
        }
        Status status = (Status) C9719c.m38484b(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
        if (status == null) {
            throw new C7492b(Status.f7409o);
        }
        if (!status.m9163A3()) {
            throw new C7492b(status);
        }
        SignInCredential signInCredential = (SignInCredential) C9719c.m38484b(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new C7492b(Status.f7407m);
    }

    @Override // p598z8.InterfaceC13739c
    /* JADX INFO: renamed from: o */
    public final String mo48760o(Intent intent) throws C7492b {
        if (intent == null) {
            throw new C7492b(Status.f7407m);
        }
        Status status = (Status) C9719c.m38484b(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
        if (status == null) {
            throw new C7492b(Status.f7409o);
        }
        if (!status.m9163A3()) {
            throw new C7492b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new C7492b(Status.f7407m);
    }

    @Override // p598z8.InterfaceC13739c
    /* JADX INFO: renamed from: q */
    public final Task<PendingIntent> mo48761q(@NonNull final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        C8953m.m36047l(getPhoneNumberHintIntentRequest);
        return m31151z(AbstractC8078u.m33280c().m33288d(C13160q.f46423h).m33286b(new InterfaceC8066q() { // from class: ya.f
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                this.f46400a.m48756P(getPhoneNumberHintIntentRequest, (C13159p) obj, (C11264k) obj2);
            }
        }).m33289e(1653).m33285a());
    }

    @Override // p598z8.InterfaceC13739c
    /* JADX INFO: renamed from: r */
    public final Task<Void> mo48762r() {
        m31139G().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<AbstractC7496f> it = AbstractC7496f.m31154b().iterator();
        while (it.hasNext()) {
            it.next().m31158e();
        }
        C8033f.m33132a();
        return m31136D(AbstractC8078u.m33280c().m33288d(C13160q.f46417b).m33286b(new InterfaceC8066q() { // from class: ya.g
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                this.f46402a.m48757Q((C13159p) obj, (C11264k) obj2);
            }
        }).m33287c(false).m33289e(1554).m33285a());
    }

    @Override // p598z8.InterfaceC13739c
    /* JADX INFO: renamed from: t */
    public final Task<BeginSignInResult> mo48763t(@NonNull BeginSignInRequest beginSignInRequest) {
        C8953m.m36047l(beginSignInRequest);
        BeginSignInRequest.C1876a c1876aM8978C3 = BeginSignInRequest.m8978C3(beginSignInRequest);
        c1876aM8978C3.m9026h(this.f46414k);
        final BeginSignInRequest beginSignInRequestM9019a = c1876aM8978C3.m9019a();
        return m31151z(AbstractC8078u.m33280c().m33288d(new Feature("auth_api_credentials_begin_sign_in", 8L)).m33286b(new InterfaceC8066q() { // from class: ya.h
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C13151h0) ((C13159p) obj).getService()).m48751t2(new BinderC13154k(this.f46403a, (C11264k) obj2), (BeginSignInRequest) C8953m.m36047l(beginSignInRequestM9019a));
            }
        }).m33287c(false).m33289e(1553).m33285a());
    }
}
