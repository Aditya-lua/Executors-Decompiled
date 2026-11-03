package ke;

import he.n;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f22663a;

    public j(Pattern pattern) {
        this.f22663a = (Pattern) n.l(pattern);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f22663a.matcher(str).matches();
    }
}
