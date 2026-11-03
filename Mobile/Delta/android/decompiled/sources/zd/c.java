package zd;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38073a;
    public final String b;

    public c(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f38073a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.b = str;
    }

    @Override // zd.u
    @NonNull
    public final File a() {
        return this.f38073a;
    }

    @Override // zd.u
    @NonNull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f38073a.equals(uVar.a()) && this.b.equals(uVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38073a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f38073a.toString() + ", splitId=" + this.b + "}";
    }
}
