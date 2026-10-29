package pj;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lpj/c;", "", "", "id", "", "nameId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "c", "()I", "d", "e", "f", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c {
    SOCIAL("channel_group_social", q0.f30915a1),
    EXPERIENCES("channel_group_experiences", q0.Z),
    COMMUNITIES("channel_group_communities", q0.Y),
    PLATFORM_NEWS("channel_group_platform_news", q0.f30914a0);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qt.a f28697h = qt.b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int nameId;

    c(String str, int i10) {
        this.id = str;
        this.nameId = i10;
    }

    @NotNull
    public static qt.a<c> b() {
        return f28697h;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
