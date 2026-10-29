package p601zd;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: renamed from: zd.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C13774c extends AbstractC13792u {

    /* JADX INFO: renamed from: a */
    public final File f48360a;

    /* JADX INFO: renamed from: b */
    public final String f48361b;

    public C13774c(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f48360a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f48361b = str;
    }

    @Override // p601zd.AbstractC13792u
    @NonNull
    /* JADX INFO: renamed from: a */
    public final File mo50203a() {
        return this.f48360a;
    }

    @Override // p601zd.AbstractC13792u
    @NonNull
    /* JADX INFO: renamed from: b */
    public final String mo50204b() {
        return this.f48361b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13792u) {
            AbstractC13792u abstractC13792u = (AbstractC13792u) obj;
            if (this.f48360a.equals(abstractC13792u.mo50203a()) && this.f48361b.equals(abstractC13792u.mo50204b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48360a.hashCode() ^ 1000003) * 1000003) ^ this.f48361b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f48360a.toString() + ", splitId=" + this.f48361b + "}";
    }
}
