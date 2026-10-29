package l2;

import android.content.LocusId;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22924a;
    public final LocusId b;

    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public d(String str) {
        this.f22924a = (String) x2.g.k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = a.a(str);
        } else {
            this.b = null;
        }
    }

    public static d d(LocusId locusId) {
        x2.g.h(locusId, "locusId cannot be null");
        return new d((String) x2.g.k(a.b(locusId), "id cannot be empty"));
    }

    public String a() {
        return this.f22924a;
    }

    public final String b() {
        return this.f22924a.length() + "_chars";
    }

    public LocusId c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f22924a;
        if (str == null) {
            return dVar.f22924a == null;
        }
        return str.equals(dVar.f22924a);
    }

    public int hashCode() {
        String str = this.f22924a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
