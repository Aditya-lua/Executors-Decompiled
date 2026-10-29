package p115f1;

import android.net.Uri;

/* JADX INFO: renamed from: f1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5258h extends AbstractC5300v {

    /* JADX INFO: renamed from: a */
    public final Uri f20369a;

    public C5258h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f20369a = uri;
    }

    @Override // p115f1.AbstractC5300v
    /* JADX INFO: renamed from: a */
    public Uri mo24319a() {
        return this.f20369a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5300v) {
            return this.f20369a.equals(((AbstractC5300v) obj).mo24319a());
        }
        return false;
    }

    public int hashCode() {
        return this.f20369a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f20369a + "}";
    }
}
