package og;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import lg.a0;
import lg.b0;
import lg.u;
import ng.e0;
import ng.y;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T extends Date> extends a0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f28126c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f28127a;
    public final List<DateFormat> b;

    public class a implements b0 {
        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            a aVar2 = null;
            if (aVar.c() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new c(b.b, i10, i10, aVar2);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f28128a;

        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // og.c.b
            public Date d(Date date) {
                return date;
            }
        }

        public b(Class<T> cls) {
            this.f28128a = cls;
        }

        public final b0 a(int i10, int i11) {
            return c(new c<>(this, i10, i11, null));
        }

        public final b0 b(String str) {
            return c(new c<>(this, str, (a) null));
        }

        public final b0 c(c<T> cVar) {
            return p.b(this.f28128a, cVar);
        }

        public abstract T d(Date date);
    }

    public /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    public final Date a(tg.a aVar) throws IOException {
        String strN = aVar.N();
        synchronized (this.b) {
            try {
                for (DateFormat dateFormat : this.b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            Date date = dateFormat.parse(strN);
                            dateFormat.setTimeZone(timeZone);
                            return date;
                        } catch (Throwable th2) {
                            dateFormat.setTimeZone(timeZone);
                            throw th2;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return pg.a.c(strN, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new u("Failed parsing '" + strN + "' as Date; at path " + aVar.n(), e10);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T read(tg.a aVar) throws IOException {
        if (aVar.Q() == tg.b.NULL) {
            aVar.K();
            return null;
        }
        return (T) this.f28127a.d(a(aVar));
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.s();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        cVar.Y(str);
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    public c(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.f28127a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public c(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bVar);
        this.f28127a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (y.c()) {
            arrayList.add(e0.c(i10, i11));
        }
    }
}
