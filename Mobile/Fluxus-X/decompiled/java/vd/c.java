package vd;

import com.google.android.gms.tasks.Task;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public static abstract class a {

        /* JADX INFO: renamed from: vd.c$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0699a {
            public abstract a a();

            public abstract AbstractC0699a b(long j10);
        }

        public static AbstractC0699a c() {
            v0 v0Var = new v0();
            v0Var.c(0);
            return v0Var;
        }

        public abstract int a();

        public abstract long b();
    }

    public static abstract class b {
        public abstract String a();
    }

    /* JADX INFO: renamed from: vd.c$c, reason: collision with other inner class name */
    public interface InterfaceC0700c {
        Task<b> a(d dVar);
    }

    public static abstract class d {

        public static abstract class a {
            public abstract d a();

            public abstract a b(String str);
        }

        public static a a() {
            y0 y0Var = new y0();
            y0Var.c(ge.t.g());
            return y0Var;
        }

        public abstract String b();

        public abstract Set<Integer> c();
    }

    Task<InterfaceC0700c> a(a aVar);
}
