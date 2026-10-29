package i1;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Integer> f20154a = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* JADX INFO: renamed from: i1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0356a {
        public abstract a a();

        public final a b() {
            a aVarA = a();
            String str = "";
            if (aVarA.c() == -1) {
                str = " audioSource";
            }
            if (aVarA.e() <= 0) {
                str = str + " captureSampleRate";
            }
            if (aVarA.g() <= 0) {
                str = str + " encodeSampleRate";
            }
            if (aVarA.f() <= 0) {
                str = str + " channelCount";
            }
            if (aVarA.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return aVarA;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        public abstract AbstractC0356a c(int i10);

        public abstract AbstractC0356a d(int i10);

        public abstract AbstractC0356a e(int i10);

        public abstract AbstractC0356a f(int i10);

        public abstract AbstractC0356a g(int i10);
    }

    @SuppressLint({"Range"})
    public static AbstractC0356a a() {
        return new u.b().d(-1).e(-1).g(-1).f(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return t.f(b(), f());
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();
}
