package ob;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27139d;

    public c0(l7 l7Var) {
        super(l7Var);
    }

    @Override // ob.p8
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f27138c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f27139d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f27138c;
    }

    public final String p() {
        l();
        return this.f27139d;
    }
}
