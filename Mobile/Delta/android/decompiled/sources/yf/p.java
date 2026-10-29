package yf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final long b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f35883c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f35884d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cg.a f35885a;

    public p(cg.a aVar) {
        this.f35885a = aVar;
    }

    public static p c() {
        return d(cg.b.b());
    }

    public static p d(cg.a aVar) {
        if (f35884d == null) {
            f35884d = new p(aVar);
        }
        return f35884d;
    }

    public static boolean g(String str) {
        return f35883c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f35885a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull ag.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + b;
    }
}
