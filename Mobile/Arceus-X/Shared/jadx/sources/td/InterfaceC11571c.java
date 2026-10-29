package td;

import com.google.android.gms.tasks.Task;
import ee.AbstractC5095t;
import java.util.Set;

/* JADX INFO: renamed from: td.c */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC11571c {

    /* JADX INFO: renamed from: td.c$a */
    public static abstract class a {

        /* JADX INFO: renamed from: td.c$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC14260a {
            /* JADX INFO: renamed from: a */
            public abstract a mo43246a();

            /* JADX INFO: renamed from: b */
            public abstract AbstractC14260a mo43247b(long j10);
        }

        /* JADX INFO: renamed from: c */
        public static AbstractC14260a m43243c() {
            C11627v0 c11627v0 = new C11627v0();
            c11627v0.m43285c(0);
            return c11627v0;
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo43244a();

        /* JADX INFO: renamed from: b */
        public abstract long mo43245b();
    }

    /* JADX INFO: renamed from: td.c$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract String mo43248a();
    }

    /* JADX INFO: renamed from: td.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Task<b> mo43249a(d dVar);
    }

    /* JADX INFO: renamed from: td.c$d */
    public static abstract class d {

        /* JADX INFO: renamed from: td.c$d$a */
        public static abstract class a {
            /* JADX INFO: renamed from: a */
            public abstract d mo43251a();

            /* JADX INFO: renamed from: b */
            public abstract a mo43252b(String str);
        }

        /* JADX INFO: renamed from: a */
        public static a m43250a() {
            C11633y0 c11633y0 = new C11633y0();
            c11633y0.m43287c(AbstractC5095t.m23834g());
            return c11633y0;
        }

        /* JADX INFO: renamed from: b */
        public abstract String mo43239b();

        /* JADX INFO: renamed from: c */
        public abstract Set<Integer> mo43240c();
    }

    /* JADX INFO: renamed from: a */
    Task<c> mo43242a(a aVar);
}
