package b0;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3764a;

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputConfiguration f3765a;

        public a(Object obj) {
            this.f3765a = (InputConfiguration) obj;
        }

        @Override // b0.h.c
        public Object a() {
            return this.f3765a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f3765a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f3765a.hashCode();
        }

        public String toString() {
            return this.f3765a.toString();
        }
    }

    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }
    }

    public interface c {
        Object a();
    }

    public h(c cVar) {
        this.f3764a = cVar;
    }

    public static h b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new h(new b(obj)) : new h(new a(obj));
    }

    public Object a() {
        return this.f3764a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3764a.equals(((h) obj).f3764a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3764a.hashCode();
    }

    public String toString() {
        return this.f3764a.toString();
    }
}
