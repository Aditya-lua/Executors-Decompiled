package pj;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\fj\u0002\b\u000bj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lpj/a;", "", "", "nameId", "", "id", "importance", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "a", "I", "d", "()I", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "c", "e", "f", "g", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    URGENT(q0.f30944k1, "channel_urgent", 4),
    DEFAULT(q0.f30923d1, "channel_default", 3),
    LOW(q0.f30932g1, "channel_medium", 2),
    MINIMUM(q0.f30935h1, "channel_minimum", 1),
    GENERAL(q0.f30929f1, "channel_general", 3);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ qt.a f28664j = qt.b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int nameId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int importance;

    a(int i10, String str, int i11) {
        this.nameId = i10;
        this.id = str;
        this.importance = i11;
    }

    @NotNull
    public static qt.a<a> b() {
        return f28664j;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
