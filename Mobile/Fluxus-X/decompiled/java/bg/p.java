package bg;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final long b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4014c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f4015d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.a f4016a;

    public p(fg.a aVar) {
        this.f4016a = aVar;
    }

    public static p c() {
        return d(fg.b.b());
    }

    public static p d(fg.a aVar) {
        if (f4015d == null) {
            f4015d = new p(aVar);
        }
        return f4015d;
    }

    public static boolean g(String str) {
        return f4014c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f4016a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull dg.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + b;
    }
}
