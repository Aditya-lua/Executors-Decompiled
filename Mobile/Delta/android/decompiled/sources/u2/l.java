package u2;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f32694a;

    public l(Object obj) {
        this.f32694a = (LocaleList) obj;
    }

    @Override // u2.k
    public String a() {
        return this.f32694a.toLanguageTags();
    }

    @Override // u2.k
    public Object b() {
        return this.f32694a;
    }

    public boolean equals(Object obj) {
        return this.f32694a.equals(((k) obj).b());
    }

    @Override // u2.k
    public Locale get(int i10) {
        return this.f32694a.get(i10);
    }

    public int hashCode() {
        return this.f32694a.hashCode();
    }

    @Override // u2.k
    public boolean isEmpty() {
        return this.f32694a.isEmpty();
    }

    @Override // u2.k
    public int size() {
        return this.f32694a.size();
    }

    public String toString() {
        return this.f32694a.toString();
    }
}
