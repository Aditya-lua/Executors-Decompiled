package q7;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29940a;

    c(String str) {
        this.f29940a = str;
    }

    public String b() {
        return ".temp" + this.f29940a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f29940a;
    }
}
