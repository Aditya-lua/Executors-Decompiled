package n9;

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

/* JADX INFO: loaded from: classes.dex */
public abstract class e<T extends IInterface> extends c<T> implements k9.a.f {
    public final d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f25250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f25251d;

    @Deprecated
    public e(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull d dVar, @NonNull k9.f.a aVar, @NonNull k9.f.b bVar) {
        this(context, looper, i10, dVar, (l9.e) aVar, (l9.n) bVar);
    }

    @NonNull
    public Set<Scope> b() {
        return requiresSignIn() ? this.f25250c : Collections.EMPTY_SET;
    }

    @NonNull
    public final d d() {
        return this.b;
    }

    @NonNull
    public Set<Scope> e(@NonNull Set<Scope> set) {
        return set;
    }

    public final Set f(@NonNull Set set) {
        Set<Scope> setE = e(set);
        Iterator<Scope> it = setE.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setE;
    }

    @Override // n9.c
    public final Account getAccount() {
        return this.f25251d;
    }

    @Override // n9.c
    public Executor getBindServiceExecutor() {
        return null;
    }

    @Override // n9.c
    @NonNull
    public final Set<Scope> getScopes() {
        return this.f25250c;
    }

    public e(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull d dVar, @NonNull l9.e eVar, @NonNull l9.n nVar) {
        this(context, looper, f.a(context), j9.c.o(), i10, dVar, (l9.e) m.l(eVar), (l9.n) m.l(nVar));
    }

    public e(@NonNull Context context, @NonNull Looper looper, @NonNull f fVar, @NonNull j9.c cVar, int i10, @NonNull d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, fVar, cVar, i10, eVar == null ? null : new b0(eVar), nVar != null ? new c0(nVar) : null, dVar.l());
        this.b = dVar;
        this.f25251d = dVar.a();
        this.f25250c = f(dVar.d());
    }
}
