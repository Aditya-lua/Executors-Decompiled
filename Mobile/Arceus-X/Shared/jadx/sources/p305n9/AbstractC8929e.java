package p305n9;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p213j9.C7089c;
import p242k9.AbstractC7496f;
import p242k9.C7491a;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;

/* JADX INFO: renamed from: n9.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8929e<T extends IInterface> extends AbstractC8923c<T> implements C7491a.f {

    /* JADX INFO: renamed from: b */
    public final C8926d f32575b;

    /* JADX INFO: renamed from: c */
    public final Set f32576c;

    /* JADX INFO: renamed from: d */
    public final Account f32577d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AbstractC8929e(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull C8926d c8926d, @NonNull AbstractC7496f.a aVar, @NonNull AbstractC7496f.b bVar) {
        this(context, looper, i10, c8926d, (InterfaceC8030e) aVar, (InterfaceC8057n) bVar);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Set<Scope> mo26901b() {
        return requiresSignIn() ? this.f32576c : Collections.EMPTY_SET;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final C8926d m35979d() {
        return this.f32575b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public Set<Scope> m35980e(@NonNull Set<Scope> set) {
        return set;
    }

    /* JADX INFO: renamed from: f */
    public final Set m35981f(@NonNull Set set) {
        Set<Scope> setM35980e = m35980e(set);
        Iterator<Scope> it = setM35980e.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setM35980e;
    }

    @Override // p305n9.AbstractC8923c
    public final Account getAccount() {
        return this.f32577d;
    }

    @Override // p305n9.AbstractC8923c
    public Executor getBindServiceExecutor() {
        return null;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final Set<Scope> getScopes() {
        return this.f32576c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC8929e(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull C8926d c8926d, @NonNull InterfaceC8030e interfaceC8030e, @NonNull InterfaceC8057n interfaceC8057n) {
        this(context, looper, AbstractC8932f.m35986a(context), C7089c.m29849o(), i10, c8926d, (InterfaceC8030e) C8953m.m36047l(interfaceC8030e), (InterfaceC8057n) C8953m.m36047l(interfaceC8057n));
    }

    public AbstractC8929e(@NonNull Context context, @NonNull Looper looper, @NonNull AbstractC8932f abstractC8932f, @NonNull C7089c c7089c, int i10, @NonNull C8926d c8926d, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, abstractC8932f, c7089c, i10, interfaceC8030e == null ? null : new C8921b0(interfaceC8030e), interfaceC8057n != null ? new C8924c0(interfaceC8057n) : null, c8926d.m35968l());
        this.f32575b = c8926d;
        this.f32577d = c8926d.m35957a();
        this.f32576c = m35981f(c8926d.m35960d());
    }
}
