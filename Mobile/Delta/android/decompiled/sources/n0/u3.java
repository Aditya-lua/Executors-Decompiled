package n0;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Ln0/u3;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "", "a", "J", "b", "()J", "value", "c", "d", "e", "f", "g", "h", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum u3 {
    DEFAULT(0),
    PREVIEW(1),
    VIDEO_RECORD(3),
    STILL_CAPTURE(2),
    VIDEO_CALL(5),
    PREVIEW_VIDEO_STILL(4),
    CROPPED_RAW(6);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ qt.a f24887j = qt.b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long value;

    u3(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getValue() {
        return this.value;
    }
}
