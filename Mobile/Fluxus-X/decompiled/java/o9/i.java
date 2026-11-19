package o9;

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
public abstract class i<T extends IInterface> extends d<T> implements l9.a.f {
    public final f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f26981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f26982d;

    @Deprecated
    public i(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull f fVar, @NonNull l9.h.a aVar, @NonNull l9.h.b bVar) {
        this(context, looper, i10, fVar, (m9.e) aVar, (m9.n) bVar);
    }

    @NonNull
    public Set<Scope> c() {
        return requiresSignIn() ? this.f26981c : Collections.EMPTY_SET;
    }

    @NonNull
    public final f d() {
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

    @Override // o9.d
    public final Account getAccount() {
        return this.f26982d;
    }

    @Override // o9.d
    public Executor getBindServiceExecutor() {
        return null;
    }

    @Override // o9.d
    @NonNull
    public final Set<Scope> getScopes() {
        return this.f26981c;
    }

    public i(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull f fVar, @NonNull m9.e eVar, @NonNull m9.n nVar) {
        this(context, looper, j.a(context), k9.e.o(), i10, fVar, (m9.e) s.l(eVar), (m9.n) s.l(nVar));
    }

    public i(@NonNull Context context, @NonNull Looper looper, @NonNull j jVar, @NonNull k9.e eVar, int i10, @NonNull f fVar, m9.e eVar2, m9.n nVar) {
        super(context, looper, jVar, eVar, i10, eVar2 == null ? null : new j0(eVar2), nVar != null ? new k0(nVar) : null, fVar.l());
        this.b = fVar;
        this.f26982d = fVar.a();
        this.f26981c = f(fVar.d());
    }
}
