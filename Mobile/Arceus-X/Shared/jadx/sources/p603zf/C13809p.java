package p603zf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import bg.AbstractC1437d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p077dg.C4606b;
import p077dg.InterfaceC4605a;

/* JADX INFO: renamed from: zf.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C13809p {

    /* JADX INFO: renamed from: b */
    public static final long f48427b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    public static final Pattern f48428c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    public static C13809p f48429d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC4605a f48430a;

    public C13809p(InterfaceC4605a interfaceC4605a) {
        this.f48430a = interfaceC4605a;
    }

    /* JADX INFO: renamed from: c */
    public static C13809p m50283c() {
        return m50284d(C4606b.m22746b());
    }

    /* JADX INFO: renamed from: d */
    public static C13809p m50284d(InterfaceC4605a interfaceC4605a) {
        if (f48429d == null) {
            f48429d = new C13809p(interfaceC4605a);
        }
        return f48429d;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m50285g(String str) {
        return f48428c.matcher(str).matches();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m50286h(String str) {
        return str.contains(":");
    }

    /* JADX INFO: renamed from: a */
    public long m50287a() {
        return this.f48430a.mo22745a();
    }

    /* JADX INFO: renamed from: b */
    public long m50288b() {
        return TimeUnit.MILLISECONDS.toSeconds(m50287a());
    }

    /* JADX INFO: renamed from: e */
    public long m50289e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m50290f(@NonNull AbstractC1437d abstractC1437d) {
        return TextUtils.isEmpty(abstractC1437d.mo7394b()) || abstractC1437d.mo7400h() + abstractC1437d.mo7395c() < m50288b() + f48427b;
    }
}
