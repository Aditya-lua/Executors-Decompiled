package me;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import je.n;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f23241a;

    public j(Pattern pattern) {
        this.f23241a = (Pattern) n.l(pattern);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f23241a.matcher(str).matches();
    }
}
