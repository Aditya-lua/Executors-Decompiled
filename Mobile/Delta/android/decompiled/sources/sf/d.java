package sf;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import qf.f;
import qf.g;
import qf.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements rf.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qf.e<Object> f30698e = new qf.e() { // from class: sf.a
        @Override // qf.b
        public final void encode(Object obj, f fVar) {
            d.b(obj, fVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g<String> f30699f = new g() { // from class: sf.b
        @Override // qf.b
        public final void encode(Object obj, h hVar) {
            hVar.add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g<Boolean> f30700g = new g() { // from class: sf.c
        @Override // qf.b
        public final void encode(Object obj, h hVar) {
            hVar.add(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f30701h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, qf.e<?>> f30702a = new HashMap();
    public final Map<Class<?>, g<?>> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qf.e<Object> f30703c = f30698e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30704d = false;

    public class a implements qf.a {
        public a() {
        }

        @Override // qf.a
        public void a(@NonNull Object obj, @NonNull Writer writer) {
            e eVar = new e(writer, d.this.f30702a, d.this.b, d.this.f30703c, d.this.f30704d);
            eVar.c(obj, false);
            eVar.k();
        }

        @Override // qf.a
        public String b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f30706a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f30706a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(@NonNull Date date, @NonNull h hVar) {
            hVar.add(f30706a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        l(String.class, f30699f);
        l(Boolean.class, f30700g);
        l(Date.class, f30701h);
    }

    public static /* synthetic */ void b(Object obj, f fVar) {
        throw new qf.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public qf.a h() {
        return new a();
    }

    @NonNull
    public d i(@NonNull rf.a aVar) {
        aVar.configure(this);
        return this;
    }

    @NonNull
    public d j(boolean z10) {
        this.f30704d = z10;
        return this;
    }

    @Override // rf.b
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <T> d registerEncoder(@NonNull Class<T> cls, @NonNull qf.e<? super T> eVar) {
        this.f30702a.put(cls, eVar);
        this.b.remove(cls);
        return this;
    }

    @NonNull
    public <T> d l(@NonNull Class<T> cls, @NonNull g<? super T> gVar) {
        this.b.put(cls, gVar);
        this.f30702a.remove(cls);
        return this;
    }
}
