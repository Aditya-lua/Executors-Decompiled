package p7;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28380a;

    c(String str) {
        this.f28380a = str;
    }

    public String b() {
        return ".temp" + this.f28380a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f28380a;
    }
}
