package f8;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f15693c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15694a;
    public final List<c> b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15695a = BuildConfig.FLAVOR;
        public List<c> b = new ArrayList();

        public d a() {
            return new d(this.f15695a, Collections.unmodifiableList(this.b));
        }

        public a b(List<c> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.f15695a = str;
            return this;
        }
    }

    public d(String str, List<c> list) {
        this.f15694a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @wf.d(tag = 2)
    public List<c> a() {
        return this.b;
    }

    @wf.d(tag = 1)
    public String b() {
        return this.f15694a;
    }
}
