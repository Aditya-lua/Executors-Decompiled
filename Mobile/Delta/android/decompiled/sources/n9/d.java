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
    public final Account f26057a;
    public final Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f26058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f26061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pb.a f26064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f26065j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f26066a;
        public w1.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final pb.a f26069e = pb.a.f28608j;

        @NonNull
        public d a() {
            return new d(this.f26066a, this.b, null, 0, null, this.f26067c, this.f26068d, this.f26069e, false);
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f26067c = str;
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
            this.f26066a = account;
            return this;
        }

        @NonNull
        public final a e(@NonNull String str) {
            this.f26068d = str;
            return this;
        }
    }

    public d(Account account, @NonNull Set set, @NonNull Map map, int i10, View view, @NonNull String str, @NonNull String str2, pb.a aVar, boolean z10) {
        this.f26057a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f26059d = map;
        this.f26061f = view;
        this.f26060e = i10;
        this.f26062g = str;
        this.f26063h = str2;
        this.f26064i = aVar == null ? pb.a.f28608j : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((w) it.next()).f26123a);
        }
        this.f26058c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f26057a;
    }

    @Deprecated
    public String b() {
        Account account = this.f26057a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    public Account c() {
        Account account = this.f26057a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    public Set<Scope> d() {
        return this.f26058c;
    }

    @NonNull
    public Set<Scope> e(@NonNull k9.a<?> aVar) {
        w wVar = (w) this.f26059d.get(aVar);
        if (wVar == null || wVar.f26123a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(wVar.f26123a);
        return hashSet;
    }

    public int f() {
        return this.f26060e;
    }

    @NonNull
    public String g() {
        return this.f26062g;
    }

    @NonNull
    public Set<Scope> h() {
        return this.b;
    }

    public View i() {
        return this.f26061f;
    }

    @NonNull
    public final pb.a j() {
        return this.f26064i;
    }

    public final Integer k() {
        return this.f26065j;
    }

    public final String l() {
        return this.f26063h;
    }

    public final void m(@NonNull Integer num) {
        this.f26065j = num;
    }
}
