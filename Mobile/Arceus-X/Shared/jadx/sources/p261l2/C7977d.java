package p261l2;

import android.content.LocusId;
import android.os.Build;
import p533x2.C12637g;

/* JADX INFO: renamed from: l2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7977d {

    /* JADX INFO: renamed from: a */
    public final String f29886a;

    /* JADX INFO: renamed from: b */
    public final LocusId f29887b;

    /* JADX INFO: renamed from: l2.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static LocusId m33036a(String str) {
            return new LocusId(str);
        }

        /* JADX INFO: renamed from: b */
        public static String m33037b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public C7977d(String str) {
        this.f29886a = (String) C12637g.m47079k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f29887b = a.m33036a(str);
        } else {
            this.f29887b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C7977d m33032d(LocusId locusId) {
        C12637g.m47076h(locusId, "locusId cannot be null");
        return new C7977d((String) C12637g.m47079k(a.m33037b(locusId), "id cannot be empty"));
    }

    /* JADX INFO: renamed from: a */
    public String m33033a() {
        return this.f29886a;
    }

    /* JADX INFO: renamed from: b */
    public final String m33034b() {
        return this.f29886a.length() + "_chars";
    }

    /* JADX INFO: renamed from: c */
    public LocusId m33035c() {
        return this.f29887b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7977d.class != obj.getClass()) {
            return false;
        }
        C7977d c7977d = (C7977d) obj;
        String str = this.f29886a;
        if (str == null) {
            return c7977d.f29886a == null;
        }
        return str.equals(c7977d.f29886a);
    }

    public int hashCode() {
        String str = this.f29886a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m33034b() + "]";
    }
}
