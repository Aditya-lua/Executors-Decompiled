package n9;

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
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f25236a;
    public final Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f25237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f25240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pb.a f25243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f25244j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f25245a;
        public w1.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f25247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final pb.a f25248e = pb.a.f28389j;

        @NonNull
        public d a() {
            return new d(this.f25245a, this.b, null, 0, null, this.f25246c, this.f25247d, this.f25248e, false);
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f25246c = str;
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
            this.f25245a = account;
            return this;
        }

        @NonNull
        public final a e(@NonNull String str) {
            this.f25247d = str;
            return this;
        }
    }

    public d(Account account, @NonNull Set set, @NonNull Map map, int i10, View view, @NonNull String str, @NonNull String str2, pb.a aVar, boolean z10) {
        this.f25236a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f25238d = map;
        this.f25240f = view;
        this.f25239e = i10;
        this.f25241g = str;
        this.f25242h = str2;
        this.f25243i = aVar == null ? pb.a.f28389j : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((w) it.next()).f25302a);
        }
        this.f25237c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f25236a;
    }

    @Deprecated
    public String b() {
        Account account = this.f25236a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    public Account c() {
        Account account = this.f25236a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    public Set<Scope> d() {
        return this.f25237c;
    }

    @NonNull
    public Set<Scope> e(@NonNull k9.a<?> aVar) {
        w wVar = (w) this.f25238d.get(aVar);
        if (wVar == null || wVar.f25302a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(wVar.f25302a);
        return hashSet;
    }

    public int f() {
        return this.f25239e;
    }

    @NonNull
    public String g() {
        return this.f25241g;
    }

    @NonNull
    public Set<Scope> h() {
        return this.b;
    }

    public View i() {
        return this.f25240f;
    }

    @NonNull
    public final pb.a j() {
        return this.f25243i;
    }

    public final Integer k() {
        return this.f25244j;
    }

    public final String l() {
        return this.f25242h;
    }

    public final void m(@NonNull Integer num) {
        this.f25244j = num;
    }
}
