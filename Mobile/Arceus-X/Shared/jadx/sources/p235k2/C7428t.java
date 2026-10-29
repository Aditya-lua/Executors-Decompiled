package p235k2;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: k2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7428t {

    /* JADX INFO: renamed from: a */
    public final String f28678a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f28679b;

    /* JADX INFO: renamed from: c */
    public final CharSequence[] f28680c;

    /* JADX INFO: renamed from: d */
    public final boolean f28681d;

    /* JADX INFO: renamed from: e */
    public final int f28682e;

    /* JADX INFO: renamed from: f */
    public final Bundle f28683f;

    /* JADX INFO: renamed from: g */
    public final Set<String> f28684g;

    /* JADX INFO: renamed from: k2.t$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static RemoteInput m30943a(C7428t c7428t) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(c7428t.m30941i()).setLabel(c7428t.m30940h()).setChoices(c7428t.m30937e()).setAllowFreeFormInput(c7428t.m30935c()).addExtras(c7428t.m30939g());
            Set<String> setM30936d = c7428t.m30936d();
            if (setM30936d != null) {
                Iterator<String> it = setM30936d.iterator();
                while (it.hasNext()) {
                    b.m30945a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.m30946a(builderAddExtras, c7428t.m30938f());
            }
            return builderAddExtras.build();
        }

        /* JADX INFO: renamed from: b */
        public static Bundle m30944b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: renamed from: k2.t$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static RemoteInput.Builder m30945a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: renamed from: k2.t$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static RemoteInput.Builder m30946a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* JADX INFO: renamed from: k2.t$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f28685a;

        /* JADX INFO: renamed from: d */
        public CharSequence f28688d;

        /* JADX INFO: renamed from: e */
        public CharSequence[] f28689e;

        /* JADX INFO: renamed from: b */
        public final Set<String> f28686b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Bundle f28687c = new Bundle();

        /* JADX INFO: renamed from: f */
        public boolean f28690f = true;

        /* JADX INFO: renamed from: g */
        public int f28691g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f28685a = str;
        }

        /* JADX INFO: renamed from: a */
        public C7428t m30947a() {
            return new C7428t(this.f28685a, this.f28688d, this.f28689e, this.f28690f, this.f28691g, this.f28687c, this.f28686b);
        }

        /* JADX INFO: renamed from: b */
        public d m30948b(CharSequence charSequence) {
            this.f28688d = charSequence;
            return this;
        }
    }

    public C7428t(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f28678a = str;
        this.f28679b = charSequence;
        this.f28680c = charSequenceArr;
        this.f28681d = z10;
        this.f28682e = i10;
        this.f28683f = bundle;
        this.f28684g = set;
        if (m30938f() == 2 && !m30935c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* JADX INFO: renamed from: a */
    public static RemoteInput m30932a(C7428t c7428t) {
        return a.m30943a(c7428t);
    }

    /* JADX INFO: renamed from: b */
    public static RemoteInput[] m30933b(C7428t[] c7428tArr) {
        if (c7428tArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c7428tArr.length];
        for (int i10 = 0; i10 < c7428tArr.length; i10++) {
            remoteInputArr[i10] = m30932a(c7428tArr[i10]);
        }
        return remoteInputArr;
    }

    /* JADX INFO: renamed from: j */
    public static Bundle m30934j(Intent intent) {
        return a.m30944b(intent);
    }

    /* JADX INFO: renamed from: c */
    public boolean m30935c() {
        return this.f28681d;
    }

    /* JADX INFO: renamed from: d */
    public Set<String> m30936d() {
        return this.f28684g;
    }

    /* JADX INFO: renamed from: e */
    public CharSequence[] m30937e() {
        return this.f28680c;
    }

    /* JADX INFO: renamed from: f */
    public int m30938f() {
        return this.f28682e;
    }

    /* JADX INFO: renamed from: g */
    public Bundle m30939g() {
        return this.f28683f;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m30940h() {
        return this.f28679b;
    }

    /* JADX INFO: renamed from: i */
    public String m30941i() {
        return this.f28678a;
    }

    /* JADX INFO: renamed from: k */
    public boolean m30942k() {
        if (m30935c()) {
            return false;
        }
        return ((m30937e() != null && m30937e().length != 0) || m30936d() == null || m30936d().isEmpty()) ? false : true;
    }
}
