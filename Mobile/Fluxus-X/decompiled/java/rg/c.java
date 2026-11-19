package rg;

import java.sql.Timestamp;
import java.util.Date;
import lg.a0;
import lg.b0;
import lg.f;

/* JADX INFO: loaded from: classes2.dex */
public class c extends a0<Timestamp> {
    public static final b0 b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0<Date> f30703a;

    public class a implements b0 {
        @Override // lg.b0
        public <T> a0<T> create(f fVar, sg.a<T> aVar) {
            a aVar2 = null;
            if (aVar.c() == Timestamp.class) {
                return new c(fVar.l(Date.class), aVar2);
            }
            return null;
        }
    }

    public /* synthetic */ c(a0 a0Var, a aVar) {
        this(a0Var);
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(tg.a aVar) {
        Date date = this.f30703a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, Timestamp timestamp) {
        this.f30703a.write(cVar, timestamp);
    }

    public c(a0<Date> a0Var) {
        this.f30703a = a0Var;
    }
}
