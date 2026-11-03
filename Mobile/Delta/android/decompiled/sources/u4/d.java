package u4;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32715a;

    d(long j10) {
        this.f32715a = j10;
    }

    public long b() {
        return this.f32715a;
    }
}
