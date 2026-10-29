package nb;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class z extends k8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26144d;

    public z(g7 g7Var) {
        super(g7Var);
    }

    @Override // nb.k8
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f26143c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f26144d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f26143c;
    }

    public final String p() {
        l();
        return this.f26144d;
    }
}
