package p020b0;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1182h {

    /* JADX INFO: renamed from: a */
    public final c f4926a;

    /* JADX INFO: renamed from: b0.h$a */
    public static class a implements c {

        /* JADX INFO: renamed from: a */
        public final InputConfiguration f4927a;

        public a(Object obj) {
            this.f4927a = (InputConfiguration) obj;
        }

        @Override // p020b0.C1182h.c
        /* JADX INFO: renamed from: a */
        public Object mo6555a() {
            return this.f4927a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f4927a, ((c) obj).mo6555a());
            }
            return false;
        }

        public int hashCode() {
            return this.f4927a.hashCode();
        }

        public String toString() {
            return this.f4927a.toString();
        }
    }

    /* JADX INFO: renamed from: b0.h$b */
    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: renamed from: b0.h$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Object mo6555a();
    }

    public C1182h(c cVar) {
        this.f4926a = cVar;
    }

    /* JADX INFO: renamed from: b */
    public static C1182h m6553b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C1182h(new b(obj)) : new C1182h(new a(obj));
    }

    /* JADX INFO: renamed from: a */
    public Object m6554a() {
        return this.f4926a.mo6555a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1182h) {
            return this.f4926a.equals(((C1182h) obj).f4926a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4926a.hashCode();
    }

    public String toString() {
        return this.f4926a.toString();
    }
}
