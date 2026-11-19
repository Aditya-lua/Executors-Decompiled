package rg;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import lg.a0;
import lg.b0;
import lg.f;
import lg.u;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends a0<Date> {
    public static final b0 b = new C0600a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f30701a;

    /* JADX INFO: renamed from: rg.a$a, reason: collision with other inner class name */
    public class C0600a implements b0 {
        @Override // lg.b0
        public <T> a0<T> create(f fVar, sg.a<T> aVar) {
            C0600a c0600a = null;
            if (aVar.c() == Date.class) {
                return new a(c0600a);
            }
            return null;
        }
    }

    public /* synthetic */ a(C0600a c0600a) {
        this();
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(tg.a aVar) throws IOException {
        Date date;
        if (aVar.Q() == tg.b.NULL) {
            aVar.K();
            return null;
        }
        String strN = aVar.N();
        synchronized (this) {
            TimeZone timeZone = this.f30701a.getTimeZone();
            try {
                try {
                    date = new Date(this.f30701a.parse(strN).getTime());
                    this.f30701a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new u("Failed parsing '" + strN + "' as SQL Date; at path " + aVar.n(), e10);
                }
            } catch (Throwable th2) {
                this.f30701a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.s();
            return;
        }
        synchronized (this) {
            str = this.f30701a.format((java.util.Date) date);
        }
        cVar.Y(str);
    }

    private a() {
        this.f30701a = new SimpleDateFormat("MMM d, yyyy");
    }
}
