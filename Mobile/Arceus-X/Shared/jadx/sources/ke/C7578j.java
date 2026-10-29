package ke;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import p169he.C6384n;

/* JADX INFO: renamed from: ke.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7578j implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final Pattern f29039a;

    public C7578j(Pattern pattern) {
        this.f29039a = (Pattern) C6384n.m27928l(pattern);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f29039a.matcher(str).matches();
    }
}
