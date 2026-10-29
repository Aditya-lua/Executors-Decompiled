package p305n9;

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
import p242k9.C7491a;
import p356pb.C10187a;
import p504w1.C12278b;

/* JADX INFO: renamed from: n9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8926d {

    /* JADX INFO: renamed from: a */
    public final Account f32558a;

    /* JADX INFO: renamed from: b */
    public final Set f32559b;

    /* JADX INFO: renamed from: c */
    public final Set f32560c;

    /* JADX INFO: renamed from: d */
    public final Map f32561d;

    /* JADX INFO: renamed from: e */
    public final int f32562e;

    /* JADX INFO: renamed from: f */
    public final View f32563f;

    /* JADX INFO: renamed from: g */
    public final String f32564g;

    /* JADX INFO: renamed from: h */
    public final String f32565h;

    /* JADX INFO: renamed from: i */
    public final C10187a f32566i;

    /* JADX INFO: renamed from: j */
    public Integer f32567j;

    /* JADX INFO: renamed from: n9.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Account f32568a;

        /* JADX INFO: renamed from: b */
        public C12278b f32569b;

        /* JADX INFO: renamed from: c */
        public String f32570c;

        /* JADX INFO: renamed from: d */
        public String f32571d;

        /* JADX INFO: renamed from: e */
        public final C10187a f32572e = C10187a.f36753j;

        @NonNull
        /* JADX INFO: renamed from: a */
        public C8926d m35970a() {
            return new C8926d(this.f32568a, this.f32569b, null, 0, null, this.f32570c, this.f32571d, this.f32572e, false);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m35971b(@NonNull String str) {
            this.f32570c = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public final a m35972c(@NonNull Collection collection) {
            if (this.f32569b == null) {
                this.f32569b = new C12278b();
            }
            this.f32569b.addAll(collection);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public final a m35973d(Account account) {
            this.f32568a = account;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public final a m35974e(@NonNull String str) {
            this.f32571d = str;
            return this;
        }
    }

    public C8926d(Account account, @NonNull Set set, @NonNull Map map, int i10, View view, @NonNull String str, @NonNull String str2, C10187a c10187a, boolean z10) {
        this.f32558a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f32559b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f32561d = map;
        this.f32563f = view;
        this.f32562e = i10;
        this.f32564g = str;
        this.f32565h = str2;
        this.f32566i = c10187a == null ? C10187a.f36753j : c10187a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C8975w) it.next()).f32642a);
        }
        this.f32560c = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: a */
    public Account m35957a() {
        return this.f32558a;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public String m35958b() {
        Account account = this.f32558a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Account m35959c() {
        Account account = this.f32558a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Set<Scope> m35960d() {
        return this.f32560c;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public Set<Scope> m35961e(@NonNull C7491a<?> c7491a) {
        C8975w c8975w = (C8975w) this.f32561d.get(c7491a);
        if (c8975w == null || c8975w.f32642a.isEmpty()) {
            return this.f32559b;
        }
        HashSet hashSet = new HashSet(this.f32559b);
        hashSet.addAll(c8975w.f32642a);
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public int m35962f() {
        return this.f32562e;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public String m35963g() {
        return this.f32564g;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Set<Scope> m35964h() {
        return this.f32559b;
    }

    /* JADX INFO: renamed from: i */
    public View m35965i() {
        return this.f32563f;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public final C10187a m35966j() {
        return this.f32566i;
    }

    /* JADX INFO: renamed from: k */
    public final Integer m35967k() {
        return this.f32567j;
    }

    /* JADX INFO: renamed from: l */
    public final String m35968l() {
        return this.f32565h;
    }

    /* JADX INFO: renamed from: m */
    public final void m35969m(@NonNull Integer num) {
        this.f32567j = num;
    }
}
