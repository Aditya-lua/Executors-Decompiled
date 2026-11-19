package rg;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import lg.a0;
import lg.b0;
import lg.f;
import lg.u;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a0<Time> {
    public static final b0 b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f30702a;

    public class a implements b0 {
        @Override // lg.b0
        public <T> a0<T> create(f fVar, sg.a<T> aVar) {
            a aVar2 = null;
            if (aVar.c() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(tg.a aVar) throws IOException {
        Time time;
        if (aVar.Q() == tg.b.NULL) {
            aVar.K();
            return null;
        }
        String strN = aVar.N();
        synchronized (this) {
            TimeZone timeZone = this.f30702a.getTimeZone();
            try {
                try {
                    time = new Time(this.f30702a.parse(strN).getTime());
                    this.f30702a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new u("Failed parsing '" + strN + "' as SQL Time; at path " + aVar.n(), e10);
                }
            } catch (Throwable th2) {
                this.f30702a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.s();
            return;
        }
        synchronized (this) {
            str = this.f30702a.format((Date) time);
        }
        cVar.Y(str);
    }

    private b() {
        this.f30702a = new SimpleDateFormat("hh:mm:ss a");
    }
}
