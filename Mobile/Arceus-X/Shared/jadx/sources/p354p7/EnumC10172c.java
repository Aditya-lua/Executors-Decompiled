package p354p7;

/* JADX INFO: renamed from: p7.c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10172c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a */
    public final String f36743a;

    EnumC10172c(String str) {
        this.f36743a = str;
    }

    /* JADX INFO: renamed from: b */
    public String m39189b() {
        return ".temp" + this.f36743a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f36743a;
    }
}
