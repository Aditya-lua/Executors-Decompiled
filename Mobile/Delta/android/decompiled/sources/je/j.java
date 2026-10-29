package je;

import ge.n;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f21375a;

    public j(Pattern pattern) {
        this.f21375a = (Pattern) n.l(pattern);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f21375a.matcher(str).matches();
    }
}
