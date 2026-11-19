package o9;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f26938a;
    public final Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f26939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f26942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qb.a f26945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f26946j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f26947a;
        public w1.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final qb.a f26950e = qb.a.f29949j;

        @NonNull
        public f a() {
            return new f(this.f26947a, this.b, null, 0, null, this.f26948c, this.f26949d, this.f26950e, false);
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f26948c = str;
            return this;
        }

        @NonNull
        public final a c(@NonNull Collection collection) {
            if (this.b == null) {
                this.b = new w1.b();
            }
            this.b.addAll(collection);
            return this;
        }

        @NonNull
        public final a d(Account account) {
            this.f26947a = account;
            return this;
        }

        @NonNull
        public final a e(@NonNull String str) {
            this.f26949d = str;
            return this;
        }
    }

    public f(Account account, @NonNull Set set, @NonNull Map map, int i10, View view, @NonNull String str, @NonNull String str2, qb.a aVar, boolean z10) {
        this.f26938a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f26940d = map;
        this.f26942f = view;
        this.f26941e = i10;
        this.f26943g = str;
        this.f26944h = str2;
        this.f26945i = aVar == null ? qb.a.f29949j : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((e0) it.next()).f26937a);
        }
        this.f26939c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f26938a;
    }

    @Deprecated
    public String b() {
        Account account = this.f26938a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    public Account c() {
        Account account = this.f26938a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    public Set<Scope> d() {
        return this.f26939c;
    }

    @NonNull
    public Set<Scope> e(@NonNull l9.a<?> aVar) {
        e0 e0Var = (e0) this.f26940d.get(aVar);
        if (e0Var == null || e0Var.f26937a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(e0Var.f26937a);
        return hashSet;
    }

    public int f() {
        return this.f26941e;
    }

    @NonNull
    public String g() {
        return this.f26943g;
    }

    @NonNull
    public Set<Scope> h() {
        return this.b;
    }

    public View i() {
        return this.f26942f;
    }

    @NonNull
    public final qb.a j() {
        return this.f26945i;
    }

    public final Integer k() {
        return this.f26946j;
    }

    public final String l() {
        return this.f26944h;
    }

    public final void m(@NonNull Integer num) {
        this.f26946j = num;
    }
}
