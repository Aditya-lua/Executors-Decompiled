package p183i1;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: i1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6601a {

    /* JADX INFO: renamed from: a */
    public static final List<Integer> f25464a = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* JADX INFO: renamed from: i1.a$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC6601a mo28515a();

        /* JADX INFO: renamed from: b */
        public final AbstractC6601a m28516b() {
            AbstractC6601a abstractC6601aMo28515a = mo28515a();
            String str = "";
            if (abstractC6601aMo28515a.mo28510c() == -1) {
                str = " audioSource";
            }
            if (abstractC6601aMo28515a.mo28512e() <= 0) {
                str = str + " captureSampleRate";
            }
            if (abstractC6601aMo28515a.mo28514g() <= 0) {
                str = str + " encodeSampleRate";
            }
            if (abstractC6601aMo28515a.mo28513f() <= 0) {
                str = str + " channelCount";
            }
            if (abstractC6601aMo28515a.mo28509b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return abstractC6601aMo28515a;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        /* JADX INFO: renamed from: c */
        public abstract a mo28517c(int i10);

        /* JADX INFO: renamed from: d */
        public abstract a mo28518d(int i10);

        /* JADX INFO: renamed from: e */
        public abstract a mo28519e(int i10);

        /* JADX INFO: renamed from: f */
        public abstract a mo28520f(int i10);

        /* JADX INFO: renamed from: g */
        public abstract a mo28521g(int i10);
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: a */
    public static a m28508a() {
        return new C6626u.b().mo28518d(-1).mo28519e(-1).mo28521g(-1).mo28520f(-1).mo28517c(-1);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo28509b();

    /* JADX INFO: renamed from: c */
    public abstract int mo28510c();

    /* JADX INFO: renamed from: d */
    public int m28511d() {
        return C6625t.m28606f(mo28509b(), mo28513f());
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo28512e();

    /* JADX INFO: renamed from: f */
    public abstract int mo28513f();

    /* JADX INFO: renamed from: g */
    public abstract int mo28514g();
}
