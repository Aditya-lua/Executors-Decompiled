package p306nb;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: nb.z */
/* JADX INFO: loaded from: classes.dex */
public final class C9390z extends AbstractC9159k8 {

    /* JADX INFO: renamed from: c */
    public long f33699c;

    /* JADX INFO: renamed from: d */
    public String f33700d;

    public C9390z(C9094g7 c9094g7) {
        super(c9094g7);
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: i */
    public final boolean mo36257i() {
        Calendar calendar = Calendar.getInstance();
        this.f33699c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f33700d = sb2.toString();
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final long m37087o() {
        m36455l();
        return this.f33699c;
    }

    /* JADX INFO: renamed from: p */
    public final String m37088p() {
        m36455l();
        return this.f33700d;
    }
}
