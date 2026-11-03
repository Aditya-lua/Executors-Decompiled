package zf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final long b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f38122c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f38123d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dg.a f38124a;

    public p(dg.a aVar) {
        this.f38124a = aVar;
    }

    public static p c() {
        return d(dg.b.b());
    }

    public static p d(dg.a aVar) {
        if (f38123d == null) {
            f38123d = new p(aVar);
        }
        return f38123d;
    }

    public static boolean g(String str) {
        return f38122c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f38124a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull bg.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + b;
    }
}
