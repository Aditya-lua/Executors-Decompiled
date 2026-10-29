package p456u2;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: u2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C11783l implements InterfaceC11782k {

    /* JADX INFO: renamed from: a */
    public final LocaleList f41505a;

    public C11783l(Object obj) {
        this.f41505a = (LocaleList) obj;
    }

    @Override // p456u2.InterfaceC11782k
    /* JADX INFO: renamed from: a */
    public String mo44078a() {
        return this.f41505a.toLanguageTags();
    }

    @Override // p456u2.InterfaceC11782k
    /* JADX INFO: renamed from: b */
    public Object mo44079b() {
        return this.f41505a;
    }

    public boolean equals(Object obj) {
        return this.f41505a.equals(((InterfaceC11782k) obj).mo44079b());
    }

    @Override // p456u2.InterfaceC11782k
    public Locale get(int i10) {
        return this.f41505a.get(i10);
    }

    public int hashCode() {
        return this.f41505a.hashCode();
    }

    @Override // p456u2.InterfaceC11782k
    public boolean isEmpty() {
        return this.f41505a.isEmpty();
    }

    @Override // p456u2.InterfaceC11782k
    public int size() {
        return this.f41505a.size();
    }

    public String toString() {
        return this.f41505a.toString();
    }
}
