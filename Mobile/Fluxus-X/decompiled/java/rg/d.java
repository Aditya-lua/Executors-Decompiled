package rg;

import java.sql.Timestamp;
import java.util.Date;
import lg.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f30704a;
    public static final og.c.b<? extends Date> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final og.c.b<? extends Date> f30705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f30706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f30707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f30708f;

    public class a extends og.c.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // og.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    public class b extends og.c.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // og.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f30704a = z10;
        if (z10) {
            b = new a(java.sql.Date.class);
            f30705c = new b(Timestamp.class);
            f30706d = rg.a.b;
            f30707e = rg.b.b;
            f30708f = c.b;
            return;
        }
        b = null;
        f30705c = null;
        f30706d = null;
        f30707e = null;
        f30708f = null;
    }
}
